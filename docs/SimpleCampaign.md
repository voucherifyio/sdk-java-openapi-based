

# SimpleCampaign

Request body schema for creating a discount voucher campaign using **POST** `/campaigns`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Campaign name. |  [optional] |
|**name** | **String** | Campaign name. |  [optional] |
|**campaignType** | **String** | Type of campaign. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the campaign can be updated with new vouchers after campaign creation. - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method). -  &#x60;STATIC&#x60;: vouchers need to be manually published. |  [optional] |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |  [optional] |
|**voucher** | **Object** |  |  [optional] |
|**luckyDraw** | **Object** |  |  [optional] |
|**referralProgram** | [**ReferralProgram**](ReferralProgram.md) |  |  [optional] |
|**autoJoin** | **Boolean** | Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled. |  [optional] |
|**joinOnce** | **Boolean** | If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once. |  [optional] |
|**active** | **Boolean** | Indicates whether campaign is active |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was created in ISO 8601 format. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. This object stores information about the campaign. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |
| STATIC | &quot;STATIC&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |



