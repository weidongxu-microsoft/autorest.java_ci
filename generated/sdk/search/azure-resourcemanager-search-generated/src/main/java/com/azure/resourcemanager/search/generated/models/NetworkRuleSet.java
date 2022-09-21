// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network specific rules that determine how the Azure Cognitive Search service may be reached. */
@Fluent
public final class NetworkRuleSet {
    /*
     * A list of IP restriction rules that defines the inbound network(s) with allowing access to the search service
     * endpoint. At the meantime, all other public IP networks are blocked by the firewall. These restriction rules are
     * applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise, traffic over public
     * interface is not allowed even with any public IP rules, and private endpoint connections would be the exclusive
     * access method.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /** Creates an instance of NetworkRuleSet class. */
    public NetworkRuleSet() {
    }

    /**
     * Get the ipRules property: A list of IP restriction rules that defines the inbound network(s) with allowing access
     * to the search service endpoint. At the meantime, all other public IP networks are blocked by the firewall. These
     * restriction rules are applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise,
     * traffic over public interface is not allowed even with any public IP rules, and private endpoint connections
     * would be the exclusive access method.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: A list of IP restriction rules that defines the inbound network(s) with allowing access
     * to the search service endpoint. At the meantime, all other public IP networks are blocked by the firewall. These
     * restriction rules are applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise,
     * traffic over public interface is not allowed even with any public IP rules, and private endpoint connections
     * would be the exclusive access method.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
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
    }
}
