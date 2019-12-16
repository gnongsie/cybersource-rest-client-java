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
import Model.AuthenticationExemptionsRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AuthenticationExcemptionsPost400Response;
import Model.RiskV1AuthenticationExemptionsPost201Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationExemptionsApi
 */
@Ignore
public class AuthenticationExemptionsApiTest {

    private final AuthenticationExemptionsApi api = new AuthenticationExemptionsApi();

    
    /**
     * Authentication exemptions service
     *
     * A new CYBS branded service to connect to VISA’s REST API to enable Visa Transaction Advisor (VTA) as a standalone service for merchants to support PSD2/SCA adoption and exemptions processing startegy in Europe.VTA Provides intelligent risk data to merchants as inputs to their in-house fraud management tools for fraud mitigation on Visa transactions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticationExemptionsTest() throws ApiException {
        AuthenticationExemptionsRequest authenticationExemptionsRequest = null;
        RiskV1AuthenticationExemptionsPost201Response response = api.authenticationExemptions(authenticationExemptionsRequest);

        // TODO: test validations
    }
    
}
