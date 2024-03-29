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
 * Metrics for a single org metrics.
 */
@ApiModel(description = "Metrics for a single org metrics.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics {
  public static final String SERIALIZED_NAME_TOTAL_RUNS = "total_runs";
  @SerializedName(SERIALIZED_NAME_TOTAL_RUNS)
  private Long totalRuns;

  public static final String SERIALIZED_NAME_TOTAL_DURATION_SECS = "total_duration_secs";
  @SerializedName(SERIALIZED_NAME_TOTAL_DURATION_SECS)
  private Long totalDurationSecs;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS_USED = "total_credits_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS_USED)
  private Long totalCreditsUsed;

  public static final String SERIALIZED_NAME_SUCCESS_RATE = "success_rate";
  @SerializedName(SERIALIZED_NAME_SUCCESS_RATE)
  private Float successRate;

  public static final String SERIALIZED_NAME_THROUGHPUT = "throughput";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT)
  private Float throughput;

  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics() {
  }

  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics totalRuns(Long totalRuns) {
    if (totalRuns != null && totalRuns < 0) {
      throw new IllegalArgumentException("Invalid value for totalRuns. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalRuns = totalRuns;
    return this;
  }

   /**
   * The total number of runs, including runs that are still on-hold or running.
   * minimum: 0
   * @return totalRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of runs, including runs that are still on-hold or running.")

  public Long getTotalRuns() {
    return totalRuns;
  }


  public void setTotalRuns(Long totalRuns) {
    if (totalRuns != null && totalRuns < 0) {
      throw new IllegalArgumentException("Invalid value for totalRuns. Must be greater than or equal to 0.");
    }
    
    
    this.totalRuns = totalRuns;
  }


  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics totalDurationSecs(Long totalDurationSecs) {
    if (totalDurationSecs != null && totalDurationSecs < 0) {
      throw new IllegalArgumentException("Invalid value for totalDurationSecs. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalDurationSecs = totalDurationSecs;
    return this;
  }

   /**
   * Total duration, in seconds.
   * minimum: 0
   * @return totalDurationSecs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total duration, in seconds.")

  public Long getTotalDurationSecs() {
    return totalDurationSecs;
  }


  public void setTotalDurationSecs(Long totalDurationSecs) {
    if (totalDurationSecs != null && totalDurationSecs < 0) {
      throw new IllegalArgumentException("Invalid value for totalDurationSecs. Must be greater than or equal to 0.");
    }
    
    
    this.totalDurationSecs = totalDurationSecs;
  }


  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics totalCreditsUsed(Long totalCreditsUsed) {
    if (totalCreditsUsed != null && totalCreditsUsed < 0) {
      throw new IllegalArgumentException("Invalid value for totalCreditsUsed. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalCreditsUsed = totalCreditsUsed;
    return this;
  }

   /**
   * The total credits consumed over the current timeseries interval.
   * minimum: 0
   * @return totalCreditsUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total credits consumed over the current timeseries interval.")

  public Long getTotalCreditsUsed() {
    return totalCreditsUsed;
  }


  public void setTotalCreditsUsed(Long totalCreditsUsed) {
    if (totalCreditsUsed != null && totalCreditsUsed < 0) {
      throw new IllegalArgumentException("Invalid value for totalCreditsUsed. Must be greater than or equal to 0.");
    }
    
    
    this.totalCreditsUsed = totalCreditsUsed;
  }


  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics successRate(Float successRate) {
    
    
    
    
    this.successRate = successRate;
    return this;
  }

   /**
   * Get successRate
   * @return successRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getSuccessRate() {
    return successRate;
  }


  public void setSuccessRate(Float successRate) {
    
    
    
    this.successRate = successRate;
  }


  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics throughput(Float throughput) {
    
    
    
    
    this.throughput = throughput;
    return this;
  }

   /**
   * The average number of runs per day.
   * @return throughput
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The average number of runs per day.")

  public Float getThroughput() {
    return throughput;
  }


  public void setThroughput(Float throughput) {
    
    
    
    this.throughput = throughput;
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
   * @return the InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics instance itself
   */
  public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics putAdditionalProperty(String key, Object value) {
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
    InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics = (InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics) o;
    return Objects.equals(this.totalRuns, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.totalRuns) &&
        Objects.equals(this.totalDurationSecs, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.totalDurationSecs) &&
        Objects.equals(this.totalCreditsUsed, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.totalCreditsUsed) &&
        Objects.equals(this.successRate, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.successRate) &&
        Objects.equals(this.throughput, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.throughput)&&
        Objects.equals(this.additionalProperties, insightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRuns, totalDurationSecs, totalCreditsUsed, successRate, throughput, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics {\n");
    sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
    sb.append("    totalDurationSecs: ").append(toIndentedString(totalDurationSecs)).append("\n");
    sb.append("    totalCreditsUsed: ").append(toIndentedString(totalCreditsUsed)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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
    openapiFields.add("total_runs");
    openapiFields.add("total_duration_secs");
    openapiFields.add("total_credits_used");
    openapiFields.add("success_rate");
    openapiFields.add("throughput");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_runs");
    openapiRequiredFields.add("total_duration_secs");
    openapiRequiredFields.add("total_credits_used");
    openapiRequiredFields.add("success_rate");
    openapiRequiredFields.add("throughput");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics is not found in the empty JSON string", InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics>() {
           @Override
           public void write(JsonWriter out, InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics value) throws IOException {
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
           public InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics
  * @throws IOException if the JSON string is invalid with respect to InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics
  */
  public static InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics.class);
  }

 /**
  * Convert an instance of InsightsGetSummaryMetricsWithTrendsResponseOrgDataMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

