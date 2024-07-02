

# ManagementProjectsCustomEventSchemaResponseBodyBase

Object containing the response to creating a custom event schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | User-defined name of the custom event. This is also shown in **Project Settings** &gt; **Event Schema** in the Voucherify Dashboard. |  |
|**schema** | [**ManagementProjectsCustomEventSchemaBaseSchema**](ManagementProjectsCustomEventSchemaBaseSchema.md) |  |  |
|**id** | **String** | Unique identifier of the custom event schema. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event schema was created. Timestamp is presented in the ISO 8601 format. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_SCHEMA | &quot;custom-event-schema&quot; |



