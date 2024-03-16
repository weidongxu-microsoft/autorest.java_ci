// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IIS handler mappings used to define which handler processes HTTP requests with certain extension. 
 * For example, it is used to configure php-cgi.exe process to handle all HTTP requests with *.php extension.
 */
@Fluent
public final class HandlerMapping {
    /*
     * Requests with this extension will be handled using the specified FastCGI application.
     */
    @JsonProperty(value = "extension")
    private String extension;

    /*
     * The absolute path to the FastCGI application.
     */
    @JsonProperty(value = "scriptProcessor")
    private String scriptProcessor;

    /*
     * Command-line arguments to be passed to the script processor.
     */
    @JsonProperty(value = "arguments")
    private String arguments;

    /**
     * Creates an instance of HandlerMapping class.
     */
    public HandlerMapping() {
    }

    /**
     * Get the extension property: Requests with this extension will be handled using the specified FastCGI application.
     * 
     * @return the extension value.
     */
    public String extension() {
        return this.extension;
    }

    /**
     * Set the extension property: Requests with this extension will be handled using the specified FastCGI application.
     * 
     * @param extension the extension value to set.
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Get the scriptProcessor property: The absolute path to the FastCGI application.
     * 
     * @return the scriptProcessor value.
     */
    public String scriptProcessor() {
        return this.scriptProcessor;
    }

    /**
     * Set the scriptProcessor property: The absolute path to the FastCGI application.
     * 
     * @param scriptProcessor the scriptProcessor value to set.
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withScriptProcessor(String scriptProcessor) {
        this.scriptProcessor = scriptProcessor;
        return this;
    }

    /**
     * Get the arguments property: Command-line arguments to be passed to the script processor.
     * 
     * @return the arguments value.
     */
    public String arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: Command-line arguments to be passed to the script processor.
     * 
     * @param arguments the arguments value to set.
     * @return the HandlerMapping object itself.
     */
    public HandlerMapping withArguments(String arguments) {
        this.arguments = arguments;
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
