// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The connection state. */
public final class ConnectionState extends ExpandableStringEnum<ConnectionState> {
    /** Static value Reachable for ConnectionState. */
    public static final ConnectionState REACHABLE = fromString("Reachable");

    /** Static value Unreachable for ConnectionState. */
    public static final ConnectionState UNREACHABLE = fromString("Unreachable");

    /** Static value Unknown for ConnectionState. */
    public static final ConnectionState UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of ConnectionState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionState() {
    }

    /**
     * Creates or finds a ConnectionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionState.
     */
    @JsonCreator
    public static ConnectionState fromString(String name) {
        return fromString(name, ConnectionState.class);
    }

    /**
     * Gets known ConnectionState values.
     *
     * @return known ConnectionState values.
     */
    public static Collection<ConnectionState> values() {
        return values(ConnectionState.class);
    }
}
