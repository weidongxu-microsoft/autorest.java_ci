// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IsNullOrUndefined Advanced Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = IsNullOrUndefinedAdvancedFilter.class,
    visible = true)
@JsonTypeName("IsNullOrUndefined")
@Fluent
public final class IsNullOrUndefinedAdvancedFilter extends AdvancedFilter {
    /**
     * Creates an instance of IsNullOrUndefinedAdvancedFilter class.
     */
    public IsNullOrUndefinedAdvancedFilter() {
        withOperatorType(AdvancedFilterOperatorType.IS_NULL_OR_UNDEFINED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsNullOrUndefinedAdvancedFilter withKey(String key) {
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
