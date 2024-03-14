

# ProjectSettingsAdvanced


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autocancelBuilds** | **Boolean** | Except for the default branch, cancel running pipelines on a branch when a new pipeline starts on that branch. |  [optional] |
|**buildForkPrs** | **Boolean** | Run builds for pull requests from forks. |  [optional] |
|**buildPrsOnly** | **Boolean** | Once enabled, we will only build branches that have associated pull requests open. |  [optional] |
|**disableSsh** | **Boolean** | When set to true, job re-runs with SSH debugging access will be disabled for the project. |  [optional] |
|**forksReceiveSecretEnvVars** | **Boolean** | Run builds for forked pull requests with this project&#39;s configuration, environment variables, and secrets. |  [optional] |
|**oss** | **Boolean** | Free and Open Source. Enabling this grants additional credits, and lets others see your builds, both through the web UI and the API. |  [optional] |
|**setGithubStatus** | **Boolean** | Report the status of every pushed commit to GitHub&#39;s status API. Updates reported per job. |  [optional] |
|**setupWorkflows** | **Boolean** | Enabling allows you to conditionally trigger configurations outside of the primary &#x60;.circleci&#x60; parent directory. |  [optional] |
|**writeSettingsRequiresAdmin** | **Boolean** | Whether updating these settings requires a user to be an organization administrator. When disabled, updating settings can be done by any member. |  [optional] |
|**prOnlyBranchOverrides** | **List&lt;String&gt;** | This field is used in conjunction with the &#x60;build_prs_only&#x60;, it allows you to specify a list of branches that will always triger a build. The value passed will overwrite the existing value. |  [optional] |



