// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Billing information related properties of a server.
 */
@Fluent
public final class Sku {
    /*
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The tier of the particular SKU, e.g. Basic.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /*
     * The scale up/out capacity, representing server's compute units.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /*
     * The size code, to be interpreted by resource as appropriate.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The family of hardware.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
    }

    /**
     * Get the name property: The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the particular SKU, e.g. Basic.
     * 
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the particular SKU, e.g. Basic.
     * 
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: The scale up/out capacity, representing server's compute units.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The scale up/out capacity, representing server's compute units.
     * 
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the size property: The size code, to be interpreted by resource as appropriate.
     * 
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The size code, to be interpreted by resource as appropriate.
     * 
     * @param size the size value to set.
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: The family of hardware.
     * 
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The family of hardware.
     * 
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
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
