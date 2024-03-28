// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * StringEndsWith Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = StringEndsWithFilter.class,
    visible = true)
@JsonTypeName("StringEndsWith")
@Fluent
public final class StringEndsWithFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    @JsonTypeId
    @JsonProperty(value = "operatorType", required = true)
    private FilterOperatorType operatorType = FilterOperatorType.STRING_ENDS_WITH;

    /*
     * The set of filter values.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Creates an instance of StringEndsWithFilter class.
     */
    public StringEndsWithFilter() {
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
     * Get the values property: The set of filter values.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the StringEndsWithFilter object itself.
     */
    public StringEndsWithFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringEndsWithFilter withKey(String key) {
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
