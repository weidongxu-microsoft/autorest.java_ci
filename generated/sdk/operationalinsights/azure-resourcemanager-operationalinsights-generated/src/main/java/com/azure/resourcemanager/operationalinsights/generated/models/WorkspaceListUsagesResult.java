// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.UsageMetricInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list workspace usages operation response.
 */
@Fluent
public final class WorkspaceListUsagesResult {
    /*
     * Gets or sets a list of usage metrics for a workspace.
     */
    @JsonProperty(value = "value")
    private List<UsageMetricInner> value;

    /**
     * Creates an instance of WorkspaceListUsagesResult class.
     */
    public WorkspaceListUsagesResult() {
    }

    /**
     * Get the value property: Gets or sets a list of usage metrics for a workspace.
     * 
     * @return the value value.
     */
    public List<UsageMetricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of usage metrics for a workspace.
     * 
     * @param value the value value to set.
     * @return the WorkspaceListUsagesResult object itself.
     */
    public WorkspaceListUsagesResult withValue(List<UsageMetricInner> value) {
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
