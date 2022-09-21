// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.WorkItemConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Work item configuration list result. */
@Immutable
public final class WorkItemConfigurationsListResult {
    /*
     * An array of work item configurations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WorkItemConfigurationInner> value;

    /** Creates an instance of WorkItemConfigurationsListResult class. */
    public WorkItemConfigurationsListResult() {
    }

    /**
     * Get the value property: An array of work item configurations.
     *
     * @return the value value.
     */
    public List<WorkItemConfigurationInner> value() {
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
