// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.StorageQueueEventSubscriptionDestinationProperties;
import java.io.IOException;

/**
 * Information about the storage queue destination for an event subscription.
 */
@Fluent
public final class StorageQueueEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Storage Queue Properties of the event subscription destination.
     */
    private StorageQueueEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of StorageQueueEventSubscriptionDestination class.
     */
    public StorageQueueEventSubscriptionDestination() {
        this.endpointType = EndpointType.STORAGE_QUEUE;
    }

    /**
     * Get the innerProperties property: Storage Queue Properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private StorageQueueEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource ID of the storage account that contains the queue that is the
     * destination of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource ID of the storage account that contains the queue that is the
     * destination of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the StorageQueueEventSubscriptionDestination object itself.
     */
    public StorageQueueEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageQueueEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the queueName property: The name of the Storage queue under a storage account that is the destination of an
     * event subscription.
     * 
     * @return the queueName value.
     */
    public String queueName() {
        return this.innerProperties() == null ? null : this.innerProperties().queueName();
    }

    /**
     * Set the queueName property: The name of the Storage queue under a storage account that is the destination of an
     * event subscription.
     * 
     * @param queueName the queueName value to set.
     * @return the StorageQueueEventSubscriptionDestination object itself.
     */
    public StorageQueueEventSubscriptionDestination withQueueName(String queueName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageQueueEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withQueueName(queueName);
        return this;
    }

    /**
     * Get the queueMessageTimeToLiveInSeconds property: Storage queue message time to live in seconds. This value
     * cannot be zero or negative with the exception of using -1 to indicate that the Time To Live of the message is
     * Infinite.
     * 
     * @return the queueMessageTimeToLiveInSeconds value.
     */
    public Long queueMessageTimeToLiveInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().queueMessageTimeToLiveInSeconds();
    }

    /**
     * Set the queueMessageTimeToLiveInSeconds property: Storage queue message time to live in seconds. This value
     * cannot be zero or negative with the exception of using -1 to indicate that the Time To Live of the message is
     * Infinite.
     * 
     * @param queueMessageTimeToLiveInSeconds the queueMessageTimeToLiveInSeconds value to set.
     * @return the StorageQueueEventSubscriptionDestination object itself.
     */
    public StorageQueueEventSubscriptionDestination
        withQueueMessageTimeToLiveInSeconds(Long queueMessageTimeToLiveInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageQueueEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withQueueMessageTimeToLiveInSeconds(queueMessageTimeToLiveInSeconds);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageQueueEventSubscriptionDestination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageQueueEventSubscriptionDestination if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageQueueEventSubscriptionDestination.
     */
    public static StorageQueueEventSubscriptionDestination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageQueueEventSubscriptionDestination deserializedStorageQueueEventSubscriptionDestination
                = new StorageQueueEventSubscriptionDestination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpointType".equals(fieldName)) {
                    deserializedStorageQueueEventSubscriptionDestination.endpointType
                        = EndpointType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStorageQueueEventSubscriptionDestination.innerProperties
                        = StorageQueueEventSubscriptionDestinationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageQueueEventSubscriptionDestination;
        });
    }
}
