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
 * The configuration strings for the pipeline.
 */
@ApiModel(description = "The configuration strings for the pipeline.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PipelineGetConfigurationByIdResponse {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_COMPILED = "compiled";
  @SerializedName(SERIALIZED_NAME_COMPILED)
  private String compiled;

  public static final String SERIALIZED_NAME_SETUP_CONFIG = "setup-config";
  @SerializedName(SERIALIZED_NAME_SETUP_CONFIG)
  private String setupConfig;

  public static final String SERIALIZED_NAME_COMPILED_SETUP_CONFIG = "compiled-setup-config";
  @SerializedName(SERIALIZED_NAME_COMPILED_SETUP_CONFIG)
  private String compiledSetupConfig;

  public PipelineGetConfigurationByIdResponse() {
  }

  public PipelineGetConfigurationByIdResponse source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * The source configuration for the pipeline, before any config compilation has been performed. If there is no config, then this field will be empty.
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The source configuration for the pipeline, before any config compilation has been performed. If there is no config, then this field will be empty.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public PipelineGetConfigurationByIdResponse compiled(String compiled) {
    
    
    
    
    this.compiled = compiled;
    return this;
  }

   /**
   * The compiled configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline&#39;s configuration, then this field may be empty.
   * @return compiled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The compiled configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline's configuration, then this field may be empty.")

  public String getCompiled() {
    return compiled;
  }


  public void setCompiled(String compiled) {
    
    
    
    this.compiled = compiled;
  }


  public PipelineGetConfigurationByIdResponse setupConfig(String setupConfig) {
    
    
    
    
    this.setupConfig = setupConfig;
    return this;
  }

   /**
   * The setup configuration for the pipeline used for Setup Workflows. If there were errors processing the pipeline&#39;s configuration or if setup workflows are not enabled, then this field should not exist
   * @return setupConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The setup configuration for the pipeline used for Setup Workflows. If there were errors processing the pipeline's configuration or if setup workflows are not enabled, then this field should not exist")

  public String getSetupConfig() {
    return setupConfig;
  }


  public void setSetupConfig(String setupConfig) {
    
    
    
    this.setupConfig = setupConfig;
  }


  public PipelineGetConfigurationByIdResponse compiledSetupConfig(String compiledSetupConfig) {
    
    
    
    
    this.compiledSetupConfig = compiledSetupConfig;
    return this;
  }

   /**
   * The compiled setup configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline&#39;s setup workflows, then this field may be empty.
   * @return compiledSetupConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The compiled setup configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline's setup workflows, then this field may be empty.")

  public String getCompiledSetupConfig() {
    return compiledSetupConfig;
  }


  public void setCompiledSetupConfig(String compiledSetupConfig) {
    
    
    
    this.compiledSetupConfig = compiledSetupConfig;
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
   * @return the PipelineGetConfigurationByIdResponse instance itself
   */
  public PipelineGetConfigurationByIdResponse putAdditionalProperty(String key, Object value) {
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
    PipelineGetConfigurationByIdResponse pipelineGetConfigurationByIdResponse = (PipelineGetConfigurationByIdResponse) o;
    return Objects.equals(this.source, pipelineGetConfigurationByIdResponse.source) &&
        Objects.equals(this.compiled, pipelineGetConfigurationByIdResponse.compiled) &&
        Objects.equals(this.setupConfig, pipelineGetConfigurationByIdResponse.setupConfig) &&
        Objects.equals(this.compiledSetupConfig, pipelineGetConfigurationByIdResponse.compiledSetupConfig)&&
        Objects.equals(this.additionalProperties, pipelineGetConfigurationByIdResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, compiled, setupConfig, compiledSetupConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineGetConfigurationByIdResponse {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    compiled: ").append(toIndentedString(compiled)).append("\n");
    sb.append("    setupConfig: ").append(toIndentedString(setupConfig)).append("\n");
    sb.append("    compiledSetupConfig: ").append(toIndentedString(compiledSetupConfig)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("compiled");
    openapiFields.add("setup-config");
    openapiFields.add("compiled-setup-config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("compiled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PipelineGetConfigurationByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PipelineGetConfigurationByIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PipelineGetConfigurationByIdResponse is not found in the empty JSON string", PipelineGetConfigurationByIdResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PipelineGetConfigurationByIdResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("compiled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compiled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compiled").toString()));
      }
      if ((jsonObj.get("setup-config") != null && !jsonObj.get("setup-config").isJsonNull()) && !jsonObj.get("setup-config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setup-config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setup-config").toString()));
      }
      if ((jsonObj.get("compiled-setup-config") != null && !jsonObj.get("compiled-setup-config").isJsonNull()) && !jsonObj.get("compiled-setup-config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compiled-setup-config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compiled-setup-config").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PipelineGetConfigurationByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PipelineGetConfigurationByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PipelineGetConfigurationByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PipelineGetConfigurationByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PipelineGetConfigurationByIdResponse>() {
           @Override
           public void write(JsonWriter out, PipelineGetConfigurationByIdResponse value) throws IOException {
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
           public PipelineGetConfigurationByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PipelineGetConfigurationByIdResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PipelineGetConfigurationByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PipelineGetConfigurationByIdResponse
  * @throws IOException if the JSON string is invalid with respect to PipelineGetConfigurationByIdResponse
  */
  public static PipelineGetConfigurationByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PipelineGetConfigurationByIdResponse.class);
  }

 /**
  * Convert an instance of PipelineGetConfigurationByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

