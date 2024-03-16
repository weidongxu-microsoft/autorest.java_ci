// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VirtualNetworkGatewaysClient;
import com.azure.resourcemanager.network.generated.fluent.models.BgpPeerStatusListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.GatewayRouteListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionListEntityInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnClientConnectionHealthDetailListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnClientIPsecParametersInner;
import com.azure.resourcemanager.network.generated.models.BgpPeerStatusListResult;
import com.azure.resourcemanager.network.generated.models.GatewayRouteListResult;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionRequest;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionListEntity;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateways;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealthDetailListResult;
import com.azure.resourcemanager.network.generated.models.VpnClientIPsecParameters;
import com.azure.resourcemanager.network.generated.models.VpnClientParameters;
import com.azure.resourcemanager.network.generated.models.VpnDeviceScriptParameters;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStartParameters;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStopParameters;

public final class VirtualNetworkGatewaysImpl implements VirtualNetworkGateways {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkGatewaysImpl.class);

    private final VirtualNetworkGatewaysClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VirtualNetworkGatewaysImpl(VirtualNetworkGatewaysClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VirtualNetworkGateway> getByResourceGroupWithResponse(String resourceGroupName,
        String virtualNetworkGatewayName, Context context) {
        Response<VirtualNetworkGatewayInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualNetworkGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway getByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewayInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayName);
    }

    public void delete(String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualNetworkGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualNetworkGatewayInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualNetworkGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(String resourceGroupName,
        String virtualNetworkGatewayName) {
        PagedIterable<VirtualNetworkGatewayConnectionListEntityInner> inner
            = this.serviceClient().listConnections(resourceGroupName, virtualNetworkGatewayName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new VirtualNetworkGatewayConnectionListEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(String resourceGroupName,
        String virtualNetworkGatewayName, Context context) {
        PagedIterable<VirtualNetworkGatewayConnectionListEntityInner> inner
            = this.serviceClient().listConnections(resourceGroupName, virtualNetworkGatewayName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new VirtualNetworkGatewayConnectionListEntityImpl(inner1, this.manager()));
    }

    public VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName) {
        VirtualNetworkGatewayInner inner = this.serviceClient().reset(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName, String gatewayVip,
        Context context) {
        VirtualNetworkGatewayInner inner
            = this.serviceClient().reset(resourceGroupName, virtualNetworkGatewayName, gatewayVip, context);
        if (inner != null) {
            return new VirtualNetworkGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void resetVpnClientSharedKey(String resourceGroupName, String virtualNetworkGatewayName) {
        this.serviceClient().resetVpnClientSharedKey(resourceGroupName, virtualNetworkGatewayName);
    }

    public void resetVpnClientSharedKey(String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        this.serviceClient().resetVpnClientSharedKey(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public String generatevpnclientpackage(String resourceGroupName, String virtualNetworkGatewayName,
        VpnClientParameters parameters) {
        return this.serviceClient().generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generatevpnclientpackage(String resourceGroupName, String virtualNetworkGatewayName,
        VpnClientParameters parameters, Context context) {
        return this.serviceClient()
            .generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String generateVpnProfile(String resourceGroupName, String virtualNetworkGatewayName,
        VpnClientParameters parameters) {
        return this.serviceClient().generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generateVpnProfile(String resourceGroupName, String virtualNetworkGatewayName,
        VpnClientParameters parameters, Context context) {
        return this.serviceClient()
            .generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName) {
        return this.serviceClient().getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName);
    }

    public String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName, Context context) {
        return this.serviceClient().getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public BgpPeerStatusListResult getBgpPeerStatus(String resourceGroupName, String virtualNetworkGatewayName) {
        BgpPeerStatusListResultInner inner
            = this.serviceClient().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new BgpPeerStatusListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BgpPeerStatusListResult getBgpPeerStatus(String resourceGroupName, String virtualNetworkGatewayName,
        String peer, Context context) {
        BgpPeerStatusListResultInner inner
            = this.serviceClient().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName, peer, context);
        if (inner != null) {
            return new BgpPeerStatusListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<String> supportedVpnDevicesWithResponse(String resourceGroupName, String virtualNetworkGatewayName,
        Context context) {
        return this.serviceClient()
            .supportedVpnDevicesWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public String supportedVpnDevices(String resourceGroupName, String virtualNetworkGatewayName) {
        return this.serviceClient().supportedVpnDevices(resourceGroupName, virtualNetworkGatewayName);
    }

    public GatewayRouteListResult getLearnedRoutes(String resourceGroupName, String virtualNetworkGatewayName) {
        GatewayRouteListResultInner inner
            = this.serviceClient().getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getLearnedRoutes(String resourceGroupName, String virtualNetworkGatewayName,
        Context context) {
        GatewayRouteListResultInner inner
            = this.serviceClient().getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getAdvertisedRoutes(String resourceGroupName, String virtualNetworkGatewayName,
        String peer) {
        GatewayRouteListResultInner inner
            = this.serviceClient().getAdvertisedRoutes(resourceGroupName, virtualNetworkGatewayName, peer);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GatewayRouteListResult getAdvertisedRoutes(String resourceGroupName, String virtualNetworkGatewayName,
        String peer, Context context) {
        GatewayRouteListResultInner inner
            = this.serviceClient().getAdvertisedRoutes(resourceGroupName, virtualNetworkGatewayName, peer, context);
        if (inner != null) {
            return new GatewayRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnClientIPsecParameters setVpnclientIpsecParameters(String resourceGroupName,
        String virtualNetworkGatewayName, VpnClientIPsecParametersInner vpnclientIpsecParams) {
        VpnClientIPsecParametersInner inner = this.serviceClient()
            .setVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, vpnclientIpsecParams);
        if (inner != null) {
            return new VpnClientIPsecParametersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnClientIPsecParameters setVpnclientIpsecParameters(String resourceGroupName,
        String virtualNetworkGatewayName, VpnClientIPsecParametersInner vpnclientIpsecParams, Context context) {
        VpnClientIPsecParametersInner inner = this.serviceClient()
            .setVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, vpnclientIpsecParams, context);
        if (inner != null) {
            return new VpnClientIPsecParametersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnClientIPsecParameters getVpnclientIpsecParameters(String resourceGroupName,
        String virtualNetworkGatewayName) {
        VpnClientIPsecParametersInner inner
            = this.serviceClient().getVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VpnClientIPsecParametersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnClientIPsecParameters getVpnclientIpsecParameters(String resourceGroupName,
        String virtualNetworkGatewayName, Context context) {
        VpnClientIPsecParametersInner inner
            = this.serviceClient().getVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new VpnClientIPsecParametersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<String> vpnDeviceConfigurationScriptWithResponse(String resourceGroupName,
        String virtualNetworkGatewayConnectionName, VpnDeviceScriptParameters parameters, Context context) {
        return this.serviceClient()
            .vpnDeviceConfigurationScriptWithResponse(resourceGroupName, virtualNetworkGatewayConnectionName,
                parameters, context);
    }

    public String vpnDeviceConfigurationScript(String resourceGroupName, String virtualNetworkGatewayConnectionName,
        VpnDeviceScriptParameters parameters) {
        return this.serviceClient()
            .vpnDeviceConfigurationScript(resourceGroupName, virtualNetworkGatewayConnectionName, parameters);
    }

    public String startPacketCapture(String resourceGroupName, String virtualNetworkGatewayName) {
        return this.serviceClient().startPacketCapture(resourceGroupName, virtualNetworkGatewayName);
    }

    public String startPacketCapture(String resourceGroupName, String virtualNetworkGatewayName,
        VpnPacketCaptureStartParameters parameters, Context context) {
        return this.serviceClient()
            .startPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String stopPacketCapture(String resourceGroupName, String virtualNetworkGatewayName,
        VpnPacketCaptureStopParameters parameters) {
        return this.serviceClient().stopPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String stopPacketCapture(String resourceGroupName, String virtualNetworkGatewayName,
        VpnPacketCaptureStopParameters parameters, Context context) {
        return this.serviceClient()
            .stopPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth(String resourceGroupName,
        String virtualNetworkGatewayName) {
        VpnClientConnectionHealthDetailListResultInner inner
            = this.serviceClient().getVpnclientConnectionHealth(resourceGroupName, virtualNetworkGatewayName);
        if (inner != null) {
            return new VpnClientConnectionHealthDetailListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth(String resourceGroupName,
        String virtualNetworkGatewayName, Context context) {
        VpnClientConnectionHealthDetailListResultInner inner
            = this.serviceClient().getVpnclientConnectionHealth(resourceGroupName, virtualNetworkGatewayName, context);
        if (inner != null) {
            return new VpnClientConnectionHealthDetailListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void disconnectVirtualNetworkGatewayVpnConnections(String resourceGroupName,
        String virtualNetworkGatewayName, P2SVpnConnectionRequest request) {
        this.serviceClient()
            .disconnectVirtualNetworkGatewayVpnConnections(resourceGroupName, virtualNetworkGatewayName, request);
    }

    public void disconnectVirtualNetworkGatewayVpnConnections(String resourceGroupName,
        String virtualNetworkGatewayName, P2SVpnConnectionRequest request, Context context) {
        this.serviceClient()
            .disconnectVirtualNetworkGatewayVpnConnections(resourceGroupName, virtualNetworkGatewayName, request,
                context);
    }

    public VirtualNetworkGateway getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, Context.NONE)
            .getValue();
    }

    public Response<VirtualNetworkGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualNetworkGatewayName = ResourceManagerUtils.getValueFromIdByName(id, "virtualNetworkGateways");
        if (virtualNetworkGatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'virtualNetworkGateways'.", id)));
        }
        this.delete(resourceGroupName, virtualNetworkGatewayName, context);
    }

    private VirtualNetworkGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkGatewayImpl define(String name) {
        return new VirtualNetworkGatewayImpl(name, this.manager());
    }
}
