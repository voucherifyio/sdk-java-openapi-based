

# DiscountPercent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher. |  |
|**percentOff** | **BigDecimal** | The percent discount that the customer will receive. |  |
|**percentOffFormula** | **String** |  |  [optional] |
|**amountLimit** | **BigDecimal** | Upper limit allowed to be applied as a discount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600. |  [optional] |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. |  [optional] |
|**effect** | **DiscountPercentVouchersEffectTypes** |  |  [optional] |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PERCENT | &quot;PERCENT&quot; |



