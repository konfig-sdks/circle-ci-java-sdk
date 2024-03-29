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
 * InsightsGetFlakyTestsResponseFlakyTestsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InsightsGetFlakyTestsResponseFlakyTestsInner {
  public static final String SERIALIZED_NAME_TIME_WASTED = "time-wasted";
  @SerializedName(SERIALIZED_NAME_TIME_WASTED)
  private Long timeWasted;

  public static final String SERIALIZED_NAME_WORKFLOW_CREATED_AT = "workflow-created-at";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_CREATED_AT)
  private String workflowCreatedAt;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflow-id";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private Object workflowId = null;

  public static final String SERIALIZED_NAME_CLASSNAME = "classname";
  @SerializedName(SERIALIZED_NAME_CLASSNAME)
  private String classname;

  public static final String SERIALIZED_NAME_PIPELINE_NUMBER = "pipeline-number";
  @SerializedName(SERIALIZED_NAME_PIPELINE_NUMBER)
  private Long pipelineNumber;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflow-name";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_TEST_NAME = "test-name";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_JOB_NAME = "job-name";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_JOB_NUMBER = "job-number";
  @SerializedName(SERIALIZED_NAME_JOB_NUMBER)
  private Long jobNumber;

  public static final String SERIALIZED_NAME_TIMES_FLAKED = "times-flaked";
  @SerializedName(SERIALIZED_NAME_TIMES_FLAKED)
  private Long timesFlaked;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public InsightsGetFlakyTestsResponseFlakyTestsInner() {
  }

  public InsightsGetFlakyTestsResponseFlakyTestsInner timeWasted(Long timeWasted) {
    
    
    
    
    this.timeWasted = timeWasted;
    return this;
  }

   /**
   * Get timeWasted
   * @return timeWasted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimeWasted() {
    return timeWasted;
  }


  public void setTimeWasted(Long timeWasted) {
    
    
    
    this.timeWasted = timeWasted;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner workflowCreatedAt(String workflowCreatedAt) {
    
    
    
    
    this.workflowCreatedAt = workflowCreatedAt;
    return this;
  }

   /**
   * The date and time when workflow was created.
   * @return workflowCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time when workflow was created.")

  public String getWorkflowCreatedAt() {
    return workflowCreatedAt;
  }


  public void setWorkflowCreatedAt(String workflowCreatedAt) {
    
    
    
    this.workflowCreatedAt = workflowCreatedAt;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner workflowId(Object workflowId) {
    
    
    
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * The ID of the workflow associated with the provided test counts
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the workflow associated with the provided test counts")

  public Object getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(Object workflowId) {
    
    
    
    this.workflowId = workflowId;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner classname(String classname) {
    
    
    
    
    this.classname = classname;
    return this;
  }

   /**
   * The class the test belongs to.
   * @return classname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The class the test belongs to.")

  public String getClassname() {
    return classname;
  }


  public void setClassname(String classname) {
    
    
    
    this.classname = classname;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner pipelineNumber(Long pipelineNumber) {
    
    
    
    
    this.pipelineNumber = pipelineNumber;
    return this;
  }

   /**
   * The number of the pipeline.
   * @return pipelineNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of the pipeline.")

  public Long getPipelineNumber() {
    return pipelineNumber;
  }


  public void setPipelineNumber(Long pipelineNumber) {
    
    
    
    this.pipelineNumber = pipelineNumber;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner workflowName(String workflowName) {
    
    
    
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * The name of the workflow.
   * @return workflowName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the workflow.")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    
    
    
    this.workflowName = workflowName;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner testName(String testName) {
    
    
    
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test.
   * @return testName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the test.")

  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    
    
    
    this.testName = testName;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner jobName(String jobName) {
    
    
    
    
    this.jobName = jobName;
    return this;
  }

   /**
   * The name of the job.
   * @return jobName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the job.")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    
    
    
    this.jobName = jobName;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner jobNumber(Long jobNumber) {
    
    
    
    
    this.jobNumber = jobNumber;
    return this;
  }

   /**
   * The number of the job.
   * @return jobNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of the job.")

  public Long getJobNumber() {
    return jobNumber;
  }


  public void setJobNumber(Long jobNumber) {
    
    
    
    this.jobNumber = jobNumber;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner timesFlaked(Long timesFlaked) {
    if (timesFlaked != null && timesFlaked < 0) {
      throw new IllegalArgumentException("Invalid value for timesFlaked. Must be greater than or equal to 0.");
    }
    
    
    
    this.timesFlaked = timesFlaked;
    return this;
  }

   /**
   * The number of times the test flaked.
   * minimum: 0
   * @return timesFlaked
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of times the test flaked.")

  public Long getTimesFlaked() {
    return timesFlaked;
  }


  public void setTimesFlaked(Long timesFlaked) {
    if (timesFlaked != null && timesFlaked < 0) {
      throw new IllegalArgumentException("Invalid value for timesFlaked. Must be greater than or equal to 0.");
    }
    
    
    this.timesFlaked = timesFlaked;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * The source of the test.
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The source of the test.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public InsightsGetFlakyTestsResponseFlakyTestsInner _file(String _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * The file the test belongs to.
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The file the test belongs to.")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    
    
    
    this._file = _file;
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
   * @return the InsightsGetFlakyTestsResponseFlakyTestsInner instance itself
   */
  public InsightsGetFlakyTestsResponseFlakyTestsInner putAdditionalProperty(String key, Object value) {
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
    InsightsGetFlakyTestsResponseFlakyTestsInner insightsGetFlakyTestsResponseFlakyTestsInner = (InsightsGetFlakyTestsResponseFlakyTestsInner) o;
    return Objects.equals(this.timeWasted, insightsGetFlakyTestsResponseFlakyTestsInner.timeWasted) &&
        Objects.equals(this.workflowCreatedAt, insightsGetFlakyTestsResponseFlakyTestsInner.workflowCreatedAt) &&
        Objects.equals(this.workflowId, insightsGetFlakyTestsResponseFlakyTestsInner.workflowId) &&
        Objects.equals(this.classname, insightsGetFlakyTestsResponseFlakyTestsInner.classname) &&
        Objects.equals(this.pipelineNumber, insightsGetFlakyTestsResponseFlakyTestsInner.pipelineNumber) &&
        Objects.equals(this.workflowName, insightsGetFlakyTestsResponseFlakyTestsInner.workflowName) &&
        Objects.equals(this.testName, insightsGetFlakyTestsResponseFlakyTestsInner.testName) &&
        Objects.equals(this.jobName, insightsGetFlakyTestsResponseFlakyTestsInner.jobName) &&
        Objects.equals(this.jobNumber, insightsGetFlakyTestsResponseFlakyTestsInner.jobNumber) &&
        Objects.equals(this.timesFlaked, insightsGetFlakyTestsResponseFlakyTestsInner.timesFlaked) &&
        Objects.equals(this.source, insightsGetFlakyTestsResponseFlakyTestsInner.source) &&
        Objects.equals(this._file, insightsGetFlakyTestsResponseFlakyTestsInner._file)&&
        Objects.equals(this.additionalProperties, insightsGetFlakyTestsResponseFlakyTestsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeWasted, workflowCreatedAt, workflowId, classname, pipelineNumber, workflowName, testName, jobName, jobNumber, timesFlaked, source, _file, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsGetFlakyTestsResponseFlakyTestsInner {\n");
    sb.append("    timeWasted: ").append(toIndentedString(timeWasted)).append("\n");
    sb.append("    workflowCreatedAt: ").append(toIndentedString(workflowCreatedAt)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
    sb.append("    pipelineNumber: ").append(toIndentedString(pipelineNumber)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobNumber: ").append(toIndentedString(jobNumber)).append("\n");
    sb.append("    timesFlaked: ").append(toIndentedString(timesFlaked)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("time-wasted");
    openapiFields.add("workflow-created-at");
    openapiFields.add("workflow-id");
    openapiFields.add("classname");
    openapiFields.add("pipeline-number");
    openapiFields.add("workflow-name");
    openapiFields.add("test-name");
    openapiFields.add("job-name");
    openapiFields.add("job-number");
    openapiFields.add("times-flaked");
    openapiFields.add("source");
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflow-created-at");
    openapiRequiredFields.add("workflow-id");
    openapiRequiredFields.add("classname");
    openapiRequiredFields.add("pipeline-number");
    openapiRequiredFields.add("workflow-name");
    openapiRequiredFields.add("test-name");
    openapiRequiredFields.add("job-name");
    openapiRequiredFields.add("job-number");
    openapiRequiredFields.add("times-flaked");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("file");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsightsGetFlakyTestsResponseFlakyTestsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsightsGetFlakyTestsResponseFlakyTestsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightsGetFlakyTestsResponseFlakyTestsInner is not found in the empty JSON string", InsightsGetFlakyTestsResponseFlakyTestsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsightsGetFlakyTestsResponseFlakyTestsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `time-wasted`
      if (jsonObj.get("time-wasted") != null && !jsonObj.get("time-wasted").isJsonNull()) {
        Long.validateJsonObject(jsonObj.getAsJsonObject("time-wasted"));
      }
      if (!jsonObj.get("workflow-created-at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow-created-at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow-created-at").toString()));
      }
      if (!jsonObj.get("classname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classname").toString()));
      }
      // validate the required field `pipeline-number`
      Long.validateJsonObject(jsonObj.getAsJsonObject("pipeline-number"));
      if (!jsonObj.get("workflow-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow-name").toString()));
      }
      if (!jsonObj.get("test-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test-name").toString()));
      }
      if (!jsonObj.get("job-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job-name").toString()));
      }
      // validate the required field `job-number`
      Long.validateJsonObject(jsonObj.getAsJsonObject("job-number"));
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightsGetFlakyTestsResponseFlakyTestsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightsGetFlakyTestsResponseFlakyTestsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightsGetFlakyTestsResponseFlakyTestsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightsGetFlakyTestsResponseFlakyTestsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightsGetFlakyTestsResponseFlakyTestsInner>() {
           @Override
           public void write(JsonWriter out, InsightsGetFlakyTestsResponseFlakyTestsInner value) throws IOException {
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
           public InsightsGetFlakyTestsResponseFlakyTestsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InsightsGetFlakyTestsResponseFlakyTestsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InsightsGetFlakyTestsResponseFlakyTestsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightsGetFlakyTestsResponseFlakyTestsInner
  * @throws IOException if the JSON string is invalid with respect to InsightsGetFlakyTestsResponseFlakyTestsInner
  */
  public static InsightsGetFlakyTestsResponseFlakyTestsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightsGetFlakyTestsResponseFlakyTestsInner.class);
  }

 /**
  * Convert an instance of InsightsGetFlakyTestsResponseFlakyTestsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

