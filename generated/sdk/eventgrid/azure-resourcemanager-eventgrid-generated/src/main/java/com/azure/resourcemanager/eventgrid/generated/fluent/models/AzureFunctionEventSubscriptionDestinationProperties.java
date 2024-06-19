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
 * The properties that represent the Azure Function destination of an event subscription.
 */
@Fluent
public final class AzureFunctionEventSubscriptionDestinationProperties
    implements JsonSerializable<AzureFunctionEventSubscriptionDestinationProperties> {
    /*
     * The Azure Resource Id that represents the endpoint of the Azure Function destination of an event subscription.
     */
    private String resourceId;

    /*
     * Maximum number of events per batch.
     */
    private Integer maxEventsPerBatch;

    /*
     * Preferred batch size in Kilobytes.
     */
    private Integer preferredBatchSizeInKilobytes;

    /*
     * Delivery attribute details.
     */
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

    /**
     * Creates an instance of AzureFunctionEventSubscriptionDestinationProperties class.
     */
    public AzureFunctionEventSubscriptionDestinationProperties() {
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of the Azure Function destination
     * of an event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionEventSubscriptionDestinationProperties object itself.
     */
    public AzureFunctionEventSubscriptionDestinationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the maxEventsPerBatch property: Maximum number of events per batch.
     * 
     * @return the maxEventsPerBatch value.
     */
    public Integer maxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /**
     * Set the maxEventsPerBatch property: Maximum number of events per batch.
     * 
     * @param maxEventsPerBatch the maxEventsPerBatch value to set.
     * @return the AzureFunctionEventSubscriptionDestinationProperties object itself.
     */
    public AzureFunctionEventSubscriptionDestinationProperties withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        this.maxEventsPerBatch = maxEventsPerBatch;
        return this;
    }

    /**
     * Get the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     * 
     * @return the preferredBatchSizeInKilobytes value.
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes;
    }

    /**
     * Set the preferredBatchSizeInKilobytes property: Preferred batch size in Kilobytes.
     * 
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set.
     * @return the AzureFunctionEventSubscriptionDestinationProperties object itself.
     */
    public AzureFunctionEventSubscriptionDestinationProperties
        withPreferredBatchSizeInKilobytes(Integer preferredBatchSizeInKilobytes) {
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
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
     * @return the AzureFunctionEventSubscriptionDestinationProperties object itself.
     */
    public AzureFunctionEventSubscriptionDestinationProperties
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
        jsonWriter.writeNumberField("maxEventsPerBatch", this.maxEventsPerBatch);
        jsonWriter.writeNumberField("preferredBatchSizeInKilobytes", this.preferredBatchSizeInKilobytes);
        jsonWriter.writeArrayField("deliveryAttributeMappings", this.deliveryAttributeMappings,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFunctionEventSubscriptionDestinationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionEventSubscriptionDestinationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFunctionEventSubscriptionDestinationProperties.
     */
    public static AzureFunctionEventSubscriptionDestinationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionEventSubscriptionDestinationProperties deserializedAzureFunctionEventSubscriptionDestinationProperties
                = new AzureFunctionEventSubscriptionDestinationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedAzureFunctionEventSubscriptionDestinationProperties.resourceId = reader.getString();
                } else if ("maxEventsPerBatch".equals(fieldName)) {
                    deserializedAzureFunctionEventSubscriptionDestinationProperties.maxEventsPerBatch
                        = reader.getNullable(JsonReader::getInt);
                } else if ("preferredBatchSizeInKilobytes".equals(fieldName)) {
                    deserializedAzureFunctionEventSubscriptionDestinationProperties.preferredBatchSizeInKilobytes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("deliveryAttributeMappings".equals(fieldName)) {
                    List<DeliveryAttributeMapping> deliveryAttributeMappings
                        = reader.readArray(reader1 -> DeliveryAttributeMapping.fromJson(reader1));
                    deserializedAzureFunctionEventSubscriptionDestinationProperties.deliveryAttributeMappings
                        = deliveryAttributeMappings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFunctionEventSubscriptionDestinationProperties;
        });
    }
}
