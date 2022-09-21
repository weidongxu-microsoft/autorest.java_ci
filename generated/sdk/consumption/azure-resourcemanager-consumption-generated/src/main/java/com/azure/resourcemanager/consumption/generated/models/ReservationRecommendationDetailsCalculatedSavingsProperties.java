// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of estimated savings. */
@Fluent
public final class ReservationRecommendationDetailsCalculatedSavingsProperties {
    /*
     * The cost without reservation.
     */
    @JsonProperty(value = "onDemandCost", access = JsonProperty.Access.WRITE_ONLY)
    private Float onDemandCost;

    /*
     * The difference between total reservation cost and reservation cost.
     */
    @JsonProperty(value = "overageCost", access = JsonProperty.Access.WRITE_ONLY)
    private Float overageCost;

    /*
     * The quantity for calculated savings.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Float quantity;

    /*
     * The exact cost of the estimated usage using reservation.
     */
    @JsonProperty(value = "reservationCost", access = JsonProperty.Access.WRITE_ONLY)
    private Float reservationCost;

    /*
     * The cost of the suggested quantity.
     */
    @JsonProperty(value = "totalReservationCost", access = JsonProperty.Access.WRITE_ONLY)
    private Float totalReservationCost;

    /*
     * The number of reserved units used to calculate savings. Always 1 for virtual machines.
     */
    @JsonProperty(value = "reservedUnitCount")
    private Float reservedUnitCount;

    /*
     * The amount saved by purchasing the recommended quantity of reservation.
     */
    @JsonProperty(value = "savings", access = JsonProperty.Access.WRITE_ONLY)
    private Float savings;

    /** Creates an instance of ReservationRecommendationDetailsCalculatedSavingsProperties class. */
    public ReservationRecommendationDetailsCalculatedSavingsProperties() {
    }

    /**
     * Get the onDemandCost property: The cost without reservation.
     *
     * @return the onDemandCost value.
     */
    public Float onDemandCost() {
        return this.onDemandCost;
    }

    /**
     * Get the overageCost property: The difference between total reservation cost and reservation cost.
     *
     * @return the overageCost value.
     */
    public Float overageCost() {
        return this.overageCost;
    }

    /**
     * Get the quantity property: The quantity for calculated savings.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Get the reservationCost property: The exact cost of the estimated usage using reservation.
     *
     * @return the reservationCost value.
     */
    public Float reservationCost() {
        return this.reservationCost;
    }

    /**
     * Get the totalReservationCost property: The cost of the suggested quantity.
     *
     * @return the totalReservationCost value.
     */
    public Float totalReservationCost() {
        return this.totalReservationCost;
    }

    /**
     * Get the reservedUnitCount property: The number of reserved units used to calculate savings. Always 1 for virtual
     * machines.
     *
     * @return the reservedUnitCount value.
     */
    public Float reservedUnitCount() {
        return this.reservedUnitCount;
    }

    /**
     * Set the reservedUnitCount property: The number of reserved units used to calculate savings. Always 1 for virtual
     * machines.
     *
     * @param reservedUnitCount the reservedUnitCount value to set.
     * @return the ReservationRecommendationDetailsCalculatedSavingsProperties object itself.
     */
    public ReservationRecommendationDetailsCalculatedSavingsProperties withReservedUnitCount(Float reservedUnitCount) {
        this.reservedUnitCount = reservedUnitCount;
        return this;
    }

    /**
     * Get the savings property: The amount saved by purchasing the recommended quantity of reservation.
     *
     * @return the savings value.
     */
    public Float savings() {
        return this.savings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
