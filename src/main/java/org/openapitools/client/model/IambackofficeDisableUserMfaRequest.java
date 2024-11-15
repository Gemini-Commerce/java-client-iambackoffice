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
 * IambackofficeDisableUserMfaRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:19:02.543860426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IambackofficeDisableUserMfaRequest {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_METHOD_ID = "methodId";
  @SerializedName(SERIALIZED_NAME_METHOD_ID)
  private String methodId;

  public IambackofficeDisableUserMfaRequest() {
  }

  public IambackofficeDisableUserMfaRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public IambackofficeDisableUserMfaRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public IambackofficeDisableUserMfaRequest methodId(String methodId) {
    this.methodId = methodId;
    return this;
  }

  /**
   * Get methodId
   * @return methodId
   */
  @javax.annotation.Nullable
  public String getMethodId() {
    return methodId;
  }

  public void setMethodId(String methodId) {
    this.methodId = methodId;
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
   * @return the IambackofficeDisableUserMfaRequest instance itself
   */
  public IambackofficeDisableUserMfaRequest putAdditionalProperty(String key, Object value) {
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
    IambackofficeDisableUserMfaRequest iambackofficeDisableUserMfaRequest = (IambackofficeDisableUserMfaRequest) o;
    return Objects.equals(this.userId, iambackofficeDisableUserMfaRequest.userId) &&
        Objects.equals(this.code, iambackofficeDisableUserMfaRequest.code) &&
        Objects.equals(this.methodId, iambackofficeDisableUserMfaRequest.methodId)&&
        Objects.equals(this.additionalProperties, iambackofficeDisableUserMfaRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, code, methodId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeDisableUserMfaRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("code");
    openapiFields.add("methodId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IambackofficeDisableUserMfaRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeDisableUserMfaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeDisableUserMfaRequest is not found in the empty JSON string", IambackofficeDisableUserMfaRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("methodId") != null && !jsonObj.get("methodId").isJsonNull()) && !jsonObj.get("methodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `methodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("methodId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeDisableUserMfaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeDisableUserMfaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeDisableUserMfaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeDisableUserMfaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeDisableUserMfaRequest>() {
           @Override
           public void write(JsonWriter out, IambackofficeDisableUserMfaRequest value) throws IOException {
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
           public IambackofficeDisableUserMfaRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IambackofficeDisableUserMfaRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IambackofficeDisableUserMfaRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IambackofficeDisableUserMfaRequest
   * @throws IOException if the JSON string is invalid with respect to IambackofficeDisableUserMfaRequest
   */
  public static IambackofficeDisableUserMfaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeDisableUserMfaRequest.class);
  }

  /**
   * Convert an instance of IambackofficeDisableUserMfaRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

