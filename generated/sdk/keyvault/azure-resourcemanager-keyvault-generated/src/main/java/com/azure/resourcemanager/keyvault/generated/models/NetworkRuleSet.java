// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A set of rules governing the network accessibility of a vault. */
@Fluent
public final class NetworkRuleSet {
    /*
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the
     * default is 'AzureServices'.
     */
    @JsonProperty(value = "bypass")
    private NetworkRuleBypassOptions bypass;

    /*
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the
     * bypass property has been evaluated.
     */
    @JsonProperty(value = "defaultAction")
    private NetworkRuleAction defaultAction;

    /*
     * The list of IP address rules.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /*
     * The list of virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /** Creates an instance of NetworkRuleSet class. */
    public NetworkRuleSet() {
    }

    /**
     * Get the bypass property: Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'. If
     * not specified the default is 'AzureServices'.
     *
     * @return the bypass value.
     */
    public NetworkRuleBypassOptions bypass() {
        return this.bypass;
    }

    /**
     * Set the bypass property: Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'. If
     * not specified the default is 'AzureServices'.
     *
     * @param bypass the bypass value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withBypass(NetworkRuleBypassOptions bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get the defaultAction property: The default action when no rule from ipRules and from virtualNetworkRules match.
     * This is only used after the bypass property has been evaluated.
     *
     * @return the defaultAction value.
     */
    public NetworkRuleAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: The default action when no rule from ipRules and from virtualNetworkRules match.
     * This is only used after the bypass property has been evaluated.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(NetworkRuleAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the ipRules property: The list of IP address rules.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: The list of IP address rules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: The list of virtual network rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: The list of virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
    }
}
