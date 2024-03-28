// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies eventGridAndResourceGraph related Scheduled Event related configurations.
 */
@Fluent
public final class EventGridAndResourceGraph {
    /*
     * Specifies if event grid and resource graph is enabled for Scheduled event related configurations.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /**
     * Creates an instance of EventGridAndResourceGraph class.
     */
    public EventGridAndResourceGraph() {
    }

    /**
     * Get the enable property: Specifies if event grid and resource graph is enabled for Scheduled event related
     * configurations.
     * 
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Specifies if event grid and resource graph is enabled for Scheduled event related
     * configurations.
     * 
     * @param enable the enable value to set.
     * @return the EventGridAndResourceGraph object itself.
     */
    public EventGridAndResourceGraph withEnable(Boolean enable) {
        this.enable = enable;
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