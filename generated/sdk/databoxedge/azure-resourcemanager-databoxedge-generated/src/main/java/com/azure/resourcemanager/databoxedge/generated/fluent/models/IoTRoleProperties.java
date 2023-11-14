// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ComputeResource;
import com.azure.resourcemanager.databoxedge.generated.models.HostPlatformType;
import com.azure.resourcemanager.databoxedge.generated.models.IoTDeviceInfo;
import com.azure.resourcemanager.databoxedge.generated.models.IoTEdgeAgentInfo;
import com.azure.resourcemanager.databoxedge.generated.models.MountPointMap;
import com.azure.resourcemanager.databoxedge.generated.models.PlatformType;
import com.azure.resourcemanager.databoxedge.generated.models.RoleStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * IoT role properties.
 */
@Fluent
public final class IoTRoleProperties {
    /*
     * Host OS supported by the IoT role.
     */
    @JsonProperty(value = "hostPlatform", required = true)
    private PlatformType hostPlatform;

    /*
     * IoT device metadata to which data box edge device needs to be connected.
     */
    @JsonProperty(value = "ioTDeviceDetails", required = true)
    private IoTDeviceInfo ioTDeviceDetails;

    /*
     * IoT edge device to which the IoT role needs to be configured.
     */
    @JsonProperty(value = "ioTEdgeDeviceDetails", required = true)
    private IoTDeviceInfo ioTEdgeDeviceDetails;

    /*
     * Mount points of shares in role(s).
     */
    @JsonProperty(value = "shareMappings")
    private List<MountPointMap> shareMappings;

    /*
     * Iot edge agent details to download the agent and bootstrap iot runtime.
     */
    @JsonProperty(value = "ioTEdgeAgentInfo")
    private IoTEdgeAgentInfo ioTEdgeAgentInfo;

    /*
     * Platform where the Iot runtime is hosted.
     */
    @JsonProperty(value = "hostPlatformType", access = JsonProperty.Access.WRITE_ONLY)
    private HostPlatformType hostPlatformType;

    /*
     * Resource allocation
     */
    @JsonProperty(value = "computeResource")
    private ComputeResource computeResource;

    /*
     * Role status.
     */
    @JsonProperty(value = "roleStatus", required = true)
    private RoleStatus roleStatus;

    /**
     * Creates an instance of IoTRoleProperties class.
     */
    public IoTRoleProperties() {
    }

    /**
     * Get the hostPlatform property: Host OS supported by the IoT role.
     * 
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.hostPlatform;
    }

    /**
     * Set the hostPlatform property: Host OS supported by the IoT role.
     * 
     * @param hostPlatform the hostPlatform value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withHostPlatform(PlatformType hostPlatform) {
        this.hostPlatform = hostPlatform;
        return this;
    }

    /**
     * Get the ioTDeviceDetails property: IoT device metadata to which data box edge device needs to be connected.
     * 
     * @return the ioTDeviceDetails value.
     */
    public IoTDeviceInfo ioTDeviceDetails() {
        return this.ioTDeviceDetails;
    }

    /**
     * Set the ioTDeviceDetails property: IoT device metadata to which data box edge device needs to be connected.
     * 
     * @param ioTDeviceDetails the ioTDeviceDetails value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withIoTDeviceDetails(IoTDeviceInfo ioTDeviceDetails) {
        this.ioTDeviceDetails = ioTDeviceDetails;
        return this;
    }

    /**
     * Get the ioTEdgeDeviceDetails property: IoT edge device to which the IoT role needs to be configured.
     * 
     * @return the ioTEdgeDeviceDetails value.
     */
    public IoTDeviceInfo ioTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }

    /**
     * Set the ioTEdgeDeviceDetails property: IoT edge device to which the IoT role needs to be configured.
     * 
     * @param ioTEdgeDeviceDetails the ioTEdgeDeviceDetails value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withIoTEdgeDeviceDetails(IoTDeviceInfo ioTEdgeDeviceDetails) {
        this.ioTEdgeDeviceDetails = ioTEdgeDeviceDetails;
        return this;
    }

    /**
     * Get the shareMappings property: Mount points of shares in role(s).
     * 
     * @return the shareMappings value.
     */
    public List<MountPointMap> shareMappings() {
        return this.shareMappings;
    }

    /**
     * Set the shareMappings property: Mount points of shares in role(s).
     * 
     * @param shareMappings the shareMappings value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withShareMappings(List<MountPointMap> shareMappings) {
        this.shareMappings = shareMappings;
        return this;
    }

    /**
     * Get the ioTEdgeAgentInfo property: Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     * @return the ioTEdgeAgentInfo value.
     */
    public IoTEdgeAgentInfo ioTEdgeAgentInfo() {
        return this.ioTEdgeAgentInfo;
    }

    /**
     * Set the ioTEdgeAgentInfo property: Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     * @param ioTEdgeAgentInfo the ioTEdgeAgentInfo value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withIoTEdgeAgentInfo(IoTEdgeAgentInfo ioTEdgeAgentInfo) {
        this.ioTEdgeAgentInfo = ioTEdgeAgentInfo;
        return this;
    }

    /**
     * Get the hostPlatformType property: Platform where the Iot runtime is hosted.
     * 
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.hostPlatformType;
    }

    /**
     * Get the computeResource property: Resource allocation.
     * 
     * @return the computeResource value.
     */
    public ComputeResource computeResource() {
        return this.computeResource;
    }

    /**
     * Set the computeResource property: Resource allocation.
     * 
     * @param computeResource the computeResource value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withComputeResource(ComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }

    /**
     * Get the roleStatus property: Role status.
     * 
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.roleStatus;
    }

    /**
     * Set the roleStatus property: Role status.
     * 
     * @param roleStatus the roleStatus value to set.
     * @return the IoTRoleProperties object itself.
     */
    public IoTRoleProperties withRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostPlatform() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property hostPlatform in model IoTRoleProperties"));
        }
        if (ioTDeviceDetails() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ioTDeviceDetails in model IoTRoleProperties"));
        } else {
            ioTDeviceDetails().validate();
        }
        if (ioTEdgeDeviceDetails() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property ioTEdgeDeviceDetails in model IoTRoleProperties"));
        } else {
            ioTEdgeDeviceDetails().validate();
        }
        if (shareMappings() != null) {
            shareMappings().forEach(e -> e.validate());
        }
        if (ioTEdgeAgentInfo() != null) {
            ioTEdgeAgentInfo().validate();
        }
        if (computeResource() != null) {
            computeResource().validate();
        }
        if (roleStatus() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property roleStatus in model IoTRoleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IoTRoleProperties.class);
}
