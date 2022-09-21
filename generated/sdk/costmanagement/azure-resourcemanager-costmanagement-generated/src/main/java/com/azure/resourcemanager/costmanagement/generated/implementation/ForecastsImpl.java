// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.generated.fluent.ForecastsClient;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.QueryResultInner;
import com.azure.resourcemanager.costmanagement.generated.models.ExternalCloudProviderType;
import com.azure.resourcemanager.costmanagement.generated.models.ForecastDefinition;
import com.azure.resourcemanager.costmanagement.generated.models.Forecasts;
import com.azure.resourcemanager.costmanagement.generated.models.QueryResult;

public final class ForecastsImpl implements Forecasts {
    private static final ClientLogger LOGGER = new ClientLogger(ForecastsImpl.class);

    private final ForecastsClient innerClient;

    private final com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager;

    public ForecastsImpl(
        ForecastsClient innerClient,
        com.azure.resourcemanager.costmanagement.generated.CostManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<QueryResult> usageWithResponse(
        String scope, ForecastDefinition parameters, String filter, Context context) {
        Response<QueryResultInner> inner = this.serviceClient().usageWithResponse(scope, parameters, filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QueryResult usage(String scope, ForecastDefinition parameters) {
        QueryResultInner inner = this.serviceClient().usage(scope, parameters);
        if (inner != null) {
            return new QueryResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QueryResult> externalCloudProviderUsageWithResponse(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        ForecastDefinition parameters,
        String filter,
        Context context) {
        Response<QueryResultInner> inner =
            this
                .serviceClient()
                .externalCloudProviderUsageWithResponse(
                    externalCloudProviderType, externalCloudProviderId, parameters, filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QueryResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QueryResult externalCloudProviderUsage(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        ForecastDefinition parameters) {
        QueryResultInner inner =
            this
                .serviceClient()
                .externalCloudProviderUsage(externalCloudProviderType, externalCloudProviderId, parameters);
        if (inner != null) {
            return new QueryResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ForecastsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.costmanagement.generated.CostManagementManager manager() {
        return this.serviceManager;
    }
}
