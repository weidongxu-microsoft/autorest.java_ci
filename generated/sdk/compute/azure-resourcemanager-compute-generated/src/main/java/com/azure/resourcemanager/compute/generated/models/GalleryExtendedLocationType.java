// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * It is type of the extended location.
 */
public final class GalleryExtendedLocationType extends ExpandableStringEnum<GalleryExtendedLocationType> {
    /**
     * Static value EdgeZone for GalleryExtendedLocationType.
     */
    public static final GalleryExtendedLocationType EDGE_ZONE = fromString("EdgeZone");

    /**
     * Static value Unknown for GalleryExtendedLocationType.
     */
    public static final GalleryExtendedLocationType UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of GalleryExtendedLocationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GalleryExtendedLocationType() {
    }

    /**
     * Creates or finds a GalleryExtendedLocationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GalleryExtendedLocationType.
     */
    public static GalleryExtendedLocationType fromString(String name) {
        return fromString(name, GalleryExtendedLocationType.class);
    }

    /**
     * Gets known GalleryExtendedLocationType values.
     * 
     * @return known GalleryExtendedLocationType values.
     */
    public static Collection<GalleryExtendedLocationType> values() {
        return values(GalleryExtendedLocationType.class);
    }
}
