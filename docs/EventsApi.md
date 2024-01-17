# EventsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trackCustomEvent**](EventsApi.md#trackCustomEvent) | **POST** /v1/events | Track Custom Event |
| [**trackCustomEventClientSide**](EventsApi.md#trackCustomEventClientSide) | **POST** /client/v1/events | Track Custom Event (client-side) |


<a id="trackCustomEvent"></a>
# **trackCustomEvent**
> EventsCreateResponseBody trackCustomEvent(eventsCreateRequestBody)

Track Custom Event

To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    EventsCreateRequestBody eventsCreateRequestBody = new EventsCreateRequestBody(); // EventsCreateRequestBody | Specify the details of the custom event.
    try {
      EventsCreateResponseBody result = apiInstance.trackCustomEvent(eventsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#trackCustomEvent");
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
| **eventsCreateRequestBody** | [**EventsCreateRequestBody**](EventsCreateRequestBody.md)| Specify the details of the custom event. | [optional] |

### Return type

[**EventsCreateResponseBody**](EventsCreateResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the event type if the event was received by the application. |  -  |

<a id="trackCustomEventClientSide"></a>
# **trackCustomEventClientSide**
> ClientEventsCreateResponseBody trackCustomEventClientSide(origin, clientEventsCreateRequestBody)

Track Custom Event (client-side)

To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id-1
    ApiKeyAuth X-Client-Application-Id-1 = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id-1");
    X-Client-Application-Id-1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id-1.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token-1
    ApiKeyAuth X-Client-Token-1 = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token-1");
    X-Client-Token-1.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token-1.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientEventsCreateRequestBody clientEventsCreateRequestBody = new ClientEventsCreateRequestBody(); // ClientEventsCreateRequestBody | Specify the details of the custom event.
    try {
      ClientEventsCreateResponseBody result = apiInstance.trackCustomEventClientSide(origin, clientEventsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#trackCustomEventClientSide");
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
| **origin** | **String**| Indicates the origin (scheme, hostname, and port). | |
| **clientEventsCreateRequestBody** | [**ClientEventsCreateRequestBody**](ClientEventsCreateRequestBody.md)| Specify the details of the custom event. | [optional] |

### Return type

[**ClientEventsCreateResponseBody**](ClientEventsCreateResponseBody.md)

### Authorization

[X-Client-Application-Id-1](../README.md#X-Client-Application-Id-1), [X-Client-Token-1](../README.md#X-Client-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the event type if the event was received by the application. |  -  |

