// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The properties of a modern reservation transaction. */
@Immutable
public final class ModernReservationTransactionProperties {
    /*
     * The charge of the transaction.
     */
    @JsonProperty(value = "amount", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal amount;

    /*
     * This is the ARM Sku name. It can be used to join with the serviceType
     * field in additional info in usage records.
     */
    @JsonProperty(value = "armSkuName", access = JsonProperty.Access.WRITE_ONLY)
    private String armSkuName;

    /*
     * The billing frequency, which can be either one-time or recurring.
     */
    @JsonProperty(value = "billingFrequency", access = JsonProperty.Access.WRITE_ONLY)
    private String billingFrequency;

    /*
     * Billing profile Id.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * Billing profile name.
     */
    @JsonProperty(value = "billingProfileName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileName;

    /*
     * The ISO currency in which the transaction is charged, for example, USD.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * The description of the transaction.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The date of the transaction
     */
    @JsonProperty(value = "eventDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime eventDate;

    /*
     * The type of the transaction (Purchase, Cancel, etc.)
     */
    @JsonProperty(value = "eventType", access = JsonProperty.Access.WRITE_ONLY)
    private String eventType;

    /*
     * Invoice Number
     */
    @JsonProperty(value = "invoice", access = JsonProperty.Access.WRITE_ONLY)
    private String invoice;

    /*
     * Invoice Id as on the invoice where the specific transaction appears.
     */
    @JsonProperty(value = "invoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceId;

    /*
     * Invoice Section Id
     */
    @JsonProperty(value = "invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /*
     * Invoice Section Name.
     */
    @JsonProperty(value = "invoiceSectionName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionName;

    /*
     * The subscription guid that makes the transaction.
     */
    @JsonProperty(value = "purchasingSubscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID purchasingSubscriptionGuid;

    /*
     * The subscription name that makes the transaction.
     */
    @JsonProperty(value = "purchasingSubscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String purchasingSubscriptionName;

    /*
     * The quantity of the transaction.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal quantity;

    /*
     * The region of the transaction.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * The reservation order ID is the identifier for a reservation purchase.
     * Each reservation order ID represents a single purchase transaction. A
     * reservation order contains reservations. The reservation order specifies
     * the VM size and region for the reservations.
     */
    @JsonProperty(value = "reservationOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderId;

    /*
     * The name of the reservation order.
     */
    @JsonProperty(value = "reservationOrderName", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderName;

    /*
     * This is the term of the transaction.
     */
    @JsonProperty(value = "term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /**
     * Get the amount property: The charge of the transaction.
     *
     * @return the amount value.
     */
    public BigDecimal amount() {
        return this.amount;
    }

    /**
     * Get the armSkuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the armSkuName value.
     */
    public String armSkuName() {
        return this.armSkuName;
    }

    /**
     * Get the billingFrequency property: The billing frequency, which can be either one-time or recurring.
     *
     * @return the billingFrequency value.
     */
    public String billingFrequency() {
        return this.billingFrequency;
    }

    /**
     * Get the billingProfileId property: Billing profile Id.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileName property: Billing profile name.
     *
     * @return the billingProfileName value.
     */
    public String billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * Get the currency property: The ISO currency in which the transaction is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the description property: The description of the transaction.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the eventDate property: The date of the transaction.
     *
     * @return the eventDate value.
     */
    public OffsetDateTime eventDate() {
        return this.eventDate;
    }

    /**
     * Get the eventType property: The type of the transaction (Purchase, Cancel, etc.).
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Get the invoice property: Invoice Number.
     *
     * @return the invoice value.
     */
    public String invoice() {
        return this.invoice;
    }

    /**
     * Get the invoiceId property: Invoice Id as on the invoice where the specific transaction appears.
     *
     * @return the invoiceId value.
     */
    public String invoiceId() {
        return this.invoiceId;
    }

    /**
     * Get the invoiceSectionId property: Invoice Section Id.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the invoiceSectionName property: Invoice Section Name.
     *
     * @return the invoiceSectionName value.
     */
    public String invoiceSectionName() {
        return this.invoiceSectionName;
    }

    /**
     * Get the purchasingSubscriptionGuid property: The subscription guid that makes the transaction.
     *
     * @return the purchasingSubscriptionGuid value.
     */
    public UUID purchasingSubscriptionGuid() {
        return this.purchasingSubscriptionGuid;
    }

    /**
     * Get the purchasingSubscriptionName property: The subscription name that makes the transaction.
     *
     * @return the purchasingSubscriptionName value.
     */
    public String purchasingSubscriptionName() {
        return this.purchasingSubscriptionName;
    }

    /**
     * Get the quantity property: The quantity of the transaction.
     *
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.quantity;
    }

    /**
     * Get the region property: The region of the transaction.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Get the reservationOrderName property: The name of the reservation order.
     *
     * @return the reservationOrderName value.
     */
    public String reservationOrderName() {
        return this.reservationOrderName;
    }

    /**
     * Get the term property: This is the term of the transaction.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
