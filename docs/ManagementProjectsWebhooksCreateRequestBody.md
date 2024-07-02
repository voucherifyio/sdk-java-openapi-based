

# ManagementProjectsWebhooksCreateRequestBody

Request body schema for **POST** `/management/v1/projects/{projectId}/webhooks`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetUrl** | **String** | URL address that receives webhooks. |  |
|**events** | **List&lt;Map&lt;String, Object&gt;&gt;** | Lists the events that trigger webhook sendout. |  |
|**active** | **Boolean** | Determines if the webhook configuration is active. |  [optional] |



