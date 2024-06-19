// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ResourceHealthMetadata resource specific properties.
 */
@Fluent
public final class ResourceHealthMetadataProperties implements JsonSerializable<ResourceHealthMetadataProperties> {
    /*
     * The category that the resource matches in the RHC Policy File
     */
    private String category;

    /*
     * Is there a health signal for the resource
     */
    private Boolean signalAvailability;

    /**
     * Creates an instance of ResourceHealthMetadataProperties class.
     */
    public ResourceHealthMetadataProperties() {
    }

    /**
     * Get the category property: The category that the resource matches in the RHC Policy File.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category that the resource matches in the RHC Policy File.
     * 
     * @param category the category value to set.
     * @return the ResourceHealthMetadataProperties object itself.
     */
    public ResourceHealthMetadataProperties withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the signalAvailability property: Is there a health signal for the resource.
     * 
     * @return the signalAvailability value.
     */
    public Boolean signalAvailability() {
        return this.signalAvailability;
    }

    /**
     * Set the signalAvailability property: Is there a health signal for the resource.
     * 
     * @param signalAvailability the signalAvailability value to set.
     * @return the ResourceHealthMetadataProperties object itself.
     */
    public ResourceHealthMetadataProperties withSignalAvailability(Boolean signalAvailability) {
        this.signalAvailability = signalAvailability;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", this.category);
        jsonWriter.writeBooleanField("signalAvailability", this.signalAvailability);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceHealthMetadataProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceHealthMetadataProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceHealthMetadataProperties.
     */
    public static ResourceHealthMetadataProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceHealthMetadataProperties deserializedResourceHealthMetadataProperties
                = new ResourceHealthMetadataProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedResourceHealthMetadataProperties.category = reader.getString();
                } else if ("signalAvailability".equals(fieldName)) {
                    deserializedResourceHealthMetadataProperties.signalAvailability
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceHealthMetadataProperties;
        });
    }
}
