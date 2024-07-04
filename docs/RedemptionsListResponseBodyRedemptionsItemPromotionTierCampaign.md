

# RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique campaign ID. |  [optional] |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date. |  [optional] |
|**validityTimeframe** | [**RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe**](RedemptionsListResponseBodyRedemptionsItemPromotionTierCampaignValidityTimeframe.md) |  |  [optional] |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |  [optional] |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |  [optional] |
|**active** | **Boolean** | A flag indicating whether the campaign is active or not active. A campaign can be disabled even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60; using the &lt;!-- [Disable Campaign](OpenAPI.json/paths/~1campaigns~1{campaignId}~1disable) --&gt;[Disable Campaign](ref:disable-campaign) endpoint.    - &#x60;true&#x60; indicates an *active* campaign - &#x60;false&#x60; indicates an *inactive* campaign |  [optional] |
|**categoryId** | **String** | Unique category ID that this campaign belongs to. |  [optional] |
|**_object** | **String** | The type of the object represented by the campaign object. This object stores information about the campaign. |  [optional] |



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



