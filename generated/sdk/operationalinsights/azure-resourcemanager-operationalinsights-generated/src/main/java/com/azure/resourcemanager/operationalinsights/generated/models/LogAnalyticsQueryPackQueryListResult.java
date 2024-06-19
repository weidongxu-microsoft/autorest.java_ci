// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LogAnalyticsQueryPackQueryInner;
import java.io.IOException;
import java.util.List;

/**
 * Describes the list of Log Analytics QueryPack-Query resources.
 */
@Fluent
public final class LogAnalyticsQueryPackQueryListResult
    implements JsonSerializable<LogAnalyticsQueryPackQueryListResult> {
    /*
     * List of Log Analytics QueryPack Query definitions.
     */
    private List<LogAnalyticsQueryPackQueryInner> value;

    /*
     * The URI to get the next set of Log Analytics QueryPack definitions if too many QueryPack-Queries where returned
     * in the result set.
     */
    private String nextLink;

    /**
     * Creates an instance of LogAnalyticsQueryPackQueryListResult class.
     */
    public LogAnalyticsQueryPackQueryListResult() {
    }

    /**
     * Get the value property: List of Log Analytics QueryPack Query definitions.
     * 
     * @return the value value.
     */
    public List<LogAnalyticsQueryPackQueryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Log Analytics QueryPack Query definitions.
     * 
     * @param value the value value to set.
     * @return the LogAnalyticsQueryPackQueryListResult object itself.
     */
    public LogAnalyticsQueryPackQueryListResult withValue(List<LogAnalyticsQueryPackQueryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPack-Queries where returned in the result set.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPack-Queries where returned in the result set.
     * 
     * @param nextLink the nextLink value to set.
     * @return the LogAnalyticsQueryPackQueryListResult object itself.
     */
    public LogAnalyticsQueryPackQueryListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
                .log(new IllegalArgumentException(
                    "Missing required property value in model LogAnalyticsQueryPackQueryListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogAnalyticsQueryPackQueryListResult.class);

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
     * Reads an instance of LogAnalyticsQueryPackQueryListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogAnalyticsQueryPackQueryListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LogAnalyticsQueryPackQueryListResult.
     */
    public static LogAnalyticsQueryPackQueryListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogAnalyticsQueryPackQueryListResult deserializedLogAnalyticsQueryPackQueryListResult
                = new LogAnalyticsQueryPackQueryListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LogAnalyticsQueryPackQueryInner> value
                        = reader.readArray(reader1 -> LogAnalyticsQueryPackQueryInner.fromJson(reader1));
                    deserializedLogAnalyticsQueryPackQueryListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLogAnalyticsQueryPackQueryListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogAnalyticsQueryPackQueryListResult;
        });
    }
}
