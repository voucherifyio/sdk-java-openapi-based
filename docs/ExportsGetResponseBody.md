

# ExportsGetResponseBody

Response body schema for **GET** `/exports/{exportId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique export ID. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object being represented. This object stores information about the export. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the export was scheduled in ISO 8601 format. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated. |  |
|**channel** | **String** | The channel through which the export was triggered. |  [optional] |
|**result** | [**ExportBaseResult**](ExportBaseResult.md) |  |  [optional] |
|**userId** | **String** | Identifies the specific user who initiated the export through the Voucherify Dashboard; returned when the channel value is WEBSITE. |  [optional] |
|**exportedObject** | [**ExportedObjectEnum**](#ExportedObjectEnum) | The type of object to be exported. |  |
|**parameters** | [**LoyaltiesMembersTransactionsExportCreateRequestBodyParameters**](LoyaltiesMembersTransactionsExportCreateRequestBodyParameters.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EXPORT | &quot;export&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: ExportedObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER_TRANSACTIONS | &quot;voucher_transactions&quot; |



