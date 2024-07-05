

# ValidationsValidateResponseBodyRedeemablesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |  |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |  [optional] |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |  [optional] |
|**result** | [**ValidationsValidateResponseBodyRedeemablesItemResult**](ValidationsValidateResponseBodyRedeemablesItemResult.md) |  |  |
|**metadata** | **Object** |  |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPLICABLE | &quot;APPLICABLE&quot; |
| INAPPLICABLE | &quot;INAPPLICABLE&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



