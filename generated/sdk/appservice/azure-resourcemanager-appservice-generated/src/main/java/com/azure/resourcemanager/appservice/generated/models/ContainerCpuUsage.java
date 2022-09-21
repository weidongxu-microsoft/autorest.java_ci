// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ContainerCpuUsage model. */
@Fluent
public final class ContainerCpuUsage {
    /*
     * The totalUsage property.
     */
    @JsonProperty(value = "totalUsage")
    private Long totalUsage;

    /*
     * The perCpuUsage property.
     */
    @JsonProperty(value = "perCpuUsage")
    private List<Long> perCpuUsage;

    /*
     * The kernelModeUsage property.
     */
    @JsonProperty(value = "kernelModeUsage")
    private Long kernelModeUsage;

    /*
     * The userModeUsage property.
     */
    @JsonProperty(value = "userModeUsage")
    private Long userModeUsage;

    /** Creates an instance of ContainerCpuUsage class. */
    public ContainerCpuUsage() {
    }

    /**
     * Get the totalUsage property: The totalUsage property.
     *
     * @return the totalUsage value.
     */
    public Long totalUsage() {
        return this.totalUsage;
    }

    /**
     * Set the totalUsage property: The totalUsage property.
     *
     * @param totalUsage the totalUsage value to set.
     * @return the ContainerCpuUsage object itself.
     */
    public ContainerCpuUsage withTotalUsage(Long totalUsage) {
        this.totalUsage = totalUsage;
        return this;
    }

    /**
     * Get the perCpuUsage property: The perCpuUsage property.
     *
     * @return the perCpuUsage value.
     */
    public List<Long> perCpuUsage() {
        return this.perCpuUsage;
    }

    /**
     * Set the perCpuUsage property: The perCpuUsage property.
     *
     * @param perCpuUsage the perCpuUsage value to set.
     * @return the ContainerCpuUsage object itself.
     */
    public ContainerCpuUsage withPerCpuUsage(List<Long> perCpuUsage) {
        this.perCpuUsage = perCpuUsage;
        return this;
    }

    /**
     * Get the kernelModeUsage property: The kernelModeUsage property.
     *
     * @return the kernelModeUsage value.
     */
    public Long kernelModeUsage() {
        return this.kernelModeUsage;
    }

    /**
     * Set the kernelModeUsage property: The kernelModeUsage property.
     *
     * @param kernelModeUsage the kernelModeUsage value to set.
     * @return the ContainerCpuUsage object itself.
     */
    public ContainerCpuUsage withKernelModeUsage(Long kernelModeUsage) {
        this.kernelModeUsage = kernelModeUsage;
        return this;
    }

    /**
     * Get the userModeUsage property: The userModeUsage property.
     *
     * @return the userModeUsage value.
     */
    public Long userModeUsage() {
        return this.userModeUsage;
    }

    /**
     * Set the userModeUsage property: The userModeUsage property.
     *
     * @param userModeUsage the userModeUsage value to set.
     * @return the ContainerCpuUsage object itself.
     */
    public ContainerCpuUsage withUserModeUsage(Long userModeUsage) {
        this.userModeUsage = userModeUsage;
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
