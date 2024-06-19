// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * The IoT hub cloud-to-device messaging properties.
 */
@Fluent
public final class CloudToDeviceProperties implements JsonSerializable<CloudToDeviceProperties> {
    /*
     * The max delivery count for cloud-to-device messages in the device queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     */
    private Integer maxDeliveryCount;

    /*
     * The default time to live for cloud-to-device messages in the device queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     */
    private Duration defaultTtlAsIso8601;

    /*
     * The properties of the feedback queue for cloud-to-device messages.
     */
    private FeedbackProperties feedback;

    /**
     * Creates an instance of CloudToDeviceProperties class.
     */
    public CloudToDeviceProperties() {
    }

    /**
     * Get the maxDeliveryCount property: The max delivery count for cloud-to-device messages in the device queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The max delivery count for cloud-to-device messages in the device queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the CloudToDeviceProperties object itself.
     */
    public CloudToDeviceProperties withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the defaultTtlAsIso8601 property: The default time to live for cloud-to-device messages in the device queue.
     * See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     * @return the defaultTtlAsIso8601 value.
     */
    public Duration defaultTtlAsIso8601() {
        return this.defaultTtlAsIso8601;
    }

    /**
     * Set the defaultTtlAsIso8601 property: The default time to live for cloud-to-device messages in the device queue.
     * See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     * 
     * @param defaultTtlAsIso8601 the defaultTtlAsIso8601 value to set.
     * @return the CloudToDeviceProperties object itself.
     */
    public CloudToDeviceProperties withDefaultTtlAsIso8601(Duration defaultTtlAsIso8601) {
        this.defaultTtlAsIso8601 = defaultTtlAsIso8601;
        return this;
    }

    /**
     * Get the feedback property: The properties of the feedback queue for cloud-to-device messages.
     * 
     * @return the feedback value.
     */
    public FeedbackProperties feedback() {
        return this.feedback;
    }

    /**
     * Set the feedback property: The properties of the feedback queue for cloud-to-device messages.
     * 
     * @param feedback the feedback value to set.
     * @return the CloudToDeviceProperties object itself.
     */
    public CloudToDeviceProperties withFeedback(FeedbackProperties feedback) {
        this.feedback = feedback;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (feedback() != null) {
            feedback().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("maxDeliveryCount", this.maxDeliveryCount);
        jsonWriter.writeStringField("defaultTtlAsIso8601",
            CoreUtils.durationToStringWithDays(this.defaultTtlAsIso8601));
        jsonWriter.writeJsonField("feedback", this.feedback);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudToDeviceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudToDeviceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudToDeviceProperties.
     */
    public static CloudToDeviceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudToDeviceProperties deserializedCloudToDeviceProperties = new CloudToDeviceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxDeliveryCount".equals(fieldName)) {
                    deserializedCloudToDeviceProperties.maxDeliveryCount = reader.getNullable(JsonReader::getInt);
                } else if ("defaultTtlAsIso8601".equals(fieldName)) {
                    deserializedCloudToDeviceProperties.defaultTtlAsIso8601
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("feedback".equals(fieldName)) {
                    deserializedCloudToDeviceProperties.feedback = FeedbackProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudToDeviceProperties;
        });
    }
}
