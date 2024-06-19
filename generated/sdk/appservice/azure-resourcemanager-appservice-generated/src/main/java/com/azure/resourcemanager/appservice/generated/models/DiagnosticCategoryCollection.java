// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.DiagnosticCategoryInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection of Diagnostic Categories.
 */
@Fluent
public final class DiagnosticCategoryCollection implements JsonSerializable<DiagnosticCategoryCollection> {
    /*
     * Collection of resources.
     */
    private List<DiagnosticCategoryInner> value;

    /*
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of DiagnosticCategoryCollection class.
     */
    public DiagnosticCategoryCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<DiagnosticCategoryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the DiagnosticCategoryCollection object itself.
     */
    public DiagnosticCategoryCollection withValue(List<DiagnosticCategoryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model DiagnosticCategoryCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticCategoryCollection.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticCategoryCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticCategoryCollection if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiagnosticCategoryCollection.
     */
    public static DiagnosticCategoryCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticCategoryCollection deserializedDiagnosticCategoryCollection = new DiagnosticCategoryCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DiagnosticCategoryInner> value
                        = reader.readArray(reader1 -> DiagnosticCategoryInner.fromJson(reader1));
                    deserializedDiagnosticCategoryCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDiagnosticCategoryCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticCategoryCollection;
        });
    }
}
