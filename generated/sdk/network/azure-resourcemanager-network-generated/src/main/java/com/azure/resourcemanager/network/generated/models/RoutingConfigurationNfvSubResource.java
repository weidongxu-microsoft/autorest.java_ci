// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reference to RouteTableV3 associated with the connection. */
@Fluent
public final class RoutingConfigurationNfvSubResource {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /** Creates an instance of RoutingConfigurationNfvSubResource class. */
    public RoutingConfigurationNfvSubResource() {
    }

    /**
     * Get the resourceUri property: Resource ID.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: Resource ID.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the RoutingConfigurationNfvSubResource object itself.
     */
    public RoutingConfigurationNfvSubResource withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
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