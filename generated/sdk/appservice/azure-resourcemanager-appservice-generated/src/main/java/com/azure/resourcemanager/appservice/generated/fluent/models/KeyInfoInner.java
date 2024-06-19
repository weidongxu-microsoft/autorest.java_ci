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
 * Function key info.
 */
@Fluent
public final class KeyInfoInner implements JsonSerializable<KeyInfoInner> {
    /*
     * Key name
     */
    private String name;

    /*
     * Key value
     */
    private String value;

    /**
     * Creates an instance of KeyInfoInner class.
     */
    public KeyInfoInner() {
    }

    /**
     * Get the name property: Key name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Key name.
     * 
     * @param name the name value to set.
     * @return the KeyInfoInner object itself.
     */
    public KeyInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Key value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Key value.
     * 
     * @param value the value value to set.
     * @return the KeyInfoInner object itself.
     */
    public KeyInfoInner withValue(String value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyInfoInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyInfoInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyInfoInner.
     */
    public static KeyInfoInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyInfoInner deserializedKeyInfoInner = new KeyInfoInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedKeyInfoInner.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedKeyInfoInner.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyInfoInner;
        });
    }
}
