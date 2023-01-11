// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicationStatusTypes. */
public final class ReplicationStatusTypes extends ExpandableStringEnum<ReplicationStatusTypes> {
    /** Static value ReplicationStatus for ReplicationStatusTypes. */
    public static final ReplicationStatusTypes REPLICATION_STATUS = fromString("ReplicationStatus");

    /**
     * Creates a new instance of ReplicationStatusTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationStatusTypes() {
    }

    /**
     * Creates or finds a ReplicationStatusTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicationStatusTypes.
     */
    @JsonCreator
    public static ReplicationStatusTypes fromString(String name) {
        return fromString(name, ReplicationStatusTypes.class);
    }

    /**
     * Gets known ReplicationStatusTypes values.
     *
     * @return known ReplicationStatusTypes values.
     */
    public static Collection<ReplicationStatusTypes> values() {
        return values(ReplicationStatusTypes.class);
    }
}
