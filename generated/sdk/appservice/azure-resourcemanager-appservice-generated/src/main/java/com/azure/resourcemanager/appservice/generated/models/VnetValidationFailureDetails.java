// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.VnetValidationFailureDetailsInner;
import java.util.List;

/**
 * An immutable client-side representation of VnetValidationFailureDetails.
 */
public interface VnetValidationFailureDetails {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the message property: Text describing the validation outcome.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the failed property: A flag describing whether or not validation failed.
     * 
     * @return the failed value.
     */
    Boolean failed();

    /**
     * Gets the failedTests property: A list of tests that failed in the validation.
     * 
     * @return the failedTests value.
     */
    List<VnetValidationTestFailure> failedTests();

    /**
     * Gets the warnings property: A list of warnings generated during validation.
     * 
     * @return the warnings value.
     */
    List<VnetValidationTestFailure> warnings();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.VnetValidationFailureDetailsInner
     * object.
     * 
     * @return the inner object.
     */
    VnetValidationFailureDetailsInner innerModel();
}
