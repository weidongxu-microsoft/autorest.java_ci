// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The share mount point. */
@Fluent
public final class MountPointMap {
    /*
     * ID of the share mounted to the role VM.
     */
    @JsonProperty(value = "shareId", required = true)
    private String shareId;

    /*
     * ID of the role to which share is mounted.
     */
    @JsonProperty(value = "roleId", access = JsonProperty.Access.WRITE_ONLY)
    private String roleId;

    /*
     * Mount point for the share.
     */
    @JsonProperty(value = "mountPoint", access = JsonProperty.Access.WRITE_ONLY)
    private String mountPoint;

    /*
     * Mounting type.
     */
    @JsonProperty(value = "mountType", access = JsonProperty.Access.WRITE_ONLY)
    private MountType mountType;

    /*
     * Role type.
     */
    @JsonProperty(value = "roleType", access = JsonProperty.Access.WRITE_ONLY)
    private RoleTypes roleType;

    /**
     * Get the shareId property: ID of the share mounted to the role VM.
     *
     * @return the shareId value.
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Set the shareId property: ID of the share mounted to the role VM.
     *
     * @param shareId the shareId value to set.
     * @return the MountPointMap object itself.
     */
    public MountPointMap withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * Get the roleId property: ID of the role to which share is mounted.
     *
     * @return the roleId value.
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Get the mountPoint property: Mount point for the share.
     *
     * @return the mountPoint value.
     */
    public String mountPoint() {
        return this.mountPoint;
    }

    /**
     * Get the mountType property: Mounting type.
     *
     * @return the mountType value.
     */
    public MountType mountType() {
        return this.mountType;
    }

    /**
     * Get the roleType property: Role type.
     *
     * @return the roleType value.
     */
    public RoleTypes roleType() {
        return this.roleType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (shareId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property shareId in model MountPointMap"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MountPointMap.class);
}
