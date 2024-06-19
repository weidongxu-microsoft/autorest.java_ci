// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Event level.
 */
public final class LiveEventStreamEventLevel extends ExpandableStringEnum<LiveEventStreamEventLevel> {
    /**
     * Static value Critical for LiveEventStreamEventLevel.
     */
    public static final LiveEventStreamEventLevel CRITICAL = fromString("Critical");

    /**
     * Static value Error for LiveEventStreamEventLevel.
     */
    public static final LiveEventStreamEventLevel ERROR = fromString("Error");

    /**
     * Static value Warning for LiveEventStreamEventLevel.
     */
    public static final LiveEventStreamEventLevel WARNING = fromString("Warning");

    /**
     * Static value Information for LiveEventStreamEventLevel.
     */
    public static final LiveEventStreamEventLevel INFORMATION = fromString("Information");

    /**
     * Creates a new instance of LiveEventStreamEventLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LiveEventStreamEventLevel() {
    }

    /**
     * Creates or finds a LiveEventStreamEventLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LiveEventStreamEventLevel.
     */
    public static LiveEventStreamEventLevel fromString(String name) {
        return fromString(name, LiveEventStreamEventLevel.class);
    }

    /**
     * Gets known LiveEventStreamEventLevel values.
     * 
     * @return known LiveEventStreamEventLevel values.
     */
    public static Collection<LiveEventStreamEventLevel> values() {
        return values(LiveEventStreamEventLevel.class);
    }
}
