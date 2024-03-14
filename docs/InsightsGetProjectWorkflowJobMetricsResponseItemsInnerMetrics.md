

# InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetrics

Metrics relating to a workflow job's runs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalRuns** | **Long** | The total number of runs, including runs that are still on-hold or running. |  |
|**failedRuns** | **Long** | The number of failed runs. |  |
|**successfulRuns** | **Long** | The number of successful runs. |  |
|**durationMetrics** | [**InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetricsDurationMetrics**](InsightsGetProjectWorkflowJobMetricsResponseItemsInnerMetricsDurationMetrics.md) |  |  |
|**successRate** | **Float** |  |  |
|**totalCreditsUsed** | **Long** | The total credits consumed by the job in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting. |  |
|**throughput** | **Float** | The average number of runs per day. |  |



