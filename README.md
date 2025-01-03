# openapi-java-client

IamBackoffice Service
- API version: v1
  - Build date: 2024-11-18T16:33:45.290484231Z[Etc/UTC]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeAssignRolesRequest body = new IambackofficeAssignRolesRequest(); // IambackofficeAssignRolesRequest | 
    try {
      IambackofficeAssignRolesResponse result = apiInstance.iamBackofficeAssignRoles(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeAssignRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://iambackoffice.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IamBackofficeApi* | [**iamBackofficeAssignRoles**](docs/IamBackofficeApi.md#iamBackofficeAssignRoles) | **POST** /iambackoffice.IamBackoffice/AssignRoles | AUTHZ
*IamBackofficeApi* | [**iamBackofficeAssignUserToGroup**](docs/IamBackofficeApi.md#iamBackofficeAssignUserToGroup) | **POST** /iambackoffice.IamBackoffice/AssignUserToGroup | 
*IamBackofficeApi* | [**iamBackofficeCreateGroup**](docs/IamBackofficeApi.md#iamBackofficeCreateGroup) | **POST** /iambackoffice.IamBackoffice/CreateGroup | GROUPS
*IamBackofficeApi* | [**iamBackofficeDisableUserMfa**](docs/IamBackofficeApi.md#iamBackofficeDisableUserMfa) | **POST** /iambackoffice.IamBackoffice/DisableUserMfa | 
*IamBackofficeApi* | [**iamBackofficeEnableUserMfa**](docs/IamBackofficeApi.md#iamBackofficeEnableUserMfa) | **POST** /iambackoffice.IamBackoffice/EnableUserMfa | 
*IamBackofficeApi* | [**iamBackofficeGenerateSecretForQR**](docs/IamBackofficeApi.md#iamBackofficeGenerateSecretForQR) | **POST** /iambackoffice.IamBackoffice/GenerateSecretForQR | MFA
*IamBackofficeApi* | [**iamBackofficeGetUser**](docs/IamBackofficeApi.md#iamBackofficeGetUser) | **POST** /iambackoffice.IamBackoffice/GetUser | USER
*IamBackofficeApi* | [**iamBackofficeLogin**](docs/IamBackofficeApi.md#iamBackofficeLogin) | **POST** /iambackoffice.IamBackoffice/Login | LOGIN
*IamBackofficeApi* | [**iamBackofficeLoginMfa**](docs/IamBackofficeApi.md#iamBackofficeLoginMfa) | **POST** /iambackoffice.IamBackoffice/LoginMfa | LOGIN MFA
*IamBackofficeApi* | [**iamBackofficeLogout**](docs/IamBackofficeApi.md#iamBackofficeLogout) | **POST** /iambackoffice.IamBackoffice/Logout | 
*IamBackofficeApi* | [**iamBackofficeRegister**](docs/IamBackofficeApi.md#iamBackofficeRegister) | **POST** /iambackoffice.IamBackoffice/Register | REGISTRATION
*IamBackofficeApi* | [**iamBackofficeSearchGroups**](docs/IamBackofficeApi.md#iamBackofficeSearchGroups) | **POST** /iambackoffice.IamBackoffice/SearchGroups | 
*IamBackofficeApi* | [**iamBackofficeUnassignRoles**](docs/IamBackofficeApi.md#iamBackofficeUnassignRoles) | **POST** /iambackoffice.IamBackoffice/UnassignRoles | 


## Documentation for Models

 - [IambackofficeAssignRolesRequest](docs/IambackofficeAssignRolesRequest.md)
 - [IambackofficeAssignRolesResponse](docs/IambackofficeAssignRolesResponse.md)
 - [IambackofficeAssignUserToGroupRequest](docs/IambackofficeAssignUserToGroupRequest.md)
 - [IambackofficeAuthenticatorConfiguration](docs/IambackofficeAuthenticatorConfiguration.md)
 - [IambackofficeCreateGroupRequest](docs/IambackofficeCreateGroupRequest.md)
 - [IambackofficeCreateGroupResponse](docs/IambackofficeCreateGroupResponse.md)
 - [IambackofficeDevice](docs/IambackofficeDevice.md)
 - [IambackofficeDisableUserMfaRequest](docs/IambackofficeDisableUserMfaRequest.md)
 - [IambackofficeEnableUserMfaRequest](docs/IambackofficeEnableUserMfaRequest.md)
 - [IambackofficeGenerateSecretForQRResponse](docs/IambackofficeGenerateSecretForQRResponse.md)
 - [IambackofficeGetUserRequest](docs/IambackofficeGetUserRequest.md)
 - [IambackofficeGetUserResponse](docs/IambackofficeGetUserResponse.md)
 - [IambackofficeGroup](docs/IambackofficeGroup.md)
 - [IambackofficeLoginMfaRequest](docs/IambackofficeLoginMfaRequest.md)
 - [IambackofficeLoginRequest](docs/IambackofficeLoginRequest.md)
 - [IambackofficeLoginResponse](docs/IambackofficeLoginResponse.md)
 - [IambackofficeLogoutRequest](docs/IambackofficeLogoutRequest.md)
 - [IambackofficeLogoutResponse](docs/IambackofficeLogoutResponse.md)
 - [IambackofficeMetaData](docs/IambackofficeMetaData.md)
 - [IambackofficeRegistrationRequest](docs/IambackofficeRegistrationRequest.md)
 - [IambackofficeRegistrationResponse](docs/IambackofficeRegistrationResponse.md)
 - [IambackofficeSearchGroupsRequest](docs/IambackofficeSearchGroupsRequest.md)
 - [IambackofficeSearchGroupsResponse](docs/IambackofficeSearchGroupsResponse.md)
 - [IambackofficeTwoFactorMethod](docs/IambackofficeTwoFactorMethod.md)
 - [IambackofficeUnassignRolesRequest](docs/IambackofficeUnassignRolesRequest.md)
 - [IambackofficeUnassignRolesResponse](docs/IambackofficeUnassignRolesResponse.md)
 - [IambackofficeUser](docs/IambackofficeUser.md)
 - [IambackofficeUserMfaResponse](docs/IambackofficeUserMfaResponse.md)
 - [IambackofficeUserRegistration](docs/IambackofficeUserRegistration.md)
 - [IambackofficeUserTwoFactorConfiguration](docs/IambackofficeUserTwoFactorConfiguration.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [SearchGroupsRequestFilters](docs/SearchGroupsRequestFilters.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

