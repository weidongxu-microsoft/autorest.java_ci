// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Table Access Policy Properties Object. */
@Fluent
public final class TableAccessPolicy {
    /*
     * Start time of the access policy
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Expiry time of the access policy
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /*
     * Required. List of abbreviated permissions. Supported permission values
     * include 'r','a','u','d'
     */
    @JsonProperty(value = "permission", required = true)
    private String permission;

    /**
     * Get the startTime property: Start time of the access policy.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the access policy.
     *
     * @param startTime the startTime value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the expiryTime property: Expiry time of the access policy.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: Expiry time of the access policy.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the permission property: Required. List of abbreviated permissions. Supported permission values include
     * 'r','a','u','d'.
     *
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission property: Required. List of abbreviated permissions. Supported permission values include
     * 'r','a','u','d'.
     *
     * @param permission the permission value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permission() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property permission in model TableAccessPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TableAccessPolicy.class);
}
