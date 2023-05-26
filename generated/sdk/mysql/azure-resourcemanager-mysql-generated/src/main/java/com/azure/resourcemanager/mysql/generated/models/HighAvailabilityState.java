// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of server high availability. */
public final class HighAvailabilityState extends ExpandableStringEnum<HighAvailabilityState> {
    /** Static value NotEnabled for HighAvailabilityState. */
    public static final HighAvailabilityState NOT_ENABLED = fromString("NotEnabled");

    /** Static value CreatingStandby for HighAvailabilityState. */
    public static final HighAvailabilityState CREATING_STANDBY = fromString("CreatingStandby");

    /** Static value Healthy for HighAvailabilityState. */
    public static final HighAvailabilityState HEALTHY = fromString("Healthy");

    /** Static value FailingOver for HighAvailabilityState. */
    public static final HighAvailabilityState FAILING_OVER = fromString("FailingOver");

    /** Static value RemovingStandby for HighAvailabilityState. */
    public static final HighAvailabilityState REMOVING_STANDBY = fromString("RemovingStandby");

    /**
     * Creates a new instance of HighAvailabilityState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HighAvailabilityState() {
    }

    /**
     * Creates or finds a HighAvailabilityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HighAvailabilityState.
     */
    @JsonCreator
    public static HighAvailabilityState fromString(String name) {
        return fromString(name, HighAvailabilityState.class);
    }

    /**
     * Gets known HighAvailabilityState values.
     *
     * @return known HighAvailabilityState values.
     */
    public static Collection<HighAvailabilityState> values() {
        return values(HighAvailabilityState.class);
    }
}