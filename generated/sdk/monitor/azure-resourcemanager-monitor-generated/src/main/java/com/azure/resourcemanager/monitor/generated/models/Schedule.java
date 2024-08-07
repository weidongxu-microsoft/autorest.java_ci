// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines how often to run the search and the time interval.
 */
@Fluent
public final class Schedule implements JsonSerializable<Schedule> {
    /*
     * frequency (in minutes) at which rule condition should be evaluated.
     */
    private int frequencyInMinutes;

    /*
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     */
    private int timeWindowInMinutes;

    /**
     * Creates an instance of Schedule class.
     */
    public Schedule() {
    }

    /**
     * Get the frequencyInMinutes property: frequency (in minutes) at which rule condition should be evaluated.
     * 
     * @return the frequencyInMinutes value.
     */
    public int frequencyInMinutes() {
        return this.frequencyInMinutes;
    }

    /**
     * Set the frequencyInMinutes property: frequency (in minutes) at which rule condition should be evaluated.
     * 
     * @param frequencyInMinutes the frequencyInMinutes value to set.
     * @return the Schedule object itself.
     */
    public Schedule withFrequencyInMinutes(int frequencyInMinutes) {
        this.frequencyInMinutes = frequencyInMinutes;
        return this;
    }

    /**
     * Get the timeWindowInMinutes property: Time window for which data needs to be fetched for query (should be greater
     * than or equal to frequencyInMinutes).
     * 
     * @return the timeWindowInMinutes value.
     */
    public int timeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    /**
     * Set the timeWindowInMinutes property: Time window for which data needs to be fetched for query (should be greater
     * than or equal to frequencyInMinutes).
     * 
     * @param timeWindowInMinutes the timeWindowInMinutes value to set.
     * @return the Schedule object itself.
     */
    public Schedule withTimeWindowInMinutes(int timeWindowInMinutes) {
        this.timeWindowInMinutes = timeWindowInMinutes;
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
        jsonWriter.writeIntField("frequencyInMinutes", this.frequencyInMinutes);
        jsonWriter.writeIntField("timeWindowInMinutes", this.timeWindowInMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Schedule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Schedule if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Schedule.
     */
    public static Schedule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Schedule deserializedSchedule = new Schedule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frequencyInMinutes".equals(fieldName)) {
                    deserializedSchedule.frequencyInMinutes = reader.getInt();
                } else if ("timeWindowInMinutes".equals(fieldName)) {
                    deserializedSchedule.timeWindowInMinutes = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchedule;
        });
    }
}
