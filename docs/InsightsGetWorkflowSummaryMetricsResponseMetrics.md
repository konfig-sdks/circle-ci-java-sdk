

# InsightsGetWorkflowSummaryMetricsResponseMetrics

Metrics aggregated across a workflow for a given time window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalRuns** | **Long** | The total number of runs, including runs that are still on-hold or running. |  |
|**successfulRuns** | **Long** | The number of successful runs. |  |
|**mttr** | **Long** | The mean time to recovery (mean time between failures and their next success) in seconds. |  |
|**totalCreditsUsed** | **Long** | The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting. |  |
|**failedRuns** | **Long** | The number of failed runs. |  |
|**successRate** | **Float** |  |  |
|**completedRuns** | **Long** | The number of runs that ran to completion within the aggregation window |  |
|**windowStart** | **OffsetDateTime** | The timestamp of the first build within the requested reporting window. |  |
|**durationMetrics** | [**InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics**](InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics.md) |  |  |
|**windowEnd** | **OffsetDateTime** | The timestamp of the last build within the requested reporting window. |  |
|**throughput** | **Float** | The average number of runs per day. |  |



