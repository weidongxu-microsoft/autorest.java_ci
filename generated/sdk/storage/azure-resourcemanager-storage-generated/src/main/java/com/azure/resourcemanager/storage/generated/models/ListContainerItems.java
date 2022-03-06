// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.generated.fluent.models.ListContainerItemInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response schema. Contains list of blobs returned, and if paging is requested or required, a URL to next page of
 * containers.
 */
@Immutable
public final class ListContainerItems {
    /*
     * List of blobs containers returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ListContainerItemInner> value;

    /*
     * Request URL that can be used to query next page of containers. Returned
     * when total number of requested containers exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of blobs containers returned.
     *
     * @return the value value.
     */
    public List<ListContainerItemInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of containers. Returned when total
     * number of requested containers exceed maximum page size.
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
