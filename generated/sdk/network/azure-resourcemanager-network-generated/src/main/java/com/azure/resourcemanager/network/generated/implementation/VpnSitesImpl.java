// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnSitesClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteInner;
import com.azure.resourcemanager.network.generated.models.VpnSite;
import com.azure.resourcemanager.network.generated.models.VpnSites;

public final class VpnSitesImpl implements VpnSites {
    private static final ClientLogger LOGGER = new ClientLogger(VpnSitesImpl.class);

    private final VpnSitesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnSitesImpl(VpnSitesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VpnSite> getByResourceGroupWithResponse(String resourceGroupName, String vpnSiteName,
        Context context) {
        Response<VpnSiteInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vpnSiteName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VpnSiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnSite getByResourceGroup(String resourceGroupName, String vpnSiteName) {
        VpnSiteInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vpnSiteName);
        if (inner != null) {
            return new VpnSiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String vpnSiteName) {
        this.serviceClient().delete(resourceGroupName, vpnSiteName);
    }

    public void delete(String resourceGroupName, String vpnSiteName, Context context) {
        this.serviceClient().delete(resourceGroupName, vpnSiteName, context);
    }

    public PagedIterable<VpnSite> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VpnSiteInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnSite> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VpnSiteInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnSite> list() {
        PagedIterable<VpnSiteInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnSite> list(Context context) {
        PagedIterable<VpnSiteInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteImpl(inner1, this.manager()));
    }

    public VpnSite getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnSiteName = ResourceManagerUtils.getValueFromIdByName(id, "vpnSites");
        if (vpnSiteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnSites'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vpnSiteName, Context.NONE).getValue();
    }

    public Response<VpnSite> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnSiteName = ResourceManagerUtils.getValueFromIdByName(id, "vpnSites");
        if (vpnSiteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnSites'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vpnSiteName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnSiteName = ResourceManagerUtils.getValueFromIdByName(id, "vpnSites");
        if (vpnSiteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnSites'.", id)));
        }
        this.delete(resourceGroupName, vpnSiteName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnSiteName = ResourceManagerUtils.getValueFromIdByName(id, "vpnSites");
        if (vpnSiteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnSites'.", id)));
        }
        this.delete(resourceGroupName, vpnSiteName, context);
    }

    private VpnSitesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VpnSiteImpl define(String name) {
        return new VpnSiteImpl(name, this.manager());
    }
}
