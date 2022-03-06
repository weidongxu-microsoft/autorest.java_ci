// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private endpoint. */
@Fluent
public final class PrivateEndpoint {
    /*
     * The private endpoint id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The private endpoint id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The private endpoint id.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
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
