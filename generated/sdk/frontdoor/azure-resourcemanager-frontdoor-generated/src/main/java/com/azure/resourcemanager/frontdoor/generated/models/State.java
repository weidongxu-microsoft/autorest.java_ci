// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the Experiment. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value Enabled for State. */
    public static final State ENABLED = fromString("Enabled");

    /** Static value Disabled for State. */
    public static final State DISABLED = fromString("Disabled");

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     *
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
