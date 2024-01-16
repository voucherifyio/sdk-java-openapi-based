

# GiftCampaignVoucher

Schema model for a discount voucher.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of voucher. |  |
|**gift** | [**Gift**](Gift.md) |  |  |
|**redemption** | [**CampaignLoyaltyVoucherRedemption**](CampaignLoyaltyVoucherRedemption.md) |  |  [optional] |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |



