// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * LogAnalytics output properties.
 */
@Immutable
public final class LogAnalyticsOutput implements JsonSerializable<LogAnalyticsOutput> {
    /*
     * Output file Uri path to blob container.
     */
    private String output;

    /**
     * Creates an instance of LogAnalyticsOutput class.
     */
    public LogAnalyticsOutput() {
    }

    /**
     * Get the output property: Output file Uri path to blob container.
     * 
     * @return the output value.
     */
    public String output() {
        return this.output;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogAnalyticsOutput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogAnalyticsOutput if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogAnalyticsOutput.
     */
    public static LogAnalyticsOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogAnalyticsOutput deserializedLogAnalyticsOutput = new LogAnalyticsOutput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("output".equals(fieldName)) {
                    deserializedLogAnalyticsOutput.output = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogAnalyticsOutput;
        });
    }
}
