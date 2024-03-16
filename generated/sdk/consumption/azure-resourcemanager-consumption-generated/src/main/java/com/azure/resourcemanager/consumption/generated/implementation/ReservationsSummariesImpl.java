// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.ReservationsSummariesClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.Datagrain;
import com.azure.resourcemanager.consumption.generated.models.ReservationsSummaries;
import com.azure.resourcemanager.consumption.generated.models.ReservationSummary;

public final class ReservationsSummariesImpl implements ReservationsSummaries {
    private static final ClientLogger LOGGER = new ClientLogger(ReservationsSummariesImpl.class);

    private final ReservationsSummariesClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public ReservationsSummariesImpl(ReservationsSummariesClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReservationSummary> listByReservationOrder(String reservationOrderId, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner
            = this.serviceClient().listByReservationOrder(reservationOrderId, grain);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrder(String reservationOrderId, Datagrain grain,
        String filter, Context context) {
        PagedIterable<ReservationSummaryInner> inner
            = this.serviceClient().listByReservationOrder(reservationOrderId, grain, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrderAndReservation(String reservationOrderId,
        String reservationId, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner
            = this.serviceClient().listByReservationOrderAndReservation(reservationOrderId, reservationId, grain);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> listByReservationOrderAndReservation(String reservationOrderId,
        String reservationId, Datagrain grain, String filter, Context context) {
        PagedIterable<ReservationSummaryInner> inner = this.serviceClient()
            .listByReservationOrderAndReservation(reservationOrderId, reservationId, grain, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> list(String resourceScope, Datagrain grain) {
        PagedIterable<ReservationSummaryInner> inner = this.serviceClient().list(resourceScope, grain);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationSummary> list(String resourceScope, Datagrain grain, String startDate,
        String endDate, String filter, String reservationId, String reservationOrderId, Context context) {
        PagedIterable<ReservationSummaryInner> inner = this.serviceClient()
            .list(resourceScope, grain, startDate, endDate, filter, reservationId, reservationOrderId, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationSummaryImpl(inner1, this.manager()));
    }

    private ReservationsSummariesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
