

# OrdersUpdateRequestBody

Request body schema for **PUT** `/orders/{orderId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The order status. |  [optional] |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.   |  [optional] |
|**discountAmount** | **Integer** | Sum of all order-level discounts applied to the order. |  [optional] |
|**initialAmount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | Array of items applied to the order. |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |  [optional] |
|**referrer** | [**Referrer**](Referrer.md) |  |  [optional] |
|**referrerId** | **String** | Unique referrer ID. |  [optional] |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PAID | &quot;PAID&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



