// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkProfilesClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.network.generated.models.NetworkProfile;
import com.azure.resourcemanager.network.generated.models.NetworkProfiles;

public final class NetworkProfilesImpl implements NetworkProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkProfilesImpl.class);

    private final NetworkProfilesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkProfilesImpl(NetworkProfilesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkProfileName) {
        this.serviceClient().delete(resourceGroupName, networkProfileName);
    }

    public void delete(String resourceGroupName, String networkProfileName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkProfileName, context);
    }

    public Response<NetworkProfile> getByResourceGroupWithResponse(String resourceGroupName, String networkProfileName,
        String expand, Context context) {
        Response<NetworkProfileInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, networkProfileName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkProfile getByResourceGroup(String resourceGroupName, String networkProfileName) {
        NetworkProfileInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkProfileName);
        if (inner != null) {
            return new NetworkProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkProfile> list() {
        PagedIterable<NetworkProfileInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkProfile> list(Context context) {
        PagedIterable<NetworkProfileInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkProfile> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkProfile> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkProfileImpl(inner1, this.manager()));
    }

    public NetworkProfile getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkProfileName = ResourceManagerUtils.getValueFromIdByName(id, "networkProfiles");
        if (networkProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkProfiles'.", id)));
        }
        String localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, networkProfileName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<NetworkProfile> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkProfileName = ResourceManagerUtils.getValueFromIdByName(id, "networkProfiles");
        if (networkProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkProfiles'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkProfileName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkProfileName = ResourceManagerUtils.getValueFromIdByName(id, "networkProfiles");
        if (networkProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkProfiles'.", id)));
        }
        this.delete(resourceGroupName, networkProfileName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkProfileName = ResourceManagerUtils.getValueFromIdByName(id, "networkProfiles");
        if (networkProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkProfiles'.", id)));
        }
        this.delete(resourceGroupName, networkProfileName, context);
    }

    private NetworkProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkProfileImpl define(String name) {
        return new NetworkProfileImpl(name, this.manager());
    }
}
