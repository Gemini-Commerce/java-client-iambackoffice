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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.IambackofficeTwoFactorMethod;

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
 * IambackofficeUserTwoFactorConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:31:25.663742959Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IambackofficeUserTwoFactorConfiguration {
  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private List<IambackofficeTwoFactorMethod> methods = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECOVERY_CODES = "recoveryCodes";
  @SerializedName(SERIALIZED_NAME_RECOVERY_CODES)
  private List<String> recoveryCodes = new ArrayList<>();

  public IambackofficeUserTwoFactorConfiguration() {
  }

  public IambackofficeUserTwoFactorConfiguration methods(List<IambackofficeTwoFactorMethod> methods) {
    this.methods = methods;
    return this;
  }

  public IambackofficeUserTwoFactorConfiguration addMethodsItem(IambackofficeTwoFactorMethod methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<>();
    }
    this.methods.add(methodsItem);
    return this;
  }

  /**
   * Get methods
   * @return methods
   */
  @javax.annotation.Nullable
  public List<IambackofficeTwoFactorMethod> getMethods() {
    return methods;
  }

  public void setMethods(List<IambackofficeTwoFactorMethod> methods) {
    this.methods = methods;
  }


  public IambackofficeUserTwoFactorConfiguration recoveryCodes(List<String> recoveryCodes) {
    this.recoveryCodes = recoveryCodes;
    return this;
  }

  public IambackofficeUserTwoFactorConfiguration addRecoveryCodesItem(String recoveryCodesItem) {
    if (this.recoveryCodes == null) {
      this.recoveryCodes = new ArrayList<>();
    }
    this.recoveryCodes.add(recoveryCodesItem);
    return this;
  }

  /**
   * Get recoveryCodes
   * @return recoveryCodes
   */
  @javax.annotation.Nullable
  public List<String> getRecoveryCodes() {
    return recoveryCodes;
  }

  public void setRecoveryCodes(List<String> recoveryCodes) {
    this.recoveryCodes = recoveryCodes;
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
   * @return the IambackofficeUserTwoFactorConfiguration instance itself
   */
  public IambackofficeUserTwoFactorConfiguration putAdditionalProperty(String key, Object value) {
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
    IambackofficeUserTwoFactorConfiguration iambackofficeUserTwoFactorConfiguration = (IambackofficeUserTwoFactorConfiguration) o;
    return Objects.equals(this.methods, iambackofficeUserTwoFactorConfiguration.methods) &&
        Objects.equals(this.recoveryCodes, iambackofficeUserTwoFactorConfiguration.recoveryCodes)&&
        Objects.equals(this.additionalProperties, iambackofficeUserTwoFactorConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methods, recoveryCodes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeUserTwoFactorConfiguration {\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    recoveryCodes: ").append(toIndentedString(recoveryCodes)).append("\n");
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
    openapiFields.add("methods");
    openapiFields.add("recoveryCodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IambackofficeUserTwoFactorConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeUserTwoFactorConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeUserTwoFactorConfiguration is not found in the empty JSON string", IambackofficeUserTwoFactorConfiguration.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("methods") != null && !jsonObj.get("methods").isJsonNull()) {
        JsonArray jsonArraymethods = jsonObj.getAsJsonArray("methods");
        if (jsonArraymethods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("methods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `methods` to be an array in the JSON string but got `%s`", jsonObj.get("methods").toString()));
          }

          // validate the optional field `methods` (array)
          for (int i = 0; i < jsonArraymethods.size(); i++) {
            IambackofficeTwoFactorMethod.validateJsonElement(jsonArraymethods.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recoveryCodes") != null && !jsonObj.get("recoveryCodes").isJsonNull() && !jsonObj.get("recoveryCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recoveryCodes` to be an array in the JSON string but got `%s`", jsonObj.get("recoveryCodes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeUserTwoFactorConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeUserTwoFactorConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeUserTwoFactorConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeUserTwoFactorConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeUserTwoFactorConfiguration>() {
           @Override
           public void write(JsonWriter out, IambackofficeUserTwoFactorConfiguration value) throws IOException {
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
           public IambackofficeUserTwoFactorConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IambackofficeUserTwoFactorConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IambackofficeUserTwoFactorConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IambackofficeUserTwoFactorConfiguration
   * @throws IOException if the JSON string is invalid with respect to IambackofficeUserTwoFactorConfiguration
   */
  public static IambackofficeUserTwoFactorConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeUserTwoFactorConfiguration.class);
  }

  /**
   * Convert an instance of IambackofficeUserTwoFactorConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

