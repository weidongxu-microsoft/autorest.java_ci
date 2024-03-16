// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.Metric;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response to a metrics query.
 */
@Fluent
public final class ResponseInner {
    /*
     * The integer value representing the relative cost of the query.
     */
    @JsonProperty(value = "cost")
    private Integer cost;

    /*
     * The timespan for which the data was retrieved. Its value consists of two datetimes concatenated, separated by '/'.  This may be adjusted in the future and returned back from what was originally requested.
     */
    @JsonProperty(value = "timespan", required = true)
    private String timespan;

    /*
     * The interval (window size) for which the metric data was returned in ISO 8601 duration format with a special case for 'FULL' value that returns single datapoint for entire time span requested (*Examples: PT15M, PT1H, P1D, FULL*). 
     * This may be adjusted and different from what was originally requested if AutoAdjustTimegrain=true is specified. This is not present if a metadata request was made.
     */
    @JsonProperty(value = "interval")
    private String interval;

    /*
     * The namespace of the metrics being queried
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The region of the resource being queried for metrics.
     */
    @JsonProperty(value = "resourceregion")
    private String resourceRegion;

    /*
     * the value of the collection.
     */
    @JsonProperty(value = "value", required = true)
    private List<Metric> value;

    /**
     * Creates an instance of ResponseInner class.
     */
    public ResponseInner() {
    }

    /**
     * Get the cost property: The integer value representing the relative cost of the query.
     * 
     * @return the cost value.
     */
    public Integer cost() {
        return this.cost;
    }

    /**
     * Set the cost property: The integer value representing the relative cost of the query.
     * 
     * @param cost the cost value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes concatenated, separated by '/'.  This may be adjusted in the future and returned back from what was originally requested.
     * 
     * @return the timespan value.
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes concatenated, separated by '/'.  This may be adjusted in the future and returned back from what was originally requested.
     * 
     * @param timespan the timespan value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (window size) for which the metric data was returned in ISO 8601 duration format with a special case for 'FULL' value that returns single datapoint for entire time span requested (*Examples: PT15M, PT1H, P1D, FULL*). 
     * This may be adjusted and different from what was originally requested if AutoAdjustTimegrain=true is specified. This is not present if a metadata request was made.
     * 
     * @return the interval value.
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (window size) for which the metric data was returned in ISO 8601 duration format with a special case for 'FULL' value that returns single datapoint for entire time span requested (*Examples: PT15M, PT1H, P1D, FULL*). 
     * This may be adjusted and different from what was originally requested if AutoAdjustTimegrain=true is specified. This is not present if a metadata request was made.
     * 
     * @param interval the interval value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the namespace property: The namespace of the metrics being queried.
     * 
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the metrics being queried.
     * 
     * @param namespace the namespace value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the resourceRegion property: The region of the resource being queried for metrics.
     * 
     * @return the resourceRegion value.
     */
    public String resourceRegion() {
        return this.resourceRegion;
    }

    /**
     * Set the resourceRegion property: The region of the resource being queried for metrics.
     * 
     * @param resourceRegion the resourceRegion value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * Get the value property: the value of the collection.
     * 
     * @return the value value.
     */
    public List<Metric> value() {
        return this.value;
    }

    /**
     * Set the value property: the value of the collection.
     * 
     * @param value the value value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withValue(List<Metric> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timespan() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property timespan in model ResponseInner"));
        }
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model ResponseInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResponseInner.class);
}
