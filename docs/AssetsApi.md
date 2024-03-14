# AssetsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAsset**](AssetsApi.md#createAsset) | **POST** /video/v1/assets | Create an asset
[**createAssetPlaybackId**](AssetsApi.md#createAssetPlaybackId) | **POST** /video/v1/assets/{ASSET_ID}/playback-ids | Create a playback ID
[**createAssetTrack**](AssetsApi.md#createAssetTrack) | **POST** /video/v1/assets/{ASSET_ID}/tracks | Create an asset track
[**deleteAsset**](AssetsApi.md#deleteAsset) | **DELETE** /video/v1/assets/{ASSET_ID} | Delete an asset
[**deleteAssetPlaybackId**](AssetsApi.md#deleteAssetPlaybackId) | **DELETE** /video/v1/assets/{ASSET_ID}/playback-ids/{PLAYBACK_ID} | Delete a playback ID
[**deleteAssetTrack**](AssetsApi.md#deleteAssetTrack) | **DELETE** /video/v1/assets/{ASSET_ID}/tracks/{TRACK_ID} | Delete an asset track
[**generateAssetTrackSubtitles**](AssetsApi.md#generateAssetTrackSubtitles) | **POST** /video/v1/assets/{ASSET_ID}/tracks/{TRACK_ID}/generate-subtitles | Generate track subtitles
[**getAsset**](AssetsApi.md#getAsset) | **GET** /video/v1/assets/{ASSET_ID} | Retrieve an asset
[**getAssetInputInfo**](AssetsApi.md#getAssetInputInfo) | **GET** /video/v1/assets/{ASSET_ID}/input-info | Retrieve asset input info
[**getAssetPlaybackId**](AssetsApi.md#getAssetPlaybackId) | **GET** /video/v1/assets/{ASSET_ID}/playback-ids/{PLAYBACK_ID} | Retrieve a playback ID
[**listAssets**](AssetsApi.md#listAssets) | **GET** /video/v1/assets | List assets
[**updateAsset**](AssetsApi.md#updateAsset) | **PATCH** /video/v1/assets/{ASSET_ID} | Update an asset
[**updateAssetMasterAccess**](AssetsApi.md#updateAssetMasterAccess) | **PUT** /video/v1/assets/{ASSET_ID}/master-access | Update master access
[**updateAssetMp4Support**](AssetsApi.md#updateAssetMp4Support) | **PUT** /video/v1/assets/{ASSET_ID}/mp4-support | Update MP4 support


<a name="createAsset"></a>
# **createAsset**
> AssetResponse createAsset(createAssetRequest).execute();

Create an asset

Create a new Mux Video asset.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    CreateAssetRequest createAssetRequest = {"input":[{"url":"https://muxed.s3.amazonaws.com/leds.mp4"}],"playback_policy":["public"],"encoding_tier":"baseline"}; // CreateAssetRequest | 
    try {
      AssetResponse result = apiInstance.createAsset(createAssetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAsset");
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
 **createAssetRequest** | [**CreateAssetRequest**](CreateAssetRequest.md)|  |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Asset Created |  -  |

<a name="createAssetPlaybackId"></a>
# **createAssetPlaybackId**
> CreatePlaybackIDResponse createAssetPlaybackId(ASSET_ID, createPlaybackIDRequest).execute();

Create a playback ID

Creates a playback ID that can be used to stream the asset to a viewer.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    CreatePlaybackIDRequest createPlaybackIDRequest = {"policy":"public"}; // CreatePlaybackIDRequest | 
    try {
      CreatePlaybackIDResponse result = apiInstance.createAssetPlaybackId(ASSET_ID, createPlaybackIDRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetPlaybackId");
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
 **ASSET_ID** | **String**| The asset ID. |
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

<a name="createAssetTrack"></a>
# **createAssetTrack**
> CreateTrackResponse createAssetTrack(ASSET_ID, createTrackRequest).execute();

Create an asset track

Adds an asset track (for example, subtitles, or an alternate audio track) to an asset.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    CreateTrackRequest createTrackRequest = {"url":"https://example.com/myVideo_en.srt","type":"text","text_type":"subtitles","language_code":"en-US","name":"English","closed_captions":true,"passthrough":"English"}; // CreateTrackRequest | 
    try {
      CreateTrackResponse result = apiInstance.createAssetTrack(ASSET_ID, createTrackRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAssetTrack");
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
 **ASSET_ID** | **String**| The asset ID. |
 **createTrackRequest** | [**CreateTrackRequest**](CreateTrackRequest.md)|  |

### Return type

[**CreateTrackResponse**](CreateTrackResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteAsset"></a>
# **deleteAsset**
> deleteAsset(ASSET_ID).execute();

Delete an asset

Deletes a video asset and all its data.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    try {
      apiInstance.deleteAsset(ASSET_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAsset");
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
 **ASSET_ID** | **String**| The asset ID. |

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

<a name="deleteAssetPlaybackId"></a>
# **deleteAssetPlaybackId**
> deleteAssetPlaybackId(ASSET_ID, PLAYBACK_ID).execute();

Delete a playback ID

Deletes a playback ID, rendering it nonfunctional for viewing an asset&#39;s video content. Please note that deleting the playback ID removes access to the underlying asset; a viewer who started playback before the playback ID was deleted may be able to watch the entire video for a limited duration.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    String PLAYBACK_ID = "PLAYBACK_ID_example"; // String | The live stream's playback ID.
    try {
      apiInstance.deleteAssetPlaybackId(ASSET_ID, PLAYBACK_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetPlaybackId");
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
 **ASSET_ID** | **String**| The asset ID. |
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

<a name="deleteAssetTrack"></a>
# **deleteAssetTrack**
> deleteAssetTrack(ASSET_ID, TRACK_ID).execute();

Delete an asset track

Removes a text track from an asset. Audio and video tracks on assets cannot be removed.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    String TRACK_ID = "TRACK_ID_example"; // String | The track ID.
    try {
      apiInstance.deleteAssetTrack(ASSET_ID, TRACK_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#deleteAssetTrack");
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
 **ASSET_ID** | **String**| The asset ID. |
 **TRACK_ID** | **String**| The track ID. |

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

<a name="generateAssetTrackSubtitles"></a>
# **generateAssetTrackSubtitles**
> GenerateTrackSubtitlesResponse generateAssetTrackSubtitles(ASSET_ID, TRACK_ID, generateTrackSubtitlesRequest).execute();

Generate track subtitles

Generates subtitles (captions) for a given audio track. This API can be used for up to 7 days after an asset is created.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    String TRACK_ID = "TRACK_ID_example"; // String | The track ID.
    GenerateTrackSubtitlesRequest generateTrackSubtitlesRequest = {"generated_subtitles":[{"language_code":"en","name":"English (generated)","passthrough":"English (generated)"}]}; // GenerateTrackSubtitlesRequest | 
    try {
      GenerateTrackSubtitlesResponse result = apiInstance.generateAssetTrackSubtitles(ASSET_ID, TRACK_ID, generateTrackSubtitlesRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#generateAssetTrackSubtitles");
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
 **ASSET_ID** | **String**| The asset ID. |
 **TRACK_ID** | **String**| The track ID. |
 **generateTrackSubtitlesRequest** | [**GenerateTrackSubtitlesRequest**](GenerateTrackSubtitlesRequest.md)|  |

### Return type

[**GenerateTrackSubtitlesResponse**](GenerateTrackSubtitlesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="getAsset"></a>
# **getAsset**
> AssetResponse getAsset(ASSET_ID).execute();

Retrieve an asset

Retrieves the details of an asset that has previously been created. Supply the unique asset ID that was returned from your previous request, and Mux will return the corresponding asset information. The same information is returned when creating an asset.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    try {
      AssetResponse result = apiInstance.getAsset(ASSET_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAsset");
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
 **ASSET_ID** | **String**| The asset ID. |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAssetInputInfo"></a>
# **getAssetInputInfo**
> GetAssetInputInfoResponse getAssetInputInfo(ASSET_ID).execute();

Retrieve asset input info

Returns a list of the input objects that were used to create the asset along with any settings that were applied to each input.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    try {
      GetAssetInputInfoResponse result = apiInstance.getAssetInputInfo(ASSET_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetInputInfo");
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
 **ASSET_ID** | **String**| The asset ID. |

### Return type

[**GetAssetInputInfoResponse**](GetAssetInputInfoResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAssetPlaybackId"></a>
# **getAssetPlaybackId**
> GetAssetPlaybackIDResponse getAssetPlaybackId(ASSET_ID, PLAYBACK_ID).execute();

Retrieve a playback ID

Retrieves information about the specified playback ID.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    String PLAYBACK_ID = "PLAYBACK_ID_example"; // String | The live stream's playback ID.
    try {
      GetAssetPlaybackIDResponse result = apiInstance.getAssetPlaybackId(ASSET_ID, PLAYBACK_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#getAssetPlaybackId");
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
 **ASSET_ID** | **String**| The asset ID. |
 **PLAYBACK_ID** | **String**| The live stream&#39;s playback ID. |

### Return type

[**GetAssetPlaybackIDResponse**](GetAssetPlaybackIDResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listAssets"></a>
# **listAssets**
> ListAssetsResponse listAssets().limit(limit).page(page).liveStreamId(liveStreamId).uploadId(uploadId).execute();

List assets

List all Mux assets.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String liveStreamId = "liveStreamId_example"; // String | Filter response to return all the assets for this live stream only
    String uploadId = "uploadId_example"; // String | Filter response to return an asset created from this direct upload only
    try {
      ListAssetsResponse result = apiInstance.listAssets()
            .limit(limit)
            .page(page)
            .liveStreamId(liveStreamId)
            .uploadId(uploadId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#listAssets");
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
 **liveStreamId** | **String**| Filter response to return all the assets for this live stream only | [optional]
 **uploadId** | **String**| Filter response to return an asset created from this direct upload only | [optional]

### Return type

[**ListAssetsResponse**](ListAssetsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAsset"></a>
# **updateAsset**
> AssetResponse updateAsset(ASSET_ID, updateAssetRequest).execute();

Update an asset

Updates the details of an already-created Asset with the provided Asset ID. This currently supports only the &#x60;passthrough&#x60; field.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    UpdateAssetRequest updateAssetRequest = {"passthrough":"Example"}; // UpdateAssetRequest | 
    try {
      AssetResponse result = apiInstance.updateAsset(ASSET_ID, updateAssetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAsset");
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
 **ASSET_ID** | **String**| The asset ID. |
 **updateAssetRequest** | [**UpdateAssetRequest**](UpdateAssetRequest.md)|  |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAssetMasterAccess"></a>
# **updateAssetMasterAccess**
> AssetResponse updateAssetMasterAccess(ASSET_ID, updateAssetMasterAccessRequest).execute();

Update master access

Allows you to add temporary access to the master (highest-quality) version of the asset in MP4 format. A URL will be created that can be used to download the master version for 24 hours. After 24 hours Master Access will revert to \&quot;none\&quot;. This master version is not optimized for web and not meant to be streamed, only downloaded for purposes like archiving or editing the video offline.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    UpdateAssetMasterAccessRequest updateAssetMasterAccessRequest = {"master_access":"temporary"}; // UpdateAssetMasterAccessRequest | 
    try {
      AssetResponse result = apiInstance.updateAssetMasterAccess(ASSET_ID, updateAssetMasterAccessRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetMasterAccess");
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
 **ASSET_ID** | **String**| The asset ID. |
 **updateAssetMasterAccessRequest** | [**UpdateAssetMasterAccessRequest**](UpdateAssetMasterAccessRequest.md)|  |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAssetMp4Support"></a>
# **updateAssetMp4Support**
> AssetResponse updateAssetMp4Support(ASSET_ID, updateAssetMP4SupportRequest).execute();

Update MP4 support

Allows you to add or remove mp4 support for assets that were created without it. Currently there are two values supported in this request, &#x60;standard&#x60; and &#x60;none&#x60;. &#x60;none&#x60; means that an asset *does not* have mp4 support, so submitting a request with &#x60;mp4_support&#x60; set to &#x60;none&#x60; will delete the mp4 assets from the asset in question.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String ASSET_ID = "ASSET_ID_example"; // String | The asset ID.
    UpdateAssetMP4SupportRequest updateAssetMP4SupportRequest = {"mp4_support":"standard"}; // UpdateAssetMP4SupportRequest | 
    try {
      AssetResponse result = apiInstance.updateAssetMp4Support(ASSET_ID, updateAssetMP4SupportRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#updateAssetMp4Support");
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
 **ASSET_ID** | **String**| The asset ID. |
 **updateAssetMP4SupportRequest** | [**UpdateAssetMP4SupportRequest**](UpdateAssetMP4SupportRequest.md)|  |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

