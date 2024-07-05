

# PublicationsCreateResponseBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique publication ID, assigned by Voucherify. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format. |  [optional] |
|**customerId** | **String** | Unique customer ID of the customer receiving the publication. |  [optional] |
|**trackingId** | **String** | Customer&#39;s &#x60;source_id&#x60;. |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | How the publication was originated. It can be your own custom channel or an example value provided here. |  [optional] |
|**sourceId** | **String** | The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service.  |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Status of the publication attempt. |  [optional] |
|**customer** | [**CustomerWithSummaryLoyaltyReferrals**](CustomerWithSummaryLoyaltyReferrals.md) |  |  [optional] |
|**vouchersId** | **List&lt;String&gt;** | Contains the unique internal voucher ID that was assigned by Voucherify. |  [optional] |
|**voucher** | [**Voucher**](Voucher.md) |  |  [optional] |
|**vouchers** | **List&lt;String&gt;** | Contains the unique voucher codes that was assigned by Voucherify. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PUBLICATION | &quot;publication&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



