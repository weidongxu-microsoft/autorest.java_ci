// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the action type.
 */
public final class ActionType extends ExpandableStringEnum<ActionType> {
    /**
     * Static value Internal for ActionType.
     */
    public static final ActionType INTERNAL = fromString("Internal");

    /**
     * Creates a new instance of ActionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActionType() {
    }

    /**
     * Creates or finds a ActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ActionType.
     */
    public static ActionType fromString(String name) {
        return fromString(name, ActionType.class);
    }

    /**
     * Gets known ActionType values.
     * 
     * @return known ActionType values.
     */
    public static Collection<ActionType> values() {
        return values(ActionType.class);
    }
}
