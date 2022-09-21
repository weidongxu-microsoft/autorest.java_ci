// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the dedicated host unutilized capacity in terms of a specific VM size. */
@Fluent
public final class DedicatedHostAllocatableVM {
    /*
     * VM size in terms of which the unutilized capacity is represented.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * Maximum number of VMs of size vmSize that can fit in the dedicated host's remaining capacity.
     */
    @JsonProperty(value = "count")
    private Double count;

    /** Creates an instance of DedicatedHostAllocatableVM class. */
    public DedicatedHostAllocatableVM() {
    }

    /**
     * Get the vmSize property: VM size in terms of which the unutilized capacity is represented.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: VM size in terms of which the unutilized capacity is represented.
     *
     * @param vmSize the vmSize value to set.
     * @return the DedicatedHostAllocatableVM object itself.
     */
    public DedicatedHostAllocatableVM withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the count property: Maximum number of VMs of size vmSize that can fit in the dedicated host's remaining
     * capacity.
     *
     * @return the count value.
     */
    public Double count() {
        return this.count;
    }

    /**
     * Set the count property: Maximum number of VMs of size vmSize that can fit in the dedicated host's remaining
     * capacity.
     *
     * @param count the count value to set.
     * @return the DedicatedHostAllocatableVM object itself.
     */
    public DedicatedHostAllocatableVM withCount(Double count) {
        this.count = count;
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
