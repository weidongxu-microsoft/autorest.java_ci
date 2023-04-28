// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualHubsClient;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteMapRouteListInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubEffectiveRouteListInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.generated.models.EffectiveRouteMapRouteList;
import com.azure.resourcemanager.network.generated.models.EffectiveRoutesParameters;
import com.azure.resourcemanager.network.generated.models.GetInboundRoutesParameters;
import com.azure.resourcemanager.network.generated.models.GetOutboundRoutesParameters;
import com.azure.resourcemanager.network.generated.models.VirtualHub;
import com.azure.resourcemanager.network.generated.models.VirtualHubEffectiveRouteList;
import com.azure.resourcemanager.network.generated.models.VirtualHubs;

public final class VirtualHubsImpl implements VirtualHubs {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualHubsImpl.class);

    private final VirtualHubsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualHubsImpl(
        VirtualHubsClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VirtualHub> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualHubName, Context context) {
        Response<VirtualHubInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualHubImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualHub getByResourceGroup(String resourceGroupName, String virtualHubName) {
        VirtualHubInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualHubName);
        if (inner != null) {
            return new VirtualHubImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualHubName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName);
    }

    public void delete(String resourceGroupName, String virtualHubName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, context);
    }

    public PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> list() {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> list(Context context) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public VirtualHubEffectiveRouteList getEffectiveVirtualHubRoutes(String resourceGroupName, String virtualHubName) {
        VirtualHubEffectiveRouteListInner inner =
            this.serviceClient().getEffectiveVirtualHubRoutes(resourceGroupName, virtualHubName);
        if (inner != null) {
            return new VirtualHubEffectiveRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualHubEffectiveRouteList getEffectiveVirtualHubRoutes(
        String resourceGroupName,
        String virtualHubName,
        EffectiveRoutesParameters effectiveRoutesParameters,
        Context context) {
        VirtualHubEffectiveRouteListInner inner =
            this
                .serviceClient()
                .getEffectiveVirtualHubRoutes(resourceGroupName, virtualHubName, effectiveRoutesParameters, context);
        if (inner != null) {
            return new VirtualHubEffectiveRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveRouteMapRouteList getInboundRoutes(
        String resourceGroupName, String virtualHubName, GetInboundRoutesParameters getInboundRoutesParameters) {
        EffectiveRouteMapRouteListInner inner =
            this.serviceClient().getInboundRoutes(resourceGroupName, virtualHubName, getInboundRoutesParameters);
        if (inner != null) {
            return new EffectiveRouteMapRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveRouteMapRouteList getInboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetInboundRoutesParameters getInboundRoutesParameters,
        Context context) {
        EffectiveRouteMapRouteListInner inner =
            this
                .serviceClient()
                .getInboundRoutes(resourceGroupName, virtualHubName, getInboundRoutesParameters, context);
        if (inner != null) {
            return new EffectiveRouteMapRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveRouteMapRouteList getOutboundRoutes(
        String resourceGroupName, String virtualHubName, GetOutboundRoutesParameters getOutboundRoutesParameters) {
        EffectiveRouteMapRouteListInner inner =
            this.serviceClient().getOutboundRoutes(resourceGroupName, virtualHubName, getOutboundRoutesParameters);
        if (inner != null) {
            return new EffectiveRouteMapRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveRouteMapRouteList getOutboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetOutboundRoutesParameters getOutboundRoutesParameters,
        Context context) {
        EffectiveRouteMapRouteListInner inner =
            this
                .serviceClient()
                .getOutboundRoutes(resourceGroupName, virtualHubName, getOutboundRoutesParameters, context);
        if (inner != null) {
            return new EffectiveRouteMapRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualHub getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualHubName, Context.NONE).getValue();
    }

    public Response<VirtualHub> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context);
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
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, context);
    }

    private VirtualHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualHubImpl define(String name) {
        return new VirtualHubImpl(name, this.manager());
    }
}
