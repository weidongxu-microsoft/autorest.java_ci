// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * A container holding only the Tags for a resource, allowing the user to update the tags on a WebTest instance.
 */
@Fluent
public final class TagsResource implements JsonSerializable<TagsResource> {
    /*
     * Resource tags
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of TagsResource class.
     */
    public TagsResource() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the TagsResource object itself.
     */
    public TagsResource withTags(Map<String, String> tags) {
        this.tags = tags;
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagsResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagsResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TagsResource.
     */
    public static TagsResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagsResource deserializedTagsResource = new TagsResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedTagsResource.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagsResource;
        });
    }
}
