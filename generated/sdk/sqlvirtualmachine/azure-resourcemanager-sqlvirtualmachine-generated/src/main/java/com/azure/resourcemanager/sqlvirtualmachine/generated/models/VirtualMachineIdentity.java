// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Machine Identity details used for Sql IaaS extension configurations.
 */
@Fluent
public final class VirtualMachineIdentity {
    /*
     * Identity type of the virtual machine. Specify None to opt-out of Managed Identities.
     */
    @JsonProperty(value = "type")
    private VmIdentityType type;

    /*
     * ARM Resource Id of the identity. Only required when UserAssigned identity is selected.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Creates an instance of VirtualMachineIdentity class.
     */
    public VirtualMachineIdentity() {
    }

    /**
     * Get the type property: Identity type of the virtual machine. Specify None to opt-out of Managed Identities.
     * 
     * @return the type value.
     */
    public VmIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Identity type of the virtual machine. Specify None to opt-out of Managed Identities.
     * 
     * @param type the type value to set.
     * @return the VirtualMachineIdentity object itself.
     */
    public VirtualMachineIdentity withType(VmIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceId property: ARM Resource Id of the identity. Only required when UserAssigned identity is
     * selected.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM Resource Id of the identity. Only required when UserAssigned identity is
     * selected.
     * 
     * @param resourceId the resourceId value to set.
     * @return the VirtualMachineIdentity object itself.
     */
    public VirtualMachineIdentity withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}