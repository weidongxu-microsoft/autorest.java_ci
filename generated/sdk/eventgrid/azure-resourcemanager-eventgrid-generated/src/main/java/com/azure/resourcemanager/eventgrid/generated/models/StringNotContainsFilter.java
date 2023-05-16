// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** StringNotContains Filter. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType")
@JsonTypeName("StringNotContains")
@Fluent
public final class StringNotContainsFilter extends Filter {
    /*
     * The set of filter values.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /** Creates an instance of StringNotContainsFilter class. */
    public StringNotContainsFilter() {
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
     * @return the StringNotContainsFilter object itself.
     */
    public StringNotContainsFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StringNotContainsFilter withKey(String key) {
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
