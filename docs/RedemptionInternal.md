

# RedemptionInternal

Model Used for internal communication

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique redemption ID. |  [optional] |
|**_object** | **String** | The type of object represented by the JSON. This object stores information about the &#x60;redemption&#x60;. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created in ISO 8601 format. |  [optional] |
|**trackingId** | **String** | Hashed customer source ID. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the redemption. |  [optional] |
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | The source of the channel for the redemption rollback. A &#x60;USER&#x60; corresponds to the Voucherify Dashboard and an &#x60;API&#x60; corresponds to the API. |  [optional] |
|**channelId** | **String** | Unique channel ID of the user performing the redemption. This is either a user ID from a user using the Voucherify Dashboard or an X-APP-Id of a user using the API. |  [optional] |
|**failureCode** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed. |  [optional] |
|**failureMessage** | **String** | If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed. |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**previousOrder** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**reward** | [**RedemptionRewardResult**](RedemptionRewardResult.md) |  |  [optional] |
|**amount** | **Integer** | A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts. |  [optional] |
|**reason** | **String** | System generated cause for the redemption being invalid in the context of the provided parameters. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Redemption result. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Redemption status. |  [optional] |
|**relatedRedemptions** | [**RedemptionInternalRelatedRedemptions**](RedemptionInternalRelatedRedemptions.md) |  |  [optional] |
|**parentRedemptionId** | **String** | Unique redemption ID of the parent redemption. |  [optional] |
|**redemption** | **String** | Unique redemption ID of the parent redemption. |  [optional] |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**customerId** | **String** | Unique customer ID of the redeeming customer. |  [optional] |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object. |  [optional] |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |  [optional] |
|**relatedObjectParentId** | **String** | Unique related parent object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher. |  [optional] |
|**campaignName** | **String** | Campaign name |  [optional] |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |  [optional] |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| API | &quot;API&quot; |



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



