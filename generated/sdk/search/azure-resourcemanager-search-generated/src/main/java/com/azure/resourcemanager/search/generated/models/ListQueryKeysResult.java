// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.search.generated.fluent.models.QueryKeyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response containing the query API keys for a given search service.
 */
@Immutable
public final class ListQueryKeysResult {
    /*
     * The query keys for the search service.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueryKeyInner> value;

    /*
     * Request URL that can be used to query next page of query keys. Returned when the total number of requested query
     * keys exceed maximum page size.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ListQueryKeysResult class.
     */
    public ListQueryKeysResult() {
    }

    /**
     * Get the value property: The query keys for the search service.
     * 
     * @return the value value.
     */
    public List<QueryKeyInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of query keys. Returned when the total
     * number of requested query keys exceed maximum page size.
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
