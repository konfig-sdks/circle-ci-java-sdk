

# InsightsGetFlakyTestsResponse

Flaky tests response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flakyTests** | [**List&lt;InsightsGetFlakyTestsResponseFlakyTestsInner&gt;**](InsightsGetFlakyTestsResponseFlakyTestsInner.md) | A list of all instances of flakes. Note that a test is no longer considered flaky after 2 weeks have passed without a flake. Each flake resets this timer. |  |
|**totalFlakyTests** | **Double** | A count of unique tests that have failed. If your project has N tests that have flaked multiple times each, this will be equal to N. |  |



