package com.konfigthis.client;

import com.konfigthis.client.api.ContextApi;
import com.konfigthis.client.api.InsightsApi;
import com.konfigthis.client.api.JobApi;
import com.konfigthis.client.api.OidcTokenManagementApi;
import com.konfigthis.client.api.PipelineApi;
import com.konfigthis.client.api.PolicyManagementApi;
import com.konfigthis.client.api.ProjectApi;
import com.konfigthis.client.api.ScheduleApi;
import com.konfigthis.client.api.UserApi;
import com.konfigthis.client.api.WebhookApi;
import com.konfigthis.client.api.WorkflowApi;

public class CircleCi {
    private ApiClient apiClient;
    public final ContextApi context;
    public final InsightsApi insights;
    public final JobApi job;
    public final OidcTokenManagementApi oidcTokenManagement;
    public final PipelineApi pipeline;
    public final PolicyManagementApi policyManagement;
    public final ProjectApi project;
    public final ScheduleApi schedule;
    public final UserApi user;
    public final WebhookApi webhook;
    public final WorkflowApi workflow;

    public CircleCi() {
        this(null);
    }

    public CircleCi(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.context = new ContextApi(this.apiClient);
        this.insights = new InsightsApi(this.apiClient);
        this.job = new JobApi(this.apiClient);
        this.oidcTokenManagement = new OidcTokenManagementApi(this.apiClient);
        this.pipeline = new PipelineApi(this.apiClient);
        this.policyManagement = new PolicyManagementApi(this.apiClient);
        this.project = new ProjectApi(this.apiClient);
        this.schedule = new ScheduleApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
        this.webhook = new WebhookApi(this.apiClient);
        this.workflow = new WorkflowApi(this.apiClient);
    }

}
