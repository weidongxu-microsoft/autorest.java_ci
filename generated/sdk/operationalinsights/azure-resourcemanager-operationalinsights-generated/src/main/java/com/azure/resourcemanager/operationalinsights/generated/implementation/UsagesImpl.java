// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.UsagesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.UsageMetricInner;
import com.azure.resourcemanager.operationalinsights.generated.models.UsageMetric;
import com.azure.resourcemanager.operationalinsights.generated.models.Usages;

public final class UsagesImpl implements Usages {
    private static final ClientLogger LOGGER = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UsageMetric> list(String resourceGroupName, String workspaceName) {
        PagedIterable<UsageMetricInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new UsageMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<UsageMetric> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<UsageMetricInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new UsageMetricImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
