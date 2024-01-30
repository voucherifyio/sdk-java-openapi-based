package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.PublicationsApi;
import voucherify.client.model.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(6)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PublicationsTest {
    public static ApiClient defaultClient = null;
    public static PublicationsApi publications = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        publications = new PublicationsApi(defaultClient);
    }

    @Test
    @Order(1)
    public void listPublicationsTest() {
        try {
            PublicationsListResponseBody responseBody = publications.listPublications(
                10,
                1,
                null,
                null,
                null,
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

    @Test
    @Order(2)
    public void CreatePublicationWithSpecificVoucherTest() {
        try {
            CreatePublicationWithSpecificVoucher createPublicationWithSpecificVoucher = new CreatePublicationWithSpecificVoucher();

            Customer customer = new Customer();
            customer.setId(Voucherify.getInstance().getCustomer().getId());

            createPublicationWithSpecificVoucher.setCustomer(customer);
            createPublicationWithSpecificVoucher.setVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            publicationsCreateRequestBody.setActualInstance(createPublicationWithSpecificVoucher);

            PublicationsCreateResponseBody responseBody = publications.createPublication(false, publicationsCreateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void CreatePublicationWithCampaignTest() {
        try {
            CreatePublicationWithCampaign createPublicationWithCampaign = new CreatePublicationWithCampaign();

            CreatePublicationCampaign createPublicationCampaign = new CreatePublicationCampaign();
            createPublicationCampaign.setName(Voucherify.getInstance().getLoyaltyCampaign().getName());
            createPublicationCampaign.setCount(2);

            Customer customer = new Customer();
            customer.setId(Voucherify.getInstance().getCustomer().getId());

            createPublicationWithCampaign.setCampaign(createPublicationCampaign);
            createPublicationWithCampaign.setCustomer(customer);

            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            publicationsCreateRequestBody.setActualInstance(createPublicationWithCampaign);

            PublicationsCreateResponseBody responseBody = publications.createPublication(false, publicationsCreateRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
