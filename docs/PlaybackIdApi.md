# PlaybackIdApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssetOrLivestreamId**](PlaybackIdApi.md#getAssetOrLivestreamId) | **GET** /video/v1/playback-ids/{PLAYBACK_ID} | Retrieve an asset or live stream ID


<a name="getAssetOrLivestreamId"></a>
# **getAssetOrLivestreamId**
> GetAssetOrLiveStreamIdResponse getAssetOrLivestreamId(PLAYBACK_ID).execute();

Retrieve an asset or live stream ID

Retrieves the Identifier of the Asset or Live Stream associated with the Playback ID.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackIdApi apiInstance = new PlaybackIdApi(defaultClient);
    String PLAYBACK_ID = "PLAYBACK_ID_example"; // String | The live stream's playback ID.
    try {
      GetAssetOrLiveStreamIdResponse result = apiInstance.getAssetOrLivestreamId(PLAYBACK_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackIdApi#getAssetOrLivestreamId");
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
 **PLAYBACK_ID** | **String**| The live stream&#39;s playback ID. |

### Return type

[**GetAssetOrLiveStreamIdResponse**](GetAssetOrLiveStreamIdResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

