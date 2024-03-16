// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response after calling a manual recovery walk.
 */
@Immutable
public final class RecoveryWalkResponseInner {
    /*
     * Whether the recovery walk was performed
     */
    @JsonProperty(value = "walkPerformed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean walkPerformed;

    /*
     * The next update domain that needs to be walked. Null means walk spanning all update domains has been completed
     */
    @JsonProperty(value = "nextPlatformUpdateDomain", access = JsonProperty.Access.WRITE_ONLY)
    private Integer nextPlatformUpdateDomain;

    /**
     * Creates an instance of RecoveryWalkResponseInner class.
     */
    public RecoveryWalkResponseInner() {
    }

    /**
     * Get the walkPerformed property: Whether the recovery walk was performed.
     * 
     * @return the walkPerformed value.
     */
    public Boolean walkPerformed() {
        return this.walkPerformed;
    }

    /**
     * Get the nextPlatformUpdateDomain property: The next update domain that needs to be walked. Null means walk spanning all update domains has been completed.
     * 
     * @return the nextPlatformUpdateDomain value.
     */
    public Integer nextPlatformUpdateDomain() {
        return this.nextPlatformUpdateDomain;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
