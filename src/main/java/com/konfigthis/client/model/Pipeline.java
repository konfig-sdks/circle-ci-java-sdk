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
import com.konfigthis.client.model.PipelineErrorsInner;
import com.konfigthis.client.model.PipelineTrigger;
import com.konfigthis.client.model.PipelineVcs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * A pipeline response.
 */
@ApiModel(description = "A pipeline response.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Pipeline {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<PipelineErrorsInner> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "project_slug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Long number;

  public static final String SERIALIZED_NAME_TRIGGER_PARAMETERS = "trigger_parameters";
  @SerializedName(SERIALIZED_NAME_TRIGGER_PARAMETERS)
  private Map<String, Object> triggerParameters = null;

  /**
   * The current state of the pipeline.
   */
  @JsonAdapter(StateEnum.Adapter.class)
 public enum StateEnum {
    CREATED("created"),
    
    ERRORED("errored"),
    
    SETUP_PENDING("setup-pending"),
    
    SETUP("setup"),
    
    PENDING("pending");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private PipelineTrigger trigger;

  public static final String SERIALIZED_NAME_VCS = "vcs";
  @SerializedName(SERIALIZED_NAME_VCS)
  private PipelineVcs vcs;

  public Pipeline() {
  }

  public Pipeline id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the pipeline.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5034460f-c7c4-4c43-9457-de07e2029e7b", required = true, value = "The unique ID of the pipeline.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public Pipeline errors(List<PipelineErrorsInner> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public Pipeline addErrorsItem(PipelineErrorsInner errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A sequence of errors that have occurred within the pipeline.
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A sequence of errors that have occurred within the pipeline.")

  public List<PipelineErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<PipelineErrorsInner> errors) {
    
    
    
    this.errors = errors;
  }


  public Pipeline projectSlug(String projectSlug) {
    
    
    
    
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * The project-slug for the pipeline.
   * @return projectSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "The project-slug for the pipeline.")

  public String getProjectSlug() {
    return projectSlug;
  }


  public void setProjectSlug(String projectSlug) {
    
    
    
    this.projectSlug = projectSlug;
  }


  public Pipeline updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time the pipeline was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the pipeline was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public Pipeline number(Long number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The number of the pipeline.
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "25", required = true, value = "The number of the pipeline.")

  public Long getNumber() {
    return number;
  }


  public void setNumber(Long number) {
    
    
    
    this.number = number;
  }


  public Pipeline triggerParameters(Map<String, Object> triggerParameters) {
    
    
    
    
    this.triggerParameters = triggerParameters;
    return this;
  }

  public Pipeline putTriggerParametersItem(String key, Object triggerParametersItem) {
    if (this.triggerParameters == null) {
      this.triggerParameters = new HashMap<>();
    }
    this.triggerParameters.put(key, triggerParametersItem);
    return this;
  }

   /**
   * Get triggerParameters
   * @return triggerParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getTriggerParameters() {
    return triggerParameters;
  }


  public void setTriggerParameters(Map<String, Object> triggerParameters) {
    
    
    
    this.triggerParameters = triggerParameters;
  }


  public Pipeline state(StateEnum state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * The current state of the pipeline.
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current state of the pipeline.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    
    
    
    this.state = state;
  }


  public Pipeline createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the pipeline was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time the pipeline was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Pipeline trigger(PipelineTrigger trigger) {
    
    
    
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PipelineTrigger getTrigger() {
    return trigger;
  }


  public void setTrigger(PipelineTrigger trigger) {
    
    
    
    this.trigger = trigger;
  }


  public Pipeline vcs(PipelineVcs vcs) {
    
    
    
    
    this.vcs = vcs;
    return this;
  }

   /**
   * Get vcs
   * @return vcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PipelineVcs getVcs() {
    return vcs;
  }


  public void setVcs(PipelineVcs vcs) {
    
    
    
    this.vcs = vcs;
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
   * @return the Pipeline instance itself
   */
  public Pipeline putAdditionalProperty(String key, Object value) {
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
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(this.id, pipeline.id) &&
        Objects.equals(this.errors, pipeline.errors) &&
        Objects.equals(this.projectSlug, pipeline.projectSlug) &&
        Objects.equals(this.updatedAt, pipeline.updatedAt) &&
        Objects.equals(this.number, pipeline.number) &&
        Objects.equals(this.triggerParameters, pipeline.triggerParameters) &&
        Objects.equals(this.state, pipeline.state) &&
        Objects.equals(this.createdAt, pipeline.createdAt) &&
        Objects.equals(this.trigger, pipeline.trigger) &&
        Objects.equals(this.vcs, pipeline.vcs)&&
        Objects.equals(this.additionalProperties, pipeline.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errors, projectSlug, updatedAt, number, triggerParameters, state, createdAt, trigger, vcs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    triggerParameters: ").append(toIndentedString(triggerParameters)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("errors");
    openapiFields.add("project_slug");
    openapiFields.add("updated_at");
    openapiFields.add("number");
    openapiFields.add("trigger_parameters");
    openapiFields.add("state");
    openapiFields.add("created_at");
    openapiFields.add("trigger");
    openapiFields.add("vcs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("project_slug");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("trigger");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Pipeline
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Pipeline.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pipeline is not found in the empty JSON string", Pipeline.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Pipeline.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        PipelineErrorsInner.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("project_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_slug").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `trigger`
      PipelineTrigger.validateJsonObject(jsonObj.getAsJsonObject("trigger"));
      // validate the optional field `vcs`
      if (jsonObj.get("vcs") != null && !jsonObj.get("vcs").isJsonNull()) {
        PipelineVcs.validateJsonObject(jsonObj.getAsJsonObject("vcs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pipeline.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pipeline' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pipeline> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pipeline.class));

       return (TypeAdapter<T>) new TypeAdapter<Pipeline>() {
           @Override
           public void write(JsonWriter out, Pipeline value) throws IOException {
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
           public Pipeline read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Pipeline instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Pipeline given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Pipeline
  * @throws IOException if the JSON string is invalid with respect to Pipeline
  */
  public static Pipeline fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pipeline.class);
  }

 /**
  * Convert an instance of Pipeline to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
