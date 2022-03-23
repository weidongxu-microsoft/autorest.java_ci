// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.QueriesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LogAnalyticsQueryPackQueryInner;
import com.azure.resourcemanager.operationalinsights.generated.models.LogAnalyticsQueryPackQuery;
import com.azure.resourcemanager.operationalinsights.generated.models.LogAnalyticsQueryPackQuerySearchProperties;
import com.azure.resourcemanager.operationalinsights.generated.models.Queries;

public final class QueriesImpl implements Queries {
    private static final ClientLogger LOGGER = new ClientLogger(QueriesImpl.class);

    private final QueriesClient innerClient;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public QueriesImpl(
        QueriesClient innerClient,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LogAnalyticsQueryPackQuery> list(String resourceGroupName, String queryPackName) {
        PagedIterable<LogAnalyticsQueryPackQueryInner> inner =
            this.serviceClient().list(resourceGroupName, queryPackName);
        return Utils.mapPage(inner, inner1 -> new LogAnalyticsQueryPackQueryImpl(inner1, this.manager()));
    }

    public PagedIterable<LogAnalyticsQueryPackQuery> list(
        String resourceGroupName,
        String queryPackName,
        Long top,
        Boolean includeBody,
        String skipToken,
        Context context) {
        PagedIterable<LogAnalyticsQueryPackQueryInner> inner =
            this.serviceClient().list(resourceGroupName, queryPackName, top, includeBody, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new LogAnalyticsQueryPackQueryImpl(inner1, this.manager()));
    }

    public PagedIterable<LogAnalyticsQueryPackQuery> search(
        String resourceGroupName,
        String queryPackName,
        LogAnalyticsQueryPackQuerySearchProperties querySearchProperties) {
        PagedIterable<LogAnalyticsQueryPackQueryInner> inner =
            this.serviceClient().search(resourceGroupName, queryPackName, querySearchProperties);
        return Utils.mapPage(inner, inner1 -> new LogAnalyticsQueryPackQueryImpl(inner1, this.manager()));
    }

    public PagedIterable<LogAnalyticsQueryPackQuery> search(
        String resourceGroupName,
        String queryPackName,
        LogAnalyticsQueryPackQuerySearchProperties querySearchProperties,
        Long top,
        Boolean includeBody,
        String skipToken,
        Context context) {
        PagedIterable<LogAnalyticsQueryPackQueryInner> inner =
            this
                .serviceClient()
                .search(resourceGroupName, queryPackName, querySearchProperties, top, includeBody, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new LogAnalyticsQueryPackQueryImpl(inner1, this.manager()));
    }

    public LogAnalyticsQueryPackQuery get(String resourceGroupName, String queryPackName, String id) {
        LogAnalyticsQueryPackQueryInner inner = this.serviceClient().get(resourceGroupName, queryPackName, id);
        if (inner != null) {
            return new LogAnalyticsQueryPackQueryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LogAnalyticsQueryPackQuery> getWithResponse(
        String resourceGroupName, String queryPackName, String id, Context context) {
        Response<LogAnalyticsQueryPackQueryInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, queryPackName, id, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogAnalyticsQueryPackQueryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String queryPackName, String id) {
        this.serviceClient().delete(resourceGroupName, queryPackName, id);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String queryPackName, String id, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, queryPackName, id, context);
    }

    public LogAnalyticsQueryPackQuery getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String queryPackName = Utils.getValueFromIdByName(id, "queryPacks");
        if (queryPackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queryPacks'.", id)));
        }
        String varId = Utils.getValueFromIdByName(id, "queries");
        if (varId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queries'.", id)));
        }
        return this.getWithResponse(resourceGroupName, queryPackName, varId, Context.NONE).getValue();
    }

    public Response<LogAnalyticsQueryPackQuery> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String queryPackName = Utils.getValueFromIdByName(id, "queryPacks");
        if (queryPackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queryPacks'.", id)));
        }
        String varId = Utils.getValueFromIdByName(id, "queries");
        if (varId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queries'.", id)));
        }
        return this.getWithResponse(resourceGroupName, queryPackName, varId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String queryPackName = Utils.getValueFromIdByName(id, "queryPacks");
        if (queryPackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queryPacks'.", id)));
        }
        String varId = Utils.getValueFromIdByName(id, "queries");
        if (varId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queries'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, queryPackName, varId, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String queryPackName = Utils.getValueFromIdByName(id, "queryPacks");
        if (queryPackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queryPacks'.", id)));
        }
        String varId = Utils.getValueFromIdByName(id, "queries");
        if (varId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'queries'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, queryPackName, varId, context);
    }

    private QueriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public LogAnalyticsQueryPackQueryImpl define(String name) {
        return new LogAnalyticsQueryPackQueryImpl(name, this.manager());
    }
}