// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the availability set that the virtual machine should be assigned to. Only tags may be
 * updated.
 */
@Fluent
public final class AvailabilitySetUpdate extends UpdateResource {
    /*
     * The instance view of a resource.
     */
    private AvailabilitySetProperties innerProperties;

    /*
     * Sku of the availability set
     */
    private Sku sku;

    /**
     * Creates an instance of AvailabilitySetUpdate class.
     */
    public AvailabilitySetUpdate() {
    }

    /**
     * Get the innerProperties property: The instance view of a resource.
     * 
     * @return the innerProperties value.
     */
    private AvailabilitySetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Sku of the availability set.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the availability set.
     * 
     * @param sku the sku value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailabilitySetUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the platformUpdateDomainCount property: Update Domain count.
     * 
     * @return the platformUpdateDomainCount value.
     */
    public Integer platformUpdateDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformUpdateDomainCount();
    }

    /**
     * Set the platformUpdateDomainCount property: Update Domain count.
     * 
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilitySetProperties();
        }
        this.innerProperties().withPlatformUpdateDomainCount(platformUpdateDomainCount);
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomainCount();
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count.
     * 
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilitySetProperties();
        }
        this.innerProperties().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the availability set.
     * 
     * @return the virtualMachines value.
     */
    public List<SubResource> virtualMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachines();
    }

    /**
     * Set the virtualMachines property: A list of references to all virtual machines in the availability set.
     * 
     * @param virtualMachines the virtualMachines value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withVirtualMachines(List<SubResource> virtualMachines) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilitySetProperties();
        }
        this.innerProperties().withVirtualMachines(virtualMachines);
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. Minimum api-version: 2018-04-01.
     * 
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroup();
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * availability set should be assigned to. Minimum api-version: 2018-04-01.
     * 
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AvailabilitySetProperties();
        }
        this.innerProperties().withProximityPlacementGroup(proximityPlacementGroup);
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     * 
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.innerProperties() == null ? null : this.innerProperties().statuses();
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
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailabilitySetUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailabilitySetUpdate if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailabilitySetUpdate.
     */
    public static AvailabilitySetUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailabilitySetUpdate deserializedAvailabilitySetUpdate = new AvailabilitySetUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAvailabilitySetUpdate.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedAvailabilitySetUpdate.innerProperties = AvailabilitySetProperties.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedAvailabilitySetUpdate.sku = Sku.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailabilitySetUpdate;
        });
    }
}
