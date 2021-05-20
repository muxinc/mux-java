# MetricsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetricTimeseriesData**](MetricsApi.md#getMetricTimeseriesData) | **GET** /data/v1/metrics/{METRIC_ID}/timeseries | Get metric timeseries data
[**getOverallValues**](MetricsApi.md#getOverallValues) | **GET** /data/v1/metrics/{METRIC_ID}/overall | Get Overall values
[**listAllMetricValues**](MetricsApi.md#listAllMetricValues) | **GET** /data/v1/metrics/comparison | List all metric values
[**listBreakdownValues**](MetricsApi.md#listBreakdownValues) | **GET** /data/v1/metrics/{METRIC_ID}/breakdown | List breakdown values
[**listInsights**](MetricsApi.md#listInsights) | **GET** /data/v1/metrics/{METRIC_ID}/insights | List Insights


<a name="getMetricTimeseriesData"></a>
# **getMetricTimeseriesData**
> GetMetricTimeseriesDataResponse getMetricTimeseriesData(METRIC_ID, timeframe, filters, measurement, orderDirection, groupBy)

Get metric timeseries data

Returns timeseries data for a specific metric 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String METRIC_ID = "video_startup_time"; // String | ID of the Metric
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the deafult for the metric will be used.
    String orderDirection = "orderDirection_example"; // String | Sort order.
    String groupBy = "groupBy_example"; // String | Time granularity to group results by. If this value is omitted, a default granularity is chosen based on the supplied timeframe.
    try {
      GetMetricTimeseriesDataResponse result = apiInstance.getMetricTimeseriesData(METRIC_ID, timeframe, filters, measurement, orderDirection, groupBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricTimeseriesData");
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, max_downscale_percentage, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_failure_score, player_startup_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the deafult for the metric will be used. | [optional] [enum: 95th, median, avg]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **groupBy** | **String**| Time granularity to group results by. If this value is omitted, a default granularity is chosen based on the supplied timeframe. | [optional] [enum: hour, day]

### Return type

[**GetMetricTimeseriesDataResponse**](GetMetricTimeseriesDataResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getOverallValues"></a>
# **getOverallValues**
> GetOverallValuesResponse getOverallValues(METRIC_ID, timeframe, filters, measurement)

Get Overall values

Returns the overall value for a specific metric, as well as the total view count, watch time, and the Mux Global metric value for the metric. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String METRIC_ID = "video_startup_time"; // String | ID of the Metric
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the deafult for the metric will be used.
    try {
      GetOverallValuesResponse result = apiInstance.getOverallValues(METRIC_ID, timeframe, filters, measurement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getOverallValues");
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, max_downscale_percentage, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_failure_score, player_startup_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the deafult for the metric will be used. | [optional] [enum: 95th, median, avg]

### Return type

[**GetOverallValuesResponse**](GetOverallValuesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listAllMetricValues"></a>
# **listAllMetricValues**
> ListAllMetricValuesResponse listAllMetricValues(timeframe, filters, dimension, value)

List all metric values

List all of the values across every breakdown for a specific metric 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    String dimension = "dimension_example"; // String | Dimension the specified value belongs to
    String value = "value_example"; // String | Value to show all available metrics for
    try {
      ListAllMetricValuesResponse result = apiInstance.listAllMetricValues(timeframe, filters, dimension, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listAllMetricValues");
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
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **dimension** | **String**| Dimension the specified value belongs to | [optional] [enum: asn, browser, browser_version, cdn, country, experiment_name, operating_system, operating_system_version, player_name, player_software, player_software_version, player_version, preroll_ad_asset_hostname, preroll_ad_tag_hostname, preroll_played, preroll_requested, source_hostname, source_type, stream_type, sub_property_id, video_series, video_title]
 **value** | **String**| Value to show all available metrics for | [optional]

### Return type

[**ListAllMetricValuesResponse**](ListAllMetricValuesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listBreakdownValues"></a>
# **listBreakdownValues**
> ListBreakdownValuesResponse listBreakdownValues(METRIC_ID, groupBy, measurement, filters, limit, page, orderBy, orderDirection, timeframe)

List breakdown values

List the breakdown values for a specific metric 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String METRIC_ID = "video_startup_time"; // String | ID of the Metric
    String groupBy = "groupBy_example"; // String | Breakdown value to group the results by
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the deafult for the metric will be used.
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    try {
      ListBreakdownValuesResponse result = apiInstance.listBreakdownValues(METRIC_ID, groupBy, measurement, filters, limit, page, orderBy, orderDirection, timeframe);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listBreakdownValues");
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, max_downscale_percentage, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_failure_score, player_startup_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score]
 **groupBy** | **String**| Breakdown value to group the results by | [optional] [enum: asn, browser, browser_version, cdn, country, experiment_name, operating_system, operating_system_version, player_name, player_software, player_software_version, player_version, preroll_ad_asset_hostname, preroll_ad_tag_hostname, preroll_played, preroll_requested, source_hostname, source_type, stream_type, sub_property_id, video_series, video_title]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the deafult for the metric will be used. | [optional] [enum: 95th, median, avg]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]

### Return type

[**ListBreakdownValuesResponse**](ListBreakdownValuesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listInsights"></a>
# **listInsights**
> ListInsightsResponse listInsights(METRIC_ID, measurement, orderDirection, timeframe)

List Insights

Returns a list of insights for a metric. These are the worst performing values across all breakdowns sorted by how much they negatively impact a specific metric. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String METRIC_ID = "video_startup_time"; // String | ID of the Metric
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the deafult for the metric will be used.
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    try {
      ListInsightsResponse result = apiInstance.listInsights(METRIC_ID, measurement, orderDirection, timeframe);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listInsights");
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, max_downscale_percentage, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_failure_score, player_startup_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the deafult for the metric will be used. | [optional] [enum: 95th, median, avg]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]

### Return type

[**ListInsightsResponse**](ListInsightsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

