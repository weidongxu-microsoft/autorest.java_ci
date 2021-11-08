// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gets the application SSH endpoint. */
@Fluent
public final class ApplicationGetEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGetEndpoint.class);

    /*
     * The location of the endpoint.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The destination port to connect to.
     */
    @JsonProperty(value = "destinationPort")
    private Integer destinationPort;

    /*
     * The public port to connect to.
     */
    @JsonProperty(value = "publicPort")
    private Integer publicPort;

    /*
     * The private ip address of the endpoint.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /**
     * Get the location property: The location of the endpoint.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the endpoint.
     *
     * @param location the location value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the destinationPort property: The destination port to connect to.
     *
     * @return the destinationPort value.
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: The destination port to connect to.
     *
     * @param destinationPort the destinationPort value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Get the publicPort property: The public port to connect to.
     *
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Set the publicPort property: The public port to connect to.
     *
     * @param publicPort the publicPort value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private ip address of the endpoint.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private ip address of the endpoint.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
