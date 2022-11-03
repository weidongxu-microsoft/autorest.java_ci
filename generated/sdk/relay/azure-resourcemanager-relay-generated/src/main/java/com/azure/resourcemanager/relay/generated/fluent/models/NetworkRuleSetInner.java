// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.relay.generated.models.DefaultAction;
import com.azure.resourcemanager.relay.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.relay.generated.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of topic resource. */
@Fluent
public final class NetworkRuleSetInner extends ProxyResource {
    /*
     * NetworkRuleSet properties
     */
    @JsonProperty(value = "properties")
    private NetworkRuleSetProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkRuleSetInner class. */
    public NetworkRuleSetInner() {
    }

    /**
     * Get the innerProperties property: NetworkRuleSet properties.
     *
     * @return the innerProperties value.
     */
    private NetworkRuleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultAction();
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withDefaultAction(DefaultAction defaultAction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withDefaultAction(defaultAction);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.innerProperties() == null ? null : this.innerProperties().ipRules();
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withIpRules(List<NWRuleSetIpRules> ipRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withIpRules(ipRules);
        return this;
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
