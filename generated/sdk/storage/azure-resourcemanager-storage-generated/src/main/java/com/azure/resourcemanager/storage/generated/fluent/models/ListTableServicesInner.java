// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListTableServices model. */
@Immutable
public final class ListTableServicesInner {
    /*
     * List of table services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<TableServicePropertiesInner> value;

    /** Creates an instance of ListTableServicesInner class. */
    public ListTableServicesInner() {
    }

    /**
     * Get the value property: List of table services returned.
     *
     * @return the value value.
     */
    public List<TableServicePropertiesInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
