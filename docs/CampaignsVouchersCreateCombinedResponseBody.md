

# CampaignsVouchersCreateCombinedResponseBody

Returns a voucher object if the call succeeded for a voucher count of 1. and Returns an `async_action_id` if the request was made to create more than 1 voucher.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Assigned by the Voucherify API, identifies the voucher. |  [optional] |
|**code** | **String** | A code that identifies a voucher. Pattern can use all letters of the English alphabet, Arabic numerals, and special characters. |  [optional] |
|**campaign** | **String** | A unique campaign name, identifies the voucher&#39;s parent campaign. |  [optional] |
|**campaignId** | **String** | Assigned by the Voucherify API, identifies the voucher&#39;s parent campaign. |  [optional] |
|**category** | **String** | Tag defining the category that this voucher belongs to. Useful when listing vouchers using the List Vouchers endpoint. |  [optional] |
|**categoryId** | **String** | Unique category ID assigned by Voucherify. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher.  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**gift** | [**VoucherGift**](VoucherGift.md) |  |  [optional] |
|**loyaltyCard** | [**VoucherLoyaltyCard**](VoucherLoyaltyCard.md) |  |  [optional] |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is *inactive before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the code expires in ISO 8601 format.  Voucher is *inactive after* this date. |  [optional] |
|**validityTimeframe** | [**VoucherValidityTimeframe**](VoucherValidityTimeframe.md) |  |  [optional] |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |  [optional] |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |  [optional] |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |  [optional] |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |  [optional] |
|**assets** | [**VoucherAssets**](VoucherAssets.md) |  |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was created. The value is shown in the ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was last updated in ISO 8601 format. |  [optional] |
|**holderId** | **String** | Unique identifier of the customer who owns the voucher. |  [optional] |
|**referrerId** | **String** | Unique identifier of the referring person. |  [optional] |
|**_object** | **String** | The type of the object represented by JSON. Default is &#x60;voucher&#x60;. |  [optional] |
|**validationRulesAssignments** | [**ValidationRulesAssignmentsList**](ValidationRulesAssignmentsList.md) |  |  [optional] |
|**publish** | [**VoucherPublish**](VoucherPublish.md) |  |  [optional] |
|**redemption** | [**VoucherRedemption**](VoucherRedemption.md) |  |  [optional] |
|**asyncActionId** | **String** | The ID of the scheduled asynchronous action. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



## Enum: List&lt;ValidityDayOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



