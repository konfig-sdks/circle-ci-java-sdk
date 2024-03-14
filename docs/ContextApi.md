# ContextApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewContext**](ContextApi.md#createNewContext) | **POST** /context | Create a new context |
| [**createRestriction**](ContextApi.md#createRestriction) | **POST** /context/{context_id}/restrictions | 🧪 Create context restriction |
| [**deleteRestriction**](ContextApi.md#deleteRestriction) | **DELETE** /context/{context_id}/restrictions/{restriction_id} | 🧪 Delete context restriction |
| [**getInformation**](ContextApi.md#getInformation) | **GET** /context/{context-id} | Get a context |
| [**getRestrictions**](ContextApi.md#getRestrictions) | **GET** /context/{context_id}/restrictions | 🧪 Get context restrictions |
| [**listEnvironmentVariables**](ContextApi.md#listEnvironmentVariables) | **GET** /context/{context-id}/environment-variable | List environment variables |
| [**listOwnerContexts**](ContextApi.md#listOwnerContexts) | **GET** /context | List contexts |
| [**removeContext**](ContextApi.md#removeContext) | **DELETE** /context/{context-id} | Delete a context |
| [**removeEnvironmentVariable**](ContextApi.md#removeEnvironmentVariable) | **DELETE** /context/{context-id}/environment-variable/{env-var-name} | Remove an environment variable |
| [**updateEnvironmentVariable**](ContextApi.md#updateEnvironmentVariable) | **PUT** /context/{context-id}/environment-variable/{env-var-name} | Add or update an environment variable |


<a name="createNewContext"></a>
# **createNewContext**
> ContextCreateNewContextResponse createNewContext().contextCreateNewContextRequest(contextCreateNewContextRequest).execute();

Create a new context

Creates a new context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String name = "name_example"; // The user defined name of the context.
    Object owner = null;
    try {
      ContextCreateNewContextResponse result = client
              .context
              .createNewContext(name, owner)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#createNewContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextCreateNewContextResponse> response = client
              .context
              .createNewContext(name, owner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#createNewContext");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextCreateNewContextRequest** | [**ContextCreateNewContextRequest**](ContextCreateNewContextRequest.md)|  | [optional] |

### Return type

[**ContextCreateNewContextResponse**](ContextCreateNewContextResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The new context |  -  |
| **0** | Error response. |  -  |

<a name="createRestriction"></a>
# **createRestriction**
> RestrictionCreated createRestriction(contextId, contextCreateRestrictionRequest).execute();

🧪 Create context restriction

[__EXPERIMENTAL__] Creates project restriction on a context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String contextId = "be8bb2e3-c3d6-4098-89f4-572ff976ba9a"; // An opaque identifier of a context.
    UUID projectId = UUID.randomUUID(); // Deprecated - Use \\\"restriction_type\\\" and \\\"restriction_value\\\" instead.  The project ID to use for a project restriction. This is mutually exclusive with restriction_type and restriction_value and implies restriction_type is \\\"project\\\". 
    String restrictionType = "restrictionType_example";
    String restrictionValue = "restrictionValue_example";
    try {
      RestrictionCreated result = client
              .context
              .createRestriction(contextId)
              .projectId(projectId)
              .restrictionType(restrictionType)
              .restrictionValue(restrictionValue)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProjectId());
      System.out.println(result.getName());
      System.out.println(result.getRestrictionType());
      System.out.println(result.getRestrictionValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#createRestriction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RestrictionCreated> response = client
              .context
              .createRestriction(contextId)
              .projectId(projectId)
              .restrictionType(restrictionType)
              .restrictionValue(restrictionValue)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#createRestriction");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **String**| An opaque identifier of a context. | |
| **contextCreateRestrictionRequest** | [**ContextCreateRestrictionRequest**](ContextCreateRestrictionRequest.md)|  | |

### Return type

[**RestrictionCreated**](RestrictionCreated.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response. |  -  |

<a name="deleteRestriction"></a>
# **deleteRestriction**
> RestrictionDeleted deleteRestriction(contextId, restrictionId).execute();

🧪 Delete context restriction

[__EXPERIMENTAL__] Deletes a project restriction on a context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String contextId = "be8bb2e3-c3d6-4098-89f4-572ff976ba9a"; // An opaque identifier of a context.
    String restrictionId = "1c23d2cb-07b1-4a28-8af3-e369732050ed"; // An opaque identifier of a context restriction.
    try {
      RestrictionDeleted result = client
              .context
              .deleteRestriction(contextId, restrictionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#deleteRestriction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RestrictionDeleted> response = client
              .context
              .deleteRestriction(contextId, restrictionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#deleteRestriction");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **String**| An opaque identifier of a context. | |
| **restrictionId** | **String**| An opaque identifier of a context restriction. | |

### Return type

[**RestrictionDeleted**](RestrictionDeleted.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |

<a name="getInformation"></a>
# **getInformation**
> ContextGetInformationResponse getInformation(contextId).execute();

Get a context

Returns basic information about a context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    UUID contextId = UUID.randomUUID(); // ID of the context (UUID)
    try {
      ContextGetInformationResponse result = client
              .context
              .getInformation(contextId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextGetInformationResponse> response = client
              .context
              .getInformation(contextId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **UUID**| ID of the context (UUID) | |

### Return type

[**ContextGetInformationResponse**](ContextGetInformationResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The context |  -  |
| **0** | Error response. |  -  |

<a name="getRestrictions"></a>
# **getRestrictions**
> ContextProjectRestrictionsList getRestrictions(contextId).execute();

🧪 Get context restrictions

[__EXPERIMENTAL__] Gets a list of project restrictions associated with a context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String contextId = "be8bb2e3-c3d6-4098-89f4-572ff976ba9a"; // An opaque identifier of a context.
    try {
      ContextProjectRestrictionsList result = client
              .context
              .getRestrictions(contextId)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#getRestrictions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextProjectRestrictionsList> response = client
              .context
              .getRestrictions(contextId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#getRestrictions");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **String**| An opaque identifier of a context. | |

### Return type

[**ContextProjectRestrictionsList**](ContextProjectRestrictionsList.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |

<a name="listEnvironmentVariables"></a>
# **listEnvironmentVariables**
> ContextListEnvironmentVariablesResponse listEnvironmentVariables(contextId).pageToken(pageToken).execute();

List environment variables

List information about environment variables in a context, not including their values.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    UUID contextId = UUID.randomUUID(); // ID of the context (UUID)
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    try {
      ContextListEnvironmentVariablesResponse result = client
              .context
              .listEnvironmentVariables(contextId)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#listEnvironmentVariables");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextListEnvironmentVariablesResponse> response = client
              .context
              .listEnvironmentVariables(contextId)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#listEnvironmentVariables");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **UUID**| ID of the context (UUID) | |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |

### Return type

[**ContextListEnvironmentVariablesResponse**](ContextListEnvironmentVariablesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of environment variables |  -  |
| **0** | Error response. |  -  |

<a name="listOwnerContexts"></a>
# **listOwnerContexts**
> ContextListOwnerContextsResponse listOwnerContexts().ownerId(ownerId).ownerSlug(ownerSlug).ownerType(ownerType).pageToken(pageToken).execute();

List contexts

List all contexts for an owner.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    UUID ownerId = UUID.randomUUID(); // The unique ID of the owner of the context. Specify either this or owner-slug.
    String ownerSlug = "ownerSlug_example"; // A string that represents an organization. Specify either this or owner-id. Cannot be used for accounts.
    String ownerType = "account"; // The type of the owner. Defaults to \"organization\". Accounts are only used as context owners in server.
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    try {
      ContextListOwnerContextsResponse result = client
              .context
              .listOwnerContexts()
              .ownerId(ownerId)
              .ownerSlug(ownerSlug)
              .ownerType(ownerType)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#listOwnerContexts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextListOwnerContextsResponse> response = client
              .context
              .listOwnerContexts()
              .ownerId(ownerId)
              .ownerSlug(ownerSlug)
              .ownerType(ownerType)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#listOwnerContexts");
      System.err.println("Status code: " + e.getStatusCode());
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
| **ownerId** | **UUID**| The unique ID of the owner of the context. Specify either this or owner-slug. | [optional] |
| **ownerSlug** | **String**| A string that represents an organization. Specify either this or owner-id. Cannot be used for accounts. | [optional] |
| **ownerType** | **String**| The type of the owner. Defaults to \&quot;organization\&quot;. Accounts are only used as context owners in server. | [optional] [enum: account, organization] |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |

### Return type

[**ContextListOwnerContextsResponse**](ContextListOwnerContextsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of contexts |  -  |
| **0** | Error response. |  -  |

<a name="removeContext"></a>
# **removeContext**
> ContextRemoveContextResponse removeContext(contextId).execute();

Delete a context

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    UUID contextId = UUID.randomUUID(); // ID of the context (UUID)
    try {
      ContextRemoveContextResponse result = client
              .context
              .removeContext(contextId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#removeContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextRemoveContextResponse> response = client
              .context
              .removeContext(contextId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#removeContext");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **UUID**| ID of the context (UUID) | |

### Return type

[**ContextRemoveContextResponse**](ContextRemoveContextResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A confirmation message |  -  |
| **0** | Error response. |  -  |

<a name="removeEnvironmentVariable"></a>
# **removeEnvironmentVariable**
> ContextRemoveEnvironmentVariableResponse removeEnvironmentVariable(envVarName, contextId).execute();

Remove an environment variable

Delete an environment variable from a context.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String envVarName = "POSTGRES_USER"; // The name of the environment variable
    UUID contextId = UUID.randomUUID(); // ID of the context (UUID)
    try {
      ContextRemoveEnvironmentVariableResponse result = client
              .context
              .removeEnvironmentVariable(envVarName, contextId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#removeEnvironmentVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextRemoveEnvironmentVariableResponse> response = client
              .context
              .removeEnvironmentVariable(envVarName, contextId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#removeEnvironmentVariable");
      System.err.println("Status code: " + e.getStatusCode());
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
| **envVarName** | **String**| The name of the environment variable | |
| **contextId** | **UUID**| ID of the context (UUID) | |

### Return type

[**ContextRemoveEnvironmentVariableResponse**](ContextRemoveEnvironmentVariableResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A confirmation message |  -  |
| **0** | Error response. |  -  |

<a name="updateEnvironmentVariable"></a>
# **updateEnvironmentVariable**
> ContextUpdateEnvironmentVariableResponse updateEnvironmentVariable(contextId, envVarName).contextUpdateEnvironmentVariableRequest(contextUpdateEnvironmentVariableRequest).execute();

Add or update an environment variable

Create or update an environment variable within a context. Returns information about the environment variable, not including its value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContextApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://circleci.com/api/v2";
    
    configuration.apiKeyHeader  = "YOUR API KEY";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: basic_auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    CircleCi client = new CircleCi(configuration);
    String value = "value_example"; // The value of the environment variable
    UUID contextId = UUID.randomUUID(); // ID of the context (UUID)
    String envVarName = "POSTGRES_USER"; // The name of the environment variable
    try {
      ContextUpdateEnvironmentVariableResponse result = client
              .context
              .updateEnvironmentVariable(value, contextId, envVarName)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariable());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getContextId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#updateEnvironmentVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContextUpdateEnvironmentVariableResponse> response = client
              .context
              .updateEnvironmentVariable(value, contextId, envVarName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContextApi#updateEnvironmentVariable");
      System.err.println("Status code: " + e.getStatusCode());
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
| **contextId** | **UUID**| ID of the context (UUID) | |
| **envVarName** | **String**| The name of the environment variable | |
| **contextUpdateEnvironmentVariableRequest** | [**ContextUpdateEnvironmentVariableRequest**](ContextUpdateEnvironmentVariableRequest.md)|  | [optional] |

### Return type

[**ContextUpdateEnvironmentVariableResponse**](ContextUpdateEnvironmentVariableResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The new environment variable |  -  |
| **0** | Error response. |  -  |

