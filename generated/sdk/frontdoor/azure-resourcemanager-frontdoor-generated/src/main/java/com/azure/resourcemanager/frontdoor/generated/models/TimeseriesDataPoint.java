// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines a timeseries datapoint used in a timeseries.
 */
@Fluent
public final class TimeseriesDataPoint implements JsonSerializable<TimeseriesDataPoint> {
    /*
     * The DateTime of the Timeseries data point in UTC
     */
    private String dateTimeUtc;

    /*
     * The Value of the Timeseries data point
     */
    private Float value;

    /**
     * Creates an instance of TimeseriesDataPoint class.
     */
    public TimeseriesDataPoint() {
    }

    /**
     * Get the dateTimeUtc property: The DateTime of the Timeseries data point in UTC.
     * 
     * @return the dateTimeUtc value.
     */
    public String dateTimeUtc() {
        return this.dateTimeUtc;
    }

    /**
     * Set the dateTimeUtc property: The DateTime of the Timeseries data point in UTC.
     * 
     * @param dateTimeUtc the dateTimeUtc value to set.
     * @return the TimeseriesDataPoint object itself.
     */
    public TimeseriesDataPoint withDateTimeUtc(String dateTimeUtc) {
        this.dateTimeUtc = dateTimeUtc;
        return this;
    }

    /**
     * Get the value property: The Value of the Timeseries data point.
     * 
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Set the value property: The Value of the Timeseries data point.
     * 
     * @param value the value value to set.
     * @return the TimeseriesDataPoint object itself.
     */
    public TimeseriesDataPoint withValue(Float value) {
        this.value = value;
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
        jsonWriter.writeStringField("dateTimeUTC", this.dateTimeUtc);
        jsonWriter.writeNumberField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TimeseriesDataPoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TimeseriesDataPoint if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TimeseriesDataPoint.
     */
    public static TimeseriesDataPoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TimeseriesDataPoint deserializedTimeseriesDataPoint = new TimeseriesDataPoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dateTimeUTC".equals(fieldName)) {
                    deserializedTimeseriesDataPoint.dateTimeUtc = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedTimeseriesDataPoint.value = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTimeseriesDataPoint;
        });
    }
}
