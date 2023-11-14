// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * One property of operation, include log specifications.
 */
@Fluent
public final class ServiceSpecification {
    /*
     * Log specifications of operation.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /*
     * Metric specifications of operation.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Creates an instance of ServiceSpecification class.
     */
    public ServiceSpecification() {
    }

    /**
     * Get the logSpecifications property: Log specifications of operation.
     * 
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Log specifications of operation.
     * 
     * @param logSpecifications the logSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Get the metricSpecifications property: Metric specifications of operation.
     * 
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Metric specifications of operation.
     * 
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
