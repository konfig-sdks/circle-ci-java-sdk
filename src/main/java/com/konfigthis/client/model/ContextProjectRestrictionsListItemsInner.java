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
 * ContextProjectRestrictionsListItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContextProjectRestrictionsListItemsInner {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "context_id";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private UUID contextId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Type of the restriction
   */
  @JsonAdapter(RestrictionTypeEnum.Adapter.class)
 public enum RestrictionTypeEnum {
    PROJECT("project"),
    
    EXPRESSION("expression");

    private String value;

    RestrictionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestrictionTypeEnum fromValue(String value) {
      for (RestrictionTypeEnum b : RestrictionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestrictionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestrictionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestrictionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestrictionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESTRICTION_TYPE = "restriction_type";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_TYPE)
  private RestrictionTypeEnum restrictionType;

  public static final String SERIALIZED_NAME_RESTRICTION_VALUE = "restriction_value";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_VALUE)
  private String restrictionValue;

  public ContextProjectRestrictionsListItemsInner() {
  }

  public ContextProjectRestrictionsListItemsInner contextId(UUID contextId) {
    
    
    
    
    this.contextId = contextId;
    return this;
  }

   /**
   * UUID of the context
   * @return contextId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the context")

  public UUID getContextId() {
    return contextId;
  }


  public void setContextId(UUID contextId) {
    
    
    
    this.contextId = contextId;
  }


  public ContextProjectRestrictionsListItemsInner id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * UUID of the restriction
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the restriction")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public ContextProjectRestrictionsListItemsInner projectId(UUID projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Deprecated - For \&quot;project\&quot; restrictions read the project ID from \&quot;restriction_value\&quot; instead.  UUID of the project used in a project restriction. 
   * @return projectId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - For \"project\" restrictions read the project ID from \"restriction_value\" instead.  UUID of the project used in a project restriction. ")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    
    
    
    this.projectId = projectId;
  }


  public ContextProjectRestrictionsListItemsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Contains a human-readable reference for the restriction. For \&quot;project\&quot; restrictions this is the name of the project.  May be null. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a human-readable reference for the restriction. For \"project\" restrictions this is the name of the project.  May be null. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ContextProjectRestrictionsListItemsInner restrictionType(RestrictionTypeEnum restrictionType) {
    
    
    
    
    this.restrictionType = restrictionType;
    return this;
  }

   /**
   * Type of the restriction
   * @return restrictionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the restriction")

  public RestrictionTypeEnum getRestrictionType() {
    return restrictionType;
  }


  public void setRestrictionType(RestrictionTypeEnum restrictionType) {
    
    
    
    this.restrictionType = restrictionType;
  }


  public ContextProjectRestrictionsListItemsInner restrictionValue(String restrictionValue) {
    
    
    
    
    this.restrictionValue = restrictionValue;
    return this;
  }

   /**
   * Value used to evaluate the restriction
   * @return restrictionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value used to evaluate the restriction")

  public String getRestrictionValue() {
    return restrictionValue;
  }


  public void setRestrictionValue(String restrictionValue) {
    
    
    
    this.restrictionValue = restrictionValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextProjectRestrictionsListItemsInner contextProjectRestrictionsListItemsInner = (ContextProjectRestrictionsListItemsInner) o;
    return Objects.equals(this.contextId, contextProjectRestrictionsListItemsInner.contextId) &&
        Objects.equals(this.id, contextProjectRestrictionsListItemsInner.id) &&
        Objects.equals(this.projectId, contextProjectRestrictionsListItemsInner.projectId) &&
        Objects.equals(this.name, contextProjectRestrictionsListItemsInner.name) &&
        Objects.equals(this.restrictionType, contextProjectRestrictionsListItemsInner.restrictionType) &&
        Objects.equals(this.restrictionValue, contextProjectRestrictionsListItemsInner.restrictionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, id, projectId, name, restrictionType, restrictionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextProjectRestrictionsListItemsInner {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
    sb.append("    restrictionValue: ").append(toIndentedString(restrictionValue)).append("\n");
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
    openapiFields.add("context_id");
    openapiFields.add("id");
    openapiFields.add("project_id");
    openapiFields.add("name");
    openapiFields.add("restriction_type");
    openapiFields.add("restriction_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContextProjectRestrictionsListItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContextProjectRestrictionsListItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContextProjectRestrictionsListItemsInner is not found in the empty JSON string", ContextProjectRestrictionsListItemsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContextProjectRestrictionsListItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContextProjectRestrictionsListItemsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("context_id") != null && !jsonObj.get("context_id").isJsonNull()) && !jsonObj.get("context_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("restriction_type") != null && !jsonObj.get("restriction_type").isJsonNull()) && !jsonObj.get("restriction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restriction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restriction_type").toString()));
      }
      if ((jsonObj.get("restriction_value") != null && !jsonObj.get("restriction_value").isJsonNull()) && !jsonObj.get("restriction_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restriction_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restriction_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContextProjectRestrictionsListItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContextProjectRestrictionsListItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContextProjectRestrictionsListItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContextProjectRestrictionsListItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ContextProjectRestrictionsListItemsInner>() {
           @Override
           public void write(JsonWriter out, ContextProjectRestrictionsListItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContextProjectRestrictionsListItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContextProjectRestrictionsListItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContextProjectRestrictionsListItemsInner
  * @throws IOException if the JSON string is invalid with respect to ContextProjectRestrictionsListItemsInner
  */
  public static ContextProjectRestrictionsListItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContextProjectRestrictionsListItemsInner.class);
  }

 /**
  * Convert an instance of ContextProjectRestrictionsListItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
