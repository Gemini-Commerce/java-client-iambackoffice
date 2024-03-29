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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Iambackoffice.JSON;

/**
 * IambackofficeUserTwoFactorConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:49:46.493097480Z[Etc/UTC]")
public class IambackofficeUserTwoFactorConfiguration {
  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private List<IambackofficeTwoFactorMethod> methods;

  public static final String SERIALIZED_NAME_RECOVERY_CODES = "recoveryCodes";
  @SerializedName(SERIALIZED_NAME_RECOVERY_CODES)
  private List<String> recoveryCodes;

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
  **/
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
  **/
  @javax.annotation.Nullable
  public List<String> getRecoveryCodes() {
    return recoveryCodes;
  }

  public void setRecoveryCodes(List<String> recoveryCodes) {
    this.recoveryCodes = recoveryCodes;
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
        Objects.equals(this.recoveryCodes, iambackofficeUserTwoFactorConfiguration.recoveryCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methods, recoveryCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeUserTwoFactorConfiguration {\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    recoveryCodes: ").append(toIndentedString(recoveryCodes)).append("\n");
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

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IambackofficeUserTwoFactorConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IambackofficeUserTwoFactorConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public IambackofficeUserTwoFactorConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

