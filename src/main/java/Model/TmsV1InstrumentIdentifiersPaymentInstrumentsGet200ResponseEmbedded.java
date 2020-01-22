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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded {
  @SerializedName("paymentInstruments")
  private List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments> paymentInstruments = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded paymentInstruments(List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded addPaymentInstrumentsItem(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments paymentInstrumentsItem) {
    if (this.paymentInstruments == null) {
      this.paymentInstruments = new ArrayList<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments>();
    }
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * Array of Payment Instruments returned for the supplied Instrument Identifier.
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "Array of Payment Instruments returned for the supplied Instrument Identifier.")
  public List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments> getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(List<TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded) o;
    return Objects.equals(this.paymentInstruments, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded {\n");
    
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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

