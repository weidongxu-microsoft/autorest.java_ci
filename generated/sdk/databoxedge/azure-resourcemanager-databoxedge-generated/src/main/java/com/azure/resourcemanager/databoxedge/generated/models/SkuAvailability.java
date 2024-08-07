// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Links to the next set of results.
 */
public final class SkuAvailability extends ExpandableStringEnum<SkuAvailability> {
    /**
     * Static value Available for SkuAvailability.
     */
    public static final SkuAvailability AVAILABLE = fromString("Available");

    /**
     * Static value Unavailable for SkuAvailability.
     */
    public static final SkuAvailability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates a new instance of SkuAvailability value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuAvailability() {
    }

    /**
     * Creates or finds a SkuAvailability from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuAvailability.
     */
    public static SkuAvailability fromString(String name) {
        return fromString(name, SkuAvailability.class);
    }

    /**
     * Gets known SkuAvailability values.
     * 
     * @return known SkuAvailability values.
     */
    public static Collection<SkuAvailability> values() {
        return values(SkuAvailability.class);
    }
}
