// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the network profile for the role instance.
 */
@Immutable
public final class RoleInstanceNetworkProfile {
    /*
     * Specifies the list of resource Ids for the network interfaces associated with the role instance.
     */
    @JsonProperty(value = "networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> networkInterfaces;

    /**
     * Creates an instance of RoleInstanceNetworkProfile class.
     */
    public RoleInstanceNetworkProfile() {
    }

    /**
     * Get the networkInterfaces property: Specifies the list of resource Ids for the network interfaces associated with the role instance.
     * 
     * @return the networkInterfaces value.
     */
    public List<SubResource> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
