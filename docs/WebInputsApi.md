# WebInputsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebInput**](WebInputsApi.md#createWebInput) | **POST** /video/v1/web-inputs | Create a new Web Input
[**deleteWebInput**](WebInputsApi.md#deleteWebInput) | **DELETE** /video/v1/web-inputs/{WEB_INPUT_ID} | Delete a Web Input
[**getWebInput**](WebInputsApi.md#getWebInput) | **GET** /video/v1/web-inputs/{WEB_INPUT_ID} | Retrieve a Web Input
[**launchWebInput**](WebInputsApi.md#launchWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/launch | Launch a Web Input
[**listWebInputs**](WebInputsApi.md#listWebInputs) | **GET** /video/v1/web-inputs | List Web Inputs
[**reloadWebInput**](WebInputsApi.md#reloadWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/reload | Reload a Web Input
[**shutdownWebInput**](WebInputsApi.md#shutdownWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/shutdown | Shut down a Web Input
[**updateWebInputUrl**](WebInputsApi.md#updateWebInputUrl) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/url | Update Web Input URL


<a name="createWebInput"></a>
# **createWebInput**
> WebInputResponse createWebInput(createWebInputRequest).execute();

Create a new Web Input

Create a new Web Input

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    CreateWebInputRequest createWebInputRequest = {"url":"https://example.com/hello.html","live_stream_id":"ZEBrNTpHC02iUah025KM3te6ylM7W4S4silsrFtUkn3Ag"}; // CreateWebInputRequest | 
    try {
      WebInputResponse result = apiInstance.createWebInput(createWebInputRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#createWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebInputRequest** | [**CreateWebInputRequest**](CreateWebInputRequest.md)|  |

### Return type

[**WebInputResponse**](WebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Web Input Created |  -  |

<a name="deleteWebInput"></a>
# **deleteWebInput**
> deleteWebInput(WEB_INPUT_ID).execute();

Delete a Web Input

Deletes a Web Input and all its data

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    try {
      apiInstance.deleteWebInput(WEB_INPUT_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#deleteWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |

### Return type

null (empty response body)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

<a name="getWebInput"></a>
# **getWebInput**
> WebInputResponse getWebInput(WEB_INPUT_ID).execute();

Retrieve a Web Input

Retrieve a single Web Input&#39;s info

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    try {
      WebInputResponse result = apiInstance.getWebInput(WEB_INPUT_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#getWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |

### Return type

[**WebInputResponse**](WebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="launchWebInput"></a>
# **launchWebInput**
> LaunchWebInputResponse launchWebInput(WEB_INPUT_ID).execute();

Launch a Web Input

Launches the browsers instance, loads the URL specified, and then starts streaming to the specified Live Stream.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    try {
      LaunchWebInputResponse result = apiInstance.launchWebInput(WEB_INPUT_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#launchWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |

### Return type

[**LaunchWebInputResponse**](LaunchWebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listWebInputs"></a>
# **listWebInputs**
> ListWebInputsResponse listWebInputs().limit(limit).page(page).execute();

List Web Inputs

List Web Inputs

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    try {
      ListWebInputsResponse result = apiInstance.listWebInputs()
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#listWebInputs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]

### Return type

[**ListWebInputsResponse**](ListWebInputsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="reloadWebInput"></a>
# **reloadWebInput**
> ReloadWebInputResponse reloadWebInput(WEB_INPUT_ID).execute();

Reload a Web Input

Reloads the page that a Web Input is displaying.  Note: Using this when the Web Input is streaming will display the page reloading. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    try {
      ReloadWebInputResponse result = apiInstance.reloadWebInput(WEB_INPUT_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#reloadWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |

### Return type

[**ReloadWebInputResponse**](ReloadWebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="shutdownWebInput"></a>
# **shutdownWebInput**
> ShutdownWebInputResponse shutdownWebInput(WEB_INPUT_ID).execute();

Shut down a Web Input

Ends streaming to the specified Live Stream, and then shuts down the Web Input browser instance.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    try {
      ShutdownWebInputResponse result = apiInstance.shutdownWebInput(WEB_INPUT_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#shutdownWebInput");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |

### Return type

[**ShutdownWebInputResponse**](ShutdownWebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateWebInputUrl"></a>
# **updateWebInputUrl**
> WebInputResponse updateWebInputUrl(WEB_INPUT_ID, updateWebInputUrlRequest).execute();

Update Web Input URL

Changes the URL that a Web Input loads when it launches.  Note: This can only be called when the Web Input is idle. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.WebInputsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    WebInputsApi apiInstance = new WebInputsApi(defaultClient);
    String WEB_INPUT_ID = "abcd1234"; // String | The Web Input ID
    UpdateWebInputUrlRequest updateWebInputUrlRequest = {"url":"https://example.com/hello-there.html"}; // UpdateWebInputUrlRequest | 
    try {
      WebInputResponse result = apiInstance.updateWebInputUrl(WEB_INPUT_ID, updateWebInputUrlRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebInputsApi#updateWebInputUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **WEB_INPUT_ID** | **String**| The Web Input ID |
 **updateWebInputUrlRequest** | [**UpdateWebInputUrlRequest**](UpdateWebInputUrlRequest.md)|  |

### Return type

[**WebInputResponse**](WebInputResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

