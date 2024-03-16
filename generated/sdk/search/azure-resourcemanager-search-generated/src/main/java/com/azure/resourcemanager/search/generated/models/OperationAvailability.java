// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a particular availability for the metric specification.
 */
@Immutable
public final class OperationAvailability {
    /*
     * The time grain for the dimension.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * The blob duration for the dimension.
     */
    @JsonProperty(value = "blobDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String blobDuration;

    /**
     * Creates an instance of OperationAvailability class.
     */
    public OperationAvailability() {
    }

    /**
     * Get the timeGrain property: The time grain for the dimension.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the blobDuration property: The blob duration for the dimension.
     * 
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
