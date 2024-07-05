

# PromotionsStacksGetResponseBody

Response body schema for **GET** `/promotions/{campaignId}/stacks/{stackId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Promotion stack name. |  |
|**tiers** | [**PromotionStackBaseTiers**](PromotionStackBaseTiers.md) |  |  |
|**id** | **String** | Unique promotion stack ID. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the promotion stack was created. The value is shown in the ISO 8601 format. |  |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the promotion stack was updated. The value is shown in the ISO 8601 format. |  [optional] |
|**campaignId** | **String** | Promotion stack&#39;s parent campaign&#39;s unique ID. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON.  |  |
|**categoryId** | **String** | Promotion stack category ID. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Details about the category assigned to the promotion stack. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROMOTION_STACK | &quot;promotion_stack&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



