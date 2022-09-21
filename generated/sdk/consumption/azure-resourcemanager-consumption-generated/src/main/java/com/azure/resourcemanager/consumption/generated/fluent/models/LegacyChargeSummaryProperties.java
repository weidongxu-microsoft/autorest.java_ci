// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** The properties of legacy charge summary. */
@Immutable
public final class LegacyChargeSummaryProperties {
    /*
     * The id of the billing period resource that the charge belongs to.
     */
    @JsonProperty(value = "billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /*
     * Usage start date.
     */
    @JsonProperty(value = "usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private String usageStart;

    /*
     * Usage end date.
     */
    @JsonProperty(value = "usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private String usageEnd;

    /*
     * Azure Charges.
     */
    @JsonProperty(value = "azureCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal azureCharges;

    /*
     * Charges Billed separately.
     */
    @JsonProperty(value = "chargesBilledSeparately", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal chargesBilledSeparately;

    /*
     * Marketplace Charges.
     */
    @JsonProperty(value = "marketplaceCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal marketplaceCharges;

    /*
     * Currency Code
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /** Creates an instance of LegacyChargeSummaryProperties class. */
    public LegacyChargeSummaryProperties() {
    }

    /**
     * Get the billingPeriodId property: The id of the billing period resource that the charge belongs to.
     *
     * @return the billingPeriodId value.
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the usageStart property: Usage start date.
     *
     * @return the usageStart value.
     */
    public String usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd property: Usage end date.
     *
     * @return the usageEnd value.
     */
    public String usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the azureCharges property: Azure Charges.
     *
     * @return the azureCharges value.
     */
    public BigDecimal azureCharges() {
        return this.azureCharges;
    }

    /**
     * Get the chargesBilledSeparately property: Charges Billed separately.
     *
     * @return the chargesBilledSeparately value.
     */
    public BigDecimal chargesBilledSeparately() {
        return this.chargesBilledSeparately;
    }

    /**
     * Get the marketplaceCharges property: Marketplace Charges.
     *
     * @return the marketplaceCharges value.
     */
    public BigDecimal marketplaceCharges() {
        return this.marketplaceCharges;
    }

    /**
     * Get the currency property: Currency Code.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
