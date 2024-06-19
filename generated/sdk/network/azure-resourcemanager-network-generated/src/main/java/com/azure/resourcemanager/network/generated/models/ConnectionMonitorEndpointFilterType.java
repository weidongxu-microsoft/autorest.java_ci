// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The behavior of the endpoint filter. Currently only 'Include' is supported.
 */
public final class ConnectionMonitorEndpointFilterType
    extends ExpandableStringEnum<ConnectionMonitorEndpointFilterType> {
    /**
     * Static value Include for ConnectionMonitorEndpointFilterType.
     */
    public static final ConnectionMonitorEndpointFilterType INCLUDE = fromString("Include");

    /**
     * Creates a new instance of ConnectionMonitorEndpointFilterType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionMonitorEndpointFilterType() {
    }

    /**
     * Creates or finds a ConnectionMonitorEndpointFilterType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConnectionMonitorEndpointFilterType.
     */
    public static ConnectionMonitorEndpointFilterType fromString(String name) {
        return fromString(name, ConnectionMonitorEndpointFilterType.class);
    }

    /**
     * Gets known ConnectionMonitorEndpointFilterType values.
     * 
     * @return known ConnectionMonitorEndpointFilterType values.
     */
    public static Collection<ConnectionMonitorEndpointFilterType> values() {
        return values(ConnectionMonitorEndpointFilterType.class);
    }
}
