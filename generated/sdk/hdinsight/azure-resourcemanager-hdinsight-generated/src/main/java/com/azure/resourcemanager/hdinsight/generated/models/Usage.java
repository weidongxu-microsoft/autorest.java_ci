// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details about the usage of a particular limited resource. */
@Fluent
public final class Usage {
    /*
     * The type of measurement for usage.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The current usage.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /*
     * The maximum allowed usage.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * The details about the localizable name of the used resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizedName name;

    /** Creates an instance of Usage class. */
    public Usage() {
    }

    /**
     * Get the unit property: The type of measurement for usage.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The type of measurement for usage.
     *
     * @param unit the unit value to set.
     * @return the Usage object itself.
     */
    public Usage withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current usage.
     *
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage.
     *
     * @param currentValue the currentValue value to set.
     * @return the Usage object itself.
     */
    public Usage withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The maximum allowed usage.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum allowed usage.
     *
     * @param limit the limit value to set.
     * @return the Usage object itself.
     */
    public Usage withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: The details about the localizable name of the used resource.
     *
     * @return the name value.
     */
    public LocalizedName name() {
        return this.name;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
