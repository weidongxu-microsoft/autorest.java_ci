// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BackupRequestBase is the base for all backup request.
 */
@Fluent
public class BackupRequestBase implements JsonSerializable<BackupRequestBase> {
    /*
     * Backup Settings
     */
    private BackupSettings backupSettings;

    /**
     * Creates an instance of BackupRequestBase class.
     */
    public BackupRequestBase() {
    }

    /**
     * Get the backupSettings property: Backup Settings.
     * 
     * @return the backupSettings value.
     */
    public BackupSettings backupSettings() {
        return this.backupSettings;
    }

    /**
     * Set the backupSettings property: Backup Settings.
     * 
     * @param backupSettings the backupSettings value to set.
     * @return the BackupRequestBase object itself.
     */
    public BackupRequestBase withBackupSettings(BackupSettings backupSettings) {
        this.backupSettings = backupSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupSettings() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property backupSettings in model BackupRequestBase"));
        } else {
            backupSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupRequestBase.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("backupSettings", this.backupSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupRequestBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupRequestBase if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupRequestBase.
     */
    public static BackupRequestBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupRequestBase deserializedBackupRequestBase = new BackupRequestBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupSettings".equals(fieldName)) {
                    deserializedBackupRequestBase.backupSettings = BackupSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupRequestBase;
        });
    }
}
