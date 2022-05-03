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


import com.mux.sdk.models.ListDeliveryUsageResponse;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class DeliveryUsageApi {
    private ApiClient localVarApiClient;

    public DeliveryUsageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryUsageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call listDeliveryUsageCall(Integer page, Integer limit, String assetId, String liveStreamId, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/video/v1/delivery-usage";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (assetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_id", assetId));
        }

        if (liveStreamId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("live_stream_id", liveStreamId));
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
    private okhttp3.Call listDeliveryUsageValidateBeforeCall(Integer page, Integer limit, String assetId, String liveStreamId, java.util.List<String> timeframe, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listDeliveryUsageCall(page, limit, assetId, liveStreamId, timeframe, _callback);
        return localVarCall;

    }


    private ApiResponse<ListDeliveryUsageResponse> listDeliveryUsageWithHttpInfo(Integer page, Integer limit, String assetId, String liveStreamId, java.util.List<String> timeframe) throws ApiException {
        okhttp3.Call localVarCall = listDeliveryUsageValidateBeforeCall(page, limit, assetId, liveStreamId, timeframe, null);
        Type localVarReturnType = new TypeToken<ListDeliveryUsageResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDeliveryUsageAsync(Integer page, Integer limit, String assetId, String liveStreamId, java.util.List<String> timeframe, final ApiCallback<ListDeliveryUsageResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDeliveryUsageValidateBeforeCall(page, limit, assetId, liveStreamId, timeframe, _callback);
        Type localVarReturnType = new TypeToken<ListDeliveryUsageResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistDeliveryUsageRequest {
        private Integer page;
        private Integer limit;
        private String assetId;
        private String liveStreamId;
        private java.util.List<String> timeframe;

        private APIlistDeliveryUsageRequest() {
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistDeliveryUsageRequest
         */
        public APIlistDeliveryUsageRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 100)
         * @return APIlistDeliveryUsageRequest
         */
        public APIlistDeliveryUsageRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set assetId
         * @param assetId Filter response to return delivery usage for this asset only. You cannot specify both the &#x60;asset_id&#x60; and &#x60;live_stream_id&#x60; parameters together. (optional)
         * @return APIlistDeliveryUsageRequest
         */
        public APIlistDeliveryUsageRequest assetId(String assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * Set liveStreamId
         * @param liveStreamId Filter response to return delivery usage for assets for this live stream. You cannot specify both the &#x60;asset_id&#x60; and &#x60;live_stream_id&#x60; parameters together. (optional)
         * @return APIlistDeliveryUsageRequest
         */
        public APIlistDeliveryUsageRequest liveStreamId(String liveStreamId) {
            this.liveStreamId = liveStreamId;
            return this;
        }

        /**
         * Set timeframe
         * @param timeframe Time window to get delivery usage information. timeframe[0] indicates the start time, timeframe[1] indicates the end time in seconds since the Unix epoch. Default time window is 1 hour representing usage from 13th to 12th hour from when the request is made. (optional)
         * @return APIlistDeliveryUsageRequest
         */
        public APIlistDeliveryUsageRequest timeframe(java.util.List<String> timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Build call for listDeliveryUsage
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
            return listDeliveryUsageCall(page, limit, assetId, liveStreamId, timeframe, _callback);
        }

        /**
         * Execute listDeliveryUsage request
         * @return ListDeliveryUsageResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListDeliveryUsageResponse execute() throws ApiException {
            ApiResponse<ListDeliveryUsageResponse> localVarResp = listDeliveryUsageWithHttpInfo(page, limit, assetId, liveStreamId, timeframe);
            return localVarResp.getData();
        }

        /**
         * Execute listDeliveryUsage request with HTTP info returned
         * @return ApiResponse&lt;ListDeliveryUsageResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListDeliveryUsageResponse> executeWithHttpInfo() throws ApiException {
            return listDeliveryUsageWithHttpInfo(page, limit, assetId, liveStreamId, timeframe);
        }

        /**
         * Execute listDeliveryUsage request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ListDeliveryUsageResponse> _callback) throws ApiException {
            return listDeliveryUsageAsync(page, limit, assetId, liveStreamId, timeframe, _callback);
        }
    }

    /**
     * List Usage
     * Returns a list of delivery usage records and their associated Asset IDs or Live Stream IDs.
     * @return APIlistDeliveryUsageRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistDeliveryUsageRequest listDeliveryUsage() {
        return new APIlistDeliveryUsageRequest();
    }
}
