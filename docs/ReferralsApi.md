# ReferralsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**referralsCodeHolders**](ReferralsApi.md#referralsCodeHolders) | **GET** /v1/referrals/{campaignId}/members/{memberId}/holders | List Referral Code Holders [Beta] |
| [**referralsCodeHolders1**](ReferralsApi.md#referralsCodeHolders1) | **GET** /v1/referrals/members/{memberId}/holders | List Referral Code Holders [Beta] |


<a id="referralsCodeHolders"></a>
# **referralsCodeHolders**
> ReferralsRedeemableHoldersListResponseBody referralsCodeHolders(campaignId, memberId, limit, order, startingAfterId, filters)

List Referral Code Holders [Beta]

Retrieves the holders of the referral code from a referral campaign. &gt;🚧 User Permissions &gt; &gt;The users of this endpoint must have the Read Customers (&#x60;customers.details.read&#x60;) permission granted.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ReferralsApi;

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

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique identifier of a referral program campaign.
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListRedeemables order = ParameterOrderListRedeemables.fromValue("created_at"); // ParameterOrderListRedeemables | Sorts the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after the given ID.
    ParameterFiltersListReferralsRedeemableHolders filters = new ParameterFiltersListReferralsRedeemableHolders(); // ParameterFiltersListReferralsRedeemableHolders | Filters for listing customer redeemables.
    try {
      ReferralsRedeemableHoldersListResponseBody result = apiInstance.referralsCodeHolders(campaignId, memberId, limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsCodeHolders");
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
| **campaignId** | **String**| Unique identifier of a referral program campaign. | |
| **memberId** | **String**| Unique referral code or its identifier. | |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. | [optional] |
| **order** | [**ParameterOrderListRedeemables**](.md)| Sorts the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. | [optional] [enum: created_at, -created_at, id, -id] |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after the given ID. | [optional] |
| **filters** | [**ParameterFiltersListReferralsRedeemableHolders**](.md)| Filters for listing customer redeemables. | [optional] |

### Return type

[**ReferralsRedeemableHoldersListResponseBody**](ReferralsRedeemableHoldersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the holders of the redeemable that is assigned to the referral campaign. |  -  |

<a id="referralsCodeHolders1"></a>
# **referralsCodeHolders1**
> ReferralsRedeemableHoldersListResponseBody referralsCodeHolders1(memberId, limit, order, startingAfterId, filters)

List Referral Code Holders [Beta]

Retrieves the holders of the referral code from a referral campaign. &gt;🚧 User Permissions &gt; &gt;The users of this endpoint must have the Read Customers (&#x60;customers.details.read&#x60;) permission granted.  &gt; 📘 Alternative endpoint &gt; &gt;This endpoint is an alternative to this [List Member Holders endpoint](ref:referrals-member-holders). The URL was re-designed to retrieve the referral member holders without providing the &#x60;campaignId&#x60; as a path paremeter.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ReferralsApi;

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

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListRedeemables order = ParameterOrderListRedeemables.fromValue("created_at"); // ParameterOrderListRedeemables | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after the given ID.
    ParameterFiltersListReferralsRedeemableHolders filters = new ParameterFiltersListReferralsRedeemableHolders(); // ParameterFiltersListReferralsRedeemableHolders | Filters for listing customer redeemables.
    try {
      ReferralsRedeemableHoldersListResponseBody result = apiInstance.referralsCodeHolders1(memberId, limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsCodeHolders1");
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
| **memberId** | **String**| Unique referral code or its identifier. | |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. | [optional] |
| **order** | [**ParameterOrderListRedeemables**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. | [optional] [enum: created_at, -created_at, id, -id] |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after the given ID. | [optional] |
| **filters** | [**ParameterFiltersListReferralsRedeemableHolders**](.md)| Filters for listing customer redeemables. | [optional] |

### Return type

[**ReferralsRedeemableHoldersListResponseBody**](ReferralsRedeemableHoldersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the holders of the redeemable that is assigned to the referral campaign. |  -  |

