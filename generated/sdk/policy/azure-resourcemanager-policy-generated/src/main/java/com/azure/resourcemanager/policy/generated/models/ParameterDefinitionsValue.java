// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The definition of a parameter that can be provided to the policy. */
@Fluent
public final class ParameterDefinitionsValue {
    /*
     * The data type of the parameter.
     */
    @JsonProperty(value = "type")
    private ParameterType type;

    /*
     * The allowed values for the parameter.
     */
    @JsonProperty(value = "allowedValues")
    private List<Object> allowedValues;

    /*
     * The default value for the parameter if no value is provided.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /*
     * General metadata for the parameter.
     */
    @JsonProperty(value = "metadata")
    private ParameterDefinitionsValueMetadata metadata;

    /**
     * Get the type property: The data type of the parameter.
     *
     * @return the type value.
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: The data type of the parameter.
     *
     * @param type the type value to set.
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the allowedValues property: The allowed values for the parameter.
     *
     * @return the allowedValues value.
     */
    public List<Object> allowedValues() {
        return this.allowedValues;
    }

    /**
     * Set the allowedValues property: The allowed values for the parameter.
     *
     * @param allowedValues the allowedValues value to set.
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * Get the defaultValue property: The default value for the parameter if no value is provided.
     *
     * @return the defaultValue value.
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: The default value for the parameter if no value is provided.
     *
     * @param defaultValue the defaultValue value to set.
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get the metadata property: General metadata for the parameter.
     *
     * @return the metadata value.
     */
    public ParameterDefinitionsValueMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: General metadata for the parameter.
     *
     * @param metadata the metadata value to set.
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withMetadata(ParameterDefinitionsValueMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
    }
}
