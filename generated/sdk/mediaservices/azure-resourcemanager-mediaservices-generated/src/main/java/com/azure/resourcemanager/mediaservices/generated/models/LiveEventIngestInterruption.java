// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The live event ingest interruption data.
 */
@Fluent
public final class LiveEventIngestInterruption implements JsonSerializable<LiveEventIngestInterruption> {
    /*
     * UTC time of interruption start, encoder disconnected.
     */
    private OffsetDateTime begin;

    /*
     * UTC time of interruption end, encoder re-connected.
     */
    private OffsetDateTime end;

    /*
     * Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour and 30 minutes.
     */
    private Duration duration;

    /*
     * Interruption reason.
     */
    private String reason;

    /**
     * Creates an instance of LiveEventIngestInterruption class.
     */
    public LiveEventIngestInterruption() {
    }

    /**
     * Get the begin property: UTC time of interruption start, encoder disconnected.
     * 
     * @return the begin value.
     */
    public OffsetDateTime begin() {
        return this.begin;
    }

    /**
     * Set the begin property: UTC time of interruption start, encoder disconnected.
     * 
     * @param begin the begin value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withBegin(OffsetDateTime begin) {
        this.begin = begin;
        return this;
    }

    /**
     * Get the end property: UTC time of interruption end, encoder re-connected.
     * 
     * @return the end value.
     */
    public OffsetDateTime end() {
        return this.end;
    }

    /**
     * Set the end property: UTC time of interruption end, encoder re-connected.
     * 
     * @param end the end value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withEnd(OffsetDateTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get the duration property: Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour
     * and 30 minutes.
     * 
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour
     * and 30 minutes.
     * 
     * @param duration the duration value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the reason property: Interruption reason.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Interruption reason.
     * 
     * @param reason the reason value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withReason(String reason) {
        this.reason = reason;
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
        jsonWriter.writeStringField("begin",
            this.begin == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.begin));
        jsonWriter.writeStringField("end",
            this.end == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.end));
        jsonWriter.writeStringField("duration", CoreUtils.durationToStringWithDays(this.duration));
        jsonWriter.writeStringField("reason", this.reason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LiveEventIngestInterruption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LiveEventIngestInterruption if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LiveEventIngestInterruption.
     */
    public static LiveEventIngestInterruption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LiveEventIngestInterruption deserializedLiveEventIngestInterruption = new LiveEventIngestInterruption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("begin".equals(fieldName)) {
                    deserializedLiveEventIngestInterruption.begin = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("end".equals(fieldName)) {
                    deserializedLiveEventIngestInterruption.end = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("duration".equals(fieldName)) {
                    deserializedLiveEventIngestInterruption.duration
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("reason".equals(fieldName)) {
                    deserializedLiveEventIngestInterruption.reason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLiveEventIngestInterruption;
        });
    }
}
