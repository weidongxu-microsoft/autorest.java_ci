// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.generated.models.AsyncOperationState;
import com.azure.resourcemanager.hdinsight.generated.models.Errors;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The azure async operation response.
 */
@Fluent
public final class AsyncOperationResultInner {
    /*
     * The async operation state.
     */
    @JsonProperty(value = "status")
    private AsyncOperationState status;

    /*
     * The operation error information.
     */
    @JsonProperty(value = "error")
    private Errors error;

    /**
     * Creates an instance of AsyncOperationResultInner class.
     */
    public AsyncOperationResultInner() {
    }

    /**
     * Get the status property: The async operation state.
     * 
     * @return the status value.
     */
    public AsyncOperationState status() {
        return this.status;
    }

    /**
     * Set the status property: The async operation state.
     * 
     * @param status the status value to set.
     * @return the AsyncOperationResultInner object itself.
     */
    public AsyncOperationResultInner withStatus(AsyncOperationState status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: The operation error information.
     * 
     * @return the error value.
     */
    public Errors error() {
        return this.error;
    }

    /**
     * Set the error property: The operation error information.
     * 
     * @param error the error value to set.
     * @return the AsyncOperationResultInner object itself.
     */
    public AsyncOperationResultInner withError(Errors error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
