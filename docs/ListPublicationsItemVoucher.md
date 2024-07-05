

# ListPublicationsItemVoucher


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Voucher code. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |  |
|**campaign** | **String** | Campaign name |  |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**loyaltyCard** | **Object** | Defines the loyalty card details. |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



