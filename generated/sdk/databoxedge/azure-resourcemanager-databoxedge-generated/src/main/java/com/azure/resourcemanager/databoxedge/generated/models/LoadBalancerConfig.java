// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Load balancer configuration.
 */
@Fluent
public final class LoadBalancerConfig {
    /*
     * Load balancer type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Load balancer version
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Load balancer ipconfig
     */
    @JsonProperty(value = "ipRange")
    private List<String> ipRange;

    /**
     * Creates an instance of LoadBalancerConfig class.
     */
    public LoadBalancerConfig() {
    }

    /**
     * Get the type property: Load balancer type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the version property: Load balancer version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the ipRange property: Load balancer ipconfig.
     * 
     * @return the ipRange value.
     */
    public List<String> ipRange() {
        return this.ipRange;
    }

    /**
     * Set the ipRange property: Load balancer ipconfig.
     * 
     * @param ipRange the ipRange value to set.
     * @return the LoadBalancerConfig object itself.
     */
    public LoadBalancerConfig withIpRange(List<String> ipRange) {
        this.ipRange = ipRange;
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
