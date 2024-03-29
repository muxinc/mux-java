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


import com.mux.sdk.models.IncidentResponse;
import com.mux.sdk.models.ListIncidentsResponse;
import com.mux.sdk.models.ListRelatedIncidentsResponse;
// TODO: due to import parsing issues for the RDR type; fix in spec in future
import com.mux.sdk.models.ReferrerDomainRestriction;

import java.lang.reflect.Type;

public class IncidentsApi {
    private ApiClient localVarApiClient;

    public IncidentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IncidentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    private okhttp3.Call getIncidentCall(String INCIDENT_ID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/incidents/{INCIDENT_ID}"
            .replaceAll("\\{" + "INCIDENT_ID" + "\\}", localVarApiClient.escapeString(INCIDENT_ID.toString()));

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
    private okhttp3.Call getIncidentValidateBeforeCall(String INCIDENT_ID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'INCIDENT_ID' is set
        if (INCIDENT_ID == null) {
            throw new ApiException("Missing the required parameter 'INCIDENT_ID' when calling getIncident(Async)");
        }
        

        okhttp3.Call localVarCall = getIncidentCall(INCIDENT_ID, _callback);
        return localVarCall;

    }


    private ApiResponse<IncidentResponse> getIncidentWithHttpInfo(String INCIDENT_ID) throws ApiException {
        okhttp3.Call localVarCall = getIncidentValidateBeforeCall(INCIDENT_ID, null);
        Type localVarReturnType = new TypeToken<IncidentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getIncidentAsync(String INCIDENT_ID, final ApiCallback<IncidentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIncidentValidateBeforeCall(INCIDENT_ID, _callback);
        Type localVarReturnType = new TypeToken<IncidentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetIncidentRequest {
        private final String INCIDENT_ID;

        private APIgetIncidentRequest(String INCIDENT_ID) {
            this.INCIDENT_ID = INCIDENT_ID;
        }

        /**
         * Build call for getIncident
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
            return getIncidentCall(INCIDENT_ID, _callback);
        }

        /**
         * Execute getIncident request
         * @return IncidentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public IncidentResponse execute() throws ApiException {
            ApiResponse<IncidentResponse> localVarResp = getIncidentWithHttpInfo(INCIDENT_ID);
            return localVarResp.getData();
        }

        /**
         * Execute getIncident request with HTTP info returned
         * @return ApiResponse&lt;IncidentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IncidentResponse> executeWithHttpInfo() throws ApiException {
            return getIncidentWithHttpInfo(INCIDENT_ID);
        }

        /**
         * Execute getIncident request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<IncidentResponse> _callback) throws ApiException {
            return getIncidentAsync(INCIDENT_ID, _callback);
        }
    }

    /**
     * Get an Incident
     * Returns the details of an incident.
     * @param INCIDENT_ID ID of the Incident (required)
     * @return APIgetIncidentRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIgetIncidentRequest getIncident(String INCIDENT_ID) {
        return new APIgetIncidentRequest(INCIDENT_ID);
    }
    private okhttp3.Call listIncidentsCall(Integer limit, Integer page, String orderBy, String orderDirection, String status, String severity, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/incidents";

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

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_direction", orderDirection));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (severity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("severity", severity));
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
    private okhttp3.Call listIncidentsValidateBeforeCall(Integer limit, Integer page, String orderBy, String orderDirection, String status, String severity, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listIncidentsCall(limit, page, orderBy, orderDirection, status, severity, _callback);
        return localVarCall;

    }


    private ApiResponse<ListIncidentsResponse> listIncidentsWithHttpInfo(Integer limit, Integer page, String orderBy, String orderDirection, String status, String severity) throws ApiException {
        okhttp3.Call localVarCall = listIncidentsValidateBeforeCall(limit, page, orderBy, orderDirection, status, severity, null);
        Type localVarReturnType = new TypeToken<ListIncidentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listIncidentsAsync(Integer limit, Integer page, String orderBy, String orderDirection, String status, String severity, final ApiCallback<ListIncidentsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listIncidentsValidateBeforeCall(limit, page, orderBy, orderDirection, status, severity, _callback);
        Type localVarReturnType = new TypeToken<ListIncidentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistIncidentsRequest {
        private Integer limit;
        private Integer page;
        private String orderBy;
        private String orderDirection;
        private String status;
        private String severity;

        private APIlistIncidentsRequest() {
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 25)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set orderBy
         * @param orderBy Value to order the results by (optional)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Set orderDirection
         * @param orderDirection Sort order. (optional)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * Set status
         * @param status Status to filter incidents by (optional)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Set severity
         * @param severity Severity to filter incidents by (optional)
         * @return APIlistIncidentsRequest
         */
        public APIlistIncidentsRequest severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Build call for listIncidents
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
            return listIncidentsCall(limit, page, orderBy, orderDirection, status, severity, _callback);
        }

        /**
         * Execute listIncidents request
         * @return ListIncidentsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListIncidentsResponse execute() throws ApiException {
            ApiResponse<ListIncidentsResponse> localVarResp = listIncidentsWithHttpInfo(limit, page, orderBy, orderDirection, status, severity);
            return localVarResp.getData();
        }

        /**
         * Execute listIncidents request with HTTP info returned
         * @return ApiResponse&lt;ListIncidentsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListIncidentsResponse> executeWithHttpInfo() throws ApiException {
            return listIncidentsWithHttpInfo(limit, page, orderBy, orderDirection, status, severity);
        }

        /**
         * Execute listIncidents request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ListIncidentsResponse> _callback) throws ApiException {
            return listIncidentsAsync(limit, page, orderBy, orderDirection, status, severity, _callback);
        }
    }

    /**
     * List Incidents
     * Returns a list of incidents.
     * @return APIlistIncidentsRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistIncidentsRequest listIncidents() {
        return new APIlistIncidentsRequest();
    }
    private okhttp3.Call listRelatedIncidentsCall(String INCIDENT_ID, Integer limit, Integer page, String orderBy, String orderDirection, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/v1/incidents/{INCIDENT_ID}/related"
            .replaceAll("\\{" + "INCIDENT_ID" + "\\}", localVarApiClient.escapeString(INCIDENT_ID.toString()));

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

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_direction", orderDirection));
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
    private okhttp3.Call listRelatedIncidentsValidateBeforeCall(String INCIDENT_ID, Integer limit, Integer page, String orderBy, String orderDirection, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'INCIDENT_ID' is set
        if (INCIDENT_ID == null) {
            throw new ApiException("Missing the required parameter 'INCIDENT_ID' when calling listRelatedIncidents(Async)");
        }
        

        okhttp3.Call localVarCall = listRelatedIncidentsCall(INCIDENT_ID, limit, page, orderBy, orderDirection, _callback);
        return localVarCall;

    }


    private ApiResponse<ListRelatedIncidentsResponse> listRelatedIncidentsWithHttpInfo(String INCIDENT_ID, Integer limit, Integer page, String orderBy, String orderDirection) throws ApiException {
        okhttp3.Call localVarCall = listRelatedIncidentsValidateBeforeCall(INCIDENT_ID, limit, page, orderBy, orderDirection, null);
        Type localVarReturnType = new TypeToken<ListRelatedIncidentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listRelatedIncidentsAsync(String INCIDENT_ID, Integer limit, Integer page, String orderBy, String orderDirection, final ApiCallback<ListRelatedIncidentsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRelatedIncidentsValidateBeforeCall(INCIDENT_ID, limit, page, orderBy, orderDirection, _callback);
        Type localVarReturnType = new TypeToken<ListRelatedIncidentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistRelatedIncidentsRequest {
        private final String INCIDENT_ID;
        private Integer limit;
        private Integer page;
        private String orderBy;
        private String orderDirection;

        private APIlistRelatedIncidentsRequest(String INCIDENT_ID) {
            this.INCIDENT_ID = INCIDENT_ID;
        }

        /**
         * Set limit
         * @param limit Number of items to include in the response (optional, default to 25)
         * @return APIlistRelatedIncidentsRequest
         */
        public APIlistRelatedIncidentsRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set page
         * @param page Offset by this many pages, of the size of &#x60;limit&#x60; (optional, default to 1)
         * @return APIlistRelatedIncidentsRequest
         */
        public APIlistRelatedIncidentsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set orderBy
         * @param orderBy Value to order the results by (optional)
         * @return APIlistRelatedIncidentsRequest
         */
        public APIlistRelatedIncidentsRequest orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Set orderDirection
         * @param orderDirection Sort order. (optional)
         * @return APIlistRelatedIncidentsRequest
         */
        public APIlistRelatedIncidentsRequest orderDirection(String orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * Build call for listRelatedIncidents
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
            return listRelatedIncidentsCall(INCIDENT_ID, limit, page, orderBy, orderDirection, _callback);
        }

        /**
         * Execute listRelatedIncidents request
         * @return ListRelatedIncidentsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ListRelatedIncidentsResponse execute() throws ApiException {
            ApiResponse<ListRelatedIncidentsResponse> localVarResp = listRelatedIncidentsWithHttpInfo(INCIDENT_ID, limit, page, orderBy, orderDirection);
            return localVarResp.getData();
        }

        /**
         * Execute listRelatedIncidents request with HTTP info returned
         * @return ApiResponse&lt;ListRelatedIncidentsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
            <caption>Response Summary</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ListRelatedIncidentsResponse> executeWithHttpInfo() throws ApiException {
            return listRelatedIncidentsWithHttpInfo(INCIDENT_ID, limit, page, orderBy, orderDirection);
        }

        /**
         * Execute listRelatedIncidents request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ListRelatedIncidentsResponse> _callback) throws ApiException {
            return listRelatedIncidentsAsync(INCIDENT_ID, limit, page, orderBy, orderDirection, _callback);
        }
    }

    /**
     * List Related Incidents
     * Returns all the incidents that seem related to a specific incident.
     * @param INCIDENT_ID ID of the Incident (required)
     * @return APIlistRelatedIncidentsRequest
     * @http.response.details
     <table border="1">
        <caption>Response Summary</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIlistRelatedIncidentsRequest listRelatedIncidents(String INCIDENT_ID) {
        return new APIlistRelatedIncidentsRequest(INCIDENT_ID);
    }
}
