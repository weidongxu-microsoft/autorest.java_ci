// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The group by expression to be used in the query. */
@Fluent
public final class QueryGrouping {
    /*
     * Has type of the column to group.
     */
    @JsonProperty(value = "type", required = true)
    private QueryColumnType type;

    /*
     * The name of the column to group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of QueryGrouping class. */
    public QueryGrouping() {
    }

    /**
     * Get the type property: Has type of the column to group.
     *
     * @return the type value.
     */
    public QueryColumnType type() {
        return this.type;
    }

    /**
     * Set the type property: Has type of the column to group.
     *
     * @param type the type value to set.
     * @return the QueryGrouping object itself.
     */
    public QueryGrouping withType(QueryColumnType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the column to group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to group.
     *
     * @param name the name value to set.
     * @return the QueryGrouping object itself.
     */
    public QueryGrouping withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model QueryGrouping"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model QueryGrouping"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryGrouping.class);
}
