// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the throttling policy.
 */
@Fluent
public final class ThrottlingPolicy extends ApplicationGroupPolicy {
    /*
     * Application Group Policy types
     */
    private ApplicationGroupPolicyType type = ApplicationGroupPolicyType.THROTTLING_POLICY;

    /*
     * The Threshold limit above which the application group will be throttled.Rate limit is always per second.
     */
    private long rateLimitThreshold;

    /*
     * Metric Id on which the throttle limit should be set, MetricId can be discovered by hovering over Metric in the
     * Metrics section of Event Hub Namespace inside Azure Portal
     */
    private MetricId metricId;

    /**
     * Creates an instance of ThrottlingPolicy class.
     */
    public ThrottlingPolicy() {
    }

    /**
     * Get the type property: Application Group Policy types.
     * 
     * @return the type value.
     */
    @Override
    public ApplicationGroupPolicyType type() {
        return this.type;
    }

    /**
     * Get the rateLimitThreshold property: The Threshold limit above which the application group will be throttled.Rate
     * limit is always per second.
     * 
     * @return the rateLimitThreshold value.
     */
    public long rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    /**
     * Set the rateLimitThreshold property: The Threshold limit above which the application group will be throttled.Rate
     * limit is always per second.
     * 
     * @param rateLimitThreshold the rateLimitThreshold value to set.
     * @return the ThrottlingPolicy object itself.
     */
    public ThrottlingPolicy withRateLimitThreshold(long rateLimitThreshold) {
        this.rateLimitThreshold = rateLimitThreshold;
        return this;
    }

    /**
     * Get the metricId property: Metric Id on which the throttle limit should be set, MetricId can be discovered by
     * hovering over Metric in the Metrics section of Event Hub Namespace inside Azure Portal.
     * 
     * @return the metricId value.
     */
    public MetricId metricId() {
        return this.metricId;
    }

    /**
     * Set the metricId property: Metric Id on which the throttle limit should be set, MetricId can be discovered by
     * hovering over Metric in the Metrics section of Event Hub Namespace inside Azure Portal.
     * 
     * @param metricId the metricId value to set.
     * @return the ThrottlingPolicy object itself.
     */
    public ThrottlingPolicy withMetricId(MetricId metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottlingPolicy withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (metricId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property metricId in model ThrottlingPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ThrottlingPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeLongField("rateLimitThreshold", this.rateLimitThreshold);
        jsonWriter.writeStringField("metricId", this.metricId == null ? null : this.metricId.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThrottlingPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThrottlingPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ThrottlingPolicy.
     */
    public static ThrottlingPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ThrottlingPolicy deserializedThrottlingPolicy = new ThrottlingPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedThrottlingPolicy.withName(reader.getString());
                } else if ("rateLimitThreshold".equals(fieldName)) {
                    deserializedThrottlingPolicy.rateLimitThreshold = reader.getLong();
                } else if ("metricId".equals(fieldName)) {
                    deserializedThrottlingPolicy.metricId = MetricId.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedThrottlingPolicy.type = ApplicationGroupPolicyType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedThrottlingPolicy;
        });
    }
}
