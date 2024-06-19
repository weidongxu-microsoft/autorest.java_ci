// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * OS family properties.
 */
@Immutable
public final class OSFamilyProperties implements JsonSerializable<OSFamilyProperties> {
    /*
     * The OS family name.
     */
    private String name;

    /*
     * The OS family label.
     */
    private String label;

    /*
     * List of OS versions belonging to this family.
     */
    private List<OSVersionPropertiesBase> versions;

    /**
     * Creates an instance of OSFamilyProperties class.
     */
    public OSFamilyProperties() {
    }

    /**
     * Get the name property: The OS family name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the label property: The OS family label.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Get the versions property: List of OS versions belonging to this family.
     * 
     * @return the versions value.
     */
    public List<OSVersionPropertiesBase> versions() {
        return this.versions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (versions() != null) {
            versions().forEach(e -> e.validate());
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
     * Reads an instance of OSFamilyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OSFamilyProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OSFamilyProperties.
     */
    public static OSFamilyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OSFamilyProperties deserializedOSFamilyProperties = new OSFamilyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOSFamilyProperties.name = reader.getString();
                } else if ("label".equals(fieldName)) {
                    deserializedOSFamilyProperties.label = reader.getString();
                } else if ("versions".equals(fieldName)) {
                    List<OSVersionPropertiesBase> versions
                        = reader.readArray(reader1 -> OSVersionPropertiesBase.fromJson(reader1));
                    deserializedOSFamilyProperties.versions = versions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOSFamilyProperties;
        });
    }
}
