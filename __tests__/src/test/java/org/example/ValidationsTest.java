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
        ValidationsValidateRequestBody validationsValidateInapplicableRedeemableRequestBody = getValidationsValidateInapplicableRedeemableRequestBody();

        try {
            ValidationsValidateResponseBody responseBody = validationsApi
                    .validateStackedDiscounts(validationsValidateInapplicableRedeemableRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void validateStackedApplicableDiscountsTest() {
        ValidationsValidateRequestBody validationsValidateApplicableRedeemableRequestBody = getValidationsValidateApplicableRedeemableRequestBody();

        try {
            ValidationsValidateResponseBody responseBody = validationsApi
                    .validateStackedDiscounts(validationsValidateApplicableRedeemableRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }

    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void validateStackedSkippedDiscountsTest() {
        ValidationsValidateRequestBody validationsValidateApplicableRedeemableRequestBody = getValidationsValidateApplicableRedeemableRequestBody();

        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();

        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(Utils.getAlphaNumericString(20));

        List<StackableValidateRedeemBaseRedeemablesItem> redeemables = validationsValidateApplicableRedeemableRequestBody
                .getRedeemables();

        // Utwórz nową listę, dodaj redeemablesItem na początek, a następnie dodaj
        // wszystkie istniejące elementy
        List<StackableValidateRedeemBaseRedeemablesItem> newRedeemables = new ArrayList<>();
        newRedeemables.add(redeemablesItem); // dodaj na początek
        newRedeemables.addAll(redeemables); // dodaj wszystkie istniejące elementy

        // Ustaw nową listę jako redeemables
        validationsValidateApplicableRedeemableRequestBody.setRedeemables(newRedeemables);

        try {
            ValidationsValidateResponseBody responseBody = validationsApi
                    .validateStackedDiscounts(validationsValidateApplicableRedeemableRequestBody);
            System.out.println(responseBody);
            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            System.out.println(e);
            fail();
        }
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateInapplicableRedeemableRequestBody() {
        Order order = getOrder();

        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();

        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(Utils.getAlphaNumericString(20));

        ValidationsValidateRequestBody validationsValidateRequestBody = new ValidationsValidateRequestBody();

        validationsValidateRequestBody.setOrder(order);
        validationsValidateRequestBody.addRedeemablesItem(redeemablesItem);

        return validationsValidateRequestBody;
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateApplicableRedeemableRequestBody() {
        Order order = getOrder();

        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();

        CampaignsVouchersCreateCombinedResponseBody voucher = createCampaignVoucher();

        redeemablesItem.setObject(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(voucher.getCode());

        ValidationsValidateRequestBody validationsValidateRequestBody = new ValidationsValidateRequestBody();
        validationsValidateRequestBody.setOrder(order);
        validationsValidateRequestBody.addRedeemablesItem(redeemablesItem);

        return validationsValidateRequestBody;
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
            CampaignsVouchersCreateCombinedResponseBody createdVoucher = campaigns.addVouchersToCampaign(result.getId(),
                    1, null);

            return createdVoucher;
        } catch (ApiException | JsonSyntaxException e) {
            fail();
            return null;
        }
    }

    @NotNull
    private static Order getOrder() {
        List<OrderItem> items = new ArrayList<>();
        OrderItem item = new OrderItem();
        item.setProductId("prod_001");
        item.setQuantity(1);
        items.add(item);

        OrderItem item2 = new OrderItem();
        item2.setProductId("prod_002");
        item2.setQuantity(1);
        items.add(item2);

        Order order = new Order();
        order.setAmount(10000);
        order.setItems(items);
        return order;
    }
}
