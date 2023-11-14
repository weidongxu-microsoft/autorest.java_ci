// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.LotsOperationsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.LotSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.LotSummary;
import com.azure.resourcemanager.consumption.generated.models.LotsOperations;

public final class LotsOperationsImpl implements LotsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(LotsOperationsImpl.class);

    private final LotsOperationsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public LotsOperationsImpl(LotsOperationsClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LotSummary> listByBillingProfile(String billingAccountId, String billingProfileId) {
        PagedIterable<LotSummaryInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<LotSummary> listByBillingProfile(String billingAccountId, String billingProfileId,
        Context context) {
        PagedIterable<LotSummaryInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId, context);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<LotSummary> listByBillingAccount(String billingAccountId) {
        PagedIterable<LotSummaryInner> inner = this.serviceClient().listByBillingAccount(billingAccountId);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<LotSummary> listByBillingAccount(String billingAccountId, String filter, Context context) {
        PagedIterable<LotSummaryInner> inner
            = this.serviceClient().listByBillingAccount(billingAccountId, filter, context);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<LotSummary> listByCustomer(String billingAccountId, String customerId) {
        PagedIterable<LotSummaryInner> inner = this.serviceClient().listByCustomer(billingAccountId, customerId);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    public PagedIterable<LotSummary> listByCustomer(String billingAccountId, String customerId, String filter,
        Context context) {
        PagedIterable<LotSummaryInner> inner
            = this.serviceClient().listByCustomer(billingAccountId, customerId, filter, context);
        return Utils.mapPage(inner, inner1 -> new LotSummaryImpl(inner1, this.manager()));
    }

    private LotsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
