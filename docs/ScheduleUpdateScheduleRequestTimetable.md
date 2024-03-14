

# ScheduleUpdateScheduleRequestTimetable

Timetable that specifies when a schedule triggers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**perHour** | **Integer** | Number of times a schedule triggers per hour, value must be between 1 and 60 |  [optional] |
|**hoursOfDay** | **List&lt;Integer&gt;** | Hours in a day in which the schedule triggers. |  [optional] |
|**daysOfWeek** | [**List&lt;DaysOfWeekEnum&gt;**](#List&lt;DaysOfWeekEnum&gt;) | Days in a week in which the schedule triggers. |  [optional] |
|**daysOfMonth** | **List&lt;Integer&gt;** | Days in a month in which the schedule triggers. This is mutually exclusive with days in a week. |  [optional] |
|**months** | [**List&lt;MonthsEnum&gt;**](#List&lt;MonthsEnum&gt;) | Months in which the schedule triggers. |  [optional] |



## Enum: List&lt;DaysOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| TUE | &quot;TUE&quot; |
| SAT | &quot;SAT&quot; |
| SUN | &quot;SUN&quot; |
| MON | &quot;MON&quot; |
| THU | &quot;THU&quot; |
| WED | &quot;WED&quot; |
| FRI | &quot;FRI&quot; |



## Enum: List&lt;MonthsEnum&gt;

| Name | Value |
|---- | -----|
| MAR | &quot;MAR&quot; |
| NOV | &quot;NOV&quot; |
| DEC | &quot;DEC&quot; |
| JUN | &quot;JUN&quot; |
| MAY | &quot;MAY&quot; |
| OCT | &quot;OCT&quot; |
| FEB | &quot;FEB&quot; |
| APR | &quot;APR&quot; |
| SEP | &quot;SEP&quot; |
| AUG | &quot;AUG&quot; |
| JAN | &quot;JAN&quot; |
| JUL | &quot;JUL&quot; |



