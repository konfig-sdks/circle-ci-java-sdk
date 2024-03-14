# PipelineApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**continueExecution**](PipelineApi.md#continueExecution) | **POST** /pipeline/continue | Continue a pipeline |
| [**getAllPipelines**](PipelineApi.md#getAllPipelines) | **GET** /project/{project-slug}/pipeline | Get all pipelines |
| [**getById**](PipelineApi.md#getById) | **GET** /pipeline/{pipeline-id} | Get a pipeline by ID |
| [**getByNumber**](PipelineApi.md#getByNumber) | **GET** /project/{project-slug}/pipeline/{pipeline-number} | Get a pipeline by pipeline number |
| [**getConfigurationById**](PipelineApi.md#getConfigurationById) | **GET** /pipeline/{pipeline-id}/config | Get a pipeline&#39;s configuration |
| [**listRecentPipelines**](PipelineApi.md#listRecentPipelines) | **GET** /pipeline | Get a list of pipelines |
| [**listUserPipelines**](PipelineApi.md#listUserPipelines) | **GET** /project/{project-slug}/pipeline/mine | Get your pipelines |
| [**listWorkflows**](PipelineApi.md#listWorkflows) | **GET** /pipeline/{pipeline-id}/workflow | Get a pipeline&#39;s workflows |
| [**triggerNewPipeline**](PipelineApi.md#triggerNewPipeline) | **POST** /project/{project-slug}/pipeline | Trigger a new pipeline |


<a name="continueExecution"></a>
# **continueExecution**
> PipelineContinueExecutionResponse continueExecution().pipelineContinueExecutionRequest(pipelineContinueExecutionRequest).execute();

Continue a pipeline

Continue a pipeline from the setup phase. For information on using pipeline parameters with dynamic configuration, see the [Pipeline values and parameters](https://circleci.com/docs/pipeline-variables/#pipeline-parameters-and-dynamic-configuration) docs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    String continuationKey = "continuationKey_example"; // A pipeline continuation key.
    String _configuration = "_configuration_example"; // A configuration string for the pipeline.
    Map<String, Object> parameters = new HashMap(); // An object containing pipeline parameters and their values.
    try {
      PipelineContinueExecutionResponse result = client
              .pipeline
              .continueExecution(continuationKey, _configuration)
              .parameters(parameters)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#continueExecution");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineContinueExecutionResponse> response = client
              .pipeline
              .continueExecution(continuationKey, _configuration)
              .parameters(parameters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#continueExecution");
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
| **pipelineContinueExecutionRequest** | [**PipelineContinueExecutionRequest**](PipelineContinueExecutionRequest.md)|  | [optional] |

### Return type

[**PipelineContinueExecutionResponse**](PipelineContinueExecutionResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

<a name="getAllPipelines"></a>
# **getAllPipelines**
> PipelineGetAllPipelinesResponse getAllPipelines(projectSlug).branch(branch).pageToken(pageToken).execute();

Get all pipelines

Returns all pipelines for this project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    String branch = "branch_example"; // The name of a vcs branch.
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    try {
      PipelineGetAllPipelinesResponse result = client
              .pipeline
              .getAllPipelines(projectSlug)
              .branch(branch)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getAllPipelines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineGetAllPipelinesResponse> response = client
              .pipeline
              .getAllPipelines(projectSlug)
              .branch(branch)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getAllPipelines");
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
| **branch** | **String**| The name of a vcs branch. | [optional] |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |

### Return type

[**PipelineGetAllPipelinesResponse**](PipelineGetAllPipelinesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of pipelines. |  -  |
| **0** | Error response. |  -  |

<a name="getById"></a>
# **getById**
> PipelineGetByIdResponse getById(pipelineId).execute();

Get a pipeline by ID

Returns a pipeline by the pipeline ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    UUID pipelineId = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the pipeline.
    try {
      PipelineGetByIdResponse result = client
              .pipeline
              .getById(pipelineId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getErrors());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getNumber());
      System.out.println(result.getTriggerParameters());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getTrigger());
      System.out.println(result.getVcs());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineGetByIdResponse> response = client
              .pipeline
              .getById(pipelineId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getById");
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
| **pipelineId** | **UUID**| The unique ID of the pipeline. | |

### Return type

[**PipelineGetByIdResponse**](PipelineGetByIdResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A pipeline object. |  -  |
| **0** | Error response. |  -  |

<a name="getByNumber"></a>
# **getByNumber**
> PipelineGetByNumberResponse getByNumber(projectSlug, pipelineNumber).execute();

Get a pipeline by pipeline number

Returns a pipeline by the pipeline number.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    Object pipelineNumber = 123; // The number of the pipeline.
    try {
      PipelineGetByNumberResponse result = client
              .pipeline
              .getByNumber(projectSlug, pipelineNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getErrors());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getNumber());
      System.out.println(result.getTriggerParameters());
      System.out.println(result.getState());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getTrigger());
      System.out.println(result.getVcs());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getByNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineGetByNumberResponse> response = client
              .pipeline
              .getByNumber(projectSlug, pipelineNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getByNumber");
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
| **pipelineNumber** | [**Object**](.md)| The number of the pipeline. | |

### Return type

[**PipelineGetByNumberResponse**](PipelineGetByNumberResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A pipeline object. |  -  |
| **0** | Error response. |  -  |

<a name="getConfigurationById"></a>
# **getConfigurationById**
> PipelineGetConfigurationByIdResponse getConfigurationById(pipelineId).execute();

Get a pipeline&#39;s configuration

Returns a pipeline&#39;s configuration by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    UUID pipelineId = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the pipeline.
    try {
      PipelineGetConfigurationByIdResponse result = client
              .pipeline
              .getConfigurationById(pipelineId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSource());
      System.out.println(result.getCompiled());
      System.out.println(result.getSetupConfig());
      System.out.println(result.getCompiledSetupConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getConfigurationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineGetConfigurationByIdResponse> response = client
              .pipeline
              .getConfigurationById(pipelineId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#getConfigurationById");
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
| **pipelineId** | **UUID**| The unique ID of the pipeline. | |

### Return type

[**PipelineGetConfigurationByIdResponse**](PipelineGetConfigurationByIdResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The configuration strings for the pipeline. |  -  |
| **0** | Error response. |  -  |

<a name="listRecentPipelines"></a>
# **listRecentPipelines**
> PipelineListRecentPipelinesResponse listRecentPipelines().orgSlug(orgSlug).pageToken(pageToken).mine(mine).execute();

Get a list of pipelines

Returns all pipelines for the most recently built projects (max 250) you follow in an organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    String orgSlug = "gh/CircleCI-Public"; // Org slug in the form `vcs-slug/org-name`. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug` and replace the `org-name` with the organization ID (found in Organization Settings).
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    Boolean mine = true; // Only include entries created by your user.
    try {
      PipelineListRecentPipelinesResponse result = client
              .pipeline
              .listRecentPipelines()
              .orgSlug(orgSlug)
              .pageToken(pageToken)
              .mine(mine)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listRecentPipelines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineListRecentPipelinesResponse> response = client
              .pipeline
              .listRecentPipelines()
              .orgSlug(orgSlug)
              .pageToken(pageToken)
              .mine(mine)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listRecentPipelines");
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
| **orgSlug** | **String**| Org slug in the form &#x60;vcs-slug/org-name&#x60;. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60; and replace the &#x60;org-name&#x60; with the organization ID (found in Organization Settings). | [optional] |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |
| **mine** | **Boolean**| Only include entries created by your user. | [optional] |

### Return type

[**PipelineListRecentPipelinesResponse**](PipelineListRecentPipelinesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of pipelines. |  -  |
| **0** | Error response. |  -  |

<a name="listUserPipelines"></a>
# **listUserPipelines**
> PipelineListUserPipelinesResponse listUserPipelines(projectSlug).pageToken(pageToken).execute();

Get your pipelines

Returns a sequence of all pipelines for this project triggered by the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    try {
      PipelineListUserPipelinesResponse result = client
              .pipeline
              .listUserPipelines(projectSlug)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listUserPipelines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineListUserPipelinesResponse> response = client
              .pipeline
              .listUserPipelines(projectSlug)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listUserPipelines");
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
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |

### Return type

[**PipelineListUserPipelinesResponse**](PipelineListUserPipelinesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of pipelines. |  -  |
| **0** | Error response. |  -  |

<a name="listWorkflows"></a>
# **listWorkflows**
> PipelineListWorkflowsResponse listWorkflows(pipelineId).pageToken(pageToken).execute();

Get a pipeline&#39;s workflows

Returns a paginated list of workflows by pipeline ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    UUID pipelineId = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the pipeline.
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    try {
      PipelineListWorkflowsResponse result = client
              .pipeline
              .listWorkflows(pipelineId)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listWorkflows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineListWorkflowsResponse> response = client
              .pipeline
              .listWorkflows(pipelineId)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#listWorkflows");
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
| **pipelineId** | **UUID**| The unique ID of the pipeline. | |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |

### Return type

[**PipelineListWorkflowsResponse**](PipelineListWorkflowsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of workflow objects. |  -  |
| **0** | Error response. |  -  |

<a name="triggerNewPipeline"></a>
# **triggerNewPipeline**
> PipelineTriggerNewPipelineResponse triggerNewPipeline(projectSlug).pipelineTriggerNewPipelineRequest(pipelineTriggerNewPipelineRequest).execute();

Trigger a new pipeline

Not yet available to projects that use GitLab or GitHub App. Triggers a new pipeline on the project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PipelineApi;
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
    Map<String, Object> parameters = new HashMap(); // An object containing pipeline parameters and their values.
    String branch = "branch_example"; // The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that `branch` and `tag` are mutually exclusive. To trigger a pipeline for a PR by number use `pull/<number>/head` for the PR ref or `pull/<number>/merge` for the merge ref (GitHub only).
    String tag = "tag_example"; // The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that `branch` and `tag` are mutually exclusive.
    try {
      PipelineTriggerNewPipelineResponse result = client
              .pipeline
              .triggerNewPipeline(projectSlug)
              .parameters(parameters)
              .branch(branch)
              .tag(tag)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getState());
      System.out.println(result.getNumber());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#triggerNewPipeline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PipelineTriggerNewPipelineResponse> response = client
              .pipeline
              .triggerNewPipeline(projectSlug)
              .parameters(parameters)
              .branch(branch)
              .tag(tag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineApi#triggerNewPipeline");
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
| **pipelineTriggerNewPipelineRequest** | [**PipelineTriggerNewPipelineRequest**](PipelineTriggerNewPipelineRequest.md)|  | [optional] |

### Return type

[**PipelineTriggerNewPipelineResponse**](PipelineTriggerNewPipelineResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created pipeline. |  -  |
| **0** | Error response. |  -  |

