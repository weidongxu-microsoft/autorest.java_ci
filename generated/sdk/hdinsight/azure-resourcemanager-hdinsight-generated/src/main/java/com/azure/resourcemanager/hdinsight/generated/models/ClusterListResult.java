// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.ClusterInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Cluster operation response. */
@Fluent
public final class ClusterListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterListResult.class);

    /*
     * The list of Clusters.
     */
    @JsonProperty(value = "value")
    private List<ClusterInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of Clusters.
     *
     * @return the value value.
     */
    public List<ClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Clusters.
     *
     * @param value the value value to set.
     * @return the ClusterListResult object itself.
     */
    public ClusterListResult withValue(List<ClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
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
