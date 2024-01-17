// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ConnectivityConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectivityConfigurationInner;
import com.azure.resourcemanager.network.generated.models.ConnectivityConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectivityConfigurations;

public final class ConnectivityConfigurationsImpl implements ConnectivityConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(ConnectivityConfigurationsImpl.class);

    private final ConnectivityConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ConnectivityConfigurationsImpl(ConnectivityConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ConnectivityConfiguration> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, Context context) {
        Response<ConnectivityConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, networkManagerName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectivityConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectivityConfiguration get(String resourceGroupName, String networkManagerName,
        String configurationName) {
        ConnectivityConfigurationInner inner
            = this.serviceClient().get(resourceGroupName, networkManagerName, configurationName);
        if (inner != null) {
            return new ConnectivityConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName);
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName, Boolean force,
        Context context) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, force, context);
    }

    public PagedIterable<ConnectivityConfiguration> list(String resourceGroupName, String networkManagerName) {
        PagedIterable<ConnectivityConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectivityConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectivityConfiguration> list(String resourceGroupName, String networkManagerName,
        Integer top, String skipToken, Context context) {
        PagedIterable<ConnectivityConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName, top, skipToken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectivityConfigurationImpl(inner1, this.manager()));
    }

    public ConnectivityConfiguration getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = ResourceManagerUtils.getValueFromIdByName(id, "connectivityConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'connectivityConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, configurationName, Context.NONE).getValue();
    }

    public Response<ConnectivityConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = ResourceManagerUtils.getValueFromIdByName(id, "connectivityConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'connectivityConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, configurationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = ResourceManagerUtils.getValueFromIdByName(id, "connectivityConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'connectivityConfigurations'.", id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, networkManagerName, configurationName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = ResourceManagerUtils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = ResourceManagerUtils.getValueFromIdByName(id, "connectivityConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'connectivityConfigurations'.", id)));
        }
        this.delete(resourceGroupName, networkManagerName, configurationName, force, context);
    }

    private ConnectivityConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ConnectivityConfigurationImpl define(String name) {
        return new ConnectivityConfigurationImpl(name, this.manager());
    }
}
