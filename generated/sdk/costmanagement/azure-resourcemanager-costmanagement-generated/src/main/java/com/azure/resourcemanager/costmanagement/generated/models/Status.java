// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the long running operation. */
@Fluent
public final class Status {
    /*
     * The status of the long running operation.
     */
    @JsonProperty(value = "status")
    private OperationStatusType status;

    /**
     * Get the status property: The status of the long running operation.
     *
     * @return the status value.
     */
    public OperationStatusType status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the long running operation.
     *
     * @param status the status value to set.
     * @return the Status object itself.
     */
    public Status withStatus(OperationStatusType status) {
        this.status = status;
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
