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
 * PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions {
  @SerializedName("settlementMethod")
  private String settlementMethod = null;

  public PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions settlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
    return this;
  }

   /**
   * Method used for settlement.  Possible values: - &#x60;A&#x60;: Automated Clearing House (default for credits and for transactions using Canadian dollars) - &#x60;F&#x60;: Facsimile draft (U.S. dollars only) - &#x60;B&#x60;: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see &#x60;ecp_settlement_method&#x60; field description for credit cars and &#x60;ecp_debit_settlement_method&#x60; for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return settlementMethod
  **/
  @ApiModelProperty(value = "Method used for settlement.  Possible values: - `A`: Automated Clearing House (default for credits and for transactions using Canadian dollars) - `F`: Facsimile draft (U.S. dollars only) - `B`: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see `ecp_settlement_method` field description for credit cars and `ecp_debit_settlement_method` for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getSettlementMethod() {
    return settlementMethod;
  }

  public void setSettlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions ptsV2CreditsPost201ResponseProcessingInformationBankTransferOptions = (PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.settlementMethod, ptsV2CreditsPost201ResponseProcessingInformationBankTransferOptions.settlementMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions {\n");
    
    sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
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

