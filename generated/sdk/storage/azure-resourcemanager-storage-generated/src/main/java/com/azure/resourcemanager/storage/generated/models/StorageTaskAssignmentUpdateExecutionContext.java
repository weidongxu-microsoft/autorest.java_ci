// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Execution context of the storage task assignment update.
 */
@Fluent
public final class StorageTaskAssignmentUpdateExecutionContext {
    /*
     * Execution target of the storage task assignment
     */
    @JsonProperty(value = "target")
    private ExecutionTargetUpdate target;

    /*
     * Execution trigger of the storage task assignment
     */
    @JsonProperty(value = "trigger")
    private ExecutionTriggerUpdate trigger;

    /**
     * Creates an instance of StorageTaskAssignmentUpdateExecutionContext class.
     */
    public StorageTaskAssignmentUpdateExecutionContext() {
    }

    /**
     * Get the target property: Execution target of the storage task assignment.
     * 
     * @return the target value.
     */
    public ExecutionTargetUpdate target() {
        return this.target;
    }

    /**
     * Set the target property: Execution target of the storage task assignment.
     * 
     * @param target the target value to set.
     * @return the StorageTaskAssignmentUpdateExecutionContext object itself.
     */
    public StorageTaskAssignmentUpdateExecutionContext withTarget(ExecutionTargetUpdate target) {
        this.target = target;
        return this;
    }

    /**
     * Get the trigger property: Execution trigger of the storage task assignment.
     * 
     * @return the trigger value.
     */
    public ExecutionTriggerUpdate trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Execution trigger of the storage task assignment.
     * 
     * @param trigger the trigger value to set.
     * @return the StorageTaskAssignmentUpdateExecutionContext object itself.
     */
    public StorageTaskAssignmentUpdateExecutionContext withTrigger(ExecutionTriggerUpdate trigger) {
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
        if (trigger() != null) {
            trigger().validate();
        }
    }
}