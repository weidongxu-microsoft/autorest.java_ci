// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.databoxedge.generated.models.NodeStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the nodes in a highly available cluster.
 */
@Immutable
public final class NodeProperties {
    /*
     * The current status of the individual node
     */
    @JsonProperty(value = "nodeStatus", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStatus nodeStatus;

    /*
     * Serial number of the Chassis
     */
    @JsonProperty(value = "nodeChassisSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeChassisSerialNumber;

    /*
     * Serial number of the individual node
     */
    @JsonProperty(value = "nodeSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeSerialNumber;

    /*
     * Display Name of the individual node
     */
    @JsonProperty(value = "nodeDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeDisplayName;

    /*
     * Friendly software version name that is currently installed on the node
     */
    @JsonProperty(value = "nodeFriendlySoftwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeFriendlySoftwareVersion;

    /*
     * HCS version that is currently installed on the node
     */
    @JsonProperty(value = "nodeHcsVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeHcsVersion;

    /*
     * Guid instance id of the node
     */
    @JsonProperty(value = "nodeInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeInstanceId;

    /**
     * Creates an instance of NodeProperties class.
     */
    public NodeProperties() {
    }

    /**
     * Get the nodeStatus property: The current status of the individual node.
     * 
     * @return the nodeStatus value.
     */
    public NodeStatus nodeStatus() {
        return this.nodeStatus;
    }

    /**
     * Get the nodeChassisSerialNumber property: Serial number of the Chassis.
     * 
     * @return the nodeChassisSerialNumber value.
     */
    public String nodeChassisSerialNumber() {
        return this.nodeChassisSerialNumber;
    }

    /**
     * Get the nodeSerialNumber property: Serial number of the individual node.
     * 
     * @return the nodeSerialNumber value.
     */
    public String nodeSerialNumber() {
        return this.nodeSerialNumber;
    }

    /**
     * Get the nodeDisplayName property: Display Name of the individual node.
     * 
     * @return the nodeDisplayName value.
     */
    public String nodeDisplayName() {
        return this.nodeDisplayName;
    }

    /**
     * Get the nodeFriendlySoftwareVersion property: Friendly software version name that is currently installed on the
     * node.
     * 
     * @return the nodeFriendlySoftwareVersion value.
     */
    public String nodeFriendlySoftwareVersion() {
        return this.nodeFriendlySoftwareVersion;
    }

    /**
     * Get the nodeHcsVersion property: HCS version that is currently installed on the node.
     * 
     * @return the nodeHcsVersion value.
     */
    public String nodeHcsVersion() {
        return this.nodeHcsVersion;
    }

    /**
     * Get the nodeInstanceId property: Guid instance id of the node.
     * 
     * @return the nodeInstanceId value.
     */
    public String nodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
