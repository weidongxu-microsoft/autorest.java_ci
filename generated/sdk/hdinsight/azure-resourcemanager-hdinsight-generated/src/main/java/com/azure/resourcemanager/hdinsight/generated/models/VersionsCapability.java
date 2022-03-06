// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The version capability. */
@Fluent
public final class VersionsCapability {
    /*
     * The list of version capabilities.
     */
    @JsonProperty(value = "available")
    private List<VersionSpec> available;

    /**
     * Get the available property: The list of version capabilities.
     *
     * @return the available value.
     */
    public List<VersionSpec> available() {
        return this.available;
    }

    /**
     * Set the available property: The list of version capabilities.
     *
     * @param available the available value to set.
     * @return the VersionsCapability object itself.
     */
    public VersionsCapability withAvailable(List<VersionSpec> available) {
        this.available = available;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (available() != null) {
            available().forEach(e -> e.validate());
        }
    }
}
