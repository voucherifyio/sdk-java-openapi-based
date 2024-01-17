# SegmentsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSegment**](SegmentsApi.md#deleteSegment) | **DELETE** /v1/segments/{segmentId} | Delete Segment |


<a id="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(segmentId)

Delete Segment

This method deletes a customer segment.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id-1
    ApiKeyAuth X-App-Id-1 = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id-1");
    X-App-Id-1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id-1.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token-1
    ApiKeyAuth X-App-Token-1 = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token-1");
    X-App-Token-1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token-1.setApiKeyPrefix("Token");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    String segmentId = "segmentId_example"; // String | A unique customer segment ID.
    try {
      apiInstance.deleteSegment(segmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **segmentId** | **String**| A unique customer segment ID. | |

### Return type

null (empty response body)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

