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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.JobGetDetailsResponseContextsInner;
import com.konfigthis.client.model.JobGetDetailsResponseExecutor;
import com.konfigthis.client.model.JobGetDetailsResponseLatestWorkflow;
import com.konfigthis.client.model.JobGetDetailsResponseMessagesInner;
import com.konfigthis.client.model.JobGetDetailsResponseOrganization;
import com.konfigthis.client.model.JobGetDetailsResponseParallelRunsInner;
import com.konfigthis.client.model.JobGetDetailsResponsePipeline;
import com.konfigthis.client.model.JobGetDetailsResponseProject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Job Details
 */
@ApiModel(description = "Job Details")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobGetDetailsResponse {
  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private JobGetDetailsResponseProject project;

  public static final String SERIALIZED_NAME_PARALLEL_RUNS = "parallel_runs";
  @SerializedName(SERIALIZED_NAME_PARALLEL_RUNS)
  private List<JobGetDetailsResponseParallelRunsInner> parallelRuns = new ArrayList<>();

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_LATEST_WORKFLOW = "latest_workflow";
  @SerializedName(SERIALIZED_NAME_LATEST_WORKFLOW)
  private JobGetDetailsResponseLatestWorkflow latestWorkflow;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXECUTOR = "executor";
  @SerializedName(SERIALIZED_NAME_EXECUTOR)
  private JobGetDetailsResponseExecutor executor;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Long parallelism;

  /**
   * The current status of the job.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SUCCESS("success"),
    
    RUNNING("running"),
    
    NOT_RUN("not_run"),
    
    FAILED("failed"),
    
    RETRIED("retried"),
    
    QUEUED("queued"),
    
    NOT_RUNNING("not_running"),
    
    INFRASTRUCTURE_FAIL("infrastructure_fail"),
    
    TIMEDOUT("timedout"),
    
    ON_HOLD("on_hold"),
    
    TERMINATED_UNKNOWN("terminated-unknown"),
    
    BLOCKED("blocked"),
    
    CANCELED("canceled"),
    
    UNAUTHORIZED("unauthorized");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Long number;

  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private JobGetDetailsResponsePipeline pipeline;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<JobGetDetailsResponseMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXTS = "contexts";
  @SerializedName(SERIALIZED_NAME_CONTEXTS)
  private List<JobGetDetailsResponseContextsInner> contexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private JobGetDetailsResponseOrganization organization;

  public static final String SERIALIZED_NAME_QUEUED_AT = "queued_at";
  @SerializedName(SERIALIZED_NAME_QUEUED_AT)
  private OffsetDateTime queuedAt;

  public static final String SERIALIZED_NAME_STOPPED_AT = "stopped_at";
  @SerializedName(SERIALIZED_NAME_STOPPED_AT)
  private OffsetDateTime stoppedAt;

  public JobGetDetailsResponse() {
  }

  public JobGetDetailsResponse webUrl(String webUrl) {
    
    
    
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * URL of the job in CircleCI Web UI.
   * @return webUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL of the job in CircleCI Web UI.")

  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    
    
    
    this.webUrl = webUrl;
  }


  public JobGetDetailsResponse project(JobGetDetailsResponseProject project) {
    
    
    
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobGetDetailsResponseProject getProject() {
    return project;
  }


  public void setProject(JobGetDetailsResponseProject project) {
    
    
    
    this.project = project;
  }


  public JobGetDetailsResponse parallelRuns(List<JobGetDetailsResponseParallelRunsInner> parallelRuns) {
    
    
    
    
    this.parallelRuns = parallelRuns;
    return this;
  }

  public JobGetDetailsResponse addParallelRunsItem(JobGetDetailsResponseParallelRunsInner parallelRunsItem) {
    this.parallelRuns.add(parallelRunsItem);
    return this;
  }

   /**
   * Info about parallels runs and their status.
   * @return parallelRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Info about parallels runs and their status.")

  public List<JobGetDetailsResponseParallelRunsInner> getParallelRuns() {
    return parallelRuns;
  }


  public void setParallelRuns(List<JobGetDetailsResponseParallelRunsInner> parallelRuns) {
    
    
    
    this.parallelRuns = parallelRuns;
  }


  public JobGetDetailsResponse startedAt(OffsetDateTime startedAt) {
    
    
    
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The date and time the job started.
   * @return startedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time the job started.")

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(OffsetDateTime startedAt) {
    
    
    
    this.startedAt = startedAt;
  }


  public JobGetDetailsResponse latestWorkflow(JobGetDetailsResponseLatestWorkflow latestWorkflow) {
    
    
    
    
    this.latestWorkflow = latestWorkflow;
    return this;
  }

   /**
   * Get latestWorkflow
   * @return latestWorkflow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobGetDetailsResponseLatestWorkflow getLatestWorkflow() {
    return latestWorkflow;
  }


  public void setLatestWorkflow(JobGetDetailsResponseLatestWorkflow latestWorkflow) {
    
    
    
    this.latestWorkflow = latestWorkflow;
  }


  public JobGetDetailsResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the job.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the job.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobGetDetailsResponse executor(JobGetDetailsResponseExecutor executor) {
    
    
    
    
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobGetDetailsResponseExecutor getExecutor() {
    return executor;
  }


  public void setExecutor(JobGetDetailsResponseExecutor executor) {
    
    
    
    this.executor = executor;
  }


  public JobGetDetailsResponse parallelism(Long parallelism) {
    
    
    
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * A number of parallel runs the job has.
   * @return parallelism
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A number of parallel runs the job has.")

  public Long getParallelism() {
    return parallelism;
  }


  public void setParallelism(Long parallelism) {
    
    
    
    this.parallelism = parallelism;
  }


  public JobGetDetailsResponse status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the job.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current status of the job.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public JobGetDetailsResponse number(Long number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The number of the job.
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of the job.")

  public Long getNumber() {
    return number;
  }


  public void setNumber(Long number) {
    
    
    
    this.number = number;
  }


  public JobGetDetailsResponse pipeline(JobGetDetailsResponsePipeline pipeline) {
    
    
    
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobGetDetailsResponsePipeline getPipeline() {
    return pipeline;
  }


  public void setPipeline(JobGetDetailsResponsePipeline pipeline) {
    
    
    
    this.pipeline = pipeline;
  }


  public JobGetDetailsResponse duration(Long duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of a job in milliseconds.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Duration of a job in milliseconds.")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    
    
    
    this.duration = duration;
  }


  public JobGetDetailsResponse createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the job was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time when the job was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public JobGetDetailsResponse messages(List<JobGetDetailsResponseMessagesInner> messages) {
    
    
    
    
    this.messages = messages;
    return this;
  }

  public JobGetDetailsResponse addMessagesItem(JobGetDetailsResponseMessagesInner messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Messages from CircleCI execution platform.
   * @return messages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Messages from CircleCI execution platform.")

  public List<JobGetDetailsResponseMessagesInner> getMessages() {
    return messages;
  }


  public void setMessages(List<JobGetDetailsResponseMessagesInner> messages) {
    
    
    
    this.messages = messages;
  }


  public JobGetDetailsResponse contexts(List<JobGetDetailsResponseContextsInner> contexts) {
    
    
    
    
    this.contexts = contexts;
    return this;
  }

  public JobGetDetailsResponse addContextsItem(JobGetDetailsResponseContextsInner contextsItem) {
    this.contexts.add(contextsItem);
    return this;
  }

   /**
   * List of contexts used by the job.
   * @return contexts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of contexts used by the job.")

  public List<JobGetDetailsResponseContextsInner> getContexts() {
    return contexts;
  }


  public void setContexts(List<JobGetDetailsResponseContextsInner> contexts) {
    
    
    
    this.contexts = contexts;
  }


  public JobGetDetailsResponse organization(JobGetDetailsResponseOrganization organization) {
    
    
    
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobGetDetailsResponseOrganization getOrganization() {
    return organization;
  }


  public void setOrganization(JobGetDetailsResponseOrganization organization) {
    
    
    
    this.organization = organization;
  }


  public JobGetDetailsResponse queuedAt(OffsetDateTime queuedAt) {
    
    
    
    
    this.queuedAt = queuedAt;
    return this;
  }

   /**
   * The time when the job was placed in a queue.
   * @return queuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time when the job was placed in a queue.")

  public OffsetDateTime getQueuedAt() {
    return queuedAt;
  }


  public void setQueuedAt(OffsetDateTime queuedAt) {
    
    
    
    this.queuedAt = queuedAt;
  }


  public JobGetDetailsResponse stoppedAt(OffsetDateTime stoppedAt) {
    
    
    
    
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * The time when the job stopped.
   * @return stoppedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the job stopped.")

  public OffsetDateTime getStoppedAt() {
    return stoppedAt;
  }


  public void setStoppedAt(OffsetDateTime stoppedAt) {
    
    
    
    this.stoppedAt = stoppedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the JobGetDetailsResponse instance itself
   */
  public JobGetDetailsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobGetDetailsResponse jobGetDetailsResponse = (JobGetDetailsResponse) o;
    return Objects.equals(this.webUrl, jobGetDetailsResponse.webUrl) &&
        Objects.equals(this.project, jobGetDetailsResponse.project) &&
        Objects.equals(this.parallelRuns, jobGetDetailsResponse.parallelRuns) &&
        Objects.equals(this.startedAt, jobGetDetailsResponse.startedAt) &&
        Objects.equals(this.latestWorkflow, jobGetDetailsResponse.latestWorkflow) &&
        Objects.equals(this.name, jobGetDetailsResponse.name) &&
        Objects.equals(this.executor, jobGetDetailsResponse.executor) &&
        Objects.equals(this.parallelism, jobGetDetailsResponse.parallelism) &&
        Objects.equals(this.status, jobGetDetailsResponse.status) &&
        Objects.equals(this.number, jobGetDetailsResponse.number) &&
        Objects.equals(this.pipeline, jobGetDetailsResponse.pipeline) &&
        Objects.equals(this.duration, jobGetDetailsResponse.duration) &&
        Objects.equals(this.createdAt, jobGetDetailsResponse.createdAt) &&
        Objects.equals(this.messages, jobGetDetailsResponse.messages) &&
        Objects.equals(this.contexts, jobGetDetailsResponse.contexts) &&
        Objects.equals(this.organization, jobGetDetailsResponse.organization) &&
        Objects.equals(this.queuedAt, jobGetDetailsResponse.queuedAt) &&
        Objects.equals(this.stoppedAt, jobGetDetailsResponse.stoppedAt)&&
        Objects.equals(this.additionalProperties, jobGetDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webUrl, project, parallelRuns, startedAt, latestWorkflow, name, executor, parallelism, status, number, pipeline, duration, createdAt, messages, contexts, organization, queuedAt, stoppedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobGetDetailsResponse {\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    parallelRuns: ").append(toIndentedString(parallelRuns)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    latestWorkflow: ").append(toIndentedString(latestWorkflow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("web_url");
    openapiFields.add("project");
    openapiFields.add("parallel_runs");
    openapiFields.add("started_at");
    openapiFields.add("latest_workflow");
    openapiFields.add("name");
    openapiFields.add("executor");
    openapiFields.add("parallelism");
    openapiFields.add("status");
    openapiFields.add("number");
    openapiFields.add("pipeline");
    openapiFields.add("duration");
    openapiFields.add("created_at");
    openapiFields.add("messages");
    openapiFields.add("contexts");
    openapiFields.add("organization");
    openapiFields.add("queued_at");
    openapiFields.add("stopped_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("web_url");
    openapiRequiredFields.add("project");
    openapiRequiredFields.add("parallel_runs");
    openapiRequiredFields.add("started_at");
    openapiRequiredFields.add("latest_workflow");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("executor");
    openapiRequiredFields.add("parallelism");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("pipeline");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("contexts");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("queued_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobGetDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobGetDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobGetDetailsResponse is not found in the empty JSON string", JobGetDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobGetDetailsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("web_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `web_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("web_url").toString()));
      }
      // validate the required field `project`
      JobGetDetailsResponseProject.validateJsonObject(jsonObj.getAsJsonObject("project"));
      // ensure the json data is an array
      if (!jsonObj.get("parallel_runs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parallel_runs` to be an array in the JSON string but got `%s`", jsonObj.get("parallel_runs").toString()));
      }

      JsonArray jsonArrayparallelRuns = jsonObj.getAsJsonArray("parallel_runs");
      // validate the required field `parallel_runs` (array)
      for (int i = 0; i < jsonArrayparallelRuns.size(); i++) {
        JobGetDetailsResponseParallelRunsInner.validateJsonObject(jsonArrayparallelRuns.get(i).getAsJsonObject());
      };
      // validate the required field `latest_workflow`
      JobGetDetailsResponseLatestWorkflow.validateJsonObject(jsonObj.getAsJsonObject("latest_workflow"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `executor`
      JobGetDetailsResponseExecutor.validateJsonObject(jsonObj.getAsJsonObject("executor"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `pipeline`
      JobGetDetailsResponsePipeline.validateJsonObject(jsonObj.getAsJsonObject("pipeline"));
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        JobGetDetailsResponseMessagesInner.validateJsonObject(jsonArraymessages.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("contexts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contexts` to be an array in the JSON string but got `%s`", jsonObj.get("contexts").toString()));
      }

      JsonArray jsonArraycontexts = jsonObj.getAsJsonArray("contexts");
      // validate the required field `contexts` (array)
      for (int i = 0; i < jsonArraycontexts.size(); i++) {
        JobGetDetailsResponseContextsInner.validateJsonObject(jsonArraycontexts.get(i).getAsJsonObject());
      };
      // validate the required field `organization`
      JobGetDetailsResponseOrganization.validateJsonObject(jsonObj.getAsJsonObject("organization"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobGetDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobGetDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobGetDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobGetDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobGetDetailsResponse>() {
           @Override
           public void write(JsonWriter out, JobGetDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public JobGetDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobGetDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobGetDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobGetDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to JobGetDetailsResponse
  */
  public static JobGetDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobGetDetailsResponse.class);
  }

 /**
  * Convert an instance of JobGetDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
