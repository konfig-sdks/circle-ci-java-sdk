# ScheduleApi

All URIs are relative to *https://circleci.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewSchedule**](ScheduleApi.md#createNewSchedule) | **POST** /project/{project-slug}/schedule | Create a schedule |
| [**getAllSchedules**](ScheduleApi.md#getAllSchedules) | **GET** /project/{project-slug}/schedule | Get all schedules |
| [**getById**](ScheduleApi.md#getById) | **GET** /schedule/{schedule-id} | Get a schedule |
| [**removeById**](ScheduleApi.md#removeById) | **DELETE** /schedule/{schedule-id} | Delete a schedule |
| [**updateSchedule**](ScheduleApi.md#updateSchedule) | **PATCH** /schedule/{schedule-id} | Update a schedule |


<a name="createNewSchedule"></a>
# **createNewSchedule**
> ScheduleCreateNewScheduleResponse createNewSchedule(projectSlug).scheduleCreateNewScheduleRequest(scheduleCreateNewScheduleRequest).execute();

Create a schedule

Not yet available to projects that use GitLab or GitHub App. Creates a schedule and returns the created schedule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleApi;
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
    Map<String, Object> parameters = new HashMap(); // Pipeline parameters represented as key-value pairs. Must contain branch or tag.
    String name = "name_example"; // Name of the schedule.
    ScheduleCreateNewScheduleRequestTimetable timetable = new ScheduleCreateNewScheduleRequestTimetable();
    String attributionActor = "current"; // The attribution-actor of the scheduled pipeline.
    String projectSlug = "gh/CircleCI-Public/api-preview-docs"; // Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).
    String description = "description_example"; // Description of the schedule.
    try {
      ScheduleCreateNewScheduleResponse result = client
              .schedule
              .createNewSchedule(parameters, name, timetable, attributionActor, projectSlug)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getParameters());
      System.out.println(result.getId());
      System.out.println(result.getTimetable());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getActor());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#createNewSchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleCreateNewScheduleResponse> response = client
              .schedule
              .createNewSchedule(parameters, name, timetable, attributionActor, projectSlug)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#createNewSchedule");
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
| **scheduleCreateNewScheduleRequest** | [**ScheduleCreateNewScheduleRequest**](ScheduleCreateNewScheduleRequest.md)|  | [optional] |

### Return type

[**ScheduleCreateNewScheduleResponse**](ScheduleCreateNewScheduleResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A schedule object. |  -  |
| **0** | Error response. |  -  |

<a name="getAllSchedules"></a>
# **getAllSchedules**
> ScheduleGetAllSchedulesResponse getAllSchedules(projectSlug).pageToken(pageToken).execute();

Get all schedules

Returns all schedules for this project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleApi;
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
      ScheduleGetAllSchedulesResponse result = client
              .schedule
              .getAllSchedules(projectSlug)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getItems());
      System.out.println(result.getNextPageToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#getAllSchedules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleGetAllSchedulesResponse> response = client
              .schedule
              .getAllSchedules(projectSlug)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#getAllSchedules");
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

[**ScheduleGetAllSchedulesResponse**](ScheduleGetAllSchedulesResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of schedules. |  -  |
| **0** | Error response. |  -  |

<a name="getById"></a>
# **getById**
> ScheduleGetByIdResponse getById(scheduleId).execute();

Get a schedule

Get a schedule by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleApi;
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
    UUID scheduleId = UUID.randomUUID(); // The unique ID of the schedule.
    try {
      ScheduleGetByIdResponse result = client
              .schedule
              .getById(scheduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getParameters());
      System.out.println(result.getId());
      System.out.println(result.getTimetable());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getActor());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleGetByIdResponse> response = client
              .schedule
              .getById(scheduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#getById");
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
| **scheduleId** | **UUID**| The unique ID of the schedule. | |

### Return type

[**ScheduleGetByIdResponse**](ScheduleGetByIdResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A schedule object. |  -  |
| **0** | Error response. |  -  |

<a name="removeById"></a>
# **removeById**
> ScheduleRemoveByIdResponse removeById(scheduleId).execute();

Delete a schedule

Not yet available to projects that use GitLab or GitHub App. Deletes the schedule by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleApi;
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
    UUID scheduleId = UUID.randomUUID(); // The unique ID of the schedule.
    try {
      ScheduleRemoveByIdResponse result = client
              .schedule
              .removeById(scheduleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleRemoveByIdResponse> response = client
              .schedule
              .removeById(scheduleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#removeById");
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
| **scheduleId** | **UUID**| The unique ID of the schedule. | |

### Return type

[**ScheduleRemoveByIdResponse**](ScheduleRemoveByIdResponse.md)

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

<a name="updateSchedule"></a>
# **updateSchedule**
> ScheduleUpdateScheduleResponse updateSchedule(scheduleId).scheduleUpdateScheduleRequest(scheduleUpdateScheduleRequest).execute();

Update a schedule

Not yet available to projects that use GitLab or GitHub App. Updates a schedule and returns the updated schedule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CircleCi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScheduleApi;
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
    UUID scheduleId = UUID.randomUUID(); // The unique ID of the schedule.
    String description = "description_example"; // Description of the schedule.
    Map<String, Object> parameters = new HashMap(); // Pipeline parameters represented as key-value pairs. Must contain branch or tag.
    String name = "name_example"; // Name of the schedule.
    ScheduleUpdateScheduleRequestTimetable timetable = new ScheduleUpdateScheduleRequestTimetable();
    String attributionActor = "current"; // The attribution-actor of the scheduled pipeline.
    try {
      ScheduleUpdateScheduleResponse result = client
              .schedule
              .updateSchedule(scheduleId)
              .description(description)
              .parameters(parameters)
              .name(name)
              .timetable(timetable)
              .attributionActor(attributionActor)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getParameters());
      System.out.println(result.getId());
      System.out.println(result.getTimetable());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProjectSlug());
      System.out.println(result.getActor());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#updateSchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScheduleUpdateScheduleResponse> response = client
              .schedule
              .updateSchedule(scheduleId)
              .description(description)
              .parameters(parameters)
              .name(name)
              .timetable(timetable)
              .attributionActor(attributionActor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduleApi#updateSchedule");
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
| **scheduleId** | **UUID**| The unique ID of the schedule. | |
| **scheduleUpdateScheduleRequest** | [**ScheduleUpdateScheduleRequest**](ScheduleUpdateScheduleRequest.md)|  | [optional] |

### Return type

[**ScheduleUpdateScheduleResponse**](ScheduleUpdateScheduleResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A schedule object. |  -  |
| **0** | Error response. |  -  |

