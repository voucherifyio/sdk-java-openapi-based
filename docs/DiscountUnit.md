

# DiscountUnit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Discount type. |  |
|**unitOff** | **Integer** | Number of units to be granted a full value discount. |  [optional] |
|**unitOffFormula** | **String** |  |  [optional] |
|**effect** | **DiscountUnitVouchersEffectTypes** |  |  [optional] |
|**unitType** | **String** | The product deemed as free, chosen from product inventory (e.g. time, items). |  |
|**product** | [**SimpleProductDiscountUnit**](SimpleProductDiscountUnit.md) |  |  [optional] |
|**sku** | [**SimpleSkuDiscountUnit**](SimpleSkuDiscountUnit.md) |  |  [optional] |
|**isDynamic** | **Boolean** | Flag indicating whether the discount was calculated using a formula. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNIT | &quot;UNIT&quot; |



