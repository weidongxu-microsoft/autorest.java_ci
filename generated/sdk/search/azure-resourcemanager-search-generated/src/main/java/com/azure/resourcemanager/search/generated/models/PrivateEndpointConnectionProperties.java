// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service. */
@Fluent
public final class PrivateEndpointConnectionProperties {
    /*
     * The private endpoint resource from Microsoft.Network provider.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpointConnectionPropertiesPrivateEndpoint privateEndpoint;

    /*
     * Describes the current state of an existing Private Link Service
     * connection to the Azure Private Endpoint.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Get the privateEndpoint property: The private endpoint resource from Microsoft.Network provider.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpointConnectionPropertiesPrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The private endpoint resource from Microsoft.Network provider.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(
        PrivateEndpointConnectionPropertiesPrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Describes the current state of an existing Private Link
     * Service connection to the Azure Private Endpoint.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Describes the current state of an existing Private Link
     * Service connection to the Azure Private Endpoint.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
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
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
