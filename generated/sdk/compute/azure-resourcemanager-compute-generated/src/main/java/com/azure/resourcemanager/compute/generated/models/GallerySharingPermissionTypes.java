// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GallerySharingPermissionTypes. */
public final class GallerySharingPermissionTypes extends ExpandableStringEnum<GallerySharingPermissionTypes> {
    /** Static value Private for GallerySharingPermissionTypes. */
    public static final GallerySharingPermissionTypes PRIVATE = fromString("Private");

    /** Static value Groups for GallerySharingPermissionTypes. */
    public static final GallerySharingPermissionTypes GROUPS = fromString("Groups");

    /** Static value Community for GallerySharingPermissionTypes. */
    public static final GallerySharingPermissionTypes COMMUNITY = fromString("Community");

    /**
     * Creates or finds a GallerySharingPermissionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GallerySharingPermissionTypes.
     */
    @JsonCreator
    public static GallerySharingPermissionTypes fromString(String name) {
        return fromString(name, GallerySharingPermissionTypes.class);
    }

    /**
     * Gets known GallerySharingPermissionTypes values.
     *
     * @return known GallerySharingPermissionTypes values.
     */
    public static Collection<GallerySharingPermissionTypes> values() {
        return values(GallerySharingPermissionTypes.class);
    }
}
