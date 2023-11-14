// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The lease status of the container.
 */
public final class LeaseStatus extends ExpandableStringEnum<LeaseStatus> {
    /**
     * Static value Locked for LeaseStatus.
     */
    public static final LeaseStatus LOCKED = fromString("Locked");

    /**
     * Static value Unlocked for LeaseStatus.
     */
    public static final LeaseStatus UNLOCKED = fromString("Unlocked");

    /**
     * Creates a new instance of LeaseStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LeaseStatus() {
    }

    /**
     * Creates or finds a LeaseStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LeaseStatus.
     */
    @JsonCreator
    public static LeaseStatus fromString(String name) {
        return fromString(name, LeaseStatus.class);
    }

    /**
     * Gets known LeaseStatus values.
     * 
     * @return known LeaseStatus values.
     */
    public static Collection<LeaseStatus> values() {
        return values(LeaseStatus.class);
    }
}
