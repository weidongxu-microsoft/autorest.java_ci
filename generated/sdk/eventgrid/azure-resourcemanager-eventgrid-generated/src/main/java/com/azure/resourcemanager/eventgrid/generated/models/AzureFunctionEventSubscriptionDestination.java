// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.AzureFunctionEventSubscriptionDestinationProperties;
import java.io.IOException;
import java.util.List;

/**
 * Information about the azure function destination for an event subscription.
 */
@Fluent
public final class AzureFunctionEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Azure Function Properties of the event subscription destination.
     */
    private AzureFunctionEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of AzureFunctionEventSubscriptionDestination class.
     */
    public AzureFunctionEventSubscriptionDestination() {
        this.endpointType = EndpointType.AZURE_FUNCTION;
    }

    /**
     * Get the innerProperties property: Azure Function Properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private AzureFunctionEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     * 
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.innerProperties() == null ? null : this.innerProperties().maxEventsPerBatch();
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     * 
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withMaxEventsPerBatch(maxEventsPerBatch);
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     * 
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredBatchSizeInKilobytes();
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     * 
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination
        withPreferredBatchSizeInKilobytes(Integer preferredBatchSizeInKilobytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
        }
        this.innerProperties().withPreferredBatchSizeInKilobytes(preferredBatchSizeInKilobytes);
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
     * @return the AzureFunctionEventSubscriptionDestination object itself.
     */
    public AzureFunctionEventSubscriptionDestination
        withDeliveryAttributeMappings(List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFunctionEventSubscriptionDestinationProperties();
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
        toJsonShared(jsonWriter);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFunctionEventSubscriptionDestination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionEventSubscriptionDestination if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFunctionEventSubscriptionDestination.
     */
    public static AzureFunctionEventSubscriptionDestination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionEventSubscriptionDestination deserializedAzureFunctionEventSubscriptionDestination
                = new AzureFunctionEventSubscriptionDestination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpointType".equals(fieldName)) {
                    deserializedAzureFunctionEventSubscriptionDestination.endpointType
                        = EndpointType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedAzureFunctionEventSubscriptionDestination.innerProperties
                        = AzureFunctionEventSubscriptionDestinationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFunctionEventSubscriptionDestination;
        });
    }
}
