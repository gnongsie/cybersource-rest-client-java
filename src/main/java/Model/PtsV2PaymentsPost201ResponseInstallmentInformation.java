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
 * PtsV2PaymentsPost201ResponseInstallmentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class PtsV2PaymentsPost201ResponseInstallmentInformation {
  @SerializedName("additionalCosts")
  private String additionalCosts = null;

  @SerializedName("additionalCostsPercentage")
  private String additionalCostsPercentage = null;

  @SerializedName("amountFunded")
  private String amountFunded = null;

  @SerializedName("amountRequestedPercentage")
  private String amountRequestedPercentage = null;

  @SerializedName("annualFinancingCost")
  private String annualFinancingCost = null;

  @SerializedName("annualInterestRate")
  private String annualInterestRate = null;

  @SerializedName("expenses")
  private String expenses = null;

  @SerializedName("expensesPercentage")
  private String expensesPercentage = null;

  @SerializedName("fees")
  private String fees = null;

  @SerializedName("feesPercentage")
  private String feesPercentage = null;

  @SerializedName("insurance")
  private String insurance = null;

  @SerializedName("insurancePercentage")
  private String insurancePercentage = null;

  @SerializedName("monthlyInterestRate")
  private String monthlyInterestRate = null;

  @SerializedName("taxes")
  private String taxes = null;

  @SerializedName("taxesPercentage")
  private String taxesPercentage = null;

  public PtsV2PaymentsPost201ResponseInstallmentInformation additionalCosts(String additionalCosts) {
    this.additionalCosts = additionalCosts;
    return this;
  }

   /**
   * Additional costs charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 128-139 - Field: Total Other Costs 
   * @return additionalCosts
  **/
  @ApiModelProperty(value = "Additional costs charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 128-139 - Field: Total Other Costs ")
  public String getAdditionalCosts() {
    return additionalCosts;
  }

  public void setAdditionalCosts(String additionalCosts) {
    this.additionalCosts = additionalCosts;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation additionalCostsPercentage(String additionalCostsPercentage) {
    this.additionalCostsPercentage = additionalCostsPercentage;
    return this;
  }

   /**
   * Additional costs divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 140-143 - Field: Percent of Total Other Costs 
   * @return additionalCostsPercentage
  **/
  @ApiModelProperty(value = "Additional costs divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 140-143 - Field: Percent of Total Other Costs ")
  public String getAdditionalCostsPercentage() {
    return additionalCostsPercentage;
  }

  public void setAdditionalCostsPercentage(String additionalCostsPercentage) {
    this.additionalCostsPercentage = additionalCostsPercentage;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation amountFunded(String amountFunded) {
    this.amountFunded = amountFunded;
    return this;
  }

   /**
   * Amount funded.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 48-59 - Field: Total Amount Funded 
   * @return amountFunded
  **/
  @ApiModelProperty(value = "Amount funded.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 48-59 - Field: Total Amount Funded ")
  public String getAmountFunded() {
    return amountFunded;
  }

  public void setAmountFunded(String amountFunded) {
    this.amountFunded = amountFunded;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation amountRequestedPercentage(String amountRequestedPercentage) {
    this.amountRequestedPercentage = amountRequestedPercentage;
    return this;
  }

   /**
   * Amount requested divided by the amount funded.  For example: - A value of 90.0 specifies 90%. - A value of 93.7 specifies 93.7%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 60-63 - Field: Percent of Amount Requested 
   * @return amountRequestedPercentage
  **/
  @ApiModelProperty(value = "Amount requested divided by the amount funded.  For example: - A value of 90.0 specifies 90%. - A value of 93.7 specifies 93.7%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 60-63 - Field: Percent of Amount Requested ")
  public String getAmountRequestedPercentage() {
    return amountRequestedPercentage;
  }

  public void setAmountRequestedPercentage(String amountRequestedPercentage) {
    this.amountRequestedPercentage = amountRequestedPercentage;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation annualFinancingCost(String annualFinancingCost) {
    this.annualFinancingCost = annualFinancingCost;
    return this;
  }

   /**
   * Annual cost of financing the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 158-164 - Field: Annual Total Cost of Financing 
   * @return annualFinancingCost
  **/
  @ApiModelProperty(value = "Annual cost of financing the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 158-164 - Field: Annual Total Cost of Financing ")
  public String getAnnualFinancingCost() {
    return annualFinancingCost;
  }

  public void setAnnualFinancingCost(String annualFinancingCost) {
    this.annualFinancingCost = annualFinancingCost;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation annualInterestRate(String annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Annual interest rate.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 151-157 - Field: Annual Interest Rate 
   * @return annualInterestRate
  **/
  @ApiModelProperty(value = "Annual interest rate.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 151-157 - Field: Annual Interest Rate ")
  public String getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(String annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation expenses(String expenses) {
    this.expenses = expenses;
    return this;
  }

   /**
   * Expenses charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 64-75 - Field: Total Expenses 
   * @return expenses
  **/
  @ApiModelProperty(value = "Expenses charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 64-75 - Field: Total Expenses ")
  public String getExpenses() {
    return expenses;
  }

  public void setExpenses(String expenses) {
    this.expenses = expenses;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation expensesPercentage(String expensesPercentage) {
    this.expensesPercentage = expensesPercentage;
    return this;
  }

   /**
   * Expenses divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 76-79 - Field: Percent of Total Expenses 
   * @return expensesPercentage
  **/
  @ApiModelProperty(value = "Expenses divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 76-79 - Field: Percent of Total Expenses ")
  public String getExpensesPercentage() {
    return expensesPercentage;
  }

  public void setExpensesPercentage(String expensesPercentage) {
    this.expensesPercentage = expensesPercentage;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation fees(String fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Fees charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 80-91 - Field: Total Fees 
   * @return fees
  **/
  @ApiModelProperty(value = "Fees charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 80-91 - Field: Total Fees ")
  public String getFees() {
    return fees;
  }

  public void setFees(String fees) {
    this.fees = fees;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation feesPercentage(String feesPercentage) {
    this.feesPercentage = feesPercentage;
    return this;
  }

   /**
   * Fees divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 92-95 - Field: Percent of Total Fees 
   * @return feesPercentage
  **/
  @ApiModelProperty(value = "Fees divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 92-95 - Field: Percent of Total Fees ")
  public String getFeesPercentage() {
    return feesPercentage;
  }

  public void setFeesPercentage(String feesPercentage) {
    this.feesPercentage = feesPercentage;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation insurance(String insurance) {
    this.insurance = insurance;
    return this;
  }

   /**
   * Insurance charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 112-123 - Field: Total Insurance 
   * @return insurance
  **/
  @ApiModelProperty(value = "Insurance charged by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 112-123 - Field: Total Insurance ")
  public String getInsurance() {
    return insurance;
  }

  public void setInsurance(String insurance) {
    this.insurance = insurance;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation insurancePercentage(String insurancePercentage) {
    this.insurancePercentage = insurancePercentage;
    return this;
  }

   /**
   * Insurance costs divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 124-127 - Field: Percent Of Total Insurance 
   * @return insurancePercentage
  **/
  @ApiModelProperty(value = "Insurance costs divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 124-127 - Field: Percent Of Total Insurance ")
  public String getInsurancePercentage() {
    return insurancePercentage;
  }

  public void setInsurancePercentage(String insurancePercentage) {
    this.insurancePercentage = insurancePercentage;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation monthlyInterestRate(String monthlyInterestRate) {
    this.monthlyInterestRate = monthlyInterestRate;
    return this;
  }

   /**
   * Monthly interest rate.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 144-150 - Field: Monthly Interest Rate 
   * @return monthlyInterestRate
  **/
  @ApiModelProperty(value = "Monthly interest rate.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 144-150 - Field: Monthly Interest Rate ")
  public String getMonthlyInterestRate() {
    return monthlyInterestRate;
  }

  public void setMonthlyInterestRate(String monthlyInterestRate) {
    this.monthlyInterestRate = monthlyInterestRate;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation taxes(String taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Taxes collected by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 96-107 - Field: Total Taxes 
   * @return taxes
  **/
  @ApiModelProperty(value = "Taxes collected by the issuer to fund the installment payments.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 96-107 - Field: Total Taxes ")
  public String getTaxes() {
    return taxes;
  }

  public void setTaxes(String taxes) {
    this.taxes = taxes;
  }

  public PtsV2PaymentsPost201ResponseInstallmentInformation taxesPercentage(String taxesPercentage) {
    this.taxesPercentage = taxesPercentage;
    return this;
  }

   /**
   * Taxes divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder&#39;s request for Crediario installment payments in Brazil.  For details, see \&quot;Installment Payments on CyberSource through VisaNet\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 108-111 - Field: Percent of Total Taxes 
   * @return taxesPercentage
  **/
  @ApiModelProperty(value = "Taxes divided by the amount funded.  For example: - A value of 1.0 specifies 1%. - A value of 4.0 specifies 4%.  This field is included in the authorization reply for the Crediario eligibility request when the issuer approves the cardholder's request for Crediario installment payments in Brazil.  For details, see \"Installment Payments on CyberSource through VisaNet\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  This field is supported only for Crediario installment payments in Brazil on **CyberSource through VisaNet**.  The value for this field corresponds to the following data in the TC 33 capture file1: - Record: CP01 TCR9 - Position: 108-111 - Field: Percent of Total Taxes ")
  public String getTaxesPercentage() {
    return taxesPercentage;
  }

  public void setTaxesPercentage(String taxesPercentage) {
    this.taxesPercentage = taxesPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseInstallmentInformation ptsV2PaymentsPost201ResponseInstallmentInformation = (PtsV2PaymentsPost201ResponseInstallmentInformation) o;
    return Objects.equals(this.additionalCosts, ptsV2PaymentsPost201ResponseInstallmentInformation.additionalCosts) &&
        Objects.equals(this.additionalCostsPercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.additionalCostsPercentage) &&
        Objects.equals(this.amountFunded, ptsV2PaymentsPost201ResponseInstallmentInformation.amountFunded) &&
        Objects.equals(this.amountRequestedPercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.amountRequestedPercentage) &&
        Objects.equals(this.annualFinancingCost, ptsV2PaymentsPost201ResponseInstallmentInformation.annualFinancingCost) &&
        Objects.equals(this.annualInterestRate, ptsV2PaymentsPost201ResponseInstallmentInformation.annualInterestRate) &&
        Objects.equals(this.expenses, ptsV2PaymentsPost201ResponseInstallmentInformation.expenses) &&
        Objects.equals(this.expensesPercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.expensesPercentage) &&
        Objects.equals(this.fees, ptsV2PaymentsPost201ResponseInstallmentInformation.fees) &&
        Objects.equals(this.feesPercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.feesPercentage) &&
        Objects.equals(this.insurance, ptsV2PaymentsPost201ResponseInstallmentInformation.insurance) &&
        Objects.equals(this.insurancePercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.insurancePercentage) &&
        Objects.equals(this.monthlyInterestRate, ptsV2PaymentsPost201ResponseInstallmentInformation.monthlyInterestRate) &&
        Objects.equals(this.taxes, ptsV2PaymentsPost201ResponseInstallmentInformation.taxes) &&
        Objects.equals(this.taxesPercentage, ptsV2PaymentsPost201ResponseInstallmentInformation.taxesPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCosts, additionalCostsPercentage, amountFunded, amountRequestedPercentage, annualFinancingCost, annualInterestRate, expenses, expensesPercentage, fees, feesPercentage, insurance, insurancePercentage, monthlyInterestRate, taxes, taxesPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseInstallmentInformation {\n");
    
    sb.append("    additionalCosts: ").append(toIndentedString(additionalCosts)).append("\n");
    sb.append("    additionalCostsPercentage: ").append(toIndentedString(additionalCostsPercentage)).append("\n");
    sb.append("    amountFunded: ").append(toIndentedString(amountFunded)).append("\n");
    sb.append("    amountRequestedPercentage: ").append(toIndentedString(amountRequestedPercentage)).append("\n");
    sb.append("    annualFinancingCost: ").append(toIndentedString(annualFinancingCost)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    expensesPercentage: ").append(toIndentedString(expensesPercentage)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    feesPercentage: ").append(toIndentedString(feesPercentage)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    insurancePercentage: ").append(toIndentedString(insurancePercentage)).append("\n");
    sb.append("    monthlyInterestRate: ").append(toIndentedString(monthlyInterestRate)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    taxesPercentage: ").append(toIndentedString(taxesPercentage)).append("\n");
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

