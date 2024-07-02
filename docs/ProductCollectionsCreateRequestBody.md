

# ProductCollectionsCreateRequestBody

Response body schema for **POST** `/product-collections`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Show that the product collection is static (manually selected products). |  |
|**name** | **String** | Unique user-defined product collection name. |  |
|**products** | [**List&lt;ProductCollectionsCreateDynamicRequestBodyProductsItem&gt;**](ProductCollectionsCreateDynamicRequestBodyProductsItem.md) | Defines a set of products for a &#x60;STATIC&#x60; product collection type. |  [optional] |
|**filter** | [**ProductCollectionsCreateDynamicRequestBodyFilter**](ProductCollectionsCreateDynamicRequestBodyFilter.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |



