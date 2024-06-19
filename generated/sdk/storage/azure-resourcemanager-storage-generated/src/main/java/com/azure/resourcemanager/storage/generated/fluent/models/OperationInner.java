// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.OperationDisplay;
import com.azure.resourcemanager.storage.generated.models.ServiceSpecification;
import java.io.IOException;

/**
 * Storage REST API operation definition.
 */
@Fluent
public final class OperationInner implements JsonSerializable<OperationInner> {
    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    private String name;

    /*
     * Display metadata associated with the operation.
     */
    private OperationDisplay display;

    /*
     * The origin of operations.
     */
    private String origin;

    /*
     * Properties of operation, include metric specifications.
     */
    private OperationProperties innerOperationProperties;

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
     * Get the display property: Display metadata associated with the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display metadata associated with the operation.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The origin of operations.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin of operations.
     * 
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the innerOperationProperties property: Properties of operation, include metric specifications.
     * 
     * @return the innerOperationProperties value.
     */
    private OperationProperties innerOperationProperties() {
        return this.innerOperationProperties;
    }

    /**
     * Get the serviceSpecification property: One property of operation, include metric specifications.
     * 
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.innerOperationProperties() == null ? null : this.innerOperationProperties().serviceSpecification();
    }

    /**
     * Set the serviceSpecification property: One property of operation, include metric specifications.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withServiceSpecification(ServiceSpecification serviceSpecification) {
        if (this.innerOperationProperties() == null) {
            this.innerOperationProperties = new OperationProperties();
        }
        this.innerOperationProperties().withServiceSpecification(serviceSpecification);
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
        if (innerOperationProperties() != null) {
            innerOperationProperties().validate();
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
        jsonWriter.writeStringField("origin", this.origin);
        jsonWriter.writeJsonField("properties", this.innerOperationProperties);
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
                } else if ("origin".equals(fieldName)) {
                    deserializedOperationInner.origin = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOperationInner.innerOperationProperties = OperationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationInner;
        });
    }
}
