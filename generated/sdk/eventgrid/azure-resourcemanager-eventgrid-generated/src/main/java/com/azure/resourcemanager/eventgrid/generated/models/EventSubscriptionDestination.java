// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the destination for an event subscription. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "endpointType",
    defaultImpl = EventSubscriptionDestination.class)
@JsonTypeName("EventSubscriptionDestination")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "WebHook", value = WebhookEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "EventHub", value = EventHubEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "StorageQueue", value = StorageQueueEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "HybridConnection", value = HybridConnectionEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "ServiceBusQueue", value = ServiceBusQueueEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "ServiceBusTopic", value = ServiceBusTopicEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "AzureFunction", value = AzureFunctionEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "PartnerDestination", value = PartnerEventSubscriptionDestination.class)
})
@Immutable
public class EventSubscriptionDestination {
    /** Creates an instance of EventSubscriptionDestination class. */
    public EventSubscriptionDestination() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
