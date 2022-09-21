// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Supported next step behaviors after a rule is applied to a matched route. */
public final class NextStep extends ExpandableStringEnum<NextStep> {
    /** Static value Unknown for NextStep. */
    public static final NextStep UNKNOWN = fromString("Unknown");

    /** Static value Continue for NextStep. */
    public static final NextStep CONTINUE = fromString("Continue");

    /** Static value Terminate for NextStep. */
    public static final NextStep TERMINATE = fromString("Terminate");

    /**
     * Creates or finds a NextStep from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NextStep.
     */
    @JsonCreator
    public static NextStep fromString(String name) {
        return fromString(name, NextStep.class);
    }

    /**
     * Gets known NextStep values.
     *
     * @return known NextStep values.
     */
    public static Collection<NextStep> values() {
        return values(NextStep.class);
    }
}
