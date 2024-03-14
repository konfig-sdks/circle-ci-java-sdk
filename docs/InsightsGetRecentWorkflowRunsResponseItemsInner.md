

# InsightsGetRecentWorkflowRunsResponseItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique ID of the workflow. |  |
|**branch** | **String** | The VCS branch of a Workflow&#39;s trigger. |  |
|**duration** | **Long** | The duration in seconds of a run. |  |
|**createdAt** | **OffsetDateTime** | The date and time the workflow was created. |  |
|**stoppedAt** | **OffsetDateTime** | The date and time the workflow stopped. |  |
|**creditsUsed** | **Long** | The number of credits used during execution. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Workflow status. |  |
|**isApproval** | **Boolean** | Describes if the job is an approval job or not. Approval jobs are intermediary jobs that are created to pause the workflow until approved. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |
| ERROR | &quot;error&quot; |
| CANCELED | &quot;canceled&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |



