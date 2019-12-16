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
 * PtsV2PaymentsPost201ResponseProcessorInformationCardVerification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationCardVerification {
  @SerializedName("resultCode")
  private String resultCode = null;

  @SerializedName("resultCodeRaw")
  private String resultCodeRaw = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationCardVerification resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * CVN result code.  For details, see the &#x60;auth_cv_result&#x60; reply field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return resultCode
  **/
  @ApiModelProperty(value = "CVN result code.  For details, see the `auth_cv_result` reply field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationCardVerification resultCodeRaw(String resultCodeRaw) {
    this.resultCodeRaw = resultCodeRaw;
    return this;
  }

   /**
   * CVN result code sent directly from the processor. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of card verification. Use for debugging purposes only. 
   * @return resultCodeRaw
  **/
  @ApiModelProperty(value = "CVN result code sent directly from the processor. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of card verification. Use for debugging purposes only. ")
  public String getResultCodeRaw() {
    return resultCodeRaw;
  }

  public void setResultCodeRaw(String resultCodeRaw) {
    this.resultCodeRaw = resultCodeRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationCardVerification ptsV2PaymentsPost201ResponseProcessorInformationCardVerification = (PtsV2PaymentsPost201ResponseProcessorInformationCardVerification) o;
    return Objects.equals(this.resultCode, ptsV2PaymentsPost201ResponseProcessorInformationCardVerification.resultCode) &&
        Objects.equals(this.resultCodeRaw, ptsV2PaymentsPost201ResponseProcessorInformationCardVerification.resultCodeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, resultCodeRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationCardVerification {\n");
    
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultCodeRaw: ").append(toIndentedString(resultCodeRaw)).append("\n");
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

