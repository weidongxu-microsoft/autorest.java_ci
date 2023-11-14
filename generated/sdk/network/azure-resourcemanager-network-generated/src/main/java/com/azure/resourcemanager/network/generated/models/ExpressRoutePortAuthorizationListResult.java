// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortAuthorizationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpressRoute Port Authorization List Result
 * 
 * Response for ListExpressRoutePortAuthorizations API service call.
 */
@Fluent
public final class ExpressRoutePortAuthorizationListResult {
    /*
     * The authorizations in an ExpressRoute Port.
     */
    @JsonProperty(value = "value")
    private List<ExpressRoutePortAuthorizationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ExpressRoutePortAuthorizationListResult class.
     */
    public ExpressRoutePortAuthorizationListResult() {
    }

    /**
     * Get the value property: The authorizations in an ExpressRoute Port.
     * 
     * @return the value value.
     */
    public List<ExpressRoutePortAuthorizationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The authorizations in an ExpressRoute Port.
     * 
     * @param value the value value to set.
     * @return the ExpressRoutePortAuthorizationListResult object itself.
     */
    public ExpressRoutePortAuthorizationListResult withValue(List<ExpressRoutePortAuthorizationInner> value) {
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
     * @return the ExpressRoutePortAuthorizationListResult object itself.
     */
    public ExpressRoutePortAuthorizationListResult withNextLink(String nextLink) {
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
