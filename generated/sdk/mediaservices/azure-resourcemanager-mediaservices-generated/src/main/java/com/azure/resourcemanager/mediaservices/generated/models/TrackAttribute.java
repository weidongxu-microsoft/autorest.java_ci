// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The TrackAttribute to filter the tracks by. */
public final class TrackAttribute extends ExpandableStringEnum<TrackAttribute> {
    /** Static value Bitrate for TrackAttribute. */
    public static final TrackAttribute BITRATE = fromString("Bitrate");

    /** Static value Language for TrackAttribute. */
    public static final TrackAttribute LANGUAGE = fromString("Language");

    /**
     * Creates a new instance of TrackAttribute value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TrackAttribute() {
    }

    /**
     * Creates or finds a TrackAttribute from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrackAttribute.
     */
    @JsonCreator
    public static TrackAttribute fromString(String name) {
        return fromString(name, TrackAttribute.class);
    }

    /**
     * Gets known TrackAttribute values.
     *
     * @return known TrackAttribute values.
     */
    public static Collection<TrackAttribute> values() {
        return values(TrackAttribute.class);
    }
}
