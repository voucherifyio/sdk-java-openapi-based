

# RedemptionRewardResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  |
|**assignmentId** | **String** | Unique reward assignment ID assigned by Voucherify. |  |
|**voucher** | [**RedemptionRewardResultVoucher**](RedemptionRewardResultVoucher.md) |  |  |
|**product** | [**RedemptionRewardResultProduct**](RedemptionRewardResultProduct.md) |  |  |
|**sku** | [**RedemptionRewardResultSku**](RedemptionRewardResultSku.md) |  |  |
|**loyaltyTierId** | **String** | Unique loyalty tier ID assigned by Voucherify. |  |
|**id** | **String** | Unique reward ID. |  [optional] |
|**name** | **String** | Name of the reward. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by the JSON |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp in ISO 8601 format indicating when the reward was updated. |  [optional] |
|**parameters** | [**RedemptionRewardResultParameters**](RedemptionRewardResultParameters.md) |  |  [optional] |
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



