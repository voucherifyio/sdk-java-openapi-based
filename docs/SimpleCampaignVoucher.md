

# SimpleCampaignVoucher

Simplified campaign voucher data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the voucher. |  |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**loyaltyCard** | [**CampaignLoyaltyCard**](CampaignLoyaltyCard.md) |  |  [optional] |
|**redemption** | [**SimpleVoucherRedemption**](SimpleVoucherRedemption.md) |  |  |
|**codeConfig** | [**CodeConfigRequiredLengthCharsetPattern**](CodeConfigRequiredLengthCharsetPattern.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |



