// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceKind;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.generated.models.DataResidency;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceType;
import com.azure.resourcemanager.databoxedge.generated.models.EdgeProfile;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceIdentity;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceMoveDetails;
import com.azure.resourcemanager.databoxedge.generated.models.RoleTypes;
import com.azure.resourcemanager.databoxedge.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Data Box Edge/Gateway device. */
@Fluent
public final class DataBoxEdgeDeviceInner extends ArmBaseModel {
    /*
     * The location of the device. This is a supported and registered Azure geographical region (for example, West US,
     * East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an
     * identical geographical region is specified on update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The list of tags that describe the device. These tags can be used to view and group this device (across resource
     * groups).
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The SKU type.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The etag for the devices.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Msi identity of the resource
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The kind of the device.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private DataBoxEdgeDeviceKind kind;

    /*
     * DataBoxEdge Resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The properties of the Data Box Edge/Gateway device.
     */
    @JsonProperty(value = "properties")
    private DataBoxEdgeDeviceProperties innerProperties;

    /** Creates an instance of DataBoxEdgeDeviceInner class. */
    public DataBoxEdgeDeviceInner() {
    }

    /**
     * Get the location property: The location of the device. This is a supported and registered Azure geographical
     * region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed
     * once it is created, but if an identical geographical region is specified on update, the request will succeed.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the device. This is a supported and registered Azure geographical
     * region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed
     * once it is created, but if an identical geographical region is specified on update, the request will succeed.
     *
     * @param location the location value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The list of tags that describe the device. These tags can be used to view and group this
     * device (across resource groups).
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The list of tags that describe the device. These tags can be used to view and group this
     * device (across resource groups).
     *
     * @param tags the tags value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The SKU type.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU type.
     *
     * @param sku the sku value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: The etag for the devices.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag for the devices.
     *
     * @param etag the etag value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Msi identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: The kind of the device.
     *
     * @return the kind value.
     */
    public DataBoxEdgeDeviceKind kind() {
        return this.kind;
    }

    /**
     * Get the systemData property: DataBoxEdge Resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: The properties of the Data Box Edge/Gateway device.
     *
     * @return the innerProperties value.
     */
    private DataBoxEdgeDeviceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: DataBoxEdge Device Properties.
     *
     * @return the systemData value.
     */
    public SystemData systemDataPropertiesSystemData() {
        return this.innerProperties() == null ? null : this.innerProperties().systemData();
    }

    /**
     * Get the dataBoxEdgeDeviceStatus property: The status of the Data Box Edge/Gateway device.
     *
     * @return the dataBoxEdgeDeviceStatus value.
     */
    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().dataBoxEdgeDeviceStatus();
    }

    /**
     * Get the serialNumber property: The Serial Number of Data Box Edge/Gateway device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Get the description property: The Description of the Data Box Edge/Gateway device.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the modelDescription property: The description of the Data Box Edge/Gateway device model.
     *
     * @return the modelDescription value.
     */
    public String modelDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().modelDescription();
    }

    /**
     * Get the deviceType property: The type of the Data Box Edge/Gateway device.
     *
     * @return the deviceType value.
     */
    public DeviceType deviceType() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceType();
    }

    /**
     * Get the friendlyName property: The Data Box Edge/Gateway device name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Get the culture property: The Data Box Edge/Gateway device culture.
     *
     * @return the culture value.
     */
    public String culture() {
        return this.innerProperties() == null ? null : this.innerProperties().culture();
    }

    /**
     * Get the deviceModel property: The Data Box Edge/Gateway device model.
     *
     * @return the deviceModel value.
     */
    public String deviceModel() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceModel();
    }

    /**
     * Get the deviceSoftwareVersion property: The Data Box Edge/Gateway device software version.
     *
     * @return the deviceSoftwareVersion value.
     */
    public String deviceSoftwareVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceSoftwareVersion();
    }

    /**
     * Get the deviceLocalCapacity property: The Data Box Edge/Gateway device local capacity in MB.
     *
     * @return the deviceLocalCapacity value.
     */
    public Long deviceLocalCapacity() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceLocalCapacity();
    }

    /**
     * Get the timeZone property: The Data Box Edge/Gateway device timezone.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.innerProperties() == null ? null : this.innerProperties().timeZone();
    }

    /**
     * Get the deviceHcsVersion property: The device software version number of the device (eg: 1.2.18105.6).
     *
     * @return the deviceHcsVersion value.
     */
    public String deviceHcsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().deviceHcsVersion();
    }

    /**
     * Get the configuredRoleTypes property: Type of compute roles configured.
     *
     * @return the configuredRoleTypes value.
     */
    public List<RoleTypes> configuredRoleTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().configuredRoleTypes();
    }

    /**
     * Get the nodeCount property: The number of nodes in the cluster.
     *
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeCount();
    }

    /**
     * Get the resourceMoveDetails property: The details of the move operation on this resource.
     *
     * @return the resourceMoveDetails value.
     */
    public ResourceMoveDetails resourceMoveDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceMoveDetails();
    }

    /**
     * Get the edgeProfile property: The details of Edge Profile for this resource.
     *
     * @return the edgeProfile value.
     */
    public EdgeProfile edgeProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().edgeProfile();
    }

    /**
     * Get the dataResidency property: The details of data-residency related properties for this resource.
     *
     * @return the dataResidency value.
     */
    public DataResidency dataResidency() {
        return this.innerProperties() == null ? null : this.innerProperties().dataResidency();
    }

    /**
     * Set the dataResidency property: The details of data-residency related properties for this resource.
     *
     * @param dataResidency the dataResidency value to set.
     * @return the DataBoxEdgeDeviceInner object itself.
     */
    public DataBoxEdgeDeviceInner withDataResidency(DataResidency dataResidency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataBoxEdgeDeviceProperties();
        }
        this.innerProperties().withDataResidency(dataResidency);
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
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model DataBoxEdgeDeviceInner"));
        }
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataBoxEdgeDeviceInner.class);
}
