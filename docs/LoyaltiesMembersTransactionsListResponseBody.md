

# LoyaltiesMembersTransactionsListResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/members/{memberId}/transactions` and `/loyalties/members/{memberId}/transactions`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. |  |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of transaction objects. |  |
|**data** | [**List&lt;LoyaltyCardTransaction&gt;**](LoyaltyCardTransaction.md) | A dictionary that contains an array of transactions. Each entry in the array is a separate transaction object. |  |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the has_more flag indicates whether there are more records for given filter parameters. This let&#39;s you know if you are able to run another request (with a different page or a different start date filter) to get more records returned in the results. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |



