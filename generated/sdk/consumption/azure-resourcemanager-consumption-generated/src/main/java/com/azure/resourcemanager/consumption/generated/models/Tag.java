// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The tag resource.
 */
@Fluent
public final class Tag {
    /*
     * Tag key.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * Tag values.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /**
     * Creates an instance of Tag class.
     */
    public Tag() {
    }

    /**
     * Get the key property: Tag key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Tag key.
     * 
     * @param key the key value to set.
     * @return the Tag object itself.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Tag values.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: Tag values.
     * 
     * @param value the value value to set.
     * @return the Tag object itself.
     */
    public Tag withValue(List<String> value) {
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
