// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroupPropertiesIntent;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroupType;
import com.azure.resourcemanager.compute.generated.models.SubResourceWithColocationStatus;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the proximity placement group.
 */
@Fluent
public final class ProximityPlacementGroupInner extends Resource {
    /*
     * Describes the properties of a Proximity Placement Group.
     */
    private ProximityPlacementGroupProperties innerProperties;

    /*
     * Specifies the Availability Zone where virtual machine, virtual machine scale set or availability set associated
     * with the proximity placement group can be created.
     */
    private List<String> zones;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ProximityPlacementGroupInner class.
     */
    public ProximityPlacementGroupInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a Proximity Placement Group.
     * 
     * @return the innerProperties value.
     */
    private ProximityPlacementGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: Specifies the Availability Zone where virtual machine, virtual machine scale set or
     * availability set associated with the proximity placement group can be created.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Specifies the Availability Zone where virtual machine, virtual machine scale set or
     * availability set associated with the proximity placement group can be created.
     * 
     * @param zones the zones value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProximityPlacementGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProximityPlacementGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the proximityPlacementGroupType property: Specifies the type of the proximity placement group. Possible
     * values are: **Standard** : Co-locate resources within an Azure region or Availability Zone. **Ultra** : For
     * future use.
     * 
     * @return the proximityPlacementGroupType value.
     */
    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroupType();
    }

    /**
     * Set the proximityPlacementGroupType property: Specifies the type of the proximity placement group. Possible
     * values are: **Standard** : Co-locate resources within an Azure region or Availability Zone. **Ultra** : For
     * future use.
     * 
     * @param proximityPlacementGroupType the proximityPlacementGroupType value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner
        withProximityPlacementGroupType(ProximityPlacementGroupType proximityPlacementGroupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withProximityPlacementGroupType(proximityPlacementGroupType);
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the proximity placement group.
     * 
     * @return the virtualMachines value.
     */
    public List<SubResourceWithColocationStatus> virtualMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachines();
    }

    /**
     * Get the virtualMachineScaleSets property: A list of references to all virtual machine scale sets in the proximity
     * placement group.
     * 
     * @return the virtualMachineScaleSets value.
     */
    public List<SubResourceWithColocationStatus> virtualMachineScaleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineScaleSets();
    }

    /**
     * Get the availabilitySets property: A list of references to all availability sets in the proximity placement
     * group.
     * 
     * @return the availabilitySets value.
     */
    public List<SubResourceWithColocationStatus> availabilitySets() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilitySets();
    }

    /**
     * Get the colocationStatus property: Describes colocation status of the Proximity Placement Group.
     * 
     * @return the colocationStatus value.
     */
    public InstanceViewStatus colocationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().colocationStatus();
    }

    /**
     * Set the colocationStatus property: Describes colocation status of the Proximity Placement Group.
     * 
     * @param colocationStatus the colocationStatus value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withColocationStatus(InstanceViewStatus colocationStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withColocationStatus(colocationStatus);
        return this;
    }

    /**
     * Get the intent property: Specifies the user intent of the proximity placement group.
     * 
     * @return the intent value.
     */
    public ProximityPlacementGroupPropertiesIntent intent() {
        return this.innerProperties() == null ? null : this.innerProperties().intent();
    }

    /**
     * Set the intent property: Specifies the user intent of the proximity placement group.
     * 
     * @param intent the intent value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withIntent(ProximityPlacementGroupPropertiesIntent intent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withIntent(intent);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProximityPlacementGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProximityPlacementGroupInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProximityPlacementGroupInner.
     */
    public static ProximityPlacementGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProximityPlacementGroupInner deserializedProximityPlacementGroupInner = new ProximityPlacementGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedProximityPlacementGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProximityPlacementGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProximityPlacementGroupInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedProximityPlacementGroupInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedProximityPlacementGroupInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedProximityPlacementGroupInner.innerProperties
                        = ProximityPlacementGroupProperties.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedProximityPlacementGroupInner.zones = zones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProximityPlacementGroupInner;
        });
    }
}
