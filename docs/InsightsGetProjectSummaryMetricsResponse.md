

# InsightsGetProjectSummaryMetricsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgId** | **Object** | The unique ID of the organization |  [optional] |
|**projectId** | **Object** | The unique ID of the project |  [optional] |
|**projectData** | [**InsightsGetProjectSummaryMetricsResponseProjectData**](InsightsGetProjectSummaryMetricsResponseProjectData.md) |  |  [optional] |
|**projectWorkflowData** | [**List&lt;InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInner&gt;**](InsightsGetProjectSummaryMetricsResponseProjectWorkflowDataInner.md) | A list of metrics and trends data for workflows for a given project. |  [optional] |
|**projectWorkflowBranchData** | [**List&lt;InsightsGetProjectSummaryMetricsResponseProjectWorkflowBranchDataInner&gt;**](InsightsGetProjectSummaryMetricsResponseProjectWorkflowBranchDataInner.md) | A list of metrics and trends data for branches for a given project. |  [optional] |
|**allBranches** | **List&lt;String&gt;** | A list of all the branches for a given project. |  [optional] |
|**allWorkflows** | **List&lt;String&gt;** | A list of all the workflows for a given project. |  [optional] |



