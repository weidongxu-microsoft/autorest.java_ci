// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.generated.models.DataResidency;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceType;
import com.azure.resourcemanager.databoxedge.generated.models.EdgeProfile;
import com.azure.resourcemanager.databoxedge.generated.models.ResourceMoveDetails;
import com.azure.resourcemanager.databoxedge.generated.models.RoleTypes;
import java.io.IOException;
import java.util.List;

/**
 * The properties of the Data Box Edge/Gateway device.
 */
@Fluent
public final class DataBoxEdgeDeviceProperties implements JsonSerializable<DataBoxEdgeDeviceProperties> {
    /*
     * DataBoxEdge Device Properties
     */
    private SystemData systemData;

    /*
     * The status of the Data Box Edge/Gateway device.
     */
    private DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus;

    /*
     * The Serial Number of Data Box Edge/Gateway device.
     */
    private String serialNumber;

    /*
     * The Description of the Data Box Edge/Gateway device.
     */
    private String description;

    /*
     * The description of the Data Box Edge/Gateway device model.
     */
    private String modelDescription;

    /*
     * The type of the Data Box Edge/Gateway device.
     */
    private DeviceType deviceType;

    /*
     * The Data Box Edge/Gateway device name.
     */
    private String friendlyName;

    /*
     * The Data Box Edge/Gateway device culture.
     */
    private String culture;

    /*
     * The Data Box Edge/Gateway device model.
     */
    private String deviceModel;

    /*
     * The Data Box Edge/Gateway device software version.
     */
    private String deviceSoftwareVersion;

    /*
     * The Data Box Edge/Gateway device local capacity in MB.
     */
    private Long deviceLocalCapacity;

    /*
     * The Data Box Edge/Gateway device timezone.
     */
    private String timeZone;

    /*
     * The device software version number of the device (eg: 1.2.18105.6).
     */
    private String deviceHcsVersion;

    /*
     * Type of compute roles configured.
     */
    private List<RoleTypes> configuredRoleTypes;

    /*
     * The number of nodes in the cluster.
     */
    private Integer nodeCount;

    /*
     * The details of the move operation on this resource.
     */
    private ResourceMoveDetails resourceMoveDetails;

    /*
     * The details of Edge Profile for this resource
     */
    private EdgeProfile edgeProfile;

    /*
     * The details of data-residency related properties for this resource
     */
    private DataResidency dataResidency;

    /*
     * Kubernetes Workload Profile
     */
    private String kubernetesWorkloadProfile;

    /**
     * Creates an instance of DataBoxEdgeDeviceProperties class.
     */
    public DataBoxEdgeDeviceProperties() {
    }

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
     * Get the kubernetesWorkloadProfile property: Kubernetes Workload Profile.
     * 
     * @return the kubernetesWorkloadProfile value.
     */
    public String kubernetesWorkloadProfile() {
        return this.kubernetesWorkloadProfile;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("dataResidency", this.dataResidency);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataBoxEdgeDeviceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataBoxEdgeDeviceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataBoxEdgeDeviceProperties.
     */
    public static DataBoxEdgeDeviceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataBoxEdgeDeviceProperties deserializedDataBoxEdgeDeviceProperties = new DataBoxEdgeDeviceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("systemData".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.systemData = SystemData.fromJson(reader);
                } else if ("dataBoxEdgeDeviceStatus".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.dataBoxEdgeDeviceStatus
                        = DataBoxEdgeDeviceStatus.fromString(reader.getString());
                } else if ("serialNumber".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.serialNumber = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.description = reader.getString();
                } else if ("modelDescription".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.modelDescription = reader.getString();
                } else if ("deviceType".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.deviceType = DeviceType.fromString(reader.getString());
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.friendlyName = reader.getString();
                } else if ("culture".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.culture = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.deviceModel = reader.getString();
                } else if ("deviceSoftwareVersion".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.deviceSoftwareVersion = reader.getString();
                } else if ("deviceLocalCapacity".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.deviceLocalCapacity
                        = reader.getNullable(JsonReader::getLong);
                } else if ("timeZone".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.timeZone = reader.getString();
                } else if ("deviceHcsVersion".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.deviceHcsVersion = reader.getString();
                } else if ("configuredRoleTypes".equals(fieldName)) {
                    List<RoleTypes> configuredRoleTypes
                        = reader.readArray(reader1 -> RoleTypes.fromString(reader1.getString()));
                    deserializedDataBoxEdgeDeviceProperties.configuredRoleTypes = configuredRoleTypes;
                } else if ("nodeCount".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.nodeCount = reader.getNullable(JsonReader::getInt);
                } else if ("resourceMoveDetails".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.resourceMoveDetails = ResourceMoveDetails.fromJson(reader);
                } else if ("edgeProfile".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.edgeProfile = EdgeProfile.fromJson(reader);
                } else if ("dataResidency".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.dataResidency = DataResidency.fromJson(reader);
                } else if ("kubernetesWorkloadProfile".equals(fieldName)) {
                    deserializedDataBoxEdgeDeviceProperties.kubernetesWorkloadProfile = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataBoxEdgeDeviceProperties;
        });
    }
}
