// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.MonitoringMetricConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of metric configurations. */
@Immutable
public final class MonitoringMetricConfigurationList {
    /*
     * The list of metric configurations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MonitoringMetricConfigurationInner> value;

    /*
     * Link to the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of MonitoringMetricConfigurationList class. */
    public MonitoringMetricConfigurationList() {
    }

    /**
     * Get the value property: The list of metric configurations.
     *
     * @return the value value.
     */
    public List<MonitoringMetricConfigurationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
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
