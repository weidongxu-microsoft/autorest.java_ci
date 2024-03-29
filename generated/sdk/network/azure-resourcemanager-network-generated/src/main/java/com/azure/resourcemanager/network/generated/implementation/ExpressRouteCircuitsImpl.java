// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCircuitsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsArpTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitStatsInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuit;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuits;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsArpTableListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsRoutesTableListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitsRoutesTableSummaryListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitStats;

public final class ExpressRouteCircuitsImpl implements ExpressRouteCircuits {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteCircuitsImpl.class);

    private final ExpressRouteCircuitsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteCircuitsImpl(ExpressRouteCircuitsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String circuitName) {
        this.serviceClient().delete(resourceGroupName, circuitName);
    }

    public void delete(String resourceGroupName, String circuitName, Context context) {
        this.serviceClient().delete(resourceGroupName, circuitName, context);
    }

    public Response<ExpressRouteCircuit> getByResourceGroupWithResponse(String resourceGroupName, String circuitName,
        Context context) {
        Response<ExpressRouteCircuitInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, circuitName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteCircuitImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuit getByResourceGroup(String resourceGroupName, String circuitName) {
        ExpressRouteCircuitInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, circuitName);
        if (inner != null) {
            return new ExpressRouteCircuitImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath) {
        ExpressRouteCircuitsArpTableListResultInner inner
            = this.serviceClient().listArpTable(resourceGroupName, circuitName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsArpTableListResultInner inner
            = this.serviceClient().listArpTable(resourceGroupName, circuitName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath) {
        ExpressRouteCircuitsRoutesTableListResultInner inner
            = this.serviceClient().listRoutesTable(resourceGroupName, circuitName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsRoutesTableListResultInner inner
            = this.serviceClient().listRoutesTable(resourceGroupName, circuitName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableSummaryListResult listRoutesTableSummary(String resourceGroupName,
        String circuitName, String peeringName, String devicePath) {
        ExpressRouteCircuitsRoutesTableSummaryListResultInner inner
            = this.serviceClient().listRoutesTableSummary(resourceGroupName, circuitName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableSummaryListResult listRoutesTableSummary(String resourceGroupName,
        String circuitName, String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsRoutesTableSummaryListResultInner inner = this.serviceClient()
            .listRoutesTableSummary(resourceGroupName, circuitName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCircuitStats> getStatsWithResponse(String resourceGroupName, String circuitName,
        Context context) {
        Response<ExpressRouteCircuitStatsInner> inner
            = this.serviceClient().getStatsWithResponse(resourceGroupName, circuitName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteCircuitStatsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitStats getStats(String resourceGroupName, String circuitName) {
        ExpressRouteCircuitStatsInner inner = this.serviceClient().getStats(resourceGroupName, circuitName);
        if (inner != null) {
            return new ExpressRouteCircuitStatsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCircuitStats> getPeeringStatsWithResponse(String resourceGroupName, String circuitName,
        String peeringName, Context context) {
        Response<ExpressRouteCircuitStatsInner> inner
            = this.serviceClient().getPeeringStatsWithResponse(resourceGroupName, circuitName, peeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteCircuitStatsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitStats getPeeringStats(String resourceGroupName, String circuitName, String peeringName) {
        ExpressRouteCircuitStatsInner inner
            = this.serviceClient().getPeeringStats(resourceGroupName, circuitName, peeringName);
        if (inner != null) {
            return new ExpressRouteCircuitStatsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRouteCircuit> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ExpressRouteCircuitInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRouteCircuitImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuit> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ExpressRouteCircuitInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRouteCircuitImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuit> list() {
        PagedIterable<ExpressRouteCircuitInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRouteCircuitImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuit> list(Context context) {
        PagedIterable<ExpressRouteCircuitInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRouteCircuitImpl(inner1, this.manager()));
    }

    public ExpressRouteCircuit getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = ResourceManagerUtils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, circuitName, Context.NONE).getValue();
    }

    public Response<ExpressRouteCircuit> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = ResourceManagerUtils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, circuitName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = ResourceManagerUtils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        this.delete(resourceGroupName, circuitName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = ResourceManagerUtils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        this.delete(resourceGroupName, circuitName, context);
    }

    private ExpressRouteCircuitsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCircuitImpl define(String name) {
        return new ExpressRouteCircuitImpl(name, this.manager());
    }
}
