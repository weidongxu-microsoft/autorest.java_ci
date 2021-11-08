// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Kubernetes role compute resource. */
@Fluent
public final class KubernetesRoleCompute {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubernetesRoleCompute.class);

    /*
     * VM profile
     */
    @JsonProperty(value = "vmProfile", required = true)
    private String vmProfile;

    /*
     * Memory in bytes
     */
    @JsonProperty(value = "memoryInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long memoryInBytes;

    /*
     * Processor count
     */
    @JsonProperty(value = "processorCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer processorCount;

    /**
     * Get the vmProfile property: VM profile.
     *
     * @return the vmProfile value.
     */
    public String vmProfile() {
        return this.vmProfile;
    }

    /**
     * Set the vmProfile property: VM profile.
     *
     * @param vmProfile the vmProfile value to set.
     * @return the KubernetesRoleCompute object itself.
     */
    public KubernetesRoleCompute withVmProfile(String vmProfile) {
        this.vmProfile = vmProfile;
        return this;
    }

    /**
     * Get the memoryInBytes property: Memory in bytes.
     *
     * @return the memoryInBytes value.
     */
    public Long memoryInBytes() {
        return this.memoryInBytes;
    }

    /**
     * Get the processorCount property: Processor count.
     *
     * @return the processorCount value.
     */
    public Integer processorCount() {
        return this.processorCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmProfile() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property vmProfile in model KubernetesRoleCompute"));
        }
    }
}
