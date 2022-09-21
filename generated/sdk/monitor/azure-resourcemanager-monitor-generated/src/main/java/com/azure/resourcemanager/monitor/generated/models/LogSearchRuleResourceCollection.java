// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a collection of Log Search rule resources. */
@Fluent
public final class LogSearchRuleResourceCollection {
    /*
     * The values for the Log Search Rule resources.
     */
    @JsonProperty(value = "value")
    private List<LogSearchRuleResourceInner> value;

    /** Creates an instance of LogSearchRuleResourceCollection class. */
    public LogSearchRuleResourceCollection() {
    }

    /**
     * Get the value property: The values for the Log Search Rule resources.
     *
     * @return the value value.
     */
    public List<LogSearchRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the Log Search Rule resources.
     *
     * @param value the value value to set.
     * @return the LogSearchRuleResourceCollection object itself.
     */
    public LogSearchRuleResourceCollection withValue(List<LogSearchRuleResourceInner> value) {
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
