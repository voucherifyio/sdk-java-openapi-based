

# LoyaltiesTiersGetResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/tiers/{loyaltyTierId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Loyalty Tier name. |  |
|**earningRules** | [**Map&lt;String, MappingPoints&gt;**](MappingPoints.md) | Contains a list of earning rule IDs and their points mapping for the given earning rule. |  [optional] |
|**rewards** | [**Map&lt;String, MappingPoints&gt;**](MappingPoints.md) | Contains a list of reward IDs and their points mapping for the given reward. |  [optional] |
|**points** | [**LoyaltyTierBasePoints**](LoyaltyTierBasePoints.md) |  |  |
|**id** | **String** | Unique loyalty tier ID. |  |
|**campaignId** | **String** | Unique parent campaign ID. |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the loyalty tier. A set of key/value pairs that you can attach to a loyalty tier object. It can be useful for storing additional information about the loyalty tier in a structured format. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty tier was created in ISO 8601 format. |  |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty tier was updated in ISO 8601 format. |  [optional] |
|**config** | [**LoyaltyTierAllOfConfig**](LoyaltyTierAllOfConfig.md) |  |  |
|**expiration** | [**LoyaltyTierExpiration**](LoyaltyTierExpiration.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. This object stores information about the loyalty. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOYALTY_TIER | &quot;loyalty_tier&quot; |



