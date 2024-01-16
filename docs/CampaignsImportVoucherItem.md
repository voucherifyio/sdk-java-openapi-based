

# CampaignsImportVoucherItem

Import Vouchers to Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique custom voucher code. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of voucher. |  [optional] |
|**redemption** | [**CampaignsImportVoucherItemRedemption**](CampaignsImportVoucherItemRedemption.md) |  |  [optional] |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the voucher. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |  [optional] |
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |  [optional] |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |  [optional] |
|**validityTimeframe** | [**CampaignBaseValidityTimeframe**](CampaignBaseValidityTimeframe.md) |  |  [optional] |
|**validityDayOfWeek** | **List&lt;Integer&gt;** | Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60;  Sunday   - &#x60;1&#x60;  Monday   - &#x60;2&#x60;  Tuesday   - &#x60;3&#x60;  Wednesday   - &#x60;4&#x60;  Thursday   - &#x60;5&#x60;  Friday   - &#x60;6&#x60;  Saturday   |  [optional] |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**gift** | [**Gift**](Gift.md) |  |  [optional] |
|**loyaltyCard** | [**CampaignsImportVoucherLoyaltyCard**](CampaignsImportVoucherLoyaltyCard.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| LUCKY_DRAW_CODE | &quot;LUCKY_DRAW_CODE&quot; |



