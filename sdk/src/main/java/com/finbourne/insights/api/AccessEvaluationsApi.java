/*
 * FINBOURNE Insights API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.289
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.insights.api;

import com.finbourne.insights.ApiCallback;
import com.finbourne.insights.ApiClient;
import com.finbourne.insights.ApiException;
import com.finbourne.insights.ApiResponse;
import com.finbourne.insights.Configuration;
import com.finbourne.insights.Pair;
import com.finbourne.insights.ProgressRequestBody;
import com.finbourne.insights.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.insights.model.AccessEvaluationLog;
import com.finbourne.insights.model.LusidProblemDetails;
import com.finbourne.insights.model.LusidValidationProblemDetails;
import com.finbourne.insights.model.ResourceListWithHistogramOfAccessEvaluationLog;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessEvaluationsApi {
    private ApiClient localVarApiClient;
    public AccessEvaluationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessEvaluationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAccessEvaluationLog
     * @param id The identifier of the access evaluation to obtain the log for. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessEvaluationLogCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/access/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.289");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessEvaluationLogValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAccessEvaluationLog(Async)");
        }
        

        okhttp3.Call localVarCall = getAccessEvaluationLogCall(id, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] GetAccessEvaluationLog: Get the log for a specific access evaluation.
     * 
     * @param id The identifier of the access evaluation to obtain the log for. (required)
     * @return AccessEvaluationLog
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AccessEvaluationLog getAccessEvaluationLog(String id) throws ApiException {
        ApiResponse<AccessEvaluationLog> localVarResp = getAccessEvaluationLogWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetAccessEvaluationLog: Get the log for a specific access evaluation.
     * 
     * @param id The identifier of the access evaluation to obtain the log for. (required)
     * @return ApiResponse&lt;AccessEvaluationLog&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessEvaluationLog> getAccessEvaluationLogWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getAccessEvaluationLogValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<AccessEvaluationLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetAccessEvaluationLog: Get the log for a specific access evaluation. (asynchronously)
     * 
     * @param id The identifier of the access evaluation to obtain the log for. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessEvaluationLogAsync(String id, final ApiCallback<AccessEvaluationLog> _callback) throws ApiException {
        okhttp3.Call localVarCall = getAccessEvaluationLogValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<AccessEvaluationLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAccessEvaluationLogs
     * @param filter Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. (optional)
     * @param sortBy Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName (optional)
     * @param limit When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. (optional)
     * @param page Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. (optional)
     * @param histogramInterval The interval for an included histogram of the logs (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAccessEvaluationLogsCall(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/access";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (histogramInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("histogramInterval", histogramInterval));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.289");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAccessEvaluationLogsValidateBeforeCall(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listAccessEvaluationLogsCall(filter, sortBy, limit, page, histogramInterval, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListAccessEvaluationLogs: List the logs for access evaluations.
     * 
     * @param filter Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. (optional)
     * @param sortBy Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName (optional)
     * @param limit When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. (optional)
     * @param page Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. (optional)
     * @param histogramInterval The interval for an included histogram of the logs (optional)
     * @return ResourceListWithHistogramOfAccessEvaluationLog
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListWithHistogramOfAccessEvaluationLog listAccessEvaluationLogs(String filter, String sortBy, Integer limit, String page, String histogramInterval) throws ApiException {
        ApiResponse<ResourceListWithHistogramOfAccessEvaluationLog> localVarResp = listAccessEvaluationLogsWithHttpInfo(filter, sortBy, limit, page, histogramInterval);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListAccessEvaluationLogs: List the logs for access evaluations.
     * 
     * @param filter Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. (optional)
     * @param sortBy Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName (optional)
     * @param limit When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. (optional)
     * @param page Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. (optional)
     * @param histogramInterval The interval for an included histogram of the logs (optional)
     * @return ApiResponse&lt;ResourceListWithHistogramOfAccessEvaluationLog&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListWithHistogramOfAccessEvaluationLog> listAccessEvaluationLogsWithHttpInfo(String filter, String sortBy, Integer limit, String page, String histogramInterval) throws ApiException {
        okhttp3.Call localVarCall = listAccessEvaluationLogsValidateBeforeCall(filter, sortBy, limit, page, histogramInterval, null);
        Type localVarReturnType = new TypeToken<ResourceListWithHistogramOfAccessEvaluationLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListAccessEvaluationLogs: List the logs for access evaluations. (asynchronously)
     * 
     * @param filter Expression to filter the result set. Read more about &lt;see href&#x3D;\&quot;https://support.lusid.com/filtering-results-from-lusid\&quot;&gt; filtering results from LUSID&lt;/see&gt;. (optional)
     * @param sortBy Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName (optional)
     * @param limit When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. (optional)
     * @param page Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. (optional)
     * @param histogramInterval The interval for an included histogram of the logs (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAccessEvaluationLogsAsync(String filter, String sortBy, Integer limit, String page, String histogramInterval, final ApiCallback<ResourceListWithHistogramOfAccessEvaluationLog> _callback) throws ApiException {
        okhttp3.Call localVarCall = listAccessEvaluationLogsValidateBeforeCall(filter, sortBy, limit, page, histogramInterval, _callback);
        Type localVarReturnType = new TypeToken<ResourceListWithHistogramOfAccessEvaluationLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
