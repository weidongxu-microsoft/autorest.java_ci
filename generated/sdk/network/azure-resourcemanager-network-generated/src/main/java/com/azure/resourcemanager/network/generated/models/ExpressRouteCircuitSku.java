// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains SKU in an ExpressRouteCircuit. */
@Fluent
public final class ExpressRouteCircuitSku {
    /*
     * The name of the SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The tier of the SKU.
     */
    @JsonProperty(value = "tier")
    private ExpressRouteCircuitSkuTier tier;

    /*
     * The family of the SKU.
     */
    @JsonProperty(value = "family")
    private ExpressRouteCircuitSkuFamily family;

    /**
     * Get the name property: The name of the SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the SKU.
     *
     * @return the tier value.
     */
    public ExpressRouteCircuitSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the SKU.
     *
     * @param tier the tier value to set.
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withTier(ExpressRouteCircuitSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the family property: The family of the SKU.
     *
     * @return the family value.
     */
    public ExpressRouteCircuitSkuFamily family() {
        return this.family;
    }

    /**
     * Set the family property: The family of the SKU.
     *
     * @param family the family value to set.
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withFamily(ExpressRouteCircuitSkuFamily family) {
        this.family = family;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
