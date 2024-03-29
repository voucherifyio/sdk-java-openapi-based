/*
 * Voucherify API
 * Voucherify promotion engine REST API. Please see https://docs.voucherify.io/docs for more details.
 *
 * The version of the OpenAPI document: v2018-08-01
 * Contact: support@voucherify.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package voucherify.client.api;

import voucherify.client.ApiCallback;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.ApiResponse;
import voucherify.client.Configuration;
import voucherify.client.Pair;
import voucherify.client.ProgressRequestBody;
import voucherify.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import voucherify.client.model.ClientEventsCreateRequestBody;
import voucherify.client.model.ClientEventsCreateResponseBody;
import voucherify.client.model.EventsCreateRequestBody;
import voucherify.client.model.EventsCreateResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for trackCustomEvent
     * @param eventsCreateRequestBody Specify the details of the custom event. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call trackCustomEventCall(EventsCreateRequestBody eventsCreateRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = eventsCreateRequestBody;

        // create path and map variables
        String localVarPath = "/v1/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "X-App-Id", "X-App-Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call trackCustomEventValidateBeforeCall(EventsCreateRequestBody eventsCreateRequestBody, final ApiCallback _callback) throws ApiException {
        return trackCustomEventCall(eventsCreateRequestBody, _callback);

    }

    /**
     * Track Custom Event
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param eventsCreateRequestBody Specify the details of the custom event. (optional)
     * @return EventsCreateResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public EventsCreateResponseBody trackCustomEvent(EventsCreateRequestBody eventsCreateRequestBody) throws ApiException {
        ApiResponse<EventsCreateResponseBody> localVarResp = trackCustomEventWithHttpInfo(eventsCreateRequestBody);
        return localVarResp.getData();
    }

    /**
     * Track Custom Event
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param eventsCreateRequestBody Specify the details of the custom event. (optional)
     * @return ApiResponse&lt;EventsCreateResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventsCreateResponseBody> trackCustomEventWithHttpInfo(EventsCreateRequestBody eventsCreateRequestBody) throws ApiException {
        okhttp3.Call localVarCall = trackCustomEventValidateBeforeCall(eventsCreateRequestBody, null);
        Type localVarReturnType = new TypeToken<EventsCreateResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Track Custom Event (asynchronously)
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param eventsCreateRequestBody Specify the details of the custom event. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call trackCustomEventAsync(EventsCreateRequestBody eventsCreateRequestBody, final ApiCallback<EventsCreateResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = trackCustomEventValidateBeforeCall(eventsCreateRequestBody, _callback);
        Type localVarReturnType = new TypeToken<EventsCreateResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for trackCustomEventClientSide
     * @param origin Indicates the origin (scheme, hostname, and port). (required)
     * @param clientEventsCreateRequestBody Specify the details of the custom event. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call trackCustomEventClientSideCall(String origin, ClientEventsCreateRequestBody clientEventsCreateRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = clientEventsCreateRequestBody;

        // create path and map variables
        String localVarPath = "/client/v1/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (origin != null) {
            localVarHeaderParams.put("origin", localVarApiClient.parameterToString(origin));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "X-Client-Application-Id", "X-Client-Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call trackCustomEventClientSideValidateBeforeCall(String origin, ClientEventsCreateRequestBody clientEventsCreateRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new ApiException("Missing the required parameter 'origin' when calling trackCustomEventClientSide(Async)");
        }

        return trackCustomEventClientSideCall(origin, clientEventsCreateRequestBody, _callback);

    }

    /**
     * Track Custom Event (client-side)
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param origin Indicates the origin (scheme, hostname, and port). (required)
     * @param clientEventsCreateRequestBody Specify the details of the custom event. (optional)
     * @return ClientEventsCreateResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public ClientEventsCreateResponseBody trackCustomEventClientSide(String origin, ClientEventsCreateRequestBody clientEventsCreateRequestBody) throws ApiException {
        ApiResponse<ClientEventsCreateResponseBody> localVarResp = trackCustomEventClientSideWithHttpInfo(origin, clientEventsCreateRequestBody);
        return localVarResp.getData();
    }

    /**
     * Track Custom Event (client-side)
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param origin Indicates the origin (scheme, hostname, and port). (required)
     * @param clientEventsCreateRequestBody Specify the details of the custom event. (optional)
     * @return ApiResponse&lt;ClientEventsCreateResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClientEventsCreateResponseBody> trackCustomEventClientSideWithHttpInfo(String origin, ClientEventsCreateRequestBody clientEventsCreateRequestBody) throws ApiException {
        okhttp3.Call localVarCall = trackCustomEventClientSideValidateBeforeCall(origin, clientEventsCreateRequestBody, null);
        Type localVarReturnType = new TypeToken<ClientEventsCreateResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Track Custom Event (client-side) (asynchronously)
     * To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.
     * @param origin Indicates the origin (scheme, hostname, and port). (required)
     * @param clientEventsCreateRequestBody Specify the details of the custom event. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the event type if the event was received by the application. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call trackCustomEventClientSideAsync(String origin, ClientEventsCreateRequestBody clientEventsCreateRequestBody, final ApiCallback<ClientEventsCreateResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = trackCustomEventClientSideValidateBeforeCall(origin, clientEventsCreateRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ClientEventsCreateResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
