// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * The amount plus currency .
 */
@Immutable
public class Amount {
    /*
     * Amount currency.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * Amount.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal value;

    /**
     * Creates an instance of Amount class.
     */
    public Amount() {
    }

    /**
     * Get the currency property: Amount currency.
     * 
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the value property: Amount.
     * 
     * @return the value value.
     */
    public BigDecimal value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
