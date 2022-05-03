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


import com.mux.sdk.models.ListFilterValuesResponse;
import com.mux.sdk.models.ListFiltersResponse;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class FiltersApi {
    private ApiClient localVarApiClient;

    public FiltersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FiltersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call listFilterValuesCall(String FILTER_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/filters/{FILTER_ID}"
            .replaceAll("\\{" + "FILTER_ID" + "\\}", localVarApiClient.escapeString(FILTER_ID.toString()));

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call listFilterValuesValidateBeforeCall(String FILTER_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'FILTER_ID' is set
        if (FILTER_ID == null) {
            throw new ApiException("Missing the required parameter 'FILTER_ID' when calling listFilterValues(Async)");
        }
        

        okhttp3.Call localVarCall = listFilterValuesCall(FILTER_ID, limit, page, filters, timeframe, _callback);
        return localVarCall;

    }


    private ApiResponse<ListFilterValuesResponse> listFilterValuesWithHttpInfo(String FILTER_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe) throws ApiException {
        okhttp3.Call localVarCall = listFilterValuesValidateBeforeCall(FILTER_ID, limit, page, filters, timeframe, null);
        Type localVarReturnType = new TypeToken<ListFilterValuesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listFilterValuesAsync(String FILTER_ID, Integer limit, Integer page, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback<ListFilterValuesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFilterValuesValidateBeforeCall(FILTER_ID, limit, page, filters, timeframe, _callback);
        Type localVarReturnType = new TypeToken<ListFilterValuesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistFilterValuesRequest {
        private final String FILTER_ID;
        private Integer limit;
        private Integer page;
        private java.util.List<String> filters;
        private java.util.List<String> timeframe;

        private APIlistFilterValuesRequest(String FILTER_ID) {
            this.FILTER_ID = FILTER_ID;
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 25)
         * @return APIlistFilterValuesRequest
         */
        public APIlistFilterValuesRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistFilterValuesRequest
         */
        public APIlistFilterValuesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set filters
         * @param filters Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  (optional)
         * @return APIlistFilterValuesRequest
         */
        public APIlistFilterValuesRequest filters(java.util.List<String> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Set timeframe
         * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  (optional)
         * @return APIlistFilterValuesRequest
         */
        public APIlistFilterValuesRequest timeframe(java.util.List<String> timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Build call for listFilterValues
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listFilterValuesCall(FILTER_ID, limit, page, filters, timeframe, _callback);
        }

        /**
         * Execute listFilterValues request
         * @return ListFilterValuesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public ListFilterValuesResponse execute() throws ApiException {
            ApiResponse<ListFilterValuesResponse> localVarResp = listFilterValuesWithHttpInfo(FILTER_ID, limit, page, filters, timeframe);
            return localVarResp.getData();
        }

        /**
         * Execute listFilterValues request with HTTP info returned
         * @return ApiResponse&lt;ListFilterValuesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public ApiResponse<ListFilterValuesResponse> executeWithHttpInfo() throws ApiException {
            return listFilterValuesWithHttpInfo(FILTER_ID, limit, page, filters, timeframe);
        }

        /**
         * Execute listFilterValues request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public okhttp3.Call executeAsync(final ApiCallback<ListFilterValuesResponse> _callback) throws ApiException {
            return listFilterValuesAsync(FILTER_ID, limit, page, filters, timeframe, _callback);
        }
    }

    /**
     * Lists values for a specific filter
     * The API has been replaced by the list-dimension-values API call.  Lists the values for a filter along with a total count of related views. 
     * @param FILTER_ID ID of the Filter (required)
     * @return APIlistFilterValuesRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public APIlistFilterValuesRequest listFilterValues(String FILTER_ID) {
        return new APIlistFilterValuesRequest(FILTER_ID);
    }
    private okhttp3.Call listFiltersCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/filters";

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call listFiltersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listFiltersCall(_callback);
        return localVarCall;

    }


    private ApiResponse<ListFiltersResponse> listFiltersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listFiltersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ListFiltersResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listFiltersAsync(final ApiCallback<ListFiltersResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFiltersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ListFiltersResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistFiltersRequest {

        private APIlistFiltersRequest() {
        }

        /**
         * Build call for listFilters
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listFiltersCall(_callback);
        }

        /**
         * Execute listFilters request
         * @return ListFiltersResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public ListFiltersResponse execute() throws ApiException {
            ApiResponse<ListFiltersResponse> localVarResp = listFiltersWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute listFilters request with HTTP info returned
         * @return ApiResponse&lt;ListFiltersResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public ApiResponse<ListFiltersResponse> executeWithHttpInfo() throws ApiException {
            return listFiltersWithHttpInfo();
        }

        /**
         * Execute listFilters request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         * @deprecated
         */
        @Deprecated
        public okhttp3.Call executeAsync(final ApiCallback<ListFiltersResponse> _callback) throws ApiException {
            return listFiltersAsync(_callback);
        }
    }

    /**
     * List Filters
     * The API has been replaced by the list-dimensions API call.  Lists all the filters broken out into basic and advanced. 
     * @return APIlistFiltersRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public APIlistFiltersRequest listFilters() {
        return new APIlistFiltersRequest();
    }
}
