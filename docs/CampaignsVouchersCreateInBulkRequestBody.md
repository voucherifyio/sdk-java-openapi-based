

# CampaignsVouchersCreateInBulkRequestBody

Request body schema for **POST** `/campaigns/{campaignId}/vouchers`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the voucher. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |  [optional] |
|**redemption** | [**CampaignsImportVoucherItemRedemption**](CampaignsImportVoucherItemRedemption.md) |  |  [optional] |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |  [optional] |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the voucher starts to be active in ISO 8601 format. Voucher is *inactive before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the voucher expires in ISO 8601 format.  Voucher is *inactive after* this date. |  [optional] |
|**code** | **String** | Unique voucher code. |  [optional] |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |  [optional] |



