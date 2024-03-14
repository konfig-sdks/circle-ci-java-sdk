# PolicyManagementApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPolicyBundleForContext**](PolicyManagementApi.md#createPolicyBundleForContext) | **POST** /owner/{ownerID}/context/{context}/policy-bundle | Creates policy bundle for the context |
| [**evaluateInputData**](PolicyManagementApi.md#evaluateInputData) | **POST** /owner/{ownerID}/context/{context}/decision | Makes a decision |
| [**getDecisionAuditLogByGivenId**](PolicyManagementApi.md#getDecisionAuditLogByGivenId) | **GET** /owner/{ownerID}/context/{context}/decision/{decisionID} | Retrieves the owner&#39;s decision audit log by given decisionID |
| [**getDecisionAuditLogs**](PolicyManagementApi.md#getDecisionAuditLogs) | **GET** /owner/{ownerID}/context/{context}/decision | Retrieves the owner&#39;s decision audit logs. |
| [**getDecisionSettings**](PolicyManagementApi.md#getDecisionSettings) | **GET** /owner/{ownerID}/context/{context}/decision/settings | Get the decision settings |
| [**getDocument**](PolicyManagementApi.md#getDocument) | **GET** /owner/{ownerID}/context/{context}/policy-bundle/{policyName} | Retrieves a policy document |
| [**getPolicyBundle**](PolicyManagementApi.md#getPolicyBundle) | **GET** /owner/{ownerID}/context/{context}/policy-bundle | Retrieves Policy Bundle |
| [**getPolicyBundleForDecision**](PolicyManagementApi.md#getPolicyBundleForDecision) | **GET** /owner/{ownerID}/context/{context}/decision/{decisionID}/policy-bundle | Retrieves Policy Bundle for a given decision log ID |
| [**modifyDecisionSettings**](PolicyManagementApi.md#modifyDecisionSettings) | **PATCH** /owner/{ownerID}/context/{context}/decision/settings | Set the decision settings |


<a name="createPolicyBundleForContext"></a>
# **createPolicyBundleForContext**
> BundleDiff createPolicyBundleForContext(ownerID, context).dry(dry).bundlePayload(bundlePayload).execute();

Creates policy bundle for the context

This endpoint replaces the current policy bundle with the provided policy bundle

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    Map<String, String> policies = new HashMap();
    Boolean dry = true;
    try {
      BundleDiff result = client
              .policyManagement
              .createPolicyBundleForContext(ownerID, context)
              .policies(policies)
              .dry(dry)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getDeleted());
      System.out.println(result.getModified());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#createPolicyBundleForContext");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BundleDiff> response = client
              .policyManagement
              .createPolicyBundleForContext(ownerID, context)
              .policies(policies)
              .dry(dry)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#createPolicyBundleForContext");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **dry** | **Boolean**|  | [optional] |
| **bundlePayload** | [**BundlePayload**](BundlePayload.md)|  | [optional] |

### Return type

[**BundleDiff**](BundleDiff.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy-Bundle diff successfully returned. |  -  |
| **201** | Policy-Bundle successfully created. |  -  |

<a name="evaluateInputData"></a>
# **evaluateInputData**
> Decision evaluateInputData(ownerID, context).policyManagementEvaluateInputDataRequest(policyManagementEvaluateInputDataRequest).execute();

Makes a decision

This endpoint will evaluate input data (config+metadata) against owner&#39;s stored policies and return a decision.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String input = "input_example";
    String ownerID = "ownerID_example";
    String context = "context_example";
    Object metadata = null;
    try {
      Decision result = client
              .policyManagement
              .evaluateInputData(input, ownerID, context)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnabledRules());
      System.out.println(result.getHardFailures());
      System.out.println(result.getReason());
      System.out.println(result.getSoftFailures());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#evaluateInputData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Decision> response = client
              .policyManagement
              .evaluateInputData(input, ownerID, context)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#evaluateInputData");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **policyManagementEvaluateInputDataRequest** | [**PolicyManagementEvaluateInputDataRequest**](PolicyManagementEvaluateInputDataRequest.md)|  | [optional] |

### Return type

[**Decision**](Decision.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decision rendered by applying the policy against the provided data. Response will be modeled by the data and rego processed. |  -  |

<a name="getDecisionAuditLogByGivenId"></a>
# **getDecisionAuditLogByGivenId**
> DecisionLog getDecisionAuditLogByGivenId(ownerID, context, decisionID).execute();

Retrieves the owner&#39;s decision audit log by given decisionID

This endpoint will retrieve a decision for a given decision log ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    String decisionID = "decisionID_example";
    try {
      DecisionLog result = client
              .policyManagement
              .getDecisionAuditLogByGivenId(ownerID, context, decisionID)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDecision());
      System.out.println(result.getId());
      System.out.println(result.getMetadata());
      System.out.println(result.getPolicies());
      System.out.println(result.getTimeTakenMs());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionAuditLogByGivenId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DecisionLog> response = client
              .policyManagement
              .getDecisionAuditLogByGivenId(ownerID, context, decisionID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionAuditLogByGivenId");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **decisionID** | **String**|  | |

### Return type

[**DecisionLog**](DecisionLog.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decision log successfully retrieved. |  -  |

<a name="getDecisionAuditLogs"></a>
# **getDecisionAuditLogs**
> List&lt;DecisionLog&gt; getDecisionAuditLogs(ownerID, context).status(status).after(after).before(before).branch(branch).projectId(projectId).buildNumber(buildNumber).offset(offset).execute();

Retrieves the owner&#39;s decision audit logs.

This endpoint will return a list of decision audit logs that were made using this owner&#39;s policies.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    String status = "status_example"; // Return decisions matching this decision status.
    OffsetDateTime after = OffsetDateTime.now(); // Return decisions made after this date.
    OffsetDateTime before = OffsetDateTime.now(); // Return decisions made before this date.
    String branch = "branch_example"; // Return decisions made on this branch.
    String projectId = "projectId_example"; // Return decisions made for this project.
    String buildNumber = "buildNumber_example"; // Return decisions made for this build number.
    Integer offset = 56; // Sets the offset when retrieving the decisions, for paging.
    try {
      List<DecisionLog> result = client
              .policyManagement
              .getDecisionAuditLogs(ownerID, context)
              .status(status)
              .after(after)
              .before(before)
              .branch(branch)
              .projectId(projectId)
              .buildNumber(buildNumber)
              .offset(offset)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionAuditLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DecisionLog>> response = client
              .policyManagement
              .getDecisionAuditLogs(ownerID, context)
              .status(status)
              .after(after)
              .before(before)
              .branch(branch)
              .projectId(projectId)
              .buildNumber(buildNumber)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionAuditLogs");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **status** | **String**| Return decisions matching this decision status. | [optional] |
| **after** | **OffsetDateTime**| Return decisions made after this date. | [optional] |
| **before** | **OffsetDateTime**| Return decisions made before this date. | [optional] |
| **branch** | **String**| Return decisions made on this branch. | [optional] |
| **projectId** | **String**| Return decisions made for this project. | [optional] |
| **buildNumber** | **String**| Return decisions made for this build number. | [optional] |
| **offset** | **Integer**| Sets the offset when retrieving the decisions, for paging. | [optional] |

### Return type

[**List&lt;DecisionLog&gt;**](DecisionLog.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decision logs successfully retrieved. |  -  |

<a name="getDecisionSettings"></a>
# **getDecisionSettings**
> DecisionSettings getDecisionSettings(ownerID, context).execute();

Get the decision settings

This endpoint retrieves the current decision settings (eg enable/disable policy evaluation)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    try {
      DecisionSettings result = client
              .policyManagement
              .getDecisionSettings(ownerID, context)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DecisionSettings> response = client
              .policyManagement
              .getDecisionSettings(ownerID, context)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDecisionSettings");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |

### Return type

[**DecisionSettings**](DecisionSettings.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decision settings successfully retrieved. |  -  |

<a name="getDocument"></a>
# **getDocument**
> Policy getDocument(ownerID, context, policyName).execute();

Retrieves a policy document

This endpoint will retrieve a policy document.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    String policyName = "policyName_example"; // the policy name set by the rego policy_name rule
    try {
      Policy result = client
              .policyManagement
              .getDocument(ownerID, context, policyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getContent());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policyManagement
              .getDocument(ownerID, context, policyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getDocument");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **policyName** | **String**| the policy name set by the rego policy_name rule | |

### Return type

[**Policy**](Policy.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy retrieved successfully. |  -  |

<a name="getPolicyBundle"></a>
# **getPolicyBundle**
> Map&lt;String, List&lt;Policy&gt;&gt; getPolicyBundle(ownerID, context).execute();

Retrieves Policy Bundle

This endpoint will retrieve a policy bundle

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    try {
      Map<String, List<Policy>> result = client
              .policyManagement
              .getPolicyBundle(ownerID, context)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getPolicyBundle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, List<Policy>>> response = client
              .policyManagement
              .getPolicyBundle(ownerID, context)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getPolicyBundle");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;Policy&gt;&gt;**](List.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy-Bundle retrieved successfully. |  -  |

<a name="getPolicyBundleForDecision"></a>
# **getPolicyBundleForDecision**
> Map&lt;String, List&lt;Policy&gt;&gt; getPolicyBundleForDecision(ownerID, context, decisionID).execute();

Retrieves Policy Bundle for a given decision log ID

This endpoint will retrieve a policy bundle for a given decision log ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    String decisionID = "decisionID_example";
    try {
      Map<String, List<Policy>> result = client
              .policyManagement
              .getPolicyBundleForDecision(ownerID, context, decisionID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getPolicyBundleForDecision");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, List<Policy>>> response = client
              .policyManagement
              .getPolicyBundleForDecision(ownerID, context, decisionID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#getPolicyBundleForDecision");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **decisionID** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;Policy&gt;&gt;**](List.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy-Bundle retrieved successfully for given decision log ID |  -  |

<a name="modifyDecisionSettings"></a>
# **modifyDecisionSettings**
> DecisionSettings modifyDecisionSettings(ownerID, context).decisionSettings(decisionSettings).execute();

Set the decision settings

This endpoint allows modifying decision settings (eg enable/disable policy evaluation)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyManagementApi;
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
    String ownerID = "ownerID_example";
    String context = "context_example";
    Boolean enabled = true;
    try {
      DecisionSettings result = client
              .policyManagement
              .modifyDecisionSettings(ownerID, context)
              .enabled(enabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#modifyDecisionSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DecisionSettings> response = client
              .policyManagement
              .modifyDecisionSettings(ownerID, context)
              .enabled(enabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyManagementApi#modifyDecisionSettings");
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
| **ownerID** | **String**|  | |
| **context** | **String**|  | |
| **decisionSettings** | [**DecisionSettings**](DecisionSettings.md)|  | [optional] |

### Return type

[**DecisionSettings**](DecisionSettings.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decision settings successfully set. |  -  |

