// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configure disk config assessment for databases in your SQL virtual machine.
 */
@Fluent
public final class DiskConfigAssessmentRequest {
    /*
     * Boolean to run disk config Assessment. Use false to fetch past Assessment.
     */
    @JsonProperty(value = "runDiskConfigRules")
    private Boolean runDiskConfigRules;

    /**
     * Creates an instance of DiskConfigAssessmentRequest class.
     */
    public DiskConfigAssessmentRequest() {
    }

    /**
     * Get the runDiskConfigRules property: Boolean to run disk config Assessment. Use false to fetch past Assessment.
     * 
     * @return the runDiskConfigRules value.
     */
    public Boolean runDiskConfigRules() {
        return this.runDiskConfigRules;
    }

    /**
     * Set the runDiskConfigRules property: Boolean to run disk config Assessment. Use false to fetch past Assessment.
     * 
     * @param runDiskConfigRules the runDiskConfigRules value to set.
     * @return the DiskConfigAssessmentRequest object itself.
     */
    public DiskConfigAssessmentRequest withRunDiskConfigRules(Boolean runDiskConfigRules) {
        this.runDiskConfigRules = runDiskConfigRules;
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