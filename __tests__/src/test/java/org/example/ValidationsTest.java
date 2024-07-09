package org.example;

import com.google.gson.JsonSyntaxException;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.ValidationsApi;
import voucherify.client.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@org.junit.jupiter.api.Order(7) //Multiple Order type
public class ValidationsTest {
    public static ApiClient defaultClient = null;
    public static ValidationsApi validationsApi = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        validationsApi = new ValidationsApi(defaultClient);
    }

    @Test
    public void validateStackedDiscountsTest() {
        ValidationsValidateRequestBody validationsValidateRequestBody = getValidationsValidateRequestBody();

        try {
            ValidationsValidateResponseBody responseBody = validationsApi
                    .validateStackedDiscounts(validationsValidateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            System.out.println(e);
            fail();
        }
    }

    @NotNull
    private static ValidationsValidateRequestBody getValidationsValidateRequestBody() {
        Order order = getOrder();

        StackableValidateRedeemBaseRedeemablesItem redeemablesItem = new StackableValidateRedeemBaseRedeemablesItem();

        redeemablesItem._object(StackableValidateRedeemBaseRedeemablesItem.ObjectEnum.VOUCHER);
        redeemablesItem.setId(Utils.getAlphaNumericString(20));

        ValidationsValidateRequestBody validationsValidateRequestBody = new ValidationsValidateRequestBody();

        validationsValidateRequestBody.setOrder(order);
        validationsValidateRequestBody.addRedeemablesItem(redeemablesItem);

        return validationsValidateRequestBody;
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
