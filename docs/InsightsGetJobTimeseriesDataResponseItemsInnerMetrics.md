

# InsightsGetJobTimeseriesDataResponseItemsInnerMetrics

Metrics relating to a workflow's runs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalRuns** | **Long** | The total number of runs, including runs that are still on-hold or running. |  |
|**failedRuns** | **Long** | The number of failed runs. |  |
|**successfulRuns** | **Long** | The number of successful runs. |  |
|**throughput** | **Float** | The average number of runs per day. |  |
|**medianCreditsUsed** | **Long** | The median credits consumed over the current timeseries interval. |  |
|**totalCreditsUsed** | **Long** | The total credits consumed over the current timeseries interval. |  |
|**durationMetrics** | [**InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics**](InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.md) |  |  |



