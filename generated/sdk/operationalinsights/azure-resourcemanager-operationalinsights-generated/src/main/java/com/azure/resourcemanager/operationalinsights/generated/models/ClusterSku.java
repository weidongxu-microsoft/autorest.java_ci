// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cluster sku definition.
 */
@Fluent
public final class ClusterSku {
    /*
     * The capacity reservation level in Gigabytes for this cluster.
     */
    @JsonProperty(value = "capacity")
    private Capacity capacity;

    /*
     * The SKU (tier) of a cluster.
     */
    @JsonProperty(value = "name")
    private ClusterSkuNameEnum name;

    /**
     * Creates an instance of ClusterSku class.
     */
    public ClusterSku() {
    }

    /**
     * Get the capacity property: The capacity reservation level in Gigabytes for this cluster.
     * 
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity reservation level in Gigabytes for this cluster.
     * 
     * @param capacity the capacity value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the name property: The SKU (tier) of a cluster.
     * 
     * @return the name value.
     */
    public ClusterSkuNameEnum name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU (tier) of a cluster.
     * 
     * @param name the name value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withName(ClusterSkuNameEnum name) {
        this.name = name;
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
