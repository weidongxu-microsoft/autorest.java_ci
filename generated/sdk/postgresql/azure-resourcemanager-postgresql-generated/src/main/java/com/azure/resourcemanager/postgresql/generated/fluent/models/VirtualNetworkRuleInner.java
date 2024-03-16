// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.postgresql.generated.models.VirtualNetworkRuleState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A virtual network rule.
 */
@Fluent
public final class VirtualNetworkRuleInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkRuleProperties innerProperties;

    /**
     * Creates an instance of VirtualNetworkRuleInner class.
     */
    public VirtualNetworkRuleInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private VirtualNetworkRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     * 
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkSubnetId();
    }

    /**
     * Set the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     * 
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkRuleProperties();
        }
        this.innerProperties().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreMissingVnetServiceEndpoint();
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkRuleProperties();
        }
        this.innerProperties().withIgnoreMissingVnetServiceEndpoint(ignoreMissingVnetServiceEndpoint);
        return this;
    }

    /**
     * Get the state property: Virtual Network Rule State.
     * 
     * @return the state value.
     */
    public VirtualNetworkRuleState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
