// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information to be stored in Vault properties as an element of privateEndpointConnections List. */
@Immutable
public final class PrivateEndpointConnectionVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionVaultProperties.class);

    /*
     * Format of id
     * subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Private Endpoint Connection Response Properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnection properties;

    /*
     * The name of the private Endpoint Connection
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type, which will be of the format,
     * Microsoft.RecoveryServices/vaults/privateEndpointConnections
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The location of the private Endpoint connection
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the id property: Format of id
     * subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the properties property: Private Endpoint Connection Response Properties.
     *
     * @return the properties value.
     */
    public PrivateEndpointConnection properties() {
        return this.properties;
    }

    /**
     * Get the name property: The name of the private Endpoint Connection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type, which will be of the format,
     * Microsoft.RecoveryServices/vaults/privateEndpointConnections.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: The location of the private Endpoint connection.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
