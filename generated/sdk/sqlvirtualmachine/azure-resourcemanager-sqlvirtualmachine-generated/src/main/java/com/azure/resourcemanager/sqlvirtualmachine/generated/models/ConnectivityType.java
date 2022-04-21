// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectivityType. */
public final class ConnectivityType extends ExpandableStringEnum<ConnectivityType> {
    /** Static value LOCAL for ConnectivityType. */
    public static final ConnectivityType LOCAL = fromString("LOCAL");

    /** Static value PRIVATE for ConnectivityType. */
    public static final ConnectivityType PRIVATE = fromString("PRIVATE");

    /** Static value PUBLIC for ConnectivityType. */
    public static final ConnectivityType PUBLIC = fromString("PUBLIC");

    /**
     * Creates or finds a ConnectivityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectivityType.
     */
    @JsonCreator
    public static ConnectivityType fromString(String name) {
        return fromString(name, ConnectivityType.class);
    }

    /**
     * Gets known ConnectivityType values.
     *
     * @return known ConnectivityType values.
     */
    public static Collection<ConnectivityType> values() {
        return values(ConnectivityType.class);
    }
}
