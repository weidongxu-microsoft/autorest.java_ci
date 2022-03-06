// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Operations List response which contains list of available APIs. */
@Fluent
public final class ClientDiscoveryResponse {
    /*
     * List of available operations.
     */
    @JsonProperty(value = "value")
    private List<ClientDiscoveryValueForSingleApiInner> value;

    /*
     * Link to the next chunk of the response
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of available operations.
     *
     * @return the value value.
     */
    public List<ClientDiscoveryValueForSingleApiInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of available operations.
     *
     * @param value the value value to set.
     * @return the ClientDiscoveryResponse object itself.
     */
    public ClientDiscoveryResponse withValue(List<ClientDiscoveryValueForSingleApiInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next chunk of the response.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next chunk of the response.
     *
     * @param nextLink the nextLink value to set.
     * @return the ClientDiscoveryResponse object itself.
     */
    public ClientDiscoveryResponse withNextLink(String nextLink) {
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
