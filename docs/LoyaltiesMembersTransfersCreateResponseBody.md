

# LoyaltiesMembersTransfersCreateResponseBody

Response body schema for **POST** `/loyalties/{campaignId}/members/{memberId}/transfers`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Assigned by the Voucherify API, identifies the voucher. |  |
|**code** | **String** | A code that identifies a voucher. Pattern can use all letters of the English alphabet, Arabic numerals, and special characters. |  |
|**campaign** | **String** | A unique campaign name, identifies the voucher&#39;s parent campaign. |  [optional] |
|**campaignId** | **String** | Assigned by the Voucherify API, identifies the voucher&#39;s parent campaign. |  [optional] |
|**category** | **String** | Tag defining the category that this voucher belongs to. Useful when listing vouchers using the List Vouchers endpoint. |  [optional] |
|**categoryId** | **String** | Unique category ID assigned by Voucherify. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher. |  |
|**loyaltyCard** | [**LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard**](LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard.md) |  |  |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is inactive before this date. |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the code expires in ISO 8601 format. Voucher is inactive after this date. |  [optional] |
|**validityTimeframe** | [**LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe**](LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe.md) |  |  [optional] |
|**validityDayOfWeek** | **List&lt;Integer&gt;** | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |  [optional] |
|**publish** | [**LoyaltiesMembersTransfersCreateResponseBodyPublish**](LoyaltiesMembersTransfersCreateResponseBodyPublish.md) |  |  [optional] |
|**redemption** | [**LoyaltiesMembersTransfersCreateResponseBodyRedemption**](LoyaltiesMembersTransfersCreateResponseBodyRedemption.md) |  |  [optional] |
|**active** | **String** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the start_date and expiration_date.  - &#x60;true&#x60; indicates an active voucher - &#x60;false&#x60; indicates an inactive voucher |  |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |  |
|**assets** | [**LoyaltiesMembersTransfersCreateResponseBodyAssets**](LoyaltiesMembersTransfersCreateResponseBodyAssets.md) |  |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  |
|**holderId** | **String** | Unique customer ID of voucher owner. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was last updated in ISO 8601 format. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



