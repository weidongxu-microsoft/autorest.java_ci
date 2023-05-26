// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the delivery configuration information of the event subscription. */
@Fluent
public final class DeliveryConfiguration {
    /*
     * Delivery mode of the event subscription.
     */
    @JsonProperty(value = "deliveryMode")
    private DeliveryMode deliveryMode;

    /*
     * This property should be populated when deliveryMode is queue and represents information about the queue
     * subscription.
     */
    @JsonProperty(value = "queue")
    private QueueInfo queue;

    /** Creates an instance of DeliveryConfiguration class. */
    public DeliveryConfiguration() {
    }

    /**
     * Get the deliveryMode property: Delivery mode of the event subscription.
     *
     * @return the deliveryMode value.
     */
    public DeliveryMode deliveryMode() {
        return this.deliveryMode;
    }

    /**
     * Set the deliveryMode property: Delivery mode of the event subscription.
     *
     * @param deliveryMode the deliveryMode value to set.
     * @return the DeliveryConfiguration object itself.
     */
    public DeliveryConfiguration withDeliveryMode(DeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    /**
     * Get the queue property: This property should be populated when deliveryMode is queue and represents information
     * about the queue subscription.
     *
     * @return the queue value.
     */
    public QueueInfo queue() {
        return this.queue;
    }

    /**
     * Set the queue property: This property should be populated when deliveryMode is queue and represents information
     * about the queue subscription.
     *
     * @param queue the queue value to set.
     * @return the DeliveryConfiguration object itself.
     */
    public DeliveryConfiguration withQueue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queue() != null) {
            queue().validate();
        }
    }
}