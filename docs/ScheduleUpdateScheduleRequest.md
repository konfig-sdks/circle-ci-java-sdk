

# ScheduleUpdateScheduleRequest

The parameters for an update schedule request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the schedule. |  [optional] |
|**parameters** | **Map&lt;String, Object&gt;** | Pipeline parameters represented as key-value pairs. Must contain branch or tag. |  [optional] |
|**name** | **String** | Name of the schedule. |  [optional] |
|**timetable** | [**ScheduleUpdateScheduleRequestTimetable**](ScheduleUpdateScheduleRequestTimetable.md) |  |  [optional] |
|**attributionActor** | [**AttributionActorEnum**](#AttributionActorEnum) | The attribution-actor of the scheduled pipeline. |  [optional] |



## Enum: AttributionActorEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;current&quot; |
| SYSTEM | &quot;system&quot; |



