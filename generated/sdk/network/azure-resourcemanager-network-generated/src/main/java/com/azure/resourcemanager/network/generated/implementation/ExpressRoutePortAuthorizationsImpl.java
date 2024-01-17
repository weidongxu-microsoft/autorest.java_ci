// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRoutePortAuthorizationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortAuthorizationInner;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortAuthorization;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortAuthorizations;

public final class ExpressRoutePortAuthorizationsImpl implements ExpressRoutePortAuthorizations {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRoutePortAuthorizationsImpl.class);

    private final ExpressRoutePortAuthorizationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRoutePortAuthorizationsImpl(ExpressRoutePortAuthorizationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String expressRoutePortName, String authorizationName) {
        this.serviceClient().delete(resourceGroupName, expressRoutePortName, authorizationName);
    }

    public void delete(String resourceGroupName, String expressRoutePortName, String authorizationName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, expressRoutePortName, authorizationName, context);
    }

    public Response<ExpressRoutePortAuthorization> getWithResponse(String resourceGroupName,
        String expressRoutePortName, String authorizationName, Context context) {
        Response<ExpressRoutePortAuthorizationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, expressRoutePortName, authorizationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRoutePortAuthorizationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRoutePortAuthorization get(String resourceGroupName, String expressRoutePortName,
        String authorizationName) {
        ExpressRoutePortAuthorizationInner inner
            = this.serviceClient().get(resourceGroupName, expressRoutePortName, authorizationName);
        if (inner != null) {
            return new ExpressRoutePortAuthorizationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRoutePortAuthorization> list(String resourceGroupName, String expressRoutePortName) {
        PagedIterable<ExpressRoutePortAuthorizationInner> inner
            = this.serviceClient().list(resourceGroupName, expressRoutePortName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRoutePortAuthorizationImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRoutePortAuthorization> list(String resourceGroupName, String expressRoutePortName,
        Context context) {
        PagedIterable<ExpressRoutePortAuthorizationInner> inner
            = this.serviceClient().list(resourceGroupName, expressRoutePortName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRoutePortAuthorizationImpl(inner1, this.manager()));
    }

    public ExpressRoutePortAuthorization getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = ResourceManagerUtils.getValueFromIdByName(id, "expressRoutePorts");
        if (expressRoutePortName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRoutePorts'.", id)));
        }
        String authorizationName = ResourceManagerUtils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, expressRoutePortName, authorizationName, Context.NONE)
            .getValue();
    }

    public Response<ExpressRoutePortAuthorization> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = ResourceManagerUtils.getValueFromIdByName(id, "expressRoutePorts");
        if (expressRoutePortName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRoutePorts'.", id)));
        }
        String authorizationName = ResourceManagerUtils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, expressRoutePortName, authorizationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = ResourceManagerUtils.getValueFromIdByName(id, "expressRoutePorts");
        if (expressRoutePortName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRoutePorts'.", id)));
        }
        String authorizationName = ResourceManagerUtils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        this.delete(resourceGroupName, expressRoutePortName, authorizationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRoutePortName = ResourceManagerUtils.getValueFromIdByName(id, "expressRoutePorts");
        if (expressRoutePortName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRoutePorts'.", id)));
        }
        String authorizationName = ResourceManagerUtils.getValueFromIdByName(id, "authorizations");
        if (authorizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'authorizations'.", id)));
        }
        this.delete(resourceGroupName, expressRoutePortName, authorizationName, context);
    }

    private ExpressRoutePortAuthorizationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRoutePortAuthorizationImpl define(String name) {
        return new ExpressRoutePortAuthorizationImpl(name, this.manager());
    }
}
