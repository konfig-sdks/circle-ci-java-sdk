

# JobGetDetailsResponse

Job Details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webUrl** | **String** | URL of the job in CircleCI Web UI. |  |
|**project** | [**JobGetDetailsResponseProject**](JobGetDetailsResponseProject.md) |  |  |
|**parallelRuns** | [**List&lt;JobGetDetailsResponseParallelRunsInner&gt;**](JobGetDetailsResponseParallelRunsInner.md) | Info about parallels runs and their status. |  |
|**startedAt** | **OffsetDateTime** | The date and time the job started. |  |
|**latestWorkflow** | [**JobGetDetailsResponseLatestWorkflow**](JobGetDetailsResponseLatestWorkflow.md) |  |  |
|**name** | **String** | The name of the job. |  |
|**executor** | [**JobGetDetailsResponseExecutor**](JobGetDetailsResponseExecutor.md) |  |  |
|**parallelism** | **Long** | A number of parallel runs the job has. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the job. |  |
|**number** | **Long** | The number of the job. |  |
|**pipeline** | [**JobGetDetailsResponsePipeline**](JobGetDetailsResponsePipeline.md) |  |  |
|**duration** | **Long** | Duration of a job in milliseconds. |  |
|**createdAt** | **OffsetDateTime** | The time when the job was created. |  |
|**messages** | [**List&lt;JobGetDetailsResponseMessagesInner&gt;**](JobGetDetailsResponseMessagesInner.md) | Messages from CircleCI execution platform. |  |
|**contexts** | [**List&lt;JobGetDetailsResponseContextsInner&gt;**](JobGetDetailsResponseContextsInner.md) | List of contexts used by the job. |  |
|**organization** | [**JobGetDetailsResponseOrganization**](JobGetDetailsResponseOrganization.md) |  |  |
|**queuedAt** | **OffsetDateTime** | The time when the job was placed in a queue. |  |
|**stoppedAt** | **OffsetDateTime** | The time when the job stopped. |  [optional] |



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



