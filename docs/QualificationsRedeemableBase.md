

# QualificationsRedeemableBase

Data of single redeemable which was properly qualified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the redeemable. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type of the redeemable. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |  [optional] |
|**result** | [**RedeemableResult**](RedeemableResult.md) |  |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**validationRuleId** | **String** | A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance. |  [optional] |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |  [optional] |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the product. A set of key/value pairs that you can attach to a product object. It can be useful for storing additional information about the product in a structured format. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) | List of category information. |  [optional] |
|**banner** | **String** | Name of the earning rule. This is displayed as a header for the earning rule in the Dashboard. |  [optional] |
|**name** | **String** | Name of the redeemable. |  [optional] |
|**campaignName** | **String** | Name of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60; |  [optional] |
|**campaignId** | **String** | Id of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60; |  [optional] |
|**validationRulesAssignments** | [**ValidationRulesAssignmentsList**](ValidationRulesAssignmentsList.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| PROMOTION_STACK | &quot;promotion_stack&quot; |
| VOUCHER | &quot;voucher&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



