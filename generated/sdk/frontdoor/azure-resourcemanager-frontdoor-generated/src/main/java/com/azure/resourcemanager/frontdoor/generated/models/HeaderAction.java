// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An action that can manipulate an http header.
 */
@Fluent
public final class HeaderAction {
    /*
     * Which type of manipulation to apply to the header.
     */
    @JsonProperty(value = "headerActionType", required = true)
    private HeaderActionType headerActionType;

    /*
     * The name of the header this action will apply to.
     */
    @JsonProperty(value = "headerName", required = true)
    private String headerName;

    /*
     * The value to update the given header name with. This value is not used if the actionType is Delete.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of HeaderAction class.
     */
    public HeaderAction() {
    }

    /**
     * Get the headerActionType property: Which type of manipulation to apply to the header.
     * 
     * @return the headerActionType value.
     */
    public HeaderActionType headerActionType() {
        return this.headerActionType;
    }

    /**
     * Set the headerActionType property: Which type of manipulation to apply to the header.
     * 
     * @param headerActionType the headerActionType value to set.
     * @return the HeaderAction object itself.
     */
    public HeaderAction withHeaderActionType(HeaderActionType headerActionType) {
        this.headerActionType = headerActionType;
        return this;
    }

    /**
     * Get the headerName property: The name of the header this action will apply to.
     * 
     * @return the headerName value.
     */
    public String headerName() {
        return this.headerName;
    }

    /**
     * Set the headerName property: The name of the header this action will apply to.
     * 
     * @param headerName the headerName value to set.
     * @return the HeaderAction object itself.
     */
    public HeaderAction withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Get the value property: The value to update the given header name with. This value is not used if the actionType
     * is Delete.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value to update the given header name with. This value is not used if the actionType
     * is Delete.
     * 
     * @param value the value value to set.
     * @return the HeaderAction object itself.
     */
    public HeaderAction withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (headerActionType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property headerActionType in model HeaderAction"));
        }
        if (headerName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property headerName in model HeaderAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HeaderAction.class);
}
