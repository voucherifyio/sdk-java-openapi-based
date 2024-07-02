

# SimpleCampaign

Simplified campaign data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Campaign ID. |  [optional] |
|**name** | **String** | Campaign name. |  [optional] |
|**campaignType** | **String** | Type of campaign. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the campaign can be updated with new vouchers after campaign creation. - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method). -  &#x60;STATIC&#x60;: vouchers need to be manually published. |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |
|**voucher** | [**SimpleCampaignVoucher**](SimpleCampaignVoucher.md) |  |  [optional] |
|**luckyDraw** | [**LuckyDraw**](LuckyDraw.md) |  |  [optional] |
|**referralProgram** | [**ReferralProgram**](ReferralProgram.md) |  |  [optional] |
|**autoJoin** | **Boolean** | Indicates whether customers will be able to auto-join the campaign if any earning rule is fulfilled. |  [optional] |
|**joinOnce** | **Boolean** | If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once. |  [optional] |
|**active** | **Boolean** | Indicates whether the campaign is active. |  [optional] |
|**category** | **String** | Unique category name. |  [optional] |
|**categoryId** | **String** | The unique category ID that this campaign belongs to. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |  [optional] |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a campaign. The metadata object stores all custom attributes assigned to the campaign. |  [optional] |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is inactive *before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is inactive *after* this date. |  [optional] |
|**description** | **String** | An optional field to keep extra textual information about the campaign such as a campaign description and details. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was created. Timestamp is presented in the ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was updated in the ISO 8601 format. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the campaign. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |
| STATIC | &quot;STATIC&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |



