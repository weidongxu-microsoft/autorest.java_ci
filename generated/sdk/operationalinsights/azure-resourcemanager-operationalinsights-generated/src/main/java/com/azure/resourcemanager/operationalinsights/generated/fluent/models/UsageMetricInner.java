// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.operationalinsights.generated.models.MetricName;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A metric describing the usage of a resource.
 */
@Fluent
public final class UsageMetricInner implements JsonSerializable<UsageMetricInner> {
    /*
     * The name of the metric.
     */
    private MetricName name;

    /*
     * The units used for the metric.
     */
    private String unit;

    /*
     * The current value of the metric.
     */
    private Double currentValue;

    /*
     * The quota limit for the metric.
     */
    private Double limit;

    /*
     * The time that the metric's value will reset.
     */
    private OffsetDateTime nextResetTime;

    /*
     * The quota period that determines the length of time between value resets.
     */
    private String quotaPeriod;

    /**
     * Creates an instance of UsageMetricInner class.
     */
    public UsageMetricInner() {
    }

    /**
     * Get the name property: The name of the metric.
     * 
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     * 
     * @param name the name value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withName(MetricName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: The units used for the metric.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The units used for the metric.
     * 
     * @param unit the unit value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the metric.
     * 
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the metric.
     * 
     * @param currentValue the currentValue value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The quota limit for the metric.
     * 
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The quota limit for the metric.
     * 
     * @param limit the limit value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withLimit(Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the nextResetTime property: The time that the metric's value will reset.
     * 
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime property: The time that the metric's value will reset.
     * 
     * @param nextResetTime the nextResetTime value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withNextResetTime(OffsetDateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the quotaPeriod property: The quota period that determines the length of time between value resets.
     * 
     * @return the quotaPeriod value.
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Set the quotaPeriod property: The quota period that determines the length of time between value resets.
     * 
     * @param quotaPeriod the quotaPeriod value to set.
     * @return the UsageMetricInner object itself.
     */
    public UsageMetricInner withQuotaPeriod(String quotaPeriod) {
        this.quotaPeriod = quotaPeriod;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("name", this.name);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeNumberField("currentValue", this.currentValue);
        jsonWriter.writeNumberField("limit", this.limit);
        jsonWriter.writeStringField("nextResetTime",
            this.nextResetTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.nextResetTime));
        jsonWriter.writeStringField("quotaPeriod", this.quotaPeriod);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UsageMetricInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageMetricInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UsageMetricInner.
     */
    public static UsageMetricInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageMetricInner deserializedUsageMetricInner = new UsageMetricInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedUsageMetricInner.name = MetricName.fromJson(reader);
                } else if ("unit".equals(fieldName)) {
                    deserializedUsageMetricInner.unit = reader.getString();
                } else if ("currentValue".equals(fieldName)) {
                    deserializedUsageMetricInner.currentValue = reader.getNullable(JsonReader::getDouble);
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageMetricInner.limit = reader.getNullable(JsonReader::getDouble);
                } else if ("nextResetTime".equals(fieldName)) {
                    deserializedUsageMetricInner.nextResetTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("quotaPeriod".equals(fieldName)) {
                    deserializedUsageMetricInner.quotaPeriod = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageMetricInner;
        });
    }
}
