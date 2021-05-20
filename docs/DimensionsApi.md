# DimensionsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDimensionValues**](DimensionsApi.md#listDimensionValues) | **GET** /data/v1/dimensions/{DIMENSION_ID} | Lists the values for a specific dimension
[**listDimensions**](DimensionsApi.md#listDimensions) | **GET** /data/v1/dimensions | List Dimensions


<a name="listDimensionValues"></a>
# **listDimensionValues**
> ListDimensionValuesResponse listDimensionValues(DIMENSION_ID, limit, page, filters, timeframe)

Lists the values for a specific dimension

Lists the values for a dimension along with a total count of related views.   Note: This API replaces the list-filter-values API call. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.DimensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    DimensionsApi apiInstance = new DimensionsApi(defaultClient);
    String DIMENSION_ID = "abcd1234"; // String | ID of the Dimension
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    java.util.List<String> filters = Arrays.asList(); // java.util.List<String> | Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]=operating_system:windows&filters[]=country:US).  Possible filter names are the same as returned by the List Filters endpoint. 
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]=1498867200&timeframe[]=1498953600    * duration string e.g. timeframe[]=24:hours or timeframe[]=7:days. 
    try {
      ListDimensionValuesResponse result = apiInstance.listDimensionValues(DIMENSION_ID, limit, page, filters, timeframe);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DimensionsApi#listDimensionValues");
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
 **DIMENSION_ID** | **String**| ID of the Dimension |
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]
 **filters** | [**java.util.List&lt;String&gt;**](String.md)| Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  | [optional]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  | [optional]

### Return type

[**ListDimensionValuesResponse**](ListDimensionValuesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listDimensions"></a>
# **listDimensions**
> ListDimensionsResponse listDimensions()

List Dimensions

List all available dimensions.  Note: This API replaces the list-filters API call. 

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.DimensionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    DimensionsApi apiInstance = new DimensionsApi(defaultClient);
    try {
      ListDimensionsResponse result = apiInstance.listDimensions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DimensionsApi#listDimensions");
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

[**ListDimensionsResponse**](ListDimensionsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

