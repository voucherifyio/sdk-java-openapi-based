

# EarningRuleProportionalOrderItemsAmount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio. |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | ORDER_ITEMS_AMOUNT; Pre-discount amount spent on items defined in the order_items.amount.object &amp; .id (X points for every Y spent on items excluding discounts) |  |
|**orderItems** | [**EarningRuleProportionalOrderItemsAmountOrderItems**](EarningRuleProportionalOrderItemsAmountOrderItems.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ORDER_ITEMS_AMOUNT | &quot;ORDER_ITEMS_AMOUNT&quot; |



