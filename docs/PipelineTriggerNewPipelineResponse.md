

# PipelineTriggerNewPipelineResponse

A pipeline creation response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique ID of the pipeline. |  |
|**state** | [**StateEnum**](#StateEnum) | The current state of the pipeline. |  |
|**number** | **Long** | The number of the pipeline. |  |
|**createdAt** | **OffsetDateTime** | The date and time the pipeline was created. |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| ERRORED | &quot;errored&quot; |
| SETUP_PENDING | &quot;setup-pending&quot; |
| SETUP | &quot;setup&quot; |
| PENDING | &quot;pending&quot; |



