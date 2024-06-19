// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
 */
public final class RoutingRuleEnabledState extends ExpandableStringEnum<RoutingRuleEnabledState> {
    /**
     * Static value Enabled for RoutingRuleEnabledState.
     */
    public static final RoutingRuleEnabledState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for RoutingRuleEnabledState.
     */
    public static final RoutingRuleEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of RoutingRuleEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoutingRuleEnabledState() {
    }

    /**
     * Creates or finds a RoutingRuleEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RoutingRuleEnabledState.
     */
    public static RoutingRuleEnabledState fromString(String name) {
        return fromString(name, RoutingRuleEnabledState.class);
    }

    /**
     * Gets known RoutingRuleEnabledState values.
     * 
     * @return known RoutingRuleEnabledState values.
     */
    public static Collection<RoutingRuleEnabledState> values() {
        return values(RoutingRuleEnabledState.class);
    }
}
