/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.CheckPayerAuthEnrollmentRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AuthenticationExcemptionsPost400Response;
import Model.RiskV1AuthenticationResultsPost201Response;
import Model.RiskV1AuthenticationsPost201Response;
import Model.ValidateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayerAuthenticationApi {
    private ApiClient apiClient;

    public PayerAuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayerAuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for checkPayerAuthEnrollment
     * @param checkPayerAuthEnrollmentRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call checkPayerAuthEnrollmentCall(CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = checkPayerAuthEnrollmentRequest;
        
        // create path and map variables
        String localVarPath = "/risk/v1/authentications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkPayerAuthEnrollmentValidateBeforeCall(CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'checkPayerAuthEnrollmentRequest' is set
        if (checkPayerAuthEnrollmentRequest == null) {
            throw new ApiException("Missing the required parameter 'checkPayerAuthEnrollmentRequest' when calling checkPayerAuthEnrollment(Async)");
        }
        
        
        okhttp3.Call call = checkPayerAuthEnrollmentCall(checkPayerAuthEnrollmentRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check payer auth enrollment
     * This call verifies that the card is enrolled in a card authentication program.
     * @param checkPayerAuthEnrollmentRequest  (required)
     * @return RiskV1AuthenticationsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1AuthenticationsPost201Response checkPayerAuthEnrollment(CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest) throws ApiException {
        ApiResponse<RiskV1AuthenticationsPost201Response> resp = checkPayerAuthEnrollmentWithHttpInfo(checkPayerAuthEnrollmentRequest);
        return resp.getData();
    }

    /**
     * Check payer auth enrollment
     * This call verifies that the card is enrolled in a card authentication program.
     * @param checkPayerAuthEnrollmentRequest  (required)
     * @return ApiResponse&lt;RiskV1AuthenticationsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1AuthenticationsPost201Response> checkPayerAuthEnrollmentWithHttpInfo(CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest) throws ApiException {
        okhttp3.Call call = checkPayerAuthEnrollmentValidateBeforeCall(checkPayerAuthEnrollmentRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check payer auth enrollment (asynchronously)
     * This call verifies that the card is enrolled in a card authentication program.
     * @param checkPayerAuthEnrollmentRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call checkPayerAuthEnrollmentAsync(CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest, final ApiCallback<RiskV1AuthenticationsPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = checkPayerAuthEnrollmentValidateBeforeCall(checkPayerAuthEnrollmentRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validateAuthenticationResults
     * @param validateRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call validateAuthenticationResultsCall(ValidateRequest validateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = validateRequest;
        
        // create path and map variables
        String localVarPath = "/risk/v1/authentication-results";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateAuthenticationResultsValidateBeforeCall(ValidateRequest validateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'validateRequest' is set
        if (validateRequest == null) {
            throw new ApiException("Missing the required parameter 'validateRequest' when calling validateAuthenticationResults(Async)");
        }
        
        
        okhttp3.Call call = validateAuthenticationResultsCall(validateRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Validate authentication results
     * This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 
     * @param validateRequest  (required)
     * @return RiskV1AuthenticationResultsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1AuthenticationResultsPost201Response validateAuthenticationResults(ValidateRequest validateRequest) throws ApiException {
        ApiResponse<RiskV1AuthenticationResultsPost201Response> resp = validateAuthenticationResultsWithHttpInfo(validateRequest);
        return resp.getData();
    }

    /**
     * Validate authentication results
     * This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 
     * @param validateRequest  (required)
     * @return ApiResponse&lt;RiskV1AuthenticationResultsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1AuthenticationResultsPost201Response> validateAuthenticationResultsWithHttpInfo(ValidateRequest validateRequest) throws ApiException {
        okhttp3.Call call = validateAuthenticationResultsValidateBeforeCall(validateRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationResultsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Validate authentication results (asynchronously)
     * This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 
     * @param validateRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call validateAuthenticationResultsAsync(ValidateRequest validateRequest, final ApiCallback<RiskV1AuthenticationResultsPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = validateAuthenticationResultsValidateBeforeCall(validateRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationResultsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
