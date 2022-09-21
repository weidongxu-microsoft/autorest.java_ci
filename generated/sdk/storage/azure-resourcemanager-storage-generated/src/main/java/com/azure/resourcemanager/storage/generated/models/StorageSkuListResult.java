// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.generated.fluent.models.SkuInformationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List Storage SKUs operation. */
@Immutable
public final class StorageSkuListResult {
    /*
     * Get the list result of storage SKUs and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuInformationInner> value;

    /** Creates an instance of StorageSkuListResult class. */
    public StorageSkuListResult() {
    }

    /**
     * Get the value property: Get the list result of storage SKUs and their properties.
     *
     * @return the value value.
     */
    public List<SkuInformationInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
