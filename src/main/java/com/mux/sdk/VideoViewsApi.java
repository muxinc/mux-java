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


import com.mux.sdk.models.ListVideoViewsResponse;
import com.mux.sdk.models.VideoViewResponse;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class VideoViewsApi {
    private ApiClient localVarApiClient;

    public VideoViewsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoViewsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getVideoViewCall(String VIDEO_VIEW_ID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/video-views/{VIDEO_VIEW_ID}"
            .replaceAll("\\{" + "VIDEO_VIEW_ID" + "\\}", localVarApiClient.escapeString(VIDEO_VIEW_ID.toString()));

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
    private okhttp3.Call getVideoViewValidateBeforeCall(String VIDEO_VIEW_ID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'VIDEO_VIEW_ID' is set
        if (VIDEO_VIEW_ID == null) {
            throw new ApiException("Missing the required parameter 'VIDEO_VIEW_ID' when calling getVideoView(Async)");
        }
        

        okhttp3.Call localVarCall = getVideoViewCall(VIDEO_VIEW_ID, _callback);
        return localVarCall;

    }


    private ApiResponse<VideoViewResponse> getVideoViewWithHttpInfo(String VIDEO_VIEW_ID) throws ApiException {
        okhttp3.Call localVarCall = getVideoViewValidateBeforeCall(VIDEO_VIEW_ID, null);
        Type localVarReturnType = new TypeToken<VideoViewResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVideoViewAsync(String VIDEO_VIEW_ID, final ApiCallback<VideoViewResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVideoViewValidateBeforeCall(VIDEO_VIEW_ID, _callback);
        Type localVarReturnType = new TypeToken<VideoViewResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetVideoViewRequest {
        private final String VIDEO_VIEW_ID;

        private APIgetVideoViewRequest(String VIDEO_VIEW_ID) {
            this.VIDEO_VIEW_ID = VIDEO_VIEW_ID;
        }

        /**
         * Build call for getVideoView
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getVideoViewCall(VIDEO_VIEW_ID, _callback);
        }

        /**
         * Execute getVideoView request
         * @return VideoViewResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public VideoViewResponse execute() throws ApiException {
            ApiResponse<VideoViewResponse> localVarResp = getVideoViewWithHttpInfo(VIDEO_VIEW_ID);
            return localVarResp.getData();
        }

        /**
         * Execute getVideoView request with HTTP info returned
         * @return ApiResponse&lt;VideoViewResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VideoViewResponse> executeWithHttpInfo() throws ApiException {
            return getVideoViewWithHttpInfo(VIDEO_VIEW_ID);
        }

        /**
         * Execute getVideoView request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VideoViewResponse> _callback) throws ApiException {
            return getVideoViewAsync(VIDEO_VIEW_ID, _callback);
        }
    }

    /**
     * Get a Video View
     * Returns the details of a video view.
     * @param VIDEO_VIEW_ID ID of the Video View (required)
     * @return APIgetVideoViewRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIgetVideoViewRequest getVideoView(String VIDEO_VIEW_ID) {
        return new APIgetVideoViewRequest(VIDEO_VIEW_ID);
    }
    private okhttp3.Call listVideoViewsCall(Integer limit, Integer page, String viewerId, Integer errorId, String orderDirection, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/video-views";

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

        if (viewerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("viewer_id", viewerId));
        }

        if (errorId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("error_id", errorId));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_direction", orderDirection));
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
    private okhttp3.Call listVideoViewsValidateBeforeCall(Integer limit, Integer page, String viewerId, Integer errorId, String orderDirection, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listVideoViewsCall(limit, page, viewerId, errorId, orderDirection, filters, timeframe, _callback);
        return localVarCall;

    }


    private ApiResponse<ListVideoViewsResponse> listVideoViewsWithHttpInfo(Integer limit, Integer page, String viewerId, Integer errorId, String orderDirection, java.util.List<String> filters, java.util.List<String> timeframe) throws ApiException {
        okhttp3.Call localVarCall = listVideoViewsValidateBeforeCall(limit, page, viewerId, errorId, orderDirection, filters, timeframe, null);
        Type localVarReturnType = new TypeToken<ListVideoViewsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listVideoViewsAsync(Integer limit, Integer page, String viewerId, Integer errorId, String orderDirection, java.util.List<String> filters, java.util.List<String> timeframe, final ApiCallback<ListVideoViewsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listVideoViewsValidateBeforeCall(limit, page, viewerId, errorId, orderDirection, filters, timeframe, _callback);
        Type localVarReturnType = new TypeToken<ListVideoViewsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistVideoViewsRequest {
        private Integer limit;
        private Integer page;
        private String viewerId;
        private Integer errorId;
        private String orderDirection;
        private java.util.List<String> filters;
        private java.util.List<String> timeframe;

        private APIlistVideoViewsRequest() {
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 25)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set viewerId
         * @param viewerId Viewer ID to filter results by. This value may be provided by the integration, or may be created by Mux. (optional)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest viewerId(String viewerId) {
            this.viewerId = viewerId;
            return this;
        }

        /**
         * Set errorId
         * @param errorId Filter video views by the provided error ID (as returned in the error_type_id field in the list video views endpoint). If you provide any as the error ID, this will filter the results to those with any error. (optional)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest errorId(Integer errorId) {
            this.errorId = errorId;
            return this;
        }

        /**
         * Set orderDirection
         * @param orderDirection Sort order. (optional)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * Set filters
         * @param filters Limit the results to rows that match conditions from provided key:value pairs. Must be provided as an array query string parameter.  To exclude rows that match a certain condition, prepend a &#x60;!&#x60; character to the dimension.  Possible filter names are the same as returned by the List Filters endpoint.  Example:    * &#x60;filters[]&#x3D;operating_system:windows&amp;filters[]&#x3D;!country:US&#x60;  (optional)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest filters(java.util.List<String> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Set timeframe
         * @param timeframe Timeframe window to limit results by. Must be provided as an array query string parameter (e.g. timeframe[]&#x3D;).  Accepted formats are...    * array of epoch timestamps e.g. &#x60;timeframe[]&#x3D;1498867200&amp;timeframe[]&#x3D;1498953600&#x60;   * duration string e.g. &#x60;timeframe[]&#x3D;24:hours or timeframe[]&#x3D;7:days&#x60;  (optional)
         * @return APIlistVideoViewsRequest
         */
        public APIlistVideoViewsRequest timeframe(java.util.List<String> timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Build call for listVideoViews
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listVideoViewsCall(limit, page, viewerId, errorId, orderDirection, filters, timeframe, _callback);
        }

        /**
         * Execute listVideoViews request
         * @return ListVideoViewsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListVideoViewsResponse execute() throws ApiException {
            ApiResponse<ListVideoViewsResponse> localVarResp = listVideoViewsWithHttpInfo(limit, page, viewerId, errorId, orderDirection, filters, timeframe);
            return localVarResp.getData();
        }

        /**
         * Execute listVideoViews request with HTTP info returned
         * @return ApiResponse&lt;ListVideoViewsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListVideoViewsResponse> executeWithHttpInfo() throws ApiException {
            return listVideoViewsWithHttpInfo(limit, page, viewerId, errorId, orderDirection, filters, timeframe);
        }

        /**
         * Execute listVideoViews request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ListVideoViewsResponse> _callback) throws ApiException {
            return listVideoViewsAsync(limit, page, viewerId, errorId, orderDirection, filters, timeframe, _callback);
        }
    }

    /**
     * List Video Views
     * Returns a list of video views.
     * @return APIlistVideoViewsRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistVideoViewsRequest listVideoViews() {
        return new APIlistVideoViewsRequest();
    }
}
