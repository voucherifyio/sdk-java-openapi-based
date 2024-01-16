

# EarningRuleProportionalOrderItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio. |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | ORDER_ITEMS_SUBTOTAL_AMOUNT; Amount spent on items defined in the order_items.subtotal_amount.object &amp; .id (X points for every Y spent on items including discounts) |  |
|**orderItems** | [**EarningRuleProportionalOrderItemsSubtotalAmountOrderItems**](EarningRuleProportionalOrderItemsSubtotalAmountOrderItems.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ORDER_ITEMS_SUBTOTAL_AMOUNT | &quot;ORDER_ITEMS_SUBTOTAL_AMOUNT&quot; |



