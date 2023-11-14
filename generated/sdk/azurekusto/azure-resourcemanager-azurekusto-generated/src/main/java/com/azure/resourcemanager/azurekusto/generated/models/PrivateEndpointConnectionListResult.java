// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of private endpoint connections.
 */
@Fluent
public final class PrivateEndpointConnectionListResult {
    /*
     * Array of private endpoint connections
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionInner> value;

    /**
     * Creates an instance of PrivateEndpointConnectionListResult class.
     */
    public PrivateEndpointConnectionListResult() {
    }

    /**
     * Get the value property: Array of private endpoint connections.
     * 
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private endpoint connections.
     * 
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResult object itself.
     */
    public PrivateEndpointConnectionListResult withValue(List<PrivateEndpointConnectionInner> value) {
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
