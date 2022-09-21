// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkManagersClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerInner;
import com.azure.resourcemanager.network.generated.models.NetworkManager;
import com.azure.resourcemanager.network.generated.models.NetworkManagers;

public final class NetworkManagersImpl implements NetworkManagers {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagersImpl.class);

    private final NetworkManagersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkManagersImpl(
        NetworkManagersClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkManager> getByResourceGroupWithResponse(
        String resourceGroupName, String networkManagerName, Context context) {
        Response<NetworkManagerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkManagerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkManagerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkManager getByResourceGroup(String resourceGroupName, String networkManagerName) {
        NetworkManagerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkManagerName);
        if (inner != null) {
            return new NetworkManagerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, Boolean force) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, force);
    }

    public void delete(String resourceGroupName, String networkManagerName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName);
    }

    public void delete(String resourceGroupName, String networkManagerName, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, force, context);
    }

    public PagedIterable<NetworkManager> list() {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> list(Integer top, String skipToken, Context context) {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().list(top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkManagerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManager> listByResourceGroup(
        String resourceGroupName, Integer top, String skipToken, Context context) {
        PagedIterable<NetworkManagerInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerImpl(inner1, this.manager()));
    }

    public NetworkManager getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkManagerName, Context.NONE).getValue();
    }

    public Response<NetworkManager> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkManagerName, context);
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
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, networkManagerName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        this.delete(resourceGroupName, networkManagerName, force, context);
    }

    private NetworkManagersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkManagerImpl define(String name) {
        return new NetworkManagerImpl(name, this.manager());
    }
}
