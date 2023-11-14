// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The capabilities and features enabled for the IoT hub.
 */
public final class Capabilities extends ExpandableStringEnum<Capabilities> {
    /**
     * Static value None for Capabilities.
     */
    public static final Capabilities NONE = fromString("None");

    /**
     * Static value DeviceManagement for Capabilities.
     */
    public static final Capabilities DEVICE_MANAGEMENT = fromString("DeviceManagement");

    /**
     * Creates a new instance of Capabilities value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Capabilities() {
    }

    /**
     * Creates or finds a Capabilities from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Capabilities.
     */
    @JsonCreator
    public static Capabilities fromString(String name) {
        return fromString(name, Capabilities.class);
    }

    /**
     * Gets known Capabilities values.
     * 
     * @return known Capabilities values.
     */
    public static Collection<Capabilities> values() {
        return values(Capabilities.class);
    }
}
