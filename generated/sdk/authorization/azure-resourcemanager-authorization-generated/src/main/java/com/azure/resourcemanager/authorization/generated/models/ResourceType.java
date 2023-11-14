// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Resource Type.
 */
@Fluent
public final class ResourceType {
    /*
     * The resource type name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The resource type operations.
     */
    @JsonProperty(value = "operations")
    private List<ProviderOperation> operations;

    /**
     * Creates an instance of ResourceType class.
     */
    public ResourceType() {
    }

    /**
     * Get the name property: The resource type name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource type name.
     * 
     * @param name the name value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The resource type display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The resource type display name.
     * 
     * @param displayName the displayName value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the operations property: The resource type operations.
     * 
     * @return the operations value.
     */
    public List<ProviderOperation> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The resource type operations.
     * 
     * @param operations the operations value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withOperations(List<ProviderOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }
}
