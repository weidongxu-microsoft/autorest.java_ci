// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.VMInsightsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.VMInsightsOnboardingStatusInner;
import com.azure.resourcemanager.monitor.generated.models.VMInsights;
import com.azure.resourcemanager.monitor.generated.models.VMInsightsOnboardingStatus;

public final class VMInsightsImpl implements VMInsights {
    private static final ClientLogger LOGGER = new ClientLogger(VMInsightsImpl.class);

    private final VMInsightsClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public VMInsightsImpl(VMInsightsClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VMInsightsOnboardingStatus> getOnboardingStatusWithResponse(String resourceUri, Context context) {
        Response<VMInsightsOnboardingStatusInner> inner
            = this.serviceClient().getOnboardingStatusWithResponse(resourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VMInsightsOnboardingStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VMInsightsOnboardingStatus getOnboardingStatus(String resourceUri) {
        VMInsightsOnboardingStatusInner inner = this.serviceClient().getOnboardingStatus(resourceUri);
        if (inner != null) {
            return new VMInsightsOnboardingStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private VMInsightsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
