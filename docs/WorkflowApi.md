# WorkflowApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveJob**](WorkflowApi.md#approveJob) | **POST** /workflow/{id}/approve/{approval_request_id} | Approve a job |
| [**cancelWorkflow**](WorkflowApi.md#cancelWorkflow) | **POST** /workflow/{id}/cancel | Cancel a workflow |
| [**getById**](WorkflowApi.md#getById) | **GET** /workflow/{id} | Get a workflow |
| [**getJobs**](WorkflowApi.md#getJobs) | **GET** /workflow/{id}/job | Get a workflow&#39;s jobs |
| [**rerunWorkflow**](WorkflowApi.md#rerunWorkflow) | **POST** /workflow/{id}/rerun | Rerun a workflow |


<a name="approveJob"></a>
# **approveJob**
> WorkflowApproveJobResponse approveJob(approvalRequestId, id).execute();

Approve a job

Approves a pending approval job in a workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
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
    UUID approvalRequestId = UUID.randomUUID(); // The ID of the job being approved.
    UUID id = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the workflow.
    try {
      WorkflowApproveJobResponse result = client
              .workflow
              .approveJob(approvalRequestId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#approveJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowApproveJobResponse> response = client
              .workflow
              .approveJob(approvalRequestId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#approveJob");
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
| **approvalRequestId** | **UUID**| The ID of the job being approved. | |
| **id** | **UUID**| The unique ID of the workflow. | |

### Return type

[**WorkflowApproveJobResponse**](WorkflowApproveJobResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

<a name="cancelWorkflow"></a>
# **cancelWorkflow**
> WorkflowCancelWorkflowResponse cancelWorkflow(id).execute();

Cancel a workflow

Cancels a running workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
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
    UUID id = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the workflow.
    try {
      WorkflowCancelWorkflowResponse result = client
              .workflow
              .cancelWorkflow(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#cancelWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowCancelWorkflowResponse> response = client
              .workflow
              .cancelWorkflow(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#cancelWorkflow");
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
| **id** | **UUID**| The unique ID of the workflow. | |

### Return type

[**WorkflowCancelWorkflowResponse**](WorkflowCancelWorkflowResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

<a name="getById"></a>
# **getById**
> WorkflowGetByIdResponse getById(id).execute();

Get a workflow

Returns summary fields of a workflow by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
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
    UUID id = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the workflow.
    try {
      WorkflowGetByIdResponse result = client
              .workflow
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getPipelineId());
      System.out.println(result.getCanceledBy());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getErroredBy());
      System.out.println(result.getTag());
      System.out.println(result.getStatus());
      System.out.println(result.getStartedBy());
      System.out.println(result.getPipelineNumber());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getStoppedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowGetByIdResponse> response = client
              .workflow
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#getById");
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
| **id** | **UUID**| The unique ID of the workflow. | |

### Return type

[**WorkflowGetByIdResponse**](WorkflowGetByIdResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A workflow object. |  -  |
| **0** | Error response. |  -  |

<a name="getJobs"></a>
# **getJobs**
> WorkflowGetJobsResponse getJobs(id).execute();

Get a workflow&#39;s jobs

Returns a sequence of jobs for a workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
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
    UUID id = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the workflow.
    try {
      WorkflowGetJobsResponse result = client
              .workflow
              .getJobs(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#getJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowGetJobsResponse> response = client
              .workflow
              .getJobs(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#getJobs");
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
| **id** | **UUID**| The unique ID of the workflow. | |

### Return type

[**WorkflowGetJobsResponse**](WorkflowGetJobsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated sequence of jobs. |  -  |
| **0** | Error response. |  -  |

<a name="rerunWorkflow"></a>
# **rerunWorkflow**
> WorkflowRerunWorkflowResponse rerunWorkflow(id).workflowRerunWorkflowRequest(workflowRerunWorkflowRequest).execute();

Rerun a workflow

Reruns a workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
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
    UUID id = UUID.fromString("5034460f-c7c4-4c43-9457-de07e2029e7b"); // The unique ID of the workflow.
    Boolean enableSsh = true; // Whether to enable SSH access for the triggering user on the newly-rerun job. Requires the jobs parameter to be used and so is mutually exclusive with the from_failed parameter.
    Boolean fromFailed = true; // Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.
    List<UUID> jobs = Arrays.asList(); // A list of job IDs to rerun.
    Boolean sparseTree = true; // Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter.
    try {
      WorkflowRerunWorkflowResponse result = client
              .workflow
              .rerunWorkflow(id)
              .enableSsh(enableSsh)
              .fromFailed(fromFailed)
              .jobs(jobs)
              .sparseTree(sparseTree)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkflowId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#rerunWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowRerunWorkflowResponse> response = client
              .workflow
              .rerunWorkflow(id)
              .enableSsh(enableSsh)
              .fromFailed(fromFailed)
              .jobs(jobs)
              .sparseTree(sparseTree)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#rerunWorkflow");
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
| **id** | **UUID**| The unique ID of the workflow. | |
| **workflowRerunWorkflowRequest** | [**WorkflowRerunWorkflowRequest**](WorkflowRerunWorkflowRequest.md)|  | [optional] |

### Return type

[**WorkflowRerunWorkflowResponse**](WorkflowRerunWorkflowResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A confirmation message. |  -  |
| **0** | Error response. |  -  |

