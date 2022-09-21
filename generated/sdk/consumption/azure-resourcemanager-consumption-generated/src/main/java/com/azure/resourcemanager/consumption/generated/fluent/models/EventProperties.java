// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.consumption.generated.models.Amount;
import com.azure.resourcemanager.consumption.generated.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.generated.models.EventType;
import com.azure.resourcemanager.consumption.generated.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The event properties. */
@Fluent
public final class EventProperties {
    /*
     * The date of the event.
     */
    @JsonProperty(value = "transactionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime transactionDate;

    /*
     * The description of the event.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The amount of new credit or commitment for NewCredit or SettleCharges event.
     */
    @JsonProperty(value = "newCredit", access = JsonProperty.Access.WRITE_ONLY)
    private Amount newCredit;

    /*
     * The amount of balance adjustment. The property is not available for ConsumptionCommitment lots.
     */
    @JsonProperty(value = "adjustments", access = JsonProperty.Access.WRITE_ONLY)
    private Amount adjustments;

    /*
     * The amount of expired credit or commitment for NewCredit or SettleCharges event.
     */
    @JsonProperty(value = "creditExpired", access = JsonProperty.Access.WRITE_ONLY)
    private Amount creditExpired;

    /*
     * The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     */
    @JsonProperty(value = "charges", access = JsonProperty.Access.WRITE_ONLY)
    private Amount charges;

    /*
     * The balance after the event.
     */
    @JsonProperty(value = "closedBalance", access = JsonProperty.Access.WRITE_ONLY)
    private Amount closedBalance;

    /*
     * Identifies the type of the event.
     */
    @JsonProperty(value = "eventType")
    private EventType eventType;

    /*
     * The number which uniquely identifies the invoice on which the event was billed. This will be empty for unbilled
     * events.
     */
    @JsonProperty(value = "invoiceNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceNumber;

    /*
     * The ID that uniquely identifies the billing profile for which the event happened. The property is only available
     * for billing account of type MicrosoftCustomerAgreement.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * The display name of the billing profile for which the event happened. The property is only available for billing
     * account of type MicrosoftCustomerAgreement.
     */
    @JsonProperty(value = "billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /*
     * The ID that uniquely identifies the lot for which the event happened.
     */
    @JsonProperty(value = "lotId", access = JsonProperty.Access.WRITE_ONLY)
    private String lotId;

    /*
     * Identifies the source of the lot for which the event happened.
     */
    @JsonProperty(value = "lotSource", access = JsonProperty.Access.WRITE_ONLY)
    private String lotSource;

    /*
     * Amount of canceled credit.
     */
    @JsonProperty(value = "canceledCredit", access = JsonProperty.Access.WRITE_ONLY)
    private Amount canceledCredit;

    /*
     * The credit currency of the event.
     */
    @JsonProperty(value = "creditCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String creditCurrency;

    /*
     * The billing currency of the event.
     */
    @JsonProperty(value = "billingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCurrency;

    /*
     * The reseller of the event.
     */
    @JsonProperty(value = "reseller", access = JsonProperty.Access.WRITE_ONLY)
    private Reseller reseller;

    /*
     * The amount of expired credit or commitment for NewCredit or SettleCharges event in billing currency.
     */
    @JsonProperty(value = "creditExpiredInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate creditExpiredInBillingCurrency;

    /*
     * The amount of new credit or commitment for NewCredit or SettleCharges event in billing currency.
     */
    @JsonProperty(value = "newCreditInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate newCreditInBillingCurrency;

    /*
     * The amount of balance adjustment in billing currency.
     */
    @JsonProperty(value = "adjustmentsInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate adjustmentsInBillingCurrency;

    /*
     * The amount of charges for events of type SettleCharges and PendingEligibleCharges in billing currency.
     */
    @JsonProperty(value = "chargesInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate chargesInBillingCurrency;

    /*
     * The balance in billing currency after the event.
     */
    @JsonProperty(value = "closedBalanceInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate closedBalanceInBillingCurrency;

    /*
     * The eTag for the resource.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /** Creates an instance of EventProperties class. */
    public EventProperties() {
    }

    /**
     * Get the transactionDate property: The date of the event.
     *
     * @return the transactionDate value.
     */
    public OffsetDateTime transactionDate() {
        return this.transactionDate;
    }

    /**
     * Get the description property: The description of the event.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the newCredit property: The amount of new credit or commitment for NewCredit or SettleCharges event.
     *
     * @return the newCredit value.
     */
    public Amount newCredit() {
        return this.newCredit;
    }

    /**
     * Get the adjustments property: The amount of balance adjustment. The property is not available for
     * ConsumptionCommitment lots.
     *
     * @return the adjustments value.
     */
    public Amount adjustments() {
        return this.adjustments;
    }

    /**
     * Get the creditExpired property: The amount of expired credit or commitment for NewCredit or SettleCharges event.
     *
     * @return the creditExpired value.
     */
    public Amount creditExpired() {
        return this.creditExpired;
    }

    /**
     * Get the charges property: The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     *
     * @return the charges value.
     */
    public Amount charges() {
        return this.charges;
    }

    /**
     * Get the closedBalance property: The balance after the event.
     *
     * @return the closedBalance value.
     */
    public Amount closedBalance() {
        return this.closedBalance;
    }

    /**
     * Get the eventType property: Identifies the type of the event.
     *
     * @return the eventType value.
     */
    public EventType eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: Identifies the type of the event.
     *
     * @param eventType the eventType value to set.
     * @return the EventProperties object itself.
     */
    public EventProperties withEventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the invoiceNumber property: The number which uniquely identifies the invoice on which the event was billed.
     * This will be empty for unbilled events.
     *
     * @return the invoiceNumber value.
     */
    public String invoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Get the billingProfileId property: The ID that uniquely identifies the billing profile for which the event
     * happened. The property is only available for billing account of type MicrosoftCustomerAgreement.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileDisplayName property: The display name of the billing profile for which the event happened.
     * The property is only available for billing account of type MicrosoftCustomerAgreement.
     *
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the lotId property: The ID that uniquely identifies the lot for which the event happened.
     *
     * @return the lotId value.
     */
    public String lotId() {
        return this.lotId;
    }

    /**
     * Get the lotSource property: Identifies the source of the lot for which the event happened.
     *
     * @return the lotSource value.
     */
    public String lotSource() {
        return this.lotSource;
    }

    /**
     * Get the canceledCredit property: Amount of canceled credit.
     *
     * @return the canceledCredit value.
     */
    public Amount canceledCredit() {
        return this.canceledCredit;
    }

    /**
     * Get the creditCurrency property: The credit currency of the event.
     *
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.creditCurrency;
    }

    /**
     * Get the billingCurrency property: The billing currency of the event.
     *
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Get the reseller property: The reseller of the event.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.reseller;
    }

    /**
     * Get the creditExpiredInBillingCurrency property: The amount of expired credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     *
     * @return the creditExpiredInBillingCurrency value.
     */
    public AmountWithExchangeRate creditExpiredInBillingCurrency() {
        return this.creditExpiredInBillingCurrency;
    }

    /**
     * Get the newCreditInBillingCurrency property: The amount of new credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     *
     * @return the newCreditInBillingCurrency value.
     */
    public AmountWithExchangeRate newCreditInBillingCurrency() {
        return this.newCreditInBillingCurrency;
    }

    /**
     * Get the adjustmentsInBillingCurrency property: The amount of balance adjustment in billing currency.
     *
     * @return the adjustmentsInBillingCurrency value.
     */
    public AmountWithExchangeRate adjustmentsInBillingCurrency() {
        return this.adjustmentsInBillingCurrency;
    }

    /**
     * Get the chargesInBillingCurrency property: The amount of charges for events of type SettleCharges and
     * PendingEligibleCharges in billing currency.
     *
     * @return the chargesInBillingCurrency value.
     */
    public AmountWithExchangeRate chargesInBillingCurrency() {
        return this.chargesInBillingCurrency;
    }

    /**
     * Get the closedBalanceInBillingCurrency property: The balance in billing currency after the event.
     *
     * @return the closedBalanceInBillingCurrency value.
     */
    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.closedBalanceInBillingCurrency;
    }

    /**
     * Get the etag property: The eTag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newCredit() != null) {
            newCredit().validate();
        }
        if (adjustments() != null) {
            adjustments().validate();
        }
        if (creditExpired() != null) {
            creditExpired().validate();
        }
        if (charges() != null) {
            charges().validate();
        }
        if (closedBalance() != null) {
            closedBalance().validate();
        }
        if (canceledCredit() != null) {
            canceledCredit().validate();
        }
        if (reseller() != null) {
            reseller().validate();
        }
        if (creditExpiredInBillingCurrency() != null) {
            creditExpiredInBillingCurrency().validate();
        }
        if (newCreditInBillingCurrency() != null) {
            newCreditInBillingCurrency().validate();
        }
        if (adjustmentsInBillingCurrency() != null) {
            adjustmentsInBillingCurrency().validate();
        }
        if (chargesInBillingCurrency() != null) {
            chargesInBillingCurrency().validate();
        }
        if (closedBalanceInBillingCurrency() != null) {
            closedBalanceInBillingCurrency().validate();
        }
    }
}
