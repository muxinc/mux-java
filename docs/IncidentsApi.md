# IncidentsApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIncident**](IncidentsApi.md#getIncident) | **GET** /data/v1/incidents/{INCIDENT_ID} | Get an Incident
[**listIncidents**](IncidentsApi.md#listIncidents) | **GET** /data/v1/incidents | List Incidents
[**listRelatedIncidents**](IncidentsApi.md#listRelatedIncidents) | **GET** /data/v1/incidents/{INCIDENT_ID}/related | List Related Incidents


<a name="getIncident"></a>
# **getIncident**
> IncidentResponse getIncident(INCIDENT_ID).execute();

Get an Incident

Returns the details of an incident.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String INCIDENT_ID = "abcd1234"; // String | ID of the Incident
    try {
      IncidentResponse result = apiInstance.getIncident(INCIDENT_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncident");
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
 **INCIDENT_ID** | **String**| ID of the Incident |

### Return type

[**IncidentResponse**](IncidentResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listIncidents"></a>
# **listIncidents**
> ListIncidentsResponse listIncidents().limit(limit).page(page).orderBy(orderBy).orderDirection(orderDirection).status(status).severity(severity).execute();

List Incidents

Returns a list of incidents.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    String status = "status_example"; // String | Status to filter incidents by
    String severity = "severity_example"; // String | Severity to filter incidents by
    try {
      ListIncidentsResponse result = apiInstance.listIncidents()
            .limit(limit)
            .page(page)
            .orderBy(orderBy)
            .orderDirection(orderDirection)
            .status(status)
            .severity(severity)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listIncidents");
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
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]
 **status** | **String**| Status to filter incidents by | [optional] [enum: open, closed, expired]
 **severity** | **String**| Severity to filter incidents by | [optional] [enum: warning, alert]

### Return type

[**ListIncidentsResponse**](ListIncidentsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listRelatedIncidents"></a>
# **listRelatedIncidents**
> ListRelatedIncidentsResponse listRelatedIncidents(INCIDENT_ID).limit(limit).page(page).orderBy(orderBy).orderDirection(orderDirection).execute();

List Related Incidents

Returns all the incidents that seem related to a specific incident.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String INCIDENT_ID = "abcd1234"; // String | ID of the Incident
    Integer limit = 25; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    String orderBy = "orderBy_example"; // String | Value to order the results by
    String orderDirection = "orderDirection_example"; // String | Sort order.
    try {
      ListRelatedIncidentsResponse result = apiInstance.listRelatedIncidents(INCIDENT_ID)
            .limit(limit)
            .page(page)
            .orderBy(orderBy)
            .orderDirection(orderDirection)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#listRelatedIncidents");
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
 **INCIDENT_ID** | **String**| ID of the Incident |
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 25]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]
 **orderBy** | **String**| Value to order the results by | [optional] [enum: negative_impact, value, views, field]
 **orderDirection** | **String**| Sort order. | [optional] [enum: asc, desc]

### Return type

[**ListRelatedIncidentsResponse**](ListRelatedIncidentsResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

