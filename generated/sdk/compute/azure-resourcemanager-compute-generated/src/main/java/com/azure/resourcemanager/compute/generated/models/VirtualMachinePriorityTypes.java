// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the priority for a standalone virtual machine or the virtual machines in the scale set. 'Low' enum will be
 * deprecated in the future, please use 'Spot' as the enum to deploy Azure Spot VM/VMSS.
 */
public final class VirtualMachinePriorityTypes extends ExpandableStringEnum<VirtualMachinePriorityTypes> {
    /**
     * Static value Regular for VirtualMachinePriorityTypes.
     */
    public static final VirtualMachinePriorityTypes REGULAR = fromString("Regular");

    /**
     * Static value Low for VirtualMachinePriorityTypes.
     */
    public static final VirtualMachinePriorityTypes LOW = fromString("Low");

    /**
     * Static value Spot for VirtualMachinePriorityTypes.
     */
    public static final VirtualMachinePriorityTypes SPOT = fromString("Spot");

    /**
     * Creates a new instance of VirtualMachinePriorityTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachinePriorityTypes() {
    }

    /**
     * Creates or finds a VirtualMachinePriorityTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualMachinePriorityTypes.
     */
    @JsonCreator
    public static VirtualMachinePriorityTypes fromString(String name) {
        return fromString(name, VirtualMachinePriorityTypes.class);
    }

    /**
     * Gets known VirtualMachinePriorityTypes values.
     * 
     * @return known VirtualMachinePriorityTypes values.
     */
    public static Collection<VirtualMachinePriorityTypes> values() {
        return values(VirtualMachinePriorityTypes.class);
    }
}
