

# JobGetDetailsResponseProject

Information about a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**slug** | **String** | Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). |  |
|**name** | **String** | The name of the project |  |
|**externalUrl** | **String** | URL to the repository hosting the project&#39;s code |  |



