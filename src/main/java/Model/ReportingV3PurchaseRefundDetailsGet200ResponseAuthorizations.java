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


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Authorization Info Values
 */
@ApiModel(description = "Authorization Info Values")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("transactionReferenceNumber")
  private String transactionReferenceNumber = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("authorizationRequestId")
  private String authorizationRequestId = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("rcode")
  private String rcode = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

   /**
   * Authorization Transaction Reference Number
   * @return transactionReferenceNumber
  **/
  @ApiModelProperty(example = "RZ3J9WCS9J27", value = "Authorization Transaction Reference Number")
  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Authorization Date
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Authorization Date")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations authorizationRequestId(String authorizationRequestId) {
    this.authorizationRequestId = authorizationRequestId;
    return this;
  }

   /**
   * Authorization Request Id
   * @return authorizationRequestId
  **/
  @ApiModelProperty(example = "12345678901234567890123459", value = "Authorization Request Id")
  public String getAuthorizationRequestId() {
    return authorizationRequestId;
  }

  public void setAuthorizationRequestId(String authorizationRequestId) {
    this.authorizationRequestId = authorizationRequestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Authorization Amount
   * @return amount
  **/
  @ApiModelProperty(example = "2.50", value = "Authorization Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Authorization Code
   * @return code
  **/
  @ApiModelProperty(example = "160780", value = "Authorization Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations rcode(String rcode) {
    this.rcode = rcode;
    return this;
  }

   /**
   * Authorization RCode
   * @return rcode
  **/
  @ApiModelProperty(example = "1", value = "Authorization RCode")
  public String getRcode() {
    return rcode;
  }

  public void setRcode(String rcode) {
    this.rcode = rcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations = (ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.requestId) &&
        Objects.equals(this.transactionReferenceNumber, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.transactionReferenceNumber) &&
        Objects.equals(this.time, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.time) &&
        Objects.equals(this.authorizationRequestId, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.authorizationRequestId) &&
        Objects.equals(this.amount, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.amount) &&
        Objects.equals(this.currencyCode, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.currencyCode) &&
        Objects.equals(this.code, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.code) &&
        Objects.equals(this.rcode, reportingV3PurchaseRefundDetailsGet200ResponseAuthorizations.rcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, transactionReferenceNumber, time, authorizationRequestId, amount, currencyCode, code, rcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseAuthorizations {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    authorizationRequestId: ").append(toIndentedString(authorizationRequestId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

