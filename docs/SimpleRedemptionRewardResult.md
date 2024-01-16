

# SimpleRedemptionRewardResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**assignmentId** | **String** | Unique reward assignment ID assigned by Voucherify. |  [optional] |
|**voucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |  [optional] |
|**product** | [**SimpleProduct**](SimpleProduct.md) |  |  [optional] |
|**sku** | [**SimpleSku**](SimpleSku.md) |  |  [optional] |
|**loyaltyTierId** | **String** | Unique loyalty tier ID assigned by Voucherify. |  [optional] |
|**id** | **String** | Unique reward ID, assigned by Voucherify. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by the JSON. This object stores information about the reward. |  [optional] |
|**name** | **String** | Reward name. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was created in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was updated in ISO 8601 format. |  [optional] |
|**parameters** | **Object** | Defines how the reward is generated. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Reward type. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD | &quot;reward&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;CAMPAIGN&quot; |
| COIN | &quot;COIN&quot; |
| MATERIAL | &quot;MATERIAL&quot; |



