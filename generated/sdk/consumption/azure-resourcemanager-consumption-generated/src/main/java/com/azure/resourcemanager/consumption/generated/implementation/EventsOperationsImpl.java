// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.EventsOperationsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.EventSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.EventSummary;
import com.azure.resourcemanager.consumption.generated.models.EventsOperations;

public final class EventsOperationsImpl implements EventsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(EventsOperationsImpl.class);

    private final EventsOperationsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public EventsOperationsImpl(
        EventsOperationsClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EventSummary> listByBillingProfile(
        String billingAccountId, String billingProfileId, String startDate, String endDate) {
        PagedIterable<EventSummaryInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId, startDate, endDate);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSummary> listByBillingProfile(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context) {
        PagedIterable<EventSummaryInner> inner =
            this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId, startDate, endDate, context);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSummary> listByBillingAccount(String billingAccountId) {
        PagedIterable<EventSummaryInner> inner = this.serviceClient().listByBillingAccount(billingAccountId);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSummary> listByBillingAccount(String billingAccountId, String filter, Context context) {
        PagedIterable<EventSummaryInner> inner =
            this.serviceClient().listByBillingAccount(billingAccountId, filter, context);
        return Utils.mapPage(inner, inner1 -> new EventSummaryImpl(inner1, this.manager()));
    }

    private EventsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
