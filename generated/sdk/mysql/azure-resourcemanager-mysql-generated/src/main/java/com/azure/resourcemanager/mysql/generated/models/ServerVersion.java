// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The version of a server.
 */
public final class ServerVersion extends ExpandableStringEnum<ServerVersion> {
    /**
     * Static value 5.7 for ServerVersion.
     */
    public static final ServerVersion FIVE_SEVEN = fromString("5.7");

    /**
     * Static value 8.0.21 for ServerVersion.
     */
    public static final ServerVersion EIGHT_ZERO_TWO_ONE = fromString("8.0.21");

    /**
     * Creates a new instance of ServerVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerVersion() {
    }

    /**
     * Creates or finds a ServerVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerVersion.
     */
    @JsonCreator
    public static ServerVersion fromString(String name) {
        return fromString(name, ServerVersion.class);
    }

    /**
     * Gets known ServerVersion values.
     * 
     * @return known ServerVersion values.
     */
    public static Collection<ServerVersion> values() {
        return values(ServerVersion.class);
    }
}
