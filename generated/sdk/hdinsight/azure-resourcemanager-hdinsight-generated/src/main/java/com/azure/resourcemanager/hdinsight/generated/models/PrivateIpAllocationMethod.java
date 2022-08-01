// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The method that private IP address is allocated. */
public final class PrivateIpAllocationMethod extends ExpandableStringEnum<PrivateIpAllocationMethod> {
    /** Static value dynamic for PrivateIpAllocationMethod. */
    public static final PrivateIpAllocationMethod DYNAMIC = fromString("dynamic");

    /** Static value static for PrivateIpAllocationMethod. */
    public static final PrivateIpAllocationMethod STATIC = fromString("static");

    /**
     * Creates or finds a PrivateIpAllocationMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateIpAllocationMethod.
     */
    @JsonCreator
    public static PrivateIpAllocationMethod fromString(String name) {
        return fromString(name, PrivateIpAllocationMethod.class);
    }

    /**
     * Gets known PrivateIpAllocationMethod values.
     *
     * @return known PrivateIpAllocationMethod values.
     */
    public static Collection<PrivateIpAllocationMethod> values() {
        return values(PrivateIpAllocationMethod.class);
    }
}
