

# VouchersRedemptionGetResponseBodyRedemptionEntriesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |  |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. and For gift cards, this represents the number of the credits restored to the card in the rolledback redemption. The number is a negative integer in the smallest currency unit, e.g. -100 cents for $1.00 added back to the card. For loyalty cards, this represents the number of loyalty points restored to the card in the rolledback redemption. The number is a negative integer. |  [optional] |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**relatedRedemptions** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemRelatedRedemptions**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemRelatedRedemptions.md) |  |  [optional] |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |  [optional] |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |  [optional] |
|**order** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.md) |  |  [optional] |
|**channel** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemChannel**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemChannel.md) |  |  |
|**customer** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemCustomer**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemCustomer.md) |  |  [optional] |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |  |
|**relatedObjectId** | **String** |  |  |
|**voucher** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucher**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucher.md) |  |  [optional] |
|**promotionTier** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTier**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTier.md) |  |  [optional] |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |  [optional] |
|**gift** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemGift**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemGift.md) |  |  [optional] |
|**loyaltyCard** | [**VouchersRedemptionGetResponseBodyRedemptionEntriesItemLoyaltyCard**](VouchersRedemptionGetResponseBodyRedemptionEntriesItemLoyaltyCard.md) |  |  [optional] |
|**reason** | **String** | System generated cause for the redemption being invalid in the context of the provided parameters. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION | &quot;redemption&quot; |
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
| ROLLED_BACK | &quot;ROLLED_BACK&quot; |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| REDEMPTION | &quot;redemption&quot; |



