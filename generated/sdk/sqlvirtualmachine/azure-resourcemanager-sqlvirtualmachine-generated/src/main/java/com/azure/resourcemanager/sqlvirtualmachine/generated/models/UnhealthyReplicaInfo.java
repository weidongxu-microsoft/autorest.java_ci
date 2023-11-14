// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SQL VM Troubleshoot UnhealthyReplica scenario information.
 */
@Fluent
public final class UnhealthyReplicaInfo {
    /*
     * The name of the availability group
     */
    @JsonProperty(value = "availabilityGroupName")
    private String availabilityGroupName;

    /**
     * Creates an instance of UnhealthyReplicaInfo class.
     */
    public UnhealthyReplicaInfo() {
    }

    /**
     * Get the availabilityGroupName property: The name of the availability group.
     * 
     * @return the availabilityGroupName value.
     */
    public String availabilityGroupName() {
        return this.availabilityGroupName;
    }

    /**
     * Set the availabilityGroupName property: The name of the availability group.
     * 
     * @param availabilityGroupName the availabilityGroupName value to set.
     * @return the UnhealthyReplicaInfo object itself.
     */
    public UnhealthyReplicaInfo withAvailabilityGroupName(String availabilityGroupName) {
        this.availabilityGroupName = availabilityGroupName;
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
