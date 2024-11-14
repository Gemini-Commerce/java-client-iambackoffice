# IamBackofficeApi

All URIs are relative to *https://iambackoffice.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iamBackofficeAssignRoles**](IamBackofficeApi.md#iamBackofficeAssignRoles) | **POST** /iambackoffice.IamBackoffice/AssignRoles | AUTHZ |
| [**iamBackofficeAssignUserToGroup**](IamBackofficeApi.md#iamBackofficeAssignUserToGroup) | **POST** /iambackoffice.IamBackoffice/AssignUserToGroup |  |
| [**iamBackofficeCreateGroup**](IamBackofficeApi.md#iamBackofficeCreateGroup) | **POST** /iambackoffice.IamBackoffice/CreateGroup | GROUPS |
| [**iamBackofficeDisableUserMfa**](IamBackofficeApi.md#iamBackofficeDisableUserMfa) | **POST** /iambackoffice.IamBackoffice/DisableUserMfa |  |
| [**iamBackofficeEnableUserMfa**](IamBackofficeApi.md#iamBackofficeEnableUserMfa) | **POST** /iambackoffice.IamBackoffice/EnableUserMfa |  |
| [**iamBackofficeGenerateSecretForQR**](IamBackofficeApi.md#iamBackofficeGenerateSecretForQR) | **POST** /iambackoffice.IamBackoffice/GenerateSecretForQR | MFA |
| [**iamBackofficeGetUser**](IamBackofficeApi.md#iamBackofficeGetUser) | **POST** /iambackoffice.IamBackoffice/GetUser | USER |
| [**iamBackofficeLogin**](IamBackofficeApi.md#iamBackofficeLogin) | **POST** /iambackoffice.IamBackoffice/Login | LOGIN |
| [**iamBackofficeLoginMfa**](IamBackofficeApi.md#iamBackofficeLoginMfa) | **POST** /iambackoffice.IamBackoffice/LoginMfa | LOGIN MFA |
| [**iamBackofficeLogout**](IamBackofficeApi.md#iamBackofficeLogout) | **POST** /iambackoffice.IamBackoffice/Logout |  |
| [**iamBackofficeRegister**](IamBackofficeApi.md#iamBackofficeRegister) | **POST** /iambackoffice.IamBackoffice/Register | REGISTRATION |
| [**iamBackofficeSearchGroups**](IamBackofficeApi.md#iamBackofficeSearchGroups) | **POST** /iambackoffice.IamBackoffice/SearchGroups |  |
| [**iamBackofficeUnassignRoles**](IamBackofficeApi.md#iamBackofficeUnassignRoles) | **POST** /iambackoffice.IamBackoffice/UnassignRoles |  |


<a id="iamBackofficeAssignRoles"></a>
# **iamBackofficeAssignRoles**
> IambackofficeAssignRolesResponse iamBackofficeAssignRoles(body)

AUTHZ

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeAssignRolesRequest**](IambackofficeAssignRolesRequest.md)|  | |

### Return type

[**IambackofficeAssignRolesResponse**](IambackofficeAssignRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeAssignUserToGroup"></a>
# **iamBackofficeAssignUserToGroup**
> Object iamBackofficeAssignUserToGroup(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeAssignUserToGroupRequest body = new IambackofficeAssignUserToGroupRequest(); // IambackofficeAssignUserToGroupRequest | 
    try {
      Object result = apiInstance.iamBackofficeAssignUserToGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeAssignUserToGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeAssignUserToGroupRequest**](IambackofficeAssignUserToGroupRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeCreateGroup"></a>
# **iamBackofficeCreateGroup**
> IambackofficeCreateGroupResponse iamBackofficeCreateGroup(body)

GROUPS

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeCreateGroupRequest body = new IambackofficeCreateGroupRequest(); // IambackofficeCreateGroupRequest | 
    try {
      IambackofficeCreateGroupResponse result = apiInstance.iamBackofficeCreateGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeCreateGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeCreateGroupRequest**](IambackofficeCreateGroupRequest.md)|  | |

### Return type

[**IambackofficeCreateGroupResponse**](IambackofficeCreateGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeDisableUserMfa"></a>
# **iamBackofficeDisableUserMfa**
> IambackofficeUserMfaResponse iamBackofficeDisableUserMfa(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeDisableUserMfaRequest body = new IambackofficeDisableUserMfaRequest(); // IambackofficeDisableUserMfaRequest | 
    try {
      IambackofficeUserMfaResponse result = apiInstance.iamBackofficeDisableUserMfa(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeDisableUserMfa");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeDisableUserMfaRequest**](IambackofficeDisableUserMfaRequest.md)|  | |

### Return type

[**IambackofficeUserMfaResponse**](IambackofficeUserMfaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeEnableUserMfa"></a>
# **iamBackofficeEnableUserMfa**
> IambackofficeUserMfaResponse iamBackofficeEnableUserMfa(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeEnableUserMfaRequest body = new IambackofficeEnableUserMfaRequest(); // IambackofficeEnableUserMfaRequest | 
    try {
      IambackofficeUserMfaResponse result = apiInstance.iamBackofficeEnableUserMfa(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeEnableUserMfa");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeEnableUserMfaRequest**](IambackofficeEnableUserMfaRequest.md)|  | |

### Return type

[**IambackofficeUserMfaResponse**](IambackofficeUserMfaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeGenerateSecretForQR"></a>
# **iamBackofficeGenerateSecretForQR**
> IambackofficeGenerateSecretForQRResponse iamBackofficeGenerateSecretForQR(body)

MFA

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    Object body = null; // Object | 
    try {
      IambackofficeGenerateSecretForQRResponse result = apiInstance.iamBackofficeGenerateSecretForQR(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeGenerateSecretForQR");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**IambackofficeGenerateSecretForQRResponse**](IambackofficeGenerateSecretForQRResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeGetUser"></a>
# **iamBackofficeGetUser**
> IambackofficeGetUserResponse iamBackofficeGetUser(body)

USER

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeGetUserRequest body = new IambackofficeGetUserRequest(); // IambackofficeGetUserRequest | 
    try {
      IambackofficeGetUserResponse result = apiInstance.iamBackofficeGetUser(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeGetUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeGetUserRequest**](IambackofficeGetUserRequest.md)|  | |

### Return type

[**IambackofficeGetUserResponse**](IambackofficeGetUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeLogin"></a>
# **iamBackofficeLogin**
> IambackofficeLoginResponse iamBackofficeLogin(body)

LOGIN

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeLoginRequest body = new IambackofficeLoginRequest(); // IambackofficeLoginRequest | 
    try {
      IambackofficeLoginResponse result = apiInstance.iamBackofficeLogin(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeLogin");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeLoginRequest**](IambackofficeLoginRequest.md)|  | |

### Return type

[**IambackofficeLoginResponse**](IambackofficeLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeLoginMfa"></a>
# **iamBackofficeLoginMfa**
> IambackofficeLoginResponse iamBackofficeLoginMfa(body)

LOGIN MFA

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeLoginMfaRequest body = new IambackofficeLoginMfaRequest(); // IambackofficeLoginMfaRequest | 
    try {
      IambackofficeLoginResponse result = apiInstance.iamBackofficeLoginMfa(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeLoginMfa");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeLoginMfaRequest**](IambackofficeLoginMfaRequest.md)|  | |

### Return type

[**IambackofficeLoginResponse**](IambackofficeLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeLogout"></a>
# **iamBackofficeLogout**
> IambackofficeLogoutResponse iamBackofficeLogout(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeLogoutRequest body = new IambackofficeLogoutRequest(); // IambackofficeLogoutRequest | 
    try {
      IambackofficeLogoutResponse result = apiInstance.iamBackofficeLogout(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeLogout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeLogoutRequest**](IambackofficeLogoutRequest.md)|  | |

### Return type

[**IambackofficeLogoutResponse**](IambackofficeLogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeRegister"></a>
# **iamBackofficeRegister**
> IambackofficeRegistrationResponse iamBackofficeRegister(body)

REGISTRATION

### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeRegistrationRequest body = new IambackofficeRegistrationRequest(); // IambackofficeRegistrationRequest | 
    try {
      IambackofficeRegistrationResponse result = apiInstance.iamBackofficeRegister(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeRegister");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeRegistrationRequest**](IambackofficeRegistrationRequest.md)|  | |

### Return type

[**IambackofficeRegistrationResponse**](IambackofficeRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeSearchGroups"></a>
# **iamBackofficeSearchGroups**
> IambackofficeSearchGroupsResponse iamBackofficeSearchGroups(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeSearchGroupsRequest body = new IambackofficeSearchGroupsRequest(); // IambackofficeSearchGroupsRequest | 
    try {
      IambackofficeSearchGroupsResponse result = apiInstance.iamBackofficeSearchGroups(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeSearchGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeSearchGroupsRequest**](IambackofficeSearchGroupsRequest.md)|  | |

### Return type

[**IambackofficeSearchGroupsResponse**](IambackofficeSearchGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="iamBackofficeUnassignRoles"></a>
# **iamBackofficeUnassignRoles**
> IambackofficeUnassignRolesResponse iamBackofficeUnassignRoles(body)



### Example
```java
// Import classes:
import GeminiCommerce.Iambackoffice.ApiClient;
import GeminiCommerce.Iambackoffice.ApiException;
import GeminiCommerce.Iambackoffice.Configuration;
import GeminiCommerce.Iambackoffice.models.*;
import org.openapitools.client.api.IamBackofficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://iambackoffice.api.gogemini.io");

    IamBackofficeApi apiInstance = new IamBackofficeApi(defaultClient);
    IambackofficeUnassignRolesRequest body = new IambackofficeUnassignRolesRequest(); // IambackofficeUnassignRolesRequest | 
    try {
      IambackofficeUnassignRolesResponse result = apiInstance.iamBackofficeUnassignRoles(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamBackofficeApi#iamBackofficeUnassignRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**IambackofficeUnassignRolesRequest**](IambackofficeUnassignRolesRequest.md)|  | |

### Return type

[**IambackofficeUnassignRolesResponse**](IambackofficeUnassignRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

