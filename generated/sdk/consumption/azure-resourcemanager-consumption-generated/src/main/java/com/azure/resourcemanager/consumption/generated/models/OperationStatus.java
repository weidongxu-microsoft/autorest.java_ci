// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.resourcemanager.consumption.generated.fluent.models.OperationStatusInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of OperationStatus.
 */
public interface OperationStatus {
    /**
     * Gets the status property: The status of the long running operation.
     * 
     * @return the status value.
     */
    OperationStatusType status();

    /**
     * Gets the downloadUrl property: The link (url) to download the pricesheet.
     * 
     * @return the downloadUrl value.
     */
    String downloadUrl();

    /**
     * Gets the validTill property: Download link validity.
     * 
     * @return the validTill value.
     */
    OffsetDateTime validTill();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.generated.fluent.models.OperationStatusInner object.
     * 
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
