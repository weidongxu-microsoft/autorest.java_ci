// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Track property type. */
public final class TrackPropertyType extends ExpandableStringEnum<TrackPropertyType> {
    /** Static value Unknown for TrackPropertyType. */
    public static final TrackPropertyType UNKNOWN = fromString("Unknown");

    /** Static value FourCC for TrackPropertyType. */
    public static final TrackPropertyType FOUR_CC = fromString("FourCC");

    /**
     * Creates or finds a TrackPropertyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrackPropertyType.
     */
    @JsonCreator
    public static TrackPropertyType fromString(String name) {
        return fromString(name, TrackPropertyType.class);
    }

    /**
     * Gets known TrackPropertyType values.
     *
     * @return known TrackPropertyType values.
     */
    public static Collection<TrackPropertyType> values() {
        return values(TrackPropertyType.class);
    }
}
