package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.CampaignsApi;
import voucherify.client.model.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CampaignsTest {
    public static ApiClient defaultClient = null;
    public static CampaignsApi campaigns;

    public String loyaltyProgramId = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        campaigns = new CampaignsApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createLoyaltyProgramTest() {
        CampaignLoyaltyCard campaignLoyaltyCard = new CampaignLoyaltyCard();
        campaignLoyaltyCard.setPoints(500);

        CampaignLoyaltyVoucher campaignLoyaltyVoucher = new CampaignLoyaltyVoucher();
        campaignLoyaltyVoucher.loyaltyCard(campaignLoyaltyCard);

        CampaignsCreateLoyaltyCampaign campaign = new CampaignsCreateLoyaltyCampaign();
        campaign.setCampaignType(CampaignsCreateLoyaltyCampaign.CampaignTypeEnum.LOYALTY_PROGRAM);
        campaign.setType(CampaignsCreateLoyaltyCampaign.TypeEnum.AUTO_UPDATE);
        campaign.setName(Utils.getAlphaNumericString(20));

        CampaignsCreateRequestBody campaignsCreateRequestBody = new CampaignsCreateRequestBody(); // CampaignsCreateRequestBody | Specify the details of the campaign that you would like to create.
        campaignsCreateRequestBody.setActualInstance(campaign);
        campaign.setVoucher(campaignLoyaltyVoucher);

        try {
            CampaignsCreateResponseBody result = campaigns.createCampaign(campaignsCreateRequestBody);

            String loyaltyProgramId = result.getId();
            String campaignName = result.getName();

            assertNotNull(loyaltyProgramId);
            assertNotNull(campaignName);

            Voucherify.getInstance().getLoyaltyCampaign().setId(loyaltyProgramId);
            Voucherify.getInstance().getLoyaltyCampaign().setName(campaignName);

            this.loyaltyProgramId = loyaltyProgramId;
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void createDiscountCampaign() {
        DiscountAmount discountAmount = new DiscountAmount();
        discountAmount.setType(DiscountAmount.TypeEnum.AMOUNT);
        discountAmount.setAmountOff(BigDecimal.valueOf(1));

        Discount discount = new Discount();
        discount.setActualInstance(discountAmount);

        DiscountCouponsCampaignVoucher discountCouponsCampaignVoucher = new DiscountCouponsCampaignVoucher();
        discountCouponsCampaignVoucher.setDiscount(discount);

        CampaignsCreateDiscountCouponsCampaign campaign = new CampaignsCreateDiscountCouponsCampaign();
        campaign.setCampaignType(CampaignsCreateDiscountCouponsCampaign.CampaignTypeEnum.DISCOUNT_COUPONS);
        campaign.setType(CampaignsCreateDiscountCouponsCampaign.TypeEnum.AUTO_UPDATE);
        campaign.setName(Utils.getAlphaNumericString(20));
        campaign.setValidationRules(
            Voucherify.getInstance().getCouponCampaign().getValidationRuleIds()
        );

        CampaignsCreateRequestBody campaignsCreateRequestBody = new CampaignsCreateRequestBody(); // CampaignsCreateRequestBody | Specify the details of the campaign that you would like to create.
        campaignsCreateRequestBody.setActualInstance(campaign);
        campaign.setVoucher(discountCouponsCampaignVoucher);

        try {
            CampaignsCreateResponseBody result = campaigns.createCampaign(campaignsCreateRequestBody);

            String discountCampaignId = result.getId();
            String campaignName = result.getName();

            assertNotNull(discountCampaignId);
            assertNotNull(campaignName);

            Voucherify.getInstance().getCouponCampaign().setId(discountCampaignId);
            Voucherify.getInstance().getCouponCampaign().setName(campaignName);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void getCampaignTest() {
        try {
            CampaignsGetResponseBody responseBody = campaigns.getCampaign(loyaltyProgramId);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void addVoucherToCampaign() {
        try {
            Integer vouchersCount = 1; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody(); // CampaignsVouchersCreateInBulkRequestBody | Specify the voucher parameters that you would like to overwrite.

            CampaignsVouchersCreateCombinedResponseBody result = campaigns.addVouchersToCampaign(loyaltyProgramId, vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(result);
            Voucherify.getInstance().getLoyaltyCampaign().addVoucherId(
                ((CampaignsVouchersCreateResponseBody) result.getActualInstance()).getId()
            );

            //NEED TWO VOUCHERS FOR PUBLICATION
            CampaignsVouchersCreateCombinedResponseBody result2 = campaigns.addVouchersToCampaign(loyaltyProgramId, vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(result2);
            Voucherify.getInstance().getLoyaltyCampaign().addVoucherId(
                ((CampaignsVouchersCreateResponseBody) result2.getActualInstance()).getId()
            );

        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(5)
    public void addVouchersToCampaign() {
        try {
            Integer vouchersCount = 2; // Integer | Number of vouchers that should be added.
            CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody(); // CampaignsVouchersCreateInBulkRequestBody | Specify the voucher parameters that you would like to overwrite.
            CampaignsVouchersCreateCombinedResponseBody responseBody = campaigns.addVouchersToCampaign(loyaltyProgramId, vouchersCount, campaignsVouchersCreateInBulkRequestBody);

            assertNotNull(responseBody);
        } catch (ApiException | JsonSyntaxException e) {
            fail();
        }
    }
}
