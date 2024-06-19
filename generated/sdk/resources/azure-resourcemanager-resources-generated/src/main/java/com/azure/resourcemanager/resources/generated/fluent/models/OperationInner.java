// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.generated.models.OperationDisplay;
import java.io.IOException;

/**
 * Microsoft.Resources operation.
 */
@Fluent
public final class OperationInner implements JsonSerializable<OperationInner> {
    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    private String name;

    /*
     * The object that represents the operation.
     */
    private OperationDisplay display;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The object that represents the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("display", this.display);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationInner.
     */
    public static OperationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationInner deserializedOperationInner = new OperationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedOperationInner.display = OperationDisplay.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationInner;
        });
    }
}
