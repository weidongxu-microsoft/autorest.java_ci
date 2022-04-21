// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FrontDoorResourceState. */
public final class FrontDoorResourceState extends ExpandableStringEnum<FrontDoorResourceState> {
    /** Static value Creating for FrontDoorResourceState. */
    public static final FrontDoorResourceState CREATING = fromString("Creating");

    /** Static value Enabling for FrontDoorResourceState. */
    public static final FrontDoorResourceState ENABLING = fromString("Enabling");

    /** Static value Enabled for FrontDoorResourceState. */
    public static final FrontDoorResourceState ENABLED = fromString("Enabled");

    /** Static value Disabling for FrontDoorResourceState. */
    public static final FrontDoorResourceState DISABLING = fromString("Disabling");

    /** Static value Disabled for FrontDoorResourceState. */
    public static final FrontDoorResourceState DISABLED = fromString("Disabled");

    /** Static value Deleting for FrontDoorResourceState. */
    public static final FrontDoorResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a FrontDoorResourceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorResourceState.
     */
    @JsonCreator
    public static FrontDoorResourceState fromString(String name) {
        return fromString(name, FrontDoorResourceState.class);
    }

    /**
     * Gets known FrontDoorResourceState values.
     *
     * @return known FrontDoorResourceState values.
     */
    public static Collection<FrontDoorResourceState> values() {
        return values(FrontDoorResourceState.class);
    }
}
