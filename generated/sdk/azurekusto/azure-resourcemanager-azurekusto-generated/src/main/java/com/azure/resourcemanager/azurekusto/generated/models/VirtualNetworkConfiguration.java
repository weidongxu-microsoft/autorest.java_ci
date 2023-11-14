// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class that contains virtual network definition.
 */
@Fluent
public final class VirtualNetworkConfiguration {
    /*
     * The subnet resource id.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /*
     * Engine service's public IP address resource id.
     */
    @JsonProperty(value = "enginePublicIpId", required = true)
    private String enginePublicIpId;

    /*
     * Data management's service public IP address resource id.
     */
    @JsonProperty(value = "dataManagementPublicIpId", required = true)
    private String dataManagementPublicIpId;

    /*
     * When enabled, the cluster is deployed into the configured subnet, when disabled it will be removed from the
     * subnet.
     */
    @JsonProperty(value = "state")
    private VnetState state;

    /**
     * Creates an instance of VirtualNetworkConfiguration class.
     */
    public VirtualNetworkConfiguration() {
    }

    /**
     * Get the subnetId property: The subnet resource id.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnet resource id.
     * 
     * @param subnetId the subnetId value to set.
     * @return the VirtualNetworkConfiguration object itself.
     */
    public VirtualNetworkConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the enginePublicIpId property: Engine service's public IP address resource id.
     * 
     * @return the enginePublicIpId value.
     */
    public String enginePublicIpId() {
        return this.enginePublicIpId;
    }

    /**
     * Set the enginePublicIpId property: Engine service's public IP address resource id.
     * 
     * @param enginePublicIpId the enginePublicIpId value to set.
     * @return the VirtualNetworkConfiguration object itself.
     */
    public VirtualNetworkConfiguration withEnginePublicIpId(String enginePublicIpId) {
        this.enginePublicIpId = enginePublicIpId;
        return this;
    }

    /**
     * Get the dataManagementPublicIpId property: Data management's service public IP address resource id.
     * 
     * @return the dataManagementPublicIpId value.
     */
    public String dataManagementPublicIpId() {
        return this.dataManagementPublicIpId;
    }

    /**
     * Set the dataManagementPublicIpId property: Data management's service public IP address resource id.
     * 
     * @param dataManagementPublicIpId the dataManagementPublicIpId value to set.
     * @return the VirtualNetworkConfiguration object itself.
     */
    public VirtualNetworkConfiguration withDataManagementPublicIpId(String dataManagementPublicIpId) {
        this.dataManagementPublicIpId = dataManagementPublicIpId;
        return this;
    }

    /**
     * Get the state property: When enabled, the cluster is deployed into the configured subnet, when disabled it will
     * be removed from the subnet.
     * 
     * @return the state value.
     */
    public VnetState state() {
        return this.state;
    }

    /**
     * Set the state property: When enabled, the cluster is deployed into the configured subnet, when disabled it will
     * be removed from the subnet.
     * 
     * @param state the state value to set.
     * @return the VirtualNetworkConfiguration object itself.
     */
    public VirtualNetworkConfiguration withState(VnetState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnetId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property subnetId in model VirtualNetworkConfiguration"));
        }
        if (enginePublicIpId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property enginePublicIpId in model VirtualNetworkConfiguration"));
        }
        if (dataManagementPublicIpId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property dataManagementPublicIpId in model VirtualNetworkConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkConfiguration.class);
}
