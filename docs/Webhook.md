

# Webhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | URL to deliver the webhook to. Note: protocol must be included as well (only https is supported) |  |
|**verifyTls** | **Boolean** | Whether to enforce TLS certificate verification when delivering the webhook |  |
|**id** | **UUID** | The unique ID of the webhook |  |
|**signingSecret** | **String** | Masked value of the secret used to build an HMAC hash of the payload and passed as a header in the webhook request |  |
|**updatedAt** | **OffsetDateTime** | The date and time the webhook was last updated. |  |
|**name** | **String** | Name of the webhook |  |
|**createdAt** | **OffsetDateTime** | The date and time the webhook was created. |  |
|**scope** | [**WebhookScope**](WebhookScope.md) |  |  |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Events that will trigger the webhook |  |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| WORKFLOW_COMPLETED | &quot;workflow-completed&quot; |
| JOB_COMPLETED | &quot;job-completed&quot; |



