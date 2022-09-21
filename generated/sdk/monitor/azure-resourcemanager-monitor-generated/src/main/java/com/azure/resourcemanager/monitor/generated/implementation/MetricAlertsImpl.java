// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.MetricAlertsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.models.MetricAlertResource;
import com.azure.resourcemanager.monitor.generated.models.MetricAlerts;

public final class MetricAlertsImpl implements MetricAlerts {
    private static final ClientLogger LOGGER = new ClientLogger(MetricAlertsImpl.class);

    private final MetricAlertsClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public MetricAlertsImpl(
        MetricAlertsClient innerClient, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetricAlertResource> list() {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> list(Context context) {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MetricAlertResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricAlertResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<MetricAlertResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new MetricAlertResourceImpl(inner1, this.manager()));
    }

    public Response<MetricAlertResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        Response<MetricAlertResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetricAlertResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MetricAlertResource getByResourceGroup(String resourceGroupName, String ruleName) {
        MetricAlertResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ruleName);
        if (inner != null) {
            return new MetricAlertResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, ruleName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, ruleName);
    }

    public MetricAlertResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    public Response<MetricAlertResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
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
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE);
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
        String ruleName = Utils.getValueFromIdByName(id, "metricAlerts");
        if (ruleName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'metricAlerts'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, ruleName, context);
    }

    private MetricAlertsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public MetricAlertResourceImpl define(String name) {
        return new MetricAlertResourceImpl(name, this.manager());
    }
}
