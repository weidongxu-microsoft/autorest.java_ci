// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationInner;
import java.util.Map;

/**
 * An immutable client-side representation of ReservationRecommendation.
 */
public interface ReservationRecommendation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Specifies the kind of reservation recommendation.
     * 
     * @return the kind value.
     */
    ReservationRecommendationKind kind();

    /**
     * Gets the etag property: The etag for the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the location property: Resource location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the sku property: Resource sku.
     * 
     * @return the sku value.
     */
    String sku();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationInner
     * object.
     * 
     * @return the inner object.
     */
    ReservationRecommendationInner innerModel();
}
