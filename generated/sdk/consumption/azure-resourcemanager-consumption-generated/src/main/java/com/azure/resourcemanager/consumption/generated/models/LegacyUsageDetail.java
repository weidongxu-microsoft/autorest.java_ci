// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.models.LegacyUsageDetailProperties;
import com.azure.resourcemanager.consumption.generated.fluent.models.UsageDetailInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Legacy usage detail.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("legacy")
@Immutable
public final class LegacyUsageDetail extends UsageDetailInner {
    /*
     * Properties for legacy usage details
     */
    @JsonProperty(value = "properties", required = true)
    private LegacyUsageDetailProperties innerProperties = new LegacyUsageDetailProperties();

    /**
     * Creates an instance of LegacyUsageDetail class.
     */
    public LegacyUsageDetail() {
    }

    /**
     * Get the innerProperties property: Properties for legacy usage details.
     * 
     * @return the innerProperties value.
     */
    private LegacyUsageDetailProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the billingAccountId property: Billing Account identifier.
     * 
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingAccountId();
    }

    /**
     * Get the billingAccountName property: Billing Account Name.
     * 
     * @return the billingAccountName value.
     */
    public String billingAccountName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingAccountName();
    }

    /**
     * Get the billingPeriodStartDate property: The billing period start date.
     * 
     * @return the billingPeriodStartDate value.
     */
    public OffsetDateTime billingPeriodStartDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPeriodStartDate();
    }

    /**
     * Get the billingPeriodEndDate property: The billing period end date.
     * 
     * @return the billingPeriodEndDate value.
     */
    public OffsetDateTime billingPeriodEndDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingPeriodEndDate();
    }

    /**
     * Get the billingProfileId property: Billing Profile identifier.
     * 
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileId();
    }

    /**
     * Get the billingProfileName property: Billing Profile Name.
     * 
     * @return the billingProfileName value.
     */
    public String billingProfileName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileName();
    }

    /**
     * Get the accountOwnerId property: Account Owner Id.
     * 
     * @return the accountOwnerId value.
     */
    public String accountOwnerId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountOwnerId();
    }

    /**
     * Get the accountName property: Account Name.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.innerProperties() == null ? null : this.innerProperties().accountName();
    }

    /**
     * Get the subscriptionId property: Subscription guid.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionId();
    }

    /**
     * Get the subscriptionName property: Subscription name.
     * 
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionName();
    }

    /**
     * Get the date property: Date for the usage record.
     * 
     * @return the date value.
     */
    public OffsetDateTime date() {
        return this.innerProperties() == null ? null : this.innerProperties().date();
    }

    /**
     * Get the product property: Product name for the consumed service or purchase. Not available for Marketplace.
     * 
     * @return the product value.
     */
    public String product() {
        return this.innerProperties() == null ? null : this.innerProperties().product();
    }

    /**
     * Get the partNumber property: Part Number of the service used. Can be used to join with the price sheet. Not
     * available for marketplace.
     * 
     * @return the partNumber value.
     */
    public String partNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().partNumber();
    }

    /**
     * Get the meterId property: The meter id (GUID). Not available for marketplace. For reserved instance this
     * represents the primary meter for which the reservation was purchased. For the actual VM Size for which the
     * reservation is purchased see productOrderName.
     * 
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.innerProperties() == null ? null : this.innerProperties().meterId();
    }

    /**
     * Get the meterDetails property: The details about the meter. By default this is not populated, unless it's
     * specified in $expand.
     * 
     * @return the meterDetails value.
     */
    public MeterDetailsResponse meterDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().meterDetails();
    }

    /**
     * Get the quantity property: The usage quantity.
     * 
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Get the effectivePrice property: Effective Price that's charged for the usage.
     * 
     * @return the effectivePrice value.
     */
    public BigDecimal effectivePrice() {
        return this.innerProperties() == null ? null : this.innerProperties().effectivePrice();
    }

    /**
     * Get the cost property: The amount of cost before tax.
     * 
     * @return the cost value.
     */
    public BigDecimal cost() {
        return this.innerProperties() == null ? null : this.innerProperties().cost();
    }

    /**
     * Get the unitPrice property: Unit Price is the price applicable to you. (your EA or other contract price).
     * 
     * @return the unitPrice value.
     */
    public BigDecimal unitPrice() {
        return this.innerProperties() == null ? null : this.innerProperties().unitPrice();
    }

    /**
     * Get the billingCurrency property: Billing Currency.
     * 
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingCurrency();
    }

    /**
     * Get the resourceLocation property: Resource Location.
     * 
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceLocation();
    }

    /**
     * Get the consumedService property: Consumed service name. Name of the azure resource provider that emits the usage
     * or was purchased. This value is not provided for marketplace usage.
     * 
     * @return the consumedService value.
     */
    public String consumedService() {
        return this.innerProperties() == null ? null : this.innerProperties().consumedService();
    }

    /**
     * Get the resourceId property: Unique identifier of the Azure Resource Manager usage detail resource.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Get the resourceName property: Resource Name.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceName();
    }

    /**
     * Get the serviceInfo1 property: Service-specific metadata.
     * 
     * @return the serviceInfo1 value.
     */
    public String serviceInfo1() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceInfo1();
    }

    /**
     * Get the serviceInfo2 property: Legacy field with optional service-specific metadata.
     * 
     * @return the serviceInfo2 value.
     */
    public String serviceInfo2() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceInfo2();
    }

    /**
     * Get the additionalInfo property: Additional details of this usage item. By default this is not populated, unless
     * it's specified in $expand. Use this field to get usage line item specific details such as the actual VM Size
     * (ServiceType) or the ratio in which the reservation discount is applied.
     * 
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalInfo();
    }

    /**
     * Get the invoiceSection property: Invoice Section Name.
     * 
     * @return the invoiceSection value.
     */
    public String invoiceSection() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceSection();
    }

    /**
     * Get the costCenter property: The cost center of this department if it is a department and a cost center is
     * provided.
     * 
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.innerProperties() == null ? null : this.innerProperties().costCenter();
    }

    /**
     * Get the resourceGroup property: Resource Group Name.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the reservationId property: ARM resource id of the reservation. Only applies to records relevant to
     * reservations.
     * 
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationId();
    }

    /**
     * Get the reservationName property: User provided display name of the reservation. Last known name for a particular
     * day is populated in the daily data. Only applies to records relevant to reservations.
     * 
     * @return the reservationName value.
     */
    public String reservationName() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationName();
    }

    /**
     * Get the productOrderId property: Product Order Id. For reservations this is the Reservation Order ID.
     * 
     * @return the productOrderId value.
     */
    public String productOrderId() {
        return this.innerProperties() == null ? null : this.innerProperties().productOrderId();
    }

    /**
     * Get the productOrderName property: Product Order Name. For reservations this is the SKU that was purchased.
     * 
     * @return the productOrderName value.
     */
    public String productOrderName() {
        return this.innerProperties() == null ? null : this.innerProperties().productOrderName();
    }

    /**
     * Get the offerId property: Offer Id. Ex: MS-AZR-0017P, MS-AZR-0148P.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.innerProperties() == null ? null : this.innerProperties().offerId();
    }

    /**
     * Get the isAzureCreditEligible property: Is Azure Credit Eligible.
     * 
     * @return the isAzureCreditEligible value.
     */
    public Boolean isAzureCreditEligible() {
        return this.innerProperties() == null ? null : this.innerProperties().isAzureCreditEligible();
    }

    /**
     * Get the term property: Term (in months). 1 month for monthly recurring purchase. 12 months for a 1 year
     * reservation. 36 months for a 3 year reservation.
     * 
     * @return the term value.
     */
    public String term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Get the publisherName property: Publisher Name.
     * 
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.innerProperties() == null ? null : this.innerProperties().publisherName();
    }

    /**
     * Get the publisherType property: Publisher Type.
     * 
     * @return the publisherType value.
     */
    public String publisherType() {
        return this.innerProperties() == null ? null : this.innerProperties().publisherType();
    }

    /**
     * Get the planName property: Plan Name.
     * 
     * @return the planName value.
     */
    public String planName() {
        return this.innerProperties() == null ? null : this.innerProperties().planName();
    }

    /**
     * Get the chargeType property: Indicates a charge represents credits, usage, a Marketplace purchase, a reservation
     * fee, or a refund.
     * 
     * @return the chargeType value.
     */
    public String chargeType() {
        return this.innerProperties() == null ? null : this.innerProperties().chargeType();
    }

    /**
     * Get the frequency property: Indicates how frequently this charge will occur. OneTime for purchases which only
     * happen once, Monthly for fees which recur every month, and UsageBased for charges based on how much a service is
     * used.
     * 
     * @return the frequency value.
     */
    public String frequency() {
        return this.innerProperties() == null ? null : this.innerProperties().frequency();
    }

    /**
     * Get the payGPrice property: Retail price for the resource.
     * 
     * @return the payGPrice value.
     */
    public BigDecimal payGPrice() {
        return this.innerProperties() == null ? null : this.innerProperties().payGPrice();
    }

    /**
     * Get the benefitId property: Unique identifier for the applicable benefit.
     * 
     * @return the benefitId value.
     */
    public String benefitId() {
        return this.innerProperties() == null ? null : this.innerProperties().benefitId();
    }

    /**
     * Get the benefitName property: Name of the applicable benefit.
     * 
     * @return the benefitName value.
     */
    public String benefitName() {
        return this.innerProperties() == null ? null : this.innerProperties().benefitName();
    }

    /**
     * Get the pricingModel property: Identifier that indicates how the meter is priced.
     * 
     * @return the pricingModel value.
     */
    public PricingModelType pricingModel() {
        return this.innerProperties() == null ? null : this.innerProperties().pricingModel();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model LegacyUsageDetail"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LegacyUsageDetail.class);
}
