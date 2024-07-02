

# ManagementProjectsWebhooksResponseBody

Response body schema for webhook endpoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetUrl** | **String** | URL address that receives webhooks. |  |
|**events** | **List&lt;Map&lt;String, Object&gt;&gt;** | Lists the events that trigger webhook sendout. |  |
|**active** | **Boolean** | Determines if the webhook configuration is active. |  |
|**id** | **String** | Unique identifier of the webhook. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the webhook configuration was created. The value for this parameter is shown in the ISO 8601 format. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |



