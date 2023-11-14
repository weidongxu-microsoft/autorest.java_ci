// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * The UserAssignedManagedIdentity model.
 */
@Immutable
public final class UserAssignedManagedIdentity {
    /*
     * The client ID.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID clientId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * Creates an instance of UserAssignedManagedIdentity class.
     */
    public UserAssignedManagedIdentity() {
    }

    /**
     * Get the clientId property: The client ID.
     * 
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Get the principalId property: The principal ID.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
