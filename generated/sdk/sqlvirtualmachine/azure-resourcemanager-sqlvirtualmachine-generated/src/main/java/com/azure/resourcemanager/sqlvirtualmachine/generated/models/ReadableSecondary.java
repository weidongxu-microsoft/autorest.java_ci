// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Replica readable secondary mode in availability group.
 */
public final class ReadableSecondary extends ExpandableStringEnum<ReadableSecondary> {
    /**
     * Static value No for ReadableSecondary.
     */
    public static final ReadableSecondary NO = fromString("No");

    /**
     * Static value All for ReadableSecondary.
     */
    public static final ReadableSecondary ALL = fromString("All");

    /**
     * Static value Read_Only for ReadableSecondary.
     */
    public static final ReadableSecondary READ_ONLY = fromString("Read_Only");

    /**
     * Creates a new instance of ReadableSecondary value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReadableSecondary() {
    }

    /**
     * Creates or finds a ReadableSecondary from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReadableSecondary.
     */
    public static ReadableSecondary fromString(String name) {
        return fromString(name, ReadableSecondary.class);
    }

    /**
     * Gets known ReadableSecondary values.
     * 
     * @return known ReadableSecondary values.
     */
    public static Collection<ReadableSecondary> values() {
        return values(ReadableSecondary.class);
    }
}
