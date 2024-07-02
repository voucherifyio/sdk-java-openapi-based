

# ManagementProjectsCustomEventSchemaResponseBody

Response body schema for **POST** `/management/v1/projects/{projectId}/custom-event-schema`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the custom event schema. |  |
|**name** | **String** | User-defined name of the custom event. This is also shown in **Project Settings** &gt; **Event Schema** in the Voucherify Dashboard. |  |
|**schema** | [**ManagementProjectsCustomEventSchemaBaseSchema**](ManagementProjectsCustomEventSchemaBaseSchema.md) |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event schema was created. Timestamp is presented in the ISO 8601 format. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |  |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event schema was updated. Timestamp is presented in the ISO 8601 format. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_SCHEMA | &quot;custom-event-schema&quot; |



