// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the state of log scrubbing rule. Default value is Enabled.
 */
public final class ScrubbingRuleEntryState extends ExpandableStringEnum<ScrubbingRuleEntryState> {
    /**
     * Static value Enabled for ScrubbingRuleEntryState.
     */
    public static final ScrubbingRuleEntryState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ScrubbingRuleEntryState.
     */
    public static final ScrubbingRuleEntryState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ScrubbingRuleEntryState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScrubbingRuleEntryState() {
    }

    /**
     * Creates or finds a ScrubbingRuleEntryState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScrubbingRuleEntryState.
     */
    public static ScrubbingRuleEntryState fromString(String name) {
        return fromString(name, ScrubbingRuleEntryState.class);
    }

    /**
     * Gets known ScrubbingRuleEntryState values.
     * 
     * @return known ScrubbingRuleEntryState values.
     */
    public static Collection<ScrubbingRuleEntryState> values() {
        return values(ScrubbingRuleEntryState.class);
    }
}
