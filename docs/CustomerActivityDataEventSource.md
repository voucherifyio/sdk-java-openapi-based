

# CustomerActivityDataEventSource

Contains the source of the object that initiated the sendout.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | Determines the channel that initiated the sendout. |  |
|**user** | [**CustomerActivityDataEventSourceUser**](CustomerActivityDataEventSourceUser.md) |  |  [optional] |
|**apiKey** | [**CustomerActivityDataEventSourceApiKey**](CustomerActivityDataEventSourceApiKey.md) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| USER_PORTAL | &quot;USER_PORTAL&quot; |
| API | &quot;API&quot; |
| CLIENT_API | &quot;CLIENT_API&quot; |
| INTERNAL | &quot;INTERNAL&quot; |



