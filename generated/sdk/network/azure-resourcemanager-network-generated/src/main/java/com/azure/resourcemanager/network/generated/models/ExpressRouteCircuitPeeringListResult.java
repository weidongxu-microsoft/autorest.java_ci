// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListPeering API service call retrieves all peerings that belong to an ExpressRouteCircuit.
 */
@Fluent
public final class ExpressRouteCircuitPeeringListResult {
    /*
     * The peerings in an express route circuit.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitPeeringInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteCircuitPeeringListResult class.
     */
    public ExpressRouteCircuitPeeringListResult() {
    }

    /**
     * Get the value property: The peerings in an express route circuit.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCircuitPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The peerings in an express route circuit.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCircuitPeeringListResult object itself.
     */
    public ExpressRouteCircuitPeeringListResult withValue(List<ExpressRouteCircuitPeeringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitPeeringListResult object itself.
     */
    public ExpressRouteCircuitPeeringListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
