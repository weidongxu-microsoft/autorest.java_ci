// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnClientIPsecParametersInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpPeerStatusListResult;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.GatewayRouteListResult;
import com.azure.resourcemanager.network.generated.models.P2SVpnConnectionRequest;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGateway;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayNatRule;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnClientConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealthDetailListResult;
import com.azure.resourcemanager.network.generated.models.VpnClientIPsecParameters;
import com.azure.resourcemanager.network.generated.models.VpnClientParameters;
import com.azure.resourcemanager.network.generated.models.VpnGatewayGeneration;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStartParameters;
import com.azure.resourcemanager.network.generated.models.VpnPacketCaptureStopParameters;
import com.azure.resourcemanager.network.generated.models.VpnType;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualNetworkGatewayImpl
    implements VirtualNetworkGateway, VirtualNetworkGateway.Definition, VirtualNetworkGateway.Update {
    private VirtualNetworkGatewayInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        List<VirtualNetworkGatewayIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualNetworkGatewayType gatewayType() {
        return this.innerModel().gatewayType();
    }

    public VpnType vpnType() {
        return this.innerModel().vpnType();
    }

    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.innerModel().vpnGatewayGeneration();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public Boolean enablePrivateIpAddress() {
        return this.innerModel().enablePrivateIpAddress();
    }

    public Boolean active() {
        return this.innerModel().active();
    }

    public SubResource gatewayDefaultSite() {
        return this.innerModel().gatewayDefaultSite();
    }

    public VirtualNetworkGatewaySku sku() {
        return this.innerModel().sku();
    }

    public VpnClientConfiguration vpnClientConfiguration() {
        return this.innerModel().vpnClientConfiguration();
    }

    public BgpSettings bgpSettings() {
        return this.innerModel().bgpSettings();
    }

    public AddressSpace customRoutes() {
        return this.innerModel().customRoutes();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean enableDnsForwarding() {
        return this.innerModel().enableDnsForwarding();
    }

    public String inboundDnsForwardingEndpoint() {
        return this.innerModel().inboundDnsForwardingEndpoint();
    }

    public String vNetExtendedLocationResourceId() {
        return this.innerModel().vNetExtendedLocationResourceId();
    }

    public List<VirtualNetworkGatewayNatRule> natRules() {
        List<VirtualNetworkGatewayNatRuleInner> inner = this.innerModel().natRules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualNetworkGatewayNatRuleImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableBgpRouteTranslationForNat() {
        return this.innerModel().enableBgpRouteTranslationForNat();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualNetworkGatewayInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkGatewayName;

    private TagsObject updateParameters;

    public VirtualNetworkGatewayImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetworkGateway create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkGateway create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .createOrUpdate(resourceGroupName, virtualNetworkGatewayName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkGatewayImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualNetworkGatewayInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkGatewayName = name;
    }

    public VirtualNetworkGatewayImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public VirtualNetworkGateway apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .updateTags(resourceGroupName, virtualNetworkGatewayName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualNetworkGateway apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .updateTags(resourceGroupName, virtualNetworkGatewayName, updateParameters, context);
        return this;
    }

    VirtualNetworkGatewayImpl(
        VirtualNetworkGatewayInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkGatewayName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkGateways");
    }

    public VirtualNetworkGateway refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkGateway refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkGateways()
                .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkGatewayName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkGateway reset(String gatewayVip) {
        return serviceManager.virtualNetworkGateways().reset(resourceGroupName, virtualNetworkGatewayName, gatewayVip);
    }

    public VirtualNetworkGateway reset() {
        return serviceManager.virtualNetworkGateways().reset(resourceGroupName, virtualNetworkGatewayName);
    }

    public VirtualNetworkGateway reset(String gatewayVip, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .reset(resourceGroupName, virtualNetworkGatewayName, gatewayVip, context);
    }

    public void resetVpnClientSharedKey() {
        serviceManager.virtualNetworkGateways().resetVpnClientSharedKey(resourceGroupName, virtualNetworkGatewayName);
    }

    public void resetVpnClientSharedKey(Context context) {
        serviceManager
            .virtualNetworkGateways()
            .resetVpnClientSharedKey(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public String generatevpnclientpackage(VpnClientParameters parameters) {
        return serviceManager
            .virtualNetworkGateways()
            .generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generatevpnclientpackage(VpnClientParameters parameters, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .generatevpnclientpackage(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String generateVpnProfile(VpnClientParameters parameters) {
        return serviceManager
            .virtualNetworkGateways()
            .generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String generateVpnProfile(VpnClientParameters parameters, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .generateVpnProfile(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String getVpnProfilePackageUrl() {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName);
    }

    public String getVpnProfilePackageUrl(Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnProfilePackageUrl(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public BgpPeerStatusListResult getBgpPeerStatus(String peer) {
        return serviceManager
            .virtualNetworkGateways()
            .getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName, peer);
    }

    public BgpPeerStatusListResult getBgpPeerStatus() {
        return serviceManager.virtualNetworkGateways().getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName);
    }

    public BgpPeerStatusListResult getBgpPeerStatus(String peer, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .getBgpPeerStatus(resourceGroupName, virtualNetworkGatewayName, peer, context);
    }

    public String supportedVpnDevices() {
        return serviceManager
            .virtualNetworkGateways()
            .supportedVpnDevices(resourceGroupName, virtualNetworkGatewayName);
    }

    public Response<String> supportedVpnDevicesWithResponse(Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .supportedVpnDevicesWithResponse(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public GatewayRouteListResult getLearnedRoutes() {
        return serviceManager.virtualNetworkGateways().getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName);
    }

    public GatewayRouteListResult getLearnedRoutes(Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .getLearnedRoutes(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public VpnClientIPsecParameters setVpnclientIpsecParameters(VpnClientIPsecParametersInner vpnclientIpsecParams) {
        return serviceManager
            .virtualNetworkGateways()
            .setVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, vpnclientIpsecParams);
    }

    public VpnClientIPsecParameters setVpnclientIpsecParameters(
        VpnClientIPsecParametersInner vpnclientIpsecParams, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .setVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, vpnclientIpsecParams, context);
    }

    public VpnClientIPsecParameters getVpnclientIpsecParameters() {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName);
    }

    public VpnClientIPsecParameters getVpnclientIpsecParameters(Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnclientIpsecParameters(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public String startPacketCapture(VpnPacketCaptureStartParameters parameters) {
        return serviceManager
            .virtualNetworkGateways()
            .startPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String startPacketCapture() {
        return serviceManager.virtualNetworkGateways().startPacketCapture(resourceGroupName, virtualNetworkGatewayName);
    }

    public String startPacketCapture(VpnPacketCaptureStartParameters parameters, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .startPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public String stopPacketCapture(VpnPacketCaptureStopParameters parameters) {
        return serviceManager
            .virtualNetworkGateways()
            .stopPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters);
    }

    public String stopPacketCapture(VpnPacketCaptureStopParameters parameters, Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .stopPacketCapture(resourceGroupName, virtualNetworkGatewayName, parameters, context);
    }

    public VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth() {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnclientConnectionHealth(resourceGroupName, virtualNetworkGatewayName);
    }

    public VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth(Context context) {
        return serviceManager
            .virtualNetworkGateways()
            .getVpnclientConnectionHealth(resourceGroupName, virtualNetworkGatewayName, context);
    }

    public void disconnectVirtualNetworkGatewayVpnConnections(P2SVpnConnectionRequest request) {
        serviceManager
            .virtualNetworkGateways()
            .disconnectVirtualNetworkGatewayVpnConnections(resourceGroupName, virtualNetworkGatewayName, request);
    }

    public void disconnectVirtualNetworkGatewayVpnConnections(P2SVpnConnectionRequest request, Context context) {
        serviceManager
            .virtualNetworkGateways()
            .disconnectVirtualNetworkGatewayVpnConnections(
                resourceGroupName, virtualNetworkGatewayName, request, context);
    }

    public VirtualNetworkGatewayImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkGatewayImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkGatewayImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkGatewayImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualNetworkGatewayImpl withIpConfigurations(List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.innerModel().withGatewayType(gatewayType);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnType(VpnType vpnType) {
        this.innerModel().withVpnType(vpnType);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.innerModel().withVpnGatewayGeneration(vpnGatewayGeneration);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableBgp(Boolean enableBgp) {
        this.innerModel().withEnableBgp(enableBgp);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.innerModel().withEnablePrivateIpAddress(enablePrivateIpAddress);
        return this;
    }

    public VirtualNetworkGatewayImpl withActive(Boolean active) {
        this.innerModel().withActive(active);
        return this;
    }

    public VirtualNetworkGatewayImpl withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.innerModel().withGatewayDefaultSite(gatewayDefaultSite);
        return this;
    }

    public VirtualNetworkGatewayImpl withSku(VirtualNetworkGatewaySku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public VirtualNetworkGatewayImpl withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.innerModel().withVpnClientConfiguration(vpnClientConfiguration);
        return this;
    }

    public VirtualNetworkGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.innerModel().withBgpSettings(bgpSettings);
        return this;
    }

    public VirtualNetworkGatewayImpl withCustomRoutes(AddressSpace customRoutes) {
        this.innerModel().withCustomRoutes(customRoutes);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.innerModel().withEnableDnsForwarding(enableDnsForwarding);
        return this;
    }

    public VirtualNetworkGatewayImpl withVNetExtendedLocationResourceId(String vNetExtendedLocationResourceId) {
        this.innerModel().withVNetExtendedLocationResourceId(vNetExtendedLocationResourceId);
        return this;
    }

    public VirtualNetworkGatewayImpl withNatRules(List<VirtualNetworkGatewayNatRuleInner> natRules) {
        this.innerModel().withNatRules(natRules);
        return this;
    }

    public VirtualNetworkGatewayImpl withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        this.innerModel().withEnableBgpRouteTranslationForNat(enableBgpRouteTranslationForNat);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
