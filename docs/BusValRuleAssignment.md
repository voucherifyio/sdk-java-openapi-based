

# BusValRuleAssignment

Assignments of business validation rule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for a assignment |  |
|**ruleId** | **String** | The unique identifier for a rule |  |
|**relatedObjectId** | **String** | The unique identifier for a related object |  |
|**relatedObjectType** | **String** | The type of related object |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the object was created in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the object was last updated in ISO 8601 format. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  |
|**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | The validation status of the assignment |  [optional] |
|**validationOmittedRules** | **List&lt;String&gt;** | The list of omitted rules |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VALIDATION_RULES_ASSIGNMENT | &quot;validation_rules_assignment&quot; |



## Enum: ValidationStatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;VALID&quot; |
| PARTIALLY_VALID | &quot;PARTIALLY_VALID&quot; |
| INVALID | &quot;INVALID&quot; |



