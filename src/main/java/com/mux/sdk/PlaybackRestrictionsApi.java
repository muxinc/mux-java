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


import com.mux.sdk.models.CreatePlaybackRestrictionRequest;
import com.mux.sdk.models.ListPlaybackRestrictionsResponse;
import com.mux.sdk.models.PlaybackRestrictionResponse;
import com.mux.sdk.models.UpdateReferrerDomainRestrictionRequest;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class PlaybackRestrictionsApi {
    private ApiClient localVarApiClient;

    public PlaybackRestrictionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlaybackRestrictionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call createPlaybackRestrictionCall(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createPlaybackRestrictionRequest;

        // create path and map variables
        String localVarPath = "/video/v1/playback-restrictions";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPlaybackRestrictionValidateBeforeCall(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createPlaybackRestrictionRequest' is set
        if (createPlaybackRestrictionRequest == null) {
            throw new ApiException("Missing the required parameter 'createPlaybackRestrictionRequest' when calling createPlaybackRestriction(Async)");
        }
        

        okhttp3.Call localVarCall = createPlaybackRestrictionCall(createPlaybackRestrictionRequest, _callback);
        return localVarCall;

    }


    private ApiResponse<PlaybackRestrictionResponse> createPlaybackRestrictionWithHttpInfo(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest) throws ApiException {
        okhttp3.Call localVarCall = createPlaybackRestrictionValidateBeforeCall(createPlaybackRestrictionRequest, null);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createPlaybackRestrictionAsync(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest, final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPlaybackRestrictionValidateBeforeCall(createPlaybackRestrictionRequest, _callback);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreatePlaybackRestrictionRequest {
        private final CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest;

        private APIcreatePlaybackRestrictionRequest(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest) {
            this.createPlaybackRestrictionRequest = createPlaybackRestrictionRequest;
        }

        /**
         * Build call for createPlaybackRestriction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createPlaybackRestrictionCall(createPlaybackRestrictionRequest, _callback);
        }

        /**
         * Execute createPlaybackRestriction request
         * @return PlaybackRestrictionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public PlaybackRestrictionResponse execute() throws ApiException {
            ApiResponse<PlaybackRestrictionResponse> localVarResp = createPlaybackRestrictionWithHttpInfo(createPlaybackRestrictionRequest);
            return localVarResp.getData();
        }

        /**
         * Execute createPlaybackRestriction request with HTTP info returned
         * @return ApiResponse&lt;PlaybackRestrictionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PlaybackRestrictionResponse> executeWithHttpInfo() throws ApiException {
            return createPlaybackRestrictionWithHttpInfo(createPlaybackRestrictionRequest);
        }

        /**
         * Execute createPlaybackRestriction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {
            return createPlaybackRestrictionAsync(createPlaybackRestrictionRequest, _callback);
        }
    }

    /**
     * Create a Playback Restriction
     * Create a new Playback Restriction.
     * @param createPlaybackRestrictionRequest  (required)
     * @return APIcreatePlaybackRestrictionRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public APIcreatePlaybackRestrictionRequest createPlaybackRestriction(CreatePlaybackRestrictionRequest createPlaybackRestrictionRequest) {
        return new APIcreatePlaybackRestrictionRequest(createPlaybackRestrictionRequest);
    }
    private okhttp3.Call deletePlaybackRestrictionCall(String PLAYBACK_RESTRICTION_ID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}"
            .replaceAll("\\{" + "PLAYBACK_RESTRICTION_ID" + "\\}", localVarApiClient.escapeString(PLAYBACK_RESTRICTION_ID.toString()));

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePlaybackRestrictionValidateBeforeCall(String PLAYBACK_RESTRICTION_ID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'PLAYBACK_RESTRICTION_ID' is set
        if (PLAYBACK_RESTRICTION_ID == null) {
            throw new ApiException("Missing the required parameter 'PLAYBACK_RESTRICTION_ID' when calling deletePlaybackRestriction(Async)");
        }
        

        okhttp3.Call localVarCall = deletePlaybackRestrictionCall(PLAYBACK_RESTRICTION_ID, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> deletePlaybackRestrictionWithHttpInfo(String PLAYBACK_RESTRICTION_ID) throws ApiException {
        okhttp3.Call localVarCall = deletePlaybackRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deletePlaybackRestrictionAsync(String PLAYBACK_RESTRICTION_ID, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePlaybackRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIdeletePlaybackRestrictionRequest {
        private final String PLAYBACK_RESTRICTION_ID;

        private APIdeletePlaybackRestrictionRequest(String PLAYBACK_RESTRICTION_ID) {
            this.PLAYBACK_RESTRICTION_ID = PLAYBACK_RESTRICTION_ID;
        }

        /**
         * Build call for deletePlaybackRestriction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deletePlaybackRestrictionCall(PLAYBACK_RESTRICTION_ID, _callback);
        }

        /**
         * Execute deletePlaybackRestriction request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deletePlaybackRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID);
        }

        /**
         * Execute deletePlaybackRestriction request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deletePlaybackRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID);
        }

        /**
         * Execute deletePlaybackRestriction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deletePlaybackRestrictionAsync(PLAYBACK_RESTRICTION_ID, _callback);
        }
    }

    /**
     * Delete a Playback Restriction
     * Deletes a single Playback Restriction.
     * @param PLAYBACK_RESTRICTION_ID ID of the Playback Restriction. (required)
     * @return APIdeletePlaybackRestrictionRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public APIdeletePlaybackRestrictionRequest deletePlaybackRestriction(String PLAYBACK_RESTRICTION_ID) {
        return new APIdeletePlaybackRestrictionRequest(PLAYBACK_RESTRICTION_ID);
    }
    private okhttp3.Call getPlaybackRestrictionCall(String PLAYBACK_RESTRICTION_ID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}"
            .replaceAll("\\{" + "PLAYBACK_RESTRICTION_ID" + "\\}", localVarApiClient.escapeString(PLAYBACK_RESTRICTION_ID.toString()));

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
    private okhttp3.Call getPlaybackRestrictionValidateBeforeCall(String PLAYBACK_RESTRICTION_ID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'PLAYBACK_RESTRICTION_ID' is set
        if (PLAYBACK_RESTRICTION_ID == null) {
            throw new ApiException("Missing the required parameter 'PLAYBACK_RESTRICTION_ID' when calling getPlaybackRestriction(Async)");
        }
        

        okhttp3.Call localVarCall = getPlaybackRestrictionCall(PLAYBACK_RESTRICTION_ID, _callback);
        return localVarCall;

    }


    private ApiResponse<PlaybackRestrictionResponse> getPlaybackRestrictionWithHttpInfo(String PLAYBACK_RESTRICTION_ID) throws ApiException {
        okhttp3.Call localVarCall = getPlaybackRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, null);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPlaybackRestrictionAsync(String PLAYBACK_RESTRICTION_ID, final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlaybackRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, _callback);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetPlaybackRestrictionRequest {
        private final String PLAYBACK_RESTRICTION_ID;

        private APIgetPlaybackRestrictionRequest(String PLAYBACK_RESTRICTION_ID) {
            this.PLAYBACK_RESTRICTION_ID = PLAYBACK_RESTRICTION_ID;
        }

        /**
         * Build call for getPlaybackRestriction
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
            return getPlaybackRestrictionCall(PLAYBACK_RESTRICTION_ID, _callback);
        }

        /**
         * Execute getPlaybackRestriction request
         * @return PlaybackRestrictionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PlaybackRestrictionResponse execute() throws ApiException {
            ApiResponse<PlaybackRestrictionResponse> localVarResp = getPlaybackRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID);
            return localVarResp.getData();
        }

        /**
         * Execute getPlaybackRestriction request with HTTP info returned
         * @return ApiResponse&lt;PlaybackRestrictionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PlaybackRestrictionResponse> executeWithHttpInfo() throws ApiException {
            return getPlaybackRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID);
        }

        /**
         * Execute getPlaybackRestriction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {
            return getPlaybackRestrictionAsync(PLAYBACK_RESTRICTION_ID, _callback);
        }
    }

    /**
     * Retrieve a Playback Restriction
     * Retrieves a Playback Restriction associated with the unique identifier.
     * @param PLAYBACK_RESTRICTION_ID ID of the Playback Restriction. (required)
     * @return APIgetPlaybackRestrictionRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIgetPlaybackRestrictionRequest getPlaybackRestriction(String PLAYBACK_RESTRICTION_ID) {
        return new APIgetPlaybackRestrictionRequest(PLAYBACK_RESTRICTION_ID);
    }
    private okhttp3.Call listPlaybackRestrictionsCall(Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/video/v1/playback-restrictions";

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
    private okhttp3.Call listPlaybackRestrictionsValidateBeforeCall(Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPlaybackRestrictionsCall(page, limit, _callback);
        return localVarCall;

    }


    private ApiResponse<ListPlaybackRestrictionsResponse> listPlaybackRestrictionsWithHttpInfo(Integer page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listPlaybackRestrictionsValidateBeforeCall(page, limit, null);
        Type localVarReturnType = new TypeToken<ListPlaybackRestrictionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPlaybackRestrictionsAsync(Integer page, Integer limit, final ApiCallback<ListPlaybackRestrictionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPlaybackRestrictionsValidateBeforeCall(page, limit, _callback);
        Type localVarReturnType = new TypeToken<ListPlaybackRestrictionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistPlaybackRestrictionsRequest {
        private Integer page;
        private Integer limit;

        private APIlistPlaybackRestrictionsRequest() {
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistPlaybackRestrictionsRequest
         */
        public APIlistPlaybackRestrictionsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 25)
         * @return APIlistPlaybackRestrictionsRequest
         */
        public APIlistPlaybackRestrictionsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Build call for listPlaybackRestrictions
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
            return listPlaybackRestrictionsCall(page, limit, _callback);
        }

        /**
         * Execute listPlaybackRestrictions request
         * @return ListPlaybackRestrictionsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListPlaybackRestrictionsResponse execute() throws ApiException {
            ApiResponse<ListPlaybackRestrictionsResponse> localVarResp = listPlaybackRestrictionsWithHttpInfo(page, limit);
            return localVarResp.getData();
        }

        /**
         * Execute listPlaybackRestrictions request with HTTP info returned
         * @return ApiResponse&lt;ListPlaybackRestrictionsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListPlaybackRestrictionsResponse> executeWithHttpInfo() throws ApiException {
            return listPlaybackRestrictionsWithHttpInfo(page, limit);
        }

        /**
         * Execute listPlaybackRestrictions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ListPlaybackRestrictionsResponse> _callback) throws ApiException {
            return listPlaybackRestrictionsAsync(page, limit, _callback);
        }
    }

    /**
     * List Playback Restrictions
     * Returns a list of all Playback Restrictions.
     * @return APIlistPlaybackRestrictionsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistPlaybackRestrictionsRequest listPlaybackRestrictions() {
        return new APIlistPlaybackRestrictionsRequest();
    }
    private okhttp3.Call updateReferrerDomainRestrictionCall(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateReferrerDomainRestrictionRequest;

        // create path and map variables
        String localVarPath = "/video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}/referrer"
            .replaceAll("\\{" + "PLAYBACK_RESTRICTION_ID" + "\\}", localVarApiClient.escapeString(PLAYBACK_RESTRICTION_ID.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessToken" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateReferrerDomainRestrictionValidateBeforeCall(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'PLAYBACK_RESTRICTION_ID' is set
        if (PLAYBACK_RESTRICTION_ID == null) {
            throw new ApiException("Missing the required parameter 'PLAYBACK_RESTRICTION_ID' when calling updateReferrerDomainRestriction(Async)");
        }
        
        // verify the required parameter 'updateReferrerDomainRestrictionRequest' is set
        if (updateReferrerDomainRestrictionRequest == null) {
            throw new ApiException("Missing the required parameter 'updateReferrerDomainRestrictionRequest' when calling updateReferrerDomainRestriction(Async)");
        }
        

        okhttp3.Call localVarCall = updateReferrerDomainRestrictionCall(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest, _callback);
        return localVarCall;

    }


    private ApiResponse<PlaybackRestrictionResponse> updateReferrerDomainRestrictionWithHttpInfo(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest) throws ApiException {
        okhttp3.Call localVarCall = updateReferrerDomainRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest, null);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateReferrerDomainRestrictionAsync(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest, final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateReferrerDomainRestrictionValidateBeforeCall(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest, _callback);
        Type localVarReturnType = new TypeToken<PlaybackRestrictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIupdateReferrerDomainRestrictionRequest {
        private final String PLAYBACK_RESTRICTION_ID;
        private final UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest;

        private APIupdateReferrerDomainRestrictionRequest(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest) {
            this.PLAYBACK_RESTRICTION_ID = PLAYBACK_RESTRICTION_ID;
            this.updateReferrerDomainRestrictionRequest = updateReferrerDomainRestrictionRequest;
        }

        /**
         * Build call for updateReferrerDomainRestriction
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
            return updateReferrerDomainRestrictionCall(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest, _callback);
        }

        /**
         * Execute updateReferrerDomainRestriction request
         * @return PlaybackRestrictionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PlaybackRestrictionResponse execute() throws ApiException {
            ApiResponse<PlaybackRestrictionResponse> localVarResp = updateReferrerDomainRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest);
            return localVarResp.getData();
        }

        /**
         * Execute updateReferrerDomainRestriction request with HTTP info returned
         * @return ApiResponse&lt;PlaybackRestrictionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PlaybackRestrictionResponse> executeWithHttpInfo() throws ApiException {
            return updateReferrerDomainRestrictionWithHttpInfo(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest);
        }

        /**
         * Execute updateReferrerDomainRestriction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PlaybackRestrictionResponse> _callback) throws ApiException {
            return updateReferrerDomainRestrictionAsync(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest, _callback);
        }
    }

    /**
     * Update the Referrer Playback Restriction
     * Allows you to modify the list of domains or change how Mux validates playback requests without the &#x60;Referer&#x60; HTTP header. The Referrer restriction fully replaces the old list with this new list of domains.
     * @param PLAYBACK_RESTRICTION_ID ID of the Playback Restriction. (required)
     * @param updateReferrerDomainRestrictionRequest  (required)
     * @return APIupdateReferrerDomainRestrictionRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIupdateReferrerDomainRestrictionRequest updateReferrerDomainRestriction(String PLAYBACK_RESTRICTION_ID, UpdateReferrerDomainRestrictionRequest updateReferrerDomainRestrictionRequest) {
        return new APIupdateReferrerDomainRestrictionRequest(PLAYBACK_RESTRICTION_ID, updateReferrerDomainRestrictionRequest);
    }
}