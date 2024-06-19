// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Source of alert.
 */
public final class AlertSource extends ExpandableStringEnum<AlertSource> {
    /**
     * Static value Preset for AlertSource.
     */
    public static final AlertSource PRESET = fromString("Preset");

    /**
     * Static value User for AlertSource.
     */
    public static final AlertSource USER = fromString("User");

    /**
     * Creates a new instance of AlertSource value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlertSource() {
    }

    /**
     * Creates or finds a AlertSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlertSource.
     */
    public static AlertSource fromString(String name) {
        return fromString(name, AlertSource.class);
    }

    /**
     * Gets known AlertSource values.
     * 
     * @return known AlertSource values.
     */
    public static Collection<AlertSource> values() {
        return values(AlertSource.class);
    }
}
