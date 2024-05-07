# PlaybackRestrictionsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlaybackRestriction**](PlaybackRestrictionsApi.md#createPlaybackRestriction) | **POST** /video/v1/playback-restrictions | Create a Playback Restriction
[**deletePlaybackRestriction**](PlaybackRestrictionsApi.md#deletePlaybackRestriction) | **DELETE** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID} | Delete a Playback Restriction
[**getPlaybackRestriction**](PlaybackRestrictionsApi.md#getPlaybackRestriction) | **GET** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID} | Retrieve a Playback Restriction
[**listPlaybackRestrictions**](PlaybackRestrictionsApi.md#listPlaybackRestrictions) | **GET** /video/v1/playback-restrictions | List Playback Restrictions
[**updateReferrerDomainRestriction**](PlaybackRestrictionsApi.md#updateReferrerDomainRestriction) | **PUT** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}/referrer | Update the Referrer Playback Restriction
[**updateUserAgentRestriction**](PlaybackRestrictionsApi.md#updateUserAgentRestriction) | **PUT** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}/user_agent | Update the User Agent Restriction


<a name="createPlaybackRestriction"></a>
# **createPlaybackRestriction**
> PlaybackRestrictionResponse createPlaybackRestriction(createPlaybackRestrictionRequest).execute();

Create a Playback Restriction

Create a new Playback Restriction.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest = {"referrer":{"allowed_domains":["*.example.com"],"allow_no_referrer":true},"user_agent":{"allow_no_user_agent":false,"allow_high_risk_user_agent":false}}; // CreatePlaybackRestrictionRequest | 
    try {
      PlaybackRestrictionResponse result = apiInstance.createPlaybackRestriction(createPlaybackRestrictionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#createPlaybackRestriction");
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
 **createPlaybackRestrictionRequest** | [**CreatePlaybackRestrictionRequest**](CreatePlaybackRestrictionRequest.md)|  |

### Return type

[**PlaybackRestrictionResponse**](PlaybackRestrictionResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deletePlaybackRestriction"></a>
# **deletePlaybackRestriction**
> deletePlaybackRestriction(PLAYBACK_RESTRICTION_ID).execute();

Delete a Playback Restriction

Deletes a single Playback Restriction.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    String PLAYBACK_RESTRICTION_ID = "PLAYBACK_RESTRICTION_ID_example"; // String | ID of the Playback Restriction.
    try {
      apiInstance.deletePlaybackRestriction(PLAYBACK_RESTRICTION_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#deletePlaybackRestriction");
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
 **PLAYBACK_RESTRICTION_ID** | **String**| ID of the Playback Restriction. |

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

<a name="getPlaybackRestriction"></a>
# **getPlaybackRestriction**
> PlaybackRestrictionResponse getPlaybackRestriction(PLAYBACK_RESTRICTION_ID).execute();

Retrieve a Playback Restriction

Retrieves a Playback Restriction associated with the unique identifier.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    String PLAYBACK_RESTRICTION_ID = "PLAYBACK_RESTRICTION_ID_example"; // String | ID of the Playback Restriction.
    try {
      PlaybackRestrictionResponse result = apiInstance.getPlaybackRestriction(PLAYBACK_RESTRICTION_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#getPlaybackRestriction");
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
 **PLAYBACK_RESTRICTION_ID** | **String**| ID of the Playback Restriction. |

### Return type

[**PlaybackRestrictionResponse**](PlaybackRestrictionResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listPlaybackRestrictions"></a>
# **listPlaybackRestrictions**
> ListPlaybackRestrictionsResponse listPlaybackRestrictions().page(page).limit(limit).execute();

List Playback Restrictions

Returns a list of all Playback Restrictions.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    Integer limit = 25; // Integer | Number of items to include in the response
    try {
      ListPlaybackRestrictionsResponse result = apiInstance.listPlaybackRestrictions()
            .page(page)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#listPlaybackRestrictions");
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

[**ListPlaybackRestrictionsResponse**](ListPlaybackRestrictionsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateReferrerDomainRestriction"></a>
# **updateReferrerDomainRestriction**
> PlaybackRestrictionResponse updateReferrerDomainRestriction(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest).execute();

Update the Referrer Playback Restriction

Allows you to modify the list of domains or change how Mux validates playback requests without the &#x60;Referer&#x60; HTTP header. The Referrer restriction fully replaces the old list with this new list of domains.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    String PLAYBACK_RESTRICTION_ID = "PLAYBACK_RESTRICTION_ID_example"; // String | ID of the Playback Restriction.
    UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest = {"allowed_domains":["*.example.com"],"allow_no_referrer":true}; // UpdateReferrerDomainRestrictionRequest | 
    try {
      PlaybackRestrictionResponse result = apiInstance.updateReferrerDomainRestriction(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#updateReferrerDomainRestriction");
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
 **PLAYBACK_RESTRICTION_ID** | **String**| ID of the Playback Restriction. |
 **updateReferrerDomainRestrictionRequest** | [**UpdateReferrerDomainRestrictionRequest**](UpdateReferrerDomainRestrictionRequest.md)|  |

### Return type

[**PlaybackRestrictionResponse**](PlaybackRestrictionResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateUserAgentRestriction"></a>
# **updateUserAgentRestriction**
> PlaybackRestrictionResponse updateUserAgentRestriction(PLAYBACK_RESTRICTION_ID, updateUserAgentRestrictionRequest).execute();

Update the User Agent Restriction

Allows you to modify how Mux validates playback requests with different user agents.  Please see [Using User-Agent HTTP header for validation](https://docs.mux.com/guides/secure-video-playback#using-user-agent-http-header-for-validation) for more details on this feature.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.PlaybackRestrictionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    PlaybackRestrictionsApi apiInstance = new PlaybackRestrictionsApi(defaultClient);
    String PLAYBACK_RESTRICTION_ID = "PLAYBACK_RESTRICTION_ID_example"; // String | ID of the Playback Restriction.
    UpdateUserAgentRestrictionRequest updateUserAgentRestrictionRequest = {"allow_no_user_agent":false,"allow_high_risk_user_agent":false}; // UpdateUserAgentRestrictionRequest | 
    try {
      PlaybackRestrictionResponse result = apiInstance.updateUserAgentRestriction(PLAYBACK_RESTRICTION_ID, updateUserAgentRestrictionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaybackRestrictionsApi#updateUserAgentRestriction");
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
 **PLAYBACK_RESTRICTION_ID** | **String**| ID of the Playback Restriction. |
 **updateUserAgentRestrictionRequest** | [**UpdateUserAgentRestrictionRequest**](UpdateUserAgentRestrictionRequest.md)|  |

### Return type

[**PlaybackRestrictionResponse**](PlaybackRestrictionResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

