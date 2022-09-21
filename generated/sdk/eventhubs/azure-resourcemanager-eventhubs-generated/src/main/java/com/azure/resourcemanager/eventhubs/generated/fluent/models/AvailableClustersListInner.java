// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.generated.models.AvailableCluster;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List Available Clusters operation. */
@Fluent
public final class AvailableClustersListInner {
    /*
     * The count of readily available and pre-provisioned Event Hubs Clusters per region.
     */
    @JsonProperty(value = "value")
    private List<AvailableCluster> value;

    /** Creates an instance of AvailableClustersListInner class. */
    public AvailableClustersListInner() {
    }

    /**
     * Get the value property: The count of readily available and pre-provisioned Event Hubs Clusters per region.
     *
     * @return the value value.
     */
    public List<AvailableCluster> value() {
        return this.value;
    }

    /**
     * Set the value property: The count of readily available and pre-provisioned Event Hubs Clusters per region.
     *
     * @param value the value value to set.
     * @return the AvailableClustersListInner object itself.
     */
    public AvailableClustersListInner withValue(List<AvailableCluster> value) {
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
