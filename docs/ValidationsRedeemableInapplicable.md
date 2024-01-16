

# ValidationsRedeemableInapplicable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether the redeemable can be applied or not applied based on the validation rules. |  [optional] |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |  [optional] |
|**result** | [**ValidationsRedeemableInapplicableResult**](ValidationsRedeemableInapplicableResult.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INAPPLICABLE | &quot;INAPPLICABLE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |



