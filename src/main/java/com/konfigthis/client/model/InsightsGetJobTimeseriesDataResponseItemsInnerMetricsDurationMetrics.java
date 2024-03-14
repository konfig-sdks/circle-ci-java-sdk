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
 * Metrics relating to the duration of runs for a workflow.
 */
@ApiModel(description = "Metrics relating to the duration of runs for a workflow.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Long min;

  public static final String SERIALIZED_NAME_MEDIAN = "median";
  @SerializedName(SERIALIZED_NAME_MEDIAN)
  private Long median;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Long max;

  public static final String SERIALIZED_NAME_P95 = "p95";
  @SerializedName(SERIALIZED_NAME_P95)
  private Long p95;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics() {
  }

  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics min(Long min) {
    if (min != null && min < 0) {
      throw new IllegalArgumentException("Invalid value for min. Must be greater than or equal to 0.");
    }
    
    
    
    this.min = min;
    return this;
  }

   /**
   * The minimum duration, in seconds, among a group of runs.
   * minimum: 0
   * @return min
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The minimum duration, in seconds, among a group of runs.")

  public Long getMin() {
    return min;
  }


  public void setMin(Long min) {
    if (min != null && min < 0) {
      throw new IllegalArgumentException("Invalid value for min. Must be greater than or equal to 0.");
    }
    
    
    this.min = min;
  }


  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics median(Long median) {
    if (median != null && median < 0) {
      throw new IllegalArgumentException("Invalid value for median. Must be greater than or equal to 0.");
    }
    
    
    
    this.median = median;
    return this;
  }

   /**
   * The median duration, in seconds, among a group of runs.
   * minimum: 0
   * @return median
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The median duration, in seconds, among a group of runs.")

  public Long getMedian() {
    return median;
  }


  public void setMedian(Long median) {
    if (median != null && median < 0) {
      throw new IllegalArgumentException("Invalid value for median. Must be greater than or equal to 0.");
    }
    
    
    this.median = median;
  }


  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics max(Long max) {
    if (max != null && max < 0) {
      throw new IllegalArgumentException("Invalid value for max. Must be greater than or equal to 0.");
    }
    
    
    
    this.max = max;
    return this;
  }

   /**
   * The max duration, in seconds, among a group of runs.
   * minimum: 0
   * @return max
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The max duration, in seconds, among a group of runs.")

  public Long getMax() {
    return max;
  }


  public void setMax(Long max) {
    if (max != null && max < 0) {
      throw new IllegalArgumentException("Invalid value for max. Must be greater than or equal to 0.");
    }
    
    
    this.max = max;
  }


  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics p95(Long p95) {
    if (p95 != null && p95 < 0) {
      throw new IllegalArgumentException("Invalid value for p95. Must be greater than or equal to 0.");
    }
    
    
    
    this.p95 = p95;
    return this;
  }

   /**
   * The 95th percentile duration, in seconds, among a group of runs.
   * minimum: 0
   * @return p95
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The 95th percentile duration, in seconds, among a group of runs.")

  public Long getP95() {
    return p95;
  }


  public void setP95(Long p95) {
    if (p95 != null && p95 < 0) {
      throw new IllegalArgumentException("Invalid value for p95. Must be greater than or equal to 0.");
    }
    
    
    this.p95 = p95;
  }


  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics total(Long total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    
    this.total = total;
    return this;
  }

   /**
   * The total duration, in seconds, added across a group of runs.
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total duration, in seconds, added across a group of runs.")

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    this.total = total;
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
   * @return the InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics instance itself
   */
  public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics putAdditionalProperty(String key, Object value) {
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
    InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics = (InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics) o;
    return Objects.equals(this.min, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.min) &&
        Objects.equals(this.median, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.median) &&
        Objects.equals(this.max, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.max) &&
        Objects.equals(this.p95, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.p95) &&
        Objects.equals(this.total, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.total)&&
        Objects.equals(this.additionalProperties, insightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, median, max, p95, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    p95: ").append(toIndentedString(p95)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("median");
    openapiFields.add("max");
    openapiFields.add("p95");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min");
    openapiRequiredFields.add("median");
    openapiRequiredFields.add("max");
    openapiRequiredFields.add("p95");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics is not found in the empty JSON string", InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics>() {
           @Override
           public void write(JsonWriter out, InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics value) throws IOException {
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
           public InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics
  * @throws IOException if the JSON string is invalid with respect to InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics
  */
  public static InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics.class);
  }

 /**
  * Convert an instance of InsightsGetJobTimeseriesDataResponseItemsInnerMetricsDurationMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

