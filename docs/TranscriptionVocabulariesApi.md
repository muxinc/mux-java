# TranscriptionVocabulariesApi

All URIs are relative to *https://api.mux.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTranscriptionVocabulary**](TranscriptionVocabulariesApi.md#createTranscriptionVocabulary) | **POST** /video/v1/transcription-vocabularies | Create a Transcription Vocabulary
[**deleteTranscriptionVocabulary**](TranscriptionVocabulariesApi.md#deleteTranscriptionVocabulary) | **DELETE** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Delete a Transcription Vocabulary
[**getTranscriptionVocabulary**](TranscriptionVocabulariesApi.md#getTranscriptionVocabulary) | **GET** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Retrieve a Transcription Vocabulary
[**listTranscriptionVocabularies**](TranscriptionVocabulariesApi.md#listTranscriptionVocabularies) | **GET** /video/v1/transcription-vocabularies | List Transcription Vocabularies
[**updateTranscriptionVocabulary**](TranscriptionVocabulariesApi.md#updateTranscriptionVocabulary) | **PUT** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Update a Transcription Vocabulary


<a name="createTranscriptionVocabulary"></a>
# **createTranscriptionVocabulary**
> TranscriptionVocabularyResponse createTranscriptionVocabulary(createTranscriptionVocabularyRequest).execute();

Create a Transcription Vocabulary

Create a new Transcription Vocabulary.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.TranscriptionVocabulariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    TranscriptionVocabulariesApi apiInstance = new TranscriptionVocabulariesApi(defaultClient);
    CreateTranscriptionVocabularyRequest createTranscriptionVocabularyRequest = {"name":"Mux API Vocabulary","phrases":["Mux","Live Stream","Playback ID","video encoding"]}; // CreateTranscriptionVocabularyRequest | 
    try {
      TranscriptionVocabularyResponse result = apiInstance.createTranscriptionVocabulary(createTranscriptionVocabularyRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionVocabulariesApi#createTranscriptionVocabulary");
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
 **createTranscriptionVocabularyRequest** | [**CreateTranscriptionVocabularyRequest**](CreateTranscriptionVocabularyRequest.md)|  |

### Return type

[**TranscriptionVocabularyResponse**](TranscriptionVocabularyResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Transcription Vocabulary Created |  -  |

<a name="deleteTranscriptionVocabulary"></a>
# **deleteTranscriptionVocabulary**
> deleteTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID).execute();

Delete a Transcription Vocabulary

Deletes a Transcription Vocabulary. The Transcription Vocabulary&#39;s ID will be disassociated from any live streams using it. Transcription Vocabularies can be deleted while associated live streams are active. However, the words and phrases in the deleted Transcription Vocabulary will remain attached to those streams while they are active.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.TranscriptionVocabulariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    TranscriptionVocabulariesApi apiInstance = new TranscriptionVocabulariesApi(defaultClient);
    String TRANSCRIPTION_VOCABULARY_ID = "TRANSCRIPTION_VOCABULARY_ID_example"; // String | The ID of the Transcription Vocabulary.
    try {
      apiInstance.deleteTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionVocabulariesApi#deleteTranscriptionVocabulary");
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
 **TRANSCRIPTION_VOCABULARY_ID** | **String**| The ID of the Transcription Vocabulary. |

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

<a name="getTranscriptionVocabulary"></a>
# **getTranscriptionVocabulary**
> TranscriptionVocabularyResponse getTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID).execute();

Retrieve a Transcription Vocabulary

Retrieves the details of a Transcription Vocabulary that has previously been created. Supply the unique Transcription Vocabulary ID and Mux will return the corresponding Transcription Vocabulary information. The same information is returned when creating a Transcription Vocabulary.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.TranscriptionVocabulariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    TranscriptionVocabulariesApi apiInstance = new TranscriptionVocabulariesApi(defaultClient);
    String TRANSCRIPTION_VOCABULARY_ID = "TRANSCRIPTION_VOCABULARY_ID_example"; // String | The ID of the Transcription Vocabulary.
    try {
      TranscriptionVocabularyResponse result = apiInstance.getTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionVocabulariesApi#getTranscriptionVocabulary");
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
 **TRANSCRIPTION_VOCABULARY_ID** | **String**| The ID of the Transcription Vocabulary. |

### Return type

[**TranscriptionVocabularyResponse**](TranscriptionVocabularyResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="listTranscriptionVocabularies"></a>
# **listTranscriptionVocabularies**
> ListTranscriptionVocabulariesResponse listTranscriptionVocabularies().limit(limit).page(page).execute();

List Transcription Vocabularies

List all Transcription Vocabularies.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.TranscriptionVocabulariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    TranscriptionVocabulariesApi apiInstance = new TranscriptionVocabulariesApi(defaultClient);
    Integer limit = 10; // Integer | Number of items to include in the response
    Integer page = 1; // Integer | Offset by this many pages, of the size of `limit`
    try {
      ListTranscriptionVocabulariesResponse result = apiInstance.listTranscriptionVocabularies()
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionVocabulariesApi#listTranscriptionVocabularies");
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
 **limit** | **Integer**| Number of items to include in the response | [optional] [default to 10]
 **page** | **Integer**| Offset by this many pages, of the size of &#x60;limit&#x60; | [optional] [default to 1]

### Return type

[**ListTranscriptionVocabulariesResponse**](ListTranscriptionVocabulariesResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateTranscriptionVocabulary"></a>
# **updateTranscriptionVocabulary**
> TranscriptionVocabularyResponse updateTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID, updateTranscriptionVocabularyRequest).execute();

Update a Transcription Vocabulary

Updates the details of a previously-created Transcription Vocabulary. Updates to Transcription Vocabularies are allowed while associated live streams are active. However, updates will not be applied to those streams while they are active.

### Example
```java
// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.TranscriptionVocabulariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    TranscriptionVocabulariesApi apiInstance = new TranscriptionVocabulariesApi(defaultClient);
    String TRANSCRIPTION_VOCABULARY_ID = "TRANSCRIPTION_VOCABULARY_ID_example"; // String | The ID of the Transcription Vocabulary.
    UpdateTranscriptionVocabularyRequest updateTranscriptionVocabularyRequest = {"name":"Mux API Vocabulary - Updated","phrases":["Mux","Live Stream","RTMP","Stream Key"]}; // UpdateTranscriptionVocabularyRequest | 
    try {
      TranscriptionVocabularyResponse result = apiInstance.updateTranscriptionVocabulary(TRANSCRIPTION_VOCABULARY_ID, updateTranscriptionVocabularyRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionVocabulariesApi#updateTranscriptionVocabulary");
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
 **TRANSCRIPTION_VOCABULARY_ID** | **String**| The ID of the Transcription Vocabulary. |
 **updateTranscriptionVocabularyRequest** | [**UpdateTranscriptionVocabularyRequest**](UpdateTranscriptionVocabularyRequest.md)|  |

### Return type

[**TranscriptionVocabularyResponse**](TranscriptionVocabularyResponse.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

