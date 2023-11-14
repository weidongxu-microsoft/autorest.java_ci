// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name value pair.
 */
@Fluent
public final class NameValuePair {
    /*
     * Pair name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Pair value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of NameValuePair class.
     */
    public NameValuePair() {
    }

    /**
     * Get the name property: Pair name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Pair name.
     * 
     * @param name the name value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Pair value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Pair value.
     * 
     * @param value the value value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
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
