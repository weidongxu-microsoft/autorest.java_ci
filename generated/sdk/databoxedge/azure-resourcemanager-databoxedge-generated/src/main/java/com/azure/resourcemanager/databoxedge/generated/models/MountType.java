// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MountType. */
public final class MountType extends ExpandableStringEnum<MountType> {
    /** Static value Volume for MountType. */
    public static final MountType VOLUME = fromString("Volume");

    /** Static value HostPath for MountType. */
    public static final MountType HOST_PATH = fromString("HostPath");

    /**
     * Creates or finds a MountType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MountType.
     */
    @JsonCreator
    public static MountType fromString(String name) {
        return fromString(name, MountType.class);
    }

    /**
     * Gets known MountType values.
     *
     * @return known MountType values.
     */
    public static Collection<MountType> values() {
        return values(MountType.class);
    }
}
