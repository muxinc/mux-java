# DeliveryUsageApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDeliveryUsage**](DeliveryUsageApi.md#listDeliveryUsage) | **GET** /video/v1/delivery-usage | List Usage


<a name="listDeliveryUsage"></a>
# **listDeliveryUsage**
> ListDeliveryUsageResponse listDeliveryUsage().page(page).limit(limit).assetId(assetId).liveStreamId(liveStreamId).timeframe(timeframe).execute();

List Usage

Returns a list of delivery usage records and their associated Asset IDs or Live Stream IDs.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.DeliveryUsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    DeliveryUsageApi apiInstance = new DeliveryUsageApi(defaultClient);
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    Integer limit = 100; // Integer | Number of items to include in the response
    String assetId = "assetId_example"; // String | Filter response to return delivery usage for this asset only. You cannot specify both the `asset_id` and `live_stream_id` parameters together.
    String liveStreamId = "liveStreamId_example"; // String | Filter response to return delivery usage for assets for this live stream. You cannot specify both the `asset_id` and `live_stream_id` parameters together.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Time window to get delivery usage information. timeframe[0] indicates the start time, timeframe[1] indicates the end time in seconds since the Unix epoch. Default time window is 1 hour representing usage from 13th to 12th hour from when the request is made.
    try {
      ListDeliveryUsageResponse result = apiInstance.listDeliveryUsage()
            .page(page)
            .limit(limit)
            .assetId(assetId)
            .liveStreamId(liveStreamId)
            .timeframe(timeframe)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliveryUsageApi#listDeliveryUsage");
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
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 100]
 **assetId** | **String**| Filter response to return delivery usage for this asset only. You cannot specify both the &#x60;asset_id&#x60; and &#x60;live_stream_id&#x60; parameters together. | [optional]
 **liveStreamId** | **String**| Filter response to return delivery usage for assets for this live stream. You cannot specify both the &#x60;asset_id&#x60; and &#x60;live_stream_id&#x60; parameters together. | [optional]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Time window to get delivery usage information. timeframe[0] indicates the start time, timeframe[1] indicates the end time in seconds since the Unix epoch. Default time window is 1 hour representing usage from 13th to 12th hour from when the request is made. | [optional]

### Return type

[**ListDeliveryUsageResponse**](ListDeliveryUsageResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

