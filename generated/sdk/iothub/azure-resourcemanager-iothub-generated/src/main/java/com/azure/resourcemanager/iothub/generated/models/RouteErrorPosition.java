// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Position where the route error happened. */
@Fluent
public final class RouteErrorPosition {
    /*
     * Line where the route error happened
     */
    @JsonProperty(value = "line")
    private Integer line;

    /*
     * Column where the route error happened
     */
    @JsonProperty(value = "column")
    private Integer column;

    /**
     * Get the line property: Line where the route error happened.
     *
     * @return the line value.
     */
    public Integer line() {
        return this.line;
    }

    /**
     * Set the line property: Line where the route error happened.
     *
     * @param line the line value to set.
     * @return the RouteErrorPosition object itself.
     */
    public RouteErrorPosition withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * Get the column property: Column where the route error happened.
     *
     * @return the column value.
     */
    public Integer column() {
        return this.column;
    }

    /**
     * Set the column property: Column where the route error happened.
     *
     * @param column the column value to set.
     * @return the RouteErrorPosition object itself.
     */
    public RouteErrorPosition withColumn(Integer column) {
        this.column = column;
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
