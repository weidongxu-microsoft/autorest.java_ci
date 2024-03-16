// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details of the resource.
 */
@Immutable
public final class ReservationRecommendationDetailsResourceProperties {
    /*
     * List of subscriptions for which the reservation is applied.
     */
    @JsonProperty(value = "appliedScopes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> appliedScopes;

    /*
     * Hourly on-demand rate of the resource. Includes only hardware rate i.e, software rate is not included.
     */
    @JsonProperty(value = "onDemandRate", access = JsonProperty.Access.WRITE_ONLY)
    private Float onDemandRate;

    /*
     * Azure product ex: Standard_E8s_v3 etc.
     */
    @JsonProperty(value = "product", access = JsonProperty.Access.WRITE_ONLY)
    private String product;

    /*
     * Azure resource region ex:EastUS, WestUS etc.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * Hourly reservation rate of the resource. Varies based on the term.
     */
    @JsonProperty(value = "reservationRate", access = JsonProperty.Access.WRITE_ONLY)
    private Float reservationRate;

    /*
     * The azure resource type.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * Creates an instance of ReservationRecommendationDetailsResourceProperties class.
     */
    public ReservationRecommendationDetailsResourceProperties() {
    }

    /**
     * Get the appliedScopes property: List of subscriptions for which the reservation is applied.
     * 
     * @return the appliedScopes value.
     */
    public List<String> appliedScopes() {
        return this.appliedScopes;
    }

    /**
     * Get the onDemandRate property: Hourly on-demand rate of the resource. Includes only hardware rate i.e, software rate is not included.
     * 
     * @return the onDemandRate value.
     */
    public Float onDemandRate() {
        return this.onDemandRate;
    }

    /**
     * Get the product property: Azure product ex: Standard_E8s_v3 etc.
     * 
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Get the region property: Azure resource region ex:EastUS, WestUS etc.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the reservationRate property: Hourly reservation rate of the resource. Varies based on the term.
     * 
     * @return the reservationRate value.
     */
    public Float reservationRate() {
        return this.reservationRate;
    }

    /**
     * Get the resourceType property: The azure resource type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
