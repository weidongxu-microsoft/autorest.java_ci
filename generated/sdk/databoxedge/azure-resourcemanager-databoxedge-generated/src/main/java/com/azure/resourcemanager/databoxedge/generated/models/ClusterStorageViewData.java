// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cluster Storage Data.
 */
@Fluent
public final class ClusterStorageViewData {
    /*
     * Total storage on the cluster in MB.
     */
    @JsonProperty(value = "clusterTotalStorageMb")
    private Double clusterTotalStorageMb;

    /*
     * The available or free storage on the cluster in MB.
     */
    @JsonProperty(value = "clusterFreeStorageMb")
    private Double clusterFreeStorageMb;

    /**
     * Creates an instance of ClusterStorageViewData class.
     */
    public ClusterStorageViewData() {
    }

    /**
     * Get the clusterTotalStorageMb property: Total storage on the cluster in MB.
     * 
     * @return the clusterTotalStorageMb value.
     */
    public Double clusterTotalStorageMb() {
        return this.clusterTotalStorageMb;
    }

    /**
     * Set the clusterTotalStorageMb property: Total storage on the cluster in MB.
     * 
     * @param clusterTotalStorageMb the clusterTotalStorageMb value to set.
     * @return the ClusterStorageViewData object itself.
     */
    public ClusterStorageViewData withClusterTotalStorageMb(Double clusterTotalStorageMb) {
        this.clusterTotalStorageMb = clusterTotalStorageMb;
        return this;
    }

    /**
     * Get the clusterFreeStorageMb property: The available or free storage on the cluster in MB.
     * 
     * @return the clusterFreeStorageMb value.
     */
    public Double clusterFreeStorageMb() {
        return this.clusterFreeStorageMb;
    }

    /**
     * Set the clusterFreeStorageMb property: The available or free storage on the cluster in MB.
     * 
     * @param clusterFreeStorageMb the clusterFreeStorageMb value to set.
     * @return the ClusterStorageViewData object itself.
     */
    public ClusterStorageViewData withClusterFreeStorageMb(Double clusterFreeStorageMb) {
        this.clusterFreeStorageMb = clusterFreeStorageMb;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
