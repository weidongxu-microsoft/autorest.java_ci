// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Indicates the error details if the background copy of a resource created via the CopyStart operation fails.
 */
@Fluent
public final class CopyCompletionError {
    /*
     * Indicates the error code if the background copy of a resource created via the CopyStart operation fails.
     */
    @JsonProperty(value = "errorCode", required = true)
    private CopyCompletionErrorReason errorCode;

    /*
     * Indicates the error message if the background copy of a resource created via the CopyStart operation fails.
     */
    @JsonProperty(value = "errorMessage", required = true)
    private String errorMessage;

    /**
     * Creates an instance of CopyCompletionError class.
     */
    public CopyCompletionError() {
    }

    /**
     * Get the errorCode property: Indicates the error code if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @return the errorCode value.
     */
    public CopyCompletionErrorReason errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Indicates the error code if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @param errorCode the errorCode value to set.
     * @return the CopyCompletionError object itself.
     */
    public CopyCompletionError withErrorCode(CopyCompletionErrorReason errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Indicates the error message if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Indicates the error message if the background copy of a resource created via the
     * CopyStart operation fails.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the CopyCompletionError object itself.
     */
    public CopyCompletionError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorCode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property errorCode in model CopyCompletionError"));
        }
        if (errorMessage() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property errorMessage in model CopyCompletionError"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CopyCompletionError.class);
}
