// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Resource group information. */
@Fluent
public final class ResourceGroupPatchable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceGroupPatchable.class);

    /*
     * The name of the resource group.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource group properties.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /*
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /*
     * The tags attached to the resource group.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the name property: The name of the resource group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource group.
     *
     * @param name the name value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The resource group properties.
     *
     * @return the properties value.
     */
    public ResourceGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource group properties.
     *
     * @param properties the properties value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the managedBy property: The ID of the resource that manages this resource group.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the managedBy property: The ID of the resource that manages this resource group.
     *
     * @param managedBy the managedBy value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the tags property: The tags attached to the resource group.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags attached to the resource group.
     *
     * @param tags the tags value to set.
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
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
