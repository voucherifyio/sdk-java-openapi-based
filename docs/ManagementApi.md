# ManagementApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignUser**](ManagementApi.md#assignUser) | **POST** /management/v1/projects/{projectId}/users | Assign User |
| [**createBrand**](ManagementApi.md#createBrand) | **POST** /management/v1/projects/{projectId}/branding | Create Brand |
| [**createCustomEventSchema**](ManagementApi.md#createCustomEventSchema) | **POST** /management/v1/projects/{projectId}/custom-event-schemas | Create Custom Event Schema |
| [**createMetadataSchema**](ManagementApi.md#createMetadataSchema) | **POST** /management/v1/projects/{projectId}/metadata-schemas | Create Metadata Schema |
| [**createProject**](ManagementApi.md#createProject) | **POST** /management/v1/projects | Create Project |
| [**createStackingRules**](ManagementApi.md#createStackingRules) | **POST** /management/v1/projects/{projectId}/stacking-rules | Create Stacking Rules |
| [**createWebhook**](ManagementApi.md#createWebhook) | **POST** /management/v1/projects/{projectId}/webhooks | Create Webhook |
| [**deleteBrand**](ManagementApi.md#deleteBrand) | **DELETE** /management/v1/projects/{projectId}/branding/{brandingId} | Delete Brand |
| [**deleteCustomEventSchema**](ManagementApi.md#deleteCustomEventSchema) | **DELETE** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Delete Custom Event Schema |
| [**deleteMetadataSchema**](ManagementApi.md#deleteMetadataSchema) | **DELETE** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Delete Metadata Schema |
| [**deleteProject**](ManagementApi.md#deleteProject) | **DELETE** /management/v1/projects/{projectId} | Delete Project |
| [**deleteStackingRules**](ManagementApi.md#deleteStackingRules) | **DELETE** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Delete Stacking Rules |
| [**deleteWebhook**](ManagementApi.md#deleteWebhook) | **DELETE** /management/v1/projects/{projectId}/webhooks/{webhookId} | Delete Webhook |
| [**getBrand**](ManagementApi.md#getBrand) | **GET** /management/v1/projects/{projectId}/branding/{brandingId} | Get Brand |
| [**getCustomEventSchema**](ManagementApi.md#getCustomEventSchema) | **GET** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Get Custom Event Schema |
| [**getMetadataSchema1**](ManagementApi.md#getMetadataSchema1) | **GET** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Get Metadata Schema |
| [**getProject**](ManagementApi.md#getProject) | **GET** /management/v1/projects/{projectId} | Get Project |
| [**getStackingRules**](ManagementApi.md#getStackingRules) | **GET** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Get Stacking Rules |
| [**getUser**](ManagementApi.md#getUser) | **GET** /management/v1/projects/{projectId}/users/{userId} | Get User |
| [**getWebhook**](ManagementApi.md#getWebhook) | **GET** /management/v1/projects/{projectId}/webhooks/{webhookId} | Get Webhook |
| [**listBrands**](ManagementApi.md#listBrands) | **GET** /management/v1/projects/{projectId}/branding | List Brands |
| [**listCustomEventSchemas**](ManagementApi.md#listCustomEventSchemas) | **GET** /management/v1/projects/{projectId}/custom-event-schemas | List Custom Event Schemas |
| [**listMetadataSchemas1**](ManagementApi.md#listMetadataSchemas1) | **GET** /management/v1/projects/{projectId}/metadata-schemas | List Metadata Schemas |
| [**listProjects**](ManagementApi.md#listProjects) | **GET** /management/v1/projects | List Projects |
| [**listStackingRules**](ManagementApi.md#listStackingRules) | **GET** /management/v1/projects/{projectId}/stacking-rules | List Stacking Rules |
| [**listUsers**](ManagementApi.md#listUsers) | **GET** /management/v1/projects/{projectId}/users | List Users |
| [**listWebhooks**](ManagementApi.md#listWebhooks) | **GET** /management/v1/projects/{projectId}/webhooks | List Webhooks |
| [**unassignUser**](ManagementApi.md#unassignUser) | **DELETE** /management/v1/projects/{projectId}/users/{userId} | Unassign User |
| [**updateBrand**](ManagementApi.md#updateBrand) | **PUT** /management/v1/projects/{projectId}/branding/{brandingId} | Update Brand |
| [**updateCustomEventSchema**](ManagementApi.md#updateCustomEventSchema) | **PUT** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Update Custom Event Schema |
| [**updateMetadataSchema**](ManagementApi.md#updateMetadataSchema) | **PUT** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Update Metadata Schema |
| [**updateProject**](ManagementApi.md#updateProject) | **PUT** /management/v1/projects/{projectId} | Update Project |
| [**updateStackingRules**](ManagementApi.md#updateStackingRules) | **PUT** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Update Stacking Rules |
| [**updateUser**](ManagementApi.md#updateUser) | **PUT** /management/v1/projects/{projectId}/users/{userId} | Update User |
| [**updateWebhook**](ManagementApi.md#updateWebhook) | **PUT** /management/v1/projects/{projectId}/webhooks/{webhookId} | Update Webhook |


<a id="assignUser"></a>
# **assignUser**
> ManagementProjectsUserResponseBody assignUser(projectId, managementProjectsUserCreateRequestBody)

Assign User

Assigns a user to a given project. The user must be an existing user in Voucherify.  &gt; 🚧 Correct Use of Data &gt; &gt;To avoid errors, use the &#x60;\&quot;role\&quot;&#x60; key with either &#x60;\&quot;id\&quot;&#x60; or &#x60;\&quot;login\&quot;&#x60; keys.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsUserCreateRequestBody managementProjectsUserCreateRequestBody = new ManagementProjectsUserCreateRequestBody(); // ManagementProjectsUserCreateRequestBody | Defines the user details.
    try {
      ManagementProjectsUserResponseBody result = apiInstance.assignUser(projectId, managementProjectsUserCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#assignUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsUserCreateRequestBody** | [**ManagementProjectsUserCreateRequestBody**](ManagementProjectsUserCreateRequestBody.md)| Defines the user details. | [optional] |

### Return type

[**ManagementProjectsUserResponseBody**](ManagementProjectsUserResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the user assigned to the project. |  -  |

<a id="createBrand"></a>
# **createBrand**
> ManagementProjectsBrandingResponseBody createBrand(projectId, managementProjectsBrandingCreateRequestBody)

Create Brand

Creates a new brand configuration.  You can have only one brand configured for a project.  &gt; 📘 White Labelling &gt; &gt; The white labelling settings which can be found in Project Settings &gt; Brand Details and which are available only for Enterprise clients as a separate service can be configured only in the user interface.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsBrandingCreateRequestBody managementProjectsBrandingCreateRequestBody = new ManagementProjectsBrandingCreateRequestBody(); // ManagementProjectsBrandingCreateRequestBody | Defines a brand configuration.
    try {
      ManagementProjectsBrandingResponseBody result = apiInstance.createBrand(projectId, managementProjectsBrandingCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsBrandingCreateRequestBody** | [**ManagementProjectsBrandingCreateRequestBody**](ManagementProjectsBrandingCreateRequestBody.md)| Defines a brand configuration. | [optional] |

### Return type

[**ManagementProjectsBrandingResponseBody**](ManagementProjectsBrandingResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the brand configuration. |  -  |

<a id="createCustomEventSchema"></a>
# **createCustomEventSchema**
> ManagementProjectsCustomEventSchemaResponseBodyBase createCustomEventSchema(projectId, managementProjectsCustomEventSchemaCreateRequestBody)

Create Custom Event Schema

Creates a custom event schema.  The &#x60;\&quot;properties\&quot;&#x60; object is required, but it can be empty, however. This object is for optional custom properties (metadata).  &gt; 📘 Custom Event Documentation &gt; &gt; Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. &gt; &gt;Read also the details about the [Track Custom Event](ref:track-custom-event) endpoint and the [Custom Event Object](ref:custom-event-object).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsCustomEventSchemaCreateRequestBody managementProjectsCustomEventSchemaCreateRequestBody = new ManagementProjectsCustomEventSchemaCreateRequestBody(); // ManagementProjectsCustomEventSchemaCreateRequestBody | Defines the custom event schema.
    try {
      ManagementProjectsCustomEventSchemaResponseBodyBase result = apiInstance.createCustomEventSchema(projectId, managementProjectsCustomEventSchemaCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsCustomEventSchemaCreateRequestBody** | [**ManagementProjectsCustomEventSchemaCreateRequestBody**](ManagementProjectsCustomEventSchemaCreateRequestBody.md)| Defines the custom event schema. | [optional] |

### Return type

[**ManagementProjectsCustomEventSchemaResponseBodyBase**](ManagementProjectsCustomEventSchemaResponseBodyBase.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the custom event schema. |  -  |

<a id="createMetadataSchema"></a>
# **createMetadataSchema**
> ManagementProjectsMetadataSchemaResponseBody createMetadataSchema(projectId, managementProjectsMetadataSchemaCreateRequestBody)

Create Metadata Schema

Creates a new metadata (custom attribute) schema.  The schema consists of a set of key-value pairs to customize Voucherify resources.   You can nest your object within a standard metadata schema, e.g. within a campaign or customer schema. However, your nested object cannot include another nested object. The standard metadata schemas are: - Campaign - Voucher - Publication - Redemption - Product - Customer - Order - Order line item - Loyalty Tier - Promotion Tier - Earning rule - Reward  &gt; 📘 Metadata Documentation &gt; &gt; Read [the Getting Started with Metadata](https://support.voucherify.io/article/99-schema-validation-metadata) and [Metadata Mapping](doc:metadata-mapping) articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsMetadataSchemaCreateRequestBody managementProjectsMetadataSchemaCreateRequestBody = new ManagementProjectsMetadataSchemaCreateRequestBody(); // ManagementProjectsMetadataSchemaCreateRequestBody | Defines the metadata schema.
    try {
      ManagementProjectsMetadataSchemaResponseBody result = apiInstance.createMetadataSchema(projectId, managementProjectsMetadataSchemaCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsMetadataSchemaCreateRequestBody** | [**ManagementProjectsMetadataSchemaCreateRequestBody**](ManagementProjectsMetadataSchemaCreateRequestBody.md)| Defines the metadata schema. | [optional] |

### Return type

[**ManagementProjectsMetadataSchemaResponseBody**](ManagementProjectsMetadataSchemaResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the metadata schema. |  -  |

<a id="createProject"></a>
# **createProject**
> ManagementProjectsCreateResponseBody createProject(managementProjectsCreateRequestBody)

Create Project

Creates a new project. You can add users, specify the cluster, timezone, currency, and other details.  All owners are added to the project by default.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ManagementProjectsCreateRequestBody managementProjectsCreateRequestBody = new ManagementProjectsCreateRequestBody(); // ManagementProjectsCreateRequestBody | Define project details.
    try {
      ManagementProjectsCreateResponseBody result = apiInstance.createProject(managementProjectsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createProject");
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
| **managementProjectsCreateRequestBody** | [**ManagementProjectsCreateRequestBody**](ManagementProjectsCreateRequestBody.md)| Define project details. | [optional] |

### Return type

[**ManagementProjectsCreateResponseBody**](ManagementProjectsCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of a created project. |  -  |

<a id="createStackingRules"></a>
# **createStackingRules**
> ManagementProjectsStackingRulesCreateResponseBody createStackingRules(projectId, managementProjectsStackingRulesCreateRequestBody)

Create Stacking Rules

Overwrites the default stacking rules.  If new stacking rules have been created for the project earlier (e.g. in the user interface), it returns an error. Use [Update Stacking Rules](ref:update-stacking-rules) endpoint to change the rules.  &gt; 📘 Stacking Rules Documentation &gt; &gt; Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsStackingRulesCreateRequestBody managementProjectsStackingRulesCreateRequestBody = new ManagementProjectsStackingRulesCreateRequestBody(); // ManagementProjectsStackingRulesCreateRequestBody | Defines the stacking rule parameters.
    try {
      ManagementProjectsStackingRulesCreateResponseBody result = apiInstance.createStackingRules(projectId, managementProjectsStackingRulesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsStackingRulesCreateRequestBody** | [**ManagementProjectsStackingRulesCreateRequestBody**](ManagementProjectsStackingRulesCreateRequestBody.md)| Defines the stacking rule parameters. | [optional] |

### Return type

[**ManagementProjectsStackingRulesCreateResponseBody**](ManagementProjectsStackingRulesCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the stacking rules assigned to the project. |  -  |

<a id="createWebhook"></a>
# **createWebhook**
> ManagementProjectsWebhooksResponseBody createWebhook(projectId, managementProjectsWebhooksCreateRequestBody)

Create Webhook

Creates a new webhook configuration.  &gt; 📘 Webhook Documentation &gt; &gt; Read [Webhooks v2024-01-01](ref:introduction-to-webhooks) article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsWebhooksCreateRequestBody managementProjectsWebhooksCreateRequestBody = new ManagementProjectsWebhooksCreateRequestBody(); // ManagementProjectsWebhooksCreateRequestBody | Defines a webhook configuration.
    try {
      ManagementProjectsWebhooksResponseBody result = apiInstance.createWebhook(projectId, managementProjectsWebhooksCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsWebhooksCreateRequestBody** | [**ManagementProjectsWebhooksCreateRequestBody**](ManagementProjectsWebhooksCreateRequestBody.md)| Defines a webhook configuration. | [optional] |

### Return type

[**ManagementProjectsWebhooksResponseBody**](ManagementProjectsWebhooksResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the webhook configuration. |  -  |

<a id="deleteBrand"></a>
# **deleteBrand**
> deleteBrand(projectId, brandingId)

Delete Brand

Deletes permanently a brand configuration.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    try {
      apiInstance.deleteBrand(projectId, brandingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the brand configuration has been successfully deleted. |  -  |

<a id="deleteCustomEventSchema"></a>
# **deleteCustomEventSchema**
> deleteCustomEventSchema(projectId, customEventSchemaId)

Delete Custom Event Schema

Deletes permanently the custom event schema with its custom properties (metadata).  &gt; 📘 Custom Event Documentation &gt; &gt; Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. &gt; &gt;Read also the details about the [Track Custom Event](ref:track-custom-event) endpoint and the [Custom Event Object](ref:custom-event-object).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    try {
      apiInstance.deleteCustomEventSchema(projectId, customEventSchemaId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the custom event schema has been successfully deleted. |  -  |

<a id="deleteMetadataSchema"></a>
# **deleteMetadataSchema**
> deleteMetadataSchema(projectId, metadataSchemaId)

Delete Metadata Schema

Deletes permanently the metadata schema.  In standard metadata schemas, this endpoint removes permanently all definitions. The standard metadata schemas are: - Campaign - Voucher - Publication - Redemption - Product - Customer - Order - Order line item - Loyalty Tier - Promotion Tier - Earning rule - Reward  If you want to delete only one definition, use the [Update Metadata Schema](ref:update-metadata-schema) endpoint. In the request, provide the &#x60;\&quot;deleted\&quot;: true&#x60; pair in the definition object. This definition will be moved to Removed definitions.  If you want to create a new standard metadata schema, use the [Create Metadata Schema](ref:create-metadata-schema) endpoint.  &gt; 🚧 Metadata Purging &gt; &gt;This endpoint deletes permanently the metadata schemas only. However, it does not purge the metadata from associated entities, so the metadata added to those entities will remain. &gt; &gt;If you want to purge metadata from the entities: &gt;1. Remove all the definitions you want to purge. You can do this either in Voucherify Project Settings &gt; Metadata Schema tab or with the [Update Metadata Schema](ref:update-metadata-schema) endpoint. &gt;2. In Voucherify Project Settings &gt; Metadata Schema tab, go to the relevant metadata schema. &gt;3. In Removed definitions, click the bin button next to the definitions whose metadata you want to purge from entities. &gt;Note: &gt;- This is an asynchronous action. You will be notified when it has been completed. &gt;- You cannot purge metadata for the Redemption and Publication schemas. &gt;4. Use the Delete Metadata Schema request to delete the metadata schema from Voucherify.  &gt; 📘 Metadata Documentation &gt; &gt; Read [the Getting Started with Metadata](https://support.voucherify.io/article/99-schema-validation-metadata) and [Metadata Mapping](doc:metadata-mapping) articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    try {
      apiInstance.deleteMetadataSchema(projectId, metadataSchemaId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the metadata schema has been successfully deleted. |  -  |

<a id="deleteProject"></a>
# **deleteProject**
> deleteProject(projectId)

Delete Project

Deletes an existing project.  The users currently using the deleted project will be automatically logged out.  &gt; 🚧 Sandbox Project &gt; &gt;The sandbox project cannot be deleted.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      apiInstance.deleteProject(projectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

<a id="deleteStackingRules"></a>
# **deleteStackingRules**
> deleteStackingRules(projectId, stackingRulesId)

Delete Stacking Rules

Deletes permanently the current settings for the stacking rules.  The stacking rules are restored to default values.  &gt; 📘 Stacking Rules Documentation &gt; &gt; Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    try {
      apiInstance.deleteStackingRules(projectId, stackingRulesId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the stacking rules have been successfully deleted. |  -  |

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(projectId, webhookId)

Delete Webhook

Deletes a webhook configuration.  &gt; 📘 Webhook Documentation &gt; &gt; Read [Webhooks v2024-01-1](ref:introduction-to-webhooks) article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    try {
      apiInstance.deleteWebhook(projectId, webhookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the webhook configuration has been successfully deleted. |  -  |

<a id="getBrand"></a>
# **getBrand**
> ManagementProjectsBrandingResponseBody getBrand(projectId, brandingId)

Get Brand

Retrieves a brand configuration.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    try {
      ManagementProjectsBrandingResponseBody result = apiInstance.getBrand(projectId, brandingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. | |

### Return type

[**ManagementProjectsBrandingResponseBody**](ManagementProjectsBrandingResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the brand configuration. |  -  |

<a id="getCustomEventSchema"></a>
# **getCustomEventSchema**
> ManagementProjectsCustomEventSchemaResponseBody getCustomEventSchema(projectId, customEventSchemaId)

Get Custom Event Schema

Retrieves a custom event schema.  &gt; 📘 Custom Event Documentation &gt; &gt; Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. &gt; &gt;Read also the details about the [Track Custom Event](ref:track-custom-event) endpoint and the [Custom Event Object](ref:custom-event-object).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    try {
      ManagementProjectsCustomEventSchemaResponseBody result = apiInstance.getCustomEventSchema(projectId, customEventSchemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. | |

### Return type

[**ManagementProjectsCustomEventSchemaResponseBody**](ManagementProjectsCustomEventSchemaResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the custom event schema. |  -  |

<a id="getMetadataSchema1"></a>
# **getMetadataSchema1**
> ManagementProjectsMetadataSchemaResponseBody getMetadataSchema1(projectId, metadataSchemaId)

Get Metadata Schema

Retrieves a metadata schema.  &gt; 📘 Metadata Documentation &gt; &gt; Read [the Getting Started with Metadata](https://support.voucherify.io/article/99-schema-validation-metadata) and [Metadata Mapping](doc:metadata-mapping) articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    try {
      ManagementProjectsMetadataSchemaResponseBody result = apiInstance.getMetadataSchema1(projectId, metadataSchemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getMetadataSchema1");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. | |

### Return type

[**ManagementProjectsMetadataSchemaResponseBody**](ManagementProjectsMetadataSchemaResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the metadata schema. |  -  |

<a id="getProject"></a>
# **getProject**
> ManagementProjectsResponseBody getProject(projectId)

Get Project

Retrieves an existing project.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsResponseBody result = apiInstance.getProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsResponseBody**](ManagementProjectsResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of a project. |  -  |

<a id="getStackingRules"></a>
# **getStackingRules**
> ManagementProjectsStackingRulesResponseBody getStackingRules(projectId, stackingRulesId)

Get Stacking Rules

Retrieves the stacking rules for the project.  &gt; 📘 Stacking Rules Documentation &gt; &gt; Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    try {
      ManagementProjectsStackingRulesResponseBody result = apiInstance.getStackingRules(projectId, stackingRulesId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. | |

### Return type

[**ManagementProjectsStackingRulesResponseBody**](ManagementProjectsStackingRulesResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the stacking rules for the project. |  -  |

<a id="getUser"></a>
# **getUser**
> ManagementProjectsUserResponseBody getUser(projectId, userId)

Get User

Retrieves the project user&#39;s details.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the user's login.
    try {
      ManagementProjectsUserResponseBody result = apiInstance.getUser(projectId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the user&#39;s login. | |

### Return type

[**ManagementProjectsUserResponseBody**](ManagementProjectsUserResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the project user&#39;s details. |  -  |

<a id="getWebhook"></a>
# **getWebhook**
> ManagementProjectsWebhooksResponseBody getWebhook(projectId, webhookId)

Get Webhook

Retrieves a webhook configuration.  &gt; 📘 Webhook Documentation &gt; &gt; Read [Webhooks v2024-01-1](ref:introduction-to-webhooks) article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    try {
      ManagementProjectsWebhooksResponseBody result = apiInstance.getWebhook(projectId, webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. | |

### Return type

[**ManagementProjectsWebhooksResponseBody**](ManagementProjectsWebhooksResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the webhook configuration. |  -  |

<a id="listBrands"></a>
# **listBrands**
> ManagementProjectsBrandingListResponseBody listBrands(projectId)

List Brands

Lists all brand configurations.  Because a project can have only one brand, it always returns a list with one item.  This endpoint can be used to retrieve the brand configuration created with the Voucherify Dashboard and the ID.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsBrandingListResponseBody result = apiInstance.listBrands(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listBrands");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsBrandingListResponseBody**](ManagementProjectsBrandingListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the brand created in the project. |  -  |

<a id="listCustomEventSchemas"></a>
# **listCustomEventSchemas**
> ManagementProjectsCustomEventSchemaListResponseBody listCustomEventSchemas(projectId)

List Custom Event Schemas

Lists all custom event schemas available in the project.  &gt; 📘 Custom Event Documentation &gt; &gt; Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. &gt; &gt;Read also the details about the [Track Custom Event](ref:track-custom-event) endpoint and the [Custom Event Object](ref:custom-event-object).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsCustomEventSchemaListResponseBody result = apiInstance.listCustomEventSchemas(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCustomEventSchemas");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsCustomEventSchemaListResponseBody**](ManagementProjectsCustomEventSchemaListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the custom event schemas created in the project. |  -  |

<a id="listMetadataSchemas1"></a>
# **listMetadataSchemas1**
> ManagementProjectsMetadataSchemaListResponseBody listMetadataSchemas1(projectId)

List Metadata Schemas

Lists all metadata schemas available in the project.  &gt; 📘 Metadata Documentation &gt; &gt; Read [the Getting Started with Metadata](https://support.voucherify.io/article/99-schema-validation-metadata) and [Metadata Mapping](doc:metadata-mapping) articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsMetadataSchemaListResponseBody result = apiInstance.listMetadataSchemas1(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listMetadataSchemas1");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsMetadataSchemaListResponseBody**](ManagementProjectsMetadataSchemaListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the metadata schemas created in the project. |  -  |

<a id="listProjects"></a>
# **listProjects**
> ManagementProjectListResponseBody listProjects()

List Projects

Lists all projects for the organization.  The endpoint does not require any query parameters.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ManagementProjectListResponseBody result = apiInstance.listProjects();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listProjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementProjectListResponseBody**](ManagementProjectListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all projects with their details. |  -  |

<a id="listStackingRules"></a>
# **listStackingRules**
> ManagementProjectsStackingRulesListResponseBody listStackingRules(projectId)

List Stacking Rules

Lists all stacking rules.  Returns always a list with one item.  This endpoint can be used to retrieve the default stacking rules. The default stacking rules do not have an ID that could be used with the [Get Stacking Rules](ref:get-stacking-rules) or [Update Stacking Rules](ref:update-stacking-rules) endpoints.  &gt; 📘 Stacking Rules Documentation &gt; &gt; Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsStackingRulesListResponseBody result = apiInstance.listStackingRules(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsStackingRulesListResponseBody**](ManagementProjectsStackingRulesListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the stacking rules assigned to the project. These can be either the default stacking rules or the created ones. |  -  |

<a id="listUsers"></a>
# **listUsers**
> ManagementProjectsUserListResponseBody listUsers(projectId)

List Users

Lists all users assigned to the project.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsUserListResponseBody result = apiInstance.listUsers(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listUsers");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsUserListResponseBody**](ManagementProjectsUserListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all the users assigned to the project. |  -  |

<a id="listWebhooks"></a>
# **listWebhooks**
> ManagementProjectsWebhooksListResponseBody listWebhooks(projectId)

List Webhooks

Lists all webhook configurations for the project.  &gt; 📘 Webhook Documentation &gt; &gt; Read [Webhooks v2024-01-1](ref:introduction-to-webhooks) article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsWebhooksListResponseBody result = apiInstance.listWebhooks(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listWebhooks");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |

### Return type

[**ManagementProjectsWebhooksListResponseBody**](ManagementProjectsWebhooksListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about webhook configurations created in the project. |  -  |

<a id="unassignUser"></a>
# **unassignUser**
> unassignUser(projectId, userId)

Unassign User

Unassigns the user from the project. If the user is currently logged in, they are automatically logged out. If the user is assigned to only one project, they cannot be unassigned from that project.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the user's login.
    try {
      apiInstance.unassignUser(projectId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#unassignUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the user&#39;s login. | |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the user has been successfully unnassigned. |  -  |

<a id="updateBrand"></a>
# **updateBrand**
> ManagementProjectsBrandingResponseBody updateBrand(projectId, brandingId, managementProjectsBranding)

Update Brand

Updates a brand configuration.  Only the fields sent in the request will be updated. The fields omitted in the request will remain unchanged.  &gt; 📘 White Labelling &gt; &gt; The white labelling settings which can be found in Project Settings &gt; Brand Details and which are available only for Enterprise clients as a separate service can be configured only in the user interface.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    ManagementProjectsBranding managementProjectsBranding = new ManagementProjectsBranding(); // ManagementProjectsBranding | Defines the brand configuration to be updated.
    try {
      ManagementProjectsBrandingResponseBody result = apiInstance.updateBrand(projectId, brandingId, managementProjectsBranding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. | |
| **managementProjectsBranding** | [**ManagementProjectsBranding**](ManagementProjectsBranding.md)| Defines the brand configuration to be updated. | [optional] |

### Return type

[**ManagementProjectsBrandingResponseBody**](ManagementProjectsBrandingResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated brand configuration. |  -  |

<a id="updateCustomEventSchema"></a>
# **updateCustomEventSchema**
> ManagementProjectsCustomEventSchemaResponseBody updateCustomEventSchema(projectId, customEventSchemaId, managementProjectsCustomEventSchemaBase)

Update Custom Event Schema

Updates a custom event schema.  With this request, you can: - Add a non-existing property to a custom event schema. - Update an existing property.  In the request, you can provide only those properties you want to add or update. Definitions omitted in the request remain unchanged.  &gt; 👍 Additional Notes &gt; &gt;- You can change the type of an existing property, e.g. from &#x60;\&quot;string\&quot;&#x60; to &#x60;\&quot;number\&quot;&#x60;. &gt; &gt;- You can remove a custom property with this endpoint by providing &#x60;\&quot;deleted\&quot;: true&#x60; in the request. However, you cannot permanently remove an event definition or its property with this endpoint.  &gt; 📘 Custom Event Documentation &gt; &gt; Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. &gt; &gt;Read also the details about the [Track Custom Event](ref:track-custom-event) endpoint and the [Custom Event Object](ref:custom-event-object).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    ManagementProjectsCustomEventSchemaBase managementProjectsCustomEventSchemaBase = new ManagementProjectsCustomEventSchemaBase(); // ManagementProjectsCustomEventSchemaBase | Defines the custom event schema to be updated.
    try {
      ManagementProjectsCustomEventSchemaResponseBody result = apiInstance.updateCustomEventSchema(projectId, customEventSchemaId, managementProjectsCustomEventSchemaBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. | |
| **managementProjectsCustomEventSchemaBase** | [**ManagementProjectsCustomEventSchemaBase**](ManagementProjectsCustomEventSchemaBase.md)| Defines the custom event schema to be updated. | [optional] |

### Return type

[**ManagementProjectsCustomEventSchemaResponseBody**](ManagementProjectsCustomEventSchemaResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated custom event schema. |  -  |

<a id="updateMetadataSchema"></a>
# **updateMetadataSchema**
> ManagementProjectsMetadataSchemaResponseBody updateMetadataSchema(projectId, metadataSchemaId, managementProjectsMetadataSchemaUpdateRequestBody)

Update Metadata Schema

Updates a metadata schema.  With this request, you can: - Add a non-existing attribute definition to the metadata schema. - Update an existing attribute definition by overwriting its current values.  In the request, you can provide only those definitions you want to add or update. Definitions omitted in the request remain unchanged.  However, if you want to update a definition, you will have to add all its current key-value pairs as well. Only the pairs sent in the request are saved for this definition. This means that the key-value pairs that are not sent in a request are restored to default values. For example, if your definition has an array with values and it is not sent in an update request, the array values will be deleted.  &gt; 👍 Additional Notes &gt; &gt;- You cannot change the type of an existing schema, e.g. from &#x60;\&quot;string\&quot;&#x60; to &#x60;\&quot;number\&quot;&#x60;. &gt; &gt;- You can remove a definition with this endpoint by providing &#x60;\&quot;deleted\&quot;: true&#x60; in the request. It will be moved to the Removed definitions section in the user interface. However, you cannot permanently remove a definition with this endpoint.  &gt; 📘 Metadata Documentation &gt; &gt; Read [the Getting Started with Metadata](https://support.voucherify.io/article/99-schema-validation-metadata) and [Metadata Mapping](doc:metadata-mapping) articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    ManagementProjectsMetadataSchemaUpdateRequestBody managementProjectsMetadataSchemaUpdateRequestBody = new ManagementProjectsMetadataSchemaUpdateRequestBody(); // ManagementProjectsMetadataSchemaUpdateRequestBody | Defines the metadata schema to be updated.
    try {
      ManagementProjectsMetadataSchemaResponseBody result = apiInstance.updateMetadataSchema(projectId, metadataSchemaId, managementProjectsMetadataSchemaUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. | |
| **managementProjectsMetadataSchemaUpdateRequestBody** | [**ManagementProjectsMetadataSchemaUpdateRequestBody**](ManagementProjectsMetadataSchemaUpdateRequestBody.md)| Defines the metadata schema to be updated. | [optional] |

### Return type

[**ManagementProjectsMetadataSchemaResponseBody**](ManagementProjectsMetadataSchemaResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated metadata schema. |  -  |

<a id="updateProject"></a>
# **updateProject**
> ManagementProjectsResponseBody updateProject(projectId, managementProjectsUpdateRequestBody)

Update Project

Updates an existing project.  You can add or modify settings for timezone, currency, notifications, and other details.  Only the fields sent in the request will be updated.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsUpdateRequestBody managementProjectsUpdateRequestBody = new ManagementProjectsUpdateRequestBody(); // ManagementProjectsUpdateRequestBody | Define the project details to be updated.
    try {
      ManagementProjectsResponseBody result = apiInstance.updateProject(projectId, managementProjectsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **managementProjectsUpdateRequestBody** | [**ManagementProjectsUpdateRequestBody**](ManagementProjectsUpdateRequestBody.md)| Define the project details to be updated. | [optional] |

### Return type

[**ManagementProjectsResponseBody**](ManagementProjectsResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of an updated project. |  -  |

<a id="updateStackingRules"></a>
# **updateStackingRules**
> ManagementProjectsStackingRulesUpdatedResponseBody updateStackingRules(projectId, stackingRulesId, managementProjectsStackingRulesBase)

Update Stacking Rules

Updates the stacking rules.  Only the provided fields will be updated. However, if you update an array, the content of the array is overwritten. This means that if you want to add new values to an array and retain existing ones, you need to provide both the existing and new values in the request.  &gt; 📘 Stacking Rules Documentation &gt; &gt; Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    ManagementProjectsStackingRulesBase managementProjectsStackingRulesBase = new ManagementProjectsStackingRulesBase(); // ManagementProjectsStackingRulesBase | Defines the stacking rules to be updated.
    try {
      ManagementProjectsStackingRulesUpdatedResponseBody result = apiInstance.updateStackingRules(projectId, stackingRulesId, managementProjectsStackingRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. | |
| **managementProjectsStackingRulesBase** | [**ManagementProjectsStackingRulesBase**](ManagementProjectsStackingRulesBase.md)| Defines the stacking rules to be updated. | [optional] |

### Return type

[**ManagementProjectsStackingRulesUpdatedResponseBody**](ManagementProjectsStackingRulesUpdatedResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated stacking rules. |  -  |

<a id="updateUser"></a>
# **updateUser**
> ManagementProjectsUserResponseBody updateUser(projectId, userId, managementProjectsUserUpdateRequestBody)

Update User

Updates the user&#39;s role.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the user's login.
    ManagementProjectsUserUpdateRequestBody managementProjectsUserUpdateRequestBody = new ManagementProjectsUserUpdateRequestBody(); // ManagementProjectsUserUpdateRequestBody | Defines the user's new role.
    try {
      ManagementProjectsUserResponseBody result = apiInstance.updateUser(projectId, userId, managementProjectsUserUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the user&#39;s login. | |
| **managementProjectsUserUpdateRequestBody** | [**ManagementProjectsUserUpdateRequestBody**](ManagementProjectsUserUpdateRequestBody.md)| Defines the user&#39;s new role. | [optional] |

### Return type

[**ManagementProjectsUserResponseBody**](ManagementProjectsUserResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the user assigned to the project. |  -  |

<a id="updateWebhook"></a>
# **updateWebhook**
> ManagementProjectsWebhooksResponseBody updateWebhook(projectId, webhookId, managementProjectsWebhooks)

Update Webhook

Updates a webhook configuration.  The &#x60;\&quot;events\&quot;&#x60; listed in the request are overwritten. If you want to add more events, provide also the events that are already in the webhook configuration.  &gt; 📘 Webhook Documentation &gt; &gt; Read [Webhooks v2024-01-1](ref:introduction-to-webhooks) article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    ApiKeyAuth X-Management-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Token");
    X-Management-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Token.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Management-Id
    ApiKeyAuth X-Management-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Management-Id");
    X-Management-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Management-Id.setApiKeyPrefix("Token");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    ManagementProjectsWebhooks managementProjectsWebhooks = new ManagementProjectsWebhooks(); // ManagementProjectsWebhooks | Defines the webhook configuration to be updated.
    try {
      ManagementProjectsWebhooksResponseBody result = apiInstance.updateWebhook(projectId, webhookId, managementProjectsWebhooks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. | |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. | |
| **managementProjectsWebhooks** | [**ManagementProjectsWebhooks**](ManagementProjectsWebhooks.md)| Defines the webhook configuration to be updated. | [optional] |

### Return type

[**ManagementProjectsWebhooksResponseBody**](ManagementProjectsWebhooksResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated webhook configuration. |  -  |

