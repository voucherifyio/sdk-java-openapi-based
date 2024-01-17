

# OrderCalculatedBase

Order information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request. |  [optional] |
|**sourceId** | **String** | Unique source ID of an existing order that will be linked to the redemption of this request. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was last updated in ISO 8601 format. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |  [optional] |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. |  [optional] |
|**itemsDiscountAmount** | **Integer** | Sum of all product-specific discounts applied to the order. |  [optional] |
|**totalDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied to the order. |  [optional] |
|**totalAmount** | **Integer** | Order amount after undoing all the discounts through the rollback redemption. |  [optional] |
|**appliedDiscountAmount** | **Integer** | This field shows the order-level discount applied. |  [optional] |
|**itemsAppliedDiscountAmount** | **Integer** | Sum of all product-specific discounts applied in a particular request.   &#x60;sum(items, i &#x3D;&gt; i.applied_discount_amount)&#x60; |  [optional] |
|**totalAppliedDiscountAmount** | **Integer** | Sum of all order-level AND all product-specific discounts applied in a particular request.   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; |  [optional] |
|**items** | [**List&lt;OrderItemCalculated&gt;**](OrderItemCalculated.md) | Array of items applied to the order. |  [optional] |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. |  [optional] |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |  [optional] |
|**referrerId** | **String** | Unique referrer ID. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  |
|**redemptions** | [**Map&lt;String, OrderRedemptions&gt;**](OrderRedemptions.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |



