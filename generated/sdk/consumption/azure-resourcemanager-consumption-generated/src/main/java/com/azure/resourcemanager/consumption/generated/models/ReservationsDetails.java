// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of ReservationsDetails. */
public interface ReservationsDetails {
    /**
     * Lists the reservations details for provided date range. Note: ARM has a payload size limit of 12MB, so currently
     * callers get 502 when the response size exceeds the ARM limit. In such cases, API call should be made with smaller
     * date ranges.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The
     *     filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> listByReservationOrder(String reservationOrderId, String filter);

    /**
     * Lists the reservations details for provided date range. Note: ARM has a payload size limit of 12MB, so currently
     * callers get 502 when the response size exceeds the ARM limit. In such cases, API call should be made with smaller
     * date ranges.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The
     *     filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> listByReservationOrder(String reservationOrderId, String filter, Context context);

    /**
     * Lists the reservations details for provided date range. Note: ARM has a payload size limit of 12MB, so currently
     * callers get 502 when the response size exceeds the ARM limit. In such cases, API call should be made with smaller
     * date ranges.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation.
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The
     *     filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, String filter);

    /**
     * Lists the reservations details for provided date range. Note: ARM has a payload size limit of 12MB, so currently
     * callers get 502 when the response size exceeds the ARM limit. In such cases, API call should be made with smaller
     * date ranges.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation.
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The
     *     filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, String filter, Context context);

    /**
     * Lists the reservations details for the defined scope and provided date range. Note: ARM has a payload size limit
     * of 12MB, so currently callers get 502 when the response size exceeds the ARM limit. In such cases, API call
     * should be made with smaller date ranges.
     *
     * @param resourceScope The scope associated with reservations details operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope (legacy), and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope (modern).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> list(String resourceScope);

    /**
     * Lists the reservations details for the defined scope and provided date range. Note: ARM has a payload size limit
     * of 12MB, so currently callers get 502 when the response size exceeds the ARM limit. In such cases, API call
     * should be made with smaller date ranges.
     *
     * @param resourceScope The scope associated with reservations details operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope (legacy), and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope (modern).
     * @param startDate Start date. Only applicable when querying with billing profile.
     * @param endDate End date. Only applicable when querying with billing profile.
     * @param filter Filter reservation details by date range. The properties/UsageDate for start date and end date. The
     *     filter supports 'le' and 'ge'. Not applicable when querying with billing profile.
     * @param reservationId Reservation Id GUID. Only valid if reservationOrderId is also provided. Filter to a specific
     *     reservation.
     * @param reservationOrderId Reservation Order Id GUID. Required if reservationId is provided. Filter to a specific
     *     reservation order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationDetail> list(
        String resourceScope,
        String startDate,
        String endDate,
        String filter,
        String reservationId,
        String reservationOrderId,
        Context context);
}
