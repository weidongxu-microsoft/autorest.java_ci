// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteGatewayListInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGateway;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGatewayList;
import com.azure.resourcemanager.network.generated.models.ExpressRouteGateways;

public final class ExpressRouteGatewaysImpl implements ExpressRouteGateways {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteGatewaysImpl.class);

    private final ExpressRouteGatewaysClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteGatewaysImpl(ExpressRouteGatewaysClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ExpressRouteGatewayList> listBySubscriptionWithResponse(Context context) {
        Response<ExpressRouteGatewayListInner> inner = this.serviceClient().listBySubscriptionWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteGatewayListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteGatewayList listBySubscription() {
        ExpressRouteGatewayListInner inner = this.serviceClient().listBySubscription();
        if (inner != null) {
            return new ExpressRouteGatewayListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteGatewayList> listByResourceGroupWithResponse(String resourceGroupName,
        Context context) {
        Response<ExpressRouteGatewayListInner> inner
            = this.serviceClient().listByResourceGroupWithResponse(resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteGatewayListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteGatewayList listByResourceGroup(String resourceGroupName) {
        ExpressRouteGatewayListInner inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        if (inner != null) {
            return new ExpressRouteGatewayListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteGateway> getByResourceGroupWithResponse(String resourceGroupName,
        String expressRouteGatewayName, Context context) {
        Response<ExpressRouteGatewayInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, expressRouteGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteGateway getByResourceGroup(String resourceGroupName, String expressRouteGatewayName) {
        ExpressRouteGatewayInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, expressRouteGatewayName);
        if (inner != null) {
            return new ExpressRouteGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String expressRouteGatewayName) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName);
    }

    public void delete(String resourceGroupName, String expressRouteGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName, context);
    }

    public ExpressRouteGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRouteGatewayName = Utils.getValueFromIdByName(id, "expressRouteGateways");
        if (expressRouteGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, expressRouteGatewayName, Context.NONE).getValue();
    }

    public Response<ExpressRouteGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRouteGatewayName = Utils.getValueFromIdByName(id, "expressRouteGateways");
        if (expressRouteGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, expressRouteGatewayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRouteGatewayName = Utils.getValueFromIdByName(id, "expressRouteGateways");
        if (expressRouteGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteGateways'.", id)));
        }
        this.delete(resourceGroupName, expressRouteGatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String expressRouteGatewayName = Utils.getValueFromIdByName(id, "expressRouteGateways");
        if (expressRouteGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteGateways'.", id)));
        }
        this.delete(resourceGroupName, expressRouteGatewayName, context);
    }

    private ExpressRouteGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteGatewayImpl define(String name) {
        return new ExpressRouteGatewayImpl(name, this.manager());
    }
}
