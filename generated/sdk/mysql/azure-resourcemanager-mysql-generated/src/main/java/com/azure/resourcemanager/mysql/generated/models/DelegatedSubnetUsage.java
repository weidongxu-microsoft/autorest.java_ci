// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Delegated subnet usage data. */
@Immutable
public final class DelegatedSubnetUsage {
    /*
     * name of the subnet
     */
    @JsonProperty(value = "subnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetName;

    /*
     * Number of used delegated subnets
     */
    @JsonProperty(value = "usage", access = JsonProperty.Access.WRITE_ONLY)
    private Long usage;

    /** Creates an instance of DelegatedSubnetUsage class. */
    public DelegatedSubnetUsage() {
    }

    /**
     * Get the subnetName property: name of the subnet.
     *
     * @return the subnetName value.
     */
    public String subnetName() {
        return this.subnetName;
    }

    /**
     * Get the usage property: Number of used delegated subnets.
     *
     * @return the usage value.
     */
    public Long usage() {
        return this.usage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
