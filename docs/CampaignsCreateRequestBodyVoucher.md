

# CampaignsCreateRequestBodyVoucher


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |  [optional] |
|**redemption** | [**CampaignsCreateRequestBodyVoucherRedemption**](CampaignsCreateRequestBodyVoucherRedemption.md) |  |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**loyaltyCard** | [**CampaignLoyaltyCard**](CampaignLoyaltyCard.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



