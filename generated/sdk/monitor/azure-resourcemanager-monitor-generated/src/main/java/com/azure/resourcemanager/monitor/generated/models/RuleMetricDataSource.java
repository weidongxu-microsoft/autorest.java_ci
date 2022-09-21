// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule metric data source. The discriminator value is always RuleMetricDataSource in this case. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource")
@Fluent
public final class RuleMetricDataSource extends RuleDataSource {
    /*
     * the name of the metric that defines what the rule monitors.
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /** Creates an instance of RuleMetricDataSource class. */
    public RuleMetricDataSource() {
    }

    /**
     * Get the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @param metricName the metricName value to set.
     * @return the RuleMetricDataSource object itself.
     */
    public RuleMetricDataSource withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleMetricDataSource withResourceUri(String resourceUri) {
        super.withResourceUri(resourceUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleMetricDataSource withLegacyResourceId(String legacyResourceId) {
        super.withLegacyResourceId(legacyResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleMetricDataSource withResourceLocation(String resourceLocation) {
        super.withResourceLocation(resourceLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleMetricDataSource withMetricNamespace(String metricNamespace) {
        super.withMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
