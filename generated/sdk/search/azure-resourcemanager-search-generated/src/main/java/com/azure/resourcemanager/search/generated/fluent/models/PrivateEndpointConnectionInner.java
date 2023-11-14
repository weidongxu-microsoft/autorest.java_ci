// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.search.generated.models.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an existing private endpoint connection to the search service.
 */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    /*
     * Describes the properties of an existing private endpoint connection to the search service.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /**
     * Creates an instance of PrivateEndpointConnectionInner class.
     */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the properties property: Describes the properties of an existing private endpoint connection to the search
     * service.
     * 
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes the properties of an existing private endpoint connection to the search
     * service.
     * 
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
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
