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
 * Trends for aggregated metrics across a workflow for a given time window.
 */
@ApiModel(description = "Trends for aggregated metrics across a workflow for a given time window.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InsightsGetWorkflowSummaryMetricsResponseTrends {
  public static final String SERIALIZED_NAME_TOTAL_RUNS = "total_runs";
  @SerializedName(SERIALIZED_NAME_TOTAL_RUNS)
  private Float totalRuns;

  public static final String SERIALIZED_NAME_FAILED_RUNS = "failed_runs";
  @SerializedName(SERIALIZED_NAME_FAILED_RUNS)
  private Float failedRuns;

  public static final String SERIALIZED_NAME_SUCCESS_RATE = "success_rate";
  @SerializedName(SERIALIZED_NAME_SUCCESS_RATE)
  private Float successRate;

  public static final String SERIALIZED_NAME_P95_DURATION_SECS = "p95_duration_secs";
  @SerializedName(SERIALIZED_NAME_P95_DURATION_SECS)
  private Float p95DurationSecs;

  public static final String SERIALIZED_NAME_MEDIAN_DURATION_SECS = "median_duration_secs";
  @SerializedName(SERIALIZED_NAME_MEDIAN_DURATION_SECS)
  private Float medianDurationSecs;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS_USED = "total_credits_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS_USED)
  private Float totalCreditsUsed;

  public static final String SERIALIZED_NAME_MTTR = "mttr";
  @SerializedName(SERIALIZED_NAME_MTTR)
  private Float mttr;

  public static final String SERIALIZED_NAME_THROUGHPUT = "throughput";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT)
  private Float throughput;

  public InsightsGetWorkflowSummaryMetricsResponseTrends() {
  }

  public InsightsGetWorkflowSummaryMetricsResponseTrends totalRuns(Float totalRuns) {
    
    
    
    
    this.totalRuns = totalRuns;
    return this;
  }

   /**
   * The trend value for total number of runs.
   * @return totalRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The trend value for total number of runs.")

  public Float getTotalRuns() {
    return totalRuns;
  }


  public void setTotalRuns(Float totalRuns) {
    
    
    
    this.totalRuns = totalRuns;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends failedRuns(Float failedRuns) {
    
    
    
    
    this.failedRuns = failedRuns;
    return this;
  }

   /**
   * The trend value for number of failed runs.
   * @return failedRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The trend value for number of failed runs.")

  public Float getFailedRuns() {
    return failedRuns;
  }


  public void setFailedRuns(Float failedRuns) {
    
    
    
    this.failedRuns = failedRuns;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends successRate(Float successRate) {
    
    
    
    
    this.successRate = successRate;
    return this;
  }

   /**
   * The trend value for the success rate.
   * @return successRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The trend value for the success rate.")

  public Float getSuccessRate() {
    return successRate;
  }


  public void setSuccessRate(Float successRate) {
    
    
    
    this.successRate = successRate;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends p95DurationSecs(Float p95DurationSecs) {
    
    
    
    
    this.p95DurationSecs = p95DurationSecs;
    return this;
  }

   /**
   * Trend value for the 95th percentile duration for a workflow for a given time window.
   * @return p95DurationSecs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trend value for the 95th percentile duration for a workflow for a given time window.")

  public Float getP95DurationSecs() {
    return p95DurationSecs;
  }


  public void setP95DurationSecs(Float p95DurationSecs) {
    
    
    
    this.p95DurationSecs = p95DurationSecs;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends medianDurationSecs(Float medianDurationSecs) {
    
    
    
    
    this.medianDurationSecs = medianDurationSecs;
    return this;
  }

   /**
   * Trend value for the 50th percentile duration for a workflow for a given time window.
   * @return medianDurationSecs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trend value for the 50th percentile duration for a workflow for a given time window.")

  public Float getMedianDurationSecs() {
    return medianDurationSecs;
  }


  public void setMedianDurationSecs(Float medianDurationSecs) {
    
    
    
    this.medianDurationSecs = medianDurationSecs;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends totalCreditsUsed(Float totalCreditsUsed) {
    
    
    
    
    this.totalCreditsUsed = totalCreditsUsed;
    return this;
  }

   /**
   * The trend value for total credits consumed.
   * @return totalCreditsUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The trend value for total credits consumed.")

  public Float getTotalCreditsUsed() {
    return totalCreditsUsed;
  }


  public void setTotalCreditsUsed(Float totalCreditsUsed) {
    
    
    
    this.totalCreditsUsed = totalCreditsUsed;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends mttr(Float mttr) {
    
    
    
    
    this.mttr = mttr;
    return this;
  }

   /**
   * trend for mean time to recovery (mean time between failures and their next success).
   * @return mttr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "trend for mean time to recovery (mean time between failures and their next success).")

  public Float getMttr() {
    return mttr;
  }


  public void setMttr(Float mttr) {
    
    
    
    this.mttr = mttr;
  }


  public InsightsGetWorkflowSummaryMetricsResponseTrends throughput(Float throughput) {
    
    
    
    
    this.throughput = throughput;
    return this;
  }

   /**
   * Trend value for the average number of runs per day.
   * @return throughput
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trend value for the average number of runs per day.")

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
   * @return the InsightsGetWorkflowSummaryMetricsResponseTrends instance itself
   */
  public InsightsGetWorkflowSummaryMetricsResponseTrends putAdditionalProperty(String key, Object value) {
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
    InsightsGetWorkflowSummaryMetricsResponseTrends insightsGetWorkflowSummaryMetricsResponseTrends = (InsightsGetWorkflowSummaryMetricsResponseTrends) o;
    return Objects.equals(this.totalRuns, insightsGetWorkflowSummaryMetricsResponseTrends.totalRuns) &&
        Objects.equals(this.failedRuns, insightsGetWorkflowSummaryMetricsResponseTrends.failedRuns) &&
        Objects.equals(this.successRate, insightsGetWorkflowSummaryMetricsResponseTrends.successRate) &&
        Objects.equals(this.p95DurationSecs, insightsGetWorkflowSummaryMetricsResponseTrends.p95DurationSecs) &&
        Objects.equals(this.medianDurationSecs, insightsGetWorkflowSummaryMetricsResponseTrends.medianDurationSecs) &&
        Objects.equals(this.totalCreditsUsed, insightsGetWorkflowSummaryMetricsResponseTrends.totalCreditsUsed) &&
        Objects.equals(this.mttr, insightsGetWorkflowSummaryMetricsResponseTrends.mttr) &&
        Objects.equals(this.throughput, insightsGetWorkflowSummaryMetricsResponseTrends.throughput)&&
        Objects.equals(this.additionalProperties, insightsGetWorkflowSummaryMetricsResponseTrends.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRuns, failedRuns, successRate, p95DurationSecs, medianDurationSecs, totalCreditsUsed, mttr, throughput, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsGetWorkflowSummaryMetricsResponseTrends {\n");
    sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
    sb.append("    failedRuns: ").append(toIndentedString(failedRuns)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    p95DurationSecs: ").append(toIndentedString(p95DurationSecs)).append("\n");
    sb.append("    medianDurationSecs: ").append(toIndentedString(medianDurationSecs)).append("\n");
    sb.append("    totalCreditsUsed: ").append(toIndentedString(totalCreditsUsed)).append("\n");
    sb.append("    mttr: ").append(toIndentedString(mttr)).append("\n");
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
    openapiFields.add("failed_runs");
    openapiFields.add("success_rate");
    openapiFields.add("p95_duration_secs");
    openapiFields.add("median_duration_secs");
    openapiFields.add("total_credits_used");
    openapiFields.add("mttr");
    openapiFields.add("throughput");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_runs");
    openapiRequiredFields.add("failed_runs");
    openapiRequiredFields.add("success_rate");
    openapiRequiredFields.add("p95_duration_secs");
    openapiRequiredFields.add("median_duration_secs");
    openapiRequiredFields.add("total_credits_used");
    openapiRequiredFields.add("mttr");
    openapiRequiredFields.add("throughput");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsightsGetWorkflowSummaryMetricsResponseTrends
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsightsGetWorkflowSummaryMetricsResponseTrends.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightsGetWorkflowSummaryMetricsResponseTrends is not found in the empty JSON string", InsightsGetWorkflowSummaryMetricsResponseTrends.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsightsGetWorkflowSummaryMetricsResponseTrends.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightsGetWorkflowSummaryMetricsResponseTrends.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightsGetWorkflowSummaryMetricsResponseTrends' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightsGetWorkflowSummaryMetricsResponseTrends> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightsGetWorkflowSummaryMetricsResponseTrends.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightsGetWorkflowSummaryMetricsResponseTrends>() {
           @Override
           public void write(JsonWriter out, InsightsGetWorkflowSummaryMetricsResponseTrends value) throws IOException {
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
           public InsightsGetWorkflowSummaryMetricsResponseTrends read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InsightsGetWorkflowSummaryMetricsResponseTrends instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InsightsGetWorkflowSummaryMetricsResponseTrends given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightsGetWorkflowSummaryMetricsResponseTrends
  * @throws IOException if the JSON string is invalid with respect to InsightsGetWorkflowSummaryMetricsResponseTrends
  */
  public static InsightsGetWorkflowSummaryMetricsResponseTrends fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightsGetWorkflowSummaryMetricsResponseTrends.class);
  }

 /**
  * Convert an instance of InsightsGetWorkflowSummaryMetricsResponseTrends to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
