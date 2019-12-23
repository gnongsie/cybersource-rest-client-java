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

import Invokers.ApiException;
import Model.CheckPayerAuthEnrollmentRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.Request;
import Model.RiskV1AuthenticationExcemptionsPost400Response;
import Model.RiskV1AuthenticationResultsPost201Response;
import Model.RiskV1AuthenticationsPost201Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayerAuthenticationApi
 */
@Ignore
public class PayerAuthenticationApiTest {

    private final PayerAuthenticationApi api = new PayerAuthenticationApi();

    
    /**
     * Check payer auth enrollment
     *
     * This call verifies that the card is enrolled in a card authentication program.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkPayerAuthEnrollmentTest() throws ApiException {
        CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest = null;
        RiskV1AuthenticationsPost201Response response = api.checkPayerAuthEnrollment(checkPayerAuthEnrollmentRequest);

        // TODO: test validations
    }
    
    /**
     * Validate authentication results
     *
     * This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateAuthenticationResultsTest() throws ApiException {
        Request request = null;
        RiskV1AuthenticationResultsPost201Response response = api.validateAuthenticationResults(request);

        // TODO: test validations
    }
    
}