// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties of the throttling policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ThrottlingPolicy")
@Fluent
public final class ThrottlingPolicy extends ApplicationGroupPolicy {
    /*
     * The Threshold limit above which the application group will be throttled.Rate limit is always per second.
     */
    @JsonProperty(value = "rateLimitThreshold", required = true)
    private long rateLimitThreshold;

    /*
     * Metric Id on which the throttle limit should be set, MetricId can be discovered by hovering over Metric in the
     * Metrics section of Event Hub Namespace inside Azure Portal
     */
    @JsonProperty(value = "metricId", required = true)
    private MetricId metricId;

    /**
     * Creates an instance of ThrottlingPolicy class.
     */
    public ThrottlingPolicy() {
    }

    /**
     * Get the rateLimitThreshold property: The Threshold limit above which the application group will be
     * throttled.Rate limit is always per second.
     * 
     * @return the rateLimitThreshold value.
     */
    public long rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    /**
     * Set the rateLimitThreshold property: The Threshold limit above which the application group will be
     * throttled.Rate limit is always per second.
     * 
     * @param rateLimitThreshold the rateLimitThreshold value to set.
     * @return the ThrottlingPolicy object itself.
     */
    public ThrottlingPolicy withRateLimitThreshold(long rateLimitThreshold) {
        this.rateLimitThreshold = rateLimitThreshold;
        return this;
    }

    /**
     * Get the metricId property: Metric Id on which the throttle limit should be set, MetricId can be discovered by
     * hovering over Metric in the Metrics section of Event Hub Namespace inside Azure Portal.
     * 
     * @return the metricId value.
     */
    public MetricId metricId() {
        return this.metricId;
    }

    /**
     * Set the metricId property: Metric Id on which the throttle limit should be set, MetricId can be discovered by
     * hovering over Metric in the Metrics section of Event Hub Namespace inside Azure Portal.
     * 
     * @param metricId the metricId value to set.
     * @return the ThrottlingPolicy object itself.
     */
    public ThrottlingPolicy withMetricId(MetricId metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottlingPolicy withName(String name) {
        super.withName(name);
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
        if (metricId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property metricId in model ThrottlingPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ThrottlingPolicy.class);
}
