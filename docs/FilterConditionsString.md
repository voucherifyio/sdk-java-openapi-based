

# FilterConditionsString

Data filters used to narrow the data records to be returned in the result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$in** | **List&lt;String&gt;** | Array of resource values that should be included in the results (multiple values). |  [optional] |
|**$notIn** | **List&lt;String&gt;** | Array of resource values that should be included in the results (multiple values). |  [optional] |
|**$is** | **String** | Value is exactly this value (single value). |  [optional] |
|**$isNot** | **String** | Results omit this value (single value). |  [optional] |
|**$hasValue** | **String** | Value is NOT null. The value for this parameter is an empty string. |  [optional] |
|**$isUnknown** | **String** | Value is null. The value for this parameter is an empty string. |  [optional] |
|**$startsWith** | **String** | Value starts with the specified string. |  [optional] |
|**$endsWith** | **String** | Value ends with the specified string. |  [optional] |



