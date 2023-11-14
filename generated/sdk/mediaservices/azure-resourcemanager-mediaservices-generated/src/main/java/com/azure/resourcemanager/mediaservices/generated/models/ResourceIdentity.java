// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceIdentity model.
 */
@Fluent
public final class ResourceIdentity {
    /*
     * The user assigned managed identity's ARM ID to use when accessing a resource.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /*
     * Indicates whether to use System Assigned Managed Identity. Mutual exclusive with User Assigned Managed Identity.
     */
    @JsonProperty(value = "useSystemAssignedIdentity", required = true)
    private boolean useSystemAssignedIdentity;

    /**
     * Creates an instance of ResourceIdentity class.
     */
    public ResourceIdentity() {
    }

    /**
     * Get the userAssignedIdentity property: The user assigned managed identity's ARM ID to use when accessing a
     * resource.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user assigned managed identity's ARM ID to use when accessing a
     * resource.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

    /**
     * Get the useSystemAssignedIdentity property: Indicates whether to use System Assigned Managed Identity. Mutual
     * exclusive with User Assigned Managed Identity.
     * 
     * @return the useSystemAssignedIdentity value.
     */
    public boolean useSystemAssignedIdentity() {
        return this.useSystemAssignedIdentity;
    }

    /**
     * Set the useSystemAssignedIdentity property: Indicates whether to use System Assigned Managed Identity. Mutual
     * exclusive with User Assigned Managed Identity.
     * 
     * @param useSystemAssignedIdentity the useSystemAssignedIdentity value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withUseSystemAssignedIdentity(boolean useSystemAssignedIdentity) {
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
