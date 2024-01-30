package org.example;

import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.RedemptionsApi;
import voucherify.client.model.RedemptionsListResponseBody;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(8)
public class RedemptionsTest {
    public static ApiClient defaultClient = null;
    public static RedemptionsApi redemptions = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        redemptions = new RedemptionsApi(defaultClient);
    }

    @Test
    public void listRedemptionsTest() {
        RedemptionsApi redemptions = new RedemptionsApi(defaultClient);

        try {
            RedemptionsListResponseBody responseBody = redemptions.listRedemptions(
                1,
                2,
                null,
                null,
                null,
                null,
                null,
                null
            );

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
