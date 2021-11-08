// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.commerce.generated.fluent.UsageAggregatesClient;
import com.azure.resourcemanager.commerce.generated.fluent.models.UsageAggregationInner;
import com.azure.resourcemanager.commerce.generated.models.AggregationGranularity;
import com.azure.resourcemanager.commerce.generated.models.UsageAggregates;
import com.azure.resourcemanager.commerce.generated.models.UsageAggregation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;

public final class UsageAggregatesImpl implements UsageAggregates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageAggregatesImpl.class);

    private final UsageAggregatesClient innerClient;

    private final com.azure.resourcemanager.commerce.generated.UsageManager serviceManager;

    public UsageAggregatesImpl(
        UsageAggregatesClient innerClient, com.azure.resourcemanager.commerce.generated.UsageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UsageAggregation> list(OffsetDateTime reportedStartTime, OffsetDateTime reportedEndTime) {
        PagedIterable<UsageAggregationInner> inner = this.serviceClient().list(reportedStartTime, reportedEndTime);
        return Utils.mapPage(inner, inner1 -> new UsageAggregationImpl(inner1, this.manager()));
    }

    public PagedIterable<UsageAggregation> list(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken,
        Context context) {
        PagedIterable<UsageAggregationInner> inner =
            this
                .serviceClient()
                .list(
                    reportedStartTime,
                    reportedEndTime,
                    showDetails,
                    aggregationGranularity,
                    continuationToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new UsageAggregationImpl(inner1, this.manager()));
    }

    private UsageAggregatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.commerce.generated.UsageManager manager() {
        return this.serviceManager;
    }
}
