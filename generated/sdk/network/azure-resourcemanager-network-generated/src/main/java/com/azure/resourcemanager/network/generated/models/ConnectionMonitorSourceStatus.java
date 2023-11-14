// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Status of connection monitor source.
 */
public final class ConnectionMonitorSourceStatus extends ExpandableStringEnum<ConnectionMonitorSourceStatus> {
    /**
     * Static value Unknown for ConnectionMonitorSourceStatus.
     */
    public static final ConnectionMonitorSourceStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value Active for ConnectionMonitorSourceStatus.
     */
    public static final ConnectionMonitorSourceStatus ACTIVE = fromString("Active");

    /**
     * Static value Inactive for ConnectionMonitorSourceStatus.
     */
    public static final ConnectionMonitorSourceStatus INACTIVE = fromString("Inactive");

    /**
     * Creates a new instance of ConnectionMonitorSourceStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionMonitorSourceStatus() {
    }

    /**
     * Creates or finds a ConnectionMonitorSourceStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConnectionMonitorSourceStatus.
     */
    @JsonCreator
    public static ConnectionMonitorSourceStatus fromString(String name) {
        return fromString(name, ConnectionMonitorSourceStatus.class);
    }

    /**
     * Gets known ConnectionMonitorSourceStatus values.
     * 
     * @return known ConnectionMonitorSourceStatus values.
     */
    public static Collection<ConnectionMonitorSourceStatus> values() {
        return values(ConnectionMonitorSourceStatus.class);
    }
}
