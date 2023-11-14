// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ARM resource for a detector definition.
 */
@Fluent
public final class DetectorDefinitionResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private DetectorDefinition innerProperties;

    /**
     * Creates an instance of DetectorDefinitionResourceInner class.
     */
    public DetectorDefinitionResourceInner() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private DetectorDefinition innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DetectorDefinitionResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the displayName property: Display name of the detector.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the description property: Description of the detector.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the rank property: Detector Rank.
     * 
     * @return the rank value.
     */
    public Double rank() {
        return this.innerProperties() == null ? null : this.innerProperties().rank();
    }

    /**
     * Get the isEnabled property: Flag representing whether detector is enabled or not.
     * 
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
