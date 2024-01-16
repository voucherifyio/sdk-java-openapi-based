

# SimpleVoucher


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier that represents the voucher assigned by Voucherify. |  [optional] |
|**code** | **String** | Voucher code. |  |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**loyaltyCard** | **Object** | Defines the loyalty card details. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the object. |  [optional] |
|**campaign** | **Object** | Campaign object |  [optional] |
|**campaignId** | **String** | Campaign unique ID. |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |
|**holderId** | **String** | Unique customer ID of campaign owner. |  [optional] |
|**referrerId** | **String** | Unique referrer ID. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created in ISO 8601 format. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |



