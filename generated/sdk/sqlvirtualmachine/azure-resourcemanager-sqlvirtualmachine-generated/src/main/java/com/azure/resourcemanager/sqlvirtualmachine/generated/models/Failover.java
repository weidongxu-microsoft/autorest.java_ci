// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Failover. */
public final class Failover extends ExpandableStringEnum<Failover> {
    /** Static value AUTOMATIC for Failover. */
    public static final Failover AUTOMATIC = fromString("AUTOMATIC");

    /** Static value MANUAL for Failover. */
    public static final Failover MANUAL = fromString("MANUAL");

    /**
     * Creates or finds a Failover from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Failover.
     */
    @JsonCreator
    public static Failover fromString(String name) {
        return fromString(name, Failover.class);
    }

    /** @return known Failover values. */
    public static Collection<Failover> values() {
        return values(Failover.class);
    }
}