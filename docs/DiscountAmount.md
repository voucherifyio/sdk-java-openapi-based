

# DiscountAmount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher. |  |
|**amountOff** | **BigDecimal** | Amount taken off the subtotal of a price. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. |  |
|**amountOffFormula** | **String** |  |  [optional] |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. |  [optional] |
|**effect** | **DiscountAmountVouchersEffectTypes** |  |  [optional] |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMOUNT | &quot;AMOUNT&quot; |
| UNIT | &quot;UNIT&quot; |
| PERCENT | &quot;PERCENT&quot; |
| FIXED | &quot;FIXED&quot; |



