// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualHubIpConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.HubIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.HubIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualHubIpConfigurations;

public final class VirtualHubIpConfigurationsImpl implements VirtualHubIpConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualHubIpConfigurationsImpl.class);

    private final VirtualHubIpConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualHubIpConfigurationsImpl(VirtualHubIpConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<HubIpConfiguration> getWithResponse(String resourceGroupName, String virtualHubName,
        String ipConfigName, Context context) {
        Response<HubIpConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, virtualHubName, ipConfigName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new HubIpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public HubIpConfiguration get(String resourceGroupName, String virtualHubName, String ipConfigName) {
        HubIpConfigurationInner inner = this.serviceClient().get(resourceGroupName, virtualHubName, ipConfigName);
        if (inner != null) {
            return new HubIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualHubName, String ipConfigName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, ipConfigName);
    }

    public void delete(String resourceGroupName, String virtualHubName, String ipConfigName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, ipConfigName, context);
    }

    public PagedIterable<HubIpConfiguration> list(String resourceGroupName, String virtualHubName) {
        PagedIterable<HubIpConfigurationInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new HubIpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<HubIpConfiguration> list(String resourceGroupName, String virtualHubName, Context context) {
        PagedIterable<HubIpConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, virtualHubName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new HubIpConfigurationImpl(inner1, this.manager()));
    }

    public HubIpConfiguration getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = ResourceManagerUtils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String ipConfigName = ResourceManagerUtils.getValueFromIdByName(id, "ipConfigurations");
        if (ipConfigName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ipConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, ipConfigName, Context.NONE).getValue();
    }

    public Response<HubIpConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = ResourceManagerUtils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String ipConfigName = ResourceManagerUtils.getValueFromIdByName(id, "ipConfigurations");
        if (ipConfigName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ipConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, ipConfigName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = ResourceManagerUtils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String ipConfigName = ResourceManagerUtils.getValueFromIdByName(id, "ipConfigurations");
        if (ipConfigName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ipConfigurations'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, ipConfigName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = ResourceManagerUtils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String ipConfigName = ResourceManagerUtils.getValueFromIdByName(id, "ipConfigurations");
        if (ipConfigName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ipConfigurations'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, ipConfigName, context);
    }

    private VirtualHubIpConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public HubIpConfigurationImpl define(String name) {
        return new HubIpConfigurationImpl(name, this.manager());
    }
}
