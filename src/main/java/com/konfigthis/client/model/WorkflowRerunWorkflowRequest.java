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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * The information you can supply when rerunning a workflow.
 */
@ApiModel(description = "The information you can supply when rerunning a workflow.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowRerunWorkflowRequest {
  public static final String SERIALIZED_NAME_ENABLE_SSH = "enable_ssh";
  @SerializedName(SERIALIZED_NAME_ENABLE_SSH)
  private Boolean enableSsh;

  public static final String SERIALIZED_NAME_FROM_FAILED = "from_failed";
  @SerializedName(SERIALIZED_NAME_FROM_FAILED)
  private Boolean fromFailed;

  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private List<UUID> jobs = null;

  public static final String SERIALIZED_NAME_SPARSE_TREE = "sparse_tree";
  @SerializedName(SERIALIZED_NAME_SPARSE_TREE)
  private Boolean sparseTree;

  public WorkflowRerunWorkflowRequest() {
  }

  public WorkflowRerunWorkflowRequest enableSsh(Boolean enableSsh) {
    
    
    
    
    this.enableSsh = enableSsh;
    return this;
  }

   /**
   * Whether to enable SSH access for the triggering user on the newly-rerun job. Requires the jobs parameter to be used and so is mutually exclusive with the from_failed parameter.
   * @return enableSsh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to enable SSH access for the triggering user on the newly-rerun job. Requires the jobs parameter to be used and so is mutually exclusive with the from_failed parameter.")

  public Boolean getEnableSsh() {
    return enableSsh;
  }


  public void setEnableSsh(Boolean enableSsh) {
    
    
    
    this.enableSsh = enableSsh;
  }


  public WorkflowRerunWorkflowRequest fromFailed(Boolean fromFailed) {
    
    
    
    
    this.fromFailed = fromFailed;
    return this;
  }

   /**
   * Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.
   * @return fromFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.")

  public Boolean getFromFailed() {
    return fromFailed;
  }


  public void setFromFailed(Boolean fromFailed) {
    
    
    
    this.fromFailed = fromFailed;
  }


  public WorkflowRerunWorkflowRequest jobs(List<UUID> jobs) {
    
    
    
    
    this.jobs = jobs;
    return this;
  }

  public WorkflowRerunWorkflowRequest addJobsItem(UUID jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * A list of job IDs to rerun.
   * @return jobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"c65b68ef-e73b-4bf2-be9a-7a322a9df150\",\"5e957edd-5e8c-4985-9178-5d0d69561822\"]", value = "A list of job IDs to rerun.")

  public List<UUID> getJobs() {
    return jobs;
  }


  public void setJobs(List<UUID> jobs) {
    
    
    
    this.jobs = jobs;
  }


  public WorkflowRerunWorkflowRequest sparseTree(Boolean sparseTree) {
    
    
    
    
    this.sparseTree = sparseTree;
    return this;
  }

   /**
   * Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter.
   * @return sparseTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter.")

  public Boolean getSparseTree() {
    return sparseTree;
  }


  public void setSparseTree(Boolean sparseTree) {
    
    
    
    this.sparseTree = sparseTree;
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
   * @return the WorkflowRerunWorkflowRequest instance itself
   */
  public WorkflowRerunWorkflowRequest putAdditionalProperty(String key, Object value) {
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
    WorkflowRerunWorkflowRequest workflowRerunWorkflowRequest = (WorkflowRerunWorkflowRequest) o;
    return Objects.equals(this.enableSsh, workflowRerunWorkflowRequest.enableSsh) &&
        Objects.equals(this.fromFailed, workflowRerunWorkflowRequest.fromFailed) &&
        Objects.equals(this.jobs, workflowRerunWorkflowRequest.jobs) &&
        Objects.equals(this.sparseTree, workflowRerunWorkflowRequest.sparseTree)&&
        Objects.equals(this.additionalProperties, workflowRerunWorkflowRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSsh, fromFailed, jobs, sparseTree, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRerunWorkflowRequest {\n");
    sb.append("    enableSsh: ").append(toIndentedString(enableSsh)).append("\n");
    sb.append("    fromFailed: ").append(toIndentedString(fromFailed)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    sparseTree: ").append(toIndentedString(sparseTree)).append("\n");
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
    openapiFields.add("enable_ssh");
    openapiFields.add("from_failed");
    openapiFields.add("jobs");
    openapiFields.add("sparse_tree");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowRerunWorkflowRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowRerunWorkflowRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRerunWorkflowRequest is not found in the empty JSON string", WorkflowRerunWorkflowRequest.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("jobs") != null && !jsonObj.get("jobs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobs` to be an array in the JSON string but got `%s`", jsonObj.get("jobs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRerunWorkflowRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRerunWorkflowRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRerunWorkflowRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRerunWorkflowRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRerunWorkflowRequest>() {
           @Override
           public void write(JsonWriter out, WorkflowRerunWorkflowRequest value) throws IOException {
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
           public WorkflowRerunWorkflowRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowRerunWorkflowRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowRerunWorkflowRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowRerunWorkflowRequest
  * @throws IOException if the JSON string is invalid with respect to WorkflowRerunWorkflowRequest
  */
  public static WorkflowRerunWorkflowRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRerunWorkflowRequest.class);
  }

 /**
  * Convert an instance of WorkflowRerunWorkflowRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

