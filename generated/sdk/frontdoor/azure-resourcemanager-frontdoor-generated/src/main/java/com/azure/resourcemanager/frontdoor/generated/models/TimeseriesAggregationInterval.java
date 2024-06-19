// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for TimeseriesAggregationInterval.
 */
public final class TimeseriesAggregationInterval extends ExpandableStringEnum<TimeseriesAggregationInterval> {
    /**
     * Static value Hourly for TimeseriesAggregationInterval.
     */
    public static final TimeseriesAggregationInterval HOURLY = fromString("Hourly");

    /**
     * Static value Daily for TimeseriesAggregationInterval.
     */
    public static final TimeseriesAggregationInterval DAILY = fromString("Daily");

    /**
     * Creates a new instance of TimeseriesAggregationInterval value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TimeseriesAggregationInterval() {
    }

    /**
     * Creates or finds a TimeseriesAggregationInterval from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TimeseriesAggregationInterval.
     */
    public static TimeseriesAggregationInterval fromString(String name) {
        return fromString(name, TimeseriesAggregationInterval.class);
    }

    /**
     * Gets known TimeseriesAggregationInterval values.
     * 
     * @return known TimeseriesAggregationInterval values.
     */
    public static Collection<TimeseriesAggregationInterval> values() {
        return values(TimeseriesAggregationInterval.class);
    }
}
