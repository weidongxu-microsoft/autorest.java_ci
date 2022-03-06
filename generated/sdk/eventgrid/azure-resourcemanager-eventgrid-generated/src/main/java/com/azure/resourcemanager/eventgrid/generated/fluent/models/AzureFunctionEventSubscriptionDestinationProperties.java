// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryAttributeMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that represent the Azure Function destination of an event subscription. */
@Fluent
public final class AzureFunctionEventSubscriptionDestinationProperties {
    /*
     * The Azure Resource Id that represents the endpoint of the Azure Function
     * destination of an event subscription.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Maximum number of events per batch.
     */
    @JsonProperty(value = "maxEventsPerBatch")
    private Integer maxEventsPerBatch;

    /*
     * Preferred batch size in Kilobytes.
     */
    @JsonProperty(value = "preferredBatchSizeInKilobytes")
    private Integer preferredBatchSizeInKilobytes;

    /*
     * Delivery attribute details.
     */
    @JsonProperty(value = "deliveryAttributeMappings")
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

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
    public AzureFunctionEventSubscriptionDestinationProperties withPreferredBatchSizeInKilobytes(
        Integer preferredBatchSizeInKilobytes) {
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
    public AzureFunctionEventSubscriptionDestinationProperties withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
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
}
