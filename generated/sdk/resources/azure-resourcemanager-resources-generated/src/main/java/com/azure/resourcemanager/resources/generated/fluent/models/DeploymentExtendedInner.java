// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.resources.generated.models.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Deployment information.
 */
@Fluent
public final class DeploymentExtendedInner extends Resource {
    /*
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Creates an instance of DeploymentExtendedInner class.
     */
    public DeploymentExtendedInner() {
    }

    /**
     * Get the properties property: Deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentExtendedInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentExtendedInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
