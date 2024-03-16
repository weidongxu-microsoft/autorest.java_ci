// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for a storage queue destination.
 */
@Fluent
public final class StorageQueueEventSubscriptionDestinationProperties {
    /*
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     */
    @JsonProperty(value = "queueName")
    private String queueName;

    /*
     * Storage queue message time to live in seconds. This value cannot be zero or negative with the exception of using -1 to indicate that the Time To Live of the message is Infinite.
     */
    @JsonProperty(value = "queueMessageTimeToLiveInSeconds")
    private Long queueMessageTimeToLiveInSeconds;

    /**
     * Creates an instance of StorageQueueEventSubscriptionDestinationProperties class.
     */
    public StorageQueueEventSubscriptionDestinationProperties() {
    }

    /**
     * Get the resourceId property: The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the StorageQueueEventSubscriptionDestinationProperties object itself.
     */
    public StorageQueueEventSubscriptionDestinationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the queueName property: The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     * @return the queueName value.
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the queueName property: The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     * @param queueName the queueName value to set.
     * @return the StorageQueueEventSubscriptionDestinationProperties object itself.
     */
    public StorageQueueEventSubscriptionDestinationProperties withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get the queueMessageTimeToLiveInSeconds property: Storage queue message time to live in seconds. This value cannot be zero or negative with the exception of using -1 to indicate that the Time To Live of the message is Infinite.
     * 
     * @return the queueMessageTimeToLiveInSeconds value.
     */
    public Long queueMessageTimeToLiveInSeconds() {
        return this.queueMessageTimeToLiveInSeconds;
    }

    /**
     * Set the queueMessageTimeToLiveInSeconds property: Storage queue message time to live in seconds. This value cannot be zero or negative with the exception of using -1 to indicate that the Time To Live of the message is Infinite.
     * 
     * @param queueMessageTimeToLiveInSeconds the queueMessageTimeToLiveInSeconds value to set.
     * @return the StorageQueueEventSubscriptionDestinationProperties object itself.
     */
    public StorageQueueEventSubscriptionDestinationProperties
        withQueueMessageTimeToLiveInSeconds(Long queueMessageTimeToLiveInSeconds) {
        this.queueMessageTimeToLiveInSeconds = queueMessageTimeToLiveInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
