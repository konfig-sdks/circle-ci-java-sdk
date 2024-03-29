/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ProjectCreateCheckoutKeyRequest;
import com.konfigthis.client.model.ProjectCreateCheckoutKeyResponse;
import com.konfigthis.client.model.ProjectCreateCheckoutKeydefaultResponse;
import com.konfigthis.client.model.ProjectCreateEnvVarRequest;
import com.konfigthis.client.model.ProjectCreateEnvVarResponse;
import com.konfigthis.client.model.ProjectCreateEnvVardefaultResponse;
import com.konfigthis.client.model.ProjectDeleteCheckoutKeyByFingerprintResponse;
import com.konfigthis.client.model.ProjectDeleteCheckoutKeyByFingerprintdefaultResponse;
import com.konfigthis.client.model.ProjectDeleteEnvironmentVariableResponse;
import com.konfigthis.client.model.ProjectDeleteEnvironmentVariabledefaultResponse;
import com.konfigthis.client.model.ProjectGetBySlugResponse;
import com.konfigthis.client.model.ProjectGetBySlugdefaultResponse;
import com.konfigthis.client.model.ProjectGetCheckoutKeyByFingerprintResponse;
import com.konfigthis.client.model.ProjectGetCheckoutKeyByFingerprintdefaultResponse;
import com.konfigthis.client.model.ProjectGetMaskedEnvVarResponse;
import com.konfigthis.client.model.ProjectGetMaskedEnvVardefaultResponse;
import com.konfigthis.client.model.ProjectListCheckoutKeysResponse;
import com.konfigthis.client.model.ProjectListCheckoutKeysdefaultResponse;
import com.konfigthis.client.model.ProjectListEnvVarValuesResponse;
import com.konfigthis.client.model.ProjectListEnvVarValuesdefaultResponse;
import com.konfigthis.client.model.ProjectSettings;
import com.konfigthis.client.model.ProjectSettingsAdvanced;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private static ProjectApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectApi(apiClient);
    }

    /**
     * Create a new checkout key
     *
     * Not available to projects that use GitLab or GitHub App. Creates a new checkout key. This API request is only usable with a user API token.                            Please ensure that you have authorized your account with GitHub before creating user keys.                            This is necessary to give CircleCI the permission to create a user key associated with                            your GitHub user account. You can find this page by visiting Project Settings &gt; Checkout SSH Keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCheckoutKeyTest() throws ApiException {
        String type = null;
        String projectSlug = null;
        ProjectCreateCheckoutKeyResponse response = api.createCheckoutKey(type, projectSlug)
                .execute();
        // TODO: test validations
    }

    /**
     * Create an environment variable
     *
     * Creates a new environment variable.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEnvVarTest() throws ApiException {
        String name = null;
        String value = null;
        String projectSlug = null;
        ProjectCreateEnvVarResponse response = api.createEnvVar(name, value, projectSlug)
                .execute();
        // TODO: test validations
    }

    /**
     * 🧪 Create a project
     *
     * [__EXPERIMENTAL__]  Creates a new CircleCI project, and returns a list of the default advanced settings. Can only be called on a repo with a main branch and an existing config.yml file. Not yet available to projects that use GitLab or GitHub App.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectDefaultSettingsTest() throws ApiException {
        String provider = null;
        String organization = null;
        String project = null;
        ProjectSettings response = api.createProjectDefaultSettings(provider, organization, project)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a checkout key
     *
     * Deletes the checkout key via md5 or sha256 fingerprint. sha256 keys should be url-encoded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCheckoutKeyByFingerprintTest() throws ApiException {
        String projectSlug = null;
        String fingerprint = null;
        ProjectDeleteCheckoutKeyByFingerprintResponse response = api.deleteCheckoutKeyByFingerprint(projectSlug, fingerprint)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an environment variable
     *
     * Deletes the environment variable named :name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEnvironmentVariableTest() throws ApiException {
        String projectSlug = null;
        String name = null;
        ProjectDeleteEnvironmentVariableResponse response = api.deleteEnvironmentVariable(projectSlug, name)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a project
     *
     * Retrieves a project by project slug.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBySlugTest() throws ApiException {
        String projectSlug = null;
        ProjectGetBySlugResponse response = api.getBySlug(projectSlug)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a checkout key
     *
     * Returns an individual checkout key via md5 or sha256 fingerprint. sha256 keys should be url-encoded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCheckoutKeyByFingerprintTest() throws ApiException {
        String projectSlug = null;
        String fingerprint = null;
        ProjectGetCheckoutKeyByFingerprintResponse response = api.getCheckoutKeyByFingerprint(projectSlug, fingerprint)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a masked environment variable
     *
     * Returns the masked value of environment variable :name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMaskedEnvVarTest() throws ApiException {
        String projectSlug = null;
        String name = null;
        ProjectGetMaskedEnvVarResponse response = api.getMaskedEnvVar(projectSlug, name)
                .execute();
        // TODO: test validations
    }

    /**
     * 🧪 Get project settings
     *
     * [__EXPERIMENTAL__] Returns a list of the advanced settings for a CircleCI project, whether enabled (true) or not (false).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        String provider = null;
        String organization = null;
        String project = null;
        ProjectSettings response = api.getSettings(provider, organization, project)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all checkout keys
     *
     * Returns a sequence of checkout keys for &#x60;:project&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCheckoutKeysTest() throws ApiException {
        String projectSlug = null;
        String digest = null;
        ProjectListCheckoutKeysResponse response = api.listCheckoutKeys(projectSlug)
                .digest(digest)
                .execute();
        // TODO: test validations
    }

    /**
     * List all environment variables
     *
     * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEnvVarValuesTest() throws ApiException {
        String projectSlug = null;
        ProjectListEnvVarValuesResponse response = api.listEnvVarValues(projectSlug)
                .execute();
        // TODO: test validations
    }

    /**
     * 🧪 Update project settings
     *
     * [__EXPERIMENTAL__] Updates one or more of the advanced settings for a CircleCI project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws ApiException {
        String provider = null;
        String organization = null;
        String project = null;
        ProjectSettingsAdvanced advanced = null;
        ProjectSettings response = api.updateSettings(provider, organization, project)
                .advanced(advanced)
                .execute();
        // TODO: test validations
    }

}
