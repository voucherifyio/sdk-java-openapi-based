# ValidationRulesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createValidationRules**](ValidationRulesApi.md#createValidationRules) | **POST** /v1/validation-rules | Create Validation Rules |
| [**deleteValidationRuleAssignment**](ValidationRulesApi.md#deleteValidationRuleAssignment) | **DELETE** /v1/validation-rules/{validationRuleId}/assignments/{assignmentId} | Delete Validation Rule Assignment |
| [**deleteValidationRules**](ValidationRulesApi.md#deleteValidationRules) | **DELETE** /v1/validation-rules/{validationRuleId} | Delete Validation Rule |
| [**getValidationRule**](ValidationRulesApi.md#getValidationRule) | **GET** /v1/validation-rules/{validationRuleId} | Get Validation Rule |
| [**listValidationRuleAssignments**](ValidationRulesApi.md#listValidationRuleAssignments) | **GET** /v1/validation-rules/{validationRuleId}/assignments | List Validation Rule Assignments |
| [**listValidationRules**](ValidationRulesApi.md#listValidationRules) | **GET** /v1/validation-rules | List Validation Rules |
| [**listValidationRulesAssignments**](ValidationRulesApi.md#listValidationRulesAssignments) | **GET** /v1/validation-rules-assignments | List Validation Rules&#39; Assignment(s) |
| [**updateValidationRule**](ValidationRulesApi.md#updateValidationRule) | **PUT** /v1/validation-rules/{validationRuleId} | Update Validation Rule |


<a id="createValidationRules"></a>
# **createValidationRules**
> ValidationRulesCreateResponseBody createValidationRules(validationRulesCreateRequestBody)

Create Validation Rules

Create validation rules.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    ValidationRulesCreateRequestBody validationRulesCreateRequestBody = new ValidationRulesCreateRequestBody(); // ValidationRulesCreateRequestBody | Specify the validation rules parameters.
    try {
      ValidationRulesCreateResponseBody result = apiInstance.createValidationRules(validationRulesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#createValidationRules");
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
| **validationRulesCreateRequestBody** | [**ValidationRulesCreateRequestBody**](ValidationRulesCreateRequestBody.md)| Specify the validation rules parameters. | [optional] |

### Return type

[**ValidationRulesCreateResponseBody**](ValidationRulesCreateResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a validation rule object. |  -  |

<a id="deleteValidationRuleAssignment"></a>
# **deleteValidationRuleAssignment**
> deleteValidationRuleAssignment(validationRuleId, assignmentId)

Delete Validation Rule Assignment

This method deletes a validation rule assignment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    String assignmentId = "assignmentId_example"; // String | A unique validation rule assignment ID.
    try {
      apiInstance.deleteValidationRuleAssignment(validationRuleId, assignmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#deleteValidationRuleAssignment");
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
| **validationRuleId** | **String**| A unique validation rule ID. | |
| **assignmentId** | **String**| A unique validation rule assignment ID. | |

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

<a id="deleteValidationRules"></a>
# **deleteValidationRules**
> deleteValidationRules(validationRuleId)

Delete Validation Rule

This method deletes a validation rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    try {
      apiInstance.deleteValidationRules(validationRuleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#deleteValidationRules");
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
| **validationRuleId** | **String**| A unique validation rule ID. | |

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

<a id="getValidationRule"></a>
# **getValidationRule**
> ValidationRulesGetResponseBody getValidationRule(validationRuleId)

Get Validation Rule

Retrieve the details of a validation rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    try {
      ValidationRulesGetResponseBody result = apiInstance.getValidationRule(validationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#getValidationRule");
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
| **validationRuleId** | **String**| A unique validation rule ID. | |

### Return type

[**ValidationRulesGetResponseBody**](ValidationRulesGetResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the validation rule object. |  -  |

<a id="listValidationRuleAssignments"></a>
# **listValidationRuleAssignments**
> ValidationRulesAssignmentsListResponseBody listValidationRuleAssignments(validationRuleId, limit, page, order)

List Validation Rule Assignments

Retrieve validation rule assignments for a specific validation rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | Unique validation rule ID.
    Integer limit = 56; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    Integer page = 56; // Integer | Which page of results to return.
    ParameterOrderListValidationRuleAssignments order = ParameterOrderListValidationRuleAssignments.fromValue("created_at"); // ParameterOrderListValidationRuleAssignments | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    try {
      ValidationRulesAssignmentsListResponseBody result = apiInstance.listValidationRuleAssignments(validationRuleId, limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRuleAssignments");
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
| **validationRuleId** | **String**| Unique validation rule ID. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100 items. | [optional] |
| **page** | **Integer**| Which page of results to return. | [optional] |
| **order** | [**ParameterOrderListValidationRuleAssignments**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. | [optional] [enum: created_at, -created_at] |

### Return type

[**ValidationRulesAssignmentsListResponseBody**](ValidationRulesAssignmentsListResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of validation rule assignments.  If the validation rule ID provided in the path parameter cannot be found, the endpoint will return an empty &#x60;data&#x60; array and a total of &#x60;0&#x60;. |  -  |

<a id="listValidationRules"></a>
# **listValidationRules**
> ValidationRulesListResponseBody listValidationRules(limit, page, order, startDate, endDate)

List Validation Rules

Retrieve validation rules.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    Integer limit = 56; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    Integer page = 56; // Integer | Which page of results to return.
    ParameterOrderListValidationRules order = ParameterOrderListValidationRules.fromValue("created_at"); // ParameterOrderListValidationRules | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must start on. Represented in ISO 8601 format.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    try {
      ValidationRulesListResponseBody result = apiInstance.listValidationRules(limit, page, order, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRules");
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
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100 items. | [optional] |
| **page** | **Integer**| Which page of results to return. | [optional] |
| **order** | [**ParameterOrderListValidationRules**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. | [optional] [enum: created_at, -created_at, updated_at, -updated_at, name, -name] |
| **startDate** | **OffsetDateTime**| Timestamp representing the date and time which results must start on. Represented in ISO 8601 format. | [optional] |
| **endDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. | [optional] |

### Return type

[**ValidationRulesListResponseBody**](ValidationRulesListResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of validation rules. |  -  |

<a id="listValidationRulesAssignments"></a>
# **listValidationRulesAssignments**
> ValidationRulesAssignmentsListResponseBody listValidationRulesAssignments(relatedObjectId, rule, page, limit, order)

List Validation Rules&#39; Assignment(s)

List all validation rules&#39; assignments or filter the results using the related object ID or the validation rule ID query parameters.   ## How to retrieve specific validation rule assignments(s)  ### Related object ID  To find an assignment for a particular resource, you can use the ID of the object to which the validation rule was assigned. This could be, for example, an ID of a: voucher, campaign, distribution, reward assignment, earning rule, promotion tier.     &lt;!-- title: \&quot;Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;curl curl -X GET \\   -H \&quot;X-App-Id: c70a6f00-cf91-4756-9df5-47628850002b\&quot; \\   -H \&quot;X-App-Token: 3266b9f8-e246-4f79-bdf0-833929b1380c\&quot; \\   -H \&quot;Content-Type: application/json\&quot; \\   https://api.voucherify.io/v1/validation-rules-assignments?related_object_id&#x3D;promo_kJliy076IuJYtuYWSHE9fSuT &#x60;&#x60;&#x60; &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;object\&quot;: \&quot;list\&quot;,     \&quot;data_ref\&quot;: \&quot;data\&quot;,     \&quot;data\&quot;: [         {             \&quot;id\&quot;: \&quot;asgm_tZaqxeO8gP4q91jG\&quot;,             \&quot;rule_id\&quot;: \&quot;val_WB6ETAiFztw5\&quot;,             \&quot;related_object_id\&quot;: \&quot;promo_kJliy076IuJYtuYWSHE9fSuT\&quot;,             \&quot;related_object_type\&quot;: \&quot;promotion_tier\&quot;,             \&quot;created_at\&quot;: \&quot;2022-08-10T10:30:39.986Z\&quot;,             \&quot;object\&quot;: \&quot;validation_rules_assignment\&quot;         }     ],     \&quot;total\&quot;: 1 } &#x60;&#x60;&#x60;  ### Validation rule ID  You can use the validation rule ID to find assignment(s) for a specific validation rule.   &lt;!-- title: \&quot;Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;curl curl -X GET \\   -H \&quot;X-App-Id: c70a6f00-cf91-4756-9df5-47628850002b\&quot; \\   -H \&quot;X-App-Token: 3266b9f8-e246-4f79-bdf0-833929b1380c\&quot; \\   -H \&quot;Content-Type: application/json\&quot; \\   https://api.voucherify.io/v1/validation-rules-assignments?rule&#x3D;val_ZEZmA9oit8aU &#x60;&#x60;&#x60; &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;object\&quot;: \&quot;list\&quot;,     \&quot;data_ref\&quot;: \&quot;data\&quot;,     \&quot;data\&quot;: [         {             \&quot;id\&quot;: \&quot;asgm_vef0G6d9Al0rABxq\&quot;,             \&quot;rule_id\&quot;: \&quot;val_ZEZmA9oit8aU\&quot;,             \&quot;related_object_id\&quot;: \&quot;camp_rRsfatlwN7unSeUIJDCYedal\&quot;,             \&quot;related_object_type\&quot;: \&quot;campaign\&quot;,             \&quot;created_at\&quot;: \&quot;2022-06-29T11:43:52.953Z\&quot;,             \&quot;object\&quot;: \&quot;validation_rules_assignment\&quot;         },         {             \&quot;id\&quot;: \&quot;asgm_sFV4wEFvldwIvgfb\&quot;,             \&quot;rule_id\&quot;: \&quot;val_ZEZmA9oit8aU\&quot;,             \&quot;related_object_id\&quot;: \&quot;distr_9QKI02wqgjWyvZXeQkFEPmkkYe\&quot;,             \&quot;related_object_type\&quot;: \&quot;distribution\&quot;,             \&quot;created_at\&quot;: \&quot;2022-06-29T11:41:07.680Z\&quot;,             \&quot;object\&quot;: \&quot;validation_rules_assignment\&quot;         },         {             \&quot;id\&quot;: \&quot;asgm_69Qifyv6UZynFIIQ\&quot;,             \&quot;rule_id\&quot;: \&quot;val_ZEZmA9oit8aU\&quot;,             \&quot;related_object_id\&quot;: \&quot;promo_g83qUzYZpfX0OMAFOVoQuOYG\&quot;,             \&quot;related_object_type\&quot;: \&quot;promotion_tier\&quot;,             \&quot;created_at\&quot;: \&quot;2022-06-29T11:29:41.906Z\&quot;,             \&quot;object\&quot;: \&quot;validation_rules_assignment\&quot;         }     ],     \&quot;total\&quot;: 3 } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String relatedObjectId = "relatedObjectId_example"; // String | The resource ID to which the validation rule was assigned; this could be, for example, a resource ID of a voucher, campaign, earning rule, reward assignment, promotion tier, or distribution.
    String rule = "rule_example"; // String | Validation rule ID.
    Integer page = 56; // Integer | Which page of results to return.
    Integer limit = 56; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    String order = "order_example"; // String | Sorts the results using one of the filtering options: `-created_at`, `created_at`, where the dash `-` preceding a sorting option means sorting in a descending order.
    try {
      ValidationRulesAssignmentsListResponseBody result = apiInstance.listValidationRulesAssignments(relatedObjectId, rule, page, limit, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRulesAssignments");
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
| **relatedObjectId** | **String**| The resource ID to which the validation rule was assigned; this could be, for example, a resource ID of a voucher, campaign, earning rule, reward assignment, promotion tier, or distribution. | [optional] |
| **rule** | **String**| Validation rule ID. | [optional] |
| **page** | **Integer**| Which page of results to return. | [optional] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100 items. | [optional] |
| **order** | **String**| Sorts the results using one of the filtering options: &#x60;-created_at&#x60;, &#x60;created_at&#x60;, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. | [optional] |

### Return type

[**ValidationRulesAssignmentsListResponseBody**](ValidationRulesAssignmentsListResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a data property that contains an array of validation rule assignments. Each entry in the array is a separate object. If no more validation rule assignments are available, the resulting array will be empty. The result can be narrowed down according to default filters. |  -  |

<a id="updateValidationRule"></a>
# **updateValidationRule**
> ValidationRulesUpdateResponseBody updateValidationRule(validationRuleId, validationRulesUpdateRequestBody)

Update Validation Rule

Update validation rule parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    ValidationRulesUpdateRequestBody validationRulesUpdateRequestBody = new ValidationRulesUpdateRequestBody(); // ValidationRulesUpdateRequestBody | Specify the parameters to be updated.
    try {
      ValidationRulesUpdateResponseBody result = apiInstance.updateValidationRule(validationRuleId, validationRulesUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#updateValidationRule");
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
| **validationRuleId** | **String**| A unique validation rule ID. | |
| **validationRulesUpdateRequestBody** | [**ValidationRulesUpdateRequestBody**](ValidationRulesUpdateRequestBody.md)| Specify the parameters to be updated. | [optional] |

### Return type

[**ValidationRulesUpdateResponseBody**](ValidationRulesUpdateResponseBody.md)

### Authorization

[X-App-Id-1](../README.md#X-App-Id-1), [X-App-Token-1](../README.md#X-App-Token-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the validation rule object with the updated parameters. |  -  |

