// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The operation mode for automatically learning private ranges to not be SNAT.
 */
public final class AutoLearnPrivateRangesMode extends ExpandableStringEnum<AutoLearnPrivateRangesMode> {
    /**
     * Static value Enabled for AutoLearnPrivateRangesMode.
     */
    public static final AutoLearnPrivateRangesMode ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for AutoLearnPrivateRangesMode.
     */
    public static final AutoLearnPrivateRangesMode DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of AutoLearnPrivateRangesMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoLearnPrivateRangesMode() {
    }

    /**
     * Creates or finds a AutoLearnPrivateRangesMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutoLearnPrivateRangesMode.
     */
    public static AutoLearnPrivateRangesMode fromString(String name) {
        return fromString(name, AutoLearnPrivateRangesMode.class);
    }

    /**
     * Gets known AutoLearnPrivateRangesMode values.
     * 
     * @return known AutoLearnPrivateRangesMode values.
     */
    public static Collection<AutoLearnPrivateRangesMode> values() {
        return values(AutoLearnPrivateRangesMode.class);
    }
}
