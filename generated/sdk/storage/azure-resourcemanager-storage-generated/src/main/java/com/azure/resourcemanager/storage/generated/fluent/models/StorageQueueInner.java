// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The StorageQueue model.
 */
@Fluent
public final class StorageQueueInner extends ProxyResource {
    /*
     * Queue resource properties.
     */
    @JsonProperty(value = "properties")
    private QueueProperties innerQueueProperties;

    /**
     * Creates an instance of StorageQueueInner class.
     */
    public StorageQueueInner() {
    }

    /**
     * Get the innerQueueProperties property: Queue resource properties.
     * 
     * @return the innerQueueProperties value.
     */
    private QueueProperties innerQueueProperties() {
        return this.innerQueueProperties;
    }

    /**
     * Get the metadata property: A name-value pair that represents queue metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerQueueProperties() == null ? null : this.innerQueueProperties().metadata();
    }

    /**
     * Set the metadata property: A name-value pair that represents queue metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the StorageQueueInner object itself.
     */
    public StorageQueueInner withMetadata(Map<String, String> metadata) {
        if (this.innerQueueProperties() == null) {
            this.innerQueueProperties = new QueueProperties();
        }
        this.innerQueueProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the approximateMessageCount property: Integer indicating an approximate number of messages in the queue.
     * This number is not lower than the actual number of messages in the queue, but could be higher.
     * 
     * @return the approximateMessageCount value.
     */
    public Integer approximateMessageCount() {
        return this.innerQueueProperties() == null ? null : this.innerQueueProperties().approximateMessageCount();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerQueueProperties() != null) {
            innerQueueProperties().validate();
        }
    }
}
