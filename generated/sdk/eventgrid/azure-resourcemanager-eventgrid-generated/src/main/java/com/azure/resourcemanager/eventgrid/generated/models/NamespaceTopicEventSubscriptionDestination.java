// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceTopicEventSubscriptionDestinationProperties;
import java.io.IOException;

/**
 * Information about the Namespace Topic destination for an event subscription.
 */
@Fluent
public final class NamespaceTopicEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Type of the endpoint for the event subscription destination.
     */
    private EndpointType endpointType = EndpointType.NAMESPACE_TOPIC;

    /*
     * Namespace Topic properties of the event subscription destination.
     */
    private NamespaceTopicEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of NamespaceTopicEventSubscriptionDestination class.
     */
    public NamespaceTopicEventSubscriptionDestination() {
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
     * Get the innerProperties property: Namespace Topic properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private NamespaceTopicEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure resource Id that represents the endpoint of the Event Grid Namespace Topic
     * destination of an event subscription.
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
     * Set the resourceId property: The Azure resource Id that represents the endpoint of the Event Grid Namespace Topic
     * destination of an event subscription.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("endpointType", this.endpointType == null ? null : this.endpointType.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamespaceTopicEventSubscriptionDestination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamespaceTopicEventSubscriptionDestination if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NamespaceTopicEventSubscriptionDestination.
     */
    public static NamespaceTopicEventSubscriptionDestination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NamespaceTopicEventSubscriptionDestination deserializedNamespaceTopicEventSubscriptionDestination
                = new NamespaceTopicEventSubscriptionDestination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpointType".equals(fieldName)) {
                    deserializedNamespaceTopicEventSubscriptionDestination.endpointType
                        = EndpointType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedNamespaceTopicEventSubscriptionDestination.innerProperties
                        = NamespaceTopicEventSubscriptionDestinationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNamespaceTopicEventSubscriptionDestination;
        });
    }
}
