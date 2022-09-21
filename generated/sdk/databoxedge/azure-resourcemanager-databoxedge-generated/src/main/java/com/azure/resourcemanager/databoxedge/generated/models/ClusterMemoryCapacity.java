// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NodeCapacityInfo defines the required information to determine the placement of a VM. */
@Fluent
public final class ClusterMemoryCapacity {
    /*
     * The free memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterFreeMemoryMb")
    private Double clusterFreeMemoryMb;

    /*
     * The used memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterUsedMemoryMb")
    private Double clusterUsedMemoryMb;

    /*
     * The failover memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterFailoverMemoryMb")
    private Double clusterFailoverMemoryMb;

    /*
     * The fragmentation memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterFragmentationMemoryMb")
    private Double clusterFragmentationMemoryMb;

    /*
     * The memory reserved for Hyper-V in the cluster in MB.
     */
    @JsonProperty(value = "clusterHypervReserveMemoryMb")
    private Double clusterHypervReserveMemoryMb;

    /*
     * The memory of the Infra VM in the cluster in MB.
     */
    @JsonProperty(value = "clusterInfraVmMemoryMb")
    private Double clusterInfraVmMemoryMb;

    /*
     * The total memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterTotalMemoryMb")
    private Double clusterTotalMemoryMb;

    /*
     * The non-failover memory in the cluster in MB.
     */
    @JsonProperty(value = "clusterNonFailoverVmMb")
    private Double clusterNonFailoverVmMb;

    /*
     * The memory used by VMs in the cluster in MB.
     */
    @JsonProperty(value = "clusterMemoryUsedByVmsMb")
    private Double clusterMemoryUsedByVmsMb;

    /** Creates an instance of ClusterMemoryCapacity class. */
    public ClusterMemoryCapacity() {
    }

    /**
     * Get the clusterFreeMemoryMb property: The free memory in the cluster in MB.
     *
     * @return the clusterFreeMemoryMb value.
     */
    public Double clusterFreeMemoryMb() {
        return this.clusterFreeMemoryMb;
    }

    /**
     * Set the clusterFreeMemoryMb property: The free memory in the cluster in MB.
     *
     * @param clusterFreeMemoryMb the clusterFreeMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterFreeMemoryMb(Double clusterFreeMemoryMb) {
        this.clusterFreeMemoryMb = clusterFreeMemoryMb;
        return this;
    }

    /**
     * Get the clusterUsedMemoryMb property: The used memory in the cluster in MB.
     *
     * @return the clusterUsedMemoryMb value.
     */
    public Double clusterUsedMemoryMb() {
        return this.clusterUsedMemoryMb;
    }

    /**
     * Set the clusterUsedMemoryMb property: The used memory in the cluster in MB.
     *
     * @param clusterUsedMemoryMb the clusterUsedMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterUsedMemoryMb(Double clusterUsedMemoryMb) {
        this.clusterUsedMemoryMb = clusterUsedMemoryMb;
        return this;
    }

    /**
     * Get the clusterFailoverMemoryMb property: The failover memory in the cluster in MB.
     *
     * @return the clusterFailoverMemoryMb value.
     */
    public Double clusterFailoverMemoryMb() {
        return this.clusterFailoverMemoryMb;
    }

    /**
     * Set the clusterFailoverMemoryMb property: The failover memory in the cluster in MB.
     *
     * @param clusterFailoverMemoryMb the clusterFailoverMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterFailoverMemoryMb(Double clusterFailoverMemoryMb) {
        this.clusterFailoverMemoryMb = clusterFailoverMemoryMb;
        return this;
    }

    /**
     * Get the clusterFragmentationMemoryMb property: The fragmentation memory in the cluster in MB.
     *
     * @return the clusterFragmentationMemoryMb value.
     */
    public Double clusterFragmentationMemoryMb() {
        return this.clusterFragmentationMemoryMb;
    }

    /**
     * Set the clusterFragmentationMemoryMb property: The fragmentation memory in the cluster in MB.
     *
     * @param clusterFragmentationMemoryMb the clusterFragmentationMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterFragmentationMemoryMb(Double clusterFragmentationMemoryMb) {
        this.clusterFragmentationMemoryMb = clusterFragmentationMemoryMb;
        return this;
    }

    /**
     * Get the clusterHypervReserveMemoryMb property: The memory reserved for Hyper-V in the cluster in MB.
     *
     * @return the clusterHypervReserveMemoryMb value.
     */
    public Double clusterHypervReserveMemoryMb() {
        return this.clusterHypervReserveMemoryMb;
    }

    /**
     * Set the clusterHypervReserveMemoryMb property: The memory reserved for Hyper-V in the cluster in MB.
     *
     * @param clusterHypervReserveMemoryMb the clusterHypervReserveMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterHypervReserveMemoryMb(Double clusterHypervReserveMemoryMb) {
        this.clusterHypervReserveMemoryMb = clusterHypervReserveMemoryMb;
        return this;
    }

    /**
     * Get the clusterInfraVmMemoryMb property: The memory of the Infra VM in the cluster in MB.
     *
     * @return the clusterInfraVmMemoryMb value.
     */
    public Double clusterInfraVmMemoryMb() {
        return this.clusterInfraVmMemoryMb;
    }

    /**
     * Set the clusterInfraVmMemoryMb property: The memory of the Infra VM in the cluster in MB.
     *
     * @param clusterInfraVmMemoryMb the clusterInfraVmMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterInfraVmMemoryMb(Double clusterInfraVmMemoryMb) {
        this.clusterInfraVmMemoryMb = clusterInfraVmMemoryMb;
        return this;
    }

    /**
     * Get the clusterTotalMemoryMb property: The total memory in the cluster in MB.
     *
     * @return the clusterTotalMemoryMb value.
     */
    public Double clusterTotalMemoryMb() {
        return this.clusterTotalMemoryMb;
    }

    /**
     * Set the clusterTotalMemoryMb property: The total memory in the cluster in MB.
     *
     * @param clusterTotalMemoryMb the clusterTotalMemoryMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterTotalMemoryMb(Double clusterTotalMemoryMb) {
        this.clusterTotalMemoryMb = clusterTotalMemoryMb;
        return this;
    }

    /**
     * Get the clusterNonFailoverVmMb property: The non-failover memory in the cluster in MB.
     *
     * @return the clusterNonFailoverVmMb value.
     */
    public Double clusterNonFailoverVmMb() {
        return this.clusterNonFailoverVmMb;
    }

    /**
     * Set the clusterNonFailoverVmMb property: The non-failover memory in the cluster in MB.
     *
     * @param clusterNonFailoverVmMb the clusterNonFailoverVmMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterNonFailoverVmMb(Double clusterNonFailoverVmMb) {
        this.clusterNonFailoverVmMb = clusterNonFailoverVmMb;
        return this;
    }

    /**
     * Get the clusterMemoryUsedByVmsMb property: The memory used by VMs in the cluster in MB.
     *
     * @return the clusterMemoryUsedByVmsMb value.
     */
    public Double clusterMemoryUsedByVmsMb() {
        return this.clusterMemoryUsedByVmsMb;
    }

    /**
     * Set the clusterMemoryUsedByVmsMb property: The memory used by VMs in the cluster in MB.
     *
     * @param clusterMemoryUsedByVmsMb the clusterMemoryUsedByVmsMb value to set.
     * @return the ClusterMemoryCapacity object itself.
     */
    public ClusterMemoryCapacity withClusterMemoryUsedByVmsMb(Double clusterMemoryUsedByVmsMb) {
        this.clusterMemoryUsedByVmsMb = clusterMemoryUsedByVmsMb;
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
