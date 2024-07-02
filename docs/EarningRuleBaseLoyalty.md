

# EarningRuleBaseLoyalty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The number of points to be added to the loyalty card. |  |
|**points** | **Integer** | Defines how the points will be added to the loyalty card. FIXED adds a fixed number of points. |  [optional] |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | CUSTOM_EVENT_METADATA: Custom event metadata (X points for every Y in metadata attribute). |  |
|**order** | [**EarningRuleProportionalOrderMetadataOrder**](EarningRuleProportionalOrderMetadataOrder.md) |  |  |
|**orderItems** | [**EarningRuleProportionalOrderItemsSubtotalAmountOrderItems**](EarningRuleProportionalOrderItemsSubtotalAmountOrderItems.md) |  |  |
|**customer** | [**EarningRuleProportionalCustomerMetadataCustomer**](EarningRuleProportionalCustomerMetadataCustomer.md) |  |  |
|**customEvent** | [**EarningRuleProportionalCustomEventCustomEvent**](EarningRuleProportionalCustomEventCustomEvent.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_METADATA | &quot;CUSTOM_EVENT_METADATA&quot; |



