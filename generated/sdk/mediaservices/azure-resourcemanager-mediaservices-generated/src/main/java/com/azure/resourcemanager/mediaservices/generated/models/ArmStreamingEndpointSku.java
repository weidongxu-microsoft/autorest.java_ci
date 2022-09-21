// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The streaming endpoint sku. */
@Immutable
public final class ArmStreamingEndpointSku {
    /*
     * The streaming endpoint sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of ArmStreamingEndpointSku class. */
    public ArmStreamingEndpointSku() {
    }

    /**
     * Get the name property: The streaming endpoint sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
