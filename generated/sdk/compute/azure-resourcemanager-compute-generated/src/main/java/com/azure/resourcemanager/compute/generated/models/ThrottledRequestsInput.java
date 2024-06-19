// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Api request input for LogAnalytics getThrottledRequests Api.
 */
@Fluent
public final class ThrottledRequestsInput extends LogAnalyticsInputBase {
    /**
     * Creates an instance of ThrottledRequestsInput class.
     */
    public ThrottledRequestsInput() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withBlobContainerSasUri(String blobContainerSasUri) {
        super.withBlobContainerSasUri(blobContainerSasUri);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withFromTime(OffsetDateTime fromTime) {
        super.withFromTime(fromTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withToTime(OffsetDateTime toTime) {
        super.withToTime(toTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        super.withGroupByThrottlePolicy(groupByThrottlePolicy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withGroupByOperationName(Boolean groupByOperationName) {
        super.withGroupByOperationName(groupByOperationName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withGroupByResourceName(Boolean groupByResourceName) {
        super.withGroupByResourceName(groupByResourceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withGroupByClientApplicationId(Boolean groupByClientApplicationId) {
        super.withGroupByClientApplicationId(groupByClientApplicationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThrottledRequestsInput withGroupByUserAgent(Boolean groupByUserAgent) {
        super.withGroupByUserAgent(groupByUserAgent);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("blobContainerSasUri", blobContainerSasUri());
        jsonWriter.writeStringField("fromTime",
            fromTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(fromTime()));
        jsonWriter.writeStringField("toTime",
            toTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(toTime()));
        jsonWriter.writeBooleanField("groupByThrottlePolicy", groupByThrottlePolicy());
        jsonWriter.writeBooleanField("groupByOperationName", groupByOperationName());
        jsonWriter.writeBooleanField("groupByResourceName", groupByResourceName());
        jsonWriter.writeBooleanField("groupByClientApplicationId", groupByClientApplicationId());
        jsonWriter.writeBooleanField("groupByUserAgent", groupByUserAgent());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThrottledRequestsInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThrottledRequestsInput if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ThrottledRequestsInput.
     */
    public static ThrottledRequestsInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ThrottledRequestsInput deserializedThrottledRequestsInput = new ThrottledRequestsInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("blobContainerSasUri".equals(fieldName)) {
                    deserializedThrottledRequestsInput.withBlobContainerSasUri(reader.getString());
                } else if ("fromTime".equals(fieldName)) {
                    deserializedThrottledRequestsInput.withFromTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("toTime".equals(fieldName)) {
                    deserializedThrottledRequestsInput.withToTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("groupByThrottlePolicy".equals(fieldName)) {
                    deserializedThrottledRequestsInput
                        .withGroupByThrottlePolicy(reader.getNullable(JsonReader::getBoolean));
                } else if ("groupByOperationName".equals(fieldName)) {
                    deserializedThrottledRequestsInput
                        .withGroupByOperationName(reader.getNullable(JsonReader::getBoolean));
                } else if ("groupByResourceName".equals(fieldName)) {
                    deserializedThrottledRequestsInput
                        .withGroupByResourceName(reader.getNullable(JsonReader::getBoolean));
                } else if ("groupByClientApplicationId".equals(fieldName)) {
                    deserializedThrottledRequestsInput
                        .withGroupByClientApplicationId(reader.getNullable(JsonReader::getBoolean));
                } else if ("groupByUserAgent".equals(fieldName)) {
                    deserializedThrottledRequestsInput.withGroupByUserAgent(reader.getNullable(JsonReader::getBoolean));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedThrottledRequestsInput;
        });
    }
}
