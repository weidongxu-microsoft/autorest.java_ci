// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response from the List Storage Accounts operation.
 */
@Immutable
public final class StorageAccountListResult {
    /*
     * Gets the list of storage accounts and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageAccountInner> value;

    /*
     * Request URL that can be used to query next page of storage accounts. Returned when total number of requested
     * storage accounts exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StorageAccountListResult class.
     */
    public StorageAccountListResult() {
    }

    /**
     * Get the value property: Gets the list of storage accounts and their properties.
     * 
     * @return the value value.
     */
    public List<StorageAccountInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of storage accounts. Returned when
     * total number of requested storage accounts exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
