// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The class to specify one track property condition. */
@Fluent
public final class FilterTrackPropertyCondition {
    /*
     * The track property type.
     */
    @JsonProperty(value = "property", required = true)
    private FilterTrackPropertyType property;

    /*
     * The track property value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * The track property condition operation.
     */
    @JsonProperty(value = "operation", required = true)
    private FilterTrackPropertyCompareOperation operation;

    /**
     * Get the property property: The track property type.
     *
     * @return the property value.
     */
    public FilterTrackPropertyType property() {
        return this.property;
    }

    /**
     * Set the property property: The track property type.
     *
     * @param property the property value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withProperty(FilterTrackPropertyType property) {
        this.property = property;
        return this;
    }

    /**
     * Get the value property: The track property value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The track property value.
     *
     * @param value the value value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the operation property: The track property condition operation.
     *
     * @return the operation value.
     */
    public FilterTrackPropertyCompareOperation operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The track property condition operation.
     *
     * @param operation the operation value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withOperation(FilterTrackPropertyCompareOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (property() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property property in model FilterTrackPropertyCondition"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model FilterTrackPropertyCondition"));
        }
        if (operation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operation in model FilterTrackPropertyCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilterTrackPropertyCondition.class);
}
