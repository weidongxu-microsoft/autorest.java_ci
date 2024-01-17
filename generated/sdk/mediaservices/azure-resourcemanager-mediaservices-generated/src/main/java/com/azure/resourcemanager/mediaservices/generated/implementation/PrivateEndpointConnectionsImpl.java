// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.PrivateEndpointConnectionListResultInner;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnectionListResult;
import com.azure.resourcemanager.mediaservices.generated.models.PrivateEndpointConnections;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    public PrivateEndpointConnectionsImpl(PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PrivateEndpointConnectionListResult> listWithResponse(String resourceGroupName, String accountName,
        Context context) {
        Response<PrivateEndpointConnectionListResultInner> inner
            = this.serviceClient().listWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointConnectionListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnectionListResult list(String resourceGroupName, String accountName) {
        PrivateEndpointConnectionListResultInner inner = this.serviceClient().list(resourceGroupName, accountName);
        if (inner != null) {
            return new PrivateEndpointConnectionListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(String resourceGroupName, String accountName,
        String name, Context context) {
        Response<PrivateEndpointConnectionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection get(String resourceGroupName, String accountName, String name) {
        PrivateEndpointConnectionInner inner = this.serviceClient().get(resourceGroupName, accountName, name);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String name,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, name, context);
    }

    public void delete(String resourceGroupName, String accountName, String name) {
        this.serviceClient().delete(resourceGroupName, accountName, name);
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, name, Context.NONE).getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, name, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, name, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
