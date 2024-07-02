

# CustomersActivitiesListResponseBody

Response body schema for **GET** `/customers/{customerId}/activities`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | The type of the object represented by JSON. This object stores information about customer activities in a dictionary. |  |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of customer activity objects. |  |
|**data** | [**List&lt;CustomerActivity&gt;**](CustomerActivity.md) | Array of customer activity objects. |  |
|**total** | **Integer** | Total number of customer activities. |  |



