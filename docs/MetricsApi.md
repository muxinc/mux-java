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
> GetMetricTimeseriesDataResponse getMetricTimeseriesData(METRIC_ID).timeframe(timeframe).filters(filters).metricFilters(metricFilters).measurement(measurement).orderDirection(orderDirection).groupBy(groupBy).execute();

Get metric timeseries data

Returns timeseries data for a specific metric.  Each interval represented in the data array contains an array with the following values:   * the first element is the interval time   * the second element is the calculated metric value   * the third element is the number of views in the interval that have a valid metric value 

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
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the default for the metric will be used.
    String orderDirection = "orderDirection_example"; // String | Sort order.
    String groupBy = "groupBy_example"; // String | Time granularity to group results by. If this value is omitted, a default granularity is chosen based on the timeframe.  For timeframes of less than 90 minutes, the default granularity is `minute`. Between 90 minutes and 6 hours, the default granularity is `ten_minutes`. Between 6 hours and 15 days inclusive, the default granularity is `hour`. The granularity of timeframes that exceed 15 days is `day`. This default behavior is subject to change; it is strongly suggested that you explicitly specify the granularity. 
    try {
      GetMetricTimeseriesDataResponse result = apiInstance.getMetricTimeseriesData(METRIC_ID)
            .timeframe(timeframe)
            .filters(filters)
            .metricFilters(metricFilters)
            .measurement(measurement)
            .orderDirection(orderDirection)
            .groupBy(groupBy)
            .execute();
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, live_stream_latency, max_downscale_percentage, max_request_latency, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_success_score, player_startup_time, playing_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, request_latency, request_throughput, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, unique_viewers, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score, views, weighted_average_bitrate, video_startup_failure_percentage, ad_attempt_count, ad_break_count, ad_break_error_count, ad_break_error_percentage, ad_error_count, ad_error_percentage, ad_exit_before_start_count, ad_exit_before_start_percentage, ad_impression_count, ad_startup_error_count, ad_startup_error_percentage]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the default for the metric will be used. | [optional] [enum: 95th, median, avg, count, sum]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **groupBy** | **String**| Time granularity to group results by. If this value is omitted, a default granularity is chosen based on the timeframe.  For timeframes of less than 90 minutes, the default granularity is &#x60;minute&#x60;. Between 90 minutes and 6 hours, the default granularity is &#x60;ten_minutes&#x60;. Between 6 hours and 15 days inclusive, the default granularity is &#x60;hour&#x60;. The granularity of timeframes that exceed 15 days is &#x60;day&#x60;. This default behavior is subject to change; it is strongly suggested that you explicitly specify the granularity.  | [optional] [enum: minute, ten_minutes, hour, day]

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
> GetOverallValuesResponse getOverallValues(METRIC_ID).timeframe(timeframe).filters(filters).metricFilters(metricFilters).measurement(measurement).execute();

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
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the default for the metric will be used.
    try {
      GetOverallValuesResponse result = apiInstance.getOverallValues(METRIC_ID)
            .timeframe(timeframe)
            .filters(filters)
            .metricFilters(metricFilters)
            .measurement(measurement)
            .execute();
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, live_stream_latency, max_downscale_percentage, max_request_latency, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_success_score, player_startup_time, playing_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, request_latency, request_throughput, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, unique_viewers, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score, views, weighted_average_bitrate, video_startup_failure_percentage, ad_attempt_count, ad_break_count, ad_break_error_count, ad_break_error_percentage, ad_error_count, ad_error_percentage, ad_exit_before_start_count, ad_exit_before_start_percentage, ad_impression_count, ad_startup_error_count, ad_startup_error_percentage]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the default for the metric will be used. | [optional] [enum: 95th, median, avg, count, sum]

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
> ListAllMetricValuesResponse listAllMetricValues().timeframe(timeframe).filters(filters).metricFilters(metricFilters).dimension(dimension).value(value).execute();

List all metric values

