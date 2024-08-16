// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about the destination for an event subscription.
 */
@Immutable
public class EventSubscriptionDestination implements JsonSerializable<EventSubscriptionDestination> {
    /*
     * Type of the endpoint for the event subscription destination.
     */
    EndpointType endpointType;

    /**
     * Creates an instance of EventSubscriptionDestination class.
     */
    public EventSubscriptionDestination() {
        this.endpointType = EndpointType.fromString("EventSubscriptionDestination");
    }

    /**
     * Get the endpointType property: Type of the endpoint for the event subscription destination.
     * 
     * @return the endpointType value.
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    void toJsonShared(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStringField("endpointType", this.endpointType == null ? null : this.endpointType.toString());
    }

    /**
     * Reads an instance of EventSubscriptionDestination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventSubscriptionDestination if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventSubscriptionDestination.
     */
    public static EventSubscriptionDestination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("endpointType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("WebHook".equals(discriminatorValue)) {
                    return WebhookEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("EventHub".equals(discriminatorValue)) {
                    return EventHubEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("StorageQueue".equals(discriminatorValue)) {
                    return StorageQueueEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("HybridConnection".equals(discriminatorValue)) {
                    return HybridConnectionEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("ServiceBusQueue".equals(discriminatorValue)) {
                    return ServiceBusQueueEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("ServiceBusTopic".equals(discriminatorValue)) {
                    return ServiceBusTopicEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("AzureFunction".equals(discriminatorValue)) {
                    return AzureFunctionEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("PartnerDestination".equals(discriminatorValue)) {
                    return PartnerEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("MonitorAlert".equals(discriminatorValue)) {
                    return MonitorAlertEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else if ("NamespaceTopic".equals(discriminatorValue)) {
                    return NamespaceTopicEventSubscriptionDestination.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static EventSubscriptionDestination fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventSubscriptionDestination deserializedEventSubscriptionDestination = new EventSubscriptionDestination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpointType".equals(fieldName)) {
                    deserializedEventSubscriptionDestination.endpointType = EndpointType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventSubscriptionDestination;
        });
    }
}
