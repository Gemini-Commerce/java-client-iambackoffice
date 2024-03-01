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
import org.openapitools.client.model.IambackofficeUser;
import org.openapitools.client.model.IambackofficeUserRegistration;
import org.openapitools.client.model.ProtobufAny;

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
 * IambackofficeRegistrationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:49:46.493097480Z[Etc/UTC]")
public class IambackofficeRegistrationResponse {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private ProtobufAny tokens;

  public static final String SERIALIZED_NAME_REGISTRATION = "registration";
  @SerializedName(SERIALIZED_NAME_REGISTRATION)
  private IambackofficeUserRegistration registration;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IambackofficeUser user;

  public IambackofficeRegistrationResponse() {
  }

  public IambackofficeRegistrationResponse tokens(ProtobufAny tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @javax.annotation.Nullable
  public ProtobufAny getTokens() {
    return tokens;
  }

  public void setTokens(ProtobufAny tokens) {
    this.tokens = tokens;
  }


  public IambackofficeRegistrationResponse registration(IambackofficeUserRegistration registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @javax.annotation.Nullable
  public IambackofficeUserRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(IambackofficeUserRegistration registration) {
    this.registration = registration;
  }


  public IambackofficeRegistrationResponse user(IambackofficeUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public IambackofficeUser getUser() {
    return user;
  }

  public void setUser(IambackofficeUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IambackofficeRegistrationResponse iambackofficeRegistrationResponse = (IambackofficeRegistrationResponse) o;
    return Objects.equals(this.tokens, iambackofficeRegistrationResponse.tokens) &&
        Objects.equals(this.registration, iambackofficeRegistrationResponse.registration) &&
        Objects.equals(this.user, iambackofficeRegistrationResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, registration, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeRegistrationResponse {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("tokens");
    openapiFields.add("registration");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IambackofficeRegistrationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeRegistrationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeRegistrationResponse is not found in the empty JSON string", IambackofficeRegistrationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IambackofficeRegistrationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IambackofficeRegistrationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `registration`
      if (jsonObj.get("registration") != null && !jsonObj.get("registration").isJsonNull()) {
        IambackofficeUserRegistration.validateJsonElement(jsonObj.get("registration"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        IambackofficeUser.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeRegistrationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeRegistrationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeRegistrationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeRegistrationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeRegistrationResponse>() {
           @Override
           public void write(JsonWriter out, IambackofficeRegistrationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IambackofficeRegistrationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IambackofficeRegistrationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IambackofficeRegistrationResponse
  * @throws IOException if the JSON string is invalid with respect to IambackofficeRegistrationResponse
  */
  public static IambackofficeRegistrationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeRegistrationResponse.class);
  }

 /**
  * Convert an instance of IambackofficeRegistrationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

