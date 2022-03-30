// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.models.ClusterCapacityViewData;
import com.azure.resourcemanager.databoxedge.generated.models.ClusterStorageViewData;
import com.azure.resourcemanager.databoxedge.generated.models.HostCapacity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The properties of Device Capacity Info. */
@Fluent
public final class DeviceCapacityInfoProperties {
    /*
     * Timestamp of request in UTC
     */
    @JsonProperty(value = "timeStamp")
    private OffsetDateTime timestamp;

    /*
     * Cluster capacity data for storage resources (CSV).
     */
    @JsonProperty(value = "clusterStorageCapacityInfo")
    private ClusterStorageViewData clusterStorageCapacityInfo;

    /*
     * Cluster capacity data for compute resources (Memory and GPU).
     */
    @JsonProperty(value = "clusterComputeCapacityInfo")
    private ClusterCapacityViewData clusterComputeCapacityInfo;

    /*
     * The dictionary of individual node names and node capacities in the
     * cluster.
     */
    @JsonProperty(value = "nodeCapacityInfos")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, HostCapacity> nodeCapacityInfos;

    /**
     * Get the timestamp property: Timestamp of request in UTC.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: Timestamp of request in UTC.
     *
     * @param timestamp the timestamp value to set.
     * @return the DeviceCapacityInfoProperties object itself.
     */
    public DeviceCapacityInfoProperties withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the clusterStorageCapacityInfo property: Cluster capacity data for storage resources (CSV).
     *
     * @return the clusterStorageCapacityInfo value.
     */
    public ClusterStorageViewData clusterStorageCapacityInfo() {
        return this.clusterStorageCapacityInfo;
    }

    /**
     * Set the clusterStorageCapacityInfo property: Cluster capacity data for storage resources (CSV).
     *
     * @param clusterStorageCapacityInfo the clusterStorageCapacityInfo value to set.
     * @return the DeviceCapacityInfoProperties object itself.
     */
    public DeviceCapacityInfoProperties withClusterStorageCapacityInfo(
        ClusterStorageViewData clusterStorageCapacityInfo) {
        this.clusterStorageCapacityInfo = clusterStorageCapacityInfo;
        return this;
    }

    /**
     * Get the clusterComputeCapacityInfo property: Cluster capacity data for compute resources (Memory and GPU).
     *
     * @return the clusterComputeCapacityInfo value.
     */
    public ClusterCapacityViewData clusterComputeCapacityInfo() {
        return this.clusterComputeCapacityInfo;
    }

    /**
     * Set the clusterComputeCapacityInfo property: Cluster capacity data for compute resources (Memory and GPU).
     *
     * @param clusterComputeCapacityInfo the clusterComputeCapacityInfo value to set.
     * @return the DeviceCapacityInfoProperties object itself.
     */
    public DeviceCapacityInfoProperties withClusterComputeCapacityInfo(
        ClusterCapacityViewData clusterComputeCapacityInfo) {
        this.clusterComputeCapacityInfo = clusterComputeCapacityInfo;
        return this;
    }

    /**
     * Get the nodeCapacityInfos property: The dictionary of individual node names and node capacities in the cluster.
     *
     * @return the nodeCapacityInfos value.
     */
    public Map<String, HostCapacity> nodeCapacityInfos() {
        return this.nodeCapacityInfos;
    }

    /**
     * Set the nodeCapacityInfos property: The dictionary of individual node names and node capacities in the cluster.
     *
     * @param nodeCapacityInfos the nodeCapacityInfos value to set.
     * @return the DeviceCapacityInfoProperties object itself.
     */
    public DeviceCapacityInfoProperties withNodeCapacityInfos(Map<String, HostCapacity> nodeCapacityInfos) {
        this.nodeCapacityInfos = nodeCapacityInfos;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterStorageCapacityInfo() != null) {
            clusterStorageCapacityInfo().validate();
        }
        if (clusterComputeCapacityInfo() != null) {
            clusterComputeCapacityInfo().validate();
        }
        if (nodeCapacityInfos() != null) {
            nodeCapacityInfos()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
