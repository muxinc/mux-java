# ErrorsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listErrors**](ErrorsApi.md#listErrors) | **GET** /data/v1/errors | List Errors


<a name="listErrors"></a>
# **listErrors**
> ListErrorsResponse listErrors().filters(filters).metricFilters(metricFilters).timeframe(timeframe).execute();

List Errors

Returns a list of errors.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.ErrorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    ErrorsApi apiInstance = new ErrorsApi(defaultClient);
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter results using key:value pairs. Must be provided as an array query string parameter.  **Basic filtering:** * `filters[]=dimension:value` - Include rows where dimension equals value * `filters[]=!dimension:value` - Exclude rows where dimension equals value  **For trace dimensions (like video_cdn_trace):** * `filters[]=+dimension:value` - Include rows where trace contains value * `filters[]=-dimension:value` - Exclude rows where trace contains value * `filters[]=dimension:[value1,value2]` - Exact trace match  **Examples:** * `filters[]=country:US` - US views only * `filters[]=+video_cdn_trace:fastly` - Views using Fastly CDN 
    java.util.List<String> metricFilters = Arrays.asList(); // java.util.List<String> | Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of `exits_before_video_start`, `unique_viewers`, `video_startup_failure_percentage`, `view_dropped_percentage`, and `views`.  Example:    * `metric_filters[]=aggregate_startup_time>=1000` 
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    try {
      ListErrorsResponse result = apiInstance.listErrors()
            .filters(filters)
            .metricFilters(metricFilters)
            .timeframe(timeframe)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorsApi#listErrors");
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
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter results using key:value pairs. Must be provided as an array query string parameter.  **Basic filtering:** * &#x60;filters[]&#x3D;dimension:value&#x60; - Include rows where dimension equals value * &#x60;filters[]&#x3D;!dimension:value&#x60; - Exclude rows where dimension equals value  **For trace dimensions (like video_cdn_trace):** * &#x60;filters[]&#x3D;+dimension:value&#x60; - Include rows where trace contains value * &#x60;filters[]&#x3D;-dimension:value&#x60; - Exclude rows where trace contains value * &#x60;filters[]&#x3D;dimension:[value1,value2]&#x60; - Exact trace match  **Examples:** * &#x60;filters[]&#x3D;country:US&#x60; - US views only * &#x60;filters[]&#x3D;+video_cdn_trace:fastly&#x60; - Views using Fastly CDN  | [optional]
 **metricFilters** | [**java.util.List&lt;String&gt;**](String.md)| Limit the results to rows that match inequality conditions from provided metric comparison clauses. Must be provided as an array query string parameter.  Possible filterable metrics are the same as the set of metric ids, with the exceptions of &#x60;exits_before_video_start&#x60;, &#x60;unique_viewers&#x60;, &#x60;video_startup_failure_percentage&#x60;, &#x60;view_dropped_percentage&#x60;, and &#x60;views&#x60;.  Example:    * &#x60;metric_filters[]&#x3D;aggregate_startup_time&gt;&#x3D;1000&#x60;  | [optional]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]

### Return type

[**ListErrorsResponse**](ListErrorsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

