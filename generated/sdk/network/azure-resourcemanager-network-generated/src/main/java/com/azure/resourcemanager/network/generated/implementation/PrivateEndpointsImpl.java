// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.PrivateEndpointsClient;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoints;

public final class PrivateEndpointsImpl implements PrivateEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointsImpl.class);

    private final PrivateEndpointsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public PrivateEndpointsImpl(PrivateEndpointsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String privateEndpointName) {
        this.serviceClient().delete(resourceGroupName, privateEndpointName);
    }

    public void delete(String resourceGroupName, String privateEndpointName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateEndpointName, context);
    }

    public Response<PrivateEndpoint> getByResourceGroupWithResponse(String resourceGroupName,
        String privateEndpointName, String expand, Context context) {
        Response<PrivateEndpointInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, privateEndpointName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpoint getByResourceGroup(String resourceGroupName, String privateEndpointName) {
        PrivateEndpointInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, privateEndpointName);
        if (inner != null) {
            return new PrivateEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateEndpoint> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PrivateEndpointInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpoint> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PrivateEndpointInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpoint> list() {
        PagedIterable<PrivateEndpointInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpoint> list(Context context) {
        PagedIterable<PrivateEndpointInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointImpl(inner1, this.manager()));
    }

    public PrivateEndpoint getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpoints");
        if (privateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateEndpoints'.", id)));
        }
        String localExpand = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, privateEndpointName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpoint> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpoints");
        if (privateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateEndpoints'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, privateEndpointName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpoints");
        if (privateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateEndpoints'.", id)));
        }
        this.delete(resourceGroupName, privateEndpointName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpoints");
        if (privateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateEndpoints'.", id)));
        }
        this.delete(resourceGroupName, privateEndpointName, context);
    }

    private PrivateEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointImpl define(String name) {
        return new PrivateEndpointImpl(name, this.manager());
    }
}
