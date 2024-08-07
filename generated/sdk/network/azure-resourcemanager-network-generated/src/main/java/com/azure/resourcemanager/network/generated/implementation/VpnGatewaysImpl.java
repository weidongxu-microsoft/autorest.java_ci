// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import com.azure.resourcemanager.network.generated.models.VpnGateway;
import com.azure.resourcemanager.network.generated.models.VpnGatewayPacketCaptureStartParameters;
import com.azure.resourcemanager.network.generated.models.VpnGatewayPacketCaptureStopParameters;
import com.azure.resourcemanager.network.generated.models.VpnGateways;

public final class VpnGatewaysImpl implements VpnGateways {
    private static final ClientLogger LOGGER = new ClientLogger(VpnGatewaysImpl.class);

    private final VpnGatewaysClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnGatewaysImpl(VpnGatewaysClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VpnGateway> getByResourceGroupWithResponse(String resourceGroupName, String gatewayName,
        Context context) {
        Response<VpnGatewayInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, gatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VpnGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnGateway getByResourceGroup(String resourceGroupName, String gatewayName) {
        VpnGatewayInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, gatewayName);
        if (inner != null) {
            return new VpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String gatewayName) {
        this.serviceClient().delete(resourceGroupName, gatewayName);
    }

    public void delete(String resourceGroupName, String gatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, gatewayName, context);
    }

    public VpnGateway reset(String resourceGroupName, String gatewayName) {
        VpnGatewayInner inner = this.serviceClient().reset(resourceGroupName, gatewayName);
        if (inner != null) {
            return new VpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnGateway reset(String resourceGroupName, String gatewayName, String ipConfigurationId, Context context) {
        VpnGatewayInner inner = this.serviceClient().reset(resourceGroupName, gatewayName, ipConfigurationId, context);
        if (inner != null) {
            return new VpnGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String startPacketCapture(String resourceGroupName, String gatewayName) {
        return this.serviceClient().startPacketCapture(resourceGroupName, gatewayName);
    }

    public String startPacketCapture(String resourceGroupName, String gatewayName,
        VpnGatewayPacketCaptureStartParameters parameters, Context context) {
        return this.serviceClient().startPacketCapture(resourceGroupName, gatewayName, parameters, context);
    }

    public String stopPacketCapture(String resourceGroupName, String gatewayName) {
        return this.serviceClient().stopPacketCapture(resourceGroupName, gatewayName);
    }

    public String stopPacketCapture(String resourceGroupName, String gatewayName,
        VpnGatewayPacketCaptureStopParameters parameters, Context context) {
        return this.serviceClient().stopPacketCapture(resourceGroupName, gatewayName, parameters, context);
    }

    public PagedIterable<VpnGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VpnGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VpnGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnGateway> list() {
        PagedIterable<VpnGatewayInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnGateway> list(Context context) {
        PagedIterable<VpnGatewayInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnGatewayImpl(inner1, this.manager()));
    }

    public VpnGateway getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = ResourceManagerUtils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, gatewayName, Context.NONE).getValue();
    }

    public Response<VpnGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = ResourceManagerUtils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, gatewayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = ResourceManagerUtils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = ResourceManagerUtils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, context);
    }

    private VpnGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VpnGatewayImpl define(String name) {
        return new VpnGatewayImpl(name, this.manager());
    }
}
