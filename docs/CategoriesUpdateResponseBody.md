

# CategoriesUpdateResponseBody

Response body schema for **PUT** `/categories/{categoryId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique category ID assigned by Voucherify. |  |
|**name** | **String** | Category name. |  |
|**hierarchy** | **Integer** | Category hierarchy. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was created in ISO 8601 format. |  |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was updated in ISO 8601 format. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CATEGORY | &quot;category&quot; |



