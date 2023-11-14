// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ArmDisasterRecoveryInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of the List Alias(Disaster Recovery configuration) operation.
 */
@Fluent
public final class ArmDisasterRecoveryListResult {
    /*
     * List of Alias(Disaster Recovery configurations)
     */
    @JsonProperty(value = "value")
    private List<ArmDisasterRecoveryInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of Alias(Disaster Recovery
     * configuration)
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ArmDisasterRecoveryListResult class.
     */
    public ArmDisasterRecoveryListResult() {
    }

    /**
     * Get the value property: List of Alias(Disaster Recovery configurations).
     * 
     * @return the value value.
     */
    public List<ArmDisasterRecoveryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Alias(Disaster Recovery configurations).
     * 
     * @param value the value value to set.
     * @return the ArmDisasterRecoveryListResult object itself.
     */
    public ArmDisasterRecoveryListResult withValue(List<ArmDisasterRecoveryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Alias(Disaster Recovery configuration).
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
