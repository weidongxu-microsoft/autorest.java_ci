// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for CrossSubscriptionRestoreState.
 */
public final class CrossSubscriptionRestoreState extends ExpandableStringEnum<CrossSubscriptionRestoreState> {
    /**
     * Static value Enabled for CrossSubscriptionRestoreState.
     */
    public static final CrossSubscriptionRestoreState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for CrossSubscriptionRestoreState.
     */
    public static final CrossSubscriptionRestoreState DISABLED = fromString("Disabled");

    /**
     * Static value PermanentlyDisabled for CrossSubscriptionRestoreState.
     */
    public static final CrossSubscriptionRestoreState PERMANENTLY_DISABLED = fromString("PermanentlyDisabled");

    /**
     * Creates a new instance of CrossSubscriptionRestoreState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CrossSubscriptionRestoreState() {
    }

    /**
     * Creates or finds a CrossSubscriptionRestoreState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CrossSubscriptionRestoreState.
     */
    public static CrossSubscriptionRestoreState fromString(String name) {
        return fromString(name, CrossSubscriptionRestoreState.class);
    }

    /**
     * Gets known CrossSubscriptionRestoreState values.
     * 
     * @return known CrossSubscriptionRestoreState values.
     */
    public static Collection<CrossSubscriptionRestoreState> values() {
        return values(CrossSubscriptionRestoreState.class);
    }
}
