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
import Model.Riskv1authenticationsRiskInformationBuyerHistory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationsRiskInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Riskv1authenticationsRiskInformation {
  @SerializedName("buyerHistory")
  private Riskv1authenticationsRiskInformationBuyerHistory buyerHistory = null;

  public Riskv1authenticationsRiskInformation buyerHistory(Riskv1authenticationsRiskInformationBuyerHistory buyerHistory) {
    this.buyerHistory = buyerHistory;
    return this;
  }

   /**
   * Get buyerHistory
   * @return buyerHistory
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsRiskInformationBuyerHistory getBuyerHistory() {
    return buyerHistory;
  }

  public void setBuyerHistory(Riskv1authenticationsRiskInformationBuyerHistory buyerHistory) {
    this.buyerHistory = buyerHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsRiskInformation riskv1authenticationsRiskInformation = (Riskv1authenticationsRiskInformation) o;
    return Objects.equals(this.buyerHistory, riskv1authenticationsRiskInformation.buyerHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsRiskInformation {\n");
    
    sb.append("    buyerHistory: ").append(toIndentedString(buyerHistory)).append("\n");
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

