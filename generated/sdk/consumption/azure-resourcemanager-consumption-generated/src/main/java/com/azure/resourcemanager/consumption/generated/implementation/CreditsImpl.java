// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.CreditsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.CreditSummaryInner;
import com.azure.resourcemanager.consumption.generated.models.CreditSummary;
import com.azure.resourcemanager.consumption.generated.models.Credits;

public final class CreditsImpl implements Credits {
    private static final ClientLogger LOGGER = new ClientLogger(CreditsImpl.class);

    private final CreditsClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public CreditsImpl(
        CreditsClient innerClient, com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CreditSummary get(String billingAccountId, String billingProfileId) {
        CreditSummaryInner inner = this.serviceClient().get(billingAccountId, billingProfileId);
        if (inner != null) {
            return new CreditSummaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CreditSummary> getWithResponse(String billingAccountId, String billingProfileId, Context context) {
        Response<CreditSummaryInner> inner =
            this.serviceClient().getWithResponse(billingAccountId, billingProfileId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CreditSummaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CreditsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
