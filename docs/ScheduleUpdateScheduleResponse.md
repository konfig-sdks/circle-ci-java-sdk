

# ScheduleUpdateScheduleResponse

A schedule response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the schedule. |  |
|**parameters** | **Map&lt;String, Object&gt;** | Pipeline parameters represented as key-value pairs. Must contain branch or tag. |  |
|**id** | **UUID** | The unique ID of the schedule. |  |
|**timetable** | [**ScheduleCreateNewScheduleRequestTimetable**](ScheduleCreateNewScheduleRequestTimetable.md) |  |  |
|**updatedAt** | **OffsetDateTime** | The date and time the pipeline was last updated. |  |
|**name** | **String** | Name of the schedule. |  |
|**createdAt** | **OffsetDateTime** | The date and time the pipeline was created. |  |
|**projectSlug** | **String** | The project-slug for the schedule |  |
|**actor** | [**UserProperty**](UserProperty.md) |  |  |



