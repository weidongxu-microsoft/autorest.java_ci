// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the properties of a latency metric used in the latency scorecard. */
@Immutable
public final class LatencyMetric {
    /*
     * The name of the Latency Metric
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The end time of the Latency Scorecard in UTC
     */
    @JsonProperty(value = "endDateTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private String endDateTimeUtc;

    /*
     * The metric value of the A endpoint
     */
    @JsonProperty(value = "aValue", access = JsonProperty.Access.WRITE_ONLY)
    private Float aValue;

    /*
     * The metric value of the B endpoint
     */
    @JsonProperty(value = "bValue", access = JsonProperty.Access.WRITE_ONLY)
    private Float bValue;

    /*
     * The difference in value between endpoint A and B
     */
    @JsonProperty(value = "delta", access = JsonProperty.Access.WRITE_ONLY)
    private Float delta;

    /*
     * The percent difference between endpoint A and B
     */
    @JsonProperty(value = "deltaPercent", access = JsonProperty.Access.WRITE_ONLY)
    private Float deltaPercent;

    /*
     * The lower end of the 95% confidence interval for endpoint A
     */
    @JsonProperty(value = "aCLower95CI", access = JsonProperty.Access.WRITE_ONLY)
    private Float aCLower95CI;

    /*
     * The upper end of the 95% confidence interval for endpoint A
     */
    @JsonProperty(value = "aHUpper95CI", access = JsonProperty.Access.WRITE_ONLY)
    private Float aHUpper95CI;

    /*
     * The lower end of the 95% confidence interval for endpoint B
     */
    @JsonProperty(value = "bCLower95CI", access = JsonProperty.Access.WRITE_ONLY)
    private Float bCLower95CI;

    /*
     * The upper end of the 95% confidence interval for endpoint B
     */
    @JsonProperty(value = "bUpper95CI", access = JsonProperty.Access.WRITE_ONLY)
    private Float bUpper95CI;

    /** Creates an instance of LatencyMetric class. */
    public LatencyMetric() {
    }

    /**
     * Get the name property: The name of the Latency Metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the endDateTimeUtc property: The end time of the Latency Scorecard in UTC.
     *
     * @return the endDateTimeUtc value.
     */
    public String endDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    /**
     * Get the aValue property: The metric value of the A endpoint.
     *
     * @return the aValue value.
     */
    public Float aValue() {
        return this.aValue;
    }

    /**
     * Get the bValue property: The metric value of the B endpoint.
     *
     * @return the bValue value.
     */
    public Float bValue() {
        return this.bValue;
    }

    /**
     * Get the delta property: The difference in value between endpoint A and B.
     *
     * @return the delta value.
     */
    public Float delta() {
        return this.delta;
    }

    /**
     * Get the deltaPercent property: The percent difference between endpoint A and B.
     *
     * @return the deltaPercent value.
     */
    public Float deltaPercent() {
        return this.deltaPercent;
    }

    /**
     * Get the aCLower95CI property: The lower end of the 95% confidence interval for endpoint A.
     *
     * @return the aCLower95CI value.
     */
    public Float aCLower95CI() {
        return this.aCLower95CI;
    }

    /**
     * Get the aHUpper95CI property: The upper end of the 95% confidence interval for endpoint A.
     *
     * @return the aHUpper95CI value.
     */
    public Float aHUpper95CI() {
        return this.aHUpper95CI;
    }

    /**
     * Get the bCLower95CI property: The lower end of the 95% confidence interval for endpoint B.
     *
     * @return the bCLower95CI value.
     */
    public Float bCLower95CI() {
        return this.bCLower95CI;
    }

    /**
     * Get the bUpper95CI property: The upper end of the 95% confidence interval for endpoint B.
     *
     * @return the bUpper95CI value.
     */
    public Float bUpper95CI() {
        return this.bUpper95CI;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
