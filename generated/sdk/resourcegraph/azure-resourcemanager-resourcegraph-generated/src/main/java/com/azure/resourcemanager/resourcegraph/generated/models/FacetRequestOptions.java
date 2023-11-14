// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The options for facet evaluation.
 */
@Fluent
public final class FacetRequestOptions {
    /*
     * The column name or query expression to sort on. Defaults to count if not present.
     */
    @JsonProperty(value = "sortBy")
    private String sortBy;

    /*
     * The sorting order by the selected column (count by default).
     */
    @JsonProperty(value = "sortOrder")
    private FacetSortOrder sortOrder;

    /*
     * Specifies the filter condition for the 'where' clause which will be run on main query's result, just before the
     * actual faceting.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * The maximum number of facet rows that should be returned.
     */
    @JsonProperty(value = "$top")
    private Integer top;

    /**
     * Creates an instance of FacetRequestOptions class.
     */
    public FacetRequestOptions() {
    }

    /**
     * Get the sortBy property: The column name or query expression to sort on. Defaults to count if not present.
     * 
     * @return the sortBy value.
     */
    public String sortBy() {
        return this.sortBy;
    }

    /**
     * Set the sortBy property: The column name or query expression to sort on. Defaults to count if not present.
     * 
     * @param sortBy the sortBy value to set.
     * @return the FacetRequestOptions object itself.
     */
    public FacetRequestOptions withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Get the sortOrder property: The sorting order by the selected column (count by default).
     * 
     * @return the sortOrder value.
     */
    public FacetSortOrder sortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder property: The sorting order by the selected column (count by default).
     * 
     * @param sortOrder the sortOrder value to set.
     * @return the FacetRequestOptions object itself.
     */
    public FacetRequestOptions withSortOrder(FacetSortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Get the filter property: Specifies the filter condition for the 'where' clause which will be run on main query's
     * result, just before the actual faceting.
     * 
     * @return the filter value.
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Specifies the filter condition for the 'where' clause which will be run on main query's
     * result, just before the actual faceting.
     * 
     * @param filter the filter value to set.
     * @return the FacetRequestOptions object itself.
     */
    public FacetRequestOptions withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the top property: The maximum number of facet rows that should be returned.
     * 
     * @return the top value.
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set the top property: The maximum number of facet rows that should be returned.
     * 
     * @param top the top value to set.
     * @return the FacetRequestOptions object itself.
     */
    public FacetRequestOptions withTop(Integer top) {
        this.top = top;
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
