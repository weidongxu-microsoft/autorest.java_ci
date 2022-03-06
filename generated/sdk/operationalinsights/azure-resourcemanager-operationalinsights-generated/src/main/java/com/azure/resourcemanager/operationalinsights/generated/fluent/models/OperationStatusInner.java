// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of operation. */
@Fluent
public final class OperationStatusInner {
    /*
     * The operation Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The start time of the operation.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * The end time of the operation.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error response The error detail of the operation if any.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /**
     * Get the id property: The operation Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The operation Id.
     *
     * @param id the id value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the operation.
     *
     * @param startTime the startTime value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the operation.
     *
     * @param endTime the endTime value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Error response The error detail of the operation if any.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Error response The error detail of the operation if any.
     *
     * @param error the error value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withError(ManagementError error) {
        this.error = error;
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
