# OidcTokenManagementApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrgClaims**](OidcTokenManagementApi.md#deleteOrgClaims) | **DELETE** /org/{orgID}/oidc-custom-claims | Delete org-level claims |
| [**deleteProjectClaims**](OidcTokenManagementApi.md#deleteProjectClaims) | **DELETE** /org/{orgID}/project/{projectID}/oidc-custom-claims | Delete project-level claims |
| [**getOrgClaims**](OidcTokenManagementApi.md#getOrgClaims) | **GET** /org/{orgID}/oidc-custom-claims | Get org-level claims |
| [**getProjectClaims**](OidcTokenManagementApi.md#getProjectClaims) | **GET** /org/{orgID}/project/{projectID}/oidc-custom-claims | Get project-level claims |
| [**updateOrgClaims**](OidcTokenManagementApi.md#updateOrgClaims) | **PATCH** /org/{orgID}/oidc-custom-claims | Patch org-level claims |
| [**updateProjectClaims**](OidcTokenManagementApi.md#updateProjectClaims) | **PATCH** /org/{orgID}/project/{projectID}/oidc-custom-claims | Patch project-level claims |


<a name="deleteOrgClaims"></a>
# **deleteOrgClaims**
> ClaimResponse deleteOrgClaims(orgID, claims).execute();

Delete org-level claims

Deletes org-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    String claims = "claims_example"; // comma separated list of claims to delete. Valid values are \"audience\" and \"ttl\".
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .deleteOrgClaims(orgID, claims)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#deleteOrgClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .deleteOrgClaims(orgID, claims)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#deleteOrgClaims");
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
| **orgID** | **UUID**|  | |
| **claims** | **String**| comma separated list of claims to delete. Valid values are \&quot;audience\&quot; and \&quot;ttl\&quot;. | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully deleted. |  -  |

<a name="deleteProjectClaims"></a>
# **deleteProjectClaims**
> ClaimResponse deleteProjectClaims(orgID, projectID, claims).execute();

Delete project-level claims

Deletes project-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    UUID projectID = UUID.randomUUID();
    String claims = "claims_example"; // comma separated list of claims to delete. Valid values are \"audience\" and \"ttl\".
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .deleteProjectClaims(orgID, projectID, claims)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#deleteProjectClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .deleteProjectClaims(orgID, projectID, claims)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#deleteProjectClaims");
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
| **orgID** | **UUID**|  | |
| **projectID** | **UUID**|  | |
| **claims** | **String**| comma separated list of claims to delete. Valid values are \&quot;audience\&quot; and \&quot;ttl\&quot;. | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully deleted. |  -  |

<a name="getOrgClaims"></a>
# **getOrgClaims**
> ClaimResponse getOrgClaims(orgID).execute();

Get org-level claims

Fetches org-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .getOrgClaims(orgID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#getOrgClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .getOrgClaims(orgID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#getOrgClaims");
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
| **orgID** | **UUID**|  | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully fetched. |  -  |

<a name="getProjectClaims"></a>
# **getProjectClaims**
> ClaimResponse getProjectClaims(orgID, projectID).execute();

Get project-level claims

Fetches project-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    UUID projectID = UUID.randomUUID();
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .getProjectClaims(orgID, projectID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#getProjectClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .getProjectClaims(orgID, projectID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#getProjectClaims");
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
| **orgID** | **UUID**|  | |
| **projectID** | **UUID**|  | |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully fetched. |  -  |

<a name="updateOrgClaims"></a>
# **updateOrgClaims**
> ClaimResponse updateOrgClaims(orgID).patchClaimsRequest(patchClaimsRequest).execute();

Patch org-level claims

Creates/Updates org-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    List<String> audience = Arrays.asList();
    String ttl = "ttl_example";
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .updateOrgClaims(orgID)
              .audience(audience)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#updateOrgClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .updateOrgClaims(orgID)
              .audience(audience)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#updateOrgClaims");
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
| **orgID** | **UUID**|  | |
| **patchClaimsRequest** | [**PatchClaimsRequest**](PatchClaimsRequest.md)|  | [optional] |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully patched. |  -  |

<a name="updateProjectClaims"></a>
# **updateProjectClaims**
> ClaimResponse updateProjectClaims(orgID, projectID).patchClaimsRequest(patchClaimsRequest).execute();

Patch project-level claims

Creates/Updates project-level custom claims of OIDC identity tokens

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OidcTokenManagementApi;
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
    UUID orgID = UUID.randomUUID();
    UUID projectID = UUID.randomUUID();
    List<String> audience = Arrays.asList();
    String ttl = "ttl_example";
    try {
      ClaimResponse result = client
              .oidcTokenManagement
              .updateProjectClaims(orgID, projectID)
              .audience(audience)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudience());
      System.out.println(result.getAudienceUpdatedAt());
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getTtl());
      System.out.println(result.getTtlUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#updateProjectClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClaimResponse> response = client
              .oidcTokenManagement
              .updateProjectClaims(orgID, projectID)
              .audience(audience)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OidcTokenManagementApi#updateProjectClaims");
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
| **orgID** | **UUID**|  | |
| **projectID** | **UUID**|  | |
| **patchClaimsRequest** | [**PatchClaimsRequest**](PatchClaimsRequest.md)|  | [optional] |

### Return type

[**ClaimResponse**](ClaimResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claims successfully patched. |  -  |

