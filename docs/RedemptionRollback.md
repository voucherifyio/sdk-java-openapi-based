

# RedemptionRollback

This is an object representing a redemption rollback.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique redemption ID. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by the JSON |  |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created in ISO 8601 format. |  |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |  |
|**trackingId** | **String** | Hashed customer source ID. |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the redemption. |  |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |  |
|**reason** | **String** | System generated cause for the redemption being invalid in the context of the provided parameters. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Redemption status. |  |
|**relatedRedemptions** | [**RedemptionRollbackRelatedRedemptions**](RedemptionRollbackRelatedRedemptions.md) |  |  [optional] |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |  [optional] |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |  [optional] |
|**order** | [**OrderCalculatedNoCustomerData**](OrderCalculatedNoCustomerData.md) |  |  |
|**channel** | [**RedemptionChannel**](RedemptionChannel.md) |  |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |  |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |  |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |  [optional] |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |  [optional] |
|**gift** | [**RedemptionGift**](RedemptionGift.md) |  |  [optional] |
|**loyaltyCard** | [**RedemptionLoyaltyCard**](RedemptionLoyaltyCard.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION_ROLLBACK | &quot;redemption_rollback&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| REDEMPTION | &quot;redemption&quot; |



