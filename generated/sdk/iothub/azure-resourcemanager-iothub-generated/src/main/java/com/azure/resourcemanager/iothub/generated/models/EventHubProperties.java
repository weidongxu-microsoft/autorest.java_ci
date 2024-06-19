// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The properties of the provisioned Event Hub-compatible endpoint used by the IoT hub.
 */
@Fluent
public final class EventHubProperties implements JsonSerializable<EventHubProperties> {
    /*
     * The retention time for device-to-cloud messages in days. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     */
    private Long retentionTimeInDays;

    /*
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     */
    private Integer partitionCount;

    /*
     * The partition ids in the Event Hub-compatible endpoint.
     */
    private List<String> partitionIds;

    /*
     * The Event Hub-compatible name.
     */
    private String path;

    /*
     * The Event Hub-compatible endpoint.
     */
    private String endpoint;

    /**
     * Creates an instance of EventHubProperties class.
     */
    public EventHubProperties() {
    }

    /**
     * Get the retentionTimeInDays property: The retention time for device-to-cloud messages in days. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     * @return the retentionTimeInDays value.
     */
    public Long retentionTimeInDays() {
        return this.retentionTimeInDays;
    }

    /**
     * Set the retentionTimeInDays property: The retention time for device-to-cloud messages in days. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     * @param retentionTimeInDays the retentionTimeInDays value to set.
     * @return the EventHubProperties object itself.
     */
    public EventHubProperties withRetentionTimeInDays(Long retentionTimeInDays) {
        this.retentionTimeInDays = retentionTimeInDays;
        return this;
    }

    /**
     * Get the partitionCount property: The number of partitions for receiving device-to-cloud messages in the Event
     * Hub-compatible endpoint. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     * @return the partitionCount value.
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: The number of partitions for receiving device-to-cloud messages in the Event
     * Hub-compatible endpoint. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     * @param partitionCount the partitionCount value to set.
     * @return the EventHubProperties object itself.
     */
    public EventHubProperties withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the partitionIds property: The partition ids in the Event Hub-compatible endpoint.
     * 
     * @return the partitionIds value.
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get the path property: The Event Hub-compatible name.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Get the endpoint property: The Event Hub-compatible endpoint.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
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
        jsonWriter.writeNumberField("retentionTimeInDays", this.retentionTimeInDays);
        jsonWriter.writeNumberField("partitionCount", this.partitionCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventHubProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventHubProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventHubProperties.
     */
    public static EventHubProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventHubProperties deserializedEventHubProperties = new EventHubProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("retentionTimeInDays".equals(fieldName)) {
                    deserializedEventHubProperties.retentionTimeInDays = reader.getNullable(JsonReader::getLong);
                } else if ("partitionCount".equals(fieldName)) {
                    deserializedEventHubProperties.partitionCount = reader.getNullable(JsonReader::getInt);
                } else if ("partitionIds".equals(fieldName)) {
                    List<String> partitionIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedEventHubProperties.partitionIds = partitionIds;
                } else if ("path".equals(fieldName)) {
                    deserializedEventHubProperties.path = reader.getString();
                } else if ("endpoint".equals(fieldName)) {
                    deserializedEventHubProperties.endpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventHubProperties;
        });
    }
}
