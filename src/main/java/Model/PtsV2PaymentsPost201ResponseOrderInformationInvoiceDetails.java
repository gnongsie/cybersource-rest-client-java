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

/**
 * PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails {
  @SerializedName("level3TransmissionStatus")
  private Boolean level3TransmissionStatus = null;

  @SerializedName("salesSlipNumber")
  private Integer salesSlipNumber = null;

  public PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails level3TransmissionStatus(Boolean level3TransmissionStatus) {
    this.level3TransmissionStatus = level3TransmissionStatus;
    return this;
  }

   /**
   * Indicates whether CyberSource sent the Level III information to the processor. The possible values are:  If your account is not enabled for Level III data or if you did not include the purchasing level field in your request, CyberSource does not include the Level III data in the request sent to the processor.  For processor-specific information, see the &#x60;bill_purchasing_level3_enabled&#x60; field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html)  Possible values: - **true** - **false** 
   * @return level3TransmissionStatus
  **/
  @ApiModelProperty(value = "Indicates whether CyberSource sent the Level III information to the processor. The possible values are:  If your account is not enabled for Level III data or if you did not include the purchasing level field in your request, CyberSource does not include the Level III data in the request sent to the processor.  For processor-specific information, see the `bill_purchasing_level3_enabled` field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html)  Possible values: - **true** - **false** ")
  public Boolean getLevel3TransmissionStatus() {
    return level3TransmissionStatus;
  }

  public void setLevel3TransmissionStatus(Boolean level3TransmissionStatus) {
    this.level3TransmissionStatus = level3TransmissionStatus;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails salesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
    return this;
  }

   /**
   * Transaction identifier that CyberSource generates. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway. 
   * maximum: 99999
   * @return salesSlipNumber
  **/
  @ApiModelProperty(value = "Transaction identifier that CyberSource generates. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway. ")
  public Integer getSalesSlipNumber() {
    return salesSlipNumber;
  }

  public void setSalesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails ptsV2PaymentsPost201ResponseOrderInformationInvoiceDetails = (PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails) o;
    return Objects.equals(this.level3TransmissionStatus, ptsV2PaymentsPost201ResponseOrderInformationInvoiceDetails.level3TransmissionStatus) &&
        Objects.equals(this.salesSlipNumber, ptsV2PaymentsPost201ResponseOrderInformationInvoiceDetails.salesSlipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level3TransmissionStatus, salesSlipNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseOrderInformationInvoiceDetails {\n");
    
    sb.append("    level3TransmissionStatus: ").append(toIndentedString(level3TransmissionStatus)).append("\n");
    sb.append("    salesSlipNumber: ").append(toIndentedString(salesSlipNumber)).append("\n");
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

