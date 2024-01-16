

# ProductCollectionsCreateDynamicRequestBody

Response body schema for **POST** `/product-collections`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Show that the product collection is dynamic (products come in and leave based on set criteria). |  |
|**name** | **String** | Unique user-defined product collection name. |  |
|**filter** | [**ProductCollectionsCreateDynamicRequestBodyFilter**](ProductCollectionsCreateDynamicRequestBodyFilter.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |



