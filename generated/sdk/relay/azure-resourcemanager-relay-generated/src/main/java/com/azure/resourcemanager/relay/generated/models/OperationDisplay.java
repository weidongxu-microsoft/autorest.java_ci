// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation display payload.
 */
@Immutable
public final class OperationDisplay {
    /*
     * Resource provider of the operation
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * Resource of the operation
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /*
     * Localized friendly name for the operation
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * Localized friendly description for the operation
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Creates an instance of OperationDisplay class.
     */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: Resource provider of the operation.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: Resource of the operation.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation property: Localized friendly name for the operation.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: Localized friendly description for the operation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
