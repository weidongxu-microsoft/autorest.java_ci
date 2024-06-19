// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for SchemaCompatibility.
 */
public final class SchemaCompatibility extends ExpandableStringEnum<SchemaCompatibility> {
    /**
     * Static value None for SchemaCompatibility.
     */
    public static final SchemaCompatibility NONE = fromString("None");

    /**
     * Static value Backward for SchemaCompatibility.
     */
    public static final SchemaCompatibility BACKWARD = fromString("Backward");

    /**
     * Static value Forward for SchemaCompatibility.
     */
    public static final SchemaCompatibility FORWARD = fromString("Forward");

    /**
     * Creates a new instance of SchemaCompatibility value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SchemaCompatibility() {
    }

    /**
     * Creates or finds a SchemaCompatibility from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SchemaCompatibility.
     */
    public static SchemaCompatibility fromString(String name) {
        return fromString(name, SchemaCompatibility.class);
    }

    /**
     * Gets known SchemaCompatibility values.
     * 
     * @return known SchemaCompatibility values.
     */
    public static Collection<SchemaCompatibility> values() {
        return values(SchemaCompatibility.class);
    }
}
