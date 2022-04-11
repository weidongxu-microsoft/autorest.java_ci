// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.generated.models.DataResidency;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceType;
import com.azure.resourcemanager.databoxedge.generated.models.EdgeProfile;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceMoveDetails;
import com.azure.resourcemanager.databoxedge.generated.models.RoleTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the Data Box Edge/Gateway device. */
@Fluent
public final class DataBoxEdgeDeviceProperties {
    /*
     * DataBoxEdge Device Properties
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The status of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "dataBoxEdgeDeviceStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus;

    /*
     * The Serial Number of Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * The Description of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The description of the Data Box Edge/Gateway device model.
     */
    @JsonProperty(value = "modelDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String modelDescription;

    /*
     * The type of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "deviceType", access = JsonProperty.Access.WRITE_ONLY)
    private DeviceType deviceType;

    /*
     * The Data Box Edge/Gateway device name.
     */
    @JsonProperty(value = "friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /*
     * The Data Box Edge/Gateway device culture.
     */
    @JsonProperty(value = "culture", access = JsonProperty.Access.WRITE_ONLY)
    private String culture;

    /*
     * The Data Box Edge/Gateway device model.
     */
    @JsonProperty(value = "deviceModel", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceModel;

    /*
     * The Data Box Edge/Gateway device software version.
     */
    @JsonProperty(value = "deviceSoftwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceSoftwareVersion;

    /*
     * The Data Box Edge/Gateway device local capacity in MB.
     */
    @JsonProperty(value = "deviceLocalCapacity", access = JsonProperty.Access.WRITE_ONLY)
    private Long deviceLocalCapacity;

    /*
     * The Data Box Edge/Gateway device timezone.
     */
    @JsonProperty(value = "timeZone", access = JsonProperty.Access.WRITE_ONLY)
    private String timeZone;

    /*
     * The device software version number of the device (eg: 1.2.18105.6).
     */
    @JsonProperty(value = "deviceHcsVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceHcsVersion;

    /*
     * Type of compute roles configured.
     */
    @JsonProperty(value = "configuredRoleTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<RoleTypes> configuredRoleTypes;

    /*
     * The number of nodes in the cluster.
     */
    @JsonProperty(value = "nodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer nodeCount;

    /*
     * The details of the move operation on this resource.
     */
    @JsonProperty(value = "resourceMoveDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceMoveDetails resourceMoveDetails;

    /*
     * The details of Edge Profile for this resource
     */
    @JsonProperty(value = "edgeProfile", access = JsonProperty.Access.WRITE_ONLY)
    private EdgeProfile edgeProfile;

    /*
     * The details of data-residency related properties for this resource
     */
    @JsonProperty(value = "dataResidency")
    private DataResidency dataResidency;

    /**
     * Get the systemData property: DataBoxEdge Device Properties.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @return the dataBoxEdgeDeviceStatus value.
     */
    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.dataBoxEdgeDeviceStatus;
    }

    /**
     * Get the serialNumber property: The Serial Number of Data Box Edge/Gateway device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @return the modelDescription value.
     */
    public String modelDescription() {
        return this.modelDescription;
    }

    /**
     * Get the deviceType property: The type of the Data Box Edge/Gateway device.
     *
     * @return the deviceType value.
     */
    public DeviceType deviceType() {
        return this.deviceType;
    }

    /**
     * Get the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the culture property: The Data Box Edge/Gateway device culture.
     *
     * @return the culture value.
     */
    public String culture() {
        return this.culture;
    }

    /**
     * Get the deviceModel property: The Data Box Edge/Gateway device model.
     *
     * @return the deviceModel value.
     */
    public String deviceModel() {
        return this.deviceModel;
    }

    /**
     * Get the deviceSoftwareVersion property: The Data Box Edge/Gateway device software version.
     *
     * @return the deviceSoftwareVersion value.
     */
    public String deviceSoftwareVersion() {
        return this.deviceSoftwareVersion;
    }

    /**
     * Get the deviceLocalCapacity property: The Data Box Edge/Gateway device local capacity in MB.
     *
     * @return the deviceLocalCapacity value.
     */
    public Long deviceLocalCapacity() {
        return this.deviceLocalCapacity;
    }

    /**
     * Get the timeZone property: The Data Box Edge/Gateway device timezone.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Get the deviceHcsVersion property: The device software version number of the device (eg: 1.2.18105.6).
     *
     * @return the deviceHcsVersion value.
     */
    public String deviceHcsVersion() {
        return this.deviceHcsVersion;
    }

    /**
     * Get the configuredRoleTypes property: Type of compute roles configured.
     *
     * @return the configuredRoleTypes value.
     */
    public List<RoleTypes> configuredRoleTypes() {
        return this.configuredRoleTypes;
    }

    /**
     * Get the nodeCount property: The number of nodes in the cluster.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Get the resourceMoveDetails property: The details of the move operation on this resource.
     *
     * @return the resourceMoveDetails value.
     */
    public ResourceMoveDetails resourceMoveDetails() {
        return this.resourceMoveDetails;
    }

    /**
     * Get the edgeProfile property: The details of Edge Profile for this resource.
     *
     * @return the edgeProfile value.
     */
    public EdgeProfile edgeProfile() {
        return this.edgeProfile;
    }

    /**
     * Get the dataResidency property: The details of data-residency related properties for this resource.
     *
     * @return the dataResidency value.
     */
    public DataResidency dataResidency() {
        return this.dataResidency;
    }

    /**
     * Set the dataResidency property: The details of data-residency related properties for this resource.
     *
     * @param dataResidency the dataResidency value to set.
     * @return the DataBoxEdgeDeviceProperties object itself.
     */
    public DataBoxEdgeDeviceProperties withDataResidency(DataResidency dataResidency) {
        this.dataResidency = dataResidency;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceMoveDetails() != null) {
            resourceMoveDetails().validate();
        }
        if (edgeProfile() != null) {
            edgeProfile().validate();
        }
        if (dataResidency() != null) {
            dataResidency().validate();
        }
    }
}
