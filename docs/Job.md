

# Job

Job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canceledBy** | **UUID** | The unique ID of the user. |  [optional] |
|**dependencies** | **List&lt;UUID&gt;** | A sequence of the unique job IDs for the jobs that this job depends upon in the workflow. |  |
|**jobNumber** | **Long** | The number of the job. |  [optional] |
|**id** | **UUID** | The unique ID of the job. |  |
|**startedAt** | **OffsetDateTime** | The date and time the job started. |  |
|**name** | **String** | The name of the job. |  |
|**approvedBy** | **UUID** | The unique ID of the user. |  [optional] |
|**projectSlug** | **String** | The project-slug for the job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the job. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of job. |  |
|**stoppedAt** | **OffsetDateTime** | The time when the job stopped. |  [optional] |
|**approvalRequestId** | **UUID** | The unique ID of the job. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| RUNNING | &quot;running&quot; |
| NOT_RUN | &quot;not_run&quot; |
| FAILED | &quot;failed&quot; |
| RETRIED | &quot;retried&quot; |
| QUEUED | &quot;queued&quot; |
| NOT_RUNNING | &quot;not_running&quot; |
| INFRASTRUCTURE_FAIL | &quot;infrastructure_fail&quot; |
| TIMEDOUT | &quot;timedout&quot; |
| ON_HOLD | &quot;on_hold&quot; |
| TERMINATED_UNKNOWN | &quot;terminated-unknown&quot; |
| BLOCKED | &quot;blocked&quot; |
| CANCELED | &quot;canceled&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUILD | &quot;build&quot; |
| APPROVAL | &quot;approval&quot; |



