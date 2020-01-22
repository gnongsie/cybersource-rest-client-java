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
import Model.Riskv1authenticationsTravelInformationLegs;
import Model.Riskv1authenticationsTravelInformationPassengers;
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
 * Riskv1authenticationsTravelInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class Riskv1authenticationsTravelInformation {
  @SerializedName("legs")
  private List<Riskv1authenticationsTravelInformationLegs> legs = null;

  @SerializedName("numberOfPassengers")
  private Integer numberOfPassengers = null;

  @SerializedName("passengers")
  private List<Riskv1authenticationsTravelInformationPassengers> passengers = null;

  public Riskv1authenticationsTravelInformation legs(List<Riskv1authenticationsTravelInformationLegs> legs) {
    this.legs = legs;
    return this;
  }

  public Riskv1authenticationsTravelInformation addLegsItem(Riskv1authenticationsTravelInformationLegs legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<Riskv1authenticationsTravelInformationLegs>();
    }
    this.legs.add(legsItem);
    return this;
  }

   /**
   * Get legs
   * @return legs
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1authenticationsTravelInformationLegs> getLegs() {
    return legs;
  }

  public void setLegs(List<Riskv1authenticationsTravelInformationLegs> legs) {
    this.legs = legs;
  }

  public Riskv1authenticationsTravelInformation numberOfPassengers(Integer numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
    return this;
  }

   /**
   * Number of passengers for whom the ticket was issued. If you do not include this field in your request, CyberSource uses a default value of 1. Required for American Express SafeKey (U.S.) for travel-related requests. 
   * @return numberOfPassengers
  **/
  @ApiModelProperty(value = "Number of passengers for whom the ticket was issued. If you do not include this field in your request, CyberSource uses a default value of 1. Required for American Express SafeKey (U.S.) for travel-related requests. ")
  public Integer getNumberOfPassengers() {
    return numberOfPassengers;
  }

  public void setNumberOfPassengers(Integer numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }

  public Riskv1authenticationsTravelInformation passengers(List<Riskv1authenticationsTravelInformationPassengers> passengers) {
    this.passengers = passengers;
    return this;
  }

  public Riskv1authenticationsTravelInformation addPassengersItem(Riskv1authenticationsTravelInformationPassengers passengersItem) {
    if (this.passengers == null) {
      this.passengers = new ArrayList<Riskv1authenticationsTravelInformationPassengers>();
    }
    this.passengers.add(passengersItem);
    return this;
  }

   /**
   * Get passengers
   * @return passengers
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1authenticationsTravelInformationPassengers> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Riskv1authenticationsTravelInformationPassengers> passengers) {
    this.passengers = passengers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsTravelInformation riskv1authenticationsTravelInformation = (Riskv1authenticationsTravelInformation) o;
    return Objects.equals(this.legs, riskv1authenticationsTravelInformation.legs) &&
        Objects.equals(this.numberOfPassengers, riskv1authenticationsTravelInformation.numberOfPassengers) &&
        Objects.equals(this.passengers, riskv1authenticationsTravelInformation.passengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legs, numberOfPassengers, passengers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsTravelInformation {\n");
    
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    numberOfPassengers: ").append(toIndentedString(numberOfPassengers)).append("\n");
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
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

