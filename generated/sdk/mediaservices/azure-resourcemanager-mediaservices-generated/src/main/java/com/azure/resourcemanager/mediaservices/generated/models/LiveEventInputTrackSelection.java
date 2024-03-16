// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A track selection condition. This property is reserved for future use, any value set on this property will be ignored.
 */
@Fluent
public final class LiveEventInputTrackSelection {
    /*
     * Property name to select. This property is reserved for future use, any value set on this property will be ignored.
     */
    @JsonProperty(value = "property")
    private String property;

    /*
     * Comparing operation. This property is reserved for future use, any value set on this property will be ignored.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Property value to select. This property is reserved for future use, any value set on this property will be ignored.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of LiveEventInputTrackSelection class.
     */
    public LiveEventInputTrackSelection() {
    }

    /**
     * Get the property property: Property name to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @return the property value.
     */
    public String property() {
        return this.property;
    }

    /**
     * Set the property property: Property name to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @param property the property value to set.
     * @return the LiveEventInputTrackSelection object itself.
     */
    public LiveEventInputTrackSelection withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get the operation property: Comparing operation. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Comparing operation. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @param operation the operation value to set.
     * @return the LiveEventInputTrackSelection object itself.
     */
    public LiveEventInputTrackSelection withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the value property: Property value to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Property value to select. This property is reserved for future use, any value set on this property will be ignored.
     * 
     * @param value the value value to set.
     * @return the LiveEventInputTrackSelection object itself.
     */
    public LiveEventInputTrackSelection withValue(String value) {
        this.value = value;
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
