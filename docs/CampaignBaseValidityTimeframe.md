

# CampaignBaseValidityTimeframe

Set recurrent time periods when the campaign is valid. For example, valid for 1 hour every other day.`start_date` **required** when including the `validity_timeframe`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **String** | Defines the intervening time between two time points in ISO 8601 format, expressed as a duration. For example, a campaign with an &#x60;interval&#x60; of &#x60;P2D&#x60; will be active every other day. |  [optional] |
|**duration** | **String** | Defines the amount of time the campaign will be active in ISO 8601 format. For example, a campaign with a &#x60;duration&#x60; of &#x60;P1D&#x60; will be valid for a duration of one day. |  [optional] |



