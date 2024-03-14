

# WorkflowRerunWorkflowRequest

The information you can supply when rerunning a workflow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enableSsh** | **Boolean** | Whether to enable SSH access for the triggering user on the newly-rerun job. Requires the jobs parameter to be used and so is mutually exclusive with the from_failed parameter. |  [optional] |
|**fromFailed** | **Boolean** | Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter. |  [optional] |
|**jobs** | **List&lt;UUID&gt;** | A list of job IDs to rerun. |  [optional] |
|**sparseTree** | **Boolean** | Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter. |  [optional] |



