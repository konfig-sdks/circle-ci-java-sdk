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
import java.time.OffsetDateTime;
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
 * ClaimResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClaimResponse {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private List<String> audience = null;

  public static final String SERIALIZED_NAME_AUDIENCE_UPDATED_AT = "audience_updated_at";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_UPDATED_AT)
  private OffsetDateTime audienceUpdatedAt;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private UUID orgId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_TTL_UPDATED_AT = "ttl_updated_at";
  @SerializedName(SERIALIZED_NAME_TTL_UPDATED_AT)
  private OffsetDateTime ttlUpdatedAt;

  public ClaimResponse() {
  }

  public ClaimResponse audience(List<String> audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

  public ClaimResponse addAudienceItem(String audienceItem) {
    if (this.audience == null) {
      this.audience = new ArrayList<>();
    }
    this.audience.add(audienceItem);
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAudience() {
    return audience;
  }


  public void setAudience(List<String> audience) {
    
    
    
    this.audience = audience;
  }


  public ClaimResponse audienceUpdatedAt(OffsetDateTime audienceUpdatedAt) {
    
    
    
    
    this.audienceUpdatedAt = audienceUpdatedAt;
    return this;
  }

   /**
   * Get audienceUpdatedAt
   * @return audienceUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAudienceUpdatedAt() {
    return audienceUpdatedAt;
  }


  public void setAudienceUpdatedAt(OffsetDateTime audienceUpdatedAt) {
    
    
    
    this.audienceUpdatedAt = audienceUpdatedAt;
  }


  public ClaimResponse orgId(UUID orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getOrgId() {
    return orgId;
  }


  public void setOrgId(UUID orgId) {
    
    
    
    this.orgId = orgId;
  }


  public ClaimResponse projectId(UUID projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    
    
    
    this.projectId = projectId;
  }


  public ClaimResponse ttl(String ttl) {
    
    
    
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    
    
    
    this.ttl = ttl;
  }


  public ClaimResponse ttlUpdatedAt(OffsetDateTime ttlUpdatedAt) {
    
    
    
    
    this.ttlUpdatedAt = ttlUpdatedAt;
    return this;
  }

   /**
   * Get ttlUpdatedAt
   * @return ttlUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTtlUpdatedAt() {
    return ttlUpdatedAt;
  }


  public void setTtlUpdatedAt(OffsetDateTime ttlUpdatedAt) {
    
    
    
    this.ttlUpdatedAt = ttlUpdatedAt;
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
   * @return the ClaimResponse instance itself
   */
  public ClaimResponse putAdditionalProperty(String key, Object value) {
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
    ClaimResponse claimResponse = (ClaimResponse) o;
    return Objects.equals(this.audience, claimResponse.audience) &&
        Objects.equals(this.audienceUpdatedAt, claimResponse.audienceUpdatedAt) &&
        Objects.equals(this.orgId, claimResponse.orgId) &&
        Objects.equals(this.projectId, claimResponse.projectId) &&
        Objects.equals(this.ttl, claimResponse.ttl) &&
        Objects.equals(this.ttlUpdatedAt, claimResponse.ttlUpdatedAt)&&
        Objects.equals(this.additionalProperties, claimResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, audienceUpdatedAt, orgId, projectId, ttl, ttlUpdatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimResponse {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    audienceUpdatedAt: ").append(toIndentedString(audienceUpdatedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    ttlUpdatedAt: ").append(toIndentedString(ttlUpdatedAt)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("audience_updated_at");
    openapiFields.add("org_id");
    openapiFields.add("project_id");
    openapiFields.add("ttl");
    openapiFields.add("ttl_updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("org_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClaimResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClaimResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClaimResponse is not found in the empty JSON string", ClaimResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClaimResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be an array in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if (!jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClaimResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClaimResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClaimResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClaimResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ClaimResponse>() {
           @Override
           public void write(JsonWriter out, ClaimResponse value) throws IOException {
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
           public ClaimResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClaimResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClaimResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClaimResponse
  * @throws IOException if the JSON string is invalid with respect to ClaimResponse
  */
  public static ClaimResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClaimResponse.class);
  }

 /**
  * Convert an instance of ClaimResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

