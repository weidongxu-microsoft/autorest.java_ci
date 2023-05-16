// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.DeliveryConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.DeliverySchema;
import com.azure.resourcemanager.eventgrid.generated.models.FiltersConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.SubscriptionProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the event subscription. */
@Fluent
public final class SubscriptionProperties {
    /*
     * Provisioning state of the event subscription.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionProvisioningState provisioningState;

    /*
     * Information about the delivery configuration of the event subscription.
     */
    @JsonProperty(value = "deliveryConfiguration")
    private DeliveryConfiguration deliveryConfiguration;

    /*
     * The event delivery schema for the event subscription.
     */
    @JsonProperty(value = "eventDeliverySchema")
    private DeliverySchema eventDeliverySchema;

    /*
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "filtersConfiguration")
    private FiltersConfiguration filtersConfiguration;

    /** Creates an instance of SubscriptionProperties class. */
    public SubscriptionProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the event subscription.
     *
     * @return the provisioningState value.
     */
    public SubscriptionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     *
     * @return the deliveryConfiguration value.
     */
    public DeliveryConfiguration deliveryConfiguration() {
        return this.deliveryConfiguration;
    }

    /**
     * Set the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     *
     * @param deliveryConfiguration the deliveryConfiguration value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration) {
        this.deliveryConfiguration = deliveryConfiguration;
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     *
     * @return the eventDeliverySchema value.
     */
    public DeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     *
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withEventDeliverySchema(DeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the filtersConfiguration property: Information about the filter for the event subscription.
     *
     * @return the filtersConfiguration value.
     */
    public FiltersConfiguration filtersConfiguration() {
        return this.filtersConfiguration;
    }

    /**
     * Set the filtersConfiguration property: Information about the filter for the event subscription.
     *
     * @param filtersConfiguration the filtersConfiguration value to set.
     * @return the SubscriptionProperties object itself.
     */
    public SubscriptionProperties withFiltersConfiguration(FiltersConfiguration filtersConfiguration) {
        this.filtersConfiguration = filtersConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryConfiguration() != null) {
            deliveryConfiguration().validate();
        }
        if (filtersConfiguration() != null) {
            filtersConfiguration().validate();
        }
    }
}
