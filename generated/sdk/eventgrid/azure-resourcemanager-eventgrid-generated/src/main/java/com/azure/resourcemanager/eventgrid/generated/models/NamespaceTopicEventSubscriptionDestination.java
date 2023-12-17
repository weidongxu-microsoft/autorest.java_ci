// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceTopicEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about the Namespace Topic destination for an event subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("NamespaceTopic")
@Fluent
public final class NamespaceTopicEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Namespace Topic properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private NamespaceTopicEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of NamespaceTopicEventSubscriptionDestination class.
     */
    public NamespaceTopicEventSubscriptionDestination() {
    }

    /**
     * Get the innerProperties property: Namespace Topic properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private NamespaceTopicEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure resource Id that represents the endpoint of the Event Grid Namespace
     * Topic destination of an event subscription.
     * This field is required and the Namespace Topic resource listed must already exist.
     * The resource ARM Id should follow this pattern:
     * /subscriptions/{AzureSubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.EventGrid/namespaces/{NamespaceName}/topics/{TopicName}.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure resource Id that represents the endpoint of the Event Grid Namespace
     * Topic destination of an event subscription.
     * This field is required and the Namespace Topic resource listed must already exist.
     * The resource ARM Id should follow this pattern:
     * /subscriptions/{AzureSubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.EventGrid/namespaces/{NamespaceName}/topics/{TopicName}.
     * 
     * @param resourceId the resourceId value to set.
     * @return the NamespaceTopicEventSubscriptionDestination object itself.
     */
    public NamespaceTopicEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NamespaceTopicEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
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