// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
 */
public final class CustomRuleEnabledState extends ExpandableStringEnum<CustomRuleEnabledState> {
    /**
     * Static value Disabled for CustomRuleEnabledState.
     */
    public static final CustomRuleEnabledState DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for CustomRuleEnabledState.
     */
    public static final CustomRuleEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of CustomRuleEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomRuleEnabledState() {
    }

    /**
     * Creates or finds a CustomRuleEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CustomRuleEnabledState.
     */
    @JsonCreator
    public static CustomRuleEnabledState fromString(String name) {
        return fromString(name, CustomRuleEnabledState.class);
    }

    /**
     * Gets known CustomRuleEnabledState values.
     * 
     * @return known CustomRuleEnabledState values.
     */
    public static Collection<CustomRuleEnabledState> values() {
        return values(CustomRuleEnabledState.class);
    }
}
