// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class representing the properties of a managed private endpoint object. */
@Fluent
public final class ManagedPrivateEndpointProperties {
    /*
     * The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     */
    @JsonProperty(value = "privateLinkResourceId", required = true)
    private String privateLinkResourceId;

    /*
     * The region of the resource to which the managed private endpoint is
     * created.
     */
    @JsonProperty(value = "privateLinkResourceRegion")
    private String privateLinkResourceRegion;

    /*
     * The groupId in which the managed private endpoint is created.
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * The user request message.
     */
    @JsonProperty(value = "requestMessage")
    private String requestMessage;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the privateLinkResourceId property: The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the privateLinkResourceRegion property: The region of the resource to which the managed private endpoint is
     * created.
     *
     * @return the privateLinkResourceRegion value.
     */
    public String privateLinkResourceRegion() {
        return this.privateLinkResourceRegion;
    }

    /**
     * Set the privateLinkResourceRegion property: The region of the resource to which the managed private endpoint is
     * created.
     *
     * @param privateLinkResourceRegion the privateLinkResourceRegion value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties withPrivateLinkResourceRegion(String privateLinkResourceRegion) {
        this.privateLinkResourceRegion = privateLinkResourceRegion;
        return this;
    }

    /**
     * Get the groupId property: The groupId in which the managed private endpoint is created.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The groupId in which the managed private endpoint is created.
     *
     * @param groupId the groupId value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requestMessage property: The user request message.
     *
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set the requestMessage property: The user request message.
     *
     * @param requestMessage the requestMessage value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateLinkResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privateLinkResourceId in model ManagedPrivateEndpointProperties"));
        }
        if (groupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupId in model ManagedPrivateEndpointProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedPrivateEndpointProperties.class);
}
