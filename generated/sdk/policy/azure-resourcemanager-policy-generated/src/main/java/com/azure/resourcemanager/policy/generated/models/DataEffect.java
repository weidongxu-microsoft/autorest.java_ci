// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The data effect definition. */
@Fluent
public final class DataEffect {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataEffect.class);

    /*
     * The data effect name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The data effect details schema.
     */
    @JsonProperty(value = "detailsSchema")
    private Object detailsSchema;

    /**
     * Get the name property: The data effect name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The data effect name.
     *
     * @param name the name value to set.
     * @return the DataEffect object itself.
     */
    public DataEffect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the detailsSchema property: The data effect details schema.
     *
     * @return the detailsSchema value.
     */
    public Object detailsSchema() {
        return this.detailsSchema;
    }

    /**
     * Set the detailsSchema property: The data effect details schema.
     *
     * @param detailsSchema the detailsSchema value to set.
     * @return the DataEffect object itself.
     */
    public DataEffect withDetailsSchema(Object detailsSchema) {
        this.detailsSchema = detailsSchema;
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
