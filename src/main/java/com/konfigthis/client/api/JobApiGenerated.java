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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.JobCancelWithNumberResponse;
import com.konfigthis.client.model.JobCancelWithNumberdefaultResponse;
import com.konfigthis.client.model.JobGetArtifactsResponse;
import com.konfigthis.client.model.JobGetArtifactsdefaultResponse;
import com.konfigthis.client.model.JobGetDetailsResponse;
import com.konfigthis.client.model.JobGetDetailsdefaultResponse;
import com.konfigthis.client.model.JobGetTestMetadataResponse;
import com.konfigthis.client.model.JobGetTestMetadatadefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class JobApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JobApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public JobApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call cancelWithNumberCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{project-slug}/job/{job-number}/cancel"
            .replace("{" + "job-number" + "}", localVarApiClient.escapeString(jobNumber.toString()))
            .replace("{" + "project-slug" + "}", localVarApiClient.escapeString(projectSlug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelWithNumberValidateBeforeCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobNumber' is set
        if (jobNumber == null) {
            throw new ApiException("Missing the required parameter 'jobNumber' when calling cancelWithNumber(Async)");
        }

        // verify the required parameter 'projectSlug' is set
        if (projectSlug == null) {
            throw new ApiException("Missing the required parameter 'projectSlug' when calling cancelWithNumber(Async)");
        }

        return cancelWithNumberCall(jobNumber, projectSlug, _callback);

    }


    private ApiResponse<JobCancelWithNumberResponse> cancelWithNumberWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
        okhttp3.Call localVarCall = cancelWithNumberValidateBeforeCall(jobNumber, projectSlug, null);
        Type localVarReturnType = new TypeToken<JobCancelWithNumberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call cancelWithNumberAsync(Object jobNumber, String projectSlug, final ApiCallback<JobCancelWithNumberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelWithNumberValidateBeforeCall(jobNumber, projectSlug, _callback);
        Type localVarReturnType = new TypeToken<JobCancelWithNumberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CancelWithNumberRequestBuilder {
        private final Object jobNumber;
        private final String projectSlug;

        private CancelWithNumberRequestBuilder(Object jobNumber, String projectSlug) {
            this.jobNumber = jobNumber;
            this.projectSlug = projectSlug;
        }

        /**
         * Build call for cancelWithNumber
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return cancelWithNumberCall(jobNumber, projectSlug, _callback);
        }


        /**
         * Execute cancelWithNumber request
         * @return JobCancelWithNumberResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public JobCancelWithNumberResponse execute() throws ApiException {
            ApiResponse<JobCancelWithNumberResponse> localVarResp = cancelWithNumberWithHttpInfo(jobNumber, projectSlug);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute cancelWithNumber request with HTTP info returned
         * @return ApiResponse&lt;JobCancelWithNumberResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobCancelWithNumberResponse> executeWithHttpInfo() throws ApiException {
            return cancelWithNumberWithHttpInfo(jobNumber, projectSlug);
        }

        /**
         * Execute cancelWithNumber request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobCancelWithNumberResponse> _callback) throws ApiException {
            return cancelWithNumberAsync(jobNumber, projectSlug, _callback);
        }
    }

    /**
     * Cancel job
     * Cancel job with a given job number.
     * @param jobNumber The number of the job. (required)
     * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). (required)
     * @return CancelWithNumberRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
     */
    public CancelWithNumberRequestBuilder cancelWithNumber(Object jobNumber, String projectSlug) throws IllegalArgumentException {
        if (jobNumber == null) throw new IllegalArgumentException("\"jobNumber\" is required but got null");
        if (projectSlug == null) throw new IllegalArgumentException("\"projectSlug\" is required but got null");
            

        return new CancelWithNumberRequestBuilder(jobNumber, projectSlug);
    }
    private okhttp3.Call getArtifactsCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{project-slug}/{job-number}/artifacts"
            .replace("{" + "job-number" + "}", localVarApiClient.escapeString(jobNumber.toString()))
            .replace("{" + "project-slug" + "}", localVarApiClient.escapeString(projectSlug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getArtifactsValidateBeforeCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobNumber' is set
        if (jobNumber == null) {
            throw new ApiException("Missing the required parameter 'jobNumber' when calling getArtifacts(Async)");
        }

        // verify the required parameter 'projectSlug' is set
        if (projectSlug == null) {
            throw new ApiException("Missing the required parameter 'projectSlug' when calling getArtifacts(Async)");
        }

        return getArtifactsCall(jobNumber, projectSlug, _callback);

    }


    private ApiResponse<JobGetArtifactsResponse> getArtifactsWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
        okhttp3.Call localVarCall = getArtifactsValidateBeforeCall(jobNumber, projectSlug, null);
        Type localVarReturnType = new TypeToken<JobGetArtifactsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getArtifactsAsync(Object jobNumber, String projectSlug, final ApiCallback<JobGetArtifactsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getArtifactsValidateBeforeCall(jobNumber, projectSlug, _callback);
        Type localVarReturnType = new TypeToken<JobGetArtifactsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetArtifactsRequestBuilder {
        private final Object jobNumber;
        private final String projectSlug;

        private GetArtifactsRequestBuilder(Object jobNumber, String projectSlug) {
            this.jobNumber = jobNumber;
            this.projectSlug = projectSlug;
        }

        /**
         * Build call for getArtifacts
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getArtifactsCall(jobNumber, projectSlug, _callback);
        }


        /**
         * Execute getArtifacts request
         * @return JobGetArtifactsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public JobGetArtifactsResponse execute() throws ApiException {
            ApiResponse<JobGetArtifactsResponse> localVarResp = getArtifactsWithHttpInfo(jobNumber, projectSlug);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getArtifacts request with HTTP info returned
         * @return ApiResponse&lt;JobGetArtifactsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobGetArtifactsResponse> executeWithHttpInfo() throws ApiException {
            return getArtifactsWithHttpInfo(jobNumber, projectSlug);
        }

        /**
         * Execute getArtifacts request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobGetArtifactsResponse> _callback) throws ApiException {
            return getArtifactsAsync(jobNumber, projectSlug, _callback);
        }
    }

    /**
     * Get a job&#39;s artifacts
     * Returns a job&#39;s artifacts.
     * @param jobNumber The number of the job. (required)
     * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). (required)
     * @return GetArtifactsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
     */
    public GetArtifactsRequestBuilder getArtifacts(Object jobNumber, String projectSlug) throws IllegalArgumentException {
        if (jobNumber == null) throw new IllegalArgumentException("\"jobNumber\" is required but got null");
        if (projectSlug == null) throw new IllegalArgumentException("\"projectSlug\" is required but got null");
            

        return new GetArtifactsRequestBuilder(jobNumber, projectSlug);
    }
    private okhttp3.Call getDetailsCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{project-slug}/job/{job-number}"
            .replace("{" + "job-number" + "}", localVarApiClient.escapeString(jobNumber.toString()))
            .replace("{" + "project-slug" + "}", localVarApiClient.escapeString(projectSlug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobNumber' is set
        if (jobNumber == null) {
            throw new ApiException("Missing the required parameter 'jobNumber' when calling getDetails(Async)");
        }

        // verify the required parameter 'projectSlug' is set
        if (projectSlug == null) {
            throw new ApiException("Missing the required parameter 'projectSlug' when calling getDetails(Async)");
        }

        return getDetailsCall(jobNumber, projectSlug, _callback);

    }


    private ApiResponse<JobGetDetailsResponse> getDetailsWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(jobNumber, projectSlug, null);
        Type localVarReturnType = new TypeToken<JobGetDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(Object jobNumber, String projectSlug, final ApiCallback<JobGetDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(jobNumber, projectSlug, _callback);
        Type localVarReturnType = new TypeToken<JobGetDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final Object jobNumber;
        private final String projectSlug;

        private GetDetailsRequestBuilder(Object jobNumber, String projectSlug) {
            this.jobNumber = jobNumber;
            this.projectSlug = projectSlug;
        }

        /**
         * Build call for getDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDetailsCall(jobNumber, projectSlug, _callback);
        }


        /**
         * Execute getDetails request
         * @return JobGetDetailsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public JobGetDetailsResponse execute() throws ApiException {
            ApiResponse<JobGetDetailsResponse> localVarResp = getDetailsWithHttpInfo(jobNumber, projectSlug);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;JobGetDetailsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobGetDetailsResponse> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(jobNumber, projectSlug);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobGetDetailsResponse> _callback) throws ApiException {
            return getDetailsAsync(jobNumber, projectSlug, _callback);
        }
    }

    /**
     * Get job details
     * Returns job details.
     * @param jobNumber The number of the job. (required)
     * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(Object jobNumber, String projectSlug) throws IllegalArgumentException {
        if (jobNumber == null) throw new IllegalArgumentException("\"jobNumber\" is required but got null");
        if (projectSlug == null) throw new IllegalArgumentException("\"projectSlug\" is required but got null");
            

        return new GetDetailsRequestBuilder(jobNumber, projectSlug);
    }
    private okhttp3.Call getTestMetadataCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/project/{project-slug}/{job-number}/tests"
            .replace("{" + "job-number" + "}", localVarApiClient.escapeString(jobNumber.toString()))
            .replace("{" + "project-slug" + "}", localVarApiClient.escapeString(projectSlug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTestMetadataValidateBeforeCall(Object jobNumber, String projectSlug, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jobNumber' is set
        if (jobNumber == null) {
            throw new ApiException("Missing the required parameter 'jobNumber' when calling getTestMetadata(Async)");
        }

        // verify the required parameter 'projectSlug' is set
        if (projectSlug == null) {
            throw new ApiException("Missing the required parameter 'projectSlug' when calling getTestMetadata(Async)");
        }

        return getTestMetadataCall(jobNumber, projectSlug, _callback);

    }


    private ApiResponse<JobGetTestMetadataResponse> getTestMetadataWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
        okhttp3.Call localVarCall = getTestMetadataValidateBeforeCall(jobNumber, projectSlug, null);
        Type localVarReturnType = new TypeToken<JobGetTestMetadataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getTestMetadataAsync(Object jobNumber, String projectSlug, final ApiCallback<JobGetTestMetadataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTestMetadataValidateBeforeCall(jobNumber, projectSlug, _callback);
        Type localVarReturnType = new TypeToken<JobGetTestMetadataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetTestMetadataRequestBuilder {
        private final Object jobNumber;
        private final String projectSlug;

        private GetTestMetadataRequestBuilder(Object jobNumber, String projectSlug) {
            this.jobNumber = jobNumber;
            this.projectSlug = projectSlug;
        }

        /**
         * Build call for getTestMetadata
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getTestMetadataCall(jobNumber, projectSlug, _callback);
        }


        /**
         * Execute getTestMetadata request
         * @return JobGetTestMetadataResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public JobGetTestMetadataResponse execute() throws ApiException {
            ApiResponse<JobGetTestMetadataResponse> localVarResp = getTestMetadataWithHttpInfo(jobNumber, projectSlug);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getTestMetadata request with HTTP info returned
         * @return ApiResponse&lt;JobGetTestMetadataResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<JobGetTestMetadataResponse> executeWithHttpInfo() throws ApiException {
            return getTestMetadataWithHttpInfo(jobNumber, projectSlug);
        }

        /**
         * Execute getTestMetadata request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<JobGetTestMetadataResponse> _callback) throws ApiException {
            return getTestMetadataAsync(jobNumber, projectSlug, _callback);
        }
    }

    /**
     * Get test metadata
     * Get test metadata for a build. In the rare case where there is more than 250MB of test data on the job, no results will be returned.
     * @param jobNumber The number of the job. (required)
     * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings). (required)
     * @return GetTestMetadataRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
     */
    public GetTestMetadataRequestBuilder getTestMetadata(Object jobNumber, String projectSlug) throws IllegalArgumentException {
        if (jobNumber == null) throw new IllegalArgumentException("\"jobNumber\" is required but got null");
        if (projectSlug == null) throw new IllegalArgumentException("\"projectSlug\" is required but got null");
            

        return new GetTestMetadataRequestBuilder(jobNumber, projectSlug);
    }
}
