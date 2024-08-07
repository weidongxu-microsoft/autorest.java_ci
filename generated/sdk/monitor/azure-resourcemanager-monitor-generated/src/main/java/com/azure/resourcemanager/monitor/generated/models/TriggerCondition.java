// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The condition that results in the Log Search rule.
 */
@Fluent
public final class TriggerCondition implements JsonSerializable<TriggerCondition> {
    /*
     * Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     */
    private ConditionalOperator thresholdOperator;

    /*
     * Result or count threshold based on which rule should be triggered.
     */
    private double threshold;

    /*
     * Trigger condition for metric query rule
     */
    private LogMetricTrigger metricTrigger;

    /**
     * Creates an instance of TriggerCondition class.
     */
    public TriggerCondition() {
    }

    /**
     * Get the thresholdOperator property: Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     * 
     * @return the thresholdOperator value.
     */
    public ConditionalOperator thresholdOperator() {
        return this.thresholdOperator;
    }

    /**
     * Set the thresholdOperator property: Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     * 
     * @param thresholdOperator the thresholdOperator value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withThresholdOperator(ConditionalOperator thresholdOperator) {
        this.thresholdOperator = thresholdOperator;
        return this;
    }

    /**
     * Get the threshold property: Result or count threshold based on which rule should be triggered.
     * 
     * @return the threshold value.
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: Result or count threshold based on which rule should be triggered.
     * 
     * @param threshold the threshold value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the metricTrigger property: Trigger condition for metric query rule.
     * 
     * @return the metricTrigger value.
     */
    public LogMetricTrigger metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * Set the metricTrigger property: Trigger condition for metric query rule.
     * 
     * @param metricTrigger the metricTrigger value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withMetricTrigger(LogMetricTrigger metricTrigger) {
        this.metricTrigger = metricTrigger;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (thresholdOperator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property thresholdOperator in model TriggerCondition"));
        }
        if (metricTrigger() != null) {
            metricTrigger().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TriggerCondition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("thresholdOperator",
            this.thresholdOperator == null ? null : this.thresholdOperator.toString());
        jsonWriter.writeDoubleField("threshold", this.threshold);
        jsonWriter.writeJsonField("metricTrigger", this.metricTrigger);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerCondition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TriggerCondition.
     */
    public static TriggerCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerCondition deserializedTriggerCondition = new TriggerCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("thresholdOperator".equals(fieldName)) {
                    deserializedTriggerCondition.thresholdOperator = ConditionalOperator.fromString(reader.getString());
                } else if ("threshold".equals(fieldName)) {
                    deserializedTriggerCondition.threshold = reader.getDouble();
                } else if ("metricTrigger".equals(fieldName)) {
                    deserializedTriggerCondition.metricTrigger = LogMetricTrigger.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerCondition;
        });
    }
}
