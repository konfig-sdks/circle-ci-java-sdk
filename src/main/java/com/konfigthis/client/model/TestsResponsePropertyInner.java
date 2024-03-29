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
 * TestsResponsePropertyInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TestsResponsePropertyInner {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_RUN_TIME = "run_time";
  @SerializedName(SERIALIZED_NAME_RUN_TIME)
  private Double runTime;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLASSNAME = "classname";
  @SerializedName(SERIALIZED_NAME_CLASSNAME)
  private String classname;

  public TestsResponsePropertyInner() {
  }

  public TestsResponsePropertyInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * The failure message associated with the test.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "The failure message associated with the test.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public TestsResponsePropertyInner source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * The program that generated the test results
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "The program that generated the test results")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public TestsResponsePropertyInner runTime(Double runTime) {
    
    
    
    
    this.runTime = runTime;
    return this;
  }

   /**
   * The time it took to run the test in seconds
   * @return runTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time it took to run the test in seconds")

  public Double getRunTime() {
    return runTime;
  }


  public void setRunTime(Double runTime) {
    
    
    
    this.runTime = runTime;
  }


  public TestsResponsePropertyInner _file(String _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * The file in which the test is defined.
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "The file in which the test is defined.")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    
    
    
    this._file = _file;
  }


  public TestsResponsePropertyInner result(String result) {
    
    
    
    
    this.result = result;
    return this;
  }

   /**
   * Indication of whether the test succeeded.
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "Indication of whether the test succeeded.")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    
    
    
    this.result = result;
  }


  public TestsResponsePropertyInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the test.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "The name of the test.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TestsResponsePropertyInner classname(String classname) {
    
    
    
    
    this.classname = classname;
    return this;
  }

   /**
   * The programmatic location of the test.
   * @return classname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "The programmatic location of the test.")

  public String getClassname() {
    return classname;
  }


  public void setClassname(String classname) {
    
    
    
    this.classname = classname;
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
   * @return the TestsResponsePropertyInner instance itself
   */
  public TestsResponsePropertyInner putAdditionalProperty(String key, Object value) {
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
    TestsResponsePropertyInner testsResponsePropertyInner = (TestsResponsePropertyInner) o;
    return Objects.equals(this.message, testsResponsePropertyInner.message) &&
        Objects.equals(this.source, testsResponsePropertyInner.source) &&
        Objects.equals(this.runTime, testsResponsePropertyInner.runTime) &&
        Objects.equals(this._file, testsResponsePropertyInner._file) &&
        Objects.equals(this.result, testsResponsePropertyInner.result) &&
        Objects.equals(this.name, testsResponsePropertyInner.name) &&
        Objects.equals(this.classname, testsResponsePropertyInner.classname)&&
        Objects.equals(this.additionalProperties, testsResponsePropertyInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, source, runTime, _file, result, name, classname, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsResponsePropertyInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("source");
    openapiFields.add("run_time");
    openapiFields.add("file");
    openapiFields.add("result");
    openapiFields.add("name");
    openapiFields.add("classname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("run_time");
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("classname");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestsResponsePropertyInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestsResponsePropertyInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestsResponsePropertyInner is not found in the empty JSON string", TestsResponsePropertyInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestsResponsePropertyInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if (!jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("classname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestsResponsePropertyInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestsResponsePropertyInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestsResponsePropertyInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestsResponsePropertyInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TestsResponsePropertyInner>() {
           @Override
           public void write(JsonWriter out, TestsResponsePropertyInner value) throws IOException {
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
           public TestsResponsePropertyInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TestsResponsePropertyInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TestsResponsePropertyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestsResponsePropertyInner
  * @throws IOException if the JSON string is invalid with respect to TestsResponsePropertyInner
  */
  public static TestsResponsePropertyInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestsResponsePropertyInner.class);
  }

 /**
  * Convert an instance of TestsResponsePropertyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

