// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Status of media service operation.
 */
@Fluent
public final class MediaServiceOperationStatusInner {
    /*
     * Operation identifier.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Operation resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Operation start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Operation end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * The error detail.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /**
     * Creates an instance of MediaServiceOperationStatusInner class.
     */
    public MediaServiceOperationStatusInner() {
    }

    /**
     * Get the name property: Operation identifier.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation identifier.
     * 
     * @param name the name value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Operation resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Operation resource ID.
     * 
     * @param id the id value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the startTime property: Operation start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Operation start time.
     * 
     * @param startTime the startTime value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Operation end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Operation end time.
     * 
     * @param endTime the endTime value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the status property: Operation status.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     * 
     * @param status the status value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: The error detail.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The error detail.
     * 
     * @param error the error value to set.
     * @return the MediaServiceOperationStatusInner object itself.
     */
    public MediaServiceOperationStatusInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model MediaServiceOperationStatusInner"));
        }
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property status in model MediaServiceOperationStatusInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MediaServiceOperationStatusInner.class);
}
