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
import com.konfigthis.client.model.PipelineContinueExecutionRequest;
import com.konfigthis.client.model.PipelineContinueExecutionResponse;
import com.konfigthis.client.model.PipelineContinueExecutiondefaultResponse;
import com.konfigthis.client.model.PipelineGetAllPipelinesResponse;
import com.konfigthis.client.model.PipelineGetAllPipelinesdefaultResponse;
import com.konfigthis.client.model.PipelineGetByIdResponse;
import com.konfigthis.client.model.PipelineGetByIddefaultResponse;
import com.konfigthis.client.model.PipelineGetByNumberResponse;
import com.konfigthis.client.model.PipelineGetByNumberdefaultResponse;
import com.konfigthis.client.model.PipelineGetConfigurationByIdResponse;
import com.konfigthis.client.model.PipelineGetConfigurationByIddefaultResponse;
import com.konfigthis.client.model.PipelineListRecentPipelinesResponse;
import com.konfigthis.client.model.PipelineListRecentPipelinesdefaultResponse;
import com.konfigthis.client.model.PipelineListUserPipelinesResponse;
import com.konfigthis.client.model.PipelineListUserPipelinesdefaultResponse;
import com.konfigthis.client.model.PipelineListWorkflowsResponse;
import com.konfigthis.client.model.PipelineListWorkflowsdefaultResponse;
import com.konfigthis.client.model.PipelineTriggerNewPipelineRequest;
import com.konfigthis.client.model.PipelineTriggerNewPipelineResponse;
import com.konfigthis.client.model.PipelineTriggerNewPipelinedefaultResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PipelineApi
 */
@Disabled
public class PipelineApiTest {

    private static PipelineApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PipelineApi(apiClient);
    }

    /**
     * Continue a pipeline
     *
     * Continue a pipeline from the setup phase. For information on using pipeline parameters with dynamic configuration, see the [Pipeline values and parameters](https://circleci.com/docs/pipeline-variables/#pipeline-parameters-and-dynamic-configuration) docs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void continueExecutionTest() throws ApiException {
        String continuationKey = null;
        String _configuration = null;
        Map<String, Object> parameters = null;
        PipelineContinueExecutionResponse response = api.continueExecution(continuationKey, _configuration)
                .parameters(parameters)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all pipelines
     *
     * Returns all pipelines for this project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllPipelinesTest() throws ApiException {
        String projectSlug = null;
        String branch = null;
        String pageToken = null;
        PipelineGetAllPipelinesResponse response = api.getAllPipelines(projectSlug)
                .branch(branch)
                .pageToken(pageToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a pipeline by ID
     *
     * Returns a pipeline by the pipeline ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        UUID pipelineId = null;
        PipelineGetByIdResponse response = api.getById(pipelineId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a pipeline by pipeline number
     *
     * Returns a pipeline by the pipeline number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByNumberTest() throws ApiException {
        String projectSlug = null;
        Object pipelineNumber = null;
        PipelineGetByNumberResponse response = api.getByNumber(projectSlug, pipelineNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a pipeline&#39;s configuration
     *
     * Returns a pipeline&#39;s configuration by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationByIdTest() throws ApiException {
        UUID pipelineId = null;
        PipelineGetConfigurationByIdResponse response = api.getConfigurationById(pipelineId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of pipelines
     *
     * Returns all pipelines for the most recently built projects (max 250) you follow in an organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRecentPipelinesTest() throws ApiException {
        String orgSlug = null;
        String pageToken = null;
        Boolean mine = null;
        PipelineListRecentPipelinesResponse response = api.listRecentPipelines()
                .orgSlug(orgSlug)
                .pageToken(pageToken)
                .mine(mine)
                .execute();
        // TODO: test validations
    }

    /**
     * Get your pipelines
     *
     * Returns a sequence of all pipelines for this project triggered by the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPipelinesTest() throws ApiException {
        String projectSlug = null;
        String pageToken = null;
        PipelineListUserPipelinesResponse response = api.listUserPipelines(projectSlug)
                .pageToken(pageToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a pipeline&#39;s workflows
     *
     * Returns a paginated list of workflows by pipeline ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWorkflowsTest() throws ApiException {
        UUID pipelineId = null;
        String pageToken = null;
        PipelineListWorkflowsResponse response = api.listWorkflows(pipelineId)
                .pageToken(pageToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Trigger a new pipeline
     *
     * Not yet available to projects that use GitLab or GitHub App. Triggers a new pipeline on the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerNewPipelineTest() throws ApiException {
        String projectSlug = null;
        Map<String, Object> parameters = null;
        String branch = null;
        String tag = null;
        PipelineTriggerNewPipelineResponse response = api.triggerNewPipeline(projectSlug)
                .parameters(parameters)
                .branch(branch)
                .tag(tag)
                .execute();
        // TODO: test validations
    }

}
