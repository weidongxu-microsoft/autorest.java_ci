// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metric dimension.
 */
@Fluent
public final class MetricDimension {
    /*
     * The dimension type.
     */
    @JsonProperty(value = "sourceType", required = true)
    private String sourceType;

    /*
     * The dimension value.
     */
    @JsonProperty(value = "sourceName", required = true)
    private String sourceName;

    /**
     * Creates an instance of MetricDimension class.
     */
    public MetricDimension() {
    }

    /**
     * Get the sourceType property: The dimension type.
     * 
     * @return the sourceType value.
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The dimension type.
     * 
     * @param sourceType the sourceType value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the sourceName property: The dimension value.
     * 
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: The dimension value.
     * 
     * @param sourceName the sourceName value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sourceType in model MetricDimension"));
        }
        if (sourceName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sourceName in model MetricDimension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricDimension.class);
}
