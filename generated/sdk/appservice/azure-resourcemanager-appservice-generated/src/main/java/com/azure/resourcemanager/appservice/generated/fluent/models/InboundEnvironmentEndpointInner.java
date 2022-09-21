// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The IP Addresses and Ports that require inbound network access to and within the subnet of the App Service
 * Environment.
 */
@Fluent
public final class InboundEnvironmentEndpointInner {
    /*
     * Short text describing the purpose of the network traffic.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The IP addresses that network traffic will originate from in cidr notation.
     */
    @JsonProperty(value = "endpoints")
    private List<String> endpoints;

    /*
     * The ports that network traffic will arrive to the App Service Environment at.
     */
    @JsonProperty(value = "ports")
    private List<String> ports;

    /** Creates an instance of InboundEnvironmentEndpointInner class. */
    public InboundEnvironmentEndpointInner() {
    }

    /**
     * Get the description property: Short text describing the purpose of the network traffic.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Short text describing the purpose of the network traffic.
     *
     * @param description the description value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the endpoints property: The IP addresses that network traffic will originate from in cidr notation.
     *
     * @return the endpoints value.
     */
    public List<String> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The IP addresses that network traffic will originate from in cidr notation.
     *
     * @param endpoints the endpoints value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the ports property: The ports that network traffic will arrive to the App Service Environment at.
     *
     * @return the ports value.
     */
    public List<String> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: The ports that network traffic will arrive to the App Service Environment at.
     *
     * @param ports the ports value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withPorts(List<String> ports) {
        this.ports = ports;
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
