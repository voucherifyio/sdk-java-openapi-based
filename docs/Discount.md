

# Discount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**amountOff** | **BigDecimal** | Amount taken off the subtotal of a price. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. |  [optional] |
|**amountOffFormula** | **String** |  |  [optional] |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. |  [optional] |
|**effect** | [**EffectEnum**](#EffectEnum) |  |  [optional] |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |  [optional] |
|**unitOff** | **Integer** | Number of units to be granted a full value discount. |  [optional] |
|**unitOffFormula** | **String** |  |  [optional] |
|**unitType** | **String** | The product deemed as free, chosen from product inventory (e.g. time, items). |  [optional] |
|**product** | [**SimpleProductDiscountUnit**](SimpleProductDiscountUnit.md) |  |  [optional] |
|**sku** | [**SimpleSkuDiscountUnit**](SimpleSkuDiscountUnit.md) |  |  [optional] |
|**units** | [**List&lt;DiscountUnitMultipleOneUnit&gt;**](DiscountUnitMultipleOneUnit.md) |  |  [optional] |
|**percentOff** | **BigDecimal** | The percent discount that the customer will receive. |  [optional] |
|**percentOffFormula** | **String** |  |  [optional] |
|**amountLimit** | **BigDecimal** | Upper limit allowed to be applied as a discount. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600. |  [optional] |
|**fixedAmount** | **BigDecimal** | Sets a fixed value for an order total or the item price. The value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 discount is written as 1000. If the fixed amount is calculated by the formula, i.e. the &#x60;fixed_amount_formula&#x60; parameter is present in the fixed amount definition, this value becomes the **fallback value**. As a result, if the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed value. |  [optional] |
|**fixedAmountFormula** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMOUNT | &quot;AMOUNT&quot; |
| UNIT | &quot;UNIT&quot; |
| PERCENT | &quot;PERCENT&quot; |
| FIXED | &quot;FIXED&quot; |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| APPLY_TO_ORDER | &quot;APPLY_TO_ORDER&quot; |
| APPLY_TO_ITEMS | &quot;APPLY_TO_ITEMS&quot; |
| APPLY_TO_ITEMS_PROPORTIONALLY | &quot;APPLY_TO_ITEMS_PROPORTIONALLY&quot; |
| APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY&quot; |
| APPLY_TO_ITEMS_BY_QUANTITY | &quot;APPLY_TO_ITEMS_BY_QUANTITY&quot; |
| ADD_MISSING_ITEMS | &quot;ADD_MISSING_ITEMS&quot; |
| ADD_NEW_ITEMS | &quot;ADD_NEW_ITEMS&quot; |
| ADD_MANY_ITEMS | &quot;ADD_MANY_ITEMS&quot; |



