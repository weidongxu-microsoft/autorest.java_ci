// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmPrivateEndpointConnectionInner;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateEndpointConnection;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateEndpointConnections;

public final class MhsmPrivateEndpointConnectionsImpl implements MhsmPrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(MhsmPrivateEndpointConnectionsImpl.class);

    private final MhsmPrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

    public MhsmPrivateEndpointConnectionsImpl(MhsmPrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MhsmPrivateEndpointConnection> listByResource(String resourceGroupName, String name) {
        PagedIterable<MhsmPrivateEndpointConnectionInner> inner
            = this.serviceClient().listByResource(resourceGroupName, name);
        return Utils.mapPage(inner, inner1 -> new MhsmPrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<MhsmPrivateEndpointConnection> listByResource(String resourceGroupName, String name,
        Context context) {
        PagedIterable<MhsmPrivateEndpointConnectionInner> inner
            = this.serviceClient().listByResource(resourceGroupName, name, context);
        return Utils.mapPage(inner, inner1 -> new MhsmPrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public Response<MhsmPrivateEndpointConnection> getWithResponse(String resourceGroupName, String name,
        String privateEndpointConnectionName, Context context) {
        Response<MhsmPrivateEndpointConnectionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, name, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MhsmPrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MhsmPrivateEndpointConnection get(String resourceGroupName, String name,
        String privateEndpointConnectionName) {
        MhsmPrivateEndpointConnectionInner inner
            = this.serviceClient().get(resourceGroupName, name, privateEndpointConnectionName);
        if (inner != null) {
            return new MhsmPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MhsmPrivateEndpointConnection delete(String resourceGroupName, String name,
        String privateEndpointConnectionName) {
        MhsmPrivateEndpointConnectionInner inner
            = this.serviceClient().delete(resourceGroupName, name, privateEndpointConnectionName);
        if (inner != null) {
            return new MhsmPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MhsmPrivateEndpointConnection delete(String resourceGroupName, String name,
        String privateEndpointConnectionName, Context context) {
        MhsmPrivateEndpointConnectionInner inner
            = this.serviceClient().delete(resourceGroupName, name, privateEndpointConnectionName, context);
        if (inner != null) {
            return new MhsmPrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MhsmPrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, name, privateEndpointConnectionName, Context.NONE).getValue();
    }

    public Response<MhsmPrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, name, privateEndpointConnectionName, context);
    }

    public MhsmPrivateEndpointConnection deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.delete(resourceGroupName, name, privateEndpointConnectionName, Context.NONE);
    }

    public MhsmPrivateEndpointConnection deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.", id)));
        }
        return this.delete(resourceGroupName, name, privateEndpointConnectionName, context);
    }

    private MhsmPrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }

    public MhsmPrivateEndpointConnectionImpl define(String name) {
        return new MhsmPrivateEndpointConnectionImpl(name, this.manager());
    }
}
