# AnnotationsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnnotation**](AnnotationsApi.md#createAnnotation) | **POST** /data/v1/annotations | Create Annotation
[**deleteAnnotation**](AnnotationsApi.md#deleteAnnotation) | **DELETE** /data/v1/annotations/{ANNOTATION_ID} | Delete Annotation
[**getAnnotation**](AnnotationsApi.md#getAnnotation) | **GET** /data/v1/annotations/{ANNOTATION_ID} | Get Annotation
[**listAnnotations**](AnnotationsApi.md#listAnnotations) | **GET** /data/v1/annotations | List Annotations
[**updateAnnotation**](AnnotationsApi.md#updateAnnotation) | **PATCH** /data/v1/annotations/{ANNOTATION_ID} | Update Annotation


<a name="createAnnotation"></a>
# **createAnnotation**
> AnnotationResponse createAnnotation(annotationInput).execute();

Create Annotation

Creates a new annotation.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    AnnotationInput annotationInput = {"note":"This is a note","date":1745438400,"sub_property_id":"123456"}; // AnnotationInput | 
    try {
      AnnotationResponse result = apiInstance.createAnnotation(annotationInput)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#createAnnotation");
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
 **annotationInput** | [**AnnotationInput**](AnnotationInput.md)|  |

### Return type

[**AnnotationResponse**](AnnotationResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteAnnotation"></a>
# **deleteAnnotation**
> deleteAnnotation(ANNOTATION_ID).execute();

Delete Annotation

Deletes an annotation.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    java.util.UUID ANNOTATION_ID = new java.util.UUID(); // java.util.UUID | The annotation ID
    try {
      apiInstance.deleteAnnotation(ANNOTATION_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#deleteAnnotation");
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
 **ANNOTATION_ID** | [**java.util.UUID**](.md)| The annotation ID |

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

<a name="getAnnotation"></a>
# **getAnnotation**
> AnnotationResponse getAnnotation(ANNOTATION_ID).execute();

Get Annotation

Returns the details of a specific annotation.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    java.util.UUID ANNOTATION_ID = new java.util.UUID(); // java.util.UUID | The annotation ID
    try {
      AnnotationResponse result = apiInstance.getAnnotation(ANNOTATION_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#getAnnotation");
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
 **ANNOTATION_ID** | [**java.util.UUID**](.md)| The annotation ID |

### Return type

[**AnnotationResponse**](AnnotationResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listAnnotations"></a>
# **listAnnotations**
> ListAnnotationsResponse listAnnotations().limit(limit).page(page).orderDirection(orderDirection).timeframe(timeframe).execute();

List Annotations

Returns a list of annotations.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String orderDirection = "orderDirection_example"; // String | Sort order.
    java.util.List<String> timeframe = Arrays.asList(); // java.util.List<String> | Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]=).  Accepted formats are...    * array of epoch timestamps e.g. `timeframe[]=1498867200&timeframe[]=1498953600`   * duration string e.g. `timeframe[]=24:hours or timeframe[]=7:days` 
    try {
      ListAnnotationsResponse result = apiInstance.listAnnotations()
            .limit(limit)
            .page(page)
            .orderDirection(orderDirection)
            .timeframe(timeframe)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#listAnnotations");
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
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **timeframe** | [**java.util.List&lt;String&gt;**](String.md)| Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  | [optional]

### Return type

[**ListAnnotationsResponse**](ListAnnotationsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateAnnotation"></a>
# **updateAnnotation**
> AnnotationResponse updateAnnotation(ANNOTATION_ID, annotationInput).execute();

Update Annotation

Updates an existing annotation.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AnnotationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
    java.util.UUID ANNOTATION_ID = new java.util.UUID(); // java.util.UUID | The annotation ID
    AnnotationInput annotationInput = {"note":"This is a note","date":1745438400,"sub_property_id":"123456"}; // AnnotationInput | 
    try {
      AnnotationResponse result = apiInstance.updateAnnotation(ANNOTATION_ID, annotationInput)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#updateAnnotation");
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
 **ANNOTATION_ID** | [**java.util.UUID**](.md)| The annotation ID |
 **annotationInput** | [**AnnotationInput**](AnnotationInput.md)|  |

### Return type

[**AnnotationResponse**](AnnotationResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

