

# RedemptionsRollbackCreateResponseBody

Response body schema for **POST** `/redemptions/{redemptionId}/rollback`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the redemption rollback. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON |  |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |  |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the redemption. |  [optional] |
|**amount** | **Integer** | For gift cards, this represents the number of the credits restored to the card in the rolledback redemption. The number is a negative integer in the smallest currency unit, e.g. -100 cents for $1.00 added back to the card. For loyalty cards, this represents the number of loyalty points restored to the card in the rolledback redemption. The number is a negative integer. |  [optional] |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |  [optional] |
|**reason** | **String** | System generated cause for the redemption being invalid in the context of the provided parameters. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Redemption status. |  |
|**relatedRedemptions** | [**RedemptionRollbackRelatedRedemptions**](RedemptionRollbackRelatedRedemptions.md) |  |  [optional] |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |  [optional] |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |  [optional] |
|**order** | [**OrderCalculatedNoCustomerData**](OrderCalculatedNoCustomerData.md) |  |  [optional] |
|**channel** | [**RedemptionRollbackChannel**](RedemptionRollbackChannel.md) |  |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |  |
|**relatedObjectId** | **String** | Unique identifier of the related object. It is assigned by Voucherify, i.e. &#x60;v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno&#x60; for a voucher. |  |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |  [optional] |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |  [optional] |
|**gift** | [**RedemptionRollbackGift**](RedemptionRollbackGift.md) |  |  [optional] |
|**loyaltyCard** | [**RedemptionRollbackLoyaltyCard**](RedemptionRollbackLoyaltyCard.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION_ROLLBACK | &quot;redemption_rollback&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| REDEMPTION | &quot;redemption&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



