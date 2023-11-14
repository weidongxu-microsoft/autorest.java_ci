// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * NetworkVirtualApplianceConnection list.
 */
@Fluent
public final class NetworkVirtualApplianceConnectionList {
    /*
     * The list of NetworkVirtualAppliance connections.
     */
    @JsonProperty(value = "value")
    private List<NetworkVirtualApplianceConnectionInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of NetworkVirtualApplianceConnectionList class.
     */
    public NetworkVirtualApplianceConnectionList() {
    }

    /**
     * Get the value property: The list of NetworkVirtualAppliance connections.
     * 
     * @return the value value.
     */
    public List<NetworkVirtualApplianceConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of NetworkVirtualAppliance connections.
     * 
     * @param value the value value to set.
     * @return the NetworkVirtualApplianceConnectionList object itself.
     */
    public NetworkVirtualApplianceConnectionList withValue(List<NetworkVirtualApplianceConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NetworkVirtualApplianceConnectionList object itself.
     */
    public NetworkVirtualApplianceConnectionList withNextLink(String nextLink) {
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
