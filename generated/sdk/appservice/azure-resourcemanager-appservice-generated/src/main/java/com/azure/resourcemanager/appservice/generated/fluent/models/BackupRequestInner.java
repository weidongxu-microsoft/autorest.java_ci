// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.models.BackupSchedule;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Description of a backup which will be performed.
 */
@Fluent
public final class BackupRequestInner extends ProxyOnlyResource {
    /*
     * BackupRequest resource specific properties
     */
    private BackupRequestProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of BackupRequestInner class.
     */
    public BackupRequestInner() {
    }

    /**
     * Get the innerProperties property: BackupRequest resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private BackupRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupRequestInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the backupName property: Name of the backup.
     * 
     * @return the backupName value.
     */
    public String backupName() {
        return this.innerProperties() == null ? null : this.innerProperties().backupName();
    }

    /**
     * Set the backupName property: Name of the backup.
     * 
     * @param backupName the backupName value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupName(String backupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withBackupName(backupName);
        return this;
    }

    /**
     * Get the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     * 
     * @param enabled the enabled value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     * 
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountUrl();
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     * 
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withStorageAccountUrl(String storageAccountUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withStorageAccountUrl(storageAccountUrl);
        return this;
    }

    /**
     * Get the backupSchedule property: Schedule for the backup if it is executed periodically.
     * 
     * @return the backupSchedule value.
     */
    public BackupSchedule backupSchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().backupSchedule();
    }

    /**
     * Set the backupSchedule property: Schedule for the backup if it is executed periodically.
     * 
     * @param backupSchedule the backupSchedule value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupSchedule(BackupSchedule backupSchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withBackupSchedule(backupSchedule);
        return this;
    }

    /**
     * Get the databases property: Databases included in the backup.
     * 
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.innerProperties() == null ? null : this.innerProperties().databases();
    }

    /**
     * Set the databases property: Databases included in the backup.
     * 
     * @param databases the databases value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withDatabases(databases);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupRequestInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupRequestInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupRequestInner.
     */
    public static BackupRequestInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupRequestInner deserializedBackupRequestInner = new BackupRequestInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBackupRequestInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBackupRequestInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBackupRequestInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedBackupRequestInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedBackupRequestInner.innerProperties = BackupRequestProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupRequestInner;
        });
    }
}
