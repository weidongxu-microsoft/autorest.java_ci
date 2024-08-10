// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Specifies information about the proximity placement group.
 */
@Fluent
public final class ProximityPlacementGroupUpdate extends UpdateResource {
    /**
     * Creates an instance of ProximityPlacementGroupUpdate class.
     */
    public ProximityPlacementGroupUpdate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProximityPlacementGroupUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProximityPlacementGroupUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProximityPlacementGroupUpdate if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProximityPlacementGroupUpdate.
     */
    public static ProximityPlacementGroupUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProximityPlacementGroupUpdate deserializedProximityPlacementGroupUpdate
                = new ProximityPlacementGroupUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedProximityPlacementGroupUpdate.withTags(tags);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProximityPlacementGroupUpdate;
        });
    }
}
