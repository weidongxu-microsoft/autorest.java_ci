// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Properties of the Partner Destination that can be updated.
 */
@Fluent
public final class PartnerDestinationUpdateParameters implements JsonSerializable<PartnerDestinationUpdateParameters> {
    /*
     * Tags of the Partner Destination resource.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of PartnerDestinationUpdateParameters class.
     */
    public PartnerDestinationUpdateParameters() {
    }

    /**
     * Get the tags property: Tags of the Partner Destination resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the Partner Destination resource.
     * 
     * @param tags the tags value to set.
     * @return the PartnerDestinationUpdateParameters object itself.
     */
    public PartnerDestinationUpdateParameters withTags(Map<String, String> tags) {
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
     * Reads an instance of PartnerDestinationUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PartnerDestinationUpdateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PartnerDestinationUpdateParameters.
     */
    public static PartnerDestinationUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PartnerDestinationUpdateParameters deserializedPartnerDestinationUpdateParameters
                = new PartnerDestinationUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPartnerDestinationUpdateParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartnerDestinationUpdateParameters;
        });
    }
}
