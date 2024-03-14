

# Pipeline1

A pipeline response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique ID of the pipeline. |  |
|**errors** | [**List&lt;PipelineErrorsInner&gt;**](PipelineErrorsInner.md) | A sequence of errors that have occurred within the pipeline. |  |
|**projectSlug** | **String** | The project-slug for the pipeline. |  |
|**updatedAt** | **OffsetDateTime** | The date and time the pipeline was last updated. |  [optional] |
|**number** | **Long** | The number of the pipeline. |  |
|**triggerParameters** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The current state of the pipeline. |  |
|**createdAt** | **OffsetDateTime** | The date and time the pipeline was created. |  |
|**trigger** | [**PipelineTrigger**](PipelineTrigger.md) |  |  |
|**vcs** | [**Pipeline1Vcs**](Pipeline1Vcs.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| ERRORED | &quot;errored&quot; |
| SETUP_PENDING | &quot;setup-pending&quot; |
| SETUP | &quot;setup&quot; |
| PENDING | &quot;pending&quot; |



