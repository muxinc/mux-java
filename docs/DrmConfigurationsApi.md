# DrmConfigurationsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDrmConfiguration**](DrmConfigurationsApi.md#getDrmConfiguration) | **GET** /video/v1/drm-configurations/{DRM_CONFIGURATION_ID} | Retrieve a DRM Configuration
[**listDrmConfigurations**](DrmConfigurationsApi.md#listDrmConfigurations) | **GET** /video/v1/drm-configurations | List DRM Configurations


<a name="getDrmConfiguration"></a>
# **getDrmConfiguration**
> DRMConfigurationResponse getDrmConfiguration(DRM_CONFIGURATION_ID).execute();

Retrieve a DRM Configuration

Retrieves a single DRM Configuration.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.DrmConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    DrmConfigurationsApi apiInstance = new DrmConfigurationsApi(defaultClient);
    String DRM_CONFIGURATION_ID = "DRM_CONFIGURATION_ID_example"; // String | The DRM Configuration ID.
    try {
      DRMConfigurationResponse result = apiInstance.getDrmConfiguration(DRM_CONFIGURATION_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrmConfigurationsApi#getDrmConfiguration");
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
 **DRM_CONFIGURATION_ID** | **String**| The DRM Configuration ID. |

### Return type

[**DRMConfigurationResponse**](DRMConfigurationResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listDrmConfigurations"></a>
# **listDrmConfigurations**
> ListDRMConfigurationsResponse listDrmConfigurations().page(page).limit(limit).execute();

List DRM Configurations

Returns a list of DRM Configurations

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.DrmConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    DrmConfigurationsApi apiInstance = new DrmConfigurationsApi(defaultClient);
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    Integer limit = 25; // Integer | Number of items to include in the response
    try {
      ListDRMConfigurationsResponse result = apiInstance.listDrmConfigurations()
            .page(page)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DrmConfigurationsApi#listDrmConfigurations");
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
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]

### Return type

[**ListDRMConfigurationsResponse**](ListDRMConfigurationsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

