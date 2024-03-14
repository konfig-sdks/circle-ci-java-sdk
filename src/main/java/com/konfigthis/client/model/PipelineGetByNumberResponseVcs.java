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
import com.konfigthis.client.model.PipelineVcsCommit;
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
 * VCS information for the pipeline.
 */
@ApiModel(description = "VCS information for the pipeline.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PipelineGetByNumberResponseVcs {
  public static final String SERIALIZED_NAME_PROVIDER_NAME = "provider_name";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_TARGET_REPOSITORY_URL = "target_repository_url";
  @SerializedName(SERIALIZED_NAME_TARGET_REPOSITORY_URL)
  private String targetRepositoryUrl;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_REVIEW_ID = "review_id";
  @SerializedName(SERIALIZED_NAME_REVIEW_ID)
  private String reviewId;

  public static final String SERIALIZED_NAME_REVIEW_URL = "review_url";
  @SerializedName(SERIALIZED_NAME_REVIEW_URL)
  private String reviewUrl;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private PipelineVcsCommit commit;

  public static final String SERIALIZED_NAME_ORIGIN_REPOSITORY_URL = "origin_repository_url";
  @SerializedName(SERIALIZED_NAME_ORIGIN_REPOSITORY_URL)
  private String originRepositoryUrl;

  public PipelineGetByNumberResponseVcs() {
  }

  public PipelineGetByNumberResponseVcs providerName(String providerName) {
    
    
    
    
    this.providerName = providerName;
    return this;
  }

   /**
   * Name of the VCS provider (e.g. GitHub, Bitbucket).
   * @return providerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GitHub", required = true, value = "Name of the VCS provider (e.g. GitHub, Bitbucket).")

  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    
    
    
    this.providerName = providerName;
  }


  public PipelineGetByNumberResponseVcs targetRepositoryUrl(String targetRepositoryUrl) {
    
    
    
    
    this.targetRepositoryUrl = targetRepositoryUrl;
    return this;
  }

   /**
   * URL for the repository the trigger targets (i.e. the repository where the PR will be merged). For fork-PR pipelines, this is the URL to the parent repo. For other pipelines, the &#x60;origin_&#x60; and &#x60;target_repository_url&#x60;s will be the same.
   * @return targetRepositoryUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://github.com/CircleCI-Public/api-preview-docs", required = true, value = "URL for the repository the trigger targets (i.e. the repository where the PR will be merged). For fork-PR pipelines, this is the URL to the parent repo. For other pipelines, the `origin_` and `target_repository_url`s will be the same.")

  public String getTargetRepositoryUrl() {
    return targetRepositoryUrl;
  }


  public void setTargetRepositoryUrl(String targetRepositoryUrl) {
    
    
    
    this.targetRepositoryUrl = targetRepositoryUrl;
  }


  public PipelineGetByNumberResponseVcs branch(String branch) {
    
    
    
    
    this.branch = branch;
    return this;
  }

   /**
   * The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. To trigger a pipeline for a PR by number use &#x60;pull/&lt;number&gt;/head&#x60; for the PR ref or &#x60;pull/&lt;number&gt;/merge&#x60; for the merge ref (GitHub only).
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "feature/design-new-api", value = "The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that `branch` and `tag` are mutually exclusive. To trigger a pipeline for a PR by number use `pull/<number>/head` for the PR ref or `pull/<number>/merge` for the merge ref (GitHub only).")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    
    
    
    this.branch = branch;
  }


  public PipelineGetByNumberResponseVcs reviewId(String reviewId) {
    
    
    
    
    this.reviewId = reviewId;
    return this;
  }

   /**
   * The code review id.
   * @return reviewId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The code review id.")

  public String getReviewId() {
    return reviewId;
  }


  public void setReviewId(String reviewId) {
    
    
    
    this.reviewId = reviewId;
  }


  public PipelineGetByNumberResponseVcs reviewUrl(String reviewUrl) {
    
    
    
    
    this.reviewUrl = reviewUrl;
    return this;
  }

   /**
   * The code review URL.
   * @return reviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://github.com/CircleCI-Public/api-preview-docs/pull/123", value = "The code review URL.")

  public String getReviewUrl() {
    return reviewUrl;
  }


  public void setReviewUrl(String reviewUrl) {
    
    
    
    this.reviewUrl = reviewUrl;
  }


  public PipelineGetByNumberResponseVcs revision(String revision) {
    
    
    
    
    this.revision = revision;
    return this;
  }

   /**
   * The code revision the pipeline ran.
   * @return revision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f454a02b5d10fcccfd7d9dd7608a76d6493a98b4", required = true, value = "The code revision the pipeline ran.")

  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    
    
    
    this.revision = revision;
  }


  public PipelineGetByNumberResponseVcs tag(String tag) {
    
    
    
    
    this.tag = tag;
    return this;
  }

   /**
   * The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v3.1.4159", value = "The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that `branch` and `tag` are mutually exclusive.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    
    
    
    this.tag = tag;
  }


  public PipelineGetByNumberResponseVcs commit(PipelineVcsCommit commit) {
    
    
    
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PipelineVcsCommit getCommit() {
    return commit;
  }


  public void setCommit(PipelineVcsCommit commit) {
    
    
    
    this.commit = commit;
  }


  public PipelineGetByNumberResponseVcs originRepositoryUrl(String originRepositoryUrl) {
    
    
    
    
    this.originRepositoryUrl = originRepositoryUrl;
    return this;
  }

   /**
   * URL for the repository where the trigger originated. For fork-PR pipelines, this is the URL to the fork. For other pipelines the &#x60;origin_&#x60; and &#x60;target_repository_url&#x60;s will be the same.
   * @return originRepositoryUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://github.com/CircleCI-Public/api-preview-docs", required = true, value = "URL for the repository where the trigger originated. For fork-PR pipelines, this is the URL to the fork. For other pipelines the `origin_` and `target_repository_url`s will be the same.")

  public String getOriginRepositoryUrl() {
    return originRepositoryUrl;
  }


  public void setOriginRepositoryUrl(String originRepositoryUrl) {
    
    
    
    this.originRepositoryUrl = originRepositoryUrl;
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
   * @return the PipelineGetByNumberResponseVcs instance itself
   */
  public PipelineGetByNumberResponseVcs putAdditionalProperty(String key, Object value) {
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
    PipelineGetByNumberResponseVcs pipelineGetByNumberResponseVcs = (PipelineGetByNumberResponseVcs) o;
    return Objects.equals(this.providerName, pipelineGetByNumberResponseVcs.providerName) &&
        Objects.equals(this.targetRepositoryUrl, pipelineGetByNumberResponseVcs.targetRepositoryUrl) &&
        Objects.equals(this.branch, pipelineGetByNumberResponseVcs.branch) &&
        Objects.equals(this.reviewId, pipelineGetByNumberResponseVcs.reviewId) &&
        Objects.equals(this.reviewUrl, pipelineGetByNumberResponseVcs.reviewUrl) &&
        Objects.equals(this.revision, pipelineGetByNumberResponseVcs.revision) &&
        Objects.equals(this.tag, pipelineGetByNumberResponseVcs.tag) &&
        Objects.equals(this.commit, pipelineGetByNumberResponseVcs.commit) &&
        Objects.equals(this.originRepositoryUrl, pipelineGetByNumberResponseVcs.originRepositoryUrl)&&
        Objects.equals(this.additionalProperties, pipelineGetByNumberResponseVcs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, targetRepositoryUrl, branch, reviewId, reviewUrl, revision, tag, commit, originRepositoryUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineGetByNumberResponseVcs {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    targetRepositoryUrl: ").append(toIndentedString(targetRepositoryUrl)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    originRepositoryUrl: ").append(toIndentedString(originRepositoryUrl)).append("\n");
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
    openapiFields.add("provider_name");
    openapiFields.add("target_repository_url");
    openapiFields.add("branch");
    openapiFields.add("review_id");
    openapiFields.add("review_url");
    openapiFields.add("revision");
    openapiFields.add("tag");
    openapiFields.add("commit");
    openapiFields.add("origin_repository_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("provider_name");
    openapiRequiredFields.add("target_repository_url");
    openapiRequiredFields.add("revision");
    openapiRequiredFields.add("origin_repository_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PipelineGetByNumberResponseVcs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PipelineGetByNumberResponseVcs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PipelineGetByNumberResponseVcs is not found in the empty JSON string", PipelineGetByNumberResponseVcs.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PipelineGetByNumberResponseVcs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("provider_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_name").toString()));
      }
      if (!jsonObj.get("target_repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_repository_url").toString()));
      }
      if ((jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonNull()) && !jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if ((jsonObj.get("review_id") != null && !jsonObj.get("review_id").isJsonNull()) && !jsonObj.get("review_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_id").toString()));
      }
      if ((jsonObj.get("review_url") != null && !jsonObj.get("review_url").isJsonNull()) && !jsonObj.get("review_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_url").toString()));
      }
      if (!jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      // validate the optional field `commit`
      if (jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) {
        PipelineVcsCommit.validateJsonObject(jsonObj.getAsJsonObject("commit"));
      }
      if (!jsonObj.get("origin_repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_repository_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PipelineGetByNumberResponseVcs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PipelineGetByNumberResponseVcs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PipelineGetByNumberResponseVcs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PipelineGetByNumberResponseVcs.class));

       return (TypeAdapter<T>) new TypeAdapter<PipelineGetByNumberResponseVcs>() {
           @Override
           public void write(JsonWriter out, PipelineGetByNumberResponseVcs value) throws IOException {
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
           public PipelineGetByNumberResponseVcs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PipelineGetByNumberResponseVcs instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PipelineGetByNumberResponseVcs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PipelineGetByNumberResponseVcs
  * @throws IOException if the JSON string is invalid with respect to PipelineGetByNumberResponseVcs
  */
  public static PipelineGetByNumberResponseVcs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PipelineGetByNumberResponseVcs.class);
  }

 /**
  * Convert an instance of PipelineGetByNumberResponseVcs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

