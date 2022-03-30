// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Host Capacity Data. */
@Fluent
public final class HostCapacity {
    /*
     * The name of the host.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * The available memory on the host accounting for VM placement size and
     * any host VM reservations.
     */
    @JsonProperty(value = "effectiveAvailableMemoryMbOnHost")
    private Long effectiveAvailableMemoryMbOnHost;

    /*
     * The available amount of GPUs on the host to use after accounting for
     * GPUS used by reservations on the host.
     */
    @JsonProperty(value = "availableGpuCount")
    private Integer availableGpuCount;

    /*
     * The VM used memory per VmId.
     */
    @JsonProperty(value = "vmUsedMemory")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, VmMemory> vmUsedMemory;

    /*
     * The GPU type of the VM.
     */
    @JsonProperty(value = "gpuType")
    private String gpuType;

    /*
     * The numa nodes information for Hpn VMs.
     */
    @JsonProperty(value = "numaNodesData")
    private List<NumaNodeData> numaNodesData;

    /**
     * Get the hostname property: The name of the host.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The name of the host.
     *
     * @param hostname the hostname value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the effectiveAvailableMemoryMbOnHost property: The available memory on the host accounting for VM placement
     * size and any host VM reservations.
     *
     * @return the effectiveAvailableMemoryMbOnHost value.
     */
    public Long effectiveAvailableMemoryMbOnHost() {
        return this.effectiveAvailableMemoryMbOnHost;
    }

    /**
     * Set the effectiveAvailableMemoryMbOnHost property: The available memory on the host accounting for VM placement
     * size and any host VM reservations.
     *
     * @param effectiveAvailableMemoryMbOnHost the effectiveAvailableMemoryMbOnHost value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withEffectiveAvailableMemoryMbOnHost(Long effectiveAvailableMemoryMbOnHost) {
        this.effectiveAvailableMemoryMbOnHost = effectiveAvailableMemoryMbOnHost;
        return this;
    }

    /**
     * Get the availableGpuCount property: The available amount of GPUs on the host to use after accounting for GPUS
     * used by reservations on the host.
     *
     * @return the availableGpuCount value.
     */
    public Integer availableGpuCount() {
        return this.availableGpuCount;
    }

    /**
     * Set the availableGpuCount property: The available amount of GPUs on the host to use after accounting for GPUS
     * used by reservations on the host.
     *
     * @param availableGpuCount the availableGpuCount value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withAvailableGpuCount(Integer availableGpuCount) {
        this.availableGpuCount = availableGpuCount;
        return this;
    }

    /**
     * Get the vmUsedMemory property: The VM used memory per VmId.
     *
     * @return the vmUsedMemory value.
     */
    public Map<String, VmMemory> vmUsedMemory() {
        return this.vmUsedMemory;
    }

    /**
     * Set the vmUsedMemory property: The VM used memory per VmId.
     *
     * @param vmUsedMemory the vmUsedMemory value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withVmUsedMemory(Map<String, VmMemory> vmUsedMemory) {
        this.vmUsedMemory = vmUsedMemory;
        return this;
    }

    /**
     * Get the gpuType property: The GPU type of the VM.
     *
     * @return the gpuType value.
     */
    public String gpuType() {
        return this.gpuType;
    }

    /**
     * Set the gpuType property: The GPU type of the VM.
     *
     * @param gpuType the gpuType value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * Get the numaNodesData property: The numa nodes information for Hpn VMs.
     *
     * @return the numaNodesData value.
     */
    public List<NumaNodeData> numaNodesData() {
        return this.numaNodesData;
    }

    /**
     * Set the numaNodesData property: The numa nodes information for Hpn VMs.
     *
     * @param numaNodesData the numaNodesData value to set.
     * @return the HostCapacity object itself.
     */
    public HostCapacity withNumaNodesData(List<NumaNodeData> numaNodesData) {
        this.numaNodesData = numaNodesData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmUsedMemory() != null) {
            vmUsedMemory()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (numaNodesData() != null) {
            numaNodesData().forEach(e -> e.validate());
        }
    }
}
