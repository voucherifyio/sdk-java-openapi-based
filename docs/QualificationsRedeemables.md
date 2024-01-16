

# QualificationsRedeemables

List of redeemables for examine qualification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by JSON. Default is &#x60;list&#x60;. |  |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of qualified redeemables. |  |
|**data** | [**List&lt;QualificationsRedeemable&gt;**](QualificationsRedeemable.md) | Array of qualified redeemables. |  |
|**total** | **Integer** | The number of redeemables returned in the API request. |  |
|**hasMore** | **Boolean** | As results are always limited, the &#x60;has_more&#x60; flag indicates whether there are more records for given parameters. This let&#39;s you know if you are able to run another request (with different options) to get more records returned in the results. |  |
|**moreStartingAfter** | **OffsetDateTime** | Timestamp representing the date and time to use in starting_after cursor to get more redeemables. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |



