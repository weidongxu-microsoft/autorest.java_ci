// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.generated.fluent.models.LogSearchRuleResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Represents a collection of Log Search rule resources.
 */
@Fluent
public final class LogSearchRuleResourceCollection implements JsonSerializable<LogSearchRuleResourceCollection> {
    /*
     * The values for the Log Search Rule resources.
     */
    private List<LogSearchRuleResourceInner> value;

    /**
     * Creates an instance of LogSearchRuleResourceCollection class.
     */
    public LogSearchRuleResourceCollection() {
    }

    /**
     * Get the value property: The values for the Log Search Rule resources.
     * 
     * @return the value value.
     */
    public List<LogSearchRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the Log Search Rule resources.
     * 
     * @param value the value value to set.
     * @return the LogSearchRuleResourceCollection object itself.
     */
    public LogSearchRuleResourceCollection withValue(List<LogSearchRuleResourceInner> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogSearchRuleResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogSearchRuleResourceCollection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogSearchRuleResourceCollection.
     */
    public static LogSearchRuleResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogSearchRuleResourceCollection deserializedLogSearchRuleResourceCollection
                = new LogSearchRuleResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LogSearchRuleResourceInner> value
                        = reader.readArray(reader1 -> LogSearchRuleResourceInner.fromJson(reader1));
                    deserializedLogSearchRuleResourceCollection.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogSearchRuleResourceCollection;
        });
    }
}
