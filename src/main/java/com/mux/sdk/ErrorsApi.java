/*
 * Mux API
 * Mux is how developers build online video. This API encompasses both Mux Video and Mux Data functionality to help you build your video-related projects better and faster than ever before.
 *
 * The version of the OpenAPI document: v1
 * Contact: devex@mux.com
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


import com.mux.sdk.models.ListErrorsResponse;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class ErrorsApi {
    private ApiClient localVarApiClient;

    public ErrorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ErrorsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call listErrorsCall(java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/errors";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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
    private okhttp3.Call listErrorsValidateBeforeCall(java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listErrorsCall(filters, timeframe, _callback);
        return localVarCall;

    }


    private ApiResponse<ListErrorsResponse> listErrorsWithHttpInfo(java.util.List<String> filters, java.util.List<String> timeframe) throws ApiException {
        okhttp3.Call localVarCall = listErrorsValidateBeforeCall(filters, timeframe, null);
        Type localVarReturnType = new TypeToken<ListErrorsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listErrorsAsync(java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback<ListErrorsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listErrorsValidateBeforeCall(filters, timeframe, _callback);
        Type localVarReturnType = new TypeToken<ListErrorsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistErrorsRequest {
        private java.util.List<String> filters;
        private java.util.List<String> timeframe;

        private APIlistErrorsRequest() {
        }

        /**
         * Set filters
         * @param filters Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  (optional)
         * @return APIlistErrorsRequest
         */
        public APIlistErrorsRequest filters(java.util.List<String> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Set timeframe
         * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  (optional)
         * @return APIlistErrorsRequest
         */
        public APIlistErrorsRequest timeframe(java.util.List<String> timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Build call for listErrors
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listErrorsCall(filters, timeframe, _callback);
        }

        /**
         * Execute listErrors request
         * @return ListErrorsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListErrorsResponse execute() throws ApiException {
            ApiResponse<ListErrorsResponse> localVarResp = listErrorsWithHttpInfo(filters, timeframe);
            return localVarResp.getData();
        }

        /**
         * Execute listErrors request with HTTP info returned
         * @return ApiResponse&lt;ListErrorsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListErrorsResponse> executeWithHttpInfo() throws ApiException {
            return listErrorsWithHttpInfo(filters, timeframe);
        }

        /**
         * Execute listErrors request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ListErrorsResponse> _callback) throws ApiException {
            return listErrorsAsync(filters, timeframe, _callback);
        }
    }

    /**
     * List Errors
     * Returns a list of errors.
     * @return APIlistErrorsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistErrorsRequest listErrors() {
        return new APIlistErrorsRequest();
    }
}
