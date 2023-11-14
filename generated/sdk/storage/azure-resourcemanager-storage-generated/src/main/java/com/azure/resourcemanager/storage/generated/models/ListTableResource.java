// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.generated.fluent.models.TableInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response schema. Contains list of tables returned.
 */
@Immutable
public final class ListTableResource {
    /*
     * List of tables returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<TableInner> value;

    /*
     * Request URL that can be used to query next page of tables
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ListTableResource class.
     */
    public ListTableResource() {
    }

    /**
     * Get the value property: List of tables returned.
     * 
     * @return the value value.
     */
    public List<TableInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of tables.
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
