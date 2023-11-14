// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Kubernetes node info.
 */
@Fluent
public final class NodeInfo {
    /*
     * Node name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Node type - Master/Worker
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private KubernetesNodeType type;

    /*
     * IP Configuration of the Kubernetes node.
     */
    @JsonProperty(value = "ipConfiguration")
    private List<KubernetesIpConfiguration> ipConfiguration;

    /**
     * Creates an instance of NodeInfo class.
     */
    public NodeInfo() {
    }

    /**
     * Get the name property: Node name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Node type - Master/Worker.
     * 
     * @return the type value.
     */
    public KubernetesNodeType type() {
        return this.type;
    }

    /**
     * Get the ipConfiguration property: IP Configuration of the Kubernetes node.
     * 
     * @return the ipConfiguration value.
     */
    public List<KubernetesIpConfiguration> ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set the ipConfiguration property: IP Configuration of the Kubernetes node.
     * 
     * @param ipConfiguration the ipConfiguration value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo withIpConfiguration(List<KubernetesIpConfiguration> ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfiguration() != null) {
            ipConfiguration().forEach(e -> e.validate());
        }
    }
}
