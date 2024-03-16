// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of the modern reservation recommendation for shared scope.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "scope",
    defaultImpl = ModernSharedScopeReservationRecommendationProperties.class,
    visible = true)
@JsonTypeName("Shared")
@Immutable
public final class ModernSharedScopeReservationRecommendationProperties
    extends ModernReservationRecommendationProperties {
    /**
     * Creates an instance of ModernSharedScopeReservationRecommendationProperties class.
     */
    public ModernSharedScopeReservationRecommendationProperties() {
        withScope("Shared");
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
