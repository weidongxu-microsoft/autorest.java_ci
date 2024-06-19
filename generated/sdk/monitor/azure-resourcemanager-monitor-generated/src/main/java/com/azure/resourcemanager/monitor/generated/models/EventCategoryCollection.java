// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import java.io.IOException;
import java.util.List;

/**
 * A collection of event categories. Currently possible values are: Administrative, Security, ServiceHealth, Alert,
 * Recommendation, Policy.
 */
@Fluent
public final class EventCategoryCollection implements JsonSerializable<EventCategoryCollection> {
    /*
     * the list that includes the Azure event categories.
     */
    private List<LocalizableStringInner> value;

    /**
     * Creates an instance of EventCategoryCollection class.
     */
    public EventCategoryCollection() {
    }

    /**
     * Get the value property: the list that includes the Azure event categories.
     * 
     * @return the value value.
     */
    public List<LocalizableStringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list that includes the Azure event categories.
     * 
     * @param value the value value to set.
     * @return the EventCategoryCollection object itself.
     */
    public EventCategoryCollection withValue(List<LocalizableStringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model EventCategoryCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventCategoryCollection.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventCategoryCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventCategoryCollection if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EventCategoryCollection.
     */
    public static EventCategoryCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventCategoryCollection deserializedEventCategoryCollection = new EventCategoryCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LocalizableStringInner> value
                        = reader.readArray(reader1 -> LocalizableStringInner.fromJson(reader1));
                    deserializedEventCategoryCollection.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventCategoryCollection;
        });
    }
}
