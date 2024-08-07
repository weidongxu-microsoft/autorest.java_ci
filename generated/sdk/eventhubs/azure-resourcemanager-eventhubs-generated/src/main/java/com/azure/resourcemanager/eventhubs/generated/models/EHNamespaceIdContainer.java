// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The full ARM ID of an Event Hubs Namespace.
 */
@Fluent
public final class EHNamespaceIdContainer implements JsonSerializable<EHNamespaceIdContainer> {
    /*
     * id parameter
     */
    private String id;

    /**
     * Creates an instance of EHNamespaceIdContainer class.
     */
    public EHNamespaceIdContainer() {
    }

    /**
     * Get the id property: id parameter.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: id parameter.
     * 
     * @param id the id value to set.
     * @return the EHNamespaceIdContainer object itself.
     */
    public EHNamespaceIdContainer withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EHNamespaceIdContainer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EHNamespaceIdContainer if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EHNamespaceIdContainer.
     */
    public static EHNamespaceIdContainer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EHNamespaceIdContainer deserializedEHNamespaceIdContainer = new EHNamespaceIdContainer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedEHNamespaceIdContainer.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEHNamespaceIdContainer;
        });
    }
}
