# LiveStreamsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLiveStream**](LiveStreamsApi.md#createLiveStream) | **POST** /video/v1/live-streams | Create a live stream
[**createLiveStreamPlaybackId**](LiveStreamsApi.md#createLiveStreamPlaybackId) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids | Create a live stream playback ID
[**createLiveStreamSimulcastTarget**](LiveStreamsApi.md#createLiveStreamSimulcastTarget) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets | Create a live stream simulcast target
[**deleteLiveStream**](LiveStreamsApi.md#deleteLiveStream) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID} | Delete a live stream
[**deleteLiveStreamPlaybackId**](LiveStreamsApi.md#deleteLiveStreamPlaybackId) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids/{PLAYBACK_ID} | Delete a live stream playback ID
[**deleteLiveStreamSimulcastTarget**](LiveStreamsApi.md#deleteLiveStreamSimulcastTarget) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets/{SIMULCAST_TARGET_ID} | Delete a Live Stream Simulcast Target
[**disableLiveStream**](LiveStreamsApi.md#disableLiveStream) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/disable | Disable a live stream
[**enableLiveStream**](LiveStreamsApi.md#enableLiveStream) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/enable | Enable a live stream
[**getLiveStream**](LiveStreamsApi.md#getLiveStream) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID} | Retrieve a live stream
[**getLiveStreamPlaybackId**](LiveStreamsApi.md#getLiveStreamPlaybackId) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids/{PLAYBACK_ID} | Retrieve a live stream playback ID
[**getLiveStreamSimulcastTarget**](LiveStreamsApi.md#getLiveStreamSimulcastTarget) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets/{SIMULCAST_TARGET_ID} | Retrieve a Live Stream Simulcast Target
[**listLiveStreams**](LiveStreamsApi.md#listLiveStreams) | **GET** /video/v1/live-streams | List live streams
[**resetStreamKey**](LiveStreamsApi.md#resetStreamKey) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/reset-stream-key | Reset a live stream&#39;s stream key
[**signalLiveStreamComplete**](LiveStreamsApi.md#signalLiveStreamComplete) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/complete | Signal a live stream is finished
[**updateLiveStream**](LiveStreamsApi.md#updateLiveStream) | **PATCH** /video/v1/live-streams/{LIVE_STREAM_ID} | Update a live stream
[**updateLiveStreamEmbeddedSubtitles**](LiveStreamsApi.md#updateLiveStreamEmbeddedSubtitles) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/embedded-subtitles | Update a live stream&#39;s embedded subtitles
[**updateLiveStreamGeneratedSubtitles**](LiveStreamsApi.md#updateLiveStreamGeneratedSubtitles) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/generated-subtitles | Update a live stream&#39;s generated subtitles


<a name="createLiveStream"></a>
# **createLiveStream**
> LiveStreamResponse createLiveStream(createLiveStreamRequest).execute();

Create a live stream

Creates a new live stream. Once created, an encoder can connect to Mux via the specified stream key and begin streaming to an audience.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    CreateLiveStreamRequest createLiveStreamRequest = {"playback_policy":["public"],"new_asset_settings":{"playback_policy":["public"]}}; // CreateLiveStreamRequest | 
    try {
      LiveStreamResponse result = apiInstance.createLiveStream(createLiveStreamRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#createLiveStream");
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
 **createLiveStreamRequest** | [**CreateLiveStreamRequest**](CreateLiveStreamRequest.md)|  |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createLiveStreamPlaybackId"></a>
# **createLiveStreamPlaybackId**
> CreatePlaybackIDResponse createLiveStreamPlaybackId(LIVE_STREAM_ID, createPlaybackIDRequest).execute();

Create a live stream playback ID

Create a new playback ID for this live stream, through which a viewer can watch the streamed content of the live stream.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    CreatePlaybackIDRequest createPlaybackIDRequest = {"policy":"signed"}; // CreatePlaybackIDRequest | 
    try {
      CreatePlaybackIDResponse result = apiInstance.createLiveStreamPlaybackId(LIVE_STREAM_ID, createPlaybackIDRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#createLiveStreamPlaybackId");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **createPlaybackIDRequest** | [**CreatePlaybackIDRequest**](CreatePlaybackIDRequest.md)|  |

### Return type

[**CreatePlaybackIDResponse**](CreatePlaybackIDResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createLiveStreamSimulcastTarget"></a>
# **createLiveStreamSimulcastTarget**
> SimulcastTargetResponse createLiveStreamSimulcastTarget(LIVE_STREAM_ID, createSimulcastTargetRequest).execute();

Create a live stream simulcast target

Create a simulcast target for the parent live stream. Simulcast target can only be created when the parent live stream is in idle state. Only one simulcast target can be created at a time with this API.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    CreateSimulcastTargetRequest createSimulcastTargetRequest = {"url":"rtmp://live.example.com/app","stream_key":"abcdefgh","passthrough":"Example"}; // CreateSimulcastTargetRequest | 
    try {
      SimulcastTargetResponse result = apiInstance.createLiveStreamSimulcastTarget(LIVE_STREAM_ID, createSimulcastTargetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#createLiveStreamSimulcastTarget");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **createSimulcastTargetRequest** | [**CreateSimulcastTargetRequest**](CreateSimulcastTargetRequest.md)|  |

### Return type

[**SimulcastTargetResponse**](SimulcastTargetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteLiveStream"></a>
# **deleteLiveStream**
> deleteLiveStream(LIVE_STREAM_ID).execute();

Delete a live stream

Deletes a live stream from the current environment. If the live stream is currently active and being streamed to, ingest will be terminated and the encoder will be disconnected.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      apiInstance.deleteLiveStream(LIVE_STREAM_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteLiveStream");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

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

<a name="deleteLiveStreamPlaybackId"></a>
# **deleteLiveStreamPlaybackId**
> deleteLiveStreamPlaybackId(LIVE_STREAM_ID, PLAYBACK_ID).execute();

Delete a live stream playback ID

Deletes the playback ID for the live stream. This will not disable ingest (as the live stream still exists). New attempts to play back the live stream will fail immediately. However, current viewers will be able to continue watching the stream for some period of time.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    String PLAYBACK_ID = "PLAYBACK_ID_example"; // String | The live stream's playback ID.
    try {
      apiInstance.deleteLiveStreamPlaybackId(LIVE_STREAM_ID, PLAYBACK_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteLiveStreamPlaybackId");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **PLAYBACK_ID** | **String**| The live stream&#39;s playback ID. |

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

<a name="deleteLiveStreamSimulcastTarget"></a>
# **deleteLiveStreamSimulcastTarget**
> deleteLiveStreamSimulcastTarget(LIVE_STREAM_ID, SIMULCAST_TARGET_ID).execute();

Delete a Live Stream Simulcast Target

Delete the simulcast target using the simulcast target ID returned when creating the simulcast target. Simulcast Target can only be deleted when the parent live stream is in idle state.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    String SIMULCAST_TARGET_ID = "SIMULCAST_TARGET_ID_example"; // String | The ID of the simulcast target.
    try {
      apiInstance.deleteLiveStreamSimulcastTarget(LIVE_STREAM_ID, SIMULCAST_TARGET_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#deleteLiveStreamSimulcastTarget");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **SIMULCAST_TARGET_ID** | **String**| The ID of the simulcast target. |

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

<a name="disableLiveStream"></a>
# **disableLiveStream**
> DisableLiveStreamResponse disableLiveStream(LIVE_STREAM_ID).execute();

Disable a live stream

Disables a live stream, making it reject incoming RTMP streams until re-enabled. The API also ends the live stream recording immediately when active. Ending the live stream recording adds the &#x60;EXT-X-ENDLIST&#x60; tag to the HLS manifest which notifies the player that this live stream is over.  Mux also closes the encoder connection immediately. Any attempt from the encoder to re-establish connection will fail till the live stream is re-enabled. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      DisableLiveStreamResponse result = apiInstance.disableLiveStream(LIVE_STREAM_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#disableLiveStream");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

### Return type

[**DisableLiveStreamResponse**](DisableLiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="enableLiveStream"></a>
# **enableLiveStream**
> EnableLiveStreamResponse enableLiveStream(LIVE_STREAM_ID).execute();

Enable a live stream

Enables a live stream, allowing it to accept an incoming RTMP stream.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      EnableLiveStreamResponse result = apiInstance.enableLiveStream(LIVE_STREAM_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#enableLiveStream");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

### Return type

[**EnableLiveStreamResponse**](EnableLiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLiveStream"></a>
# **getLiveStream**
> LiveStreamResponse getLiveStream(LIVE_STREAM_ID).execute();

Retrieve a live stream

Retrieves the details of a live stream that has previously been created. Supply the unique live stream ID that was returned from your previous request, and Mux will return the corresponding live stream information. The same information is returned when creating a live stream.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      LiveStreamResponse result = apiInstance.getLiveStream(LIVE_STREAM_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#getLiveStream");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLiveStreamPlaybackId"></a>
# **getLiveStreamPlaybackId**
> GetLiveStreamPlaybackIDResponse getLiveStreamPlaybackId(LIVE_STREAM_ID, PLAYBACK_ID).execute();

Retrieve a live stream playback ID

Fetches information about a live stream&#39;s playback ID, through which a viewer can watch the streamed content from this live stream.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    String PLAYBACK_ID = "PLAYBACK_ID_example"; // String | The live stream's playback ID.
    try {
      GetLiveStreamPlaybackIDResponse result = apiInstance.getLiveStreamPlaybackId(LIVE_STREAM_ID, PLAYBACK_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#getLiveStreamPlaybackId");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **PLAYBACK_ID** | **String**| The live stream&#39;s playback ID. |

### Return type

[**GetLiveStreamPlaybackIDResponse**](GetLiveStreamPlaybackIDResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getLiveStreamSimulcastTarget"></a>
# **getLiveStreamSimulcastTarget**
> SimulcastTargetResponse getLiveStreamSimulcastTarget(LIVE_STREAM_ID, SIMULCAST_TARGET_ID).execute();

Retrieve a Live Stream Simulcast Target

Retrieves the details of the simulcast target created for the parent live stream. Supply the unique live stream ID and simulcast target ID that was returned in the response of create simulcast target request, and Mux will return the corresponding information.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    String SIMULCAST_TARGET_ID = "SIMULCAST_TARGET_ID_example"; // String | The ID of the simulcast target.
    try {
      SimulcastTargetResponse result = apiInstance.getLiveStreamSimulcastTarget(LIVE_STREAM_ID, SIMULCAST_TARGET_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#getLiveStreamSimulcastTarget");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **SIMULCAST_TARGET_ID** | **String**| The ID of the simulcast target. |

### Return type

[**SimulcastTargetResponse**](SimulcastTargetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listLiveStreams"></a>
# **listLiveStreams**
> ListLiveStreamsResponse listLiveStreams().limit(limit).page(page).streamKey(streamKey).status(status).execute();

List live streams

Lists the live streams that currently exist in the current environment.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String streamKey = "streamKey_example"; // String | Filter response to return live stream for this stream key only
    LiveStreamStatus status = LiveStreamStatus.fromValue("active"); // LiveStreamStatus | Filter response to return live streams with the specified status only
    try {
      ListLiveStreamsResponse result = apiInstance.listLiveStreams()
            .limit(limit)
            .page(page)
            .streamKey(streamKey)
            .status(status)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#listLiveStreams");
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
 **streamKey** | **String**| Filter response to return live stream for this stream key only | [optional]
 **status** | [**LiveStreamStatus**](.md)| Filter response to return live streams with the specified status only | [optional] [enum: active, idle, disabled]

### Return type

[**ListLiveStreamsResponse**](ListLiveStreamsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="resetStreamKey"></a>
# **resetStreamKey**
> LiveStreamResponse resetStreamKey(LIVE_STREAM_ID).execute();

Reset a live stream&#39;s stream key

Reset a live stream key if you want to immediately stop the current stream key from working and create a new stream key that can be used for future broadcasts.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      LiveStreamResponse result = apiInstance.resetStreamKey(LIVE_STREAM_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#resetStreamKey");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |

<a name="signalLiveStreamComplete"></a>
# **signalLiveStreamComplete**
> SignalLiveStreamCompleteResponse signalLiveStreamComplete(LIVE_STREAM_ID).execute();

Signal a live stream is finished

(Optional) End the live stream recording immediately instead of waiting for the reconnect_window. &#x60;EXT-X-ENDLIST&#x60; tag is added to the HLS manifest which notifies the player that this live stream is over.  Mux does not close the encoder connection immediately. Encoders are often configured to re-establish connections immediately which would result in a new recorded asset. For this reason, Mux waits for 60s before closing the connection with the encoder. This 60s timeframe is meant to give encoder operators a chance to disconnect from their end. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    try {
      SignalLiveStreamCompleteResponse result = apiInstance.signalLiveStreamComplete(LIVE_STREAM_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#signalLiveStreamComplete");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |

### Return type

[**SignalLiveStreamCompleteResponse**](SignalLiveStreamCompleteResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateLiveStream"></a>
# **updateLiveStream**
> LiveStreamResponse updateLiveStream(LIVE_STREAM_ID, updateLiveStreamRequest).execute();

Update a live stream

Updates the parameters of a previously-created live stream. This currently supports a subset of variables. Supply the live stream ID and the updated parameters and Mux will return the corresponding live stream information. The information returned will be the same after update as for subsequent get live stream requests.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    UpdateLiveStreamRequest updateLiveStreamRequest = {"latency_mode":"standard","reconnect_window":30,"max_continuous_duration":1200}; // UpdateLiveStreamRequest | 
    try {
      LiveStreamResponse result = apiInstance.updateLiveStream(LIVE_STREAM_ID, updateLiveStreamRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#updateLiveStream");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **updateLiveStreamRequest** | [**UpdateLiveStreamRequest**](UpdateLiveStreamRequest.md)|  |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateLiveStreamEmbeddedSubtitles"></a>
# **updateLiveStreamEmbeddedSubtitles**
> LiveStreamResponse updateLiveStreamEmbeddedSubtitles(LIVE_STREAM_ID, updateLiveStreamEmbeddedSubtitlesRequest).execute();

Update a live stream&#39;s embedded subtitles

Configures a live stream to receive embedded closed captions. The resulting Asset&#39;s subtitle text track will have &#x60;closed_captions: true&#x60; set. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    UpdateLiveStreamEmbeddedSubtitlesRequest updateLiveStreamEmbeddedSubtitlesRequest = {"embedded_subtitles":[{"passthrough":"Example"}]}; // UpdateLiveStreamEmbeddedSubtitlesRequest | 
    try {
      LiveStreamResponse result = apiInstance.updateLiveStreamEmbeddedSubtitles(LIVE_STREAM_ID, updateLiveStreamEmbeddedSubtitlesRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#updateLiveStreamEmbeddedSubtitles");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **updateLiveStreamEmbeddedSubtitlesRequest** | [**UpdateLiveStreamEmbeddedSubtitlesRequest**](UpdateLiveStreamEmbeddedSubtitlesRequest.md)|  |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateLiveStreamGeneratedSubtitles"></a>
# **updateLiveStreamGeneratedSubtitles**
> LiveStreamResponse updateLiveStreamGeneratedSubtitles(LIVE_STREAM_ID, updateLiveStreamGeneratedSubtitlesRequest).execute();

Update a live stream&#39;s generated subtitles

Updates a live stream&#39;s automatic-speech-recognition-generated subtitle configuration. Automatic speech recognition subtitles can be removed by sending an empty array in the request payload. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.LiveStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    LiveStreamsApi apiInstance = new LiveStreamsApi(defaultClient);
    String LIVE_STREAM_ID = "LIVE_STREAM_ID_example"; // String | The live stream ID
    UpdateLiveStreamGeneratedSubtitlesRequest updateLiveStreamGeneratedSubtitlesRequest = {"generated_subtitles":[{"name":"English CC (ASR)","language":"en","passthrough":"Example"}]}; // UpdateLiveStreamGeneratedSubtitlesRequest | 
    try {
      LiveStreamResponse result = apiInstance.updateLiveStreamGeneratedSubtitles(LIVE_STREAM_ID, updateLiveStreamGeneratedSubtitlesRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveStreamsApi#updateLiveStreamGeneratedSubtitles");
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
 **LIVE_STREAM_ID** | **String**| The live stream ID |
 **updateLiveStreamGeneratedSubtitlesRequest** | [**UpdateLiveStreamGeneratedSubtitlesRequest**](UpdateLiveStreamGeneratedSubtitlesRequest.md)|  |

### Return type

[**LiveStreamResponse**](LiveStreamResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

