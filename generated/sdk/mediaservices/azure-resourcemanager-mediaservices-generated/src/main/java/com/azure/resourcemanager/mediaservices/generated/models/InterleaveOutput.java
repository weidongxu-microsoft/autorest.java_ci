// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Sets the interleave mode of the output to control how audio and video are stored in the container format. Example:
 * set InterleavedOutput as NonInterleavedOutput to produce audio-only and video-only outputs in separate MP4 files.
 */
public final class InterleaveOutput extends ExpandableStringEnum<InterleaveOutput> {
    /**
     * Static value NonInterleavedOutput for InterleaveOutput.
     */
    public static final InterleaveOutput NON_INTERLEAVED_OUTPUT = fromString("NonInterleavedOutput");

    /**
     * Static value InterleavedOutput for InterleaveOutput.
     */
    public static final InterleaveOutput INTERLEAVED_OUTPUT = fromString("InterleavedOutput");

    /**
     * Creates a new instance of InterleaveOutput value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InterleaveOutput() {
    }

    /**
     * Creates or finds a InterleaveOutput from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InterleaveOutput.
     */
    public static InterleaveOutput fromString(String name) {
        return fromString(name, InterleaveOutput.class);
    }

    /**
     * Gets known InterleaveOutput values.
     * 
     * @return known InterleaveOutput values.
     */
    public static Collection<InterleaveOutput> values() {
        return values(InterleaveOutput.class);
    }
}
