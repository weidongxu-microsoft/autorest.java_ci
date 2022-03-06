// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PermissionScope model. */
@Fluent
public final class PermissionScope {
    /*
     * The permissions for the local user. Possible values include: Read (r),
     * Write (w), Delete (d), List (l), and Create (c).
     */
    @JsonProperty(value = "permissions", required = true)
    private String permissions;

    /*
     * The service used by the local user, e.g. blob, file.
     */
    @JsonProperty(value = "service", required = true)
    private String service;

    /*
     * The name of resource, normally the container name or the file share
     * name, used by the local user.
     */
    @JsonProperty(value = "resourceName", required = true)
    private String resourceName;

    /**
     * Get the permissions property: The permissions for the local user. Possible values include: Read (r), Write (w),
     * Delete (d), List (l), and Create (c).
     *
     * @return the permissions value.
     */
    public String permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The permissions for the local user. Possible values include: Read (r), Write (w),
     * Delete (d), List (l), and Create (c).
     *
     * @param permissions the permissions value to set.
     * @return the PermissionScope object itself.
     */
    public PermissionScope withPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the service property: The service used by the local user, e.g. blob, file.
     *
     * @return the service value.
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service property: The service used by the local user, e.g. blob, file.
     *
     * @param service the service value to set.
     * @return the PermissionScope object itself.
     */
    public PermissionScope withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the resourceName property: The name of resource, normally the container name or the file share name, used by
     * the local user.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The name of resource, normally the container name or the file share name, used by
     * the local user.
     *
     * @param resourceName the resourceName value to set.
     * @return the PermissionScope object itself.
     */
    public PermissionScope withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissions() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property permissions in model PermissionScope"));
        }
        if (service() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property service in model PermissionScope"));
        }
        if (resourceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceName in model PermissionScope"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PermissionScope.class);
}