

# WebhookUpdateOutboundWebhookRequest

The parameters for an update webhook request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the webhook |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Events that will trigger the webhook |  [optional] |
|**url** | **String** | URL to deliver the webhook to. Note: protocol must be included as well (only https is supported) |  [optional] |
|**signingSecret** | **String** | Secret used to build an HMAC hash of the payload and passed as a header in the webhook request |  [optional] |
|**verifyTls** | **Boolean** | Whether to enforce TLS certificate verification when delivering the webhook |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| WORKFLOW_COMPLETED | &quot;workflow-completed&quot; |
| JOB_COMPLETED | &quot;job-completed&quot; |



