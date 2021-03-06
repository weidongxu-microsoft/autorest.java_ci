// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Kubernetes role network resource. */
@Immutable
public final class KubernetesRoleNetwork {
    /*
     * Cni configuration
     */
    @JsonProperty(value = "cniConfig", access = JsonProperty.Access.WRITE_ONLY)
    private CniConfig cniConfig;

    /*
     * Load balancer configuration
     */
    @JsonProperty(value = "loadBalancerConfig", access = JsonProperty.Access.WRITE_ONLY)
    private LoadBalancerConfig loadBalancerConfig;

    /**
     * Get the cniConfig property: Cni configuration.
     *
     * @return the cniConfig value.
     */
    public CniConfig cniConfig() {
        return this.cniConfig;
    }

    /**
     * Get the loadBalancerConfig property: Load balancer configuration.
     *
     * @return the loadBalancerConfig value.
     */
    public LoadBalancerConfig loadBalancerConfig() {
        return this.loadBalancerConfig;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cniConfig() != null) {
            cniConfig().validate();
        }
        if (loadBalancerConfig() != null) {
            loadBalancerConfig().validate();
        }
    }
}
