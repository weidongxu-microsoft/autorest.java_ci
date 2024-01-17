// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnServerConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationInner;
import com.azure.resourcemanager.network.generated.models.VpnServerConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigurations;

public final class VpnServerConfigurationsImpl implements VpnServerConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(VpnServerConfigurationsImpl.class);

    private final VpnServerConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnServerConfigurationsImpl(VpnServerConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VpnServerConfiguration> getByResourceGroupWithResponse(String resourceGroupName,
        String vpnServerConfigurationName, Context context) {
        Response<VpnServerConfigurationInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, vpnServerConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VpnServerConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnServerConfiguration getByResourceGroup(String resourceGroupName, String vpnServerConfigurationName) {
        VpnServerConfigurationInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, vpnServerConfigurationName);
        if (inner != null) {
            return new VpnServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String vpnServerConfigurationName) {
        this.serviceClient().delete(resourceGroupName, vpnServerConfigurationName);
    }

    public void delete(String resourceGroupName, String vpnServerConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, vpnServerConfigurationName, context);
    }

    public PagedIterable<VpnServerConfiguration> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VpnServerConfigurationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnServerConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnServerConfiguration> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VpnServerConfigurationInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnServerConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnServerConfiguration> list() {
        PagedIterable<VpnServerConfigurationInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnServerConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnServerConfiguration> list(Context context) {
        PagedIterable<VpnServerConfigurationInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnServerConfigurationImpl(inner1, this.manager()));
    }

    public VpnServerConfiguration getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnServerConfigurationName = ResourceManagerUtils.getValueFromIdByName(id, "vpnServerConfigurations");
        if (vpnServerConfigurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'vpnServerConfigurations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vpnServerConfigurationName, Context.NONE)
            .getValue();
    }

    public Response<VpnServerConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnServerConfigurationName = ResourceManagerUtils.getValueFromIdByName(id, "vpnServerConfigurations");
        if (vpnServerConfigurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'vpnServerConfigurations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vpnServerConfigurationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnServerConfigurationName = ResourceManagerUtils.getValueFromIdByName(id, "vpnServerConfigurations");
        if (vpnServerConfigurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'vpnServerConfigurations'.", id)));
        }
        this.delete(resourceGroupName, vpnServerConfigurationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vpnServerConfigurationName = ResourceManagerUtils.getValueFromIdByName(id, "vpnServerConfigurations");
        if (vpnServerConfigurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'vpnServerConfigurations'.", id)));
        }
        this.delete(resourceGroupName, vpnServerConfigurationName, context);
    }

    private VpnServerConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VpnServerConfigurationImpl define(String name) {
        return new VpnServerConfigurationImpl(name, this.manager());
    }
}
