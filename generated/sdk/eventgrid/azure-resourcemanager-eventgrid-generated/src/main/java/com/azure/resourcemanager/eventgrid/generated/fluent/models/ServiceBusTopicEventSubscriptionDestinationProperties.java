// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeMapping;
import java.io.IOException;
import java.util.List;

/**
 * The properties that represent the Service Bus Topic destination of an event subscription.
 */
@Fluent
public final class ServiceBusTopicEventSubscriptionDestinationProperties
    implements JsonSerializable<ServiceBusTopicEventSubscriptionDestinationProperties> {
    /*
     * The Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     */
    private String resourceId;

    /*
     * Delivery attribute details.
     */
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

    /**
     * Creates an instance of ServiceBusTopicEventSubscriptionDestinationProperties class.
     */
    public ServiceBusTopicEventSubscriptionDestinationProperties() {
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Service Bus Topic
     * destination of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ServiceBusTopicEventSubscriptionDestinationProperties object itself.
     */
    public ServiceBusTopicEventSubscriptionDestinationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     * 
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.deliveryAttributeMappings;
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     * 
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the ServiceBusTopicEventSubscriptionDestinationProperties object itself.
     */
    public ServiceBusTopicEventSubscriptionDestinationProperties
        withDeliveryAttributeMappings(List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        this.deliveryAttributeMappings = deliveryAttributeMappings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryAttributeMappings() != null) {
            deliveryAttributeMappings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeArrayField("deliveryAttributeMappings", this.deliveryAttributeMappings,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceBusTopicEventSubscriptionDestinationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceBusTopicEventSubscriptionDestinationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceBusTopicEventSubscriptionDestinationProperties.
     */
    public static ServiceBusTopicEventSubscriptionDestinationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceBusTopicEventSubscriptionDestinationProperties deserializedServiceBusTopicEventSubscriptionDestinationProperties
                = new ServiceBusTopicEventSubscriptionDestinationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedServiceBusTopicEventSubscriptionDestinationProperties.resourceId = reader.getString();
                } else if ("deliveryAttributeMappings".equals(fieldName)) {
                    List<DeliveryAttributeMapping> deliveryAttributeMappings
                        = reader.readArray(reader1 -> DeliveryAttributeMapping.fromJson(reader1));
                    deserializedServiceBusTopicEventSubscriptionDestinationProperties.deliveryAttributeMappings
                        = deliveryAttributeMappings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceBusTopicEventSubscriptionDestinationProperties;
        });
    }
}
