// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of the Update. */
public final class UpdateType extends ExpandableStringEnum<UpdateType> {
    /** Static value Software for UpdateType. */
    public static final UpdateType SOFTWARE = fromString("Software");

    /** Static value Kubernetes for UpdateType. */
    public static final UpdateType KUBERNETES = fromString("Kubernetes");

    /** Static value Firmware for UpdateType. */
    public static final UpdateType FIRMWARE = fromString("Firmware");

    /**
     * Creates or finds a UpdateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateType.
     */
    @JsonCreator
    public static UpdateType fromString(String name) {
        return fromString(name, UpdateType.class);
    }

    /**
     * Gets known UpdateType values.
     *
     * @return known UpdateType values.
     */
    public static Collection<UpdateType> values() {
        return values(UpdateType.class);
    }
}
