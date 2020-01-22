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
 * Address Verification Service
 */
@ApiModel(description = "Address Verification Service")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class Riskv1decisionsProcessorInformationAvs {
  @SerializedName("code")
  private String code = null;

  public Riskv1decisionsProcessorInformationAvs code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Value returned for address verification from the Payments Authorization response.
   * @return code
  **/
  @ApiModelProperty(value = "Value returned for address verification from the Payments Authorization response.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsProcessorInformationAvs riskv1decisionsProcessorInformationAvs = (Riskv1decisionsProcessorInformationAvs) o;
    return Objects.equals(this.code, riskv1decisionsProcessorInformationAvs.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsProcessorInformationAvs {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

