// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The aggregation interval of the Timeseries.
 */
public final class AggregationInterval extends ExpandableStringEnum<AggregationInterval> {
    /**
     * Static value Hourly for AggregationInterval.
     */
    public static final AggregationInterval HOURLY = fromString("Hourly");

    /**
     * Static value Daily for AggregationInterval.
     */
    public static final AggregationInterval DAILY = fromString("Daily");

    /**
     * Creates a new instance of AggregationInterval value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AggregationInterval() {
    }

    /**
     * Creates or finds a AggregationInterval from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AggregationInterval.
     */
    @JsonCreator
    public static AggregationInterval fromString(String name) {
        return fromString(name, AggregationInterval.class);
    }

    /**
     * Gets known AggregationInterval values.
     * 
     * @return known AggregationInterval values.
     */
    public static Collection<AggregationInterval> values() {
        return values(AggregationInterval.class);
    }
}
