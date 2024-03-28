// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BoolEquals Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = BoolEqualsFilter.class,
    visible = true)
@JsonTypeName("BoolEquals")
@Fluent
public final class BoolEqualsFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    @JsonTypeId
    @JsonProperty(value = "operatorType", required = true)
    private FilterOperatorType operatorType = FilterOperatorType.BOOL_EQUALS;

    /*
     * The boolean filter value.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Creates an instance of BoolEqualsFilter class.
     */
    public BoolEqualsFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public FilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the value property: The boolean filter value.
     * 
     * @return the value value.
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value property: The boolean filter value.
     * 
     * @param value the value value to set.
     * @return the BoolEqualsFilter object itself.
     */
    public BoolEqualsFilter withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoolEqualsFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
