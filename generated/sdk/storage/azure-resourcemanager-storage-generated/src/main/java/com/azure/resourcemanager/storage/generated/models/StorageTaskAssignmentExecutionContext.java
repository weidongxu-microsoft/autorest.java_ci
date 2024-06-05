// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Execution context of the storage task assignment.
 */
@Fluent
public final class StorageTaskAssignmentExecutionContext {
    /*
     * Execution target of the storage task assignment
     */
    @JsonProperty(value = "target")
    private ExecutionTarget target;

    /*
     * Execution trigger of the storage task assignment
     */
    @JsonProperty(value = "trigger", required = true)
    private ExecutionTrigger trigger;

    /**
     * Creates an instance of StorageTaskAssignmentExecutionContext class.
     */
    public StorageTaskAssignmentExecutionContext() {
    }

    /**
     * Get the target property: Execution target of the storage task assignment.
     * 
     * @return the target value.
     */
    public ExecutionTarget target() {
        return this.target;
    }

    /**
     * Set the target property: Execution target of the storage task assignment.
     * 
     * @param target the target value to set.
     * @return the StorageTaskAssignmentExecutionContext object itself.
     */
    public StorageTaskAssignmentExecutionContext withTarget(ExecutionTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get the trigger property: Execution trigger of the storage task assignment.
     * 
     * @return the trigger value.
     */
    public ExecutionTrigger trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Execution trigger of the storage task assignment.
     * 
     * @param trigger the trigger value to set.
     * @return the StorageTaskAssignmentExecutionContext object itself.
     */
    public StorageTaskAssignmentExecutionContext withTrigger(ExecutionTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
        if (trigger() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property trigger in model StorageTaskAssignmentExecutionContext"));
        } else {
            trigger().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageTaskAssignmentExecutionContext.class);
}
