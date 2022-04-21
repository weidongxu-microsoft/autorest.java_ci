// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OSType. */
public final class OSType extends ExpandableStringEnum<OSType> {
    /** Static value Windows for OSType. */
    public static final OSType WINDOWS = fromString("Windows");

    /** Static value Linux for OSType. */
    public static final OSType LINUX = fromString("Linux");

    /**
     * Creates or finds a OSType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OSType.
     */
    @JsonCreator
    public static OSType fromString(String name) {
        return fromString(name, OSType.class);
    }

    /**
     * Gets known OSType values.
     *
     * @return known OSType values.
     */
    public static Collection<OSType> values() {
        return values(OSType.class);
    }
}
