// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the action to take when a managed rule set score threshold is met. */
public final class ManagedRuleSetActionType extends ExpandableStringEnum<ManagedRuleSetActionType> {
    /** Static value Block for ManagedRuleSetActionType. */
    public static final ManagedRuleSetActionType BLOCK = fromString("Block");

    /** Static value Log for ManagedRuleSetActionType. */
    public static final ManagedRuleSetActionType LOG = fromString("Log");

    /** Static value Redirect for ManagedRuleSetActionType. */
    public static final ManagedRuleSetActionType REDIRECT = fromString("Redirect");

    /**
     * Creates a new instance of ManagedRuleSetActionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedRuleSetActionType() {
    }

    /**
     * Creates or finds a ManagedRuleSetActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedRuleSetActionType.
     */
    @JsonCreator
    public static ManagedRuleSetActionType fromString(String name) {
        return fromString(name, ManagedRuleSetActionType.class);
    }

    /**
     * Gets known ManagedRuleSetActionType values.
     *
     * @return known ManagedRuleSetActionType values.
     */
    public static Collection<ManagedRuleSetActionType> values() {
        return values(ManagedRuleSetActionType.class);
    }
}
