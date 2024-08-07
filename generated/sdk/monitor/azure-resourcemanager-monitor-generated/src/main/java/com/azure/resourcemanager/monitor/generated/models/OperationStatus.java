// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.OperationStatusInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of OperationStatus.
 */
public interface OperationStatus {
    /**
     * Gets the id property: The operation Id.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The operation name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the startTime property: Start time of the job in standard ISO8601 format.
     * 
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: End time of the job in standard ISO8601 format.
     * 
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the status property: The status of the operation.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the error property: The error detail of the operation if any.
     * 
     * @return the error value.
     */
    ErrorResponseCommon error();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.OperationStatusInner object.
     * 
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
