// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the eviction policy for the Azure Spot VM/VMSS.
 */
public final class VirtualMachineEvictionPolicyTypes extends ExpandableStringEnum<VirtualMachineEvictionPolicyTypes> {
    /**
     * Static value Deallocate for VirtualMachineEvictionPolicyTypes.
     */
    public static final VirtualMachineEvictionPolicyTypes DEALLOCATE = fromString("Deallocate");

    /**
     * Static value Delete for VirtualMachineEvictionPolicyTypes.
     */
    public static final VirtualMachineEvictionPolicyTypes DELETE = fromString("Delete");

    /**
     * Creates a new instance of VirtualMachineEvictionPolicyTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachineEvictionPolicyTypes() {
    }

    /**
     * Creates or finds a VirtualMachineEvictionPolicyTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualMachineEvictionPolicyTypes.
     */
    public static VirtualMachineEvictionPolicyTypes fromString(String name) {
        return fromString(name, VirtualMachineEvictionPolicyTypes.class);
    }

    /**
     * Gets known VirtualMachineEvictionPolicyTypes values.
     * 
     * @return known VirtualMachineEvictionPolicyTypes values.
     */
    public static Collection<VirtualMachineEvictionPolicyTypes> values() {
        return values(VirtualMachineEvictionPolicyTypes.class);
    }
}
