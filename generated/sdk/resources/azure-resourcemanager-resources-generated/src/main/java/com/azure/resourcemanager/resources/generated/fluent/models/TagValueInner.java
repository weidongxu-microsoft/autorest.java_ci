// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resources.generated.models.TagCount;
import java.io.IOException;

/**
 * Tag information.
 */
@Fluent
public final class TagValueInner implements JsonSerializable<TagValueInner> {
    /*
     * The tag value ID.
     */
    private String id;

    /*
     * The tag value.
     */
    private String tagValue;

    /*
     * The tag value count.
     */
    private TagCount count;

    /**
     * Creates an instance of TagValueInner class.
     */
    public TagValueInner() {
    }

    /**
     * Get the id property: The tag value ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tagValue property: The tag value.
     * 
     * @return the tagValue value.
     */
    public String tagValue() {
        return this.tagValue;
    }

    /**
     * Set the tagValue property: The tag value.
     * 
     * @param tagValue the tagValue value to set.
     * @return the TagValueInner object itself.
     */
    public TagValueInner withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Get the count property: The tag value count.
     * 
     * @return the count value.
     */
    public TagCount count() {
        return this.count;
    }

    /**
     * Set the count property: The tag value count.
     * 
     * @param count the count value to set.
     * @return the TagValueInner object itself.
     */
    public TagValueInner withCount(TagCount count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (count() != null) {
            count().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tagValue", this.tagValue);
        jsonWriter.writeJsonField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagValueInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagValueInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TagValueInner.
     */
    public static TagValueInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagValueInner deserializedTagValueInner = new TagValueInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTagValueInner.id = reader.getString();
                } else if ("tagValue".equals(fieldName)) {
                    deserializedTagValueInner.tagValue = reader.getString();
                } else if ("count".equals(fieldName)) {
                    deserializedTagValueInner.count = TagCount.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagValueInner;
        });
    }
}
