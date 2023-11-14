// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.MyWorkbookInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Workbook list result.
 */
@Immutable
public final class MyWorkbooksListResult {
    /*
     * An array of private workbooks.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MyWorkbookInner> value;

    /**
     * Creates an instance of MyWorkbooksListResult class.
     */
    public MyWorkbooksListResult() {
    }

    /**
     * Get the value property: An array of private workbooks.
     * 
     * @return the value value.
     */
    public List<MyWorkbookInner> value() {
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
