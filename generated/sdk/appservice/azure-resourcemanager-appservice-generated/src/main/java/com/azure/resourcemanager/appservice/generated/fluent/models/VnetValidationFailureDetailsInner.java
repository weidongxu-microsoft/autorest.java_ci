// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.VnetValidationTestFailure;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A class that describes the reason for a validation failure.
 */
@Fluent
public final class VnetValidationFailureDetailsInner extends ProxyOnlyResource {
    /*
     * VnetValidationFailureDetails resource specific properties
     */
    @JsonProperty(value = "properties")
    private VnetValidationFailureDetailsProperties innerProperties;

    /**
     * Creates an instance of VnetValidationFailureDetailsInner class.
     */
    public VnetValidationFailureDetailsInner() {
    }

    /**
     * Get the innerProperties property: VnetValidationFailureDetails resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private VnetValidationFailureDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VnetValidationFailureDetailsInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the message property: Text describing the validation outcome.
     * 
     * @return the message value.
     */
    public String message() {
        return this.innerProperties() == null ? null : this.innerProperties().message();
    }

    /**
     * Set the message property: Text describing the validation outcome.
     * 
     * @param message the message value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withMessage(String message) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationFailureDetailsProperties();
        }
        this.innerProperties().withMessage(message);
        return this;
    }

    /**
     * Get the failed property: A flag describing whether or not validation failed.
     * 
     * @return the failed value.
     */
    public Boolean failed() {
        return this.innerProperties() == null ? null : this.innerProperties().failed();
    }

    /**
     * Set the failed property: A flag describing whether or not validation failed.
     * 
     * @param failed the failed value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailed(Boolean failed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationFailureDetailsProperties();
        }
        this.innerProperties().withFailed(failed);
        return this;
    }

    /**
     * Get the failedTests property: A list of tests that failed in the validation.
     * 
     * @return the failedTests value.
     */
    public List<VnetValidationTestFailure> failedTests() {
        return this.innerProperties() == null ? null : this.innerProperties().failedTests();
    }

    /**
     * Set the failedTests property: A list of tests that failed in the validation.
     * 
     * @param failedTests the failedTests value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailedTests(List<VnetValidationTestFailure> failedTests) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationFailureDetailsProperties();
        }
        this.innerProperties().withFailedTests(failedTests);
        return this;
    }

    /**
     * Get the warnings property: A list of warnings generated during validation.
     * 
     * @return the warnings value.
     */
    public List<VnetValidationTestFailure> warnings() {
        return this.innerProperties() == null ? null : this.innerProperties().warnings();
    }

    /**
     * Set the warnings property: A list of warnings generated during validation.
     * 
     * @param warnings the warnings value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withWarnings(List<VnetValidationTestFailure> warnings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetValidationFailureDetailsProperties();
        }
        this.innerProperties().withWarnings(warnings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
