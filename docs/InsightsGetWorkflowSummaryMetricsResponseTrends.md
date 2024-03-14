

# InsightsGetWorkflowSummaryMetricsResponseTrends

Trends for aggregated metrics across a workflow for a given time window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalRuns** | **Float** | The trend value for total number of runs. |  |
|**failedRuns** | **Float** | The trend value for number of failed runs. |  |
|**successRate** | **Float** | The trend value for the success rate. |  |
|**p95DurationSecs** | **Float** | Trend value for the 95th percentile duration for a workflow for a given time window. |  |
|**medianDurationSecs** | **Float** | Trend value for the 50th percentile duration for a workflow for a given time window. |  |
|**totalCreditsUsed** | **Float** | The trend value for total credits consumed. |  |
|**mttr** | **Float** | trend for mean time to recovery (mean time between failures and their next success). |  |
|**throughput** | **Float** | Trend value for the average number of runs per day. |  |



