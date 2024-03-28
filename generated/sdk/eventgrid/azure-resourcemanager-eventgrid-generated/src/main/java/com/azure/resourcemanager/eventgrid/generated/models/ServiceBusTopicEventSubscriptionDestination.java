// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ServiceBusTopicEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Information about the service bus topic destination for an event subscription.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "endpointType",
    defaultImpl = ServiceBusTopicEventSubscriptionDestination.class,
    visible = true)
@JsonTypeName("ServiceBusTopic")
@Fluent
public final class ServiceBusTopicEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Type of the endpoint for the event subscription destination.
     */
    @JsonTypeId
    @JsonProperty(value = "endpointType", required = true)
    private EndpointType endpointType = EndpointType.SERVICE_BUS_TOPIC;

    /*
     * Service Bus Topic Properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private ServiceBusTopicEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of ServiceBusTopicEventSubscriptionDestination class.
     */
    public ServiceBusTopicEventSubscriptionDestination() {
    }

    /**
     * Get the endpointType property: Type of the endpoint for the event subscription destination.
     * 
     * @return the endpointType value.
     */
    @Override
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Get the innerProperties property: Service Bus Topic Properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private ServiceBusTopicEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ServiceBusTopicEventSubscriptionDestination object itself.
     */
    public ServiceBusTopicEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceBusTopicEventSubscriptionDestinationProperties();
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
     * @return the ServiceBusTopicEventSubscriptionDestination object itself.
     */
    public ServiceBusTopicEventSubscriptionDestination
        withDeliveryAttributeMappings(List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceBusTopicEventSubscriptionDestinationProperties();
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
