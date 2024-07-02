

# ValidationEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique validation id. |  [optional] |
|**sessionId** | **String** | Unique session id. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The validation status |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the validation was created. The value is shown in the ISO 8601 format. |  [optional] |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |  [optional] |
|**redeemables** | [**List&lt;ValidationsRedeemableApplicable&gt;**](ValidationsRedeemableApplicable.md) | Lists validation results of each redeemable. |  [optional] |
|**skippedRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each redeemable. |  [optional] |
|**inapplicableRedeemables** | [**List&lt;ValidationsRedeemableSkipped&gt;**](ValidationsRedeemableSkipped.md) | Lists validation results of each redeemable. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;VALID&quot; |
| INVALID | &quot;INVALID&quot; |



