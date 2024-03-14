# ProjectApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCheckoutKey**](ProjectApi.md#createCheckoutKey) | **POST** /project/{project-slug}/checkout-key | Create a new checkout key |
| [**createEnvVar**](ProjectApi.md#createEnvVar) | **POST** /project/{project-slug}/envvar | Create an environment variable |
| [**createProjectDefaultSettings**](ProjectApi.md#createProjectDefaultSettings) | **POST** /project/{provider}/{organization}/{project} | 🧪 Create a project |
| [**deleteCheckoutKeyByFingerprint**](ProjectApi.md#deleteCheckoutKeyByFingerprint) | **DELETE** /project/{project-slug}/checkout-key/{fingerprint} | Delete a checkout key |
| [**deleteEnvironmentVariable**](ProjectApi.md#deleteEnvironmentVariable) | **DELETE** /project/{project-slug}/envvar/{name} | Delete an environment variable |
| [**getBySlug**](ProjectApi.md#getBySlug) | **GET** /project/{project-slug} | Get a project |
| [**getCheckoutKeyByFingerprint**](ProjectApi.md#getCheckoutKeyByFingerprint) | **GET** /project/{project-slug}/checkout-key/{fingerprint} | Get a checkout key |
| [**getMaskedEnvVar**](ProjectApi.md#getMaskedEnvVar) | **GET** /project/{project-slug}/envvar/{name} | Get a masked environment variable |
| [**getSettings**](ProjectApi.md#getSettings) | **GET** /project/{provider}/{organization}/{project}/settings | 🧪 Get project settings |
| [**listCheckoutKeys**](ProjectApi.md#listCheckoutKeys) | **GET** /project/{project-slug}/checkout-key | Get all checkout keys |
| [**listEnvVarValues**](ProjectApi.md#listEnvVarValues) | **GET** /project/{project-slug}/envvar | List all environment variables |
| [**updateSettings**](ProjectApi.md#updateSettings) | **PATCH** /project/{provider}/{organization}/{project}/settings | 🧪 Update project settings |


<a name="createCheckoutKey"></a>
# **createCheckoutKey**
> ProjectCreateCheckoutKeyResponse createCheckoutKey(projectSlug).projectCreateCheckoutKeyRequest(projectCreateCheckoutKeyRequest).execute();

Create a new checkout key

Not available to projects that use GitLab or GitHub App. Creates a new checkout key. This API request is only usable with a user API token.                            Please ensure that you have authorized your account with GitHub before creating user keys.                            This is necessary to give CircleCI the permission to create a user key associated with                            your GitHub user account. You can find this page by visiting Project Settings &gt; Checkout SSH Keys

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String type = "user-key"; // The type of checkout key to create. This may be either `deploy-key` or `user-key`.
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    try {
      ProjectCreateCheckoutKeyResponse result = client
              .project
              .createCheckoutKey(type, projectSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getPublicKey());
      System.out.println(result.getType());
      System.out.println(result.getFingerprint());
      System.out.println(result.getPreferred());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createCheckoutKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectCreateCheckoutKeyResponse> response = client
              .project
              .createCheckoutKey(type, projectSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createCheckoutKey");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **projectCreateCheckoutKeyRequest** | [**ProjectCreateCheckoutKeyRequest**](ProjectCreateCheckoutKeyRequest.md)|  | [optional] |

### Return type

[**ProjectCreateCheckoutKeyResponse**](ProjectCreateCheckoutKeyResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The checkout key. |  -  |
| **0** | Error response. |  -  |

<a name="createEnvVar"></a>
# **createEnvVar**
> ProjectCreateEnvVarResponse createEnvVar(projectSlug).projectCreateEnvVarRequest(projectCreateEnvVarRequest).execute();

Create an environment variable

Creates a new environment variable.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String name = "name_example"; // The name of the environment variable.
    String value = "value_example"; // The value of the environment variable.
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    try {
      ProjectCreateEnvVarResponse result = client
              .project
              .createEnvVar(name, value, projectSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getValue());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createEnvVar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectCreateEnvVarResponse> response = client
              .project
              .createEnvVar(name, value, projectSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createEnvVar");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **projectCreateEnvVarRequest** | [**ProjectCreateEnvVarRequest**](ProjectCreateEnvVarRequest.md)|  | [optional] |

### Return type

[**ProjectCreateEnvVarResponse**](ProjectCreateEnvVarResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The environment variable. |  -  |
| **0** | Error response. |  -  |

<a name="createProjectDefaultSettings"></a>
# **createProjectDefaultSettings**
> ProjectSettings createProjectDefaultSettings(provider, organization, project).execute();

🧪 Create a project

[__EXPERIMENTAL__]  Creates a new CircleCI project, and returns a list of the default advanced settings. Can only be called on a repo with a main branch and an existing config.yml file. Not yet available to projects that use GitLab or GitHub App.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String provider = "gh"; // The `provider` segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use `circleci`.
    String organization = "CircleCI-Public"; // The `organization` segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings).
    String project = "api-preview-docs"; // The `project` segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings).
    try {
      ProjectSettings result = client
              .project
              .createProjectDefaultSettings(provider, organization, project)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdvanced());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createProjectDefaultSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectSettings> response = client
              .project
              .createProjectDefaultSettings(provider, organization, project)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createProjectDefaultSettings");
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
| **provider** | **String**| The &#x60;provider&#x60; segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60;. | |
| **organization** | **String**| The &#x60;organization&#x60; segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings). | |
| **project** | **String**| The &#x60;project&#x60; segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings). | |

### Return type

[**ProjectSettings**](ProjectSettings.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response. |  -  |

<a name="deleteCheckoutKeyByFingerprint"></a>
# **deleteCheckoutKeyByFingerprint**
> ProjectDeleteCheckoutKeyByFingerprintResponse deleteCheckoutKeyByFingerprint(projectSlug, fingerprint).execute();

Delete a checkout key

Deletes the checkout key via md5 or sha256 fingerprint. sha256 keys should be url-encoded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String fingerprint = "c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f"; // An SSH key fingerprint.
    try {
      ProjectDeleteCheckoutKeyByFingerprintResponse result = client
              .project
              .deleteCheckoutKeyByFingerprint(projectSlug, fingerprint)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deleteCheckoutKeyByFingerprint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectDeleteCheckoutKeyByFingerprintResponse> response = client
              .project
              .deleteCheckoutKeyByFingerprint(projectSlug, fingerprint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deleteCheckoutKeyByFingerprint");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **fingerprint** | **String**| An SSH key fingerprint. | |

### Return type

[**ProjectDeleteCheckoutKeyByFingerprintResponse**](ProjectDeleteCheckoutKeyByFingerprintResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

<a name="deleteEnvironmentVariable"></a>
# **deleteEnvironmentVariable**
> ProjectDeleteEnvironmentVariableResponse deleteEnvironmentVariable(projectSlug, name).execute();

Delete an environment variable

Deletes the environment variable named :name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String name = "foo"; // The name of the environment variable.
    try {
      ProjectDeleteEnvironmentVariableResponse result = client
              .project
              .deleteEnvironmentVariable(projectSlug, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deleteEnvironmentVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectDeleteEnvironmentVariableResponse> response = client
              .project
              .deleteEnvironmentVariable(projectSlug, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deleteEnvironmentVariable");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **name** | **String**| The name of the environment variable. | |

### Return type

[**ProjectDeleteEnvironmentVariableResponse**](ProjectDeleteEnvironmentVariableResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

<a name="getBySlug"></a>
# **getBySlug**
> ProjectGetBySlugResponse getBySlug(projectSlug).execute();

Get a project

Retrieves a project by project slug.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    try {
      ProjectGetBySlugResponse result = client
              .project
              .getBySlug(projectSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getSlug());
      System.out.println(result.getName());
      System.out.println(result.getId());
      System.out.println(result.getOrganizationName());
      System.out.println(result.getOrganizationSlug());
      System.out.println(result.getOrganizationId());
      System.out.println(result.getVcsInfo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getBySlug");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectGetBySlugResponse> response = client
              .project
              .getBySlug(projectSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getBySlug");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |

### Return type

[**ProjectGetBySlugResponse**](ProjectGetBySlugResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A project object |  -  |
| **0** | Error response. |  -  |

<a name="getCheckoutKeyByFingerprint"></a>
# **getCheckoutKeyByFingerprint**
> ProjectGetCheckoutKeyByFingerprintResponse getCheckoutKeyByFingerprint(projectSlug, fingerprint).execute();

Get a checkout key

Returns an individual checkout key via md5 or sha256 fingerprint. sha256 keys should be url-encoded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String fingerprint = "c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f"; // An SSH key fingerprint.
    try {
      ProjectGetCheckoutKeyByFingerprintResponse result = client
              .project
              .getCheckoutKeyByFingerprint(projectSlug, fingerprint)
              .execute();
      System.out.println(result);
      System.out.println(result.getPublicKey());
      System.out.println(result.getType());
      System.out.println(result.getFingerprint());
      System.out.println(result.getPreferred());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getCheckoutKeyByFingerprint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectGetCheckoutKeyByFingerprintResponse> response = client
              .project
              .getCheckoutKeyByFingerprint(projectSlug, fingerprint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getCheckoutKeyByFingerprint");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **fingerprint** | **String**| An SSH key fingerprint. | |

### Return type

[**ProjectGetCheckoutKeyByFingerprintResponse**](ProjectGetCheckoutKeyByFingerprintResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The checkout key. |  -  |
| **0** | Error response. |  -  |

<a name="getMaskedEnvVar"></a>
# **getMaskedEnvVar**
> ProjectGetMaskedEnvVarResponse getMaskedEnvVar(projectSlug, name).execute();

Get a masked environment variable

Returns the masked value of environment variable :name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String name = "foo"; // The name of the environment variable.
    try {
      ProjectGetMaskedEnvVarResponse result = client
              .project
              .getMaskedEnvVar(projectSlug, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getValue());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getMaskedEnvVar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectGetMaskedEnvVarResponse> response = client
              .project
              .getMaskedEnvVar(projectSlug, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getMaskedEnvVar");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **name** | **String**| The name of the environment variable. | |

### Return type

[**ProjectGetMaskedEnvVarResponse**](ProjectGetMaskedEnvVarResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The environment variable. |  -  |
| **0** | Error response. |  -  |

<a name="getSettings"></a>
# **getSettings**
> ProjectSettings getSettings(provider, organization, project).execute();

🧪 Get project settings

[__EXPERIMENTAL__] Returns a list of the advanced settings for a CircleCI project, whether enabled (true) or not (false).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String provider = "gh"; // The `provider` segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use `circleci`.
    String organization = "CircleCI-Public"; // The `organization` segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings).
    String project = "api-preview-docs"; // The `project` segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings).
    try {
      ProjectSettings result = client
              .project
              .getSettings(provider, organization, project)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdvanced());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectSettings> response = client
              .project
              .getSettings(provider, organization, project)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getSettings");
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
| **provider** | **String**| The &#x60;provider&#x60; segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60;. | |
| **organization** | **String**| The &#x60;organization&#x60; segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings). | |
| **project** | **String**| The &#x60;project&#x60; segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings). | |

### Return type

[**ProjectSettings**](ProjectSettings.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |

<a name="listCheckoutKeys"></a>
# **listCheckoutKeys**
> ProjectListCheckoutKeysResponse listCheckoutKeys(projectSlug).digest(digest).execute();

Get all checkout keys

Returns a sequence of checkout keys for &#x60;:project&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String digest = "sha256"; // The fingerprint digest type to return. This may be either `md5` or `sha256`. If not passed, defaults to `md5`.
    try {
      ProjectListCheckoutKeysResponse result = client
              .project
              .listCheckoutKeys(projectSlug)
              .digest(digest)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listCheckoutKeys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectListCheckoutKeysResponse> response = client
              .project
              .listCheckoutKeys(projectSlug)
              .digest(digest)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listCheckoutKeys");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |
| **digest** | **String**| The fingerprint digest type to return. This may be either &#x60;md5&#x60; or &#x60;sha256&#x60;. If not passed, defaults to &#x60;md5&#x60;. | [optional] [enum: sha256, md5] |

### Return type

[**ProjectListCheckoutKeysResponse**](ProjectListCheckoutKeysResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of checkout keys. |  -  |
| **0** | Error response. |  -  |

<a name="listEnvVarValues"></a>
# **listEnvVarValues**
> ProjectListEnvVarValuesResponse listEnvVarValues(projectSlug).execute();

List all environment variables

Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    try {
      ProjectListEnvVarValuesResponse result = client
              .project
              .listEnvVarValues(projectSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listEnvVarValues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectListEnvVarValuesResponse> response = client
              .project
              .listEnvVarValues(projectSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listEnvVarValues");
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
| **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). | |

### Return type

[**ProjectListEnvVarValuesResponse**](ProjectListEnvVarValuesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of environment variables. |  -  |
| **0** | Error response. |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> ProjectSettings updateSettings(provider, organization, project, projectSettings).execute();

🧪 Update project settings

[__EXPERIMENTAL__] Updates one or more of the advanced settings for a CircleCI project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
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
    String provider = "gh"; // The `provider` segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use `circleci`.
    String organization = "CircleCI-Public"; // The `organization` segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings).
    String project = "api-preview-docs"; // The `project` segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings).
    ProjectSettingsAdvanced advanced = new ProjectSettingsAdvanced();
    try {
      ProjectSettings result = client
              .project
              .updateSettings(provider, organization, project)
              .advanced(advanced)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdvanced());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectSettings> response = client
              .project
              .updateSettings(provider, organization, project)
              .advanced(advanced)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#updateSettings");
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
| **provider** | **String**| The &#x60;provider&#x60; segment of a project or org slug, the first of the three. This may be a VCS. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60;. | |
| **organization** | **String**| The &#x60;organization&#x60; segment of a project or org slug, the second of the three. For GitHub OAuth or Bitbucket projects, this is the organization name. For projects that use GitLab or GitHub App, use the organization ID (found in Organization Settings). | |
| **project** | **String**| The &#x60;project&#x60; segment of a project slug, the third of the three. For GitHub OAuth or Bitbucket projects, this is the repository name. For projects that use GitLab or GitHub App, use the project ID (found in Project Settings). | |
| **projectSettings** | [**ProjectSettings**](ProjectSettings.md)| The setting(s) to update, including one or more fields in the JSON object. Note that &#x60;oss: true&#x60; will only be set on projects whose underlying repositories are actually open source. | |

### Return type

[**ProjectSettings**](ProjectSettings.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Always includes the full advanced settings object. Returned even when the provided updates match the existing settings, but can also be returned when &#x60;oss: true&#x60; fails to set. |  -  |

