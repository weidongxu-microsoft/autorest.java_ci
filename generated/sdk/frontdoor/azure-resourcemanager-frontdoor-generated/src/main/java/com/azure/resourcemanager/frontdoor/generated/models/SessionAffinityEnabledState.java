// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether to allow session affinity on this host. Valid options are 'Enabled' or 'Disabled'.
 */
public final class SessionAffinityEnabledState extends ExpandableStringEnum<SessionAffinityEnabledState> {
    /**
     * Static value Enabled for SessionAffinityEnabledState.
     */
    public static final SessionAffinityEnabledState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for SessionAffinityEnabledState.
     */
    public static final SessionAffinityEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SessionAffinityEnabledState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SessionAffinityEnabledState() {
    }

    /**
     * Creates or finds a SessionAffinityEnabledState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SessionAffinityEnabledState.
     */
    @JsonCreator
    public static SessionAffinityEnabledState fromString(String name) {
        return fromString(name, SessionAffinityEnabledState.class);
    }

    /**
     * Gets known SessionAffinityEnabledState values.
     * 
     * @return known SessionAffinityEnabledState values.
     */
    public static Collection<SessionAffinityEnabledState> values() {
        return values(SessionAffinityEnabledState.class);
    }
}
