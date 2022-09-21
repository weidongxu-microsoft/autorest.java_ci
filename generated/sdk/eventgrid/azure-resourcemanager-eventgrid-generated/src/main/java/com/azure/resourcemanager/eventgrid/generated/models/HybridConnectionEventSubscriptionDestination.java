// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.HybridConnectionEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Information about the HybridConnection destination for an event subscription. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("HybridConnection")
@Fluent
public final class HybridConnectionEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Hybrid connection Properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private HybridConnectionEventSubscriptionDestinationProperties innerProperties;

    /** Creates an instance of HybridConnectionEventSubscriptionDestination class. */
    public HybridConnectionEventSubscriptionDestination() {
    }

    /**
     * Get the innerProperties property: Hybrid connection Properties of the event subscription destination.
     *
     * @return the innerProperties value.
     */
    private HybridConnectionEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource ID of an hybrid connection that is the destination of an event
     * subscription.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource ID of an hybrid connection that is the destination of an event
     * subscription.
     *
     * @param resourceId the resourceId value to set.
     * @return the HybridConnectionEventSubscriptionDestination object itself.
     */
    public HybridConnectionEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryAttributeMappings();
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the HybridConnectionEventSubscriptionDestination object itself.
     */
    public HybridConnectionEventSubscriptionDestination withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridConnectionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withDeliveryAttributeMappings(deliveryAttributeMappings);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
