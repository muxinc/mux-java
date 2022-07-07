# SpacesApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpace**](SpacesApi.md#createSpace) | **POST** /video/v1/spaces | Create a space
[**createSpaceBroadcast**](SpacesApi.md#createSpaceBroadcast) | **POST** /video/v1/spaces/{SPACE_ID}/broadcasts | Create a space broadcast
[**deleteSpace**](SpacesApi.md#deleteSpace) | **DELETE** /video/v1/spaces/{SPACE_ID} | Delete a space
[**deleteSpaceBroadcast**](SpacesApi.md#deleteSpaceBroadcast) | **DELETE** /video/v1/spaces/{SPACE_ID}/broadcasts/{BROADCAST_ID} | Delete a space broadcast
[**getSpace**](SpacesApi.md#getSpace) | **GET** /video/v1/spaces/{SPACE_ID} | Retrieve a space
[**getSpaceBroadcast**](SpacesApi.md#getSpaceBroadcast) | **GET** /video/v1/spaces/{SPACE_ID}/broadcasts/{BROADCAST_ID} | Retrieve space broadcast
[**listSpaces**](SpacesApi.md#listSpaces) | **GET** /video/v1/spaces | List spaces
[**startSpaceBroadcast**](SpacesApi.md#startSpaceBroadcast) | **POST** /video/v1/spaces/{SPACE_ID}/broadcasts/{BROADCAST_ID}/start | Start a space broadcast
[**stopSpaceBroadcast**](SpacesApi.md#stopSpaceBroadcast) | **POST** /video/v1/spaces/{SPACE_ID}/broadcasts/{BROADCAST_ID}/stop | Stop a space broadcast


<a name="createSpace"></a>
# **createSpace**
> SpaceResponse createSpace(createSpaceRequest).execute();

Create a space

Create a new space. Spaces are used to build [real-time video applications.](https://mux.com/real-time-video)

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    CreateSpaceRequest createSpaceRequest = {"type":"server"}; // CreateSpaceRequest | 
    try {
      SpaceResponse result = apiInstance.createSpace(createSpaceRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#createSpace");
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
 **createSpaceRequest** | [**CreateSpaceRequest**](CreateSpaceRequest.md)|  |

### Return type

[**SpaceResponse**](SpaceResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Space Created |  -  |

<a name="createSpaceBroadcast"></a>
# **createSpaceBroadcast**
> BroadcastResponse createSpaceBroadcast(SPACE_ID, createBroadcastRequest).execute();

Create a space broadcast

Creates a new broadcast. Broadcasts are used to create composited versions of your space, which can be broadcast to live streams. **Note:** By default only a single broadcast destination can be specified. Contact Mux support if you need more.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    CreateBroadcastRequest createBroadcastRequest = {"live_stream_id":"GQ9025mPqzyjOy3kKQW006qKTqmULW9vFO"}; // CreateBroadcastRequest | 
    try {
      BroadcastResponse result = apiInstance.createSpaceBroadcast(SPACE_ID, createBroadcastRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#createSpaceBroadcast");
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
 **SPACE_ID** | **String**| The space ID. |
 **createBroadcastRequest** | [**CreateBroadcastRequest**](CreateBroadcastRequest.md)|  |

### Return type

[**BroadcastResponse**](BroadcastResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Broadcast Created |  -  |

<a name="deleteSpace"></a>
# **deleteSpace**
> deleteSpace(SPACE_ID).execute();

Delete a space

Deletes a space. Spaces can only be deleted when &#x60;idle&#x60;.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    try {
      apiInstance.deleteSpace(SPACE_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#deleteSpace");
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
 **SPACE_ID** | **String**| The space ID. |

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

<a name="deleteSpaceBroadcast"></a>
# **deleteSpaceBroadcast**
> deleteSpaceBroadcast(SPACE_ID, BROADCAST_ID).execute();

Delete a space broadcast

Deletes a single broadcast of a specific space. Broadcasts can only be deleted when &#x60;idle&#x60;.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    String BROADCAST_ID = "BROADCAST_ID_example"; // String | The broadcast ID.
    try {
      apiInstance.deleteSpaceBroadcast(SPACE_ID, BROADCAST_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#deleteSpaceBroadcast");
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
 **SPACE_ID** | **String**| The space ID. |
 **BROADCAST_ID** | **String**| The broadcast ID. |

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

<a name="getSpace"></a>
# **getSpace**
> SpaceResponse getSpace(SPACE_ID).execute();

Retrieve a space

Retrieves the details of a space that has previously been created. Supply the unique space ID that was returned from your create space request, and Mux will return the information about the corresponding space. The same information is returned when creating a space.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    try {
      SpaceResponse result = apiInstance.getSpace(SPACE_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getSpace");
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
 **SPACE_ID** | **String**| The space ID. |

### Return type

[**SpaceResponse**](SpaceResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSpaceBroadcast"></a>
# **getSpaceBroadcast**
> BroadcastResponse getSpaceBroadcast(SPACE_ID, BROADCAST_ID).execute();

Retrieve space broadcast

Retrieves the details of a broadcast of a specific space.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    String BROADCAST_ID = "BROADCAST_ID_example"; // String | The broadcast ID.
    try {
      BroadcastResponse result = apiInstance.getSpaceBroadcast(SPACE_ID, BROADCAST_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getSpaceBroadcast");
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
 **SPACE_ID** | **String**| The space ID. |
 **BROADCAST_ID** | **String**| The broadcast ID. |

### Return type

[**BroadcastResponse**](BroadcastResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listSpaces"></a>
# **listSpaces**
> ListSpacesResponse listSpaces().limit(limit).page(page).execute();

List spaces

List all spaces in the current enviroment.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    try {
      ListSpacesResponse result = apiInstance.listSpaces()
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#listSpaces");
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

[**ListSpacesResponse**](ListSpacesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="startSpaceBroadcast"></a>
# **startSpaceBroadcast**
> StartSpaceBroadcastResponse startSpaceBroadcast(SPACE_ID, BROADCAST_ID).execute();

Start a space broadcast

Starts broadcasting a space to the associated destination. Broadcasts can only be started when the space is &#x60;active&#x60; (when there are participants connected).

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    String BROADCAST_ID = "BROADCAST_ID_example"; // String | The broadcast ID.
    try {
      StartSpaceBroadcastResponse result = apiInstance.startSpaceBroadcast(SPACE_ID, BROADCAST_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#startSpaceBroadcast");
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
 **SPACE_ID** | **String**| The space ID. |
 **BROADCAST_ID** | **String**| The broadcast ID. |

### Return type

[**StartSpaceBroadcastResponse**](StartSpaceBroadcastResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="stopSpaceBroadcast"></a>
# **stopSpaceBroadcast**
> StopSpaceBroadcastResponse stopSpaceBroadcast(SPACE_ID, BROADCAST_ID).execute();

Stop a space broadcast

Stops broadcasting a space, causing the destination live stream to become idle. This API also automatically calls &#x60;complete&#x60; on the destination live stream. Broadcasts are also automatically stopped when a space becomes idle.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String SPACE_ID = "SPACE_ID_example"; // String | The space ID.
    String BROADCAST_ID = "BROADCAST_ID_example"; // String | The broadcast ID.
    try {
      StopSpaceBroadcastResponse result = apiInstance.stopSpaceBroadcast(SPACE_ID, BROADCAST_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#stopSpaceBroadcast");
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
 **SPACE_ID** | **String**| The space ID. |
 **BROADCAST_ID** | **String**| The broadcast ID. |

### Return type

[**StopSpaceBroadcastResponse**](StopSpaceBroadcastResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

