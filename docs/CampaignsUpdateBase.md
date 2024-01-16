

# CampaignsUpdateBase

Base body schema for creating a campaign using **PUT** `/campaigns`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |  [optional] |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date. |  [optional] |
|**validityTimeframe** | [**CampaignBaseValidityTimeframe**](CampaignBaseValidityTimeframe.md) |  |  [optional] |
|**validityDayOfWeek** | **List&lt;Integer&gt;** | Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60;  Sunday   - &#x60;1&#x60;  Monday   - &#x60;2&#x60;  Tuesday   - &#x60;3&#x60;  Wednesday   - &#x60;4&#x60;  Thursday   - &#x60;5&#x60;  Friday   - &#x60;6&#x60;  Saturday   |  [optional] |
|**description** | **String** | An optional field to keep any extra textual information about the campaign such as a campaign description and details. |  [optional] |
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |  [optional] |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format. |  [optional] |
|**unsetMetadataFields** | **List&lt;String&gt;** | Determine which metadata should be removed from campaign. |  [optional] |
|**categoryId** | **String** | Unique category ID that this campaign belongs to. Either pass this parameter OR the &#x60;category&#x60;. |  [optional] |



