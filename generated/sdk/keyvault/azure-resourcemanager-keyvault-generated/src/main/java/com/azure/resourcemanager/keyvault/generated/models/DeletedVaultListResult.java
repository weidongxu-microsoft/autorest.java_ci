// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.generated.fluent.models.DeletedVaultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of vaults. */
@Fluent
public final class DeletedVaultListResult {
    /*
     * The list of deleted vaults.
     */
    @JsonProperty(value = "value")
    private List<DeletedVaultInner> value;

    /*
     * The URL to get the next set of deleted vaults.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of deleted vaults.
     *
     * @return the value value.
     */
    public List<DeletedVaultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of deleted vaults.
     *
     * @param value the value value to set.
     * @return the DeletedVaultListResult object itself.
     */
    public DeletedVaultListResult withValue(List<DeletedVaultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of deleted vaults.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of deleted vaults.
     *
     * @param nextLink the nextLink value to set.
     * @return the DeletedVaultListResult object itself.
     */
    public DeletedVaultListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
