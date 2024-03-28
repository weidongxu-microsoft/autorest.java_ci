// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.consumption.generated.models.ReservationTransactionResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Reservation transaction resource.
 */
@Immutable
public class ReservationTransactionInner extends ReservationTransactionResource {
    /*
     * The properties of a legacy reservation transaction.
     */
    @JsonProperty(value = "properties")
    private LegacyReservationTransactionProperties innerProperties;

    /**
     * Creates an instance of ReservationTransactionInner class.
     */
    public ReservationTransactionInner() {
    }

    /**
     * Get the innerProperties property: The properties of a legacy reservation transaction.
     * 
     * @return the innerProperties value.
     */
    private LegacyReservationTransactionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the eventDate property: The date of the transaction.
     * 
     * @return the eventDate value.
     */
    public OffsetDateTime eventDate() {
        return this.innerProperties() == null ? null : this.innerProperties().eventDate();
    }

    /**
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     * 
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationOrderId();
    }

    /**
     * Get the description property: The description of the transaction.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the eventType property: The type of the transaction (Purchase, Cancel or Refund).
     * 
     * @return the eventType value.
     */
    public String eventType() {
        return this.innerProperties() == null ? null : this.innerProperties().eventType();
    }

    /**
     * Get the quantity property: The quantity of the transaction.
     * 
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Get the amount property: The charge of the transaction.
     * 
     * @return the amount value.
     */
    public BigDecimal amount() {
        return this.innerProperties() == null ? null : this.innerProperties().amount();
    }

    /**
     * Get the currency property: The ISO currency in which the transaction is charged, for example, USD.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the reservationOrderName property: The name of the reservation order.
     * 
     * @return the reservationOrderName value.
     */
    public String reservationOrderName() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationOrderName();
    }

    /**
     * Get the purchasingEnrollment property: The purchasing enrollment.
     * 
     * @return the purchasingEnrollment value.
     */
    public String purchasingEnrollment() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasingEnrollment();
    }

    /**
     * Get the purchasingSubscriptionGuid property: The subscription guid that makes the transaction.
     * 
     * @return the purchasingSubscriptionGuid value.
     */
    public UUID purchasingSubscriptionGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasingSubscriptionGuid();
    }

    /**
     * Get the purchasingSubscriptionName property: The subscription name that makes the transaction.
     * 
     * @return the purchasingSubscriptionName value.
     */
    public String purchasingSubscriptionName() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasingSubscriptionName();
    }

    /**
     * Get the armSkuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     * 
     * @return the armSkuName value.
     */
    public String armSkuName() {
        return this.innerProperties() == null ? null : this.innerProperties().armSkuName();
    }

    /**
     * Get the term property: This is the term of the transaction.
     * 
     * @return the term value.
     */
    public String term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Get the region property: The region of the transaction.
     * 
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Get the accountName property: The name of the account that makes the transaction.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.innerProperties() == null ? null : this.innerProperties().accountName();
    }

    /**
     * Get the accountOwnerEmail property: The email of the account owner that makes the transaction.
     * 
     * @return the accountOwnerEmail value.
     */
    public String accountOwnerEmail() {
        return this.innerProperties() == null ? null : this.innerProperties().accountOwnerEmail();
    }

    /**
     * Get the departmentName property: The department name.
     * 
     * @return the departmentName value.
     */
    public String departmentName() {
        return this.innerProperties() == null ? null : this.innerProperties().departmentName();
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
     * Get the currentEnrollment property: The current enrollment.
     * 
     * @return the currentEnrollment value.
     */
    public String currentEnrollment() {
        return this.innerProperties() == null ? null : this.innerProperties().currentEnrollment();
    }

    /**
     * Get the billingFrequency property: The billing frequency, which can be either one-time or recurring.
     * 
     * @return the billingFrequency value.
     */
    public String billingFrequency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingFrequency();
    }

    /**
     * Get the billingMonth property: The billing month(yyyyMMdd), on which the event initiated.
     * 
     * @return the billingMonth value.
     */
    public Integer billingMonth() {
        return this.innerProperties() == null ? null : this.innerProperties().billingMonth();
    }

    /**
     * Get the monetaryCommitment property: The monetary commitment amount at the enrollment scope.
     * 
     * @return the monetaryCommitment value.
     */
    public BigDecimal monetaryCommitment() {
        return this.innerProperties() == null ? null : this.innerProperties().monetaryCommitment();
    }

    /**
     * Get the overage property: The overage amount at the enrollment scope.
     * 
     * @return the overage value.
     */
    public BigDecimal overage() {
        return this.innerProperties() == null ? null : this.innerProperties().overage();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
