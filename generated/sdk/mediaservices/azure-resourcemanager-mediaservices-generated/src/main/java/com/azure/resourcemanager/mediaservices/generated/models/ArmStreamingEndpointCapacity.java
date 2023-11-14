// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The streaming endpoint sku capacity.
 */
@Fluent
public final class ArmStreamingEndpointCapacity {
    /*
     * The scaleType property.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private String scaleType;

    /*
     * The streaming endpoint default capacity.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /*
     * The streaming endpoint minimum capacity.
     */
    @JsonProperty(value = "minimum")
    private Integer minimum;

    /*
     * The streaming endpoint maximum capacity.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /**
     * Creates an instance of ArmStreamingEndpointCapacity class.
     */
    public ArmStreamingEndpointCapacity() {
    }

    /**
     * Get the scaleType property: The scaleType property.
     * 
     * @return the scaleType value.
     */
    public String scaleType() {
        return this.scaleType;
    }

    /**
     * Get the defaultProperty property: The streaming endpoint default capacity.
     * 
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The streaming endpoint default capacity.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the ArmStreamingEndpointCapacity object itself.
     */
    public ArmStreamingEndpointCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the minimum property: The streaming endpoint minimum capacity.
     * 
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The streaming endpoint minimum capacity.
     * 
     * @param minimum the minimum value to set.
     * @return the ArmStreamingEndpointCapacity object itself.
     */
    public ArmStreamingEndpointCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The streaming endpoint maximum capacity.
     * 
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The streaming endpoint maximum capacity.
     * 
     * @param maximum the maximum value to set.
     * @return the ArmStreamingEndpointCapacity object itself.
     */
    public ArmStreamingEndpointCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
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
