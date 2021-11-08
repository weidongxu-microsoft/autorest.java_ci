// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsResourceProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsSavingsProperties;
import com.azure.resourcemanager.consumption.generated.models.ReservationRecommendationDetailsUsageProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Reservation recommendation details. */
@Fluent
public final class ReservationRecommendationDetailsModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationRecommendationDetailsModelInner.class);

    /*
     * Resource Location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource sku
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The properties of the reservation recommendation.
     */
    @JsonProperty(value = "properties")
    private ReservationRecommendationDetailsProperties innerProperties;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: Resource sku.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Resource sku.
     *
     * @param sku the sku value to set.
     * @return the ReservationRecommendationDetailsModelInner object itself.
     */
    public ReservationRecommendationDetailsModelInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the reservation recommendation.
     *
     * @return the innerProperties value.
     */
    private ReservationRecommendationDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the currency property: An ISO 4217 currency code identifier for the costs and savings.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.innerProperties() == null ? null : this.innerProperties().currency();
    }

    /**
     * Get the resource property: Resource specific properties.
     *
     * @return the resource value.
     */
    public ReservationRecommendationDetailsResourceProperties resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Get the resourceGroup property: Resource Group.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroup();
    }

    /**
     * Get the savings property: Savings information for the recommendation.
     *
     * @return the savings value.
     */
    public ReservationRecommendationDetailsSavingsProperties savings() {
        return this.innerProperties() == null ? null : this.innerProperties().savings();
    }

    /**
     * Get the scope property: Scope of the reservation, ex: Single or Shared.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the usage property: Historical usage details used to calculate the estimated savings.
     *
     * @return the usage value.
     */
    public ReservationRecommendationDetailsUsageProperties usage() {
        return this.innerProperties() == null ? null : this.innerProperties().usage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
