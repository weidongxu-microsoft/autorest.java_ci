// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.SkuDescriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of the EngagementFabric SKU descriptions.
 */
@Immutable
public final class SkuDescriptionList {
    /*
     * SKU descriptions
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuDescriptionInner> value;

    /**
     * Creates an instance of SkuDescriptionList class.
     */
    public SkuDescriptionList() {
    }

    /**
     * Get the value property: SKU descriptions.
     * 
     * @return the value value.
     */
    public List<SkuDescriptionInner> value() {
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
