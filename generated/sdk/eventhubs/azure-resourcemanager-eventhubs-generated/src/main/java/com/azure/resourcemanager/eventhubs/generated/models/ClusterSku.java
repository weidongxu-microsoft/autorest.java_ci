// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU parameters particular to a cluster instance. */
@Fluent
public final class ClusterSku {
    /*
     * Name of this SKU.
     */
    @JsonProperty(value = "name", required = true)
    private ClusterSkuName name;

    /*
     * The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /** Creates an instance of ClusterSku class. */
    public ClusterSku() {
    }

    /**
     * Get the name property: Name of this SKU.
     *
     * @return the name value.
     */
    public ClusterSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of this SKU.
     *
     * @param name the name value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withName(ClusterSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capacity property: The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     *
     * @param capacity the capacity value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withCapacity(Integer capacity) {
        this.capacity = capacity;
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
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ClusterSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterSku.class);
}
