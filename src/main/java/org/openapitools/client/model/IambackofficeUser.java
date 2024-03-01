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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.IambackofficeUserRegistration;
import org.openapitools.client.model.IambackofficeUserTwoFactorConfiguration;

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
 * IambackofficeUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T08:49:46.493097480Z[Etc/UTC]")
public class IambackofficeUser {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, String> data = new HashMap<>();

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_INSERT_INSTANT = "insertInstant";
  @SerializedName(SERIALIZED_NAME_INSERT_INSTANT)
  private String insertInstant;

  public static final String SERIALIZED_NAME_LAST_LOGIN_INSTANT = "lastLoginInstant";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_INSTANT)
  private String lastLoginInstant;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_LAST_UPDATE_INSTANT = "lastUpdateInstant";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_INSTANT)
  private String lastUpdateInstant;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSWORD_CHANGE_REQUIRED = "passwordChangeRequired";
  @SerializedName(SERIALIZED_NAME_PASSWORD_CHANGE_REQUIRED)
  private Boolean passwordChangeRequired;

  public static final String SERIALIZED_NAME_PASSWORD_LAST_UPDATE_INSTANT = "passwordLastUpdateInstant";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LAST_UPDATE_INSTANT)
  private String passwordLastUpdateInstant;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGES = "preferredLanguages";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGES)
  private List<String> preferredLanguages;

  public static final String SERIALIZED_NAME_REGISTRATIONS = "registrations";
  @SerializedName(SERIALIZED_NAME_REGISTRATIONS)
  private List<IambackofficeUserRegistration> registrations;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TWO_FACTOR = "twoFactor";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR)
  private IambackofficeUserTwoFactorConfiguration twoFactor;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public IambackofficeUser() {
  }

  public IambackofficeUser active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public IambackofficeUser birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @javax.annotation.Nullable
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }


  public IambackofficeUser data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public IambackofficeUser putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }


  public IambackofficeUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public IambackofficeUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IambackofficeUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public IambackofficeUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public IambackofficeUser imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public IambackofficeUser insertInstant(String insertInstant) {
    this.insertInstant = insertInstant;
    return this;
  }

   /**
   * Get insertInstant
   * @return insertInstant
  **/
  @javax.annotation.Nullable
  public String getInsertInstant() {
    return insertInstant;
  }

  public void setInsertInstant(String insertInstant) {
    this.insertInstant = insertInstant;
  }


  public IambackofficeUser lastLoginInstant(String lastLoginInstant) {
    this.lastLoginInstant = lastLoginInstant;
    return this;
  }

   /**
   * Get lastLoginInstant
   * @return lastLoginInstant
  **/
  @javax.annotation.Nullable
  public String getLastLoginInstant() {
    return lastLoginInstant;
  }

  public void setLastLoginInstant(String lastLoginInstant) {
    this.lastLoginInstant = lastLoginInstant;
  }


  public IambackofficeUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IambackofficeUser lastUpdateInstant(String lastUpdateInstant) {
    this.lastUpdateInstant = lastUpdateInstant;
    return this;
  }

   /**
   * Get lastUpdateInstant
   * @return lastUpdateInstant
  **/
  @javax.annotation.Nullable
  public String getLastUpdateInstant() {
    return lastUpdateInstant;
  }

  public void setLastUpdateInstant(String lastUpdateInstant) {
    this.lastUpdateInstant = lastUpdateInstant;
  }


  public IambackofficeUser middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public IambackofficeUser mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public IambackofficeUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public IambackofficeUser passwordChangeRequired(Boolean passwordChangeRequired) {
    this.passwordChangeRequired = passwordChangeRequired;
    return this;
  }

   /**
   * Get passwordChangeRequired
   * @return passwordChangeRequired
  **/
  @javax.annotation.Nullable
  public Boolean getPasswordChangeRequired() {
    return passwordChangeRequired;
  }

  public void setPasswordChangeRequired(Boolean passwordChangeRequired) {
    this.passwordChangeRequired = passwordChangeRequired;
  }


  public IambackofficeUser passwordLastUpdateInstant(String passwordLastUpdateInstant) {
    this.passwordLastUpdateInstant = passwordLastUpdateInstant;
    return this;
  }

   /**
   * Get passwordLastUpdateInstant
   * @return passwordLastUpdateInstant
  **/
  @javax.annotation.Nullable
  public String getPasswordLastUpdateInstant() {
    return passwordLastUpdateInstant;
  }

  public void setPasswordLastUpdateInstant(String passwordLastUpdateInstant) {
    this.passwordLastUpdateInstant = passwordLastUpdateInstant;
  }


  public IambackofficeUser preferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public IambackofficeUser addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Get preferredLanguages
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }

  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public IambackofficeUser registrations(List<IambackofficeUserRegistration> registrations) {
    this.registrations = registrations;
    return this;
  }

  public IambackofficeUser addRegistrationsItem(IambackofficeUserRegistration registrationsItem) {
    if (this.registrations == null) {
      this.registrations = new ArrayList<>();
    }
    this.registrations.add(registrationsItem);
    return this;
  }

   /**
   * Get registrations
   * @return registrations
  **/
  @javax.annotation.Nullable
  public List<IambackofficeUserRegistration> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(List<IambackofficeUserRegistration> registrations) {
    this.registrations = registrations;
  }


  public IambackofficeUser timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public IambackofficeUser twoFactor(IambackofficeUserTwoFactorConfiguration twoFactor) {
    this.twoFactor = twoFactor;
    return this;
  }

   /**
   * Get twoFactor
   * @return twoFactor
  **/
  @javax.annotation.Nullable
  public IambackofficeUserTwoFactorConfiguration getTwoFactor() {
    return twoFactor;
  }

  public void setTwoFactor(IambackofficeUserTwoFactorConfiguration twoFactor) {
    this.twoFactor = twoFactor;
  }


  public IambackofficeUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public IambackofficeUser verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IambackofficeUser iambackofficeUser = (IambackofficeUser) o;
    return Objects.equals(this.active, iambackofficeUser.active) &&
        Objects.equals(this.birthDate, iambackofficeUser.birthDate) &&
        Objects.equals(this.data, iambackofficeUser.data) &&
        Objects.equals(this.email, iambackofficeUser.email) &&
        Objects.equals(this.firstName, iambackofficeUser.firstName) &&
        Objects.equals(this.fullName, iambackofficeUser.fullName) &&
        Objects.equals(this.id, iambackofficeUser.id) &&
        Objects.equals(this.imageUrl, iambackofficeUser.imageUrl) &&
        Objects.equals(this.insertInstant, iambackofficeUser.insertInstant) &&
        Objects.equals(this.lastLoginInstant, iambackofficeUser.lastLoginInstant) &&
        Objects.equals(this.lastName, iambackofficeUser.lastName) &&
        Objects.equals(this.lastUpdateInstant, iambackofficeUser.lastUpdateInstant) &&
        Objects.equals(this.middleName, iambackofficeUser.middleName) &&
        Objects.equals(this.mobilePhone, iambackofficeUser.mobilePhone) &&
        Objects.equals(this.password, iambackofficeUser.password) &&
        Objects.equals(this.passwordChangeRequired, iambackofficeUser.passwordChangeRequired) &&
        Objects.equals(this.passwordLastUpdateInstant, iambackofficeUser.passwordLastUpdateInstant) &&
        Objects.equals(this.preferredLanguages, iambackofficeUser.preferredLanguages) &&
        Objects.equals(this.registrations, iambackofficeUser.registrations) &&
        Objects.equals(this.timezone, iambackofficeUser.timezone) &&
        Objects.equals(this.twoFactor, iambackofficeUser.twoFactor) &&
        Objects.equals(this.username, iambackofficeUser.username) &&
        Objects.equals(this.verified, iambackofficeUser.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, birthDate, data, email, firstName, fullName, id, imageUrl, insertInstant, lastLoginInstant, lastName, lastUpdateInstant, middleName, mobilePhone, password, passwordChangeRequired, passwordLastUpdateInstant, preferredLanguages, registrations, timezone, twoFactor, username, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IambackofficeUser {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    insertInstant: ").append(toIndentedString(insertInstant)).append("\n");
    sb.append("    lastLoginInstant: ").append(toIndentedString(lastLoginInstant)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastUpdateInstant: ").append(toIndentedString(lastUpdateInstant)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordChangeRequired: ").append(toIndentedString(passwordChangeRequired)).append("\n");
    sb.append("    passwordLastUpdateInstant: ").append(toIndentedString(passwordLastUpdateInstant)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    twoFactor: ").append(toIndentedString(twoFactor)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("birthDate");
    openapiFields.add("data");
    openapiFields.add("email");
    openapiFields.add("firstName");
    openapiFields.add("fullName");
    openapiFields.add("id");
    openapiFields.add("imageUrl");
    openapiFields.add("insertInstant");
    openapiFields.add("lastLoginInstant");
    openapiFields.add("lastName");
    openapiFields.add("lastUpdateInstant");
    openapiFields.add("middleName");
    openapiFields.add("mobilePhone");
    openapiFields.add("password");
    openapiFields.add("passwordChangeRequired");
    openapiFields.add("passwordLastUpdateInstant");
    openapiFields.add("preferredLanguages");
    openapiFields.add("registrations");
    openapiFields.add("timezone");
    openapiFields.add("twoFactor");
    openapiFields.add("username");
    openapiFields.add("verified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IambackofficeUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IambackofficeUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IambackofficeUser is not found in the empty JSON string", IambackofficeUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IambackofficeUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IambackofficeUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("birthDate") != null && !jsonObj.get("birthDate").isJsonNull()) && !jsonObj.get("birthDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthDate").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("insertInstant") != null && !jsonObj.get("insertInstant").isJsonNull()) && !jsonObj.get("insertInstant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insertInstant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insertInstant").toString()));
      }
      if ((jsonObj.get("lastLoginInstant") != null && !jsonObj.get("lastLoginInstant").isJsonNull()) && !jsonObj.get("lastLoginInstant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastLoginInstant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastLoginInstant").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("lastUpdateInstant") != null && !jsonObj.get("lastUpdateInstant").isJsonNull()) && !jsonObj.get("lastUpdateInstant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdateInstant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdateInstant").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("mobilePhone") != null && !jsonObj.get("mobilePhone").isJsonNull()) && !jsonObj.get("mobilePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhone").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("passwordLastUpdateInstant") != null && !jsonObj.get("passwordLastUpdateInstant").isJsonNull()) && !jsonObj.get("passwordLastUpdateInstant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordLastUpdateInstant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordLastUpdateInstant").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("preferredLanguages") != null && !jsonObj.get("preferredLanguages").isJsonNull() && !jsonObj.get("preferredLanguages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredLanguages` to be an array in the JSON string but got `%s`", jsonObj.get("preferredLanguages").toString()));
      }
      if (jsonObj.get("registrations") != null && !jsonObj.get("registrations").isJsonNull()) {
        JsonArray jsonArrayregistrations = jsonObj.getAsJsonArray("registrations");
        if (jsonArrayregistrations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("registrations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `registrations` to be an array in the JSON string but got `%s`", jsonObj.get("registrations").toString()));
          }

          // validate the optional field `registrations` (array)
          for (int i = 0; i < jsonArrayregistrations.size(); i++) {
            IambackofficeUserRegistration.validateJsonElement(jsonArrayregistrations.get(i));
          };
        }
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // validate the optional field `twoFactor`
      if (jsonObj.get("twoFactor") != null && !jsonObj.get("twoFactor").isJsonNull()) {
        IambackofficeUserTwoFactorConfiguration.validateJsonElement(jsonObj.get("twoFactor"));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IambackofficeUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IambackofficeUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IambackofficeUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IambackofficeUser.class));

       return (TypeAdapter<T>) new TypeAdapter<IambackofficeUser>() {
           @Override
           public void write(JsonWriter out, IambackofficeUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IambackofficeUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IambackofficeUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IambackofficeUser
  * @throws IOException if the JSON string is invalid with respect to IambackofficeUser
  */
  public static IambackofficeUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IambackofficeUser.class);
  }

 /**
  * Convert an instance of IambackofficeUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

