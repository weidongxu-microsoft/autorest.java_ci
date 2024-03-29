// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Msi identity details of the resource.
 */
@Fluent
public final class ResourceIdentity {
    /*
     * Identity type
     */
    @JsonProperty(value = "type")
    private MsiIdentityType type;

    /*
     * Service Principal Id backing the Msi
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * Home Tenant Id
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Creates an instance of ResourceIdentity class.
     */
    public ResourceIdentity() {
    }

    /**
     * Get the type property: Identity type.
     * 
     * @return the type value.
     */
    public MsiIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Identity type.
     * 
     * @param type the type value to set.
     * @return the ResourceIdentity object itself.
     */
    public ResourceIdentity withType(MsiIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: Service Principal Id backing the Msi.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: Home Tenant Id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
