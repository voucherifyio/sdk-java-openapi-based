

# VouchersRedemptionGetResponseBodyRedemptionEntriesItemCustomer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of an existing customer that will be linked to redemption in this request. |  [optional] |
|**sourceId** | **String** | A unique identifier of the customer who validates a voucher. It can be a customer ID or email from a CRM system, database, or a third-party service. If you also pass a customer ID (unique ID assigned by Voucherify), the source ID will be ignored. |  [optional] |
|**name** | **String** | Customer&#39;s first and last name. |  [optional] |
|**email** | **String** | Customer&#39;s email address. |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



