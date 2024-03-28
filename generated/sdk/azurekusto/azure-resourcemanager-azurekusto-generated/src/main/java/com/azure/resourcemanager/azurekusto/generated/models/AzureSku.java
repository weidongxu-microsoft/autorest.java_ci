// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure SKU definition.
 */
@Fluent
public final class AzureSku {
    /*
     * SKU name.
     */
    @JsonProperty(value = "name", required = true)
    private AzureSkuName name;

    /*
     * The number of instances of the cluster.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /*
     * SKU tier.
     */
    @JsonProperty(value = "tier", required = true)
    private AzureSkuTier tier;

    /**
     * Creates an instance of AzureSku class.
     */
    public AzureSku() {
    }

    /**
     * Get the name property: SKU name.
     * 
     * @return the name value.
     */
    public AzureSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: SKU name.
     * 
     * @param name the name value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withName(AzureSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capacity property: The number of instances of the cluster.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The number of instances of the cluster.
     * 
     * @param capacity the capacity value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the tier property: SKU tier.
     * 
     * @return the tier value.
     */
    public AzureSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: SKU tier.
     * 
     * @param tier the tier value to set.
     * @return the AzureSku object itself.
     */
    public AzureSku withTier(AzureSkuTier tier) {
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model AzureSku"));
        }
        if (tier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tier in model AzureSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSku.class);
}
