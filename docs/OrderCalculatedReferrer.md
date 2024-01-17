

# OrderCalculatedReferrer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier of an existing customer. |  |
|**sourceId** | **String** | A unique identifier of the customer who validates a voucher. It can be a customer ID or email from a CRM system, database, or a third-party service. If you also pass a customer ID (unique ID assigned by Voucherify), the source ID will be ignored. |  [optional] |
|**summary** | [**CustomerSummary**](CustomerSummary.md) |  |  [optional] |
|**loyalty** | [**CustomerLoyalty**](CustomerLoyalty.md) |  |  [optional] |
|**referrals** | [**CustomerReferrals**](CustomerReferrals.md) |  |  [optional] |
|**systemMetadata** | **Object** | Object used to store system metadata information. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the customer was created in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the customer was updated in ISO 8601 format. |  [optional] |
|**assets** | [**CustomerResponseDataAssets**](CustomerResponseDataAssets.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  |
|**name** | **String** | Customer&#39;s first and last name. |  [optional] |
|**description** | **String** | An arbitrary string that you can attach to a customer object. |  [optional] |
|**email** | **String** | Customer&#39;s email address. |  [optional] |
|**phone** | **String** | Customer&#39;s phone number. This parameter is mandatory when you try to send out codes to customers via an SMS channel. |  [optional] |
|**birthday** | **LocalDate** | *Deprecated* Customer&#39;s birthdate; format YYYY-MM-DD. |  [optional] |
|**birthdate** | **LocalDate** | Customer&#39;s birthdate; format YYYY-MM-DD. |  [optional] |
|**address** | [**CustomerBaseAddress**](CustomerBaseAddress.md) |  |  [optional] |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |



