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
import com.konfigthis.client.model.ProjectGetBySlugResponseVcsInfo;
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
 * NOTE: The definition of Project is subject to change.
 */
@ApiModel(description = "NOTE: The definition of Project is subject to change.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectGetBySlugResponse {
  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_ORGANIZATION_SLUG = "organization_slug";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_SLUG)
  private String organizationSlug;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_VCS_INFO = "vcs_info";
  @SerializedName(SERIALIZED_NAME_VCS_INFO)
  private ProjectGetBySlugResponseVcsInfo vcsInfo;

  public ProjectGetBySlugResponse() {
  }

  public ProjectGetBySlugResponse slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. For projects that use GitLab or GitHub App, use &#x60;circleci&#x60; as the &#x60;vcs-slug&#x60;, replace &#x60;org-name&#x60; with the organization ID (found in Organization Settings), and replace &#x60;repo-name&#x60; with the project ID (found in Project Settings).
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped. For projects that use GitLab or GitHub App, use `circleci` as the `vcs-slug`, replace `org-name` with the organization ID (found in Organization Settings), and replace `repo-name` with the project ID (found in Project Settings).")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public ProjectGetBySlugResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "api-preview-docs", required = true, value = "The name of the project")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProjectGetBySlugResponse id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public ProjectGetBySlugResponse organizationName(String organizationName) {
    
    
    
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * The name of the organization the project belongs to
   * @return organizationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CircleCI-Public", required = true, value = "The name of the organization the project belongs to")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    
    
    
    this.organizationName = organizationName;
  }


  public ProjectGetBySlugResponse organizationSlug(String organizationSlug) {
    
    
    
    
    this.organizationSlug = organizationSlug;
    return this;
  }

   /**
   * The slug of the organization the project belongs to
   * @return organizationSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CircleCI-Public", required = true, value = "The slug of the organization the project belongs to")

  public String getOrganizationSlug() {
    return organizationSlug;
  }


  public void setOrganizationSlug(String organizationSlug) {
    
    
    
    this.organizationSlug = organizationSlug;
  }


  public ProjectGetBySlugResponse organizationId(UUID organizationId) {
    
    
    
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The id of the organization the project belongs to
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the organization the project belongs to")

  public UUID getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(UUID organizationId) {
    
    
    
    this.organizationId = organizationId;
  }


  public ProjectGetBySlugResponse vcsInfo(ProjectGetBySlugResponseVcsInfo vcsInfo) {
    
    
    
    
    this.vcsInfo = vcsInfo;
    return this;
  }

   /**
   * Get vcsInfo
   * @return vcsInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectGetBySlugResponseVcsInfo getVcsInfo() {
    return vcsInfo;
  }


  public void setVcsInfo(ProjectGetBySlugResponseVcsInfo vcsInfo) {
    
    
    
    this.vcsInfo = vcsInfo;
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
   * @return the ProjectGetBySlugResponse instance itself
   */
  public ProjectGetBySlugResponse putAdditionalProperty(String key, Object value) {
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
    ProjectGetBySlugResponse projectGetBySlugResponse = (ProjectGetBySlugResponse) o;
    return Objects.equals(this.slug, projectGetBySlugResponse.slug) &&
        Objects.equals(this.name, projectGetBySlugResponse.name) &&
        Objects.equals(this.id, projectGetBySlugResponse.id) &&
        Objects.equals(this.organizationName, projectGetBySlugResponse.organizationName) &&
        Objects.equals(this.organizationSlug, projectGetBySlugResponse.organizationSlug) &&
        Objects.equals(this.organizationId, projectGetBySlugResponse.organizationId) &&
        Objects.equals(this.vcsInfo, projectGetBySlugResponse.vcsInfo)&&
        Objects.equals(this.additionalProperties, projectGetBySlugResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, id, organizationName, organizationSlug, organizationId, vcsInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectGetBySlugResponse {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationSlug: ").append(toIndentedString(organizationSlug)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    vcsInfo: ").append(toIndentedString(vcsInfo)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("name");
    openapiFields.add("id");
    openapiFields.add("organization_name");
    openapiFields.add("organization_slug");
    openapiFields.add("organization_id");
    openapiFields.add("vcs_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("organization_name");
    openapiRequiredFields.add("organization_slug");
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("vcs_info");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectGetBySlugResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectGetBySlugResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectGetBySlugResponse is not found in the empty JSON string", ProjectGetBySlugResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectGetBySlugResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if (!jsonObj.get("organization_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_slug").toString()));
      }
      if (!jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      // validate the required field `vcs_info`
      ProjectGetBySlugResponseVcsInfo.validateJsonObject(jsonObj.getAsJsonObject("vcs_info"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectGetBySlugResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectGetBySlugResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectGetBySlugResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectGetBySlugResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectGetBySlugResponse>() {
           @Override
           public void write(JsonWriter out, ProjectGetBySlugResponse value) throws IOException {
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
           public ProjectGetBySlugResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectGetBySlugResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectGetBySlugResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectGetBySlugResponse
  * @throws IOException if the JSON string is invalid with respect to ProjectGetBySlugResponse
  */
  public static ProjectGetBySlugResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectGetBySlugResponse.class);
  }

 /**
  * Convert an instance of ProjectGetBySlugResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
