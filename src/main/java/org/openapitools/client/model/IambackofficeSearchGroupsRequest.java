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
import org.openapitools.client.model.SearchGroupsRequestFilters;

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
 * IambackofficeSearchGroupsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:49:46.493097480Z[Etc/UTC]")
public class IambackofficeSearchGroupsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private SearchGroupsRequestFilters filters;

  public static final String SERIALIZED_NAME_FILTERS_MASK = "filtersMask";
  @SerializedName(SERIALIZED_NAME_FILTERS_MASK)
  private String filtersMask;

  public IambackofficeSearchGroupsRequest() {
  }

  public IambackofficeSearchGroupsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public IambackofficeSearchGroupsRequest filters(SearchGroupsRequestFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public SearchGroupsRequestFilters getFilters() {
    return filters;
  }

  public void setFilters(SearchGroupsRequestFilters filters) {
    this.filters = filters;
  }


  public IambackofficeSearchGroupsRequest filtersMask(String filtersMask) {
    this.filtersMask = filtersMask;
    return this;
  }

   /**
   * Get filtersMask
   * @return filtersMask
  **/
  @javax.annotation.Nullable
  public String getFiltersMask() {
    return filtersMask;
  }

  public void setFiltersMask(String filtersMask) {
    this.filtersMask = filtersMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IambackofficeSearchGroupsRequest iambackofficeSearchGroupsRequest = (IambackofficeSearchGroupsRequest) o;
    return Objects.equals(this.tenantId, iambackofficeSearchGroupsRequest.tenantId) &&
        Objects.equals(this.filters, iambackofficeSearchGroupsRequest.filters) &&
        Objects.equals(this.filtersMask, iambackofficeSearchGroupsRequest.filtersMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, filters, filtersMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeSearchGroupsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    filtersMask: ").append(toIndentedString(filtersMask)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("filtersMask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IambackofficeSearchGroupsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeSearchGroupsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeSearchGroupsRequest is not found in the empty JSON string", IambackofficeSearchGroupsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IambackofficeSearchGroupsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IambackofficeSearchGroupsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        SearchGroupsRequestFilters.validateJsonElement(jsonObj.get("filters"));
      }
      if ((jsonObj.get("filtersMask") != null && !jsonObj.get("filtersMask").isJsonNull()) && !jsonObj.get("filtersMask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filtersMask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filtersMask").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeSearchGroupsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeSearchGroupsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeSearchGroupsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeSearchGroupsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeSearchGroupsRequest>() {
           @Override
           public void write(JsonWriter out, IambackofficeSearchGroupsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IambackofficeSearchGroupsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IambackofficeSearchGroupsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IambackofficeSearchGroupsRequest
  * @throws IOException if the JSON string is invalid with respect to IambackofficeSearchGroupsRequest
  */
  public static IambackofficeSearchGroupsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeSearchGroupsRequest.class);
  }

 /**
  * Convert an instance of IambackofficeSearchGroupsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

