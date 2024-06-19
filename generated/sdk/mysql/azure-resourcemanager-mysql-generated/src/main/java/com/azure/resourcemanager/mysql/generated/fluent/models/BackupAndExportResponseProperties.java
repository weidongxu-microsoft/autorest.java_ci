// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BackupAndExport Response Properties.
 */
@Fluent
public final class BackupAndExportResponseProperties implements JsonSerializable<BackupAndExportResponseProperties> {
    /*
     * Size of datasource in bytes
     */
    private Long datasourceSizeInBytes;

    /*
     * Data transferred in bytes
     */
    private Long dataTransferredInBytes;

    /*
     * Metadata related to backup to be stored for restoring resource in key-value pairs.
     */
    private String backupMetadata;

    /**
     * Creates an instance of BackupAndExportResponseProperties class.
     */
    public BackupAndExportResponseProperties() {
    }

    /**
     * Get the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @return the datasourceSizeInBytes value.
     */
    public Long datasourceSizeInBytes() {
        return this.datasourceSizeInBytes;
    }

    /**
     * Set the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @param datasourceSizeInBytes the datasourceSizeInBytes value to set.
     * @return the BackupAndExportResponseProperties object itself.
     */
    public BackupAndExportResponseProperties withDatasourceSizeInBytes(Long datasourceSizeInBytes) {
        this.datasourceSizeInBytes = datasourceSizeInBytes;
        return this;
    }

    /**
     * Get the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @return the dataTransferredInBytes value.
     */
    public Long dataTransferredInBytes() {
        return this.dataTransferredInBytes;
    }

    /**
     * Set the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @param dataTransferredInBytes the dataTransferredInBytes value to set.
     * @return the BackupAndExportResponseProperties object itself.
     */
    public BackupAndExportResponseProperties withDataTransferredInBytes(Long dataTransferredInBytes) {
        this.dataTransferredInBytes = dataTransferredInBytes;
        return this;
    }

    /**
     * Get the backupMetadata property: Metadata related to backup to be stored for restoring resource in key-value
     * pairs.
     * 
     * @return the backupMetadata value.
     */
    public String backupMetadata() {
        return this.backupMetadata;
    }

    /**
     * Set the backupMetadata property: Metadata related to backup to be stored for restoring resource in key-value
     * pairs.
     * 
     * @param backupMetadata the backupMetadata value to set.
     * @return the BackupAndExportResponseProperties object itself.
     */
    public BackupAndExportResponseProperties withBackupMetadata(String backupMetadata) {
        this.backupMetadata = backupMetadata;
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
        jsonWriter.writeNumberField("datasourceSizeInBytes", this.datasourceSizeInBytes);
        jsonWriter.writeNumberField("dataTransferredInBytes", this.dataTransferredInBytes);
        jsonWriter.writeStringField("backupMetadata", this.backupMetadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupAndExportResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupAndExportResponseProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BackupAndExportResponseProperties.
     */
    public static BackupAndExportResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupAndExportResponseProperties deserializedBackupAndExportResponseProperties
                = new BackupAndExportResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("datasourceSizeInBytes".equals(fieldName)) {
                    deserializedBackupAndExportResponseProperties.datasourceSizeInBytes
                        = reader.getNullable(JsonReader::getLong);
                } else if ("dataTransferredInBytes".equals(fieldName)) {
                    deserializedBackupAndExportResponseProperties.dataTransferredInBytes
                        = reader.getNullable(JsonReader::getLong);
                } else if ("backupMetadata".equals(fieldName)) {
                    deserializedBackupAndExportResponseProperties.backupMetadata = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupAndExportResponseProperties;
        });
    }
}
