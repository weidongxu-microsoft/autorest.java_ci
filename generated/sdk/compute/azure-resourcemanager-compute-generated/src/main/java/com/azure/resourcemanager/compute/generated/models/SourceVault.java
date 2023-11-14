// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The vault id is an Azure Resource Manager Resource id in the form
 * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}.
 */
@Fluent
public final class SourceVault {
    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of SourceVault class.
     */
    public SourceVault() {
    }

    /**
     * Get the id property: Resource Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     * 
     * @param id the id value to set.
     * @return the SourceVault object itself.
     */
    public SourceVault withId(String id) {
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
