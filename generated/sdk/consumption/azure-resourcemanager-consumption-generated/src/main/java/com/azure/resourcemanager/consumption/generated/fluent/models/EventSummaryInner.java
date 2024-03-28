// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.generated.models.EventType;
import com.azure.resourcemanager.consumption.generated.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * An event summary resource.
 */
@Fluent
public final class EventSummaryInner extends ProxyResource {
    /*
     * The event properties.
     */
    @JsonProperty(value = "properties")
    private EventProperties innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of EventSummaryInner class.
     */
    public EventSummaryInner() {
    }

    /**
     * Get the innerProperties property: The event properties.
     * 
     * @return the innerProperties value.
     */
    private EventProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @param etag the etag value to set.
     * @return the EventSummaryInner object itself.
     */
    public EventSummaryInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the transactionDate property: The date of the event.
     * 
     * @return the transactionDate value.
     */
    public OffsetDateTime transactionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().transactionDate();
    }

    /**
     * Get the description property: The description of the event.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the newCredit property: The amount of new credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the newCredit value.
     */
    public Amount newCredit() {
        return this.innerProperties() == null ? null : this.innerProperties().newCredit();
    }

    /**
     * Get the adjustments property: The amount of balance adjustment. The property is not available for
     * ConsumptionCommitment lots.
     * 
     * @return the adjustments value.
     */
    public Amount adjustments() {
        return this.innerProperties() == null ? null : this.innerProperties().adjustments();
    }

    /**
     * Get the creditExpired property: The amount of expired credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the creditExpired value.
     */
    public Amount creditExpired() {
        return this.innerProperties() == null ? null : this.innerProperties().creditExpired();
    }

    /**
     * Get the charges property: The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     * 
     * @return the charges value.
     */
    public Amount charges() {
        return this.innerProperties() == null ? null : this.innerProperties().charges();
    }

    /**
     * Get the closedBalance property: The balance after the event, Note: This will not be returned for Contributor
     * Organization Type in Multi-Entity consumption commitment.
     * 
     * @return the closedBalance value.
     */
    public Amount closedBalance() {
        return this.innerProperties() == null ? null : this.innerProperties().closedBalance();
    }

    /**
     * Get the billingAccountId property: Identifier of the billing account.
     * 
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingAccountId();
    }

    /**
     * Get the billingAccountDisplayName property: Name of the billing account.
     * 
     * @return the billingAccountDisplayName value.
     */
    public String billingAccountDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingAccountDisplayName();
    }

    /**
     * Get the eventType property: Identifies the type of the event.
     * 
     * @return the eventType value.
     */
    public EventType eventType() {
        return this.innerProperties() == null ? null : this.innerProperties().eventType();
    }

    /**
     * Set the eventType property: Identifies the type of the event.
     * 
     * @param eventType the eventType value to set.
     * @return the EventSummaryInner object itself.
     */
    public EventSummaryInner withEventType(EventType eventType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventProperties();
        }
        this.innerProperties().withEventType(eventType);
        return this;
    }

    /**
     * Get the invoiceNumber property: The number which uniquely identifies the invoice on which the event was billed.
     * This will be empty for unbilled events.
     * 
     * @return the invoiceNumber value.
     */
    public String invoiceNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceNumber();
    }

    /**
     * Get the billingProfileId property: The ID that uniquely identifies the billing profile for which the event
     * happened. The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileId();
    }

    /**
     * Get the billingProfileDisplayName property: The display name of the billing profile for which the event happened.
     * The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileDisplayName();
    }

    /**
     * Get the lotId property: The ID that uniquely identifies the lot for which the event happened.
     * 
     * @return the lotId value.
     */
    public String lotId() {
        return this.innerProperties() == null ? null : this.innerProperties().lotId();
    }

    /**
     * Get the lotSource property: Identifies the source of the lot for which the event happened.
     * 
     * @return the lotSource value.
     */
    public String lotSource() {
        return this.innerProperties() == null ? null : this.innerProperties().lotSource();
    }

    /**
     * Get the canceledCredit property: Amount of canceled credit.
     * 
     * @return the canceledCredit value.
     */
    public Amount canceledCredit() {
        return this.innerProperties() == null ? null : this.innerProperties().canceledCredit();
    }

    /**
     * Get the creditCurrency property: The credit currency of the event.
     * 
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().creditCurrency();
    }

    /**
     * Get the billingCurrency property: The billing currency of the event.
     * 
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingCurrency();
    }

    /**
     * Get the reseller property: The reseller of the event.
     * 
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.innerProperties() == null ? null : this.innerProperties().reseller();
    }

    /**
     * Get the creditExpiredInBillingCurrency property: The amount of expired credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the creditExpiredInBillingCurrency value.
     */
    public AmountWithExchangeRate creditExpiredInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().creditExpiredInBillingCurrency();
    }

    /**
     * Get the newCreditInBillingCurrency property: The amount of new credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the newCreditInBillingCurrency value.
     */
    public AmountWithExchangeRate newCreditInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().newCreditInBillingCurrency();
    }

    /**
     * Get the adjustmentsInBillingCurrency property: The amount of balance adjustment in billing currency.
     * 
     * @return the adjustmentsInBillingCurrency value.
     */
    public AmountWithExchangeRate adjustmentsInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().adjustmentsInBillingCurrency();
    }

    /**
     * Get the chargesInBillingCurrency property: The amount of charges for events of type SettleCharges and
     * PendingEligibleCharges in billing currency.
     * 
     * @return the chargesInBillingCurrency value.
     */
    public AmountWithExchangeRate chargesInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().chargesInBillingCurrency();
    }

    /**
     * Get the closedBalanceInBillingCurrency property: The balance in billing currency after the event, Note: This will
     * not be returned for Contributor Organization Type in Multi-Entity consumption commitment.
     * 
     * @return the closedBalanceInBillingCurrency value.
     */
    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().closedBalanceInBillingCurrency();
    }

    /**
     * Get the isEstimatedBalance property: If true, the listed details are based on an estimation and it will be
     * subjected to change.
     * 
     * @return the isEstimatedBalance value.
     */
    public Boolean isEstimatedBalance() {
        return this.innerProperties() == null ? null : this.innerProperties().isEstimatedBalance();
    }

    /**
     * Get the etag property: The eTag for the resource.
     * 
     * @return the etag value.
     */
    public String etagPropertiesEtag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
