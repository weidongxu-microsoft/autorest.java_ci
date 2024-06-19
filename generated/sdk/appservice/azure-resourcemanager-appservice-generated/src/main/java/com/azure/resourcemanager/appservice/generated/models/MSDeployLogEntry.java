// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * MSDeploy log entry.
 */
@Immutable
public final class MSDeployLogEntry implements JsonSerializable<MSDeployLogEntry> {
    /*
     * Timestamp of log entry
     */
    private OffsetDateTime time;

    /*
     * Log entry type
     */
    private MSDeployLogEntryType type;

    /*
     * Log entry message
     */
    private String message;

    /**
     * Creates an instance of MSDeployLogEntry class.
     */
    public MSDeployLogEntry() {
    }

    /**
     * Get the time property: Timestamp of log entry.
     * 
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Get the type property: Log entry type.
     * 
     * @return the type value.
     */
    public MSDeployLogEntryType type() {
        return this.type;
    }

    /**
     * Get the message property: Log entry message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
     * Reads an instance of MSDeployLogEntry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MSDeployLogEntry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MSDeployLogEntry.
     */
    public static MSDeployLogEntry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MSDeployLogEntry deserializedMSDeployLogEntry = new MSDeployLogEntry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("time".equals(fieldName)) {
                    deserializedMSDeployLogEntry.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("type".equals(fieldName)) {
                    deserializedMSDeployLogEntry.type = MSDeployLogEntryType.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedMSDeployLogEntry.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMSDeployLogEntry;
        });
    }
}
