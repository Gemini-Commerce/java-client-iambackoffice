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
import org.openapitools.client.model.IambackofficeMetaData;

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
 * IambackofficeLoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T09:22:13.587269484Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IambackofficeLoginRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_LOGIN_ID = "loginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private IambackofficeMetaData metaData;

  public static final String SERIALIZED_NAME_NO_TOKENS = "noTokens";
  @SerializedName(SERIALIZED_NAME_NO_TOKENS)
  private Boolean noTokens;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TWO_FACTOR_TRUST_ID = "twoFactorTrustId";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_TRUST_ID)
  private String twoFactorTrustId;

  public IambackofficeLoginRequest() {
  }

  public IambackofficeLoginRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public IambackofficeLoginRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
   */
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public IambackofficeLoginRequest loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  /**
   * Get loginId
   * @return loginId
   */
  @javax.annotation.Nullable
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public IambackofficeLoginRequest metaData(IambackofficeMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  @javax.annotation.Nullable
  public IambackofficeMetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(IambackofficeMetaData metaData) {
    this.metaData = metaData;
  }


  public IambackofficeLoginRequest noTokens(Boolean noTokens) {
    this.noTokens = noTokens;
    return this;
  }

  /**
   * Get noTokens
   * @return noTokens
   */
  @javax.annotation.Nullable
  public Boolean getNoTokens() {
    return noTokens;
  }

  public void setNoTokens(Boolean noTokens) {
    this.noTokens = noTokens;
  }


  public IambackofficeLoginRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public IambackofficeLoginRequest twoFactorTrustId(String twoFactorTrustId) {
    this.twoFactorTrustId = twoFactorTrustId;
    return this;
  }

  /**
   * Get twoFactorTrustId
   * @return twoFactorTrustId
   */
  @javax.annotation.Nullable
  public String getTwoFactorTrustId() {
    return twoFactorTrustId;
  }

  public void setTwoFactorTrustId(String twoFactorTrustId) {
    this.twoFactorTrustId = twoFactorTrustId;
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
   * @return the IambackofficeLoginRequest instance itself
   */
  public IambackofficeLoginRequest putAdditionalProperty(String key, Object value) {
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
    IambackofficeLoginRequest iambackofficeLoginRequest = (IambackofficeLoginRequest) o;
    return Objects.equals(this.tenantId, iambackofficeLoginRequest.tenantId) &&
        Objects.equals(this.ipAddress, iambackofficeLoginRequest.ipAddress) &&
        Objects.equals(this.loginId, iambackofficeLoginRequest.loginId) &&
        Objects.equals(this.metaData, iambackofficeLoginRequest.metaData) &&
        Objects.equals(this.noTokens, iambackofficeLoginRequest.noTokens) &&
        Objects.equals(this.password, iambackofficeLoginRequest.password) &&
        Objects.equals(this.twoFactorTrustId, iambackofficeLoginRequest.twoFactorTrustId)&&
        Objects.equals(this.additionalProperties, iambackofficeLoginRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, ipAddress, loginId, metaData, noTokens, password, twoFactorTrustId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeLoginRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    noTokens: ").append(toIndentedString(noTokens)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    twoFactorTrustId: ").append(toIndentedString(twoFactorTrustId)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("ipAddress");
    openapiFields.add("loginId");
    openapiFields.add("metaData");
    openapiFields.add("noTokens");
    openapiFields.add("password");
    openapiFields.add("twoFactorTrustId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IambackofficeLoginRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeLoginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeLoginRequest is not found in the empty JSON string", IambackofficeLoginRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("loginId") != null && !jsonObj.get("loginId").isJsonNull()) && !jsonObj.get("loginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginId").toString()));
      }
      // validate the optional field `metaData`
      if (jsonObj.get("metaData") != null && !jsonObj.get("metaData").isJsonNull()) {
        IambackofficeMetaData.validateJsonElement(jsonObj.get("metaData"));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("twoFactorTrustId") != null && !jsonObj.get("twoFactorTrustId").isJsonNull()) && !jsonObj.get("twoFactorTrustId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twoFactorTrustId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twoFactorTrustId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeLoginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeLoginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeLoginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeLoginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeLoginRequest>() {
           @Override
           public void write(JsonWriter out, IambackofficeLoginRequest value) throws IOException {
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
           public IambackofficeLoginRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IambackofficeLoginRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IambackofficeLoginRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IambackofficeLoginRequest
   * @throws IOException if the JSON string is invalid with respect to IambackofficeLoginRequest
   */
  public static IambackofficeLoginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeLoginRequest.class);
  }

  /**
   * Convert an instance of IambackofficeLoginRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

