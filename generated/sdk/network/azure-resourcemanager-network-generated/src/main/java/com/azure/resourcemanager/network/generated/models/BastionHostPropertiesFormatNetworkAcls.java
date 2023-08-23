// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BastionHostPropertiesFormatNetworkAcls model. */
@Fluent
public final class BastionHostPropertiesFormatNetworkAcls {
    /*
     * Sets the IP ACL rules for Developer Bastion Host.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /** Creates an instance of BastionHostPropertiesFormatNetworkAcls class. */
    public BastionHostPropertiesFormatNetworkAcls() {
    }

    /**
     * Get the ipRules property: Sets the IP ACL rules for Developer Bastion Host.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: Sets the IP ACL rules for Developer Bastion Host.
     *
     * @param ipRules the ipRules value to set.
     * @return the BastionHostPropertiesFormatNetworkAcls object itself.
     */
    public BastionHostPropertiesFormatNetworkAcls withIpRules(List<IpRule> ipRules) {
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
