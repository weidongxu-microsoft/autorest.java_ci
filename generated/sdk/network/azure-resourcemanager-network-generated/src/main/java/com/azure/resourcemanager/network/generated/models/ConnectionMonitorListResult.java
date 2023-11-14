// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of connection monitors.
 */
@Fluent
public final class ConnectionMonitorListResult {
    /*
     * Information about connection monitors.
     */
    @JsonProperty(value = "value")
    private List<ConnectionMonitorResultInner> value;

    /**
     * Creates an instance of ConnectionMonitorListResult class.
     */
    public ConnectionMonitorListResult() {
    }

    /**
     * Get the value property: Information about connection monitors.
     * 
     * @return the value value.
     */
    public List<ConnectionMonitorResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about connection monitors.
     * 
     * @param value the value value to set.
     * @return the ConnectionMonitorListResult object itself.
     */
    public ConnectionMonitorListResult withValue(List<ConnectionMonitorResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
