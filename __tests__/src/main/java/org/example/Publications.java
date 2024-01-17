package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.PublicationsApi;
import voucherify.client.model.*;

public class Publications {
    public void test(ApiClient defaultClient) {
        PublicationsApi publications = new PublicationsApi(defaultClient);

        try {
            publications.listPublications(
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
            System.out.println("Calling PublicationsApi#listPublications OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling PublicationsApi#listPublications");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            CreatePublicationWithSpecificVoucher createPublicationWithSpecificVoucher = new CreatePublicationWithSpecificVoucher();

            Customer customer = new Customer();
            customer.setId(Voucherify.getInstance().getCustomer().getId());

            createPublicationWithSpecificVoucher.setCustomer(customer);
            createPublicationWithSpecificVoucher.setVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody();
            publicationsCreateRequestBody.setActualInstance(createPublicationWithSpecificVoucher);

            publications.createPublication(false, publicationsCreateRequestBody);

            System.out.println("Calling PublicationsApi#createPublication OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling PublicationsApi#listPublications");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

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

            publications.createPublication(false, publicationsCreateRequestBody);

            System.out.println("Calling PublicationsApi#createPublication OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling PublicationsApi#listPublications");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}