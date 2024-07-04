

# VouchersRedemptionGetResponseBodyRedemptionEntriesItemChannel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** | Unique channel ID of the user performing the redemption. This is either a user ID from a user using the Voucherify Dashboard or an X-APP-Id of a user using the API. |  [optional] |
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | The source of the channel for the redemption. A &#x60;USER&#x60; corresponds to the Voucherify Dashboard and an &#x60;API&#x60; corresponds to the API. |  [optional] |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| API | &quot;API&quot; |



