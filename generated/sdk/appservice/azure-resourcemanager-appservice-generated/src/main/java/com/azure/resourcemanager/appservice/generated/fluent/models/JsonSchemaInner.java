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
 * The JSON schema.
 */
@Fluent
public final class JsonSchemaInner implements JsonSerializable<JsonSchemaInner> {
    /*
     * The JSON title.
     */
    private String title;

    /*
     * The JSON content.
     */
    private String content;

    /**
     * Creates an instance of JsonSchemaInner class.
     */
    public JsonSchemaInner() {
    }

    /**
     * Get the title property: The JSON title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The JSON title.
     * 
     * @param title the title value to set.
     * @return the JsonSchemaInner object itself.
     */
    public JsonSchemaInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: The JSON content.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The JSON content.
     * 
     * @param content the content value to set.
     * @return the JsonSchemaInner object itself.
     */
    public JsonSchemaInner withContent(String content) {
        this.content = content;
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
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("content", this.content);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonSchemaInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonSchemaInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JsonSchemaInner.
     */
    public static JsonSchemaInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JsonSchemaInner deserializedJsonSchemaInner = new JsonSchemaInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("title".equals(fieldName)) {
                    deserializedJsonSchemaInner.title = reader.getString();
                } else if ("content".equals(fieldName)) {
                    deserializedJsonSchemaInner.content = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJsonSchemaInner;
        });
    }
}
