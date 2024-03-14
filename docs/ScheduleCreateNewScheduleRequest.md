

# ScheduleCreateNewScheduleRequest

The parameters for a create schedule request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the schedule. |  [optional] |
|**parameters** | **Map&lt;String, Object&gt;** | Pipeline parameters represented as key-value pairs. Must contain branch or tag. |  |
|**name** | **String** | Name of the schedule. |  |
|**timetable** | [**ScheduleCreateNewScheduleRequestTimetable**](ScheduleCreateNewScheduleRequestTimetable.md) |  |  |
|**attributionActor** | [**AttributionActorEnum**](#AttributionActorEnum) | The attribution-actor of the scheduled pipeline. |  |



## Enum: AttributionActorEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;current&quot; |
| SYSTEM | &quot;system&quot; |



