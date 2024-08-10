// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostGroupProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Specifies information about the dedicated host group that the dedicated host should be assigned to. Only tags may be
 * updated.
 */
@Fluent
public final class DedicatedHostGroupUpdate extends UpdateResource {
    /*
     * Dedicated Host Group Properties.
     */
    private DedicatedHostGroupProperties innerProperties;

    /*
     * Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during
     * creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the
     * group to be in the same zone.
     */
    private List<String> zones;

    /**
     * Creates an instance of DedicatedHostGroupUpdate class.
     */
    public DedicatedHostGroupUpdate() {
    }

    /**
     * Get the innerProperties property: Dedicated Host Group Properties.
     * 
     * @return the innerProperties value.
     */
    private DedicatedHostGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this host group. Only single zone is supported. The zone can
     * be assigned only during creation. If not provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     * 
     * @param zones the zones value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DedicatedHostGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Number of fault domains that the host group can span.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomainCount();
    }

    /**
     * Set the platformFaultDomainCount property: Number of fault domains that the host group can span.
     * 
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostGroupProperties();
        }
        this.innerProperties().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    /**
     * Get the hosts property: A list of references to all dedicated hosts in the dedicated host group.
     * 
     * @return the hosts value.
     */
    public List<SubResourceReadOnly> hosts() {
        return this.innerProperties() == null ? null : this.innerProperties().hosts();
    }

    /**
     * Get the instanceView property: The dedicated host group instance view, which has the list of instance view of the
     * dedicated hosts under the dedicated host group.
     * 
     * @return the instanceView value.
     */
    public DedicatedHostGroupInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the supportAutomaticPlacement property: Specifies whether virtual machines or virtual machine scale sets can
     * be placed automatically on the dedicated host group. Automatic placement means resources are allocated on
     * dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when
     * not provided. Minimum api-version: 2020-06-01.
     * 
     * @return the supportAutomaticPlacement value.
     */
    public Boolean supportAutomaticPlacement() {
        return this.innerProperties() == null ? null : this.innerProperties().supportAutomaticPlacement();
    }

    /**
     * Set the supportAutomaticPlacement property: Specifies whether virtual machines or virtual machine scale sets can
     * be placed automatically on the dedicated host group. Automatic placement means resources are allocated on
     * dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when
     * not provided. Minimum api-version: 2020-06-01.
     * 
     * @param supportAutomaticPlacement the supportAutomaticPlacement value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withSupportAutomaticPlacement(Boolean supportAutomaticPlacement) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostGroupProperties();
        }
        this.innerProperties().withSupportAutomaticPlacement(supportAutomaticPlacement);
        return this;
    }

    /**
     * Get the additionalCapabilities property: Enables or disables a capability on the dedicated host group. Minimum
     * api-version: 2022-03-01.
     * 
     * @return the additionalCapabilities value.
     */
    public DedicatedHostGroupPropertiesAdditionalCapabilities additionalCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalCapabilities();
    }

    /**
     * Set the additionalCapabilities property: Enables or disables a capability on the dedicated host group. Minimum
     * api-version: 2022-03-01.
     * 
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate
        withAdditionalCapabilities(DedicatedHostGroupPropertiesAdditionalCapabilities additionalCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedHostGroupProperties();
        }
        this.innerProperties().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DedicatedHostGroupUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DedicatedHostGroupUpdate if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DedicatedHostGroupUpdate.
     */
    public static DedicatedHostGroupUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DedicatedHostGroupUpdate deserializedDedicatedHostGroupUpdate = new DedicatedHostGroupUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDedicatedHostGroupUpdate.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedDedicatedHostGroupUpdate.innerProperties
                        = DedicatedHostGroupProperties.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedDedicatedHostGroupUpdate.zones = zones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDedicatedHostGroupUpdate;
        });
    }
}
