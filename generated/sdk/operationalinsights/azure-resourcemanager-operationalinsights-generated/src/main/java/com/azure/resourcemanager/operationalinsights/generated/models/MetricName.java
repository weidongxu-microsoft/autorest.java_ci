// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name of a metric. */
@Fluent
public final class MetricName {
    /*
     * The system name of the metric.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The localized name of the metric.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: The system name of the metric.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The system name of the metric.
     *
     * @param value the value value to set.
     * @return the MetricName object itself.
     */
    public MetricName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: The localized name of the metric.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The localized name of the metric.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the MetricName object itself.
     */
    public MetricName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
