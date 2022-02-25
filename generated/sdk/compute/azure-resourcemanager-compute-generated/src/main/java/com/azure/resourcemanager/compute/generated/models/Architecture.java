// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Architecture. */
public final class Architecture extends ExpandableStringEnum<Architecture> {
    /** Static value x64 for Architecture. */
    public static final Architecture X64 = fromString("x64");

    /** Static value Arm64 for Architecture. */
    public static final Architecture ARM64 = fromString("Arm64");

    /**
     * Creates or finds a Architecture from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Architecture.
     */
    @JsonCreator
    public static Architecture fromString(String name) {
        return fromString(name, Architecture.class);
    }

    /** @return known Architecture values. */
    public static Collection<Architecture> values() {
        return values(Architecture.class);
    }
}
