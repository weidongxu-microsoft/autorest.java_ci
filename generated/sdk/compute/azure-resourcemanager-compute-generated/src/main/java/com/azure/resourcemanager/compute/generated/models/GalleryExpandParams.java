// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryExpandParams. */
public final class GalleryExpandParams extends ExpandableStringEnum<GalleryExpandParams> {
    /** Static value SharingProfile/Groups for GalleryExpandParams. */
    public static final GalleryExpandParams SHARING_PROFILE_GROUPS = fromString("SharingProfile/Groups");

    /**
     * Creates or finds a GalleryExpandParams from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryExpandParams.
     */
    @JsonCreator
    public static GalleryExpandParams fromString(String name) {
        return fromString(name, GalleryExpandParams.class);
    }

    /** @return known GalleryExpandParams values. */
    public static Collection<GalleryExpandParams> values() {
        return values(GalleryExpandParams.class);
    }
}