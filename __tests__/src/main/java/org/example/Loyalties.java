package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.CustomersApi;
import voucherify.client.api.LoyaltiesApi;
import voucherify.client.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loyalties {
    public void test(ApiClient defaultClient) {
        LoyaltiesApi loyalties = new LoyaltiesApi(defaultClient);

        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            loyalties.updateLoyaltyCardBalance(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0), loyaltiesMembersBalanceUpdateRequestBody);

            System.out.println("Calling LoyaltiesApi#updateLoyaltyCardBalance 1 OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling LoyaltiesApi#updateLoyaltyCardBalance 1");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody();
            loyaltiesMembersBalanceUpdateRequestBody.setPoints(1000);

            loyalties.updateLoyaltyCardBalance1(
                Voucherify.getInstance().getLoyaltyCampaign().getId(),
                Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                loyaltiesMembersBalanceUpdateRequestBody
            );

            System.out.println("Calling LoyaltiesApi#updateLoyaltyCardBalance 2 OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling LoyaltiesApi#updateLoyaltyCardBalance 2");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            loyalties.listLoyaltyCardTransactions(
                Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                10,
                1
            );

            System.out.println("Calling LoyaltiesApi#loyaltiesMembersTransactionsListResponseBody OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling LoyaltiesApi#loyaltiesMembersTransactionsListResponseBody");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            List<LoyaltiesTiersCreateInBulkRequestBodyItem> tiers = new ArrayList<>();

            LoyaltyTierBasePoints loyaltyTierBasePoints = new LoyaltyTierBasePoints();
            loyaltyTierBasePoints.setFrom(0);
            loyaltyTierBasePoints.setTo(1000);

            LoyaltiesTiersCreateInBulkRequestBodyItem item = new LoyaltiesTiersCreateInBulkRequestBodyItem();
            item.setName("Bronze");
            item.setPoints(loyaltyTierBasePoints);

//            UNCOMMENT WHEN YOU CREATED REWARD MANUALLY AND WANT TO TEST AND PROVIDE FIXED CAMPAIGN ID AND REWARD ASSIGMENT ID
//            Map<String, MappingPoints> rewards = new HashMap<>();
//
//            MappingFixed mappingFixed = new MappingFixed();
//            mappingFixed.setPoints(100);
//            mappingFixed.setType(MappingFixed.TypeEnum.CUSTOM);
//
//            MappingPoints mappingPoints = new MappingPoints();
//            mappingPoints.setActualInstance(mappingFixed);
//
//            rewards.put("rewa_Js4okPaZa4KVdGFcnlwsR7iv", mappingPoints);
//            item.setRewards(rewards);

            tiers.add(item);

            loyalties.createInBulkLoyaltyTiers(
                Voucherify.getInstance().getLoyaltyCampaign().getId(),
                tiers
            );

            ApplicableTo applicableTo = new ApplicableTo();
            applicableTo.effect(ApplicableToEffect.EVERY);

            System.out.println("Calling LoyaltiesApi#createInBulkLoyaltyTiers OK");
        } catch (ApiException | JsonSyntaxException e) {
            System.err.println("Exception when calling LoyaltiesApi#createInBulkLoyaltyTiers");
            System.err.println("Status message: " + e.getMessage());
            e.printStackTrace();
        }

//        try {
//            LoyaltiesTiersRewardsListResponseBody loyaltiesTiersRewardsListResponseBody = loyalties.listLoyaltyTierRewards(
//                Voucherify.getInstance().getLoyaltyCampaign().getId(),
//                Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0)
//            );
//
//            System.out.println(loyaltiesTiersRewardsListResponseBody);
//            System.out.println("Calling LoyaltiesApi#listLoyaltyTierRewards OK");
//        } catch (ApiException | JsonSyntaxException e) {
//            System.err.println("Exception when calling LoyaltiesApi#listLoyaltyTierRewards");
//            System.err.println("Status message: " + e.getMessage());
//            e.printStackTrace();
//        }
    }
}
