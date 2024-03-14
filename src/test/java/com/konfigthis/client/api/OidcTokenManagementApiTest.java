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
import com.konfigthis.client.model.ClaimResponse;
import com.konfigthis.client.model.PatchClaimsRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OidcTokenManagementApi
 */
@Disabled
public class OidcTokenManagementApiTest {

    private static OidcTokenManagementApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OidcTokenManagementApi(apiClient);
    }

    /**
     * Delete org-level claims
     *
     * Deletes org-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrgClaimsTest() throws ApiException {
        UUID orgID = null;
        String claims = null;
        ClaimResponse response = api.deleteOrgClaims(orgID, claims)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete project-level claims
     *
     * Deletes project-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectClaimsTest() throws ApiException {
        UUID orgID = null;
        UUID projectID = null;
        String claims = null;
        ClaimResponse response = api.deleteProjectClaims(orgID, projectID, claims)
                .execute();
        // TODO: test validations
    }

    /**
     * Get org-level claims
     *
     * Fetches org-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrgClaimsTest() throws ApiException {
        UUID orgID = null;
        ClaimResponse response = api.getOrgClaims(orgID)
                .execute();
        // TODO: test validations
    }

    /**
     * Get project-level claims
     *
     * Fetches project-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectClaimsTest() throws ApiException {
        UUID orgID = null;
        UUID projectID = null;
        ClaimResponse response = api.getProjectClaims(orgID, projectID)
                .execute();
        // TODO: test validations
    }

    /**
     * Patch org-level claims
     *
     * Creates/Updates org-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrgClaimsTest() throws ApiException {
        UUID orgID = null;
        List<String> audience = null;
        String ttl = null;
        ClaimResponse response = api.updateOrgClaims(orgID)
                .audience(audience)
                .ttl(ttl)
                .execute();
        // TODO: test validations
    }

    /**
     * Patch project-level claims
     *
     * Creates/Updates project-level custom claims of OIDC identity tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectClaimsTest() throws ApiException {
        UUID orgID = null;
        UUID projectID = null;
        List<String> audience = null;
        String ttl = null;
        ClaimResponse response = api.updateProjectClaims(orgID, projectID)
                .audience(audience)
                .ttl(ttl)
                .execute();
        // TODO: test validations
    }

}