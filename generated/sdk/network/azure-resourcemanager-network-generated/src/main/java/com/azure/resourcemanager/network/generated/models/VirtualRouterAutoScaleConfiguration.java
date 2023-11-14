// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualHub Router autoscale configuration.
 */
@Fluent
public final class VirtualRouterAutoScaleConfiguration {
    /*
     * The minimum number of scale units for VirtualHub Router.
     */
    @JsonProperty(value = "minCapacity")
    private Integer minCapacity;

    /**
     * Creates an instance of VirtualRouterAutoScaleConfiguration class.
     */
    public VirtualRouterAutoScaleConfiguration() {
    }

    /**
     * Get the minCapacity property: The minimum number of scale units for VirtualHub Router.
     * 
     * @return the minCapacity value.
     */
    public Integer minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: The minimum number of scale units for VirtualHub Router.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the VirtualRouterAutoScaleConfiguration object itself.
     */
    public VirtualRouterAutoScaleConfiguration withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
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
