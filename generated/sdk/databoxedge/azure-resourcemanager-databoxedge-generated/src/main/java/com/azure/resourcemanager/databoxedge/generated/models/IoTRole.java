// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.IoTRoleProperties;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.RoleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Compute role.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("IOT")
@Fluent
public final class IoTRole extends RoleInner {
    /*
     * Properties specific to IoT role.
     */
    @JsonProperty(value = "properties")
    private IoTRoleProperties innerProperties;

    /**
     * Creates an instance of IoTRole class.
     */
    public IoTRole() {
    }

    /**
     * Get the innerProperties property: Properties specific to IoT role.
     * 
     * @return the innerProperties value.
     */
    private IoTRoleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the hostPlatform property: Host OS supported by the IoT role.
     * 
     * @return the hostPlatform value.
     */
    public PlatformType hostPlatform() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatform();
    }

    /**
     * Set the hostPlatform property: Host OS supported by the IoT role.
     * 
     * @param hostPlatform the hostPlatform value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withHostPlatform(PlatformType hostPlatform) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withHostPlatform(hostPlatform);
        return this;
    }

    /**
     * Get the ioTDeviceDetails property: IoT device metadata to which data box edge device needs to be connected.
     * 
     * @return the ioTDeviceDetails value.
     */
    public IoTDeviceInfo ioTDeviceDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().ioTDeviceDetails();
    }

    /**
     * Set the ioTDeviceDetails property: IoT device metadata to which data box edge device needs to be connected.
     * 
     * @param ioTDeviceDetails the ioTDeviceDetails value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTDeviceDetails(IoTDeviceInfo ioTDeviceDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withIoTDeviceDetails(ioTDeviceDetails);
        return this;
    }

    /**
     * Get the ioTEdgeDeviceDetails property: IoT edge device to which the IoT role needs to be configured.
     * 
     * @return the ioTEdgeDeviceDetails value.
     */
    public IoTDeviceInfo ioTEdgeDeviceDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().ioTEdgeDeviceDetails();
    }

    /**
     * Set the ioTEdgeDeviceDetails property: IoT edge device to which the IoT role needs to be configured.
     * 
     * @param ioTEdgeDeviceDetails the ioTEdgeDeviceDetails value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTEdgeDeviceDetails(IoTDeviceInfo ioTEdgeDeviceDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withIoTEdgeDeviceDetails(ioTEdgeDeviceDetails);
        return this;
    }

    /**
     * Get the shareMappings property: Mount points of shares in role(s).
     * 
     * @return the shareMappings value.
     */
    public List<MountPointMap> shareMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().shareMappings();
    }

    /**
     * Set the shareMappings property: Mount points of shares in role(s).
     * 
     * @param shareMappings the shareMappings value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withShareMappings(List<MountPointMap> shareMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withShareMappings(shareMappings);
        return this;
    }

    /**
     * Get the ioTEdgeAgentInfo property: Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     * @return the ioTEdgeAgentInfo value.
     */
    public IoTEdgeAgentInfo ioTEdgeAgentInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().ioTEdgeAgentInfo();
    }

    /**
     * Set the ioTEdgeAgentInfo property: Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     * @param ioTEdgeAgentInfo the ioTEdgeAgentInfo value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTEdgeAgentInfo(IoTEdgeAgentInfo ioTEdgeAgentInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withIoTEdgeAgentInfo(ioTEdgeAgentInfo);
        return this;
    }

    /**
     * Get the hostPlatformType property: Platform where the Iot runtime is hosted.
     * 
     * @return the hostPlatformType value.
     */
    public HostPlatformType hostPlatformType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostPlatformType();
    }

    /**
     * Get the computeResource property: Resource allocation.
     * 
     * @return the computeResource value.
     */
    public ComputeResource computeResource() {
        return this.innerProperties() == null ? null : this.innerProperties().computeResource();
    }

    /**
     * Set the computeResource property: Resource allocation.
     * 
     * @param computeResource the computeResource value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withComputeResource(ComputeResource computeResource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withComputeResource(computeResource);
        return this;
    }

    /**
     * Get the roleStatus property: Role status.
     * 
     * @return the roleStatus value.
     */
    public RoleStatus roleStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().roleStatus();
    }

    /**
     * Set the roleStatus property: Role status.
     * 
     * @param roleStatus the roleStatus value to set.
     * @return the IoTRole object itself.
     */
    public IoTRole withRoleStatus(RoleStatus roleStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTRoleProperties();
        }
        this.innerProperties().withRoleStatus(roleStatus);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
