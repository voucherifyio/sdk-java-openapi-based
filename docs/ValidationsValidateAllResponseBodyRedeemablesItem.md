

# ValidationsValidateAllResponseBodyRedeemablesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether the redeemable can be applied or not applied based on the validation rules. |  [optional] |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |  [optional] |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |  [optional] |
|**result** | **Object** |  |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redeemable. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |



