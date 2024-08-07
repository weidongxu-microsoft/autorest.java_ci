// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.models.EHNamespaceIdContainer;
import java.io.IOException;
import java.util.List;

/**
 * The response of the List Namespace IDs operation.
 */
@Fluent
public final class EHNamespaceIdListResultInner implements JsonSerializable<EHNamespaceIdListResultInner> {
    /*
     * Result of the List Namespace IDs operation
     */
    private List<EHNamespaceIdContainer> value;

    /**
     * Creates an instance of EHNamespaceIdListResultInner class.
     */
    public EHNamespaceIdListResultInner() {
    }

    /**
     * Get the value property: Result of the List Namespace IDs operation.
     * 
     * @return the value value.
     */
    public List<EHNamespaceIdContainer> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Namespace IDs operation.
     * 
     * @param value the value value to set.
     * @return the EHNamespaceIdListResultInner object itself.
     */
    public EHNamespaceIdListResultInner withValue(List<EHNamespaceIdContainer> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

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
     * Reads an instance of EHNamespaceIdListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EHNamespaceIdListResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EHNamespaceIdListResultInner.
     */
    public static EHNamespaceIdListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EHNamespaceIdListResultInner deserializedEHNamespaceIdListResultInner = new EHNamespaceIdListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<EHNamespaceIdContainer> value
                        = reader.readArray(reader1 -> EHNamespaceIdContainer.fromJson(reader1));
                    deserializedEHNamespaceIdListResultInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEHNamespaceIdListResultInner;
        });
    }
}
