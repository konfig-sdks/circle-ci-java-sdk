<div align="center">

[![Visit Circleci](./header.png)](https://circleci.com)

# [Circleci](https://circleci.com)

This describes the resources that make up the CircleCI API v2.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=CircleCI&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>circle-ci-java-sdk</artifactId>
  <version>v2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:circle-ci-java-sdk:v2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/circle-ci-java-sdk-v2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://circleci.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContextApi* | [**createNewContext**](docs/ContextApi.md#createNewContext) | **POST** /context | Create a new context
*ContextApi* | [**createRestriction**](docs/ContextApi.md#createRestriction) | **POST** /context/{context_id}/restrictions | 🧪 Create context restriction
*ContextApi* | [**deleteRestriction**](docs/ContextApi.md#deleteRestriction) | **DELETE** /context/{context_id}/restrictions/{restriction_id} | 🧪 Delete context restriction
*ContextApi* | [**getInformation**](docs/ContextApi.md#getInformation) | **GET** /context/{context-id} | Get a context
*ContextApi* | [**getRestrictions**](docs/ContextApi.md#getRestrictions) | **GET** /context/{context_id}/restrictions | 🧪 Get context restrictions
*ContextApi* | [**listEnvironmentVariables**](docs/ContextApi.md#listEnvironmentVariables) | **GET** /context/{context-id}/environment-variable | List environment variables
*ContextApi* | [**listOwnerContexts**](docs/ContextApi.md#listOwnerContexts) | **GET** /context | List contexts
*ContextApi* | [**removeContext**](docs/ContextApi.md#removeContext) | **DELETE** /context/{context-id} | Delete a context
*ContextApi* | [**removeEnvironmentVariable**](docs/ContextApi.md#removeEnvironmentVariable) | **DELETE** /context/{context-id}/environment-variable/{env-var-name} | Remove an environment variable
*ContextApi* | [**updateEnvironmentVariable**](docs/ContextApi.md#updateEnvironmentVariable) | **PUT** /context/{context-id}/environment-variable/{env-var-name} | Add or update an environment variable
*InsightsApi* | [**getFlakyTests**](docs/InsightsApi.md#getFlakyTests) | **GET** /insights/{project-slug}/flaky-tests | Get flaky tests for a project
*InsightsApi* | [**getJobTimeseriesData**](docs/InsightsApi.md#getJobTimeseriesData) | **GET** /insights/time-series/{project-slug}/workflows/{workflow-name}/jobs | Job timeseries data
*InsightsApi* | [**getProjectSummaryMetrics**](docs/InsightsApi.md#getProjectSummaryMetrics) | **GET** /insights/pages/{project-slug}/summary | Get summary metrics and trends for a project across it&#39;s workflows and branches
*InsightsApi* | [**getProjectWorkflowJobMetrics**](docs/InsightsApi.md#getProjectWorkflowJobMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/jobs | Get summary metrics for a project workflow&#39;s jobs.
*InsightsApi* | [**getProjectWorkflowMetrics**](docs/InsightsApi.md#getProjectWorkflowMetrics) | **GET** /insights/{project-slug}/workflows | Get summary metrics for a project&#39;s workflows
*InsightsApi* | [**getProjectWorkflowTestMetrics**](docs/InsightsApi.md#getProjectWorkflowTestMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/test-metrics | Get test metrics for a project&#39;s workflows
*InsightsApi* | [**getRecentWorkflowRuns**](docs/InsightsApi.md#getRecentWorkflowRuns) | **GET** /insights/{project-slug}/workflows/{workflow-name} | Get recent runs of a workflow
*InsightsApi* | [**getSummaryMetricsWithTrends**](docs/InsightsApi.md#getSummaryMetricsWithTrends) | **GET** /insights/{org-slug}/summary | Get summary metrics with trends for the entire org, and for each project.
*InsightsApi* | [**getWorkflowSummaryMetrics**](docs/InsightsApi.md#getWorkflowSummaryMetrics) | **GET** /insights/{project-slug}/workflows/{workflow-name}/summary | Get metrics and trends for workflows
*InsightsApi* | [**listProjectBranches**](docs/InsightsApi.md#listProjectBranches) | **GET** /insights/{project-slug}/branches | Get all branches for a project
*JobApi* | [**cancelWithNumber**](docs/JobApi.md#cancelWithNumber) | **POST** /project/{project-slug}/job/{job-number}/cancel | Cancel job
*JobApi* | [**getArtifacts**](docs/JobApi.md#getArtifacts) | **GET** /project/{project-slug}/{job-number}/artifacts | Get a job&#39;s artifacts
*JobApi* | [**getDetails**](docs/JobApi.md#getDetails) | **GET** /project/{project-slug}/job/{job-number} | Get job details
*JobApi* | [**getTestMetadata**](docs/JobApi.md#getTestMetadata) | **GET** /project/{project-slug}/{job-number}/tests | Get test metadata
*OidcTokenManagementApi* | [**deleteOrgClaims**](docs/OidcTokenManagementApi.md#deleteOrgClaims) | **DELETE** /org/{orgID}/oidc-custom-claims | Delete org-level claims
*OidcTokenManagementApi* | [**deleteProjectClaims**](docs/OidcTokenManagementApi.md#deleteProjectClaims) | **DELETE** /org/{orgID}/project/{projectID}/oidc-custom-claims | Delete project-level claims
*OidcTokenManagementApi* | [**getOrgClaims**](docs/OidcTokenManagementApi.md#getOrgClaims) | **GET** /org/{orgID}/oidc-custom-claims | Get org-level claims
*OidcTokenManagementApi* | [**getProjectClaims**](docs/OidcTokenManagementApi.md#getProjectClaims) | **GET** /org/{orgID}/project/{projectID}/oidc-custom-claims | Get project-level claims
*OidcTokenManagementApi* | [**updateOrgClaims**](docs/OidcTokenManagementApi.md#updateOrgClaims) | **PATCH** /org/{orgID}/oidc-custom-claims | Patch org-level claims
*OidcTokenManagementApi* | [**updateProjectClaims**](docs/OidcTokenManagementApi.md#updateProjectClaims) | **PATCH** /org/{orgID}/project/{projectID}/oidc-custom-claims | Patch project-level claims
*PipelineApi* | [**continueExecution**](docs/PipelineApi.md#continueExecution) | **POST** /pipeline/continue | Continue a pipeline
*PipelineApi* | [**getAllPipelines**](docs/PipelineApi.md#getAllPipelines) | **GET** /project/{project-slug}/pipeline | Get all pipelines
*PipelineApi* | [**getById**](docs/PipelineApi.md#getById) | **GET** /pipeline/{pipeline-id} | Get a pipeline by ID
*PipelineApi* | [**getByNumber**](docs/PipelineApi.md#getByNumber) | **GET** /project/{project-slug}/pipeline/{pipeline-number} | Get a pipeline by pipeline number
*PipelineApi* | [**getConfigurationById**](docs/PipelineApi.md#getConfigurationById) | **GET** /pipeline/{pipeline-id}/config | Get a pipeline&#39;s configuration
*PipelineApi* | [**listRecentPipelines**](docs/PipelineApi.md#listRecentPipelines) | **GET** /pipeline | Get a list of pipelines
*PipelineApi* | [**listUserPipelines**](docs/PipelineApi.md#listUserPipelines) | **GET** /project/{project-slug}/pipeline/mine | Get your pipelines
*PipelineApi* | [**listWorkflows**](docs/PipelineApi.md#listWorkflows) | **GET** /pipeline/{pipeline-id}/workflow | Get a pipeline&#39;s workflows
*PipelineApi* | [**triggerNewPipeline**](docs/PipelineApi.md#triggerNewPipeline) | **POST** /project/{project-slug}/pipeline | Trigger a new pipeline
*PolicyManagementApi* | [**createPolicyBundleForContext**](docs/PolicyManagementApi.md#createPolicyBundleForContext) | **POST** /owner/{ownerID}/context/{context}/policy-bundle | Creates policy bundle for the context
*PolicyManagementApi* | [**evaluateInputData**](docs/PolicyManagementApi.md#evaluateInputData) | **POST** /owner/{ownerID}/context/{context}/decision | Makes a decision
*PolicyManagementApi* | [**getDecisionAuditLogByGivenId**](docs/PolicyManagementApi.md#getDecisionAuditLogByGivenId) | **GET** /owner/{ownerID}/context/{context}/decision/{decisionID} | Retrieves the owner&#39;s decision audit log by given decisionID
*PolicyManagementApi* | [**getDecisionAuditLogs**](docs/PolicyManagementApi.md#getDecisionAuditLogs) | **GET** /owner/{ownerID}/context/{context}/decision | Retrieves the owner&#39;s decision audit logs.
*PolicyManagementApi* | [**getDecisionSettings**](docs/PolicyManagementApi.md#getDecisionSettings) | **GET** /owner/{ownerID}/context/{context}/decision/settings | Get the decision settings
*PolicyManagementApi* | [**getDocument**](docs/PolicyManagementApi.md#getDocument) | **GET** /owner/{ownerID}/context/{context}/policy-bundle/{policyName} | Retrieves a policy document
*PolicyManagementApi* | [**getPolicyBundle**](docs/PolicyManagementApi.md#getPolicyBundle) | **GET** /owner/{ownerID}/context/{context}/policy-bundle | Retrieves Policy Bundle
*PolicyManagementApi* | [**getPolicyBundleForDecision**](docs/PolicyManagementApi.md#getPolicyBundleForDecision) | **GET** /owner/{ownerID}/context/{context}/decision/{decisionID}/policy-bundle | Retrieves Policy Bundle for a given decision log ID
*PolicyManagementApi* | [**modifyDecisionSettings**](docs/PolicyManagementApi.md#modifyDecisionSettings) | **PATCH** /owner/{ownerID}/context/{context}/decision/settings | Set the decision settings
*ProjectApi* | [**createCheckoutKey**](docs/ProjectApi.md#createCheckoutKey) | **POST** /project/{project-slug}/checkout-key | Create a new checkout key
*ProjectApi* | [**createEnvVar**](docs/ProjectApi.md#createEnvVar) | **POST** /project/{project-slug}/envvar | Create an environment variable
*ProjectApi* | [**createProjectDefaultSettings**](docs/ProjectApi.md#createProjectDefaultSettings) | **POST** /project/{provider}/{organization}/{project} | 🧪 Create a project
*ProjectApi* | [**deleteCheckoutKeyByFingerprint**](docs/ProjectApi.md#deleteCheckoutKeyByFingerprint) | **DELETE** /project/{project-slug}/checkout-key/{fingerprint} | Delete a checkout key
*ProjectApi* | [**deleteEnvironmentVariable**](docs/ProjectApi.md#deleteEnvironmentVariable) | **DELETE** /project/{project-slug}/envvar/{name} | Delete an environment variable
*ProjectApi* | [**getBySlug**](docs/ProjectApi.md#getBySlug) | **GET** /project/{project-slug} | Get a project
*ProjectApi* | [**getCheckoutKeyByFingerprint**](docs/ProjectApi.md#getCheckoutKeyByFingerprint) | **GET** /project/{project-slug}/checkout-key/{fingerprint} | Get a checkout key
*ProjectApi* | [**getMaskedEnvVar**](docs/ProjectApi.md#getMaskedEnvVar) | **GET** /project/{project-slug}/envvar/{name} | Get a masked environment variable
*ProjectApi* | [**getSettings**](docs/ProjectApi.md#getSettings) | **GET** /project/{provider}/{organization}/{project}/settings | 🧪 Get project settings
*ProjectApi* | [**listCheckoutKeys**](docs/ProjectApi.md#listCheckoutKeys) | **GET** /project/{project-slug}/checkout-key | Get all checkout keys
*ProjectApi* | [**listEnvVarValues**](docs/ProjectApi.md#listEnvVarValues) | **GET** /project/{project-slug}/envvar | List all environment variables
*ProjectApi* | [**updateSettings**](docs/ProjectApi.md#updateSettings) | **PATCH** /project/{provider}/{organization}/{project}/settings | 🧪 Update project settings
*ScheduleApi* | [**createNewSchedule**](docs/ScheduleApi.md#createNewSchedule) | **POST** /project/{project-slug}/schedule | Create a schedule
*ScheduleApi* | [**getAllSchedules**](docs/ScheduleApi.md#getAllSchedules) | **GET** /project/{project-slug}/schedule | Get all schedules
*ScheduleApi* | [**getById**](docs/ScheduleApi.md#getById) | **GET** /schedule/{schedule-id} | Get a schedule
*ScheduleApi* | [**removeById**](docs/ScheduleApi.md#removeById) | **DELETE** /schedule/{schedule-id} | Delete a schedule
*ScheduleApi* | [**updateSchedule**](docs/ScheduleApi.md#updateSchedule) | **PATCH** /schedule/{schedule-id} | Update a schedule
*UserApi* | [**getInformation**](docs/UserApi.md#getInformation) | **GET** /me | User Information
*UserApi* | [**getUserInformation**](docs/UserApi.md#getUserInformation) | **GET** /user/{id} | User Information
*UserApi* | [**listCollaborations**](docs/UserApi.md#listCollaborations) | **GET** /me/collaborations | Collaborations
*WebhookApi* | [**createOutboundWebhook**](docs/WebhookApi.md#createOutboundWebhook) | **POST** /webhook | Create an outbound webhook
*WebhookApi* | [**deleteOutboundWebhook**](docs/WebhookApi.md#deleteOutboundWebhook) | **DELETE** /webhook/{webhook-id} | Delete an outbound webhook
*WebhookApi* | [**getById**](docs/WebhookApi.md#getById) | **GET** /webhook/{webhook-id} | Get a webhook
*WebhookApi* | [**listMatchingScope**](docs/WebhookApi.md#listMatchingScope) | **GET** /webhook | List webhooks
*WebhookApi* | [**updateOutboundWebhook**](docs/WebhookApi.md#updateOutboundWebhook) | **PUT** /webhook/{webhook-id} | Update an outbound webhook
*WorkflowApi* | [**approveJob**](docs/WorkflowApi.md#approveJob) | **POST** /workflow/{id}/approve/{approval_request_id} | Approve a job
*WorkflowApi* | [**cancelWorkflow**](docs/WorkflowApi.md#cancelWorkflow) | **POST** /workflow/{id}/cancel | Cancel a workflow
*WorkflowApi* | [**getById**](docs/WorkflowApi.md#getById) | **GET** /workflow/{id} | Get a workflow
*WorkflowApi* | [**getJobs**](docs/WorkflowApi.md#getJobs) | **GET** /workflow/{id}/job | Get a workflow&#39;s jobs
*WorkflowApi* | [**rerunWorkflow**](docs/WorkflowApi.md#rerunWorkflow) | **POST** /workflow/{id}/rerun | Rerun a workflow


## Documentation for Models

 - [Artifact](docs/Artifact.md)
 - [BundleDiff](docs/BundleDiff.md)
 - [BundlePayload](docs/BundlePayload.md)
 - [CheckoutKey](docs/CheckoutKey.md)
 - [ClaimResponse](docs/ClaimResponse.md)
 - [Collaboration](docs/Collaboration.md)
 - [Context](docs/Context.md)
 - [ContextCreateNewContextRequest](docs/ContextCreateNewContextRequest.md)
 - [ContextCreateNewContextResponse](docs/ContextCreateNewContextResponse.md)
 - [ContextCreateNewContextdefaultResponse](docs/ContextCreateNewContextdefaultResponse.md)
 - [ContextCreateRestriction409Response](docs/ContextCreateRestriction409Response.md)
 - [ContextCreateRestrictionRequest](docs/ContextCreateRestrictionRequest.md)
 - [ContextCreateRestrictionResponse](docs/ContextCreateRestrictionResponse.md)
 - [ContextDeleteRestrictionResponse](docs/ContextDeleteRestrictionResponse.md)
 - [ContextGetInformationResponse](docs/ContextGetInformationResponse.md)
 - [ContextGetInformationdefaultResponse](docs/ContextGetInformationdefaultResponse.md)
 - [ContextGetRestrictions401Response](docs/ContextGetRestrictions401Response.md)
 - [ContextGetRestrictions404Response](docs/ContextGetRestrictions404Response.md)
 - [ContextGetRestrictions429Response](docs/ContextGetRestrictions429Response.md)
 - [ContextGetRestrictions500Response](docs/ContextGetRestrictions500Response.md)
 - [ContextGetRestrictionsResponse](docs/ContextGetRestrictionsResponse.md)
 - [ContextListEnvironmentVariablesResponse](docs/ContextListEnvironmentVariablesResponse.md)
 - [ContextListEnvironmentVariablesResponseItemsInner](docs/ContextListEnvironmentVariablesResponseItemsInner.md)
 - [ContextListEnvironmentVariablesdefaultResponse](docs/ContextListEnvironmentVariablesdefaultResponse.md)
 - [ContextListOwnerContextsResponse](docs/ContextListOwnerContextsResponse.md)
 - [ContextListOwnerContextsdefaultResponse](docs/ContextListOwnerContextsdefaultResponse.md)
 - [ContextProjectRestrictionsList](docs/ContextProjectRestrictionsList.md)
 - [ContextProjectRestrictionsListItemsInner](docs/ContextProjectRestrictionsListItemsInner.md)
 - [ContextRemoveContextResponse](docs/ContextRemoveContextResponse.md)
 - [ContextRemoveContextdefaultResponse](docs/ContextRemoveContextdefaultResponse.md)
 - [ContextRemoveEnvironmentVariableResponse](docs/ContextRemoveEnvironmentVariableResponse.md)
 - [ContextRemoveEnvironmentVariabledefaultResponse](docs/ContextRemoveEnvironmentVariabledefaultResponse.md)
 - [ContextUpdateEnvironmentVariableRequest](docs/ContextUpdateEnvironmentVariableRequest.md)
 - [ContextUpdateEnvironmentVariableResponse](docs/ContextUpdateEnvironmentVariableResponse.md)
 - [ContextUpdateEnvironmentVariabledefaultResponse](docs/ContextUpdateEnvironmentVariabledefaultResponse.md)
 - [Decision](docs/Decision.md)
 - [DecisionLog](docs/DecisionLog.md)
 - [DecisionLogMetadata](docs/DecisionLogMetadata.md)
 - [DecisionLogMetadataVcs](docs/DecisionLogMetadataVcs.md)
 - [DecisionSettings](docs/DecisionSettings.md)
 - [EnvironmentVariable](docs/EnvironmentVariable.md)
 - [InsightsGetFlakyTestsResponse](docs/InsightsGetFlakyTestsResponse.md)
 - [InsightsGetFlakyTestsResponseFlakyTestsInner](docs/InsightsGetFlakyTestsResponseFlakyTestsInner.md)
 - [InsightsGetFlakyTestsdefaultResponse](docs/InsightsGetFlakyTestsdefaultResponse.md)
 - [InsightsGetJobTimeseriesDataResponse](docs/InsightsGetJobTimeseriesDataResponse.md)
 - [InsightsGetJobTimeseriesDataResponseItemsInner](docs/InsightsGetJobTimeseriesDataResponseItemsInner.md)
 - [InsightsGetJobTimeseriesDataResponseItemsInnerMetrics](docs/InsightsGetJobTimeseriesDataResponseItemsInnerMetrics.md)
 - [InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics](docs/InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.md)
 - [InsightsGetJobTimeseriesDatadefaultResponse](docs/InsightsGetJobTimeseriesDatadefaultResponse.md)
 - [InsightsGetProjectSummaryMetricsResponse](docs/InsightsGetProjectSummaryMetricsResponse.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectData](docs/InsightsGetProjectSummaryMetricsResponseProjectData.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectDataMetrics](docs/InsightsGetProjectSummaryMetricsResponseProjectDataMetrics.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectDataTrends](docs/InsightsGetProjectSummaryMetricsResponseProjectDataTrends.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectWorkflowBranchDataInner](docs/InsightsGetProjectSummaryMetricsResponseProjectWorkflowBranchDataInner.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInner](docs/InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInner.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInnerMetrics](docs/InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInnerMetrics.md)
 - [InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInnerTrends](docs/InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInnerTrends.md)
 - [InsightsGetProjectSummaryMetricsdefaultResponse](docs/InsightsGetProjectSummaryMetricsdefaultResponse.md)
 - [InsightsGetProjectWorkflowJobMetricsResponse](docs/InsightsGetProjectWorkflowJobMetricsResponse.md)
 - [InsightsGetProjectWorkflowJobMetricsResponseItemsInner](docs/InsightsGetProjectWorkflowJobMetricsResponseItemsInner.md)
 - [InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetrics](docs/InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetrics.md)
 - [InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetricsDurationMetrics](docs/InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetricsDurationMetrics.md)
 - [InsightsGetProjectWorkflowJobMetricsdefaultResponse](docs/InsightsGetProjectWorkflowJobMetricsdefaultResponse.md)
 - [InsightsGetProjectWorkflowMetricsResponse](docs/InsightsGetProjectWorkflowMetricsResponse.md)
 - [InsightsGetProjectWorkflowMetricsResponseItemsInner](docs/InsightsGetProjectWorkflowMetricsResponseItemsInner.md)
 - [InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics](docs/InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.md)
 - [InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics](docs/InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics.md)
 - [InsightsGetProjectWorkflowMetricsdefaultResponse](docs/InsightsGetProjectWorkflowMetricsdefaultResponse.md)
 - [InsightsGetProjectWorkflowTestMetricsResponse](docs/InsightsGetProjectWorkflowTestMetricsResponse.md)
 - [InsightsGetProjectWorkflowTestMetricsResponseMostFailedTestsInner](docs/InsightsGetProjectWorkflowTestMetricsResponseMostFailedTestsInner.md)
 - [InsightsGetProjectWorkflowTestMetricsResponseTestRunsInner](docs/InsightsGetProjectWorkflowTestMetricsResponseTestRunsInner.md)
 - [InsightsGetProjectWorkflowTestMetricsResponseTestRunsInnerTestCounts](docs/InsightsGetProjectWorkflowTestMetricsResponseTestRunsInnerTestCounts.md)
 - [InsightsGetProjectWorkflowTestMetricsdefaultResponse](docs/InsightsGetProjectWorkflowTestMetricsdefaultResponse.md)
 - [InsightsGetRecentWorkflowRunsResponse](docs/InsightsGetRecentWorkflowRunsResponse.md)
 - [InsightsGetRecentWorkflowRunsResponseItemsInner](docs/InsightsGetRecentWorkflowRunsResponseItemsInner.md)
 - [InsightsGetRecentWorkflowRunsdefaultResponse](docs/InsightsGetRecentWorkflowRunsdefaultResponse.md)
 - [InsightsGetSummaryMetricsWithTrendsResponse](docs/InsightsGetSummaryMetricsWithTrendsResponse.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgData](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgData.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgDataTrends](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgDataTrends.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInner](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInner.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInnerMetrics](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInnerMetrics.md)
 - [InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInnerTrends](docs/InsightsGetSummaryMetricsWithTrendsResponseOrgProjectDataInnerTrends.md)
 - [InsightsGetSummaryMetricsWithTrendsdefaultResponse](docs/InsightsGetSummaryMetricsWithTrendsdefaultResponse.md)
 - [InsightsGetWorkflowSummaryMetricsResponse](docs/InsightsGetWorkflowSummaryMetricsResponse.md)
 - [InsightsGetWorkflowSummaryMetricsResponseMetrics](docs/InsightsGetWorkflowSummaryMetricsResponseMetrics.md)
 - [InsightsGetWorkflowSummaryMetricsResponseTrends](docs/InsightsGetWorkflowSummaryMetricsResponseTrends.md)
 - [InsightsGetWorkflowSummaryMetricsdefaultResponse](docs/InsightsGetWorkflowSummaryMetricsdefaultResponse.md)
 - [InsightsListProjectBranchesResponse](docs/InsightsListProjectBranchesResponse.md)
 - [InsightsListProjectBranchesdefaultResponse](docs/InsightsListProjectBranchesdefaultResponse.md)
 - [Job](docs/Job.md)
 - [JobCancelWithNumberResponse](docs/JobCancelWithNumberResponse.md)
 - [JobCancelWithNumberdefaultResponse](docs/JobCancelWithNumberdefaultResponse.md)
 - [JobGetArtifactsResponse](docs/JobGetArtifactsResponse.md)
 - [JobGetArtifactsdefaultResponse](docs/JobGetArtifactsdefaultResponse.md)
 - [JobGetDetailsResponse](docs/JobGetDetailsResponse.md)
 - [JobGetDetailsResponseContextsInner](docs/JobGetDetailsResponseContextsInner.md)
 - [JobGetDetailsResponseExecutor](docs/JobGetDetailsResponseExecutor.md)
 - [JobGetDetailsResponseLatestWorkflow](docs/JobGetDetailsResponseLatestWorkflow.md)
 - [JobGetDetailsResponseMessagesInner](docs/JobGetDetailsResponseMessagesInner.md)
 - [JobGetDetailsResponseOrganization](docs/JobGetDetailsResponseOrganization.md)
 - [JobGetDetailsResponseParallelRunsInner](docs/JobGetDetailsResponseParallelRunsInner.md)
 - [JobGetDetailsResponsePipeline](docs/JobGetDetailsResponsePipeline.md)
 - [JobGetDetailsResponseProject](docs/JobGetDetailsResponseProject.md)
 - [JobGetDetailsdefaultResponse](docs/JobGetDetailsdefaultResponse.md)
 - [JobGetTestMetadataResponse](docs/JobGetTestMetadataResponse.md)
 - [JobGetTestMetadatadefaultResponse](docs/JobGetTestMetadatadefaultResponse.md)
 - [PatchClaimsRequest](docs/PatchClaimsRequest.md)
 - [Pipeline](docs/Pipeline.md)
 - [Pipeline1](docs/Pipeline1.md)
 - [Pipeline1Vcs](docs/Pipeline1Vcs.md)
 - [Pipeline2](docs/Pipeline2.md)
 - [Pipeline2Vcs](docs/Pipeline2Vcs.md)
 - [PipelineContinueExecutionRequest](docs/PipelineContinueExecutionRequest.md)
 - [PipelineContinueExecutionResponse](docs/PipelineContinueExecutionResponse.md)
 - [PipelineContinueExecutiondefaultResponse](docs/PipelineContinueExecutiondefaultResponse.md)
 - [PipelineErrorsInner](docs/PipelineErrorsInner.md)
 - [PipelineGetAllPipelinesResponse](docs/PipelineGetAllPipelinesResponse.md)
 - [PipelineGetAllPipelinesdefaultResponse](docs/PipelineGetAllPipelinesdefaultResponse.md)
 - [PipelineGetByIdResponse](docs/PipelineGetByIdResponse.md)
 - [PipelineGetByIdResponseVcs](docs/PipelineGetByIdResponseVcs.md)
 - [PipelineGetByIddefaultResponse](docs/PipelineGetByIddefaultResponse.md)
 - [PipelineGetByNumberResponse](docs/PipelineGetByNumberResponse.md)
 - [PipelineGetByNumberResponseVcs](docs/PipelineGetByNumberResponseVcs.md)
 - [PipelineGetByNumberdefaultResponse](docs/PipelineGetByNumberdefaultResponse.md)
 - [PipelineGetConfigurationByIdResponse](docs/PipelineGetConfigurationByIdResponse.md)
 - [PipelineGetConfigurationByIddefaultResponse](docs/PipelineGetConfigurationByIddefaultResponse.md)
 - [PipelineListRecentPipelinesResponse](docs/PipelineListRecentPipelinesResponse.md)
 - [PipelineListRecentPipelinesdefaultResponse](docs/PipelineListRecentPipelinesdefaultResponse.md)
 - [PipelineListUserPipelinesResponse](docs/PipelineListUserPipelinesResponse.md)
 - [PipelineListUserPipelinesdefaultResponse](docs/PipelineListUserPipelinesdefaultResponse.md)
 - [PipelineListWorkflowsResponse](docs/PipelineListWorkflowsResponse.md)
 - [PipelineListWorkflowsdefaultResponse](docs/PipelineListWorkflowsdefaultResponse.md)
 - [PipelineTrigger](docs/PipelineTrigger.md)
 - [PipelineTriggerActor](docs/PipelineTriggerActor.md)
 - [PipelineTriggerNewPipelineRequest](docs/PipelineTriggerNewPipelineRequest.md)
 - [PipelineTriggerNewPipelineResponse](docs/PipelineTriggerNewPipelineResponse.md)
 - [PipelineTriggerNewPipelinedefaultResponse](docs/PipelineTriggerNewPipelinedefaultResponse.md)
 - [PipelineVcs](docs/PipelineVcs.md)
 - [PipelineVcsCommit](docs/PipelineVcsCommit.md)
 - [Policy](docs/Policy.md)
 - [PolicyManagementEvaluateInputDataRequest](docs/PolicyManagementEvaluateInputDataRequest.md)
 - [ProjectCreateCheckoutKeyRequest](docs/ProjectCreateCheckoutKeyRequest.md)
 - [ProjectCreateCheckoutKeyResponse](docs/ProjectCreateCheckoutKeyResponse.md)
 - [ProjectCreateCheckoutKeydefaultResponse](docs/ProjectCreateCheckoutKeydefaultResponse.md)
 - [ProjectCreateEnvVarRequest](docs/ProjectCreateEnvVarRequest.md)
 - [ProjectCreateEnvVarResponse](docs/ProjectCreateEnvVarResponse.md)
 - [ProjectCreateEnvVardefaultResponse](docs/ProjectCreateEnvVardefaultResponse.md)
 - [ProjectCreateProjectDefaultSettings403Response](docs/ProjectCreateProjectDefaultSettings403Response.md)
 - [ProjectCreateProjectDefaultSettings404Response](docs/ProjectCreateProjectDefaultSettings404Response.md)
 - [ProjectCreateProjectDefaultSettings405Response](docs/ProjectCreateProjectDefaultSettings405Response.md)
 - [ProjectCreateProjectDefaultSettingsResponse](docs/ProjectCreateProjectDefaultSettingsResponse.md)
 - [ProjectDeleteCheckoutKeyByFingerprintResponse](docs/ProjectDeleteCheckoutKeyByFingerprintResponse.md)
 - [ProjectDeleteCheckoutKeyByFingerprintdefaultResponse](docs/ProjectDeleteCheckoutKeyByFingerprintdefaultResponse.md)
 - [ProjectDeleteEnvironmentVariableResponse](docs/ProjectDeleteEnvironmentVariableResponse.md)
 - [ProjectDeleteEnvironmentVariabledefaultResponse](docs/ProjectDeleteEnvironmentVariabledefaultResponse.md)
 - [ProjectGetBySlugResponse](docs/ProjectGetBySlugResponse.md)
 - [ProjectGetBySlugResponseVcsInfo](docs/ProjectGetBySlugResponseVcsInfo.md)
 - [ProjectGetBySlugdefaultResponse](docs/ProjectGetBySlugdefaultResponse.md)
 - [ProjectGetCheckoutKeyByFingerprintResponse](docs/ProjectGetCheckoutKeyByFingerprintResponse.md)
 - [ProjectGetCheckoutKeyByFingerprintdefaultResponse](docs/ProjectGetCheckoutKeyByFingerprintdefaultResponse.md)
 - [ProjectGetMaskedEnvVarResponse](docs/ProjectGetMaskedEnvVarResponse.md)
 - [ProjectGetMaskedEnvVardefaultResponse](docs/ProjectGetMaskedEnvVardefaultResponse.md)
 - [ProjectGetSettingsResponse](docs/ProjectGetSettingsResponse.md)
 - [ProjectListCheckoutKeysResponse](docs/ProjectListCheckoutKeysResponse.md)
 - [ProjectListCheckoutKeysdefaultResponse](docs/ProjectListCheckoutKeysdefaultResponse.md)
 - [ProjectListEnvVarValuesResponse](docs/ProjectListEnvVarValuesResponse.md)
 - [ProjectListEnvVarValuesdefaultResponse](docs/ProjectListEnvVarValuesdefaultResponse.md)
 - [ProjectSettings](docs/ProjectSettings.md)
 - [ProjectSettingsAdvanced](docs/ProjectSettingsAdvanced.md)
 - [ProjectUpdateSettingsResponse](docs/ProjectUpdateSettingsResponse.md)
 - [RestrictionCreated](docs/RestrictionCreated.md)
 - [RestrictionDeleted](docs/RestrictionDeleted.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleCreateNewScheduleRequest](docs/ScheduleCreateNewScheduleRequest.md)
 - [ScheduleCreateNewScheduleRequestTimetable](docs/ScheduleCreateNewScheduleRequestTimetable.md)
 - [ScheduleCreateNewScheduleResponse](docs/ScheduleCreateNewScheduleResponse.md)
 - [ScheduleCreateNewScheduledefaultResponse](docs/ScheduleCreateNewScheduledefaultResponse.md)
 - [ScheduleGetAllSchedulesResponse](docs/ScheduleGetAllSchedulesResponse.md)
 - [ScheduleGetAllSchedulesdefaultResponse](docs/ScheduleGetAllSchedulesdefaultResponse.md)
 - [ScheduleGetByIdResponse](docs/ScheduleGetByIdResponse.md)
 - [ScheduleGetByIddefaultResponse](docs/ScheduleGetByIddefaultResponse.md)
 - [ScheduleRemoveByIdResponse](docs/ScheduleRemoveByIdResponse.md)
 - [ScheduleRemoveByIddefaultResponse](docs/ScheduleRemoveByIddefaultResponse.md)
 - [ScheduleUpdateScheduleRequest](docs/ScheduleUpdateScheduleRequest.md)
 - [ScheduleUpdateScheduleRequestTimetable](docs/ScheduleUpdateScheduleRequestTimetable.md)
 - [ScheduleUpdateScheduleResponse](docs/ScheduleUpdateScheduleResponse.md)
 - [ScheduleUpdateScheduledefaultResponse](docs/ScheduleUpdateScheduledefaultResponse.md)
 - [TestsResponsePropertyInner](docs/TestsResponsePropertyInner.md)
 - [UserGetInformationResponse](docs/UserGetInformationResponse.md)
 - [UserGetInformationdefaultResponse](docs/UserGetInformationdefaultResponse.md)
 - [UserGetUserInformationResponse](docs/UserGetUserInformationResponse.md)
 - [UserGetUserInformationdefaultResponse](docs/UserGetUserInformationdefaultResponse.md)
 - [UserListCollaborationsdefaultResponse](docs/UserListCollaborationsdefaultResponse.md)
 - [UserProperty](docs/UserProperty.md)
 - [Violation](docs/Violation.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreateOutboundWebhookRequest](docs/WebhookCreateOutboundWebhookRequest.md)
 - [WebhookCreateOutboundWebhookRequestScope](docs/WebhookCreateOutboundWebhookRequestScope.md)
 - [WebhookCreateOutboundWebhookResponse](docs/WebhookCreateOutboundWebhookResponse.md)
 - [WebhookCreateOutboundWebhookdefaultResponse](docs/WebhookCreateOutboundWebhookdefaultResponse.md)
 - [WebhookDeleteOutboundWebhookResponse](docs/WebhookDeleteOutboundWebhookResponse.md)
 - [WebhookDeleteOutboundWebhookdefaultResponse](docs/WebhookDeleteOutboundWebhookdefaultResponse.md)
 - [WebhookGetByIdResponse](docs/WebhookGetByIdResponse.md)
 - [WebhookGetByIddefaultResponse](docs/WebhookGetByIddefaultResponse.md)
 - [WebhookListMatchingScopeResponse](docs/WebhookListMatchingScopeResponse.md)
 - [WebhookListMatchingScopedefaultResponse](docs/WebhookListMatchingScopedefaultResponse.md)
 - [WebhookScope](docs/WebhookScope.md)
 - [WebhookUpdateOutboundWebhookRequest](docs/WebhookUpdateOutboundWebhookRequest.md)
 - [WebhookUpdateOutboundWebhookResponse](docs/WebhookUpdateOutboundWebhookResponse.md)
 - [WebhookUpdateOutboundWebhookdefaultResponse](docs/WebhookUpdateOutboundWebhookdefaultResponse.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowApproveJobResponse](docs/WorkflowApproveJobResponse.md)
 - [WorkflowApproveJobdefaultResponse](docs/WorkflowApproveJobdefaultResponse.md)
 - [WorkflowCancelWorkflowResponse](docs/WorkflowCancelWorkflowResponse.md)
 - [WorkflowCancelWorkflowdefaultResponse](docs/WorkflowCancelWorkflowdefaultResponse.md)
 - [WorkflowGetByIdResponse](docs/WorkflowGetByIdResponse.md)
 - [WorkflowGetByIddefaultResponse](docs/WorkflowGetByIddefaultResponse.md)
 - [WorkflowGetJobsResponse](docs/WorkflowGetJobsResponse.md)
 - [WorkflowGetJobsdefaultResponse](docs/WorkflowGetJobsdefaultResponse.md)
 - [WorkflowRerunWorkflowRequest](docs/WorkflowRerunWorkflowRequest.md)
 - [WorkflowRerunWorkflowResponse](docs/WorkflowRerunWorkflowResponse.md)
 - [WorkflowRerunWorkflowdefaultResponse](docs/WorkflowRerunWorkflowdefaultResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
