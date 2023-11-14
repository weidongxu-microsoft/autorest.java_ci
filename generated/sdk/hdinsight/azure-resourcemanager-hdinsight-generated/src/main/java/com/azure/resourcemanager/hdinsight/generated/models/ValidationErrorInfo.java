// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The validation error information.
 */
@Fluent
public final class ValidationErrorInfo {
    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The error resource.
     */
    @JsonProperty(value = "errorResource")
    private String errorResource;

    /*
     * The message arguments
     */
    @JsonProperty(value = "messageArguments")
    private List<String> messageArguments;

    /**
     * Creates an instance of ValidationErrorInfo class.
     */
    public ValidationErrorInfo() {
    }

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     * 
     * @param code the code value to set.
     * @return the ValidationErrorInfo object itself.
     */
    public ValidationErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     * 
     * @param message the message value to set.
     * @return the ValidationErrorInfo object itself.
     */
    public ValidationErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorResource property: The error resource.
     * 
     * @return the errorResource value.
     */
    public String errorResource() {
        return this.errorResource;
    }

    /**
     * Set the errorResource property: The error resource.
     * 
     * @param errorResource the errorResource value to set.
     * @return the ValidationErrorInfo object itself.
     */
    public ValidationErrorInfo withErrorResource(String errorResource) {
        this.errorResource = errorResource;
        return this;
    }

    /**
     * Get the messageArguments property: The message arguments.
     * 
     * @return the messageArguments value.
     */
    public List<String> messageArguments() {
        return this.messageArguments;
    }

    /**
     * Set the messageArguments property: The message arguments.
     * 
     * @param messageArguments the messageArguments value to set.
     * @return the ValidationErrorInfo object itself.
     */
    public ValidationErrorInfo withMessageArguments(List<String> messageArguments) {
        this.messageArguments = messageArguments;
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
