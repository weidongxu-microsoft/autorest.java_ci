// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AccessLevel.
 */
public final class AccessLevel extends ExpandableStringEnum<AccessLevel> {
    /**
     * Static value None for AccessLevel.
     */
    public static final AccessLevel NONE = fromString("None");

    /**
     * Static value Read for AccessLevel.
     */
    public static final AccessLevel READ = fromString("Read");

    /**
     * Static value Write for AccessLevel.
     */
    public static final AccessLevel WRITE = fromString("Write");

    /**
     * Creates a new instance of AccessLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AccessLevel() {
    }

    /**
     * Creates or finds a AccessLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AccessLevel.
     */
    public static AccessLevel fromString(String name) {
        return fromString(name, AccessLevel.class);
    }

    /**
     * Gets known AccessLevel values.
     * 
     * @return known AccessLevel values.
     */
    public static Collection<AccessLevel> values() {
        return values(AccessLevel.class);
    }
}
