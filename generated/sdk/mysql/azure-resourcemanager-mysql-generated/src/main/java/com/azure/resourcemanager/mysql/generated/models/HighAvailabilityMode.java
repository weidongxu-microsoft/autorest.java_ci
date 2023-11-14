// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * High availability mode for a server.
 */
public final class HighAvailabilityMode extends ExpandableStringEnum<HighAvailabilityMode> {
    /**
     * Static value Disabled for HighAvailabilityMode.
     */
    public static final HighAvailabilityMode DISABLED = fromString("Disabled");

    /**
     * Static value ZoneRedundant for HighAvailabilityMode.
     */
    public static final HighAvailabilityMode ZONE_REDUNDANT = fromString("ZoneRedundant");

    /**
     * Static value SameZone for HighAvailabilityMode.
     */
    public static final HighAvailabilityMode SAME_ZONE = fromString("SameZone");

    /**
     * Creates a new instance of HighAvailabilityMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HighAvailabilityMode() {
    }

    /**
     * Creates or finds a HighAvailabilityMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HighAvailabilityMode.
     */
    @JsonCreator
    public static HighAvailabilityMode fromString(String name) {
        return fromString(name, HighAvailabilityMode.class);
    }

    /**
     * Gets known HighAvailabilityMode values.
     * 
     * @return known HighAvailabilityMode values.
     */
    public static Collection<HighAvailabilityMode> values() {
        return values(HighAvailabilityMode.class);
    }
}
