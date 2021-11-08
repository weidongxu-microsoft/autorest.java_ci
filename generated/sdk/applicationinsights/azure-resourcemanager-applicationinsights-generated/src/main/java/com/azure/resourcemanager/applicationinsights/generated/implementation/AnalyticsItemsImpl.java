// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.generated.fluent.AnalyticsItemsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentAnalyticsItemInner;
import com.azure.resourcemanager.applicationinsights.generated.models.AnalyticsItems;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentAnalyticsItem;
import com.azure.resourcemanager.applicationinsights.generated.models.ItemScope;
import com.azure.resourcemanager.applicationinsights.generated.models.ItemScopePath;
import com.azure.resourcemanager.applicationinsights.generated.models.ItemTypeParameter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class AnalyticsItemsImpl implements AnalyticsItems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AnalyticsItemsImpl.class);

    private final AnalyticsItemsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    public AnalyticsItemsImpl(
        AnalyticsItemsClient innerClient,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationInsightsComponentAnalyticsItem> list(
        String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        List<ApplicationInsightsComponentAnalyticsItemInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, scopePath);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationInsightsComponentAnalyticsItemImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<ApplicationInsightsComponentAnalyticsItem>> listWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ItemScope scope,
        ItemTypeParameter type,
        Boolean includeContent,
        Context context) {
        Response<List<ApplicationInsightsComponentAnalyticsItemInner>> inner =
            this
                .serviceClient()
                .listWithResponse(resourceGroupName, resourceName, scopePath, scope, type, includeContent, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new ApplicationInsightsComponentAnalyticsItemImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentAnalyticsItem get(
        String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        ApplicationInsightsComponentAnalyticsItemInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, scopePath);
        if (inner != null) {
            return new ApplicationInsightsComponentAnalyticsItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentAnalyticsItem> getWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        String id,
        String name,
        Context context) {
        Response<ApplicationInsightsComponentAnalyticsItemInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, scopePath, id, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentAnalyticsItemImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationInsightsComponentAnalyticsItem put(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ApplicationInsightsComponentAnalyticsItemInner itemProperties) {
        ApplicationInsightsComponentAnalyticsItemInner inner =
            this.serviceClient().put(resourceGroupName, resourceName, scopePath, itemProperties);
        if (inner != null) {
            return new ApplicationInsightsComponentAnalyticsItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationInsightsComponentAnalyticsItem> putWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        ApplicationInsightsComponentAnalyticsItemInner itemProperties,
        Boolean overrideItem,
        Context context) {
        Response<ApplicationInsightsComponentAnalyticsItemInner> inner =
            this
                .serviceClient()
                .putWithResponse(resourceGroupName, resourceName, scopePath, itemProperties, overrideItem, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationInsightsComponentAnalyticsItemImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        this.serviceClient().delete(resourceGroupName, resourceName, scopePath);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String resourceName,
        ItemScopePath scopePath,
        String id,
        String name,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, scopePath, id, name, context);
    }

    private AnalyticsItemsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
