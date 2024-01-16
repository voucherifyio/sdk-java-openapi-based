

# DiscountFixed


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher. |  |
|**fixedAmount** | **BigDecimal** | Sets a fixed value for an order total or the item price. The value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. If the fixed amount is calculated by the formula, i.e. the &#x60;fixed_amount_formula&#x60; parameter is present in the fixed amount definition, this value becomes the **fallback value**. As a result, if the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed value. |  |
|**fixedAmountFormula** | **String** |  |  [optional] |
|**effect** | **DiscountFixedVouchersEffectTypes** |  |  [optional] |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |



