// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurekusto.generated.models.DataConnectionValidationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto data connection validation result. */
@Fluent
public final class DataConnectionValidationListResultInner {
    /*
     * The list of Kusto data connection validation errors.
     */
    @JsonProperty(value = "value")
    private List<DataConnectionValidationResult> value;

    /**
     * Get the value property: The list of Kusto data connection validation errors.
     *
     * @return the value value.
     */
    public List<DataConnectionValidationResult> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto data connection validation errors.
     *
     * @param value the value value to set.
     * @return the DataConnectionValidationListResultInner object itself.
     */
    public DataConnectionValidationListResultInner withValue(List<DataConnectionValidationResult> value) {
        this.value = value;
        return this;
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