List all of the values across every breakdown for a specific metric.

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
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    String dimension = "dimension_example"; // String | Dimension the specified value belongs to
    String value = "value_example"; // String | Value to show all available metrics for
    try {
      ListAllMetricValuesResponse result = apiInstance.listAllMetricValues()
            .timeframe(timeframe)
            .filters(filters)
            .metricFilters(metricFilters)
            .dimension(dimension)
            .value(value)
            .execute();
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
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]
 **dimension** | **String**| Dimension the specified value belongs to | [optional] [enum: asn, asset_id, browser, browser_version, cdn, continent_code, country, custom_1, custom_2, custom_3, custom_4, custom_5, custom_6, custom_7, custom_8, custom_9, custom_10, exit_before_video_start, experiment_name, live_stream_id, operating_system, operating_system_version, page_type, playback_id, player_autoplay, player_error_code, player_mux_plugin_name, player_mux_plugin_version, player_name, player_preload, player_remote_played, player_software, player_software_version, player_version, preroll_ad_asset_hostname, preroll_ad_tag_hostname, preroll_played, preroll_requested, region, source_hostname, source_type, stream_type, sub_property_id, video_content_type, video_encoding_variant, video_id, video_series, video_startup_failure, video_title, view_drm_type, view_has_ad, view_session_id, viewer_connection_type, viewer_device_category, viewer_device_manufacturer, viewer_device_model, viewer_device_name, viewer_user_id]
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
> ListBreakdownValuesResponse listBreakdownValues(METRIC_ID).groupBy(groupBy).measurement(measurement).filters(filters).metricFilters(metricFilters).limit(limit).page(page).orderBy(orderBy).orderDirection(orderDirection).timeframe(timeframe).execute();

List breakdown values

List the breakdown values for a specific metric.

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
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the default for the metric will be used.
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    try {
      ListBreakdownValuesResponse result = apiInstance.listBreakdownValues(METRIC_ID)
            .groupBy(groupBy)
            .measurement(measurement)
            .filters(filters)
            .metricFilters(metricFilters)
            .limit(limit)
            .page(page)
            .orderBy(orderBy)
            .orderDirection(orderDirection)
            .timeframe(timeframe)
            .execute();
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, live_stream_latency, max_downscale_percentage, max_request_latency, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_success_score, player_startup_time, playing_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, request_latency, request_throughput, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, unique_viewers, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score, views, weighted_average_bitrate, video_startup_failure_percentage, ad_attempt_count, ad_break_count, ad_break_error_count, ad_break_error_percentage, ad_error_count, ad_error_percentage, ad_exit_before_start_count, ad_exit_before_start_percentage, ad_impression_count, ad_startup_error_count, ad_startup_error_percentage]
 **groupBy** | **String**| Breakdown value to group the results by | [optional] [enum: asn, asset_id, browser, browser_version, cdn, continent_code, country, custom_1, custom_2, custom_3, custom_4, custom_5, custom_6, custom_7, custom_8, custom_9, custom_10, exit_before_video_start, experiment_name, live_stream_id, operating_system, operating_system_version, page_type, playback_id, player_autoplay, player_error_code, player_mux_plugin_name, player_mux_plugin_version, player_name, player_preload, player_remote_played, player_software, player_software_version, player_version, preroll_ad_asset_hostname, preroll_ad_tag_hostname, preroll_played, preroll_requested, region, source_hostname, source_type, stream_type, sub_property_id, video_content_type, video_encoding_variant, video_id, video_series, video_startup_failure, video_title, view_drm_type, view_has_ad, view_session_id, viewer_connection_type, viewer_device_category, viewer_device_manufacturer, viewer_device_model, viewer_device_name, viewer_user_id]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the default for the metric will be used. | [optional] [enum: 95th, median, avg, count, sum]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]

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
> ListInsightsResponse listInsights(METRIC_ID).measurement(measurement).orderDirection(orderDirection).timeframe(timeframe).filters(filters).metricFilters(metricFilters).execute();

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
    String measurement = "measurement_example"; // String | Measurement for the provided metric. If omitted, the default for the metric will be used.
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a `!` character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * `filters[]=operating_system:windows&filters[]=!country:US` 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    try {
      ListInsightsResponse result = apiInstance.listInsights(METRIC_ID)
            .measurement(measurement)
            .orderDirection(orderDirection)
            .timeframe(timeframe)
            .filters(filters)
            .metricFilters(metricFilters)
            .execute();
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
 **METRIC_ID** | **String**| ID of the Metric | [enum: aggregate_startup_time, downscale_percentage, exits_before_video_start, live_stream_latency, max_downscale_percentage, max_request_latency, max_upscale_percentage, page_load_time, playback_failure_percentage, playback_success_score, player_startup_time, playing_time, rebuffer_count, rebuffer_duration, rebuffer_frequency, rebuffer_percentage, request_latency, request_throughput, rebuffer_score, requests_for_first_preroll, seek_latency, startup_time_score, unique_viewers, upscale_percentage, video_quality_score, video_startup_preroll_load_time, video_startup_preroll_request_time, video_startup_time, viewer_experience_score, views, weighted_average_bitrate, video_startup_failure_percentage, ad_attempt_count, ad_break_count, ad_break_error_count, ad_break_error_percentage, ad_error_count, ad_error_percentage, ad_exit_before_start_count, ad_exit_before_start_percentage, ad_impression_count, ad_startup_error_count, ad_startup_error_percentage]
 **measurement** | **String**| Measurement for the provided metric. If omitted, the default for the metric will be used. | [optional] [enum: 95th, median, avg, count, sum]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]

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

