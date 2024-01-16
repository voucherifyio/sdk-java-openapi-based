

# EarningRuleProportionalOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio. |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | &#x60;ORDER_METADATA&#x60;: Order Metadata (X points for every Y in metadata attribute, defined in the property key under the order.metadata object) |  |
|**order** | [**EarningRuleProportionalOrderMetadataOrder**](EarningRuleProportionalOrderMetadataOrder.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| ORDER_METADATA | &quot;ORDER_METADATA&quot; |



