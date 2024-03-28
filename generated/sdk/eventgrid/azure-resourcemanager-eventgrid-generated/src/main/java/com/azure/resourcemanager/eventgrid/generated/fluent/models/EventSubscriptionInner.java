// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.generated.models.DeadLetterDestination;
import com.azure.resourcemanager.eventgrid.generated.models.DeadLetterWithResourceIdentity;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryWithResourceIdentity;
import com.azure.resourcemanager.eventgrid.generated.models.EventDeliverySchema;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFilter;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.RetryPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Event Subscription.
 */
@Fluent
public final class EventSubscriptionInner extends ProxyResource {
    /*
     * Properties of the event subscription.
     */
    @JsonProperty(value = "properties")
    private EventSubscriptionProperties innerProperties;

    /*
     * The system metadata relating to Event Subscription resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of EventSubscriptionInner class.
     */
    public EventSubscriptionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the event subscription.
     * 
     * @return the innerProperties value.
     */
    private EventSubscriptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Event Subscription resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the topic property: Name of the topic of the event subscription.
     * 
     * @return the topic value.
     */
    public String topic() {
        return this.innerProperties() == null ? null : this.innerProperties().topic();
    }

    /**
     * Get the provisioningState property: Provisioning state of the event subscription.
     * 
     * @return the provisioningState value.
     */
    public EventSubscriptionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
        return this.innerProperties() == null ? null : this.innerProperties().destination();
    }

    /**
     * Set the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @param destination the destination value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDestination(EventSubscriptionDestination destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withDestination(destination);
        return this;
    }

    /**
     * Get the deliveryWithResourceIdentity property: Information about the destination where events have to be
     * delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery / dead-lettering.
     * 
     * @return the deliveryWithResourceIdentity value.
     */
    public DeliveryWithResourceIdentity deliveryWithResourceIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryWithResourceIdentity();
    }

    /**
     * Set the deliveryWithResourceIdentity property: Information about the destination where events have to be
     * delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery / dead-lettering.
     * 
     * @param deliveryWithResourceIdentity the deliveryWithResourceIdentity value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner
        withDeliveryWithResourceIdentity(DeliveryWithResourceIdentity deliveryWithResourceIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withDeliveryWithResourceIdentity(deliveryWithResourceIdentity);
        return this;
    }

    /**
     * Get the filter property: Information about the filter for the event subscription.
     * 
     * @return the filter value.
     */
    public EventSubscriptionFilter filter() {
        return this.innerProperties() == null ? null : this.innerProperties().filter();
    }

    /**
     * Set the filter property: Information about the filter for the event subscription.
     * 
     * @param filter the filter value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withFilter(EventSubscriptionFilter filter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withFilter(filter);
        return this;
    }

    /**
     * Get the labels property: List of user defined labels.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.innerProperties() == null ? null : this.innerProperties().labels();
    }

    /**
     * Set the labels property: List of user defined labels.
     * 
     * @param labels the labels value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withLabels(List<String> labels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withLabels(labels);
        return this;
    }

    /**
     * Get the expirationTimeUtc property: Expiration time of the event subscription.
     * 
     * @return the expirationTimeUtc value.
     */
    public OffsetDateTime expirationTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeUtc();
    }

    /**
     * Set the expirationTimeUtc property: Expiration time of the event subscription.
     * 
     * @param expirationTimeUtc the expirationTimeUtc value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withExpirationTimeUtc(OffsetDateTime expirationTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withExpirationTimeUtc(expirationTimeUtc);
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @return the eventDeliverySchema value.
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.innerProperties() == null ? null : this.innerProperties().eventDeliverySchema();
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withEventDeliverySchema(eventDeliverySchema);
        return this;
    }

    /**
     * Get the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     * 
     * @return the retryPolicy value.
     */
    public RetryPolicy retryPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().retryPolicy();
    }

    /**
     * Set the retryPolicy property: The retry policy for events. This can be used to configure maximum number of
     * delivery attempts and time to live for events.
     * 
     * @param retryPolicy the retryPolicy value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withRetryPolicy(RetryPolicy retryPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withRetryPolicy(retryPolicy);
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
        return this.innerProperties() == null ? null : this.innerProperties().deadLetterDestination();
    }

    /**
     * Set the deadLetterDestination property: The dead letter destination of the event subscription. Any event that
     * cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery /
     * dead-lettering.
     * 
     * @param deadLetterDestination the deadLetterDestination value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withDeadLetterDestination(deadLetterDestination);
        return this;
    }

    /**
     * Get the deadLetterWithResourceIdentity property: The dead letter destination of the event subscription. Any event
     * that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery / dead-lettering.
     * 
     * @return the deadLetterWithResourceIdentity value.
     */
    public DeadLetterWithResourceIdentity deadLetterWithResourceIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().deadLetterWithResourceIdentity();
    }

    /**
     * Set the deadLetterWithResourceIdentity property: The dead letter destination of the event subscription. Any event
     * that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery / dead-lettering.
     * 
     * @param deadLetterWithResourceIdentity the deadLetterWithResourceIdentity value to set.
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner
        withDeadLetterWithResourceIdentity(DeadLetterWithResourceIdentity deadLetterWithResourceIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventSubscriptionProperties();
        }
        this.innerProperties().withDeadLetterWithResourceIdentity(deadLetterWithResourceIdentity);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
