

# ValidationsValidateAllResponseBody

Response body schema for POST `/validations` where all promotion must be valid

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valid** | **Boolean** | The result of the validation. It takes all of the redeemables into account and returns a &#x60;false&#x60; if at least one redeemable is inapplicable. Returns &#x60;true&#x60; if all redeemables are applicable. |  |
|**redeemables** | [**List&lt;ValidationsValidateAllResponseBodyRedeemablesItem&gt;**](ValidationsValidateAllResponseBodyRedeemablesItem.md) | Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;. |  |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**session** | [**Session**](Session.md) |  |  [optional] |
|**applicationMode** | [**ApplicationModeEnum**](#ApplicationModeEnum) |  |  |



## Enum: ApplicationModeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |



