/*
 * IamBackoffice Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Iambackoffice.JSON;

/**
 * IambackofficeAuthenticatorConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:41:08.552942201Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IambackofficeAuthenticatorConfiguration {
  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private String algorithm;

  public static final String SERIALIZED_NAME_CODE_LENGTH = "codeLength";
  @SerializedName(SERIALIZED_NAME_CODE_LENGTH)
  private Integer codeLength;

  public static final String SERIALIZED_NAME_TIME_STEP = "timeStep";
  @SerializedName(SERIALIZED_NAME_TIME_STEP)
  private Integer timeStep;

  public IambackofficeAuthenticatorConfiguration() {
  }

  public IambackofficeAuthenticatorConfiguration algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Get algorithm
   * @return algorithm
   */
  @javax.annotation.Nullable
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  public IambackofficeAuthenticatorConfiguration codeLength(Integer codeLength) {
    this.codeLength = codeLength;
    return this;
  }

  /**
   * Get codeLength
   * @return codeLength
   */
  @javax.annotation.Nullable
  public Integer getCodeLength() {
    return codeLength;
  }

  public void setCodeLength(Integer codeLength) {
    this.codeLength = codeLength;
  }


  public IambackofficeAuthenticatorConfiguration timeStep(Integer timeStep) {
    this.timeStep = timeStep;
    return this;
  }

  /**
   * Get timeStep
   * @return timeStep
   */
  @javax.annotation.Nullable
  public Integer getTimeStep() {
    return timeStep;
  }

  public void setTimeStep(Integer timeStep) {
    this.timeStep = timeStep;
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
   * @return the IambackofficeAuthenticatorConfiguration instance itself
   */
  public IambackofficeAuthenticatorConfiguration putAdditionalProperty(String key, Object value) {
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
    IambackofficeAuthenticatorConfiguration iambackofficeAuthenticatorConfiguration = (IambackofficeAuthenticatorConfiguration) o;
    return Objects.equals(this.algorithm, iambackofficeAuthenticatorConfiguration.algorithm) &&
        Objects.equals(this.codeLength, iambackofficeAuthenticatorConfiguration.codeLength) &&
        Objects.equals(this.timeStep, iambackofficeAuthenticatorConfiguration.timeStep)&&
        Objects.equals(this.additionalProperties, iambackofficeAuthenticatorConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, codeLength, timeStep, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeAuthenticatorConfiguration {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    codeLength: ").append(toIndentedString(codeLength)).append("\n");
    sb.append("    timeStep: ").append(toIndentedString(timeStep)).append("\n");
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
    openapiFields.add("algorithm");
    openapiFields.add("codeLength");
    openapiFields.add("timeStep");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IambackofficeAuthenticatorConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeAuthenticatorConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeAuthenticatorConfiguration is not found in the empty JSON string", IambackofficeAuthenticatorConfiguration.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("algorithm") != null && !jsonObj.get("algorithm").isJsonNull()) && !jsonObj.get("algorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `algorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("algorithm").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeAuthenticatorConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeAuthenticatorConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeAuthenticatorConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeAuthenticatorConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeAuthenticatorConfiguration>() {
           @Override
           public void write(JsonWriter out, IambackofficeAuthenticatorConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IambackofficeAuthenticatorConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IambackofficeAuthenticatorConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IambackofficeAuthenticatorConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IambackofficeAuthenticatorConfiguration
   * @throws IOException if the JSON string is invalid with respect to IambackofficeAuthenticatorConfiguration
   */
  public static IambackofficeAuthenticatorConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeAuthenticatorConfiguration.class);
  }

  /**
   * Convert an instance of IambackofficeAuthenticatorConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

