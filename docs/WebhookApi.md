# WebhookApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOutboundWebhook**](WebhookApi.md#createOutboundWebhook) | **POST** /webhook | Create an outbound webhook |
| [**deleteOutboundWebhook**](WebhookApi.md#deleteOutboundWebhook) | **DELETE** /webhook/{webhook-id} | Delete an outbound webhook |
| [**getById**](WebhookApi.md#getById) | **GET** /webhook/{webhook-id} | Get a webhook |
| [**listMatchingScope**](WebhookApi.md#listMatchingScope) | **GET** /webhook | List webhooks |
| [**updateOutboundWebhook**](WebhookApi.md#updateOutboundWebhook) | **PUT** /webhook/{webhook-id} | Update an outbound webhook |


<a name="createOutboundWebhook"></a>
# **createOutboundWebhook**
> WebhookCreateOutboundWebhookResponse createOutboundWebhook().webhookCreateOutboundWebhookRequest(webhookCreateOutboundWebhookRequest).execute();

Create an outbound webhook

Creates an outbound webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String name = "name_example"; // Name of the webhook
    List<String> events = Arrays.asList(); // Events that will trigger the webhook
    String url = "url_example"; // URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
    Boolean verifyTls = true; // Whether to enforce TLS certificate verification when delivering the webhook
    String signingSecret = "signingSecret_example"; // Secret used to build an HMAC hash of the payload and passed as a header in the webhook request
    WebhookCreateOutboundWebhookRequestScope scope = new WebhookCreateOutboundWebhookRequestScope();
    try {
      WebhookCreateOutboundWebhookResponse result = client
              .webhook
              .createOutboundWebhook(name, events, url, verifyTls, signingSecret, scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getVerifyTls());
      System.out.println(result.getId());
      System.out.println(result.getSigningSecret());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getScope());
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#createOutboundWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookCreateOutboundWebhookResponse> response = client
              .webhook
              .createOutboundWebhook(name, events, url, verifyTls, signingSecret, scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#createOutboundWebhook");
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
| **webhookCreateOutboundWebhookRequest** | [**WebhookCreateOutboundWebhookRequest**](WebhookCreateOutboundWebhookRequest.md)|  | [optional] |

### Return type

[**WebhookCreateOutboundWebhookResponse**](WebhookCreateOutboundWebhookResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A webhook |  -  |
| **0** | Error response. |  -  |

<a name="deleteOutboundWebhook"></a>
# **deleteOutboundWebhook**
> WebhookDeleteOutboundWebhookResponse deleteOutboundWebhook(webhookId).execute();

Delete an outbound webhook

Deletes an outbound webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    UUID webhookId = UUID.randomUUID(); // ID of the webhook (UUID)
    try {
      WebhookDeleteOutboundWebhookResponse result = client
              .webhook
              .deleteOutboundWebhook(webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#deleteOutboundWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookDeleteOutboundWebhookResponse> response = client
              .webhook
              .deleteOutboundWebhook(webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#deleteOutboundWebhook");
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
| **webhookId** | **UUID**| ID of the webhook (UUID) | |

### Return type

[**WebhookDeleteOutboundWebhookResponse**](WebhookDeleteOutboundWebhookResponse.md)

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

<a name="getById"></a>
# **getById**
> WebhookGetByIdResponse getById(webhookId).execute();

Get a webhook

Get an outbound webhook by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    UUID webhookId = UUID.randomUUID(); // ID of the webhook (UUID)
    try {
      WebhookGetByIdResponse result = client
              .webhook
              .getById(webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getVerifyTls());
      System.out.println(result.getId());
      System.out.println(result.getSigningSecret());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getScope());
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookGetByIdResponse> response = client
              .webhook
              .getById(webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getById");
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
| **webhookId** | **UUID**| ID of the webhook (UUID) | |

### Return type

[**WebhookGetByIdResponse**](WebhookGetByIdResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook |  -  |
| **0** | Error response. |  -  |

<a name="listMatchingScope"></a>
# **listMatchingScope**
> WebhookListMatchingScopeResponse listMatchingScope(scopeId, scopeType).execute();

List webhooks

Get a list of outbound webhooks that match the given scope-type and scope-id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    UUID scopeId = UUID.randomUUID(); // ID of the scope being used (at the moment, only project ID is supported)
    String scopeType = "project"; // Type of the scope being used
    try {
      WebhookListMatchingScopeResponse result = client
              .webhook
              .listMatchingScope(scopeId, scopeType)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#listMatchingScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookListMatchingScopeResponse> response = client
              .webhook
              .listMatchingScope(scopeId, scopeType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#listMatchingScope");
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
| **scopeId** | **UUID**| ID of the scope being used (at the moment, only project ID is supported) | |
| **scopeType** | **String**| Type of the scope being used | [enum: project] |

### Return type

[**WebhookListMatchingScopeResponse**](WebhookListMatchingScopeResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of webhooks |  -  |
| **0** | Error response. |  -  |

<a name="updateOutboundWebhook"></a>
# **updateOutboundWebhook**
> WebhookUpdateOutboundWebhookResponse updateOutboundWebhook(webhookId).webhookUpdateOutboundWebhookRequest(webhookUpdateOutboundWebhookRequest).execute();

Update an outbound webhook

Updates an outbound webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    UUID webhookId = UUID.randomUUID(); // ID of the webhook (UUID)
    String name = "name_example"; // Name of the webhook
    List<String> events = Arrays.asList(); // Events that will trigger the webhook
    String url = "url_example"; // URL to deliver the webhook to. Note: protocol must be included as well (only https is supported)
    String signingSecret = "signingSecret_example"; // Secret used to build an HMAC hash of the payload and passed as a header in the webhook request
    Boolean verifyTls = true; // Whether to enforce TLS certificate verification when delivering the webhook
    try {
      WebhookUpdateOutboundWebhookResponse result = client
              .webhook
              .updateOutboundWebhook(webhookId)
              .name(name)
              .events(events)
              .url(url)
              .signingSecret(signingSecret)
              .verifyTls(verifyTls)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getVerifyTls());
      System.out.println(result.getId());
      System.out.println(result.getSigningSecret());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getScope());
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateOutboundWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookUpdateOutboundWebhookResponse> response = client
              .webhook
              .updateOutboundWebhook(webhookId)
              .name(name)
              .events(events)
              .url(url)
              .signingSecret(signingSecret)
              .verifyTls(verifyTls)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateOutboundWebhook");
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
| **webhookId** | **UUID**| ID of the webhook (UUID) | |
| **webhookUpdateOutboundWebhookRequest** | [**WebhookUpdateOutboundWebhookRequest**](WebhookUpdateOutboundWebhookRequest.md)|  | [optional] |

### Return type

[**WebhookUpdateOutboundWebhookResponse**](WebhookUpdateOutboundWebhookResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook |  -  |
| **0** | Error response. |  -  |

