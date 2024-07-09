package org.example;

import org.example.data.Voucherify;
import com.google.gson.JsonSyntaxException;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.CampaignsApi;
import voucherify.client.api.ValidationsApi;
import voucherify.client.api.VouchersApi;
import voucherify.client.model.*;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@org.junit.jupiter.api.Order(7) // Multiple Order type
public class ValidationsTest {
    public static ApiClient defaultClient = null;
    public static ValidationsApi validationsApi = null;
    public static CampaignsApi campaigns = null;
    public static VouchersApi vouchers = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        validationsApi = new ValidationsApi(defaultClient);
        campaigns = new CampaignsApi(defaultClient);
        vouchers = new VouchersApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void validateStackedInapplicableDiscountsTest() {
        validateStackedDiscounts(getValidationsValidateInapplicableRedeemableRequestBody());
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void validateStackedApplicableDiscountsTest() {
        validateStackedDiscounts(getValidationsValidateApplicableRedeemableRequestBody());
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void validateStackedSkippedDiscountsTest() {
        ValidationsValidateRequestBody requestBody = getValidationsValidateApplicableRedeemableRequestBody();
        addRedeemablesItemToBeginning(requestBody);
        validateStackedDiscounts(requestBody);
    }

    private void validateStackedDiscounts(ValidationsValidateRequestBody requestBody) {
        try {
            ValidationsValidateResponseBody responseBody = validationsApi.validateStackedDiscounts(requestBody);
            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateInapplicableRedeemableRequestBody() {
        Order order = getOrder();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(
                Utils.getAlphaNumericString(20));
        return createValidationsValidateRequestBody(order, redeemablesItem);
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateApplicableRedeemableRequestBody() {
        Order order = getOrder();
        CampaignsVouchersCreateCombinedResponseBody voucher = createCampaignVoucher();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(voucher.getCode());
        return createValidationsValidateRequestBody(order, redeemablesItem);
    }

    @NotNull
    private static CampaignsVouchersCreateCombinedResponseBody createCampaignVoucher() {
        Discount discount = new Discount();
        discount.setType(Discount.TypeEnum.AMOUNT);
        discount.setAmountOff(BigDecimal.valueOf(1));

        CampaignsCreateRequestBodyVoucher voucher = new CampaignsCreateRequestBodyVoucher();
        voucher.setDiscount(discount);
        voucher.setType(CampaignsCreateRequestBodyVoucher.TypeEnum.DISCOUNT_VOUCHER);

        CampaignsCreateRequestBody campaign = new CampaignsCreateRequestBody();
        campaign.setCampaignType(CampaignsCreateRequestBody.CampaignTypeEnum.DISCOUNT_COUPONS);
        campaign.setType(CampaignsCreateRequestBody.TypeEnum.AUTO_UPDATE);
        campaign.setName(Utils.getAlphaNumericString(20));
        campaign.setVoucher(voucher);

        try {
            CampaignsCreateResponseBody result = campaigns.createCampaign(campaign);
            return campaigns.addVouchersToCampaign(result.getId(), 1, null);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
            return null;
        }
    }

    @NotNull
    private static Order getOrder() {
        List<OrderItem> items = new ArrayList<>();
        items.add(createOrderItem("prod_001", 1));
        items.add(createOrderItem("prod_002", 1));

        Order order = new Order();
        order.setAmount(10000);
        order.setItems(items);
        return order;
    }

    private static OrderItem createOrderItem(String productId, int quantity) {
        OrderItem item = new OrderItem();
        item.setProductId(productId);
        item.setQuantity(quantity);
        return item;
    }

    @NotNull
    private static StackableValidateRedeemBaseRedeemablesItem createRedeemablesItem(String id) {
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();
        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(id);
        return redeemablesItem;
    }

    @NotNull
    private static ValidationsValidateRequestBody createValidationsValidateRequestBody(Order order,
            StackableValidateRedeemBaseRedeemablesItem redeemablesItem) {
        ValidationsValidateRequestBody requestBody = new ValidationsValidateRequestBody();
        requestBody.setOrder(order);
        requestBody.addRedeemablesItem(redeemablesItem);
        return requestBody;
    }

    private void addRedeemablesItemToBeginning(ValidationsValidateRequestBody requestBody) {
        List<StackableValidateRedeemBaseRedeemablesItem> redeemables = requestBody.getRedeemables();
        List<StackableValidateRedeemBaseRedeemablesItem> newRedeemables = new ArrayList<>();
        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = createRedeemablesItem(
                Utils.getAlphaNumericString(20));
        newRedeemables.add(redeemablesItem);
        newRedeemables.addAll(redeemables);
        requestBody.setRedeemables(newRedeemables);
    }
}
