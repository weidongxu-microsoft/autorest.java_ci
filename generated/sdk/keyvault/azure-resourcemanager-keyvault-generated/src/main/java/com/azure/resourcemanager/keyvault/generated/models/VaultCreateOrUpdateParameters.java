// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters for creating or updating a vault.
 */
@Fluent
public final class VaultCreateOrUpdateParameters implements JsonSerializable<VaultCreateOrUpdateParameters> {
    /*
     * The supported Azure location where the key vault should be created.
     */
    private String location;

    /*
     * The tags that will be assigned to the key vault.
     */
    private Map<String, String> tags;

    /*
     * Properties of the vault
     */
    private VaultProperties properties;

    /**
     * Creates an instance of VaultCreateOrUpdateParameters class.
     */
    public VaultCreateOrUpdateParameters() {
    }

    /**
     * Get the location property: The supported Azure location where the key vault should be created.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The supported Azure location where the key vault should be created.
     * 
     * @param location the location value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The tags that will be assigned to the key vault.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the key vault.
     * 
     * @param tags the tags value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the vault.
     * 
     * @return the properties value.
     */
    public VaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     * 
     * @param properties the properties value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model VaultCreateOrUpdateParameters"));
        }
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model VaultCreateOrUpdateParameters"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultCreateOrUpdateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultCreateOrUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultCreateOrUpdateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VaultCreateOrUpdateParameters.
     */
    public static VaultCreateOrUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultCreateOrUpdateParameters deserializedVaultCreateOrUpdateParameters
                = new VaultCreateOrUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedVaultCreateOrUpdateParameters.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVaultCreateOrUpdateParameters.properties = VaultProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVaultCreateOrUpdateParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultCreateOrUpdateParameters;
        });
    }
}
