

# PublicationsListResponseBodyPublicationsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique publication ID, assigned by Voucherify. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format. |  [optional] |
|**customerId** | **String** | Unique customer ID of the customer receiving the publication. |  [optional] |
|**trackingId** | **String** | Customer&#39;s &#x60;source_id&#x60;. |  [optional] |
|**metadata** | [**PublicationsListResponseBodyPublicationsItemMetadata**](PublicationsListResponseBodyPublicationsItemMetadata.md) |  |  [optional] |
|**channel** | **String** | How the publication was originated. It can be your own custom channel or an example value provided here. |  [optional] |
|**sourceId** | **String** | The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service.  |  [optional] |
|**customer** | [**CustomerWithSummaryLoyaltyReferrals**](CustomerWithSummaryLoyaltyReferrals.md) |  |  [optional] |
|**vouchers** | **List&lt;String&gt;** | Contains the voucher IDs that was assigned by Voucherify. and Contains the unique voucher codes that was assigned by Voucherify. |  [optional] |
|**vouchersId** | **List&lt;String&gt;** | Contains the unique internal voucher IDs that was assigned by Voucherify. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) |  |  [optional] |
|**voucher** | [**ListPublicationsItemVoucher**](ListPublicationsItemVoucher.md) |  |  [optional] |
|**failureCode** | **String** | Generic reason as to why the create publication operation failed. |  [optional] |
|**failureMessage** | **String** | This parameter will provide more expanded reason as to why the create publication operation failed. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PUBLICATION | &quot;publication&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



