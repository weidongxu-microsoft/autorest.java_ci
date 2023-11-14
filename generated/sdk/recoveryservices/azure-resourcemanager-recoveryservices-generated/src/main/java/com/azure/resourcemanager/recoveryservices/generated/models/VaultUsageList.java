// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.VaultUsageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Usage for vault.
 */
@Fluent
public final class VaultUsageList {
    /*
     * The list of usages for the given vault.
     */
    @JsonProperty(value = "value")
    private List<VaultUsageInner> value;

    /**
     * Creates an instance of VaultUsageList class.
     */
    public VaultUsageList() {
    }

    /**
     * Get the value property: The list of usages for the given vault.
     * 
     * @return the value value.
     */
    public List<VaultUsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of usages for the given vault.
     * 
     * @param value the value value to set.
     * @return the VaultUsageList object itself.
     */
    public VaultUsageList withValue(List<VaultUsageInner> value) {
        this.value = value;
        return this;
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
