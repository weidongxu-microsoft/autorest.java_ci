// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes The zonal capabilities of a SKU.
 */
@Immutable
public final class ResourceSkuZoneDetails implements JsonSerializable<ResourceSkuZoneDetails> {
    /*
     * The set of zones that the SKU is available in with the specified capabilities.
     */
    private List<String> name;

    /*
     * A list of capabilities that are available for the SKU in the specified list of zones.
     */
    private List<ResourceSkuCapabilities> capabilities;

    /**
     * Creates an instance of ResourceSkuZoneDetails class.
     */
    public ResourceSkuZoneDetails() {
    }

    /**
     * Get the name property: The set of zones that the SKU is available in with the specified capabilities.
     * 
     * @return the name value.
     */
    public List<String> name() {
        return this.name;
    }

    /**
     * Get the capabilities property: A list of capabilities that are available for the SKU in the specified list of
     * zones.
     * 
     * @return the capabilities value.
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
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
     * Reads an instance of ResourceSkuZoneDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuZoneDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSkuZoneDetails.
     */
    public static ResourceSkuZoneDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuZoneDetails deserializedResourceSkuZoneDetails = new ResourceSkuZoneDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    List<String> name = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuZoneDetails.name = name;
                } else if ("capabilities".equals(fieldName)) {
                    List<ResourceSkuCapabilities> capabilities
                        = reader.readArray(reader1 -> ResourceSkuCapabilities.fromJson(reader1));
                    deserializedResourceSkuZoneDetails.capabilities = capabilities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuZoneDetails;
        });
    }
}
