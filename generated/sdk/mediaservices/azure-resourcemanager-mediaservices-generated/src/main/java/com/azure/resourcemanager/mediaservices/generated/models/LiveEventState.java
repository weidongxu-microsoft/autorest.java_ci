// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current state of the live event. See https://go.microsoft.com/fwlink/?linkid=2139012 for more information. */
public final class LiveEventState extends ExpandableStringEnum<LiveEventState> {
    /** Static value Stopped for LiveEventState. */
    public static final LiveEventState STOPPED = fromString("Stopped");

    /** Static value Running for LiveEventState. */
    public static final LiveEventState RUNNING = fromString("Running");

    /**
     * Creates a new instance of LiveEventState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LiveEventState() {
    }

    /**
     * Creates or finds a LiveEventState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LiveEventState.
     */
    @JsonCreator
    public static LiveEventState fromString(String name) {
        return fromString(name, LiveEventState.class);
    }

    /**
     * Gets known LiveEventState values.
     *
     * @return known LiveEventState values.
     */
    public static Collection<LiveEventState> values() {
        return values(LiveEventState.class);
    }
}