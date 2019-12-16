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
import Model.Ptsv2paymentsOrderInformationAmountDetailsTaxDetails;
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
 * Ptsv2paymentsidrefundsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class Ptsv2paymentsidrefundsOrderInformationLineItems {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("taxRate")
  private String taxRate = null;

  @SerializedName("taxAppliedAfterDiscount")
  private String taxAppliedAfterDiscount = null;

  @SerializedName("taxStatusIndicator")
  private String taxStatusIndicator = null;

  @SerializedName("taxTypeCode")
  private String taxTypeCode = null;

  @SerializedName("amountIncludesTax")
  private Boolean amountIncludesTax = null;

  @SerializedName("typeOfSupply")
  private String typeOfSupply = null;

  @SerializedName("commodityCode")
  private String commodityCode = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("discountApplied")
  private Boolean discountApplied = null;

  @SerializedName("discountRate")
  private String discountRate = null;

  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("taxDetails")
  private List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails = null;

  public Ptsv2paymentsidrefundsOrderInformationLineItems productCode(String productCode) {
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

  public Ptsv2paymentsidrefundsOrderInformationLineItems productName(String productName) {
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

  public Ptsv2paymentsidrefundsOrderInformationLineItems productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling. 
   * @return productSku
  **/
  @ApiModelProperty(value = "Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling. ")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems quantity(Integer quantity) {
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

  public Ptsv2paymentsidrefundsOrderInformationLineItems unitPrice(String unitPrice) {
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

  public Ptsv2paymentsidrefundsOrderInformationLineItems unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure, or unit of measure code, for the item. 
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "Unit of measure, or unit of measure code, for the item. ")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount for the item. Normally calculated as the unit price times quantity.  When &#x60;orderInformation.lineItems[].productCode&#x60; is \&quot;gift_card\&quot;, this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD &#x3D; 123 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount for the item. Normally calculated as the unit price times quantity.  When `orderInformation.lineItems[].productCode` is \"gift_card\", this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD = 123 ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  If you want to include the tax amount and also request the ics_tax service, see Tax Calculation Service Using the SCMP API.  This field is frequently used for Level II and Level III transactions. For details, see &#x60;tax_amount&#x60; field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount=10.00, quantity=1, and taxAmount=0.80  ..- 2nd line item has amount=20.00, quantity=1, and taxAmount=1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  If you want to include the tax amount and also request the ics_tax service, see Tax Calculation Service Using the SCMP API.  This field is frequently used for Level II and Level III transactions. For details, see `tax_amount` field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate applied to the item.  For details, see &#x60;tax_rate&#x60; field description in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  **Visa**: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  **Mastercard**: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). 
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax rate applied to the item.  For details, see `tax_rate` field description in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  **Visa**: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  **Mastercard**: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%). ")
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
    return this;
  }

   /**
   * Flag to indicate how you handle discount at the line item level.   - 0: no line level discount provided  - 1: tax was calculated on the post-discount line item total  - 2: tax was calculated on the pre-discount line item total  &#x60;Note&#x60; Visa will inset 0 (zero) if an invalid value is included in this field.  This field relates to the value in the _lineItems[].discountAmount_ field. 
   * @return taxAppliedAfterDiscount
  **/
  @ApiModelProperty(value = "Flag to indicate how you handle discount at the line item level.   - 0: no line level discount provided  - 1: tax was calculated on the post-discount line item total  - 2: tax was calculated on the pre-discount line item total  `Note` Visa will inset 0 (zero) if an invalid value is included in this field.  This field relates to the value in the _lineItems[].discountAmount_ field. ")
  public String getTaxAppliedAfterDiscount() {
    return taxAppliedAfterDiscount;
  }

  public void setTaxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxStatusIndicator(String taxStatusIndicator) {
    this.taxStatusIndicator = taxStatusIndicator;
    return this;
  }

   /**
   * Flag to indicate whether tax is exempted or not included.   - 0: tax not included  - 1: tax included  - 2: transaction is not subject to tax 
   * @return taxStatusIndicator
  **/
  @ApiModelProperty(value = "Flag to indicate whether tax is exempted or not included.   - 0: tax not included  - 1: tax included  - 2: transaction is not subject to tax ")
  public String getTaxStatusIndicator() {
    return taxStatusIndicator;
  }

  public void setTaxStatusIndicator(String taxStatusIndicator) {
    this.taxStatusIndicator = taxStatusIndicator;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

   /**
   * Type of tax being applied to the item.  For possible values, see the processor-specific field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm):  #### FDC Nashville Global - &#x60;alternate_tax_type_applied&#x60; - &#x60;alternate_tax_type_identifier&#x60;  #### Worldpay VAP - &#x60;alternate_tax_type_identifier&#x60;  #### RBS WorldPay Atlanta - &#x60;tax_type_applied&#x60;  #### TSYS Acquiring Solutions - &#x60;tax_type_applied&#x60; - &#x60;local_tax_indicator&#x60;  #### Chase Paymentech Solutions - &#x60;tax_type_applied&#x60;  #### Elavon Americas - &#x60;local_tax_indicator&#x60;  #### FDC Compass - &#x60;tax_type_applied&#x60;  #### OmniPay Direct - &#x60;local_tax_indicator&#x60; 
   * @return taxTypeCode
  **/
  @ApiModelProperty(value = "Type of tax being applied to the item.  For possible values, see the processor-specific field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm):  #### FDC Nashville Global - `alternate_tax_type_applied` - `alternate_tax_type_identifier`  #### Worldpay VAP - `alternate_tax_type_identifier`  #### RBS WorldPay Atlanta - `tax_type_applied`  #### TSYS Acquiring Solutions - `tax_type_applied` - `local_tax_indicator`  #### Chase Paymentech Solutions - `tax_type_applied`  #### Elavon Americas - `local_tax_indicator`  #### FDC Compass - `tax_type_applied`  #### OmniPay Direct - `local_tax_indicator` ")
  public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems amountIncludesTax(Boolean amountIncludesTax) {
    this.amountIncludesTax = amountIncludesTax;
    return this;
  }

   /**
   * Flag that indicates whether the tax amount is included in the Line Item Total.  Possible values:  - **true**  - **false** 
   * @return amountIncludesTax
  **/
  @ApiModelProperty(value = "Flag that indicates whether the tax amount is included in the Line Item Total.  Possible values:  - **true**  - **false** ")
  public Boolean getAmountIncludesTax() {
    return amountIncludesTax;
  }

  public void setAmountIncludesTax(Boolean amountIncludesTax) {
    this.amountIncludesTax = amountIncludesTax;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems typeOfSupply(String typeOfSupply) {
    this.typeOfSupply = typeOfSupply;
    return this;
  }

   /**
   * Flag to indicate whether the purchase is categorized as goods or services. Possible values:   - 00: goods  - 01: services 
   * @return typeOfSupply
  **/
  @ApiModelProperty(value = "Flag to indicate whether the purchase is categorized as goods or services. Possible values:   - 00: goods  - 01: services ")
  public String getTypeOfSupply() {
    return typeOfSupply;
  }

  public void setTypeOfSupply(String typeOfSupply) {
    this.typeOfSupply = typeOfSupply;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * Commodity code or International description code used to classify the item. Contact your acquirer for a list of codes. 
   * @return commodityCode
  **/
  @ApiModelProperty(value = "Commodity code or International description code used to classify the item. Contact your acquirer for a list of codes. ")
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Discount applied to the item.
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Discount applied to the item.")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems discountApplied(Boolean discountApplied) {
    this.discountApplied = discountApplied;
    return this;
  }

   /**
   * Flag that indicates whether the amount is discounted.  If you do not provide a value but you set Discount Amount to a value greater than zero, then CyberSource sets this field to **true**.  Possible values:  - **true**  - **false** 
   * @return discountApplied
  **/
  @ApiModelProperty(value = "Flag that indicates whether the amount is discounted.  If you do not provide a value but you set Discount Amount to a value greater than zero, then CyberSource sets this field to **true**.  Possible values:  - **true**  - **false** ")
  public Boolean getDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(Boolean discountApplied) {
    this.discountApplied = discountApplied;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems discountRate(String discountRate) {
    this.discountRate = discountRate;
    return this;
  }

   /**
   * Rate the item is discounted. Maximum of 2 decimal places.  Example 5.25 (&#x3D;5.25%) 
   * @return discountRate
  **/
  @ApiModelProperty(value = "Rate the item is discounted. Maximum of 2 decimal places.  Example 5.25 (=5.25%) ")
  public String getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(String discountRate) {
    this.discountRate = discountRate;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Field to support an invoice number for a transaction. You must specify the number of line items that will include an invoice number. By default, the first line item will include an invoice number field. The invoice number field can be included for up to 10 line items. 
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Field to support an invoice number for a transaction. You must specify the number of line items that will include an invoice number. By default, the first line item will include an invoice number field. The invoice number field can be included for up to 10 line items. ")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems taxDetails(List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public Ptsv2paymentsidrefundsOrderInformationLineItems addTaxDetailsItem(Ptsv2paymentsOrderInformationAmountDetailsTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsOrderInformationLineItems ptsv2paymentsidrefundsOrderInformationLineItems = (Ptsv2paymentsidrefundsOrderInformationLineItems) o;
    return Objects.equals(this.productCode, ptsv2paymentsidrefundsOrderInformationLineItems.productCode) &&
        Objects.equals(this.productName, ptsv2paymentsidrefundsOrderInformationLineItems.productName) &&
        Objects.equals(this.productSku, ptsv2paymentsidrefundsOrderInformationLineItems.productSku) &&
        Objects.equals(this.quantity, ptsv2paymentsidrefundsOrderInformationLineItems.quantity) &&
        Objects.equals(this.unitPrice, ptsv2paymentsidrefundsOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.unitOfMeasure, ptsv2paymentsidrefundsOrderInformationLineItems.unitOfMeasure) &&
        Objects.equals(this.totalAmount, ptsv2paymentsidrefundsOrderInformationLineItems.totalAmount) &&
        Objects.equals(this.taxAmount, ptsv2paymentsidrefundsOrderInformationLineItems.taxAmount) &&
        Objects.equals(this.taxRate, ptsv2paymentsidrefundsOrderInformationLineItems.taxRate) &&
        Objects.equals(this.taxAppliedAfterDiscount, ptsv2paymentsidrefundsOrderInformationLineItems.taxAppliedAfterDiscount) &&
        Objects.equals(this.taxStatusIndicator, ptsv2paymentsidrefundsOrderInformationLineItems.taxStatusIndicator) &&
        Objects.equals(this.taxTypeCode, ptsv2paymentsidrefundsOrderInformationLineItems.taxTypeCode) &&
        Objects.equals(this.amountIncludesTax, ptsv2paymentsidrefundsOrderInformationLineItems.amountIncludesTax) &&
        Objects.equals(this.typeOfSupply, ptsv2paymentsidrefundsOrderInformationLineItems.typeOfSupply) &&
        Objects.equals(this.commodityCode, ptsv2paymentsidrefundsOrderInformationLineItems.commodityCode) &&
        Objects.equals(this.discountAmount, ptsv2paymentsidrefundsOrderInformationLineItems.discountAmount) &&
        Objects.equals(this.discountApplied, ptsv2paymentsidrefundsOrderInformationLineItems.discountApplied) &&
        Objects.equals(this.discountRate, ptsv2paymentsidrefundsOrderInformationLineItems.discountRate) &&
        Objects.equals(this.invoiceNumber, ptsv2paymentsidrefundsOrderInformationLineItems.invoiceNumber) &&
        Objects.equals(this.taxDetails, ptsv2paymentsidrefundsOrderInformationLineItems.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productName, productSku, quantity, unitPrice, unitOfMeasure, totalAmount, taxAmount, taxRate, taxAppliedAfterDiscount, taxStatusIndicator, taxTypeCode, amountIncludesTax, typeOfSupply, commodityCode, discountAmount, discountApplied, discountRate, invoiceNumber, taxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsOrderInformationLineItems {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAppliedAfterDiscount: ").append(toIndentedString(taxAppliedAfterDiscount)).append("\n");
    sb.append("    taxStatusIndicator: ").append(toIndentedString(taxStatusIndicator)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    amountIncludesTax: ").append(toIndentedString(amountIncludesTax)).append("\n");
    sb.append("    typeOfSupply: ").append(toIndentedString(typeOfSupply)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountApplied: ").append(toIndentedString(discountApplied)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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

