// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The azure resource id. */
@Fluent
public final class ResourceId {
    /*
     * The azure resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The azure resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The azure resource id.
     *
     * @param id the id value to set.
     * @return the ResourceId object itself.
     */
    public ResourceId withId(String id) {
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
