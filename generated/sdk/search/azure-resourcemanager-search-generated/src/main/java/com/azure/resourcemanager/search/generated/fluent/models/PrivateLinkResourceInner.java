// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.search.generated.models.PrivateLinkResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a supported private link resource for the Azure AI Search service.
 */
@Immutable
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * Describes the properties of a supported private link resource for the Azure AI Search service.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkResourceProperties properties;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the properties property: Describes the properties of a supported private link resource for the Azure AI Search service.
     * 
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
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
