# StackableDiscountsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**redeemStackedDiscounts**](StackableDiscountsApi.md#redeemStackedDiscounts) | **POST** /v1/redemptions | Redeem Stackable Discounts |
| [**redeemStackedDiscountsClientSide**](StackableDiscountsApi.md#redeemStackedDiscountsClientSide) | **POST** /client/v1/redemptions | Redeem Stackable Discounts (client-side) |
| [**rollbackStackedRedemptions**](StackableDiscountsApi.md#rollbackStackedRedemptions) | **POST** /v1/redemptions/{parentRedemptionId}/rollbacks | Rollback Stackable Redemptions |
| [**validateStackedDiscounts**](StackableDiscountsApi.md#validateStackedDiscounts) | **POST** /v1/validations | Validate Stackable Discounts |
| [**validateStackedDiscountsClientSide**](StackableDiscountsApi.md#validateStackedDiscountsClientSide) | **POST** /client/v1/validations | Validate Stackable Discounts (client-side) |


<a id="redeemStackedDiscounts"></a>
# **redeemStackedDiscounts**
> RedemptionsRedeemResponseBody redeemStackedDiscounts(redemptionsRedeemRequestBody)

Redeem Stackable Discounts

## How API returns calculated discounts and order amounts in the response  In the table below, you can see the logic the API follows to calculate discounts and amounts:  | **Field** | **Calculation** | **Description** | |:---|:---|:---| | amount | N/A | This field shows the order amount before applying any discount | | total_amount | &#x60;total_amount&#x60; &#x3D; &#x60;amount&#x60; - &#x60;total_discount_amount&#x60; | This field shows the order amount after applying all the discounts | | discount_amount | &#x60;discount_amount&#x60; &#x3D; &#x60;previous_discount_amount&#x60; + &#x60;applied_discount_amount&#x60; | This field sums up all order-level discounts up to and including the specific discount being calculated for the stacked redemption. | | items_discount_amount | sum(items, i &#x3D;&gt; i.discount_amount) | This field sums up all product-specific discounts | | total_discount_amount | &#x60;total_discount_amount&#x60; &#x3D; &#x60;discount_amount&#x60; + &#x60;items_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts | | applied_discount_amount | N/A | This field shows the order-level discount applied in a particular request | | items_applied_discount_amount | sum(items, i &#x3D;&gt; i.applied_discount_amount) | This field sums up all product-specific discounts applied in a particular request | | total_applied_discount_amount | &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts applied in a particular request |  &lt;!-- theme: info --&gt; &gt; 📘 Rollbacks &gt; &gt; You can&#39;t roll back a child redemption. When you call rollback on a stacked redemption, all child redemptions will be rolled back. You need to refer to a parent redemption ID in your &lt;!-- [rollback request](OpenAPI.json/paths/~1redemptions~1{parentRedemptionId}~1rollbacks/post) --&gt;[rollback request](ref:rollback-stacked-redemptions).      &lt;!-- theme: info --&gt; &gt; 📘 Also available on client-side &gt; &gt; This method is also accessible through public keys which you can use in client-side​ apps: mobile and web browser apps. Go to the dedicated [endpoint](ref:redeem-stacked-discounts-client-side) to learn more. &gt; - Use &#x60;X-Client-Application-Id&#x60; as the application ID header. &gt; - Use &#x60;X-Client-Token&#x60; as the appliction secret key header. &gt; - Use client-side base URL. &gt; - Use an &#x60;origin&#x60; header for your custom domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StackableDiscountsApi;

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

    StackableDiscountsApi apiInstance = new StackableDiscountsApi(defaultClient);
    RedemptionsRedeemRequestBody redemptionsRedeemRequestBody = new RedemptionsRedeemRequestBody(); // RedemptionsRedeemRequestBody | 
    try {
      RedemptionsRedeemResponseBody result = apiInstance.redeemStackedDiscounts(redemptionsRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StackableDiscountsApi#redeemStackedDiscounts");
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
| **redemptionsRedeemRequestBody** | [**RedemptionsRedeemRequestBody**](RedemptionsRedeemRequestBody.md)|  | [optional] |

### Return type

[**RedemptionsRedeemResponseBody**](RedemptionsRedeemResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid redemption. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

<a id="redeemStackedDiscountsClientSide"></a>
# **redeemStackedDiscountsClientSide**
> ClientRedemptionsRedeemResponseBody redeemStackedDiscountsClientSide(origin, clientRedemptionsRedeemRequestBody)

Redeem Stackable Discounts (client-side)

This method is accessible through public keys which you can use in client side requests coming from mobile and web browser applications.  ## How API returns calculated discounts and order amounts in the response  In the table below, you can see the logic the API follows to calculate discounts and amounts:  | **Field** | **Calculation** | **Description** | |:---|:---|:---| | amount | N/A | This field shows the order amount before applying any discount | | total_amount | &#x60;total_amount&#x60; &#x3D; &#x60;amount&#x60; - &#x60;total_discount_amount&#x60; | This field shows the order amount after applying all the discounts | | discount_amount | &#x60;discount_amount&#x60; &#x3D; &#x60;previous_discount_amount&#x60; + &#x60;applied_discount_amount&#x60; | This field sums up all order-level discounts up to and including the specific discount being calculated for the stacked redemption. | | items_discount_amount | sum(items, i &#x3D;&gt; i.discount_amount) | This field sums up all product-specific discounts | | total_discount_amount | &#x60;total_discount_amount&#x60; &#x3D; &#x60;discount_amount&#x60; + &#x60;items_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts | | applied_discount_amount | N/A | This field shows the order-level discount applied in a particular request | | items_applied_discount_amount | sum(items, i &#x3D;&gt; i.applied_discount_amount) | This field sums up all product-specific discounts applied in a particular request | | total_applied_discount_amount | &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts applied in a particular request |  &lt;!-- theme: info --&gt; &gt; 📘 Rollbacks &gt; &gt; You can&#39;t roll back a child redemption. When you call rollback on a stacked redemption, all child redemptions will be rolled back. You need to refer to a parent redemption ID in your &lt;!-- [rollback request](OpenAPI.json/paths/~1redemptions~1{parentRedemptionId}~1rollbacks/post) --&gt;[rollback request](ref:rollback-stacked-redemptions).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StackableDiscountsApi;

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

    StackableDiscountsApi apiInstance = new StackableDiscountsApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientRedemptionsRedeemRequestBody clientRedemptionsRedeemRequestBody = new ClientRedemptionsRedeemRequestBody(); // ClientRedemptionsRedeemRequestBody | 
    try {
      ClientRedemptionsRedeemResponseBody result = apiInstance.redeemStackedDiscountsClientSide(origin, clientRedemptionsRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StackableDiscountsApi#redeemStackedDiscountsClientSide");
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
| **clientRedemptionsRedeemRequestBody** | [**ClientRedemptionsRedeemRequestBody**](ClientRedemptionsRedeemRequestBody.md)|  | [optional] |

### Return type

[**ClientRedemptionsRedeemResponseBody**](ClientRedemptionsRedeemResponseBody.md)

### Authorization

[X-Client-Application-Id-1](../README.md#X-Client-Application-Id-1), [X-Client-Token-1](../README.md#X-Client-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid redemption. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

<a id="rollbackStackedRedemptions"></a>
# **rollbackStackedRedemptions**
> RedemptionsRollbacksCreateResponseBody rollbackStackedRedemptions(parentRedemptionId, reason, trackingId, redemptionsRollbacksCreateRequestBody)

Rollback Stackable Redemptions

Rollback a stackable redemption. When you rollback a stacked redemption, all child redemptions will be rolled back. Provide the parent redemption ID as the path parameter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StackableDiscountsApi;

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

    StackableDiscountsApi apiInstance = new StackableDiscountsApi(defaultClient);
    String parentRedemptionId = "parentRedemptionId_example"; // String | Unique identifier of a parent redemption, e.g. `r_JQfm73zWSJFQxs3bGxweYjgm`.
    String reason = "reason_example"; // String | Reason for the rollback.
    String trackingId = "trackingId_example"; // String | Customer's `source_id`.
    RedemptionsRollbacksCreateRequestBody redemptionsRollbacksCreateRequestBody = new RedemptionsRollbacksCreateRequestBody(); // RedemptionsRollbacksCreateRequestBody | Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body.
    try {
      RedemptionsRollbacksCreateResponseBody result = apiInstance.rollbackStackedRedemptions(parentRedemptionId, reason, trackingId, redemptionsRollbacksCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StackableDiscountsApi#rollbackStackedRedemptions");
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
| **parentRedemptionId** | **String**| Unique identifier of a parent redemption, e.g. &#x60;r_JQfm73zWSJFQxs3bGxweYjgm&#x60;. | |
| **reason** | **String**| Reason for the rollback. | [optional] |
| **trackingId** | **String**| Customer&#39;s &#x60;source_id&#x60;. | [optional] |
| **redemptionsRollbacksCreateRequestBody** | [**RedemptionsRollbacksCreateRequestBody**](RedemptionsRollbacksCreateRequestBody.md)| Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body. | [optional] |

### Return type

[**RedemptionsRollbacksCreateResponseBody**](RedemptionsRollbacksCreateResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array with the individual redemption rollback results along with the parent rollback result and related order. |  -  |

<a id="validateStackedDiscounts"></a>
# **validateStackedDiscounts**
> ValidationsValidateResponseBody validateStackedDiscounts(validationsValidateRequestBody)

Validate Stackable Discounts

Verify redeemables provided in the request. This method is designed for server side integration which means that it is accessible only through private keys.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StackableDiscountsApi;

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

    StackableDiscountsApi apiInstance = new StackableDiscountsApi(defaultClient);
    ValidationsValidateRequestBody validationsValidateRequestBody = new ValidationsValidateRequestBody(); // ValidationsValidateRequestBody | 
    try {
      ValidationsValidateResponseBody result = apiInstance.validateStackedDiscounts(validationsValidateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StackableDiscountsApi#validateStackedDiscounts");
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
| **validationsValidateRequestBody** | [**ValidationsValidateRequestBody**](ValidationsValidateRequestBody.md)|  | [optional] |

### Return type

[**ValidationsValidateResponseBody**](ValidationsValidateResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid validation. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

<a id="validateStackedDiscountsClientSide"></a>
# **validateStackedDiscountsClientSide**
> ClientValidationsValidateResponseBody validateStackedDiscountsClientSide(origin, clientValidationsValidateRequestBody)

Validate Stackable Discounts (client-side)

Verify redeemables provided in the request. This method is accessible through public keys which you can use in client side requests coming from mobile and web browser applications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StackableDiscountsApi;

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

    StackableDiscountsApi apiInstance = new StackableDiscountsApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientValidationsValidateRequestBody clientValidationsValidateRequestBody = new ClientValidationsValidateRequestBody(); // ClientValidationsValidateRequestBody | 
    try {
      ClientValidationsValidateResponseBody result = apiInstance.validateStackedDiscountsClientSide(origin, clientValidationsValidateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StackableDiscountsApi#validateStackedDiscountsClientSide");
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
| **clientValidationsValidateRequestBody** | [**ClientValidationsValidateRequestBody**](ClientValidationsValidateRequestBody.md)|  | [optional] |

### Return type

[**ClientValidationsValidateResponseBody**](ClientValidationsValidateResponseBody.md)

### Authorization

[X-Client-Application-Id-1](../README.md#X-Client-Application-Id-1), [X-Client-Token-1](../README.md#X-Client-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid validation. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

