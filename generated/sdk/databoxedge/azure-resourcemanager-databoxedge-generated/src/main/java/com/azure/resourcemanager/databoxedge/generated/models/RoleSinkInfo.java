// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Compute role against which events will be raised.
 */
@Fluent
public final class RoleSinkInfo {
    /*
     * Compute role ID.
     */
    @JsonProperty(value = "roleId", required = true)
    private String roleId;

    /**
     * Creates an instance of RoleSinkInfo class.
     */
    public RoleSinkInfo() {
    }

    /**
     * Get the roleId property: Compute role ID.
     * 
     * @return the roleId value.
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Set the roleId property: Compute role ID.
     * 
     * @param roleId the roleId value to set.
     * @return the RoleSinkInfo object itself.
     */
    public RoleSinkInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property roleId in model RoleSinkInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleSinkInfo.class);
}
