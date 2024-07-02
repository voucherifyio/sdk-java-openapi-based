

# SimpleOrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the &#x60;order_item&#x60;. |  [optional] |
|**sourceId** | **String** | The merchant’s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service. |  [optional] |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) | Used along with the source_id property, can be set to either sku or product. |  [optional] |
|**productId** | **String** | A unique product ID assigned by Voucherify. |  [optional] |
|**skuId** | **String** | A unique SKU ID assigned by Voucherify. |  [optional] |
|**quantity** | **Integer** | The quantity of the particular item in the cart. |  [optional] |
|**discountQuantity** | **Integer** | Number of dicounted items. |  [optional] |
|**amount** | **Integer** | The total amount of the order item (price * quantity). |  [optional] |
|**discountAmount** | **Integer** | Sum of all order-item-level discounts applied to the order. |  [optional] |
|**appliedDiscountAmount** | **Integer** | This field shows the order-level discount applied. |  [optional] |
|**price** | **Integer** | Unit price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_ITEM | &quot;order_item&quot; |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



