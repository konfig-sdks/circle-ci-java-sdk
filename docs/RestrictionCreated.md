

# RestrictionCreated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | UUID of the project restriction |  [optional] |
|**projectId** | **UUID** | Deprecated - For \&quot;project\&quot; restrictions read the project ID from \&quot;restriction_value\&quot; instead.  UUID of the project used in a project restriction.  |  [optional] |
|**name** | **String** | Contains a human-readable reference for the restriction. For \&quot;project\&quot; restrictions this is the name of the project.  May be null.  |  [optional] |
|**restrictionType** | [**RestrictionTypeEnum**](#RestrictionTypeEnum) | Type of the restriction |  [optional] |
|**restrictionValue** | **String** | Value used to evaluate the restriction |  [optional] |



## Enum: RestrictionTypeEnum

| Name | Value |
|---- | -----|
| PROJECT | &quot;project&quot; |
| EXPRESSION | &quot;expression&quot; |



