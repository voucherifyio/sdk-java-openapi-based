

# ValidationsValidateResponseBody

Response body schema for POST `/validations`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valid** | **Boolean** | The result of the validation. It takes all of the redeemables into account and returns a &#x60;false&#x60; if at least one redeemable is inapplicable. Returns &#x60;true&#x60; if all redeemables are applicable. |  |
|**redeemables** | [**List&lt;ValidationsValidateAllResponseBodyRedeemablesItem&gt;**](ValidationsValidateAllResponseBodyRedeemablesItem.md) | Lists validation results of each redeemable. If redeemables_application_mode&#x3D;\&quot;PARTIAL\&quot; all redeemables here will be \&quot;APPLICABLE\&quot; |  |
|**skippedRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each skipped redeemable. |  [optional] |
|**inapplicableRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each inapplicable redeemable. |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**session** | [**Session**](Session.md) |  |  [optional] |



