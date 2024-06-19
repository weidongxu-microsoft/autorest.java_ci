// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSkuInstances;
import java.io.IOException;
import java.util.List;

/**
 * Network Virtual Appliance Sku Properties
 * 
 * Properties specific to NetworkVirtualApplianceSkus.
 */
@Fluent
public final class NetworkVirtualApplianceSkuPropertiesFormat
    implements JsonSerializable<NetworkVirtualApplianceSkuPropertiesFormat> {
    /*
     * Network Virtual Appliance Sku vendor.
     */
    private String vendor;

    /*
     * Available Network Virtual Appliance versions.
     */
    private List<String> availableVersions;

    /*
     * The list of scale units available.
     */
    private List<NetworkVirtualApplianceSkuInstances> availableScaleUnits;

    /**
     * Creates an instance of NetworkVirtualApplianceSkuPropertiesFormat class.
     */
    public NetworkVirtualApplianceSkuPropertiesFormat() {
    }

    /**
     * Get the vendor property: Network Virtual Appliance Sku vendor.
     * 
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get the availableVersions property: Available Network Virtual Appliance versions.
     * 
     * @return the availableVersions value.
     */
    public List<String> availableVersions() {
        return this.availableVersions;
    }

    /**
     * Get the availableScaleUnits property: The list of scale units available.
     * 
     * @return the availableScaleUnits value.
     */
    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        return this.availableScaleUnits;
    }

    /**
     * Set the availableScaleUnits property: The list of scale units available.
     * 
     * @param availableScaleUnits the availableScaleUnits value to set.
     * @return the NetworkVirtualApplianceSkuPropertiesFormat object itself.
     */
    public NetworkVirtualApplianceSkuPropertiesFormat
        withAvailableScaleUnits(List<NetworkVirtualApplianceSkuInstances> availableScaleUnits) {
        this.availableScaleUnits = availableScaleUnits;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableScaleUnits() != null) {
            availableScaleUnits().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("availableScaleUnits", this.availableScaleUnits,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkVirtualApplianceSkuPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkVirtualApplianceSkuPropertiesFormat if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkVirtualApplianceSkuPropertiesFormat.
     */
    public static NetworkVirtualApplianceSkuPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkVirtualApplianceSkuPropertiesFormat deserializedNetworkVirtualApplianceSkuPropertiesFormat
                = new NetworkVirtualApplianceSkuPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vendor".equals(fieldName)) {
                    deserializedNetworkVirtualApplianceSkuPropertiesFormat.vendor = reader.getString();
                } else if ("availableVersions".equals(fieldName)) {
                    List<String> availableVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkVirtualApplianceSkuPropertiesFormat.availableVersions = availableVersions;
                } else if ("availableScaleUnits".equals(fieldName)) {
                    List<NetworkVirtualApplianceSkuInstances> availableScaleUnits
                        = reader.readArray(reader1 -> NetworkVirtualApplianceSkuInstances.fromJson(reader1));
                    deserializedNetworkVirtualApplianceSkuPropertiesFormat.availableScaleUnits = availableScaleUnits;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkVirtualApplianceSkuPropertiesFormat;
        });
    }
}
