// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IsNotNull Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = IsNotNullFilter.class,
    visible = true)
@JsonTypeName("IsNotNull")
@Fluent
public final class IsNotNullFilter extends Filter {
    /**
     * Creates an instance of IsNotNullFilter class.
     */
    public IsNotNullFilter() {
        withOperatorType(FilterOperatorType.IS_NOT_NULL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsNotNullFilter withKey(String key) {
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
