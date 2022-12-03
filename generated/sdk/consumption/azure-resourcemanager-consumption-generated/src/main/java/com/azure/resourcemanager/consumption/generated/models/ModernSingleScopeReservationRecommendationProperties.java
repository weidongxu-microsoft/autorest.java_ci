// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** The properties of the modern reservation recommendation for single scope. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "scope")
@JsonTypeName("Single")
@Immutable
public final class ModernSingleScopeReservationRecommendationProperties
    extends ModernReservationRecommendationProperties {
    /*
     * Subscription ID associated with single scoped recommendation.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionId;

    /** Creates an instance of ModernSingleScopeReservationRecommendationProperties class. */
    public ModernSingleScopeReservationRecommendationProperties() {
    }

    /**
     * Get the subscriptionId property: Subscription ID associated with single scoped recommendation.
     *
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
