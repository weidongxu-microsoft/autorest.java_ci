// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.CheckNameAvailabilityResultInner;

/**
 * An immutable client-side representation of CheckNameAvailabilityResult.
 */
public interface CheckNameAvailabilityResult {
    /**
     * Gets the nameAvailable property: Gets a boolean value that indicates whether the name is available for you to use. If true, the name is available. If false, the name has already been taken or is invalid and cannot be used.
     * 
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: Gets the reason that a storage account name could not be used. The Reason element is only returned if NameAvailable is false.
     * 
     * @return the reason value.
     */
    Reason reason();

    /**
     * Gets the message property: Gets an error message explaining the Reason value in more detail.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.CheckNameAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    CheckNameAvailabilityResultInner innerModel();
}
