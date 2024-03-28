// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to VirtualNetworkGateway or LocalNetworkGateway resource.
 */
@Fluent
public final class VirtualNetworkConnectionGatewayReference {
    /*
     * The ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of VirtualNetworkConnectionGatewayReference class.
     */
    public VirtualNetworkConnectionGatewayReference() {
    }

    /**
     * Get the id property: The ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of VirtualNetworkGateway or LocalNetworkGateway resource.
     * 
     * @param id the id value to set.
     * @return the VirtualNetworkConnectionGatewayReference object itself.
     */
    public VirtualNetworkConnectionGatewayReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property id in model VirtualNetworkConnectionGatewayReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkConnectionGatewayReference.class);
}
