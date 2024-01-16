

# ProductCollectionsProductsList

Response body schema for **GET** /product-collections/{productCollectionID}/products.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | The type of object represented by JSON. This object stores information about products and SKUs. |  |
|**dataRef** | **String** | Identifies the name of the JSON property that contains the array of products and SKUs. |  |
|**data** | [**List&lt;ProductCollectionsProductsListProductsItem&gt;**](ProductCollectionsProductsListProductsItem.md) | A dictionary that contains an array of products and SKUs. |  |
|**total** | **Integer** | Total number of products &amp; SKUs in the product collection. |  |



