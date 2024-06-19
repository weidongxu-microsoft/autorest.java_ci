// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description of a backup schedule. Describes how often should be the backup performed and what should be the retention
 * policy.
 */
@Fluent
public final class BackupSchedule implements JsonSerializable<BackupSchedule> {
    /*
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should
     * be set to Day)
     */
    private int frequencyInterval;

    /*
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day
     * and FrequencyInterval should be set to 7)
     */
    private FrequencyUnit frequencyUnit;

    /*
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it
     * is; false otherwise.
     */
    private boolean keepAtLeastOneBackup;

    /*
     * After how many days backups should be deleted.
     */
    private int retentionPeriodInDays;

    /*
     * When the schedule should start working.
     */
    private OffsetDateTime startTime;

    /*
     * Last time when this schedule was triggered.
     */
    private OffsetDateTime lastExecutionTime;

    /**
     * Creates an instance of BackupSchedule class.
     */
    public BackupSchedule() {
    }

    /**
     * Get the frequencyInterval property: How often the backup should be executed (e.g. for weekly backup, this should
     * be set to 7 and FrequencyUnit should be set to Day).
     * 
     * @return the frequencyInterval value.
     */
    public int frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Set the frequencyInterval property: How often the backup should be executed (e.g. for weekly backup, this should
     * be set to 7 and FrequencyUnit should be set to Day).
     * 
     * @param frequencyInterval the frequencyInterval value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withFrequencyInterval(int frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
        return this;
    }

    /**
     * Get the frequencyUnit property: The unit of time for how often the backup should be executed (e.g. for weekly
     * backup, this should be set to Day and FrequencyInterval should be set to 7).
     * 
     * @return the frequencyUnit value.
     */
    public FrequencyUnit frequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * Set the frequencyUnit property: The unit of time for how often the backup should be executed (e.g. for weekly
     * backup, this should be set to Day and FrequencyInterval should be set to 7).
     * 
     * @param frequencyUnit the frequencyUnit value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
        return this;
    }

    /**
     * Get the keepAtLeastOneBackup property: True if the retention policy should always keep at least one backup in the
     * storage account, regardless how old it is; false otherwise.
     * 
     * @return the keepAtLeastOneBackup value.
     */
    public boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * Set the keepAtLeastOneBackup property: True if the retention policy should always keep at least one backup in the
     * storage account, regardless how old it is; false otherwise.
     * 
     * @param keepAtLeastOneBackup the keepAtLeastOneBackup value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withKeepAtLeastOneBackup(boolean keepAtLeastOneBackup) {
        this.keepAtLeastOneBackup = keepAtLeastOneBackup;
        return this;
    }

    /**
     * Get the retentionPeriodInDays property: After how many days backups should be deleted.
     * 
     * @return the retentionPeriodInDays value.
     */
    public int retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * Set the retentionPeriodInDays property: After how many days backups should be deleted.
     * 
     * @param retentionPeriodInDays the retentionPeriodInDays value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withRetentionPeriodInDays(int retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /**
     * Get the startTime property: When the schedule should start working.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: When the schedule should start working.
     * 
     * @param startTime the startTime value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the lastExecutionTime property: Last time when this schedule was triggered.
     * 
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frequencyUnit() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property frequencyUnit in model BackupSchedule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupSchedule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("frequencyInterval", this.frequencyInterval);
        jsonWriter.writeStringField("frequencyUnit", this.frequencyUnit == null ? null : this.frequencyUnit.toString());
        jsonWriter.writeBooleanField("keepAtLeastOneBackup", this.keepAtLeastOneBackup);
        jsonWriter.writeIntField("retentionPeriodInDays", this.retentionPeriodInDays);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupSchedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupSchedule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupSchedule.
     */
    public static BackupSchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupSchedule deserializedBackupSchedule = new BackupSchedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frequencyInterval".equals(fieldName)) {
                    deserializedBackupSchedule.frequencyInterval = reader.getInt();
                } else if ("frequencyUnit".equals(fieldName)) {
                    deserializedBackupSchedule.frequencyUnit = FrequencyUnit.fromString(reader.getString());
                } else if ("keepAtLeastOneBackup".equals(fieldName)) {
                    deserializedBackupSchedule.keepAtLeastOneBackup = reader.getBoolean();
                } else if ("retentionPeriodInDays".equals(fieldName)) {
                    deserializedBackupSchedule.retentionPeriodInDays = reader.getInt();
                } else if ("startTime".equals(fieldName)) {
                    deserializedBackupSchedule.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastExecutionTime".equals(fieldName)) {
                    deserializedBackupSchedule.lastExecutionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupSchedule;
        });
    }
}
