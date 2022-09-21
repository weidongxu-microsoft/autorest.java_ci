// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ShareInfoElement model. */
@Immutable
public final class ShareInfoElement {
    /*
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "vmUri", access = JsonProperty.Access.WRITE_ONLY)
    private String vmUri;

    /** Creates an instance of ShareInfoElement class. */
    public ShareInfoElement() {
    }

    /**
     * Get the vmUri property: A relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the vmUri value.
     */
    public String vmUri() {
        return this.vmUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
