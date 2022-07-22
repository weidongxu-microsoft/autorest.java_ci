// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EffectiveAdminRuleKind. */
public final class EffectiveAdminRuleKind extends ExpandableStringEnum<EffectiveAdminRuleKind> {
    /** Static value Custom for EffectiveAdminRuleKind. */
    public static final EffectiveAdminRuleKind CUSTOM = fromString("Custom");

    /** Static value Default for EffectiveAdminRuleKind. */
    public static final EffectiveAdminRuleKind DEFAULT = fromString("Default");

    /**
     * Creates or finds a EffectiveAdminRuleKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EffectiveAdminRuleKind.
     */
    @JsonCreator
    public static EffectiveAdminRuleKind fromString(String name) {
        return fromString(name, EffectiveAdminRuleKind.class);
    }

    /**
     * Gets known EffectiveAdminRuleKind values.
     *
     * @return known EffectiveAdminRuleKind values.
     */
    public static Collection<EffectiveAdminRuleKind> values() {
        return values(EffectiveAdminRuleKind.class);
    }
}