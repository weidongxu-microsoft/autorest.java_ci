// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU of the namespace. */
@Fluent
public final class Sku {
    /*
     * Name of this SKU.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The tier of this SKU.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * Get the name property: Name of this SKU.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of this SKU.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of this SKU.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of this SKU.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);
}
