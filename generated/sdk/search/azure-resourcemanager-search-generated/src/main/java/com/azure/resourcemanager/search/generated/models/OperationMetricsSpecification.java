// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifications of one type of metric for this operation.
 */
@Immutable
public final class OperationMetricsSpecification {
    /*
     * The name of the metric specification.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The display name of the metric specification.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The display description of the metric specification.
     */
    @JsonProperty(value = "displayDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String displayDescription;

    /*
     * The unit for the metric specification.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The type of aggregation for the metric specification.
     */
    @JsonProperty(value = "aggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String aggregationType;

    /*
     * Dimensions for the metric specification.
     */
    @JsonProperty(value = "dimensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationMetricDimension> dimensions;

    /*
     * Availabilities for the metric specification.
     */
    @JsonProperty(value = "availabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationAvailability> availabilities;

    /**
     * Creates an instance of OperationMetricsSpecification class.
     */
    public OperationMetricsSpecification() {
    }

    /**
     * Get the name property: The name of the metric specification.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the displayName property: The display name of the metric specification.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the displayDescription property: The display description of the metric specification.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Get the unit property: The unit for the metric specification.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the aggregationType property: The type of aggregation for the metric specification.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Get the dimensions property: Dimensions for the metric specification.
     * 
     * @return the dimensions value.
     */
    public List<OperationMetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Get the availabilities property: Availabilities for the metric specification.
     * 
     * @return the availabilities value.
     */
    public List<OperationAvailability> availabilities() {
        return this.availabilities;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
    }
}
