// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Result of the request to calculate template hash. It contains a string of minified template and its hash.
 */
@Fluent
public final class TemplateHashResultInner implements JsonSerializable<TemplateHashResultInner> {
    /*
     * The minified template string.
     */
    private String minifiedTemplate;

    /*
     * The template hash.
     */
    private String templateHash;

    /**
     * Creates an instance of TemplateHashResultInner class.
     */
    public TemplateHashResultInner() {
    }

    /**
     * Get the minifiedTemplate property: The minified template string.
     * 
     * @return the minifiedTemplate value.
     */
    public String minifiedTemplate() {
        return this.minifiedTemplate;
    }

    /**
     * Set the minifiedTemplate property: The minified template string.
     * 
     * @param minifiedTemplate the minifiedTemplate value to set.
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withMinifiedTemplate(String minifiedTemplate) {
        this.minifiedTemplate = minifiedTemplate;
        return this;
    }

    /**
     * Get the templateHash property: The template hash.
     * 
     * @return the templateHash value.
     */
    public String templateHash() {
        return this.templateHash;
    }

    /**
     * Set the templateHash property: The template hash.
     * 
     * @param templateHash the templateHash value to set.
     * @return the TemplateHashResultInner object itself.
     */
    public TemplateHashResultInner withTemplateHash(String templateHash) {
        this.templateHash = templateHash;
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
        jsonWriter.writeStringField("minifiedTemplate", this.minifiedTemplate);
        jsonWriter.writeStringField("templateHash", this.templateHash);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TemplateHashResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TemplateHashResultInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TemplateHashResultInner.
     */
    public static TemplateHashResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TemplateHashResultInner deserializedTemplateHashResultInner = new TemplateHashResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minifiedTemplate".equals(fieldName)) {
                    deserializedTemplateHashResultInner.minifiedTemplate = reader.getString();
                } else if ("templateHash".equals(fieldName)) {
                    deserializedTemplateHashResultInner.templateHash = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTemplateHashResultInner;
        });
    }
}
