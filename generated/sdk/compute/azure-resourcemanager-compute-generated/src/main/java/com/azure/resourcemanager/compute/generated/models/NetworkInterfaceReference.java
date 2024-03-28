// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.NetworkInterfaceReferenceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a network interface reference.
 */
@Fluent
public final class NetworkInterfaceReference extends SubResource {
    /*
     * Describes a network interface reference properties.
     */
    @JsonProperty(value = "properties")
    private NetworkInterfaceReferenceProperties innerProperties;

    /**
     * Creates an instance of NetworkInterfaceReference class.
     */
    public NetworkInterfaceReference() {
    }

    /**
     * Get the innerProperties property: Describes a network interface reference properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkInterfaceReferenceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceReference withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     * 
     * @param primary the primary value to set.
     * @return the NetworkInterfaceReference object itself.
     */
    public NetworkInterfaceReference withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceReferenceProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.innerProperties() == null ? null : this.innerProperties().deleteOption();
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the NetworkInterfaceReference object itself.
     */
    public NetworkInterfaceReference withDeleteOption(DeleteOptions deleteOption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceReferenceProperties();
        }
        this.innerProperties().withDeleteOption(deleteOption);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
