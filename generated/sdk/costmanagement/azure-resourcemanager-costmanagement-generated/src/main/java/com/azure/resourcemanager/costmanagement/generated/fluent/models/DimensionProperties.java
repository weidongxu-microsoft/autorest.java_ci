// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DimensionProperties model. */
@Fluent
public final class DimensionProperties {
    /*
     * Dimension description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Filter enabled.
     */
    @JsonProperty(value = "filterEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean filterEnabled;

    /*
     * Grouping enabled.
     */
    @JsonProperty(value = "groupingEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean groupingEnabled;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<String> data;

    /*
     * Total number of data for the dimension.
     */
    @JsonProperty(value = "total", access = JsonProperty.Access.WRITE_ONLY)
    private Integer total;

    /*
     * Dimension category.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * Usage start.
     */
    @JsonProperty(value = "usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageStart;

    /*
     * Usage end.
     */
    @JsonProperty(value = "usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageEnd;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of DimensionProperties class. */
    public DimensionProperties() {
    }

    /**
     * Get the description property: Dimension description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the filterEnabled property: Filter enabled.
     *
     * @return the filterEnabled value.
     */
    public Boolean filterEnabled() {
        return this.filterEnabled;
    }

    /**
     * Get the groupingEnabled property: Grouping enabled.
     *
     * @return the groupingEnabled value.
     */
    public Boolean groupingEnabled() {
        return this.groupingEnabled;
    }

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public List<String> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withData(List<String> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the total property: Total number of data for the dimension.
     *
     * @return the total value.
     */
    public Integer total() {
        return this.total;
    }

    /**
     * Get the category property: Dimension category.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the usageStart property: Usage start.
     *
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd property: Usage end.
     *
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
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
    }
}
