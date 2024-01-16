

# DiscountUnitMultipleOneUnit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unitOff** | **BigDecimal** | Number of units to be granted a full value discount. |  [optional] |
|**unitOffFormula** | **String** |  |  [optional] |
|**effect** | [**EffectEnum**](#EffectEnum) | Defines how the unit is added to the customer&#39;s order.   |  |
|**unitType** | **String** | The product deemed as free, chosen from product inventory (e.g. time, items). |  |
|**product** | [**SimpleProductDiscountUnit**](SimpleProductDiscountUnit.md) |  |  [optional] |
|**sku** | [**SimpleSkuDiscountUnit**](SimpleSkuDiscountUnit.md) |  |  [optional] |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| NEW_ITEMS | &quot;ADD_NEW_ITEMS&quot; |
| MISSING_ITEMS | &quot;ADD_MISSING_ITEMS&quot; |



