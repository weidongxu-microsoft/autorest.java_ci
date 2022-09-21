// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A rule governing the accessibility of a vault from a specific virtual network. */
@Fluent
public final class VirtualNetworkRule {
    /*
     * Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Property to specify whether NRP will ignore the check if parent subnet has serviceEndpoints configured.
     */
    @JsonProperty(value = "ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /** Creates an instance of VirtualNetworkRule class. */
    public VirtualNetworkRule() {
    }

    /**
     * Get the id property: Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Property to specify whether NRP will ignore the check if
     * parent subnet has serviceEndpoints configured.
     *
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Property to specify whether NRP will ignore the check if
     * parent subnet has serviceEndpoints configured.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model VirtualNetworkRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkRule.class);
}
