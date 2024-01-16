

# EarningRuleProportionalOrderItemsQuantity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio. |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | &#x60;ORDER_ITEMS_QUANTITY&#x60;: Quantity of items defined in order_items.quantity.object &amp; .id (X points for every Y items excluding free items) |  |
|**orderItems** | [**EarningRuleProportionalOrderItemsQuantityOrderItems**](EarningRuleProportionalOrderItemsQuantityOrderItems.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ORDER_ITEMS_QUANTITY | &quot;ORDER_ITEMS_QUANTITY&quot; |



