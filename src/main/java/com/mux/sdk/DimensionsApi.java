/*
 * Mux API
 * Mux is how developers build online video. This API encompasses both Mux Video and Mux Data functionality to help you build your video-related projects better and faster than ever before. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mux.sdk;

import com.mux.ApiCallback;
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.ApiResponse;
import com.mux.Configuration;
import com.mux.Pair;
import com.mux.ProgressRequestBody;
import com.mux.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mux.sdk.models.ListDimensionValuesResponse;
import com.mux.sdk.models.ListDimensionsResponse;

import java.lang.reflect.Type;

public class DimensionsApi {
    private ApiClient localVarApiClient;

    public DimensionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DimensionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listDimensionValues
     * @param DIMENSION_ID ID of the Dimension (required)
     * @param limit Number of items to include in the response (optional, default to 25)
     * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
     * @param filters Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  (optional)
     * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDimensionValuesCall(String DIMENSION_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/dimensions/{DIMENSION_ID}"
            .replaceAll("\\{" + "DIMENSION_ID" + "\\}", localVarApiClient.escapeString(DIMENSION_ID.toString()));

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (filters != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filters[]", filters));
        }

        if (timeframe != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "timeframe[]", timeframe));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listDimensionValuesValidateBeforeCall(String DIMENSION_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'DIMENSION_ID' is set
        if (DIMENSION_ID == null) {
            throw new ApiException("Missing the required parameter 'DIMENSION_ID' when calling listDimensionValues(Async)");
        }
        

        okhttp3.Call localVarCall = listDimensionValuesCall(DIMENSION_ID, limit, page, filters, timeframe, _callback);
        return localVarCall;

    }

    /**
     * Lists the values for a specific dimension
     * Lists the values for a dimension along with a total count of related views.   Note: This API replaces the list-filter-values API call. 
     * @param DIMENSION_ID ID of the Dimension (required)
     * @param limit Number of items to include in the response (optional, default to 25)
     * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
     * @param filters Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  (optional)
     * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  (optional)
     * @return ListDimensionValuesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListDimensionValuesResponse listDimensionValues(String DIMENSION_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe) throws ApiException {
        ApiResponse<ListDimensionValuesResponse> localVarResp = listDimensionValuesWithHttpInfo(DIMENSION_ID, limit, page, filters, timeframe);
        return localVarResp.getData();
    }

    /**
     * Lists the values for a specific dimension
     * Lists the values for a dimension along with a total count of related views.   Note: This API replaces the list-filter-values API call. 
     * @param DIMENSION_ID ID of the Dimension (required)
     * @param limit Number of items to include in the response (optional, default to 25)
     * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
     * @param filters Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  (optional)
     * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  (optional)
     * @return ApiResponse&lt;ListDimensionValuesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListDimensionValuesResponse> listDimensionValuesWithHttpInfo(String DIMENSION_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe) throws ApiException {
        okhttp3.Call localVarCall = listDimensionValuesValidateBeforeCall(DIMENSION_ID, limit, page, filters, timeframe, null);
        Type localVarReturnType = new TypeToken<ListDimensionValuesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists the values for a specific dimension (asynchronously)
     * Lists the values for a dimension along with a total count of related views.   Note: This API replaces the list-filter-values API call. 
     * @param DIMENSION_ID ID of the Dimension (required)
     * @param limit Number of items to include in the response (optional, default to 25)
     * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
     * @param filters Filter key:value pairs. Must be provided as an array query string parameter (e.g. filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;country:US).  Possible filter names are the same as returned by the List Filters endpoint.  (optional)
     * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;). Accepted formats are...   * array of epoch timestamps e.g. timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600    * duration string e.g. timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDimensionValuesAsync(String DIMENSION_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback<ListDimensionValuesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDimensionValuesValidateBeforeCall(DIMENSION_ID, limit, page, filters, timeframe, _callback);
        Type localVarReturnType = new TypeToken<ListDimensionValuesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listDimensions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDimensionsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/dimensions";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listDimensionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listDimensionsCall(_callback);
        return localVarCall;

    }

    /**
     * List Dimensions
     * List all available dimensions.  Note: This API replaces the list-filters API call. 
     * @return ListDimensionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListDimensionsResponse listDimensions() throws ApiException {
        ApiResponse<ListDimensionsResponse> localVarResp = listDimensionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List Dimensions
     * List all available dimensions.  Note: This API replaces the list-filters API call. 
     * @return ApiResponse&lt;ListDimensionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListDimensionsResponse> listDimensionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listDimensionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ListDimensionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Dimensions (asynchronously)
     * List all available dimensions.  Note: This API replaces the list-filters API call. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listDimensionsAsync(final ApiCallback<ListDimensionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDimensionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ListDimensionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
