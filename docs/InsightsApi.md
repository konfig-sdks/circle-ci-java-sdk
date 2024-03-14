# InsightsApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFlakyTests**](InsightsApi.md#getFlakyTests) | **GET** /insights/{project-slug}/flaky-tests | Get flaky tests for a project |
| [**getJobTimeseriesData**](InsightsApi.md#getJobTimeseriesData) | **GET** /insights/time-series/{project-slug}/workflows/{workflow-name}/jobs | Job timeseries data |
| [**getProjectSummaryMetrics**](InsightsApi.md#getProjectSummaryMetrics) | **GET** /insights/pages/{project-slug}/summary | Get summary metrics and trends for a project across it&#39;s workflows and branches |
| [**getProjectWorkflowJobMetrics**](InsightsApi.md#getProjectWorkflowJobMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/jobs | Get summary metrics for a project workflow&#39;s jobs. |
| [**getProjectWorkflowMetrics**](InsightsApi.md#getProjectWorkflowMetrics) | **GET** /insights/{project-slug}/workflows | Get summary metrics for a project&#39;s workflows |
| [**getProjectWorkflowTestMetrics**](InsightsApi.md#getProjectWorkflowTestMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/test-metrics | Get test metrics for a project&#39;s workflows |
| [**getRecentWorkflowRuns**](InsightsApi.md#getRecentWorkflowRuns) | **GET** /insights/{project-slug}/workflows/{workflow-name} | Get recent runs of a workflow |
| [**getSummaryMetricsWithTrends**](InsightsApi.md#getSummaryMetricsWithTrends) | **GET** /insights/{org-slug}/summary | Get summary metrics with trends for the entire org, and for each project. |
| [**getWorkflowSummaryMetrics**](InsightsApi.md#getWorkflowSummaryMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/summary | Get metrics and trends for workflows |
| [**listProjectBranches**](InsightsApi.md#listProjectBranches) | **GET** /insights/{project-slug}/branches | Get all branches for a project |


<a name="getFlakyTests"></a>
# **getFlakyTests**
> InsightsGetFlakyTestsResponse getFlakyTests(projectSlug).execute();

Get flaky tests for a project

Get a list of flaky tests for a given project. Flaky tests are branch agnostic.              A flaky test is a test that passed and failed in the same commit.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
      InsightsGetFlakyTestsResponse result = client
              .insights
              .getFlakyTests(projectSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getFlakyTests());
      System.out.println(result.getTotalFlakyTests());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getFlakyTests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetFlakyTestsResponse> response = client
              .insights
              .getFlakyTests(projectSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getFlakyTests");
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

[**InsightsGetFlakyTestsResponse**](InsightsGetFlakyTestsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of flaky tests for a project |  -  |
| **0** | Error response. |  -  |

<a name="getJobTimeseriesData"></a>
# **getJobTimeseriesData**
> InsightsGetJobTimeseriesDataResponse getJobTimeseriesData(projectSlug, workflowName).branch(branch).granularity(granularity).startDate(startDate).endDate(endDate).execute();

Job timeseries data

Get timeseries data for all jobs within a workflow. Hourly granularity data is only retained for 48 hours while daily granularity data is retained for 90 days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of the workflow.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    String granularity = "daily"; // The granularity for which to query timeseries data.
    OffsetDateTime startDate = OffsetDateTime.parse("2020-08-21T13:26:29Z"); // Include only executions that started at or after this date. This must be specified if an end-date is provided.
    OffsetDateTime endDate = OffsetDateTime.parse("2020-09-04T13:26:29Z"); // Include only executions that started before this date. This date can be at most 90 days after the start-date.
    try {
      InsightsGetJobTimeseriesDataResponse result = client
              .insights
              .getJobTimeseriesData(projectSlug, workflowName)
              .branch(branch)
              .granularity(granularity)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getJobTimeseriesData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetJobTimeseriesDataResponse> response = client
              .insights
              .getJobTimeseriesData(projectSlug, workflowName)
              .branch(branch)
              .granularity(granularity)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getJobTimeseriesData");
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
| **workflowName** | **String**| The name of the workflow. | |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |
| **granularity** | **String**| The granularity for which to query timeseries data. | [optional] [enum: daily, hourly] |
| **startDate** | **OffsetDateTime**| Include only executions that started at or after this date. This must be specified if an end-date is provided. | [optional] |
| **endDate** | **OffsetDateTime**| Include only executions that started before this date. This date can be at most 90 days after the start-date. | [optional] |

### Return type

[**InsightsGetJobTimeseriesDataResponse**](InsightsGetJobTimeseriesDataResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of timeseries data, one entry per job. |  -  |
| **0** | Error response. |  -  |

<a name="getProjectSummaryMetrics"></a>
# **getProjectSummaryMetrics**
> InsightsGetProjectSummaryMetricsResponse getProjectSummaryMetrics(projectSlug).reportingWindow(reportingWindow).branches(branches).workflowNames(workflowNames).execute();

Get summary metrics and trends for a project across it&#39;s workflows and branches

Get summary metrics and trends for a project at workflow and branch level.              Workflow runs going back at most 90 days are included in the aggregation window.              Trends are only supported upto last 30 days.              Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String reportingWindow = "last-7-days"; // The time window used to calculate summary metrics. If not provided, defaults to last-90-days
    Object branches = new HashMap(); // The names of VCS branches to include in branch-level workflow metrics.
    Object workflowNames = new HashMap(); // The names of workflows to include in workflow-level metrics.
    try {
      InsightsGetProjectSummaryMetricsResponse result = client
              .insights
              .getProjectSummaryMetrics(projectSlug)
              .reportingWindow(reportingWindow)
              .branches(branches)
              .workflowNames(workflowNames)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getProjectData());
      System.out.println(result.getProjectWorkflowData());
      System.out.println(result.getProjectWorkflowBranchData());
      System.out.println(result.getAllBranches());
      System.out.println(result.getAllWorkflows());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectSummaryMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetProjectSummaryMetricsResponse> response = client
              .insights
              .getProjectSummaryMetrics(projectSlug)
              .reportingWindow(reportingWindow)
              .branches(branches)
              .workflowNames(workflowNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectSummaryMetrics");
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
| **reportingWindow** | **String**| The time window used to calculate summary metrics. If not provided, defaults to last-90-days | [optional] [enum: last-7-days, last-90-days, last-24-hours, last-30-days, last-60-days] |
| **branches** | [**Object**](.md)| The names of VCS branches to include in branch-level workflow metrics. | [optional] |
| **workflowNames** | [**Object**](.md)| The names of workflows to include in workflow-level metrics. | [optional] |

### Return type

[**InsightsGetProjectSummaryMetricsResponse**](InsightsGetProjectSummaryMetricsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Aggregated summary metrics and trends by workflow and branches |  -  |
| **0** | Error response. |  -  |

<a name="getProjectWorkflowJobMetrics"></a>
# **getProjectWorkflowJobMetrics**
> InsightsGetProjectWorkflowJobMetricsResponse getProjectWorkflowJobMetrics(projectSlug, workflowName).pageToken(pageToken).allBranches(allBranches).branch(branch).reportingWindow(reportingWindow).execute();

Get summary metrics for a project workflow&#39;s jobs.

Get summary metrics for a project workflow&#39;s jobs. Job runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of the workflow.
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    Boolean allBranches = true; // Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    String reportingWindow = "last-7-days"; // The time window used to calculate summary metrics. If not provided, defaults to last-90-days
    try {
      InsightsGetProjectWorkflowJobMetricsResponse result = client
              .insights
              .getProjectWorkflowJobMetrics(projectSlug, workflowName)
              .pageToken(pageToken)
              .allBranches(allBranches)
              .branch(branch)
              .reportingWindow(reportingWindow)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowJobMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetProjectWorkflowJobMetricsResponse> response = client
              .insights
              .getProjectWorkflowJobMetrics(projectSlug, workflowName)
              .pageToken(pageToken)
              .allBranches(allBranches)
              .branch(branch)
              .reportingWindow(reportingWindow)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowJobMetrics");
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
| **workflowName** | **String**| The name of the workflow. | |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |
| **allBranches** | **Boolean**| Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter. | [optional] |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |
| **reportingWindow** | **String**| The time window used to calculate summary metrics. If not provided, defaults to last-90-days | [optional] [enum: last-7-days, last-90-days, last-24-hours, last-30-days, last-60-days] |

### Return type

[**InsightsGetProjectWorkflowJobMetricsResponse**](InsightsGetProjectWorkflowJobMetricsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of summary metrics by workflow job. |  -  |
| **0** | Error response. |  -  |

<a name="getProjectWorkflowMetrics"></a>
# **getProjectWorkflowMetrics**
> InsightsGetProjectWorkflowMetricsResponse getProjectWorkflowMetrics(projectSlug).pageToken(pageToken).allBranches(allBranches).branch(branch).reportingWindow(reportingWindow).execute();

Get summary metrics for a project&#39;s workflows

Get summary metrics for a project&#39;s workflows.  Workflow runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours.  Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    Boolean allBranches = true; // Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    String reportingWindow = "last-7-days"; // The time window used to calculate summary metrics. If not provided, defaults to last-90-days
    try {
      InsightsGetProjectWorkflowMetricsResponse result = client
              .insights
              .getProjectWorkflowMetrics(projectSlug)
              .pageToken(pageToken)
              .allBranches(allBranches)
              .branch(branch)
              .reportingWindow(reportingWindow)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetProjectWorkflowMetricsResponse> response = client
              .insights
              .getProjectWorkflowMetrics(projectSlug)
              .pageToken(pageToken)
              .allBranches(allBranches)
              .branch(branch)
              .reportingWindow(reportingWindow)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowMetrics");
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
| **allBranches** | **Boolean**| Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter. | [optional] |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |
| **reportingWindow** | **String**| The time window used to calculate summary metrics. If not provided, defaults to last-90-days | [optional] [enum: last-7-days, last-90-days, last-24-hours, last-30-days, last-60-days] |

### Return type

[**InsightsGetProjectWorkflowMetricsResponse**](InsightsGetProjectWorkflowMetricsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of summary metrics by workflow |  -  |
| **0** | Error response. |  -  |

<a name="getProjectWorkflowTestMetrics"></a>
# **getProjectWorkflowTestMetrics**
> InsightsGetProjectWorkflowTestMetricsResponse getProjectWorkflowTestMetrics(projectSlug, workflowName).branch(branch).allBranches(allBranches).execute();

Get test metrics for a project&#39;s workflows

Get test metrics for a project&#39;s workflows. Currently tests metrics are calculated based on 10 most recent workflow runs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of the workflow.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    Boolean allBranches = true; // Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter.
    try {
      InsightsGetProjectWorkflowTestMetricsResponse result = client
              .insights
              .getProjectWorkflowTestMetrics(projectSlug, workflowName)
              .branch(branch)
              .allBranches(allBranches)
              .execute();
      System.out.println(result);
      System.out.println(result.getAverageTestCount());
      System.out.println(result.getMostFailedTests());
      System.out.println(result.getMostFailedTestsExtra());
      System.out.println(result.getSlowestTests());
      System.out.println(result.getSlowestTestsExtra());
      System.out.println(result.getTotalTestRuns());
      System.out.println(result.getTestRuns());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowTestMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetProjectWorkflowTestMetricsResponse> response = client
              .insights
              .getProjectWorkflowTestMetrics(projectSlug, workflowName)
              .branch(branch)
              .allBranches(allBranches)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getProjectWorkflowTestMetrics");
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
| **workflowName** | **String**| The name of the workflow. | |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |
| **allBranches** | **Boolean**| Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter. | [optional] |

### Return type

[**InsightsGetProjectWorkflowTestMetricsResponse**](InsightsGetProjectWorkflowTestMetricsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of test metrics by workflow |  -  |
| **0** | Error response. |  -  |

<a name="getRecentWorkflowRuns"></a>
# **getRecentWorkflowRuns**
> InsightsGetRecentWorkflowRunsResponse getRecentWorkflowRuns(projectSlug, workflowName).allBranches(allBranches).branch(branch).pageToken(pageToken).startDate(startDate).endDate(endDate).execute();

Get recent runs of a workflow

Get recent runs of a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a financial reporting tool and should not be used for precise credit reporting.  Credit reporting from Insights does not use the same source of truth as the billing information that is found in the Plan Overview page in the CircleCI UI, nor does the underlying data have the same data accuracy guarantees as the billing information in the CircleCI UI.  This may lead to discrepancies between credits reported from Insights and the billing information in the Plan Overview page of the CircleCI UI.  For precise credit reporting, always use the Plan Overview page in the CircleCI UI.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of the workflow.
    Boolean allBranches = true; // Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    String pageToken = "pageToken_example"; // A token to retrieve the next page of results.
    OffsetDateTime startDate = OffsetDateTime.parse("2020-08-21T13:26:29Z"); // Include only executions that started at or after this date. This must be specified if an end-date is provided.
    OffsetDateTime endDate = OffsetDateTime.parse("2020-09-04T13:26:29Z"); // Include only executions that started before this date. This date can be at most 90 days after the start-date.
    try {
      InsightsGetRecentWorkflowRunsResponse result = client
              .insights
              .getRecentWorkflowRuns(projectSlug, workflowName)
              .allBranches(allBranches)
              .branch(branch)
              .pageToken(pageToken)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getRecentWorkflowRuns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetRecentWorkflowRunsResponse> response = client
              .insights
              .getRecentWorkflowRuns(projectSlug, workflowName)
              .allBranches(allBranches)
              .branch(branch)
              .pageToken(pageToken)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getRecentWorkflowRuns");
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
| **workflowName** | **String**| The name of the workflow. | |
| **allBranches** | **Boolean**| Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter. | [optional] |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |
| **pageToken** | **String**| A token to retrieve the next page of results. | [optional] |
| **startDate** | **OffsetDateTime**| Include only executions that started at or after this date. This must be specified if an end-date is provided. | [optional] |
| **endDate** | **OffsetDateTime**| Include only executions that started before this date. This date can be at most 90 days after the start-date. | [optional] |

### Return type

[**InsightsGetRecentWorkflowRunsResponse**](InsightsGetRecentWorkflowRunsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of recent workflow runs |  -  |
| **0** | Error response. |  -  |

<a name="getSummaryMetricsWithTrends"></a>
# **getSummaryMetricsWithTrends**
> InsightsGetSummaryMetricsWithTrendsResponse getSummaryMetricsWithTrends(orgSlug).reportingWindow(reportingWindow).projectNames(projectNames).execute();

Get summary metrics with trends for the entire org, and for each project.

Gets aggregated summary metrics with trends for the entire org.               Also gets aggregated metrics and trends for each project belonging to the org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String orgSlug = "gh/CircleCI-Public"; // Org slug in the form `vcs-slug/org-name`. The `/` characters may be URL-escaped.
    String reportingWindow = "last-7-days"; // The time window used to calculate summary metrics. If not provided, defaults to last-90-days
    Object projectNames = new HashMap(); // List of project names.
    try {
      InsightsGetSummaryMetricsWithTrendsResponse result = client
              .insights
              .getSummaryMetricsWithTrends(orgSlug)
              .reportingWindow(reportingWindow)
              .projectNames(projectNames)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrgData());
      System.out.println(result.getOrgProjectData());
      System.out.println(result.getAllProjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSummaryMetricsWithTrends");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetSummaryMetricsWithTrendsResponse> response = client
              .insights
              .getSummaryMetricsWithTrends(orgSlug)
              .reportingWindow(reportingWindow)
              .projectNames(projectNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSummaryMetricsWithTrends");
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
| **orgSlug** | **String**| Org slug in the form &#x60;vcs-slug/org-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. | |
| **reportingWindow** | **String**| The time window used to calculate summary metrics. If not provided, defaults to last-90-days | [optional] [enum: last-7-days, last-90-days, last-24-hours, last-30-days, last-60-days] |
| **projectNames** | [**Object**](.md)| List of project names. | [optional] |

### Return type

[**InsightsGetSummaryMetricsWithTrendsResponse**](InsightsGetSummaryMetricsWithTrendsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | summary metrics with trends for an entire org and it&#39;s projects. |  -  |
| **0** | Error response. |  -  |

<a name="getWorkflowSummaryMetrics"></a>
# **getWorkflowSummaryMetrics**
> InsightsGetWorkflowSummaryMetricsResponse getWorkflowSummaryMetrics(projectSlug, workflowName).allBranches(allBranches).branch(branch).execute();

Get metrics and trends for workflows

Get the metrics and trends for a particular workflow on a single branch or all branches

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of the workflow.
    Boolean allBranches = true; // Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter.
    String branch = "branch_example"; // The name of a vcs branch. If not passed we will scope the API call to the default branch.
    try {
      InsightsGetWorkflowSummaryMetricsResponse result = client
              .insights
              .getWorkflowSummaryMetrics(projectSlug, workflowName)
              .allBranches(allBranches)
              .branch(branch)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetrics());
      System.out.println(result.getTrends());
      System.out.println(result.getWorkflowNames());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getWorkflowSummaryMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsGetWorkflowSummaryMetricsResponse> response = client
              .insights
              .getWorkflowSummaryMetrics(projectSlug, workflowName)
              .allBranches(allBranches)
              .branch(branch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getWorkflowSummaryMetrics");
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
| **workflowName** | **String**| The name of the workflow. | |
| **allBranches** | **Boolean**| Whether to retrieve data for all branches combined. Use either this parameter OR the branch name parameter. | [optional] |
| **branch** | **String**| The name of a vcs branch. If not passed we will scope the API call to the default branch. | [optional] |

### Return type

[**InsightsGetWorkflowSummaryMetricsResponse**](InsightsGetWorkflowSummaryMetricsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metrics and trends for a workflow |  -  |
| **0** | Error response. |  -  |

<a name="listProjectBranches"></a>
# **listProjectBranches**
> InsightsListProjectBranchesResponse listProjectBranches(projectSlug).workflowName(workflowName).execute();

Get all branches for a project

Get a list of all branches for a specified project. The list will only contain branches currently available within Insights. The maximum number of branches returned by this endpoint is 5,000.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
    String workflowName = "build-and-test"; // The name of a workflow. If not passed we will scope the API call to the project.
    try {
      InsightsListProjectBranchesResponse result = client
              .insights
              .listProjectBranches(projectSlug)
              .workflowName(workflowName)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrgId());
      System.out.println(result.getProjectId());
      System.out.println(result.getBranches());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listProjectBranches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InsightsListProjectBranchesResponse> response = client
              .insights
              .listProjectBranches(projectSlug)
              .workflowName(workflowName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listProjectBranches");
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
| **workflowName** | **String**| The name of a workflow. If not passed we will scope the API call to the project. | [optional] |

### Return type

[**InsightsListProjectBranchesResponse**](InsightsListProjectBranchesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of branches for a project |  -  |
| **0** | Error response. |  -  |

