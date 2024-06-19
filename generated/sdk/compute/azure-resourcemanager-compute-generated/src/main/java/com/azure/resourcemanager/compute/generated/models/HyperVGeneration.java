// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
 */
public final class HyperVGeneration extends ExpandableStringEnum<HyperVGeneration> {
    /**
     * Static value V1 for HyperVGeneration.
     */
    public static final HyperVGeneration V1 = fromString("V1");

    /**
     * Static value V2 for HyperVGeneration.
     */
    public static final HyperVGeneration V2 = fromString("V2");

    /**
     * Creates a new instance of HyperVGeneration value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HyperVGeneration() {
    }

    /**
     * Creates or finds a HyperVGeneration from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HyperVGeneration.
     */
    public static HyperVGeneration fromString(String name) {
        return fromString(name, HyperVGeneration.class);
    }

    /**
     * Gets known HyperVGeneration values.
     * 
     * @return known HyperVGeneration values.
     */
    public static Collection<HyperVGeneration> values() {
        return values(HyperVGeneration.class);
    }
}
