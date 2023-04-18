# MonitoringApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMonitoringBreakdown**](MonitoringApi.md#getMonitoringBreakdown) | **GET** /data/v1/monitoring/metrics/{MONITORING_METRIC_ID}/breakdown | Get Monitoring Breakdown
[**getMonitoringHistogramTimeseries**](MonitoringApi.md#getMonitoringHistogramTimeseries) | **GET** /data/v1/monitoring/metrics/{MONITORING_HISTOGRAM_METRIC_ID}/histogram-timeseries | Get Monitoring Histogram Timeseries
[**getMonitoringTimeseries**](MonitoringApi.md#getMonitoringTimeseries) | **GET** /data/v1/monitoring/metrics/{MONITORING_METRIC_ID}/timeseries | Get Monitoring Timeseries
[**listMonitoringDimensions**](MonitoringApi.md#listMonitoringDimensions) | **GET** /data/v1/monitoring/dimensions | List Monitoring Dimensions
[**listMonitoringMetrics**](MonitoringApi.md#listMonitoringMetrics) | **GET** /data/v1/monitoring/metrics | List Monitoring Metrics


<a name="getMonitoringBreakdown"></a>
# **getMonitoringBreakdown**
> GetMonitoringBreakdownResponse getMonitoringBreakdown(MONITORING_METRIC_ID).dimension(dimension).timestamp(timestamp).filters(filters).orderBy(orderBy).orderDirection(orderDirection).execute();

Get Monitoring Breakdown

Gets breakdown information for a specific dimension and metric along with the number of concurrent viewers and negative impact score.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String MONITORING_METRIC_ID = "current-concurrent-viewers"; // String | ID of the Monitoring Metric
    String dimension = "dimension_example"; // String | Dimension the specified value belongs to
    Integer timestamp = 56; // Integer | Timestamp to limit results by. This value must be provided as a unix timestamp. Defaults to the current unix timestamp.
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    try {
      GetMonitoringBreakdownResponse result = apiInstance.getMonitoringBreakdown(MONITORING_METRIC_ID)
            .dimension(dimension)
            .timestamp(timestamp)
            .filters(filters)
            .orderBy(orderBy)
            .orderDirection(orderDirection)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#getMonitoringBreakdown");
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
 **MONITORING_METRIC_ID** | **String**| ID of the Monitoring Metric | [enum: current-concurrent-viewers, current-rebuffering-percentage, exits-before-video-start, playback-failure-percentage, current-average-bitrate]
 **dimension** | **String**| Dimension the specified value belongs to | [optional] [enum: asn, cdn, country, operating_system, player_name, region, stream_type, sub_property_id, video_series, video_title, view_has_ad]
 **timestamp** | **Integer**| Timestamp to limit results by. This value must be provided as a unix timestamp. Defaults to the current unix timestamp. | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]

### Return type

[**GetMonitoringBreakdownResponse**](GetMonitoringBreakdownResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMonitoringHistogramTimeseries"></a>
# **getMonitoringHistogramTimeseries**
> GetMonitoringHistogramTimeseriesResponse getMonitoringHistogramTimeseries(MONITORING_HISTOGRAM_METRIC_ID).filters(filters).execute();

Get Monitoring Histogram Timeseries

Gets histogram timeseries information for a specific metric.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String MONITORING_HISTOGRAM_METRIC_ID = "video-startup-time"; // String | ID of the Monitoring Histogram Metric
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    try {
      GetMonitoringHistogramTimeseriesResponse result = apiInstance.getMonitoringHistogramTimeseries(MONITORING_HISTOGRAM_METRIC_ID)
            .filters(filters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#getMonitoringHistogramTimeseries");
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
 **MONITORING_HISTOGRAM_METRIC_ID** | **String**| ID of the Monitoring Histogram Metric | [enum: video-startup-time]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]

### Return type

[**GetMonitoringHistogramTimeseriesResponse**](GetMonitoringHistogramTimeseriesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMonitoringTimeseries"></a>
# **getMonitoringTimeseries**
> GetMonitoringTimeseriesResponse getMonitoringTimeseries(MONITORING_METRIC_ID).filters(filters).timestamp(timestamp).execute();

Get Monitoring Timeseries

Gets Time series information for a specific metric along with the number of concurrent viewers.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    String MONITORING_METRIC_ID = "current-concurrent-viewers"; // String | ID of the Monitoring Metric
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    Integer timestamp = 56; // Integer | Timestamp to use as the start of the timeseries data. This value must be provided as a unix timestamp. Defaults to 30 minutes ago.
    try {
      GetMonitoringTimeseriesResponse result = apiInstance.getMonitoringTimeseries(MONITORING_METRIC_ID)
            .filters(filters)
            .timestamp(timestamp)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#getMonitoringTimeseries");
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
 **MONITORING_METRIC_ID** | **String**| ID of the Monitoring Metric | [enum: current-concurrent-viewers, current-rebuffering-percentage, exits-before-video-start, playback-failure-percentage, current-average-bitrate]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **timestamp** | **Integer**| Timestamp to use as the start of the timeseries data. This value must be provided as a unix timestamp. Defaults to 30 minutes ago. | [optional]

### Return type

[**GetMonitoringTimeseriesResponse**](GetMonitoringTimeseriesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listMonitoringDimensions"></a>
# **listMonitoringDimensions**
> ListMonitoringDimensionsResponse listMonitoringDimensions().execute();

List Monitoring Dimensions

Lists available monitoring dimensions.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    try {
      ListMonitoringDimensionsResponse result = apiInstance.listMonitoringDimensions()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#listMonitoringDimensions");
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

[**ListMonitoringDimensionsResponse**](ListMonitoringDimensionsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listMonitoringMetrics"></a>
# **listMonitoringMetrics**
> ListMonitoringMetricsResponse listMonitoringMetrics().execute();

List Monitoring Metrics

Lists available monitoring metrics.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MonitoringApi apiInstance = new MonitoringApi(defaultClient);
    try {
      ListMonitoringMetricsResponse result = apiInstance.listMonitoringMetrics()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringApi#listMonitoringMetrics");
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

[**ListMonitoringMetricsResponse**](ListMonitoringMetricsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

