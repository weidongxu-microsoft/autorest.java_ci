// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkPeeringsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeering;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeerings;

public final class VirtualNetworkPeeringsImpl implements VirtualNetworkPeerings {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkPeeringsImpl.class);

    private final VirtualNetworkPeeringsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualNetworkPeeringsImpl(VirtualNetworkPeeringsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
    }

    public void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    public Response<VirtualNetworkPeering> getWithResponse(String resourceGroupName, String virtualNetworkName,
        String virtualNetworkPeeringName, Context context) {
        Response<VirtualNetworkPeeringInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            virtualNetworkName, virtualNetworkPeeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualNetworkPeeringImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualNetworkPeering get(String resourceGroupName, String virtualNetworkName,
        String virtualNetworkPeeringName) {
        VirtualNetworkPeeringInner inner
            = this.serviceClient().get(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName);
        if (inner != null) {
            return new VirtualNetworkPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName) {
        PagedIterable<VirtualNetworkPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, virtualNetworkName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkPeeringImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName,
        Context context) {
        PagedIterable<VirtualNetworkPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, virtualNetworkName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkPeeringImpl(inner1, this.manager()));
    }

    public VirtualNetworkPeering getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        String virtualNetworkPeeringName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkPeerings");
        if (virtualNetworkPeeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkPeerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, Context.NONE)
            .getValue();
    }

    public Response<VirtualNetworkPeering> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        String virtualNetworkPeeringName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkPeerings");
        if (virtualNetworkPeeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkPeerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        String virtualNetworkPeeringName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkPeerings");
        if (virtualNetworkPeeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkPeerings'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworks");
        if (virtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworks'.", id)));
        }
        String virtualNetworkPeeringName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkPeerings");
        if (virtualNetworkPeeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkPeerings'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkName, virtualNetworkPeeringName, context);
    }

    private VirtualNetworkPeeringsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkPeeringImpl define(String name) {
        return new VirtualNetworkPeeringImpl(name, this.manager());
    }
}
