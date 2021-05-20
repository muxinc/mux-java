# RealTimeApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealtimeBreakdown**](RealTimeApi.md#getRealtimeBreakdown) | **GET** /data/v1/realtime/metrics/{REALTIME_METRIC_ID}/breakdown | Get Real-Time Breakdown
[**getRealtimeHistogramTimeseries**](RealTimeApi.md#getRealtimeHistogramTimeseries) | **GET** /data/v1/realtime/metrics/{REALTIME_HISTOGRAM_METRIC_ID}/histogram-timeseries | Get Real-Time Histogram Timeseries
[**getRealtimeTimeseries**](RealTimeApi.md#getRealtimeTimeseries) | **GET** /data/v1/realtime/metrics/{REALTIME_METRIC_ID}/timeseries | Get Real-Time Timeseries
[**listRealtimeDimensions**](RealTimeApi.md#listRealtimeDimensions) | **GET** /data/v1/realtime/dimensions | List Real-Time Dimensions
[**listRealtimeMetrics**](RealTimeApi.md#listRealtimeMetrics) | **GET** /data/v1/realtime/metrics | List Real-Time Metrics


<a name="getRealtimeBreakdown"></a>
# **getRealtimeBreakdown**
> GetRealTimeBreakdownResponse getRealtimeBreakdown(REALTIME_METRIC_ID, dimension, timestamp, filters, orderBy, orderDirection)

Get Real-Time Breakdown

Gets breakdown information for a specific dimension and metric along with the number of concurrent viewers and negative impact score. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.RealTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    RealTimeApi apiInstance = new RealTimeApi(defaultClient);
    String REALTIME_METRIC_ID = "current-concurrent-viewers"; // String | ID of the Realtime Metric
    String dimension = "dimension_example"; // String | Dimension the specified value belongs to
    BigDecimal timestamp = new BigDecimal(78); // BigDecimal | Timestamp to limit results by. This value must be provided as a unix timestamp. Defaults to the current unix timestamp.
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    try {
      GetRealTimeBreakdownResponse result = apiInstance.getRealtimeBreakdown(REALTIME_METRIC_ID, dimension, timestamp, filters, orderBy, orderDirection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimeApi#getRealtimeBreakdown");
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
 **REALTIME_METRIC_ID** | **String**| ID of the Realtime Metric | [enum: current-concurrent-viewers, current-rebuffering-percentage, exits-before-video-start, playback-failure-percentage, current-average-bitrate]
 **dimension** | **String**| Dimension the specified value belongs to | [optional] [enum: asn, cdn, country, operating_system, player_name, region, stream_type, sub_property_id, video_series, video_title]
 **timestamp** | **BigDecimal**| Timestamp to limit results by. This value must be provided as a unix timestamp. Defaults to the current unix timestamp. | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]

### Return type

[**GetRealTimeBreakdownResponse**](GetRealTimeBreakdownResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRealtimeHistogramTimeseries"></a>
# **getRealtimeHistogramTimeseries**
> GetRealTimeHistogramTimeseriesResponse getRealtimeHistogramTimeseries(REALTIME_METRIC_ID, filters)

Get Real-Time Histogram Timeseries

Gets histogram timeseries information for a specific metric. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.RealTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    RealTimeApi apiInstance = new RealTimeApi(defaultClient);
    String REALTIME_METRIC_ID = "current-concurrent-viewers"; // String | ID of the Realtime Metric
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    try {
      GetRealTimeHistogramTimeseriesResponse result = apiInstance.getRealtimeHistogramTimeseries(REALTIME_METRIC_ID, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimeApi#getRealtimeHistogramTimeseries");
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
 **REALTIME_METRIC_ID** | **String**| ID of the Realtime Metric | [enum: current-concurrent-viewers, current-rebuffering-percentage, exits-before-video-start, playback-failure-percentage, current-average-bitrate]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]

### Return type

[**GetRealTimeHistogramTimeseriesResponse**](GetRealTimeHistogramTimeseriesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getRealtimeTimeseries"></a>
# **getRealtimeTimeseries**
> GetRealTimeTimeseriesResponse getRealtimeTimeseries(REALTIME_METRIC_ID, filters)

Get Real-Time Timeseries

Gets Time series information for a specific metric along with the number of concurrent viewers. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.RealTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    RealTimeApi apiInstance = new RealTimeApi(defaultClient);
    String REALTIME_METRIC_ID = "current-concurrent-viewers"; // String | ID of the Realtime Metric
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    try {
      GetRealTimeTimeseriesResponse result = apiInstance.getRealtimeTimeseries(REALTIME_METRIC_ID, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimeApi#getRealtimeTimeseries");
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
 **REALTIME_METRIC_ID** | **String**| ID of the Realtime Metric | [enum: current-concurrent-viewers, current-rebuffering-percentage, exits-before-video-start, playback-failure-percentage, current-average-bitrate]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]

### Return type

[**GetRealTimeTimeseriesResponse**](GetRealTimeTimeseriesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listRealtimeDimensions"></a>
# **listRealtimeDimensions**
> ListRealTimeDimensionsResponse listRealtimeDimensions()

List Real-Time Dimensions

Lists availiable real-time dimensions 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.RealTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    RealTimeApi apiInstance = new RealTimeApi(defaultClient);
    try {
      ListRealTimeDimensionsResponse result = apiInstance.listRealtimeDimensions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimeApi#listRealtimeDimensions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListRealTimeDimensionsResponse**](ListRealTimeDimensionsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listRealtimeMetrics"></a>
# **listRealtimeMetrics**
> ListRealTimeMetricsResponse listRealtimeMetrics()

List Real-Time Metrics

Lists availiable real-time metrics. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.RealTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    RealTimeApi apiInstance = new RealTimeApi(defaultClient);
    try {
      ListRealTimeMetricsResponse result = apiInstance.listRealtimeMetrics();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimeApi#listRealtimeMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListRealTimeMetricsResponse**](ListRealTimeMetricsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

