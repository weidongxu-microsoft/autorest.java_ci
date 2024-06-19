// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Type of operation: get, read, delete, etc.
 */
@Fluent
public final class DimensionProperties implements JsonSerializable<DimensionProperties> {
    /*
     * Name of dimension.
     */
    private String name;

    /*
     * Display name of dimension.
     */
    private String displayName;

    /*
     * Property to specify whether the dimension should be exported for Shoebox.
     */
    private Boolean toBeExportedForShoebox;

    /**
     * Creates an instance of DimensionProperties class.
     */
    public DimensionProperties() {
    }

    /**
     * Get the name property: Name of dimension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of dimension.
     * 
     * @param name the name value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of dimension.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of dimension.
     * 
     * @param displayName the displayName value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: Property to specify whether the dimension should be exported for
     * Shoebox.
     * 
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: Property to specify whether the dimension should be exported for
     * Shoebox.
     * 
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the DimensionProperties object itself.
     */
    public DimensionProperties withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeBooleanField("toBeExportedForShoebox", this.toBeExportedForShoebox);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DimensionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DimensionProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DimensionProperties.
     */
    public static DimensionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DimensionProperties deserializedDimensionProperties = new DimensionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDimensionProperties.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedDimensionProperties.displayName = reader.getString();
                } else if ("toBeExportedForShoebox".equals(fieldName)) {
                    deserializedDimensionProperties.toBeExportedForShoebox = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimensionProperties;
        });
    }
}
