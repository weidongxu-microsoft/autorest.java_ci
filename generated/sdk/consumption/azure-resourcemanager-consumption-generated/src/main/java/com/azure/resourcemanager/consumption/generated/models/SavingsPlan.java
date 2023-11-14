// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * The properties of the SavingsPlan.
 */
@Immutable
public final class SavingsPlan {
    /*
     * SavingsPlan term
     */
    @JsonProperty(value = "term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * SavingsPlan Market Price
     */
    @JsonProperty(value = "marketPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal marketPrice;

    /*
     * SavingsPlan Effective Price
     */
    @JsonProperty(value = "effectivePrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal effectivePrice;

    /**
     * Creates an instance of SavingsPlan class.
     */
    public SavingsPlan() {
    }

    /**
     * Get the term property: SavingsPlan term.
     * 
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the marketPrice property: SavingsPlan Market Price.
     * 
     * @return the marketPrice value.
     */
    public BigDecimal marketPrice() {
        return this.marketPrice;
    }

    /**
     * Get the effectivePrice property: SavingsPlan Effective Price.
     * 
     * @return the effectivePrice value.
     */
    public BigDecimal effectivePrice() {
        return this.effectivePrice;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
