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
import com.konfigthis.client.model.InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics;
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
 * Metrics relating to a workflow&#39;s runs.
 */
@ApiModel(description = "Metrics relating to a workflow's runs.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics {
  public static final String SERIALIZED_NAME_TOTAL_RUNS = "total_runs";
  @SerializedName(SERIALIZED_NAME_TOTAL_RUNS)
  private Long totalRuns;

  public static final String SERIALIZED_NAME_SUCCESSFUL_RUNS = "successful_runs";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_RUNS)
  private Long successfulRuns;

  public static final String SERIALIZED_NAME_MTTR = "mttr";
  @SerializedName(SERIALIZED_NAME_MTTR)
  private Long mttr;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS_USED = "total_credits_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS_USED)
  private Long totalCreditsUsed;

  public static final String SERIALIZED_NAME_FAILED_RUNS = "failed_runs";
  @SerializedName(SERIALIZED_NAME_FAILED_RUNS)
  private Long failedRuns;

  public static final String SERIALIZED_NAME_SUCCESS_RATE = "success_rate";
  @SerializedName(SERIALIZED_NAME_SUCCESS_RATE)
  private Float successRate;

  public static final String SERIALIZED_NAME_DURATION_METRICS = "duration_metrics";
  @SerializedName(SERIALIZED_NAME_DURATION_METRICS)
  private InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics durationMetrics;

  public static final String SERIALIZED_NAME_TOTAL_RECOVERIES = "total_recoveries";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECOVERIES)
  private Long totalRecoveries;

  public static final String SERIALIZED_NAME_THROUGHPUT = "throughput";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT)
  private Float throughput;

  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics() {
  }

  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics totalRuns(Long totalRuns) {
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


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics successfulRuns(Long successfulRuns) {
    if (successfulRuns != null && successfulRuns < 0) {
      throw new IllegalArgumentException("Invalid value for successfulRuns. Must be greater than or equal to 0.");
    }
    
    
    
    this.successfulRuns = successfulRuns;
    return this;
  }

   /**
   * The number of successful runs.
   * minimum: 0
   * @return successfulRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of successful runs.")

  public Long getSuccessfulRuns() {
    return successfulRuns;
  }


  public void setSuccessfulRuns(Long successfulRuns) {
    if (successfulRuns != null && successfulRuns < 0) {
      throw new IllegalArgumentException("Invalid value for successfulRuns. Must be greater than or equal to 0.");
    }
    
    
    this.successfulRuns = successfulRuns;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics mttr(Long mttr) {
    if (mttr != null && mttr < 0) {
      throw new IllegalArgumentException("Invalid value for mttr. Must be greater than or equal to 0.");
    }
    
    
    
    this.mttr = mttr;
    return this;
  }

   /**
   * The mean time to recovery (mean time between failures and their next success) in seconds.
   * minimum: 0
   * @return mttr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The mean time to recovery (mean time between failures and their next success) in seconds.")

  public Long getMttr() {
    return mttr;
  }


  public void setMttr(Long mttr) {
    if (mttr != null && mttr < 0) {
      throw new IllegalArgumentException("Invalid value for mttr. Must be greater than or equal to 0.");
    }
    
    
    this.mttr = mttr;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics totalCreditsUsed(Long totalCreditsUsed) {
    if (totalCreditsUsed != null && totalCreditsUsed < 0) {
      throw new IllegalArgumentException("Invalid value for totalCreditsUsed. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalCreditsUsed = totalCreditsUsed;
    return this;
  }

   /**
   * The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.
   * minimum: 0
   * @return totalCreditsUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.")

  public Long getTotalCreditsUsed() {
    return totalCreditsUsed;
  }


  public void setTotalCreditsUsed(Long totalCreditsUsed) {
    if (totalCreditsUsed != null && totalCreditsUsed < 0) {
      throw new IllegalArgumentException("Invalid value for totalCreditsUsed. Must be greater than or equal to 0.");
    }
    
    
    this.totalCreditsUsed = totalCreditsUsed;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics failedRuns(Long failedRuns) {
    if (failedRuns != null && failedRuns < 0) {
      throw new IllegalArgumentException("Invalid value for failedRuns. Must be greater than or equal to 0.");
    }
    
    
    
    this.failedRuns = failedRuns;
    return this;
  }

   /**
   * The number of failed runs.
   * minimum: 0
   * @return failedRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of failed runs.")

  public Long getFailedRuns() {
    return failedRuns;
  }


  public void setFailedRuns(Long failedRuns) {
    if (failedRuns != null && failedRuns < 0) {
      throw new IllegalArgumentException("Invalid value for failedRuns. Must be greater than or equal to 0.");
    }
    
    
    this.failedRuns = failedRuns;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics successRate(Float successRate) {
    
    
    
    
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


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics durationMetrics(InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics durationMetrics) {
    
    
    
    
    this.durationMetrics = durationMetrics;
    return this;
  }

   /**
   * Get durationMetrics
   * @return durationMetrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics getDurationMetrics() {
    return durationMetrics;
  }


  public void setDurationMetrics(InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics durationMetrics) {
    
    
    
    this.durationMetrics = durationMetrics;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics totalRecoveries(Long totalRecoveries) {
    if (totalRecoveries != null && totalRecoveries < 0) {
      throw new IllegalArgumentException("Invalid value for totalRecoveries. Must be greater than or equal to 0.");
    }
    
    
    
    this.totalRecoveries = totalRecoveries;
    return this;
  }

   /**
   * The number of recovered workflow executions per day.
   * minimum: 0
   * @return totalRecoveries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of recovered workflow executions per day.")

  public Long getTotalRecoveries() {
    return totalRecoveries;
  }


  public void setTotalRecoveries(Long totalRecoveries) {
    if (totalRecoveries != null && totalRecoveries < 0) {
      throw new IllegalArgumentException("Invalid value for totalRecoveries. Must be greater than or equal to 0.");
    }
    
    
    this.totalRecoveries = totalRecoveries;
  }


  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics throughput(Float throughput) {
    
    
    
    
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
   * @return the InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics instance itself
   */
  public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics putAdditionalProperty(String key, Object value) {
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
    InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics = (InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics) o;
    return Objects.equals(this.totalRuns, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.totalRuns) &&
        Objects.equals(this.successfulRuns, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.successfulRuns) &&
        Objects.equals(this.mttr, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.mttr) &&
        Objects.equals(this.totalCreditsUsed, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.totalCreditsUsed) &&
        Objects.equals(this.failedRuns, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.failedRuns) &&
        Objects.equals(this.successRate, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.successRate) &&
        Objects.equals(this.durationMetrics, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.durationMetrics) &&
        Objects.equals(this.totalRecoveries, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.totalRecoveries) &&
        Objects.equals(this.throughput, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.throughput)&&
        Objects.equals(this.additionalProperties, insightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRuns, successfulRuns, mttr, totalCreditsUsed, failedRuns, successRate, durationMetrics, totalRecoveries, throughput, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics {\n");
    sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
    sb.append("    successfulRuns: ").append(toIndentedString(successfulRuns)).append("\n");
    sb.append("    mttr: ").append(toIndentedString(mttr)).append("\n");
    sb.append("    totalCreditsUsed: ").append(toIndentedString(totalCreditsUsed)).append("\n");
    sb.append("    failedRuns: ").append(toIndentedString(failedRuns)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    durationMetrics: ").append(toIndentedString(durationMetrics)).append("\n");
    sb.append("    totalRecoveries: ").append(toIndentedString(totalRecoveries)).append("\n");
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
    openapiFields.add("successful_runs");
    openapiFields.add("mttr");
    openapiFields.add("total_credits_used");
    openapiFields.add("failed_runs");
    openapiFields.add("success_rate");
    openapiFields.add("duration_metrics");
    openapiFields.add("total_recoveries");
    openapiFields.add("throughput");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total_runs");
    openapiRequiredFields.add("successful_runs");
    openapiRequiredFields.add("mttr");
    openapiRequiredFields.add("total_credits_used");
    openapiRequiredFields.add("failed_runs");
    openapiRequiredFields.add("success_rate");
    openapiRequiredFields.add("duration_metrics");
    openapiRequiredFields.add("total_recoveries");
    openapiRequiredFields.add("throughput");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics is not found in the empty JSON string", InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `duration_metrics`
      InsightsGetProjectWorkflowMetricsResponseItemsInnerMetricsDurationMetrics.validateJsonObject(jsonObj.getAsJsonObject("duration_metrics"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics>() {
           @Override
           public void write(JsonWriter out, InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics value) throws IOException {
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
           public InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics
  * @throws IOException if the JSON string is invalid with respect to InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics
  */
  public static InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics.class);
  }

 /**
  * Convert an instance of InsightsGetProjectWorkflowMetricsResponseItemsInnerMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

