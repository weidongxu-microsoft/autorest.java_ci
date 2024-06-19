// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for FavoriteSourceType.
 */
public final class FavoriteSourceType extends ExpandableStringEnum<FavoriteSourceType> {
    /**
     * Static value retention for FavoriteSourceType.
     */
    public static final FavoriteSourceType RETENTION = fromString("retention");

    /**
     * Static value notebook for FavoriteSourceType.
     */
    public static final FavoriteSourceType NOTEBOOK = fromString("notebook");

    /**
     * Static value sessions for FavoriteSourceType.
     */
    public static final FavoriteSourceType SESSIONS = fromString("sessions");

    /**
     * Static value events for FavoriteSourceType.
     */
    public static final FavoriteSourceType EVENTS = fromString("events");

    /**
     * Static value userflows for FavoriteSourceType.
     */
    public static final FavoriteSourceType USERFLOWS = fromString("userflows");

    /**
     * Static value funnel for FavoriteSourceType.
     */
    public static final FavoriteSourceType FUNNEL = fromString("funnel");

    /**
     * Static value impact for FavoriteSourceType.
     */
    public static final FavoriteSourceType IMPACT = fromString("impact");

    /**
     * Static value segmentation for FavoriteSourceType.
     */
    public static final FavoriteSourceType SEGMENTATION = fromString("segmentation");

    /**
     * Creates a new instance of FavoriteSourceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FavoriteSourceType() {
    }

    /**
     * Creates or finds a FavoriteSourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FavoriteSourceType.
     */
    public static FavoriteSourceType fromString(String name) {
        return fromString(name, FavoriteSourceType.class);
    }

    /**
     * Gets known FavoriteSourceType values.
     * 
     * @return known FavoriteSourceType values.
     */
    public static Collection<FavoriteSourceType> values() {
        return values(FavoriteSourceType.class);
    }
}
