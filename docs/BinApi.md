# BinApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBinEntry**](BinApi.md#deleteBinEntry) | **DELETE** /v1/trash-bin/{binEntryId} | Delete Bin Entry |
| [**listBinEntries**](BinApi.md#listBinEntries) | **GET** /v1/trash-bin | List Bin Entries |


<a id="deleteBinEntry"></a>
# **deleteBinEntry**
> deleteBinEntry(binEntryId)

Delete Bin Entry

Deletes permanently a bin entry with a given ID.The following resources can be moved to the bin and permanently deleted: - campaigns - vouchers - products - SKUs    To use this endpoint and delete a given resource type, you must have the following permissions: - &#x60;vouchers.delete&#x60; to delete a voucher, - &#x60;campaigns.delete&#x60; to delete a campaign, - &#x60;products.delete&#x60; to delete a product or SKU.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.BinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

    BinApi apiInstance = new BinApi(defaultClient);
    String binEntryId = "binEntryId_example"; // String | Provide the unique identifier of the bin entry.
    try {
      apiInstance.deleteBinEntry(binEntryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinApi#deleteBinEntry");
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
| **binEntryId** | **String**| Provide the unique identifier of the bin entry. | |

### Return type

null (empty response body)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

<a id="listBinEntries"></a>
# **listBinEntries**
> TrashBinListResponseBody listBinEntries(limit, order, startingAfterId, filters)

List Bin Entries

Retrieves a list of resources moved to the bin. The following resources can be moved to the bin: - campaigns - vouchers - products - SKUs  To use this endpoint, you must have the following permissions: - &#x60;vouchers.read&#x60; - &#x60;campaigns.read&#x60; - &#x60;products.read&#x60;

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.BinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

    BinApi apiInstance = new BinApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListBin order = ParameterOrderListBin.fromValue("created_at"); // ParameterOrderListBin | Orders the bin entries according the date and time when they were moved to the bin or according to the bin entry ID. The dash `-` preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after the given ID.
    ParameterFiltersListBin filters = new ParameterFiltersListBin(); // ParameterFiltersListBin | Filters for listing bin entries.
    try {
      TrashBinListResponseBody result = apiInstance.listBinEntries(limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinApi#listBinEntries");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. | [optional] |
| **order** | [**ParameterOrderListBin**](.md)| Orders the bin entries according the date and time when they were moved to the bin or according to the bin entry ID. The dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. | [optional] [enum: created_at, -created_at, id, -id] |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after the given ID. | [optional] |
| **filters** | [**ParameterFiltersListBin**](.md)| Filters for listing bin entries. | [optional] |

### Return type

[**TrashBinListResponseBody**](TrashBinListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all the bin entries matching the query parameters. |  -  |

