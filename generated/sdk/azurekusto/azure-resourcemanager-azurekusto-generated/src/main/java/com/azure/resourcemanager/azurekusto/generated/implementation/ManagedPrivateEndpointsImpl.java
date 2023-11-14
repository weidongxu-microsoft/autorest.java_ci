// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.fluent.ManagedPrivateEndpointsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ManagedPrivateEndpointInner;
import com.azure.resourcemanager.azurekusto.generated.models.CheckNameResult;
import com.azure.resourcemanager.azurekusto.generated.models.ManagedPrivateEndpoint;
import com.azure.resourcemanager.azurekusto.generated.models.ManagedPrivateEndpoints;
import com.azure.resourcemanager.azurekusto.generated.models.ManagedPrivateEndpointsCheckNameRequest;

public final class ManagedPrivateEndpointsImpl implements ManagedPrivateEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedPrivateEndpointsImpl.class);

    private final ManagedPrivateEndpointsClient innerClient;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    public ManagedPrivateEndpointsImpl(ManagedPrivateEndpointsClient innerClient,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(String resourceGroupName, String clusterName,
        ManagedPrivateEndpointsCheckNameRequest resourceName, Context context) {
        Response<CheckNameResultInner> inner = this.serviceClient().checkNameAvailabilityWithResponse(resourceGroupName,
            clusterName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameResult checkNameAvailability(String resourceGroupName, String clusterName,
        ManagedPrivateEndpointsCheckNameRequest resourceName) {
        CheckNameResultInner inner
            = this.serviceClient().checkNameAvailability(resourceGroupName, clusterName, resourceName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ManagedPrivateEndpoint> list(String resourceGroupName, String clusterName) {
        PagedIterable<ManagedPrivateEndpointInner> inner = this.serviceClient().list(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ManagedPrivateEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedPrivateEndpoint> list(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ManagedPrivateEndpointInner> inner
            = this.serviceClient().list(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedPrivateEndpointImpl(inner1, this.manager()));
    }

    public Response<ManagedPrivateEndpoint> getWithResponse(String resourceGroupName, String clusterName,
        String managedPrivateEndpointName, Context context) {
        Response<ManagedPrivateEndpointInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, managedPrivateEndpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedPrivateEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedPrivateEndpoint get(String resourceGroupName, String clusterName, String managedPrivateEndpointName) {
        ManagedPrivateEndpointInner inner
            = this.serviceClient().get(resourceGroupName, clusterName, managedPrivateEndpointName);
        if (inner != null) {
            return new ManagedPrivateEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String managedPrivateEndpointName) {
        this.serviceClient().delete(resourceGroupName, clusterName, managedPrivateEndpointName);
    }

    public void delete(String resourceGroupName, String clusterName, String managedPrivateEndpointName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, managedPrivateEndpointName, context);
    }

    public ManagedPrivateEndpoint getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String managedPrivateEndpointName = Utils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, managedPrivateEndpointName, Context.NONE)
            .getValue();
    }

    public Response<ManagedPrivateEndpoint> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String managedPrivateEndpointName = Utils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, managedPrivateEndpointName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String managedPrivateEndpointName = Utils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        this.delete(resourceGroupName, clusterName, managedPrivateEndpointName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String managedPrivateEndpointName = Utils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        this.delete(resourceGroupName, clusterName, managedPrivateEndpointName, context);
    }

    private ManagedPrivateEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }

    public ManagedPrivateEndpointImpl define(String name) {
        return new ManagedPrivateEndpointImpl(name, this.manager());
    }
}
