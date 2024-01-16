

# EarningRuleProportionalCustomerMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines how the points will be added to the loyalty card.PROPORTIONAL adds points based on a pre-defined ratio. |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | CUSTOMER_METADATA: Customer Metadata (X points for every Y in metadata attribute, defined in the property key under the customer.metadata object) |  |
|**customer** | [**EarningRuleProportionalCustomerMetadataCustomer**](EarningRuleProportionalCustomerMetadataCustomer.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROPORTIONAL | &quot;PROPORTIONAL&quot; |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_METADATA | &quot;CUSTOMER_METADATA&quot; |



