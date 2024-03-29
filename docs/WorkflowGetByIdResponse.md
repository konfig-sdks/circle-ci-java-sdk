

# WorkflowGetByIdResponse

A workflow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pipelineId** | **UUID** | The ID of the pipeline this workflow belongs to. |  |
|**canceledBy** | **UUID** |  |  [optional] |
|**id** | **UUID** | The unique ID of the workflow. |  |
|**name** | **String** | The name of the workflow. |  |
|**projectSlug** | **String** | The project-slug for the pipeline this workflow belongs to. |  |
|**erroredBy** | **UUID** |  |  [optional] |
|**tag** | [**TagEnum**](#TagEnum) | Tag used for the workflow |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the workflow. |  |
|**startedBy** | **UUID** |  |  |
|**pipelineNumber** | **Long** | The number of the pipeline this workflow belongs to. |  |
|**createdAt** | **OffsetDateTime** | The date and time the workflow was created. |  |
|**stoppedAt** | **OffsetDateTime** | The date and time the workflow stopped. |  |



## Enum: TagEnum

| Name | Value |
|---- | -----|
| SETUP | &quot;setup&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| RUNNING | &quot;running&quot; |
| NOT_RUN | &quot;not_run&quot; |
| FAILED | &quot;failed&quot; |
| ERROR | &quot;error&quot; |
| FAILING | &quot;failing&quot; |
| ON_HOLD | &quot;on_hold&quot; |
| CANCELED | &quot;canceled&quot; |
| UNAUTHORIZED | &quot;unauthorized&quot; |



