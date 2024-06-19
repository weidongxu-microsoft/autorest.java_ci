// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysql.generated.models.ServerEditionCapability;
import java.io.IOException;
import java.util.List;

/**
 * Location capabilities.
 */
@Immutable
public final class CapabilityPropertiesInner implements JsonSerializable<CapabilityPropertiesInner> {
    /*
     * zone name
     */
    private String zone;

    /*
     * Supported high availability mode
     */
    private List<String> supportedHAMode;

    /*
     * supported geo backup regions
     */
    private List<String> supportedGeoBackupRegions;

    /*
     * A list of supported flexible server editions.
     */
    private List<ServerEditionCapability> supportedFlexibleServerEditions;

    /**
     * Creates an instance of CapabilityPropertiesInner class.
     */
    public CapabilityPropertiesInner() {
    }

    /**
     * Get the zone property: zone name.
     * 
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Get the supportedHAMode property: Supported high availability mode.
     * 
     * @return the supportedHAMode value.
     */
    public List<String> supportedHAMode() {
        return this.supportedHAMode;
    }

    /**
     * Get the supportedGeoBackupRegions property: supported geo backup regions.
     * 
     * @return the supportedGeoBackupRegions value.
     */
    public List<String> supportedGeoBackupRegions() {
        return this.supportedGeoBackupRegions;
    }

    /**
     * Get the supportedFlexibleServerEditions property: A list of supported flexible server editions.
     * 
     * @return the supportedFlexibleServerEditions value.
     */
    public List<ServerEditionCapability> supportedFlexibleServerEditions() {
        return this.supportedFlexibleServerEditions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedFlexibleServerEditions() != null) {
            supportedFlexibleServerEditions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapabilityPropertiesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapabilityPropertiesInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapabilityPropertiesInner.
     */
    public static CapabilityPropertiesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapabilityPropertiesInner deserializedCapabilityPropertiesInner = new CapabilityPropertiesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("zone".equals(fieldName)) {
                    deserializedCapabilityPropertiesInner.zone = reader.getString();
                } else if ("supportedHAMode".equals(fieldName)) {
                    List<String> supportedHAMode = reader.readArray(reader1 -> reader1.getString());
                    deserializedCapabilityPropertiesInner.supportedHAMode = supportedHAMode;
                } else if ("supportedGeoBackupRegions".equals(fieldName)) {
                    List<String> supportedGeoBackupRegions = reader.readArray(reader1 -> reader1.getString());
                    deserializedCapabilityPropertiesInner.supportedGeoBackupRegions = supportedGeoBackupRegions;
                } else if ("supportedFlexibleServerEditions".equals(fieldName)) {
                    List<ServerEditionCapability> supportedFlexibleServerEditions
                        = reader.readArray(reader1 -> ServerEditionCapability.fromJson(reader1));
                    deserializedCapabilityPropertiesInner.supportedFlexibleServerEditions
                        = supportedFlexibleServerEditions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapabilityPropertiesInner;
        });
    }
}
