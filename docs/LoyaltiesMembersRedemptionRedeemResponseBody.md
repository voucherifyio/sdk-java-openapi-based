

# LoyaltiesMembersRedemptionRedeemResponseBody

Response body schema for **POST** `/loyalties/{campaignId}/members/{memberId}/redemption` and for **POST** `/loyalties/members/{memberId}/redemption`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique redemption ID. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON |  |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |  |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the redemption. |  [optional] |
|**amount** | **Integer** | For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. |  [optional] |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Redemption status. |  |
|**relatedRedemptions** | [**RedemptionRelatedRedemptions**](RedemptionRelatedRedemptions.md) |  |  [optional] |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |  [optional] |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |  [optional] |
|**order** | [**OrderCalculatedNoCustomerData**](OrderCalculatedNoCustomerData.md) |  |  [optional] |
|**channel** | [**RedemptionChannel**](RedemptionChannel.md) |  |  |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |  |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |  |
|**voucher** | [**RedemptionVoucher**](RedemptionVoucher.md) |  |  [optional] |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |  [optional] |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |  |
|**gift** | [**RedemptionGift**](RedemptionGift.md) |  |  [optional] |
|**loyaltyCard** | [**RedemptionLoyaltyCard**](RedemptionLoyaltyCard.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEMPTION | &quot;redemption&quot; |



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



