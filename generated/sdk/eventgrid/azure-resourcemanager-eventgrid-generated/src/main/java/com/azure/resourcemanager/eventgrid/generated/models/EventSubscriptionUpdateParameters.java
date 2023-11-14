// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties of the Event Subscription update.
 */
@Fluent
public final class EventSubscriptionUpdateParameters {
    /*
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     */
    @JsonProperty(value = "destination")
    private EventSubscriptionDestination destination;

    /*
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     */
    @JsonProperty(value = "deliveryWithResourceIdentity")
    private DeliveryWithResourceIdentity deliveryWithResourceIdentity;

    /*
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "filter")
    private EventSubscriptionFilter filter;

    /*
     * List of user defined labels.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * Information about the expiration time for the event subscription.
     */
    @JsonProperty(value = "expirationTimeUtc")
    private OffsetDateTime expirationTimeUtc;

    /*
     * The event delivery schema for the event subscription.
     */
    @JsonProperty(value = "eventDeliverySchema")
    private EventDeliverySchema eventDeliverySchema;

    /*
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live
     * for events.
     */
    @JsonProperty(value = "retryPolicy")
    private RetryPolicy retryPolicy;

    /*
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is
     * sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     */
    @JsonProperty(value = "deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /*
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is
     * sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     */
    @JsonProperty(value = "deadLetterWithResourceIdentity")
    private DeadLetterWithResourceIdentity deadLetterWithResourceIdentity;

    /**
     * Creates an instance of EventSubscriptionUpdateParameters class.
     */
    public EventSubscriptionUpdateParameters() {
    }

    /**
     * Get the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @return the destination value.
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @param destination the destination value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the deliveryWithResourceIdentity property: Information about the destination where events have to be
     * delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     * 
     * @return the deliveryWithResourceIdentity value.
     */
    public DeliveryWithResourceIdentity deliveryWithResourceIdentity() {
        return this.deliveryWithResourceIdentity;
    }

    /**
     * Set the deliveryWithResourceIdentity property: Information about the destination where events have to be
     * delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     * 
     * @param deliveryWithResourceIdentity the deliveryWithResourceIdentity value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters
        withDeliveryWithResourceIdentity(DeliveryWithResourceIdentity deliveryWithResourceIdentity) {
        this.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
        return this;
    }

    /**
     * Get the filter property: Information about the filter for the event subscription.
     * 
     * @return the filter value.
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Information about the filter for the event subscription.
     * 
     * @param filter the filter value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the labels property: List of user defined labels.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of user defined labels.
     * 
     * @param labels the labels value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the expirationTimeUtc property: Information about the expiration time for the event subscription.
     * 
     * @return the expirationTimeUtc value.
     */
    public OffsetDateTime expirationTimeUtc() {
        return this.expirationTimeUtc;
    }

    /**
     * Set the expirationTimeUtc property: Information about the expiration time for the event subscription.
     * 
     * @param expirationTimeUtc the expirationTimeUtc value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withExpirationTimeUtc(OffsetDateTime expirationTimeUtc) {
        this.expirationTimeUtc = expirationTimeUtc;
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @return the eventDeliverySchema value.
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     * 
     * @return the retryPolicy value.
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     * 
     * @param retryPolicy the retryPolicy value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the deadLetterDestination property: The dead letter destination of the event subscription. Any event that
     * cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @return the deadLetterDestination value.
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set the deadLetterDestination property: The dead letter destination of the event subscription. Any event that
     * cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @param deadLetterDestination the deadLetterDestination value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

    /**
     * Get the deadLetterWithResourceIdentity property: The dead letter destination of the event subscription. Any
     * event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     * 
     * @return the deadLetterWithResourceIdentity value.
     */
    public DeadLetterWithResourceIdentity deadLetterWithResourceIdentity() {
        return this.deadLetterWithResourceIdentity;
    }

    /**
     * Set the deadLetterWithResourceIdentity property: The dead letter destination of the event subscription. Any
     * event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (topic / domain) to acquire the authentication tokens
     * being used during delivery / dead-lettering.
     * 
     * @param deadLetterWithResourceIdentity the deadLetterWithResourceIdentity value to set.
     * @return the EventSubscriptionUpdateParameters object itself.
     */
    public EventSubscriptionUpdateParameters
        withDeadLetterWithResourceIdentity(DeadLetterWithResourceIdentity deadLetterWithResourceIdentity) {
        this.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (destination() != null) {
            destination().validate();
        }
        if (deliveryWithResourceIdentity() != null) {
            deliveryWithResourceIdentity().validate();
        }
        if (filter() != null) {
            filter().validate();
        }
        if (retryPolicy() != null) {
            retryPolicy().validate();
        }
        if (deadLetterDestination() != null) {
            deadLetterDestination().validate();
        }
        if (deadLetterWithResourceIdentity() != null) {
            deadLetterWithResourceIdentity().validate();
        }
    }
}
