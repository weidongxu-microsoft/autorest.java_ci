// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ChannelInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the List Channels operation.
 */
@Fluent
public final class ChannelsListResult implements JsonSerializable<ChannelsListResult> {
    /*
     * A collection of Channels.
     */
    private List<ChannelInner> value;

    /*
     * A link for the next page of channels.
     */
    private String nextLink;

    /**
     * Creates an instance of ChannelsListResult class.
     */
    public ChannelsListResult() {
    }

    /**
     * Get the value property: A collection of Channels.
     * 
     * @return the value value.
     */
    public List<ChannelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Channels.
     * 
     * @param value the value value to set.
     * @return the ChannelsListResult object itself.
     */
    public ChannelsListResult withValue(List<ChannelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of channels.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of channels.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ChannelsListResult object itself.
     */
    public ChannelsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChannelsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChannelsListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChannelsListResult.
     */
    public static ChannelsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChannelsListResult deserializedChannelsListResult = new ChannelsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ChannelInner> value = reader.readArray(reader1 -> ChannelInner.fromJson(reader1));
                    deserializedChannelsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedChannelsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChannelsListResult;
        });
    }
}
