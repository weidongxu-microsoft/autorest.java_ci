// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storage.generated.fluent.models.ListQueueInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response schema. Contains list of queues returned. */
@Immutable
public final class ListQueueResource {
    /*
     * List of queues returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ListQueueInner> value;

    /*
     * Request URL that can be used to list next page of queues
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ListQueueResource class. */
    public ListQueueResource() {
    }

    /**
     * Get the value property: List of queues returned.
     *
     * @return the value value.
     */
    public List<ListQueueInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to list next page of queues.
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
