// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The CloudServiceUpdate model.
 */
@Fluent
public final class CloudServiceUpdate implements JsonSerializable<CloudServiceUpdate> {
    /*
     * Resource tags
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of CloudServiceUpdate class.
     */
    public CloudServiceUpdate() {
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
     * @return the CloudServiceUpdate object itself.
     */
    public CloudServiceUpdate withTags(Map<String, String> tags) {
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
     * Reads an instance of CloudServiceUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudServiceUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudServiceUpdate.
     */
    public static CloudServiceUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudServiceUpdate deserializedCloudServiceUpdate = new CloudServiceUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCloudServiceUpdate.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudServiceUpdate;
        });
    }
}
