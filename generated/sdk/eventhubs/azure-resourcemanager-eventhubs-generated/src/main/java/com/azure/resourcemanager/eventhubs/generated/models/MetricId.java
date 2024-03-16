// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Metric Id on which the throttle limit should be set, MetricId can be discovered by hovering over Metric in the Metrics section of Event Hub Namespace inside Azure Portal.
 */
public final class MetricId extends ExpandableStringEnum<MetricId> {
    /**
     * Static value IncomingBytes for MetricId.
     */
    public static final MetricId INCOMING_BYTES = fromString("IncomingBytes");

    /**
     * Static value OutgoingBytes for MetricId.
     */
    public static final MetricId OUTGOING_BYTES = fromString("OutgoingBytes");

    /**
     * Static value IncomingMessages for MetricId.
     */
    public static final MetricId INCOMING_MESSAGES = fromString("IncomingMessages");

    /**
     * Static value OutgoingMessages for MetricId.
     */
    public static final MetricId OUTGOING_MESSAGES = fromString("OutgoingMessages");

    /**
     * Creates a new instance of MetricId value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MetricId() {
    }

    /**
     * Creates or finds a MetricId from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MetricId.
     */
    @JsonCreator
    public static MetricId fromString(String name) {
        return fromString(name, MetricId.class);
    }

    /**
     * Gets known MetricId values.
     * 
     * @return known MetricId values.
     */
    public static Collection<MetricId> values() {
        return values(MetricId.class);
    }
}
