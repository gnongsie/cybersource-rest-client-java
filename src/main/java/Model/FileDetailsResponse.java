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
import Model.V1FileDetailsGet200ResponseFileDetails;
import Model.V1FileDetailsGet200ResponseLinks;
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
 * FileDetailsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class FileDetailsResponse {
  @SerializedName("fileDetails")
  private List<V1FileDetailsGet200ResponseFileDetails> fileDetails = null;

  @SerializedName("_links")
  private V1FileDetailsGet200ResponseLinks links = null;

  public FileDetailsResponse fileDetails(List<V1FileDetailsGet200ResponseFileDetails> fileDetails) {
    this.fileDetails = fileDetails;
    return this;
  }

  public FileDetailsResponse addFileDetailsItem(V1FileDetailsGet200ResponseFileDetails fileDetailsItem) {
    if (this.fileDetails == null) {
      this.fileDetails = new ArrayList<V1FileDetailsGet200ResponseFileDetails>();
    }
    this.fileDetails.add(fileDetailsItem);
    return this;
  }

   /**
   * Get fileDetails
   * @return fileDetails
  **/
  @ApiModelProperty(value = "")
  public List<V1FileDetailsGet200ResponseFileDetails> getFileDetails() {
    return fileDetails;
  }

  public void setFileDetails(List<V1FileDetailsGet200ResponseFileDetails> fileDetails) {
    this.fileDetails = fileDetails;
  }

  public FileDetailsResponse links(V1FileDetailsGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public V1FileDetailsGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(V1FileDetailsGet200ResponseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDetailsResponse fileDetailsResponse = (FileDetailsResponse) o;
    return Objects.equals(this.fileDetails, fileDetailsResponse.fileDetails) &&
        Objects.equals(this.links, fileDetailsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileDetails, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDetailsResponse {\n");
    
    sb.append("    fileDetails: ").append(toIndentedString(fileDetails)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

