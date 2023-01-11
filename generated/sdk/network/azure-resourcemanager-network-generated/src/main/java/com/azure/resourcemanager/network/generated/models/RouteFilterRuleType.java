// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The rule type of the rule. */
public final class RouteFilterRuleType extends ExpandableStringEnum<RouteFilterRuleType> {
    /** Static value Community for RouteFilterRuleType. */
    public static final RouteFilterRuleType COMMUNITY = fromString("Community");

    /**
     * Creates a new instance of RouteFilterRuleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouteFilterRuleType() {
    }

    /**
     * Creates or finds a RouteFilterRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouteFilterRuleType.
     */
    @JsonCreator
    public static RouteFilterRuleType fromString(String name) {
        return fromString(name, RouteFilterRuleType.class);
    }

    /**
     * Gets known RouteFilterRuleType values.
     *
     * @return known RouteFilterRuleType values.
     */
    public static Collection<RouteFilterRuleType> values() {
        return values(RouteFilterRuleType.class);
    }
}
