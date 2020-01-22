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
import Model.Riskv1decisionsOrderInformationPassenger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-22T15:22:15.661+05:30")
public class Riskv1decisionsOrderInformationLineItems {
  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("productSKU")
  private String productSKU = null;

  @SerializedName("productRisk")
  private String productRisk = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("gift")
  private Boolean gift = null;

  @SerializedName("distributorProductSku")
  private String distributorProductSku = null;

  @SerializedName("passenger")
  private Riskv1decisionsOrderInformationPassenger passenger = null;

  public Riskv1decisionsOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the &#x60;amount&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. See these guides for details: - [Merchant Descriptors Using the SCMP API Guide] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) - \&quot;Capture Information for Specific Processors\&quot; section in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request. For details, see \&quot;Dynamic Currency Conversion with a Third Party Provider\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the `amount` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. See these guides for details: - [Merchant Descriptors Using the SCMP API Guide] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) - \"Capture Information for Specific Processors\" section in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field `orderInformation.amountDetails.totalAmount` in your request. For details, see \"Dynamic Currency Conversion with a Third Party Provider\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \"Zero Amount Authorizations\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Riskv1decisionsOrderInformationLineItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of units for this order.  The default is &#x60;1&#x60;. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling.  When orderInformation.lineItems[].productCode is \&quot;gift_card\&quot;, this is the total count of individual prepaid gift cards purchased. 
   * minimum: 1
   * maximum: 999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of units for this order.  The default is `1`. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling.  When orderInformation.lineItems[].productCode is \"gift_card\", this is the total count of individual prepaid gift cards purchased. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Riskv1decisionsOrderInformationLineItems productSKU(String productSKU) {
    this.productSKU = productSKU;
    return this;
  }

   /**
   * Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling. 
   * @return productSKU
  **/
  @ApiModelProperty(value = "Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling. ")
  public String getProductSKU() {
    return productSKU;
  }

  public void setProductSKU(String productSKU) {
    this.productSKU = productSKU;
  }

  public Riskv1decisionsOrderInformationLineItems productRisk(String productRisk) {
    this.productRisk = productRisk;
    return this;
  }

   /**
   * Indicates the level of risk for the product. This field can contain one of the following values: - &#x60;low&#x60;: The product is associated with few chargebacks. - &#x60;normal&#x60;: The product is associated with a normal number of chargebacks. - &#x60;high&#x60;: The product is associated with many chargebacks. 
   * @return productRisk
  **/
  @ApiModelProperty(value = "Indicates the level of risk for the product. This field can contain one of the following values: - `low`: The product is associated with few chargebacks. - `normal`: The product is associated with a normal number of chargebacks. - `high`: The product is associated with many chargebacks. ")
  public String getProductRisk() {
    return productRisk;
  }

  public void setProductRisk(String productRisk) {
    this.productRisk = productRisk;
  }

  public Riskv1decisionsOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to &#x60;default&#x60; or one of the other values that are related to shipping and/or handling. 
   * @return productName
  **/
  @ApiModelProperty(value = "For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not set to `default` or one of the other values that are related to shipping and/or handling. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Riskv1decisionsOrderInformationLineItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**. If you are performing an authorization transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;false&#x60;), and you set this field to a value other than default or any of the values related to shipping and handling, then the fields &#x60;quantity&#x60;, &#x60;productName&#x60;, and &#x60;productSku&#x60; are required. It can also have a value of \&quot;gift_card\&quot;.  For details, see the &#x60;product_code&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return productCode
  **/
  @ApiModelProperty(value = "Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**. If you are performing an authorization transaction (`processingOptions.capture` is set to `false`), and you set this field to a value other than default or any of the values related to shipping and handling, then the fields `quantity`, `productName`, and `productSku` are required. It can also have a value of \"gift_card\".  For details, see the `product_code` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Riskv1decisionsOrderInformationLineItems gift(Boolean gift) {
    this.gift = gift;
    return this;
  }

   /**
   * Determines whether to assign risk to the order if the billing and shipping addresses specify different cities, states, or countries. This field can contain one of the following values: - true: Orders are assigned only slight additional risk if billing and shipping addresses are different. - false: Orders are assigned higher additional risk if billing and shipping addresses are different. 
   * @return gift
  **/
  @ApiModelProperty(value = "Determines whether to assign risk to the order if the billing and shipping addresses specify different cities, states, or countries. This field can contain one of the following values: - true: Orders are assigned only slight additional risk if billing and shipping addresses are different. - false: Orders are assigned higher additional risk if billing and shipping addresses are different. ")
  public Boolean getGift() {
    return gift;
  }

  public void setGift(Boolean gift) {
    this.gift = gift;
  }

  public Riskv1decisionsOrderInformationLineItems distributorProductSku(String distributorProductSku) {
    this.distributorProductSku = distributorProductSku;
    return this;
  }

   /**
   * Product’s identifier code. This field is inserted into the outgoing message without being parsed or formatted. This field is included as Distributor product SKU (Offer) in the list of API fields with which you can create custom rules. 
   * @return distributorProductSku
  **/
  @ApiModelProperty(value = "Product’s identifier code. This field is inserted into the outgoing message without being parsed or formatted. This field is included as Distributor product SKU (Offer) in the list of API fields with which you can create custom rules. ")
  public String getDistributorProductSku() {
    return distributorProductSku;
  }

  public void setDistributorProductSku(String distributorProductSku) {
    this.distributorProductSku = distributorProductSku;
  }

  public Riskv1decisionsOrderInformationLineItems passenger(Riskv1decisionsOrderInformationPassenger passenger) {
    this.passenger = passenger;
    return this;
  }

   /**
   * Get passenger
   * @return passenger
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationPassenger getPassenger() {
    return passenger;
  }

  public void setPassenger(Riskv1decisionsOrderInformationPassenger passenger) {
    this.passenger = passenger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsOrderInformationLineItems riskv1decisionsOrderInformationLineItems = (Riskv1decisionsOrderInformationLineItems) o;
    return Objects.equals(this.unitPrice, riskv1decisionsOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.quantity, riskv1decisionsOrderInformationLineItems.quantity) &&
        Objects.equals(this.productSKU, riskv1decisionsOrderInformationLineItems.productSKU) &&
        Objects.equals(this.productRisk, riskv1decisionsOrderInformationLineItems.productRisk) &&
        Objects.equals(this.productName, riskv1decisionsOrderInformationLineItems.productName) &&
        Objects.equals(this.productCode, riskv1decisionsOrderInformationLineItems.productCode) &&
        Objects.equals(this.gift, riskv1decisionsOrderInformationLineItems.gift) &&
        Objects.equals(this.distributorProductSku, riskv1decisionsOrderInformationLineItems.distributorProductSku) &&
        Objects.equals(this.passenger, riskv1decisionsOrderInformationLineItems.passenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, quantity, productSKU, productRisk, productName, productCode, gift, distributorProductSku, passenger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsOrderInformationLineItems {\n");
    
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productSKU: ").append(toIndentedString(productSKU)).append("\n");
    sb.append("    productRisk: ").append(toIndentedString(productRisk)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    distributorProductSku: ").append(toIndentedString(distributorProductSku)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
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

