// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkTapsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTap;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTaps;

public final class VirtualNetworkTapsImpl implements VirtualNetworkTaps {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkTapsImpl.class);

    private final VirtualNetworkTapsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualNetworkTapsImpl(VirtualNetworkTapsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String tapName) {
        this.serviceClient().delete(resourceGroupName, tapName);
    }

    public void delete(String resourceGroupName, String tapName, Context context) {
        this.serviceClient().delete(resourceGroupName, tapName, context);
    }

    public Response<VirtualNetworkTap> getByResourceGroupWithResponse(String resourceGroupName, String tapName,
        Context context) {
        Response<VirtualNetworkTapInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, tapName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualNetworkTapImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualNetworkTap getByResourceGroup(String resourceGroupName, String tapName) {
        VirtualNetworkTapInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, tapName);
        if (inner != null) {
            return new VirtualNetworkTapImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkTap> list() {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> list(Context context) {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkTapInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkTap> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkTapInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()));
    }

    public VirtualNetworkTap getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String tapName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkTaps");
        if (tapName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkTaps'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, tapName, Context.NONE).getValue();
    }

    public Response<VirtualNetworkTap> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String tapName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkTaps");
        if (tapName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkTaps'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, tapName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String tapName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkTaps");
        if (tapName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkTaps'.", id)));
        }
        this.delete(resourceGroupName, tapName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String tapName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkTaps");
        if (tapName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkTaps'.", id)));
        }
        this.delete(resourceGroupName, tapName, context);
    }

    private VirtualNetworkTapsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkTapImpl define(String name) {
        return new VirtualNetworkTapImpl(name, this.manager());
    }
}
