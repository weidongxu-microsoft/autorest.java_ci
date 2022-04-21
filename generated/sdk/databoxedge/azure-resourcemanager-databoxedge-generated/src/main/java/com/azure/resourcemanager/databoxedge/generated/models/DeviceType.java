// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeviceType. */
public final class DeviceType extends ExpandableStringEnum<DeviceType> {
    /** Static value DataBoxEdgeDevice for DeviceType. */
    public static final DeviceType DATA_BOX_EDGE_DEVICE = fromString("DataBoxEdgeDevice");

    /**
     * Creates or finds a DeviceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeviceType.
     */
    @JsonCreator
    public static DeviceType fromString(String name) {
        return fromString(name, DeviceType.class);
    }

    /**
     * Gets known DeviceType values.
     *
     * @return known DeviceType values.
     */
    public static Collection<DeviceType> values() {
        return values(DeviceType.class);
    }
}
