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

/**
 * The parameters used to check the availability of the managed hsm name.
 */
@Fluent
public final class CheckMhsmNameAvailabilityParameters
    implements JsonSerializable<CheckMhsmNameAvailabilityParameters> {
    /*
     * The managed hsm name.
     */
    private String name;

    /**
     * Creates an instance of CheckMhsmNameAvailabilityParameters class.
     */
    public CheckMhsmNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The managed hsm name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The managed hsm name.
     * 
     * @param name the name value to set.
     * @return the CheckMhsmNameAvailabilityParameters object itself.
     */
    public CheckMhsmNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model CheckMhsmNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckMhsmNameAvailabilityParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckMhsmNameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckMhsmNameAvailabilityParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CheckMhsmNameAvailabilityParameters.
     */
    public static CheckMhsmNameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckMhsmNameAvailabilityParameters deserializedCheckMhsmNameAvailabilityParameters
                = new CheckMhsmNameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCheckMhsmNameAvailabilityParameters.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckMhsmNameAvailabilityParameters;
        });
    }
}
