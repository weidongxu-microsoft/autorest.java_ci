// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of an Extended Location.
 */
@Fluent
public final class ExtendedLocation implements JsonSerializable<ExtendedLocation> {
    /*
     * Fully qualified name of the extended location.
     */
    private String name;

    /*
     * Type of the extended location.
     */
    private String type;

    /**
     * Creates an instance of ExtendedLocation class.
     */
    public ExtendedLocation() {
    }

    /**
     * Get the name property: Fully qualified name of the extended location.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Fully qualified name of the extended location.
     * 
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the extended location.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the extended location.
     * 
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(String type) {
        this.type = type;
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
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtendedLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtendedLocation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtendedLocation.
     */
    public static ExtendedLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtendedLocation deserializedExtendedLocation = new ExtendedLocation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedExtendedLocation.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExtendedLocation.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtendedLocation;
        });
    }
}
