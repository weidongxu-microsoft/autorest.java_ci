// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerEventSubscriptionDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The PartnerEventSubscriptionDestination model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("PartnerDestination")
@Fluent
public final class PartnerEventSubscriptionDestination extends EventSubscriptionDestination {
    /*
     * Partner Destination Properties of the event subscription destination.
     */
    @JsonProperty(value = "properties")
    private PartnerEventSubscriptionDestinationProperties innerProperties;

    /**
     * Creates an instance of PartnerEventSubscriptionDestination class.
     */
    public PartnerEventSubscriptionDestination() {
    }

    /**
     * Get the innerProperties property: Partner Destination Properties of the event subscription destination.
     * 
     * @return the innerProperties value.
     */
    private PartnerEventSubscriptionDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of a Partner Destination of an
     * event subscription.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of a Partner Destination of an
     * event subscription.
     * 
     * @param resourceId the resourceId value to set.
     * @return the PartnerEventSubscriptionDestination object itself.
     */
    public PartnerEventSubscriptionDestination withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerEventSubscriptionDestinationProperties();
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
