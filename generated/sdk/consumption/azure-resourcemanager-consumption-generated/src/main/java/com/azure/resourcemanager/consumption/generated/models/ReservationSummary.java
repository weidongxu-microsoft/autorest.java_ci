// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationSummaryInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of ReservationSummary. */
public interface ReservationSummary {
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
     * Gets the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    String reservationOrderId();

    /**
     * Gets the reservationId property: The reservation ID is the identifier of a reservation within a reservation
     * order. Each reservation is the grouping for applying the benefit scope and also specifies the number of instances
     * to which the reservation benefit can be applied to.
     *
     * @return the reservationId value.
     */
    String reservationId();

    /**
     * Gets the skuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the skuName value.
     */
    String skuName();

    /**
     * Gets the reservedHours property: This is the total hours reserved. E.g. if reservation for 1 instance was made on
     * 1 PM, this will be 11 hours for that day and 24 hours from subsequent days.
     *
     * @return the reservedHours value.
     */
    BigDecimal reservedHours();

    /**
     * Gets the usageDate property: Data corresponding to the utilization record. If the grain of data is monthly, it
     * will be first day of month.
     *
     * @return the usageDate value.
     */
    OffsetDateTime usageDate();

    /**
     * Gets the usedHours property: Total used hours by the reservation.
     *
     * @return the usedHours value.
     */
    BigDecimal usedHours();

    /**
     * Gets the minUtilizationPercentage property: This is the minimum hourly utilization in the usage time (day or
     * month). E.g. if usage record corresponds to 12/10/2017 and on that for hour 4 and 5, utilization was 10%, this
     * field will return 10% for that day.
     *
     * @return the minUtilizationPercentage value.
     */
    BigDecimal minUtilizationPercentage();

    /**
     * Gets the avgUtilizationPercentage property: This is average utilization for the entire time range. (day or month
     * depending on the grain).
     *
     * @return the avgUtilizationPercentage value.
     */
    BigDecimal avgUtilizationPercentage();

    /**
     * Gets the maxUtilizationPercentage property: This is the maximum hourly utilization in the usage time (day or
     * month). E.g. if usage record corresponds to 12/10/2017 and on that for hour 4 and 5, utilization was 100%, this
     * field will return 100% for that day.
     *
     * @return the maxUtilizationPercentage value.
     */
    BigDecimal maxUtilizationPercentage();

    /**
     * Gets the kind property: The reservation kind.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the purchasedQuantity property: This is the purchased quantity for the reservationId.
     *
     * @return the purchasedQuantity value.
     */
    BigDecimal purchasedQuantity();

    /**
     * Gets the remainingQuantity property: This is the remaining quantity for the reservationId.
     *
     * @return the remainingQuantity value.
     */
    BigDecimal remainingQuantity();

    /**
     * Gets the totalReservedQuantity property: This is the total count of instances that are reserved for the
     * reservationId.
     *
     * @return the totalReservedQuantity value.
     */
    BigDecimal totalReservedQuantity();

    /**
     * Gets the usedQuantity property: This is the used quantity for the reservationId.
     *
     * @return the usedQuantity value.
     */
    BigDecimal usedQuantity();

    /**
     * Gets the utilizedPercentage property: This is the utilized percentage for the reservation Id.
     *
     * @return the utilizedPercentage value.
     */
    BigDecimal utilizedPercentage();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.generated.fluent.models.ReservationSummaryInner object.
     *
     * @return the inner object.
     */
    ReservationSummaryInner innerModel();
}
