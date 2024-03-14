

# PipelineTrigger

A summary of the trigger.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of trigger. |  |
|**receivedAt** | **OffsetDateTime** | The date and time the trigger was received. |  |
|**actor** | [**PipelineTriggerActor**](PipelineTriggerActor.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SCHEDULED_PIPELINE | &quot;scheduled_pipeline&quot; |
| EXPLICIT | &quot;explicit&quot; |
| API | &quot;api&quot; |
| WEBHOOK | &quot;webhook&quot; |



