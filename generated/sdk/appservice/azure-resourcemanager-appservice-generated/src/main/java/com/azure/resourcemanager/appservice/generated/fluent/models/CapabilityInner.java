// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the capabilities/features allowed for a specific SKU.
 */
@Fluent
public final class CapabilityInner implements JsonSerializable<CapabilityInner> {
    /*
     * Name of the SKU capability.
     */
    private String name;

    /*
     * Value of the SKU capability.
     */
    private String value;

    /*
     * Reason of the SKU capability.
     */
    private String reason;

    /**
     * Creates an instance of CapabilityInner class.
     */
    public CapabilityInner() {
    }

    /**
     * Get the name property: Name of the SKU capability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SKU capability.
     * 
     * @param name the name value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the SKU capability.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the SKU capability.
     * 
     * @param value the value value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the reason property: Reason of the SKU capability.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason of the SKU capability.
     * 
     * @param reason the reason value to set.
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withReason(String reason) {
        this.reason = reason;
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
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("reason", this.reason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapabilityInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapabilityInner.
     */
    public static CapabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapabilityInner deserializedCapabilityInner = new CapabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCapabilityInner.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedCapabilityInner.value = reader.getString();
                } else if ("reason".equals(fieldName)) {
                    deserializedCapabilityInner.reason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapabilityInner;
        });
    }
}
