// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metadata for retrieving price info.
 */
@Immutable
public final class SkuCost {
    /*
     * Used for querying price from commerce.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /*
     * The cost quantity.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Long quantity;

    /*
     * The extended unit.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Creates an instance of SkuCost class.
     */
    public SkuCost() {
    }

    /**
     * Get the meterId property: Used for querying price from commerce.
     * 
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the quantity property: The cost quantity.
     * 
     * @return the quantity value.
     */
    public Long quantity() {
        return this.quantity;
    }

    /**
     * Get the extendedUnit property: The extended unit.
     * 
     * @return the extendedUnit value.
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
