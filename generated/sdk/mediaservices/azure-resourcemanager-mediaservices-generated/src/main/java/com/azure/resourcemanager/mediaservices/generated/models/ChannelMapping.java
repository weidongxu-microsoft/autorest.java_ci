// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChannelMapping. */
public final class ChannelMapping extends ExpandableStringEnum<ChannelMapping> {
    /** Static value FrontLeft for ChannelMapping. */
    public static final ChannelMapping FRONT_LEFT = fromString("FrontLeft");

    /** Static value FrontRight for ChannelMapping. */
    public static final ChannelMapping FRONT_RIGHT = fromString("FrontRight");

    /** Static value Center for ChannelMapping. */
    public static final ChannelMapping CENTER = fromString("Center");

    /** Static value LowFrequencyEffects for ChannelMapping. */
    public static final ChannelMapping LOW_FREQUENCY_EFFECTS = fromString("LowFrequencyEffects");

    /** Static value BackLeft for ChannelMapping. */
    public static final ChannelMapping BACK_LEFT = fromString("BackLeft");

    /** Static value BackRight for ChannelMapping. */
    public static final ChannelMapping BACK_RIGHT = fromString("BackRight");

    /** Static value StereoLeft for ChannelMapping. */
    public static final ChannelMapping STEREO_LEFT = fromString("StereoLeft");

    /** Static value StereoRight for ChannelMapping. */
    public static final ChannelMapping STEREO_RIGHT = fromString("StereoRight");

    /**
     * Creates or finds a ChannelMapping from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChannelMapping.
     */
    @JsonCreator
    public static ChannelMapping fromString(String name) {
        return fromString(name, ChannelMapping.class);
    }

    /**
     * Gets known ChannelMapping values.
     *
     * @return known ChannelMapping values.
     */
    public static Collection<ChannelMapping> values() {
        return values(ChannelMapping.class);
    }
}
