

# OrderItemCalculated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**skuId** | **String** | A unique SKU ID assigned by Voucherify. |  [optional] |
|**productId** | **String** | A unique product ID assigned by Voucherify. |  [optional] |
|**relatedObject** | [**RelatedObjectEnum**](#RelatedObjectEnum) | Used along with the source_id property, can be set to either sku or product. |  [optional] |
|**sourceId** | **String** | The merchant’s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service. |  [optional] |
|**quantity** | **Integer** | The quantity of the particular item in the cart. |  [optional] |
|**discountQuantity** | **Integer** | Number of dicounted items. |  [optional] |
|**initialQuantity** | **Integer** | A positive integer in the smallest unit quantity representing the total amount of the order; this is the sum of the order items&#39; quantity. |  [optional] |
|**amount** | **Integer** | The total amount of the order item (price * quantity). |  [optional] |
|**discountAmount** | **Integer** | Sum of all order-item-level discounts applied to the order. |  [optional] |
|**appliedDiscountAmount** | **Integer** | This field shows the order-level discount applied. |  [optional] |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**totalAppliedDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied in a particular request.   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; |  [optional] |
|**price** | **Integer** | Unit price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |  [optional] |
|**subtotalAmount** | **Integer** | Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;applied_discount_amount&#x60; |  [optional] |
|**product** | [**OrderItemProduct**](OrderItemProduct.md) |  |  [optional] |
|**sku** | [**OrderItemSku**](OrderItemSku.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an SKU. It can be useful for storing additional information about the SKU in a structured format. |  [optional] |



## Enum: RelatedObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER_ITEM | &quot;order_item&quot; |



