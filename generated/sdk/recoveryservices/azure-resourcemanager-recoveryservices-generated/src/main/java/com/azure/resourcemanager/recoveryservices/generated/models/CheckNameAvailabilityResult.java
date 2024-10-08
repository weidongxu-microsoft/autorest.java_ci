// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.resourcemanager.recoveryservices.generated.fluent.models.CheckNameAvailabilityResultInner;

/**
 * An immutable client-side representation of CheckNameAvailabilityResult.
 */
public interface CheckNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: The nameAvailable property.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason property.
     * 
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the message property: The message property.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner
     * com.azure.resourcemanager.recoveryservices.generated.fluent.models.CheckNameAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    CheckNameAvailabilityResultInner innerModel();
}
