// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Additional workflow properties.
 */
@Fluent
public final class WorkflowEnvelopeProperties {
    /*
     * Gets or sets the files.
     */
    @JsonProperty(value = "files")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> files;

    /*
     * Gets or sets the state of the workflow.
     */
    @JsonProperty(value = "flowState")
    private WorkflowState flowState;

    /*
     * Gets or sets workflow health.
     */
    @JsonProperty(value = "health")
    private WorkflowHealth health;

    /**
     * Creates an instance of WorkflowEnvelopeProperties class.
     */
    public WorkflowEnvelopeProperties() {
    }

    /**
     * Get the files property: Gets or sets the files.
     * 
     * @return the files value.
     */
    public Map<String, Object> files() {
        return this.files;
    }

    /**
     * Set the files property: Gets or sets the files.
     * 
     * @param files the files value to set.
     * @return the WorkflowEnvelopeProperties object itself.
     */
    public WorkflowEnvelopeProperties withFiles(Map<String, Object> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the flowState property: Gets or sets the state of the workflow.
     * 
     * @return the flowState value.
     */
    public WorkflowState flowState() {
        return this.flowState;
    }

    /**
     * Set the flowState property: Gets or sets the state of the workflow.
     * 
     * @param flowState the flowState value to set.
     * @return the WorkflowEnvelopeProperties object itself.
     */
    public WorkflowEnvelopeProperties withFlowState(WorkflowState flowState) {
        this.flowState = flowState;
        return this;
    }

    /**
     * Get the health property: Gets or sets workflow health.
     * 
     * @return the health value.
     */
    public WorkflowHealth health() {
        return this.health;
    }

    /**
     * Set the health property: Gets or sets workflow health.
     * 
     * @param health the health value to set.
     * @return the WorkflowEnvelopeProperties object itself.
     */
    public WorkflowEnvelopeProperties withHealth(WorkflowHealth health) {
        this.health = health;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (health() != null) {
            health().validate();
        }
    }
}
