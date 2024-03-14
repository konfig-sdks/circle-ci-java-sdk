

# ProjectGetBySlugResponse

NOTE: The definition of Project is subject to change.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**slug** | **String** | Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). |  |
|**name** | **String** | The name of the project |  |
|**id** | **UUID** |  |  |
|**organizationName** | **String** | The name of the organization the project belongs to |  |
|**organizationSlug** | **String** | The slug of the organization the project belongs to |  |
|**organizationId** | **UUID** | The id of the organization the project belongs to |  |
|**vcsInfo** | [**ProjectGetBySlugResponseVcsInfo**](ProjectGetBySlugResponseVcsInfo.md) |  |  |



