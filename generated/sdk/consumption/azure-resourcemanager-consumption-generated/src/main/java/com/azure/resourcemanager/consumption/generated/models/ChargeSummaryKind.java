// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the kind of charge summary.
 */
public final class ChargeSummaryKind extends ExpandableStringEnum<ChargeSummaryKind> {
    /**
     * Static value legacy for ChargeSummaryKind.
     */
    public static final ChargeSummaryKind LEGACY = fromString("legacy");

    /**
     * Static value modern for ChargeSummaryKind.
     */
    public static final ChargeSummaryKind MODERN = fromString("modern");

    /**
     * Creates a new instance of ChargeSummaryKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ChargeSummaryKind() {
    }

    /**
     * Creates or finds a ChargeSummaryKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ChargeSummaryKind.
     */
    public static ChargeSummaryKind fromString(String name) {
        return fromString(name, ChargeSummaryKind.class);
    }

    /**
     * Gets known ChargeSummaryKind values.
     * 
     * @return known ChargeSummaryKind values.
     */
    public static Collection<ChargeSummaryKind> values() {
        return values(ChargeSummaryKind.class);
    }
}
