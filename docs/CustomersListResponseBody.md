

# CustomersListResponseBody

Response body schema for **GET** `/customers`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | The type of object represented by JSON. This object stores information about customers in a dictionary. |  |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of customer objects. |  |
|**customers** | [**List&lt;CustomerWithSummaryLoyaltyReferrals&gt;**](CustomerWithSummaryLoyaltyReferrals.md) | Contains array of customer objects. |  |
|**total** | **Integer** | Total number of customers. |  |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates whether there are more records for given filter parameters. This let&#39;s you know if you are able to run another request (with a different end date filter) to get more records returned in the results. |  [optional] |



