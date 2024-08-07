// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.EventhubInner;
import java.io.IOException;
import java.util.List;

/**
 * The result of the List EventHubs operation.
 */
@Fluent
public final class EventHubListResult implements JsonSerializable<EventHubListResult> {
    /*
     * Result of the List EventHubs operation.
     */
    private List<EventhubInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of EventHubs.
     */
    private String nextLink;

    /**
     * Creates an instance of EventHubListResult class.
     */
    public EventHubListResult() {
    }

    /**
     * Get the value property: Result of the List EventHubs operation.
     * 
     * @return the value value.
     */
    public List<EventhubInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List EventHubs operation.
     * 
     * @param value the value value to set.
     * @return the EventHubListResult object itself.
     */
    public EventHubListResult withValue(List<EventhubInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * EventHubs.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * EventHubs.
     * 
     * @param nextLink the nextLink value to set.
     * @return the EventHubListResult object itself.
     */
    public EventHubListResult withNextLink(String nextLink) {
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
     * Reads an instance of EventHubListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventHubListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventHubListResult.
     */
    public static EventHubListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventHubListResult deserializedEventHubListResult = new EventHubListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<EventhubInner> value = reader.readArray(reader1 -> EventhubInner.fromJson(reader1));
                    deserializedEventHubListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedEventHubListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventHubListResult;
        });
    }
}
