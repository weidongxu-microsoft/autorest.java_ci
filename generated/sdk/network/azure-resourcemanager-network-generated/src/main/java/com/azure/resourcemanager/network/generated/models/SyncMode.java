// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Backend address synchronous mode for the backend pool. */
public final class SyncMode extends ExpandableStringEnum<SyncMode> {
    /** Static value Automatic for SyncMode. */
    public static final SyncMode AUTOMATIC = fromString("Automatic");

    /** Static value Manual for SyncMode. */
    public static final SyncMode MANUAL = fromString("Manual");

    /**
     * Creates a new instance of SyncMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SyncMode() {
    }

    /**
     * Creates or finds a SyncMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncMode.
     */
    @JsonCreator
    public static SyncMode fromString(String name) {
        return fromString(name, SyncMode.class);
    }

    /**
     * Gets known SyncMode values.
     *
     * @return known SyncMode values.
     */
    public static Collection<SyncMode> values() {
        return values(SyncMode.class);
    }
}
