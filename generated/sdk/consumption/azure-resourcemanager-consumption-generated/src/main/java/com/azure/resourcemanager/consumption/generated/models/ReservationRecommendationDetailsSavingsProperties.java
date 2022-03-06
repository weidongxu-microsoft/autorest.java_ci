// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details of the estimated savings. */
@Fluent
public final class ReservationRecommendationDetailsSavingsProperties {
    /*
     * List of calculated savings.
     */
    @JsonProperty(value = "calculatedSavings")
    private List<ReservationRecommendationDetailsCalculatedSavingsProperties> calculatedSavings;

    /*
     * Number of days of usage to look back used for computing the
     * recommendation.
     */
    @JsonProperty(value = "lookBackPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lookBackPeriod;

    /*
     * Number of recommended units of the resource.
     */
    @JsonProperty(value = "recommendedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private Float recommendedQuantity;

    /*
     * Term period of the reservation, ex: P1Y or P3Y.
     */
    @JsonProperty(value = "reservationOrderTerm", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderTerm;

    /*
     * Type of savings, ex: instance.
     */
    @JsonProperty(value = "savingsType", access = JsonProperty.Access.WRITE_ONLY)
    private String savingsType;

    /*
     * Measurement unit ex: hour etc.
     */
    @JsonProperty(value = "unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /**
     * Get the calculatedSavings property: List of calculated savings.
     *
     * @return the calculatedSavings value.
     */
    public List<ReservationRecommendationDetailsCalculatedSavingsProperties> calculatedSavings() {
        return this.calculatedSavings;
    }

    /**
     * Set the calculatedSavings property: List of calculated savings.
     *
     * @param calculatedSavings the calculatedSavings value to set.
     * @return the ReservationRecommendationDetailsSavingsProperties object itself.
     */
    public ReservationRecommendationDetailsSavingsProperties withCalculatedSavings(
        List<ReservationRecommendationDetailsCalculatedSavingsProperties> calculatedSavings) {
        this.calculatedSavings = calculatedSavings;
        return this;
    }

    /**
     * Get the lookBackPeriod property: Number of days of usage to look back used for computing the recommendation.
     *
     * @return the lookBackPeriod value.
     */
    public Integer lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Get the recommendedQuantity property: Number of recommended units of the resource.
     *
     * @return the recommendedQuantity value.
     */
    public Float recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Get the reservationOrderTerm property: Term period of the reservation, ex: P1Y or P3Y.
     *
     * @return the reservationOrderTerm value.
     */
    public String reservationOrderTerm() {
        return this.reservationOrderTerm;
    }

    /**
     * Get the savingsType property: Type of savings, ex: instance.
     *
     * @return the savingsType value.
     */
    public String savingsType() {
        return this.savingsType;
    }

    /**
     * Get the unitOfMeasure property: Measurement unit ex: hour etc.
     *
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (calculatedSavings() != null) {
            calculatedSavings().forEach(e -> e.validate());
        }
    }
}
