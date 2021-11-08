// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto clusters operation response. */
@Fluent
public final class ClusterListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterListResult.class);

    /*
     * The list of Kusto clusters.
     */
    @JsonProperty(value = "value")
    private List<ClusterInner> value;

    /**
     * Get the value property: The list of Kusto clusters.
     *
     * @return the value value.
     */
    public List<ClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto clusters.
     *
     * @param value the value value to set.
     * @return the ClusterListResult object itself.
     */
    public ClusterListResult withValue(List<ClusterInner> value) {
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
