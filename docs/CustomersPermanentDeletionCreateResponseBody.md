

# CustomersPermanentDeletionCreateResponseBody

Response body schema for **POST** `/customers/{customerId}/permanent-deletion`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique permanent deletion object ID. |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the customer was requested to be deleted in ISO 8601 format. |  |
|**relatedObjectId** | **String** | Unique customer ID that is being deleted. |  |
|**relatedObject** | **String** | Object being deleted. |  |
|**status** | **String** | Deletion status. |  |
|**dataJson** | [**CustomersPermanentDeletionCreateResponseBodyDataJson**](CustomersPermanentDeletionCreateResponseBodyDataJson.md) |  |  |
|**_object** | **String** | The type of object represented by JSON. |  |



