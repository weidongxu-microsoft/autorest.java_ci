// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.locks.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Lock owner properties. */
@Fluent
public final class ManagementLockOwner {
    /*
     * The application ID of the lock owner.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /** Creates an instance of ManagementLockOwner class. */
    public ManagementLockOwner() {
    }

    /**
     * Get the applicationId property: The application ID of the lock owner.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application ID of the lock owner.
     *
     * @param applicationId the applicationId value to set.
     * @return the ManagementLockOwner object itself.
     */
    public ManagementLockOwner withApplicationId(String applicationId) {
        this.applicationId = applicationId;
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
