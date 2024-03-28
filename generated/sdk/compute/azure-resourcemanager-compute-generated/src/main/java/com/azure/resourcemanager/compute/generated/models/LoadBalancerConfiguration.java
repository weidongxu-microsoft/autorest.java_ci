// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the load balancer configuration.
 */
@Fluent
public final class LoadBalancerConfiguration {
    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the Load balancer
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Properties of the load balancer configuration.
     */
    @JsonProperty(value = "properties", required = true)
    private LoadBalancerConfigurationProperties properties;

    /**
     * Creates an instance of LoadBalancerConfiguration class.
     */
    public LoadBalancerConfiguration() {
    }

    /**
     * Get the id property: Resource Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     * 
     * @param id the id value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the Load balancer.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Load balancer.
     * 
     * @param name the name value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of the load balancer configuration.
     * 
     * @return the properties value.
     */
    public LoadBalancerConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the load balancer configuration.
     * 
     * @param properties the properties value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withProperties(LoadBalancerConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model LoadBalancerConfiguration"));
        }
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model LoadBalancerConfiguration"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancerConfiguration.class);
}
