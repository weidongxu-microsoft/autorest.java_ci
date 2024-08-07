// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.RouteFiltersClient;
import com.azure.resourcemanager.network.generated.fluent.models.RouteFilterInner;
import com.azure.resourcemanager.network.generated.models.RouteFilter;
import com.azure.resourcemanager.network.generated.models.RouteFilters;

public final class RouteFiltersImpl implements RouteFilters {
    private static final ClientLogger LOGGER = new ClientLogger(RouteFiltersImpl.class);

    private final RouteFiltersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public RouteFiltersImpl(RouteFiltersClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String routeFilterName) {
        this.serviceClient().delete(resourceGroupName, routeFilterName);
    }

    public void delete(String resourceGroupName, String routeFilterName, Context context) {
        this.serviceClient().delete(resourceGroupName, routeFilterName, context);
    }

    public Response<RouteFilter> getByResourceGroupWithResponse(String resourceGroupName, String routeFilterName,
        String expand, Context context) {
        Response<RouteFilterInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, routeFilterName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RouteFilterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RouteFilter getByResourceGroup(String resourceGroupName, String routeFilterName) {
        RouteFilterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, routeFilterName);
        if (inner != null) {
            return new RouteFilterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RouteFilter> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RouteFilterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RouteFilterImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteFilter> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RouteFilterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RouteFilterImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteFilter> list() {
        PagedIterable<RouteFilterInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RouteFilterImpl(inner1, this.manager()));
    }

    public PagedIterable<RouteFilter> list(Context context) {
        PagedIterable<RouteFilterInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RouteFilterImpl(inner1, this.manager()));
    }

    public RouteFilter getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeFilterName = ResourceManagerUtils.getValueFromIdByName(id, "routeFilters");
        if (routeFilterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'routeFilters'.", id)));
        }
        String localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, routeFilterName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<RouteFilter> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeFilterName = ResourceManagerUtils.getValueFromIdByName(id, "routeFilters");
        if (routeFilterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'routeFilters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, routeFilterName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeFilterName = ResourceManagerUtils.getValueFromIdByName(id, "routeFilters");
        if (routeFilterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'routeFilters'.", id)));
        }
        this.delete(resourceGroupName, routeFilterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routeFilterName = ResourceManagerUtils.getValueFromIdByName(id, "routeFilters");
        if (routeFilterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'routeFilters'.", id)));
        }
        this.delete(resourceGroupName, routeFilterName, context);
    }

    private RouteFiltersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public RouteFilterImpl define(String name) {
        return new RouteFilterImpl(name, this.manager());
    }
}
