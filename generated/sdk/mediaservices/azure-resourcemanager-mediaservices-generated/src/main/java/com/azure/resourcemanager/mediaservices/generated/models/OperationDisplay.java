// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Operation details.
 */
@Fluent
public final class OperationDisplay implements JsonSerializable<OperationDisplay> {
    /*
     * The service provider.
     */
    private String provider;

    /*
     * Resource on which the operation is performed.
     */
    private String resource;

    /*
     * The operation type.
     */
    private String operation;

    /*
     * The operation description.
     */
    private String description;

    /**
     * Creates an instance of OperationDisplay class.
     */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: The service provider.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The service provider.
     * 
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed.
     * 
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The operation type.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation type.
     * 
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The operation description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The operation description.
     * 
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
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
        jsonWriter.writeStringField("provider", this.provider);
        jsonWriter.writeStringField("resource", this.resource);
        jsonWriter.writeStringField("operation", this.operation);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationDisplay from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationDisplay if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationDisplay.
     */
    public static OperationDisplay fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationDisplay deserializedOperationDisplay = new OperationDisplay();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    deserializedOperationDisplay.provider = reader.getString();
                } else if ("resource".equals(fieldName)) {
                    deserializedOperationDisplay.resource = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    deserializedOperationDisplay.operation = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedOperationDisplay.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationDisplay;
        });
    }
}
