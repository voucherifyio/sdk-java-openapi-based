

# RedemptionsListResponseBody

Response body schema for **GET** `/redemptions`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | The type of object represented by JSON. This object stores information about redemptions in a dictionary. |  |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of redemption objects. |  |
|**redemptions** | [**List&lt;RedemptionsListResponseBodyRedemptionsItem&gt;**](RedemptionsListResponseBodyRedemptionsItem.md) |  |  |
|**total** | **Integer** | Total number of redemptions. |  |



