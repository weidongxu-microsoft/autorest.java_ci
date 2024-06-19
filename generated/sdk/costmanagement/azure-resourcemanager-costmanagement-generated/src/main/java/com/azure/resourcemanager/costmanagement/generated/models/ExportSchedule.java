// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The schedule associated with a export.
 */
@Fluent
public final class ExportSchedule implements JsonSerializable<ExportSchedule> {
    /*
     * The status of the schedule. Whether active or not. If inactive, the export's scheduled execution is paused.
     */
    private StatusType status;

    /*
     * The schedule recurrence.
     */
    private RecurrenceType recurrence;

    /*
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be
     * greater than start date.
     */
    private ExportRecurrencePeriod recurrencePeriod;

    /**
     * Creates an instance of ExportSchedule class.
     */
    public ExportSchedule() {
    }

    /**
     * Get the status property: The status of the schedule. Whether active or not. If inactive, the export's scheduled
     * execution is paused.
     * 
     * @return the status value.
     */
    public StatusType status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the schedule. Whether active or not. If inactive, the export's scheduled
     * execution is paused.
     * 
     * @param status the status value to set.
     * @return the ExportSchedule object itself.
     */
    public ExportSchedule withStatus(StatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get the recurrence property: The schedule recurrence.
     * 
     * @return the recurrence value.
     */
    public RecurrenceType recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: The schedule recurrence.
     * 
     * @param recurrence the recurrence value to set.
     * @return the ExportSchedule object itself.
     */
    public ExportSchedule withRecurrence(RecurrenceType recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Get the recurrencePeriod property: Has start and end date of the recurrence. The start date must be in future. If
     * present, the end date must be greater than start date.
     * 
     * @return the recurrencePeriod value.
     */
    public ExportRecurrencePeriod recurrencePeriod() {
        return this.recurrencePeriod;
    }

    /**
     * Set the recurrencePeriod property: Has start and end date of the recurrence. The start date must be in future. If
     * present, the end date must be greater than start date.
     * 
     * @param recurrencePeriod the recurrencePeriod value to set.
     * @return the ExportSchedule object itself.
     */
    public ExportSchedule withRecurrencePeriod(ExportRecurrencePeriod recurrencePeriod) {
        this.recurrencePeriod = recurrencePeriod;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property recurrence in model ExportSchedule"));
        }
        if (recurrencePeriod() != null) {
            recurrencePeriod().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportSchedule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recurrence", this.recurrence == null ? null : this.recurrence.toString());
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeJsonField("recurrencePeriod", this.recurrencePeriod);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExportSchedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExportSchedule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExportSchedule.
     */
    public static ExportSchedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExportSchedule deserializedExportSchedule = new ExportSchedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recurrence".equals(fieldName)) {
                    deserializedExportSchedule.recurrence = RecurrenceType.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedExportSchedule.status = StatusType.fromString(reader.getString());
                } else if ("recurrencePeriod".equals(fieldName)) {
                    deserializedExportSchedule.recurrencePeriod = ExportRecurrencePeriod.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExportSchedule;
        });
    }
}
