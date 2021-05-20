# VideoViewsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVideoView**](VideoViewsApi.md#getVideoView) | **GET** /data/v1/video-views/{VIDEO_VIEW_ID} | Get a Video View
[**listVideoViews**](VideoViewsApi.md#listVideoViews) | **GET** /data/v1/video-views | List Video Views


<a name="getVideoView"></a>
# **getVideoView**
> VideoViewResponse getVideoView(VIDEO_VIEW_ID)

Get a Video View

Returns the details of a video view 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.VideoViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    VideoViewsApi apiInstance = new VideoViewsApi(defaultClient);
    String VIDEO_VIEW_ID = "abcd1234"; // String | ID of the Video View
    try {
      VideoViewResponse result = apiInstance.getVideoView(VIDEO_VIEW_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideoViewsApi#getVideoView");
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
 **VIDEO_VIEW_ID** | **String**| ID of the Video View |

### Return type

[**VideoViewResponse**](VideoViewResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listVideoViews"></a>
# **listVideoViews**
> ListVideoViewsResponse listVideoViews(limit, page, viewerId, errorId, orderDirection, filters, timeframe)

List Video Views

Returns a list of video views 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.VideoViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    VideoViewsApi apiInstance = new VideoViewsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String viewerId = "viewerId_example"; // String | Viewer ID to filter results by. This value may be provided by the integration, or may be created by Mux.
    Integer errorId = 56; // Integer | Filter video views by the provided error ID (as returned in the error_type_id field in the list video views endpoint). If you provide any as the error ID, this will filter the results to those with any error.
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    try {
      ListVideoViewsResponse result = apiInstance.listVideoViews(limit, page, viewerId, errorId, orderDirection, filters, timeframe);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideoViewsApi#listVideoViews");
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
 **viewerId** | **String**| Viewer ID to filter results by. This value may be provided by the integration, or may be created by Mux. | [optional]
 **errorId** | **Integer**| Filter video views by the provided error ID (as returned in the error_type_id field in the list video views endpoint). If you provide any as the error ID, this will filter the results to those with any error. | [optional]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]

### Return type

[**ListVideoViewsResponse**](ListVideoViewsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

