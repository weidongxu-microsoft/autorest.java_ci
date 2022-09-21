// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The aggregation expression to be used in the report. */
@Fluent
public final class ReportConfigAggregation {
    /*
     * The name of the column to aggregate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The name of the aggregation function to use.
     */
    @JsonProperty(value = "function", required = true)
    private FunctionType function;

    /** Creates an instance of ReportConfigAggregation class. */
    public ReportConfigAggregation() {
    }

    /**
     * Get the name property: The name of the column to aggregate.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to aggregate.
     *
     * @param name the name value to set.
     * @return the ReportConfigAggregation object itself.
     */
    public ReportConfigAggregation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the function property: The name of the aggregation function to use.
     *
     * @return the function value.
     */
    public FunctionType function() {
        return this.function;
    }

    /**
     * Set the function property: The name of the aggregation function to use.
     *
     * @param function the function value to set.
     * @return the ReportConfigAggregation object itself.
     */
    public ReportConfigAggregation withFunction(FunctionType function) {
        this.function = function;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ReportConfigAggregation"));
        }
        if (function() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property function in model ReportConfigAggregation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ReportConfigAggregation.class);
}
