// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Blob index tag based filtering for blob objects.
 */
@Fluent
public final class TagFilter implements JsonSerializable<TagFilter> {
    /*
     * This is the filter tag name, it can have 1 - 128 characters
     */
    private String name;

    /*
     * This is the comparison operator which is used for object comparison and filtering. Only == (equality operator) is
     * currently supported
     */
    private String op;

    /*
     * This is the filter tag value field used for tag based filtering, it can have 0 - 256 characters
     */
    private String value;

    /**
     * Creates an instance of TagFilter class.
     */
    public TagFilter() {
    }

    /**
     * Get the name property: This is the filter tag name, it can have 1 - 128 characters.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: This is the filter tag name, it can have 1 - 128 characters.
     * 
     * @param name the name value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the op property: This is the comparison operator which is used for object comparison and filtering. Only ==
     * (equality operator) is currently supported.
     * 
     * @return the op value.
     */
    public String op() {
        return this.op;
    }

    /**
     * Set the op property: This is the comparison operator which is used for object comparison and filtering. Only ==
     * (equality operator) is currently supported.
     * 
     * @param op the op value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * Get the value property: This is the filter tag value field used for tag based filtering, it can have 0 - 256
     * characters.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: This is the filter tag value field used for tag based filtering, it can have 0 - 256
     * characters.
     * 
     * @param value the value value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model TagFilter"));
        }
        if (op() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property op in model TagFilter"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model TagFilter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TagFilter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("op", this.op);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagFilter if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TagFilter.
     */
    public static TagFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagFilter deserializedTagFilter = new TagFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTagFilter.name = reader.getString();
                } else if ("op".equals(fieldName)) {
                    deserializedTagFilter.op = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedTagFilter.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagFilter;
        });
    }
}
