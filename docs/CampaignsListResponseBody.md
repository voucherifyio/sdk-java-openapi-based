

# CampaignsListResponseBody

Schema model for **GET** `/campaigns`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | The type of object represented by JSON. This object stores information about campaigns in a dictionary. |  [optional] |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of campaign objects. |  [optional] |
|**campaigns** | [**List&lt;CampaignBase&gt;**](CampaignBase.md) | Contains array of campaign objects. |  [optional] |
|**total** | **Integer** | Total number of campaigns. |  [optional] |



