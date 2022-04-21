// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DynamicCompressionEnabled. */
public final class DynamicCompressionEnabled extends ExpandableStringEnum<DynamicCompressionEnabled> {
    /** Static value Enabled for DynamicCompressionEnabled. */
    public static final DynamicCompressionEnabled ENABLED = fromString("Enabled");

    /** Static value Disabled for DynamicCompressionEnabled. */
    public static final DynamicCompressionEnabled DISABLED = fromString("Disabled");

    /**
     * Creates or finds a DynamicCompressionEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DynamicCompressionEnabled.
     */
    @JsonCreator
    public static DynamicCompressionEnabled fromString(String name) {
        return fromString(name, DynamicCompressionEnabled.class);
    }

    /**
     * Gets known DynamicCompressionEnabled values.
     *
     * @return known DynamicCompressionEnabled values.
     */
    public static Collection<DynamicCompressionEnabled> values() {
        return values(DynamicCompressionEnabled.class);
    }
}
