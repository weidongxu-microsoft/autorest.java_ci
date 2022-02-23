// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.OperationResultInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the id property: ID of the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: status of the Operation result.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the startTime property: The operation start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The operation end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the percentComplete property: Percentage completed.
     *
     * @return the percentComplete value.
     */
    Double percentComplete();

    /**
     * Gets the operationKind property: The kind of the operation.
     *
     * @return the operationKind value.
     */
    String operationKind();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the operationState property: The state of the operation.
     *
     * @return the operationState value.
     */
    String operationState();

    /**
     * Gets the code property: The code of the error.
     *
     * @return the code value.
     */
    String code();

    /**
     * Gets the message property: The error message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.azurekusto.generated.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
