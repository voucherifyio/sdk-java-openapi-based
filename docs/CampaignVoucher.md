

# CampaignVoucher

Schema model for a campaign voucher.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of voucher. |  |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**loyaltyCard** | [**CampaignLoyaltyCard**](CampaignLoyaltyCard.md) |  |  [optional] |
|**redemption** | [**CampaignVoucherRedemption**](CampaignVoucherRedemption.md) |  |  |
|**codeConfig** | [**CodeConfigRequiredLengthCharsetPattern**](CodeConfigRequiredLengthCharsetPattern.md) |  |  |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date. |  [optional] |
|**validityTimeframe** | [**CampaignBaseValidityTimeframe**](CampaignBaseValidityTimeframe.md) |  |  [optional] |



