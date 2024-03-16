// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of an existing private endpoint connection to the search service.
 */
@Fluent
public final class PrivateEndpointConnectionProperties {
    /*
     * The private endpoint resource from Microsoft.Network provider.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpointConnectionPropertiesPrivateEndpoint privateEndpoint;

    /*
     * Describes the current state of an existing Azure Private Link service connection to the private endpoint.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * The group ID of the Azure resource for which the private link service is for.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The provisioning state of the private link service connection. Valid values are Updating, Deleting, Failed, Succeeded, Incomplete, or Canceled.
     */
    @JsonProperty(value = "provisioningState")
    private PrivateLinkServiceConnectionProvisioningState provisioningState;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

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
    public PrivateEndpointConnectionProperties
        withPrivateEndpoint(PrivateEndpointConnectionPropertiesPrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Describes the current state of an existing Azure Private Link service connection to the private endpoint.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Describes the current state of an existing Azure Private Link service connection to the private endpoint.
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
     * Get the groupId property: The group ID of the Azure resource for which the private link service is for.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group ID of the Azure resource for which the private link service is for.
     * 
     * @param groupId the groupId value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private link service connection. Valid values are Updating, Deleting, Failed, Succeeded, Incomplete, or Canceled.
     * 
     * @return the provisioningState value.
     */
    public PrivateLinkServiceConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the private link service connection. Valid values are Updating, Deleting, Failed, Succeeded, Incomplete, or Canceled.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties
        withProvisioningState(PrivateLinkServiceConnectionProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
