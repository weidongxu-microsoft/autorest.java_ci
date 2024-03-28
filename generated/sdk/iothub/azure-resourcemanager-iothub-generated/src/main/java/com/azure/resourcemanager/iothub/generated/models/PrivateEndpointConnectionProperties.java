// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a private endpoint connection.
 */
@Fluent
public final class PrivateEndpointConnectionProperties {
    /*
     * The private endpoint property of a private endpoint connection
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * The current state of a private endpoint connection
     */
    @JsonProperty(value = "privateLinkServiceConnectionState", required = true)
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

    /**
     * Get the privateEndpoint property: The private endpoint property of a private endpoint connection.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The private endpoint property of a private endpoint connection.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The current state of a private endpoint connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The current state of a private endpoint connection.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property privateLinkServiceConnectionState in model PrivateEndpointConnectionProperties"));
        } else {
            privateLinkServiceConnectionState().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionProperties.class);
}
