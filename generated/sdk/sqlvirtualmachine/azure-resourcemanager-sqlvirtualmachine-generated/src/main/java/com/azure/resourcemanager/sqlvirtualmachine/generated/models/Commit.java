// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Replica commit mode in availability group. */
public final class Commit extends ExpandableStringEnum<Commit> {
    /** Static value SYNCHRONOUS_COMMIT for Commit. */
    public static final Commit SYNCHRONOUS_COMMIT = fromString("SYNCHRONOUS_COMMIT");

    /** Static value ASYNCHRONOUS_COMMIT for Commit. */
    public static final Commit ASYNCHRONOUS_COMMIT = fromString("ASYNCHRONOUS_COMMIT");

    /**
     * Creates a new instance of Commit value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Commit() {
    }

    /**
     * Creates or finds a Commit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Commit.
     */
    @JsonCreator
    public static Commit fromString(String name) {
        return fromString(name, Commit.class);
    }

    /**
     * Gets known Commit values.
     *
     * @return known Commit values.
     */
    public static Collection<Commit> values() {
        return values(Commit.class);
    }
}
