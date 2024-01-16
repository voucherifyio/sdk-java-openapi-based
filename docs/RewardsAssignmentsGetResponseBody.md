

# RewardsAssignmentsGetResponseBody

Response body schema for **GET** `/rewards/{rewardId}/assignments/{assignmentId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique reward assignment ID, assigned by Voucherify. |  |
|**rewardId** | **String** | Associated reward ID. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward assignment was created in ISO 8601 format. |  |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward assignment was updated in ISO 8601 format. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by the JSON. This object stores information about the reward assignment. |  |
|**relatedObjectId** | **String** | Related object ID to which the reward was assigned. |  |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Related object type to which the reward was assigned. |  |
|**parameters** | [**RewardAssignmentParametersParameters**](RewardAssignmentParametersParameters.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD_ASSIGNMENT | &quot;reward_assignment&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |



