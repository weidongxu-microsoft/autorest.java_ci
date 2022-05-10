// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for NetworkManagementClient class. */
public interface NetworkManagementClient {
    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ApplicationGatewaysClient object to access its operations.
     *
     * @return the ApplicationGatewaysClient object.
     */
    ApplicationGatewaysClient getApplicationGateways();

    /**
     * Gets the ApplicationGatewayPrivateLinkResourcesClient object to access its operations.
     *
     * @return the ApplicationGatewayPrivateLinkResourcesClient object.
     */
    ApplicationGatewayPrivateLinkResourcesClient getApplicationGatewayPrivateLinkResources();

    /**
     * Gets the ApplicationGatewayPrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the ApplicationGatewayPrivateEndpointConnectionsClient object.
     */
    ApplicationGatewayPrivateEndpointConnectionsClient getApplicationGatewayPrivateEndpointConnections();

    /**
     * Gets the ApplicationSecurityGroupsClient object to access its operations.
     *
     * @return the ApplicationSecurityGroupsClient object.
     */
    ApplicationSecurityGroupsClient getApplicationSecurityGroups();

    /**
     * Gets the AvailableDelegationsClient object to access its operations.
     *
     * @return the AvailableDelegationsClient object.
     */
    AvailableDelegationsClient getAvailableDelegations();

    /**
     * Gets the AvailableResourceGroupDelegationsClient object to access its operations.
     *
     * @return the AvailableResourceGroupDelegationsClient object.
     */
    AvailableResourceGroupDelegationsClient getAvailableResourceGroupDelegations();

    /**
     * Gets the AvailableServiceAliasesClient object to access its operations.
     *
     * @return the AvailableServiceAliasesClient object.
     */
    AvailableServiceAliasesClient getAvailableServiceAliases();

    /**
     * Gets the AzureFirewallsClient object to access its operations.
     *
     * @return the AzureFirewallsClient object.
     */
    AzureFirewallsClient getAzureFirewalls();

    /**
     * Gets the AzureFirewallFqdnTagsClient object to access its operations.
     *
     * @return the AzureFirewallFqdnTagsClient object.
     */
    AzureFirewallFqdnTagsClient getAzureFirewallFqdnTags();

    /**
     * Gets the WebCategoriesClient object to access its operations.
     *
     * @return the WebCategoriesClient object.
     */
    WebCategoriesClient getWebCategories();

    /**
     * Gets the BastionHostsClient object to access its operations.
     *
     * @return the BastionHostsClient object.
     */
    BastionHostsClient getBastionHosts();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the NetworkInterfacesClient object to access its operations.
     *
     * @return the NetworkInterfacesClient object.
     */
    NetworkInterfacesClient getNetworkInterfaces();

    /**
     * Gets the PublicIpAddressesClient object to access its operations.
     *
     * @return the PublicIpAddressesClient object.
     */
    PublicIpAddressesClient getPublicIpAddresses();

    /**
     * Gets the CustomIpPrefixesClient object to access its operations.
     *
     * @return the CustomIpPrefixesClient object.
     */
    CustomIpPrefixesClient getCustomIpPrefixes();

    /**
     * Gets the DdosCustomPoliciesClient object to access its operations.
     *
     * @return the DdosCustomPoliciesClient object.
     */
    DdosCustomPoliciesClient getDdosCustomPolicies();

    /**
     * Gets the DdosProtectionPlansClient object to access its operations.
     *
     * @return the DdosProtectionPlansClient object.
     */
    DdosProtectionPlansClient getDdosProtectionPlans();

    /**
     * Gets the DscpConfigurationsClient object to access its operations.
     *
     * @return the DscpConfigurationsClient object.
     */
    DscpConfigurationsClient getDscpConfigurations();

    /**
     * Gets the AvailableEndpointServicesClient object to access its operations.
     *
     * @return the AvailableEndpointServicesClient object.
     */
    AvailableEndpointServicesClient getAvailableEndpointServices();

    /**
     * Gets the ExpressRouteCircuitAuthorizationsClient object to access its operations.
     *
     * @return the ExpressRouteCircuitAuthorizationsClient object.
     */
    ExpressRouteCircuitAuthorizationsClient getExpressRouteCircuitAuthorizations();

    /**
     * Gets the ExpressRouteCircuitPeeringsClient object to access its operations.
     *
     * @return the ExpressRouteCircuitPeeringsClient object.
     */
    ExpressRouteCircuitPeeringsClient getExpressRouteCircuitPeerings();

    /**
     * Gets the ExpressRouteCircuitConnectionsClient object to access its operations.
     *
     * @return the ExpressRouteCircuitConnectionsClient object.
     */
    ExpressRouteCircuitConnectionsClient getExpressRouteCircuitConnections();

    /**
     * Gets the PeerExpressRouteCircuitConnectionsClient object to access its operations.
     *
     * @return the PeerExpressRouteCircuitConnectionsClient object.
     */
    PeerExpressRouteCircuitConnectionsClient getPeerExpressRouteCircuitConnections();

    /**
     * Gets the ExpressRouteCircuitsClient object to access its operations.
     *
     * @return the ExpressRouteCircuitsClient object.
     */
    ExpressRouteCircuitsClient getExpressRouteCircuits();

    /**
     * Gets the ExpressRouteServiceProvidersClient object to access its operations.
     *
     * @return the ExpressRouteServiceProvidersClient object.
     */
    ExpressRouteServiceProvidersClient getExpressRouteServiceProviders();

    /**
     * Gets the ExpressRouteCrossConnectionsClient object to access its operations.
     *
     * @return the ExpressRouteCrossConnectionsClient object.
     */
    ExpressRouteCrossConnectionsClient getExpressRouteCrossConnections();

    /**
     * Gets the ExpressRouteCrossConnectionPeeringsClient object to access its operations.
     *
     * @return the ExpressRouteCrossConnectionPeeringsClient object.
     */
    ExpressRouteCrossConnectionPeeringsClient getExpressRouteCrossConnectionPeerings();

    /**
     * Gets the ExpressRoutePortsLocationsClient object to access its operations.
     *
     * @return the ExpressRoutePortsLocationsClient object.
     */
    ExpressRoutePortsLocationsClient getExpressRoutePortsLocations();

    /**
     * Gets the ExpressRoutePortsClient object to access its operations.
     *
     * @return the ExpressRoutePortsClient object.
     */
    ExpressRoutePortsClient getExpressRoutePorts();

    /**
     * Gets the ExpressRouteLinksClient object to access its operations.
     *
     * @return the ExpressRouteLinksClient object.
     */
    ExpressRouteLinksClient getExpressRouteLinks();

    /**
     * Gets the ExpressRoutePortAuthorizationsClient object to access its operations.
     *
     * @return the ExpressRoutePortAuthorizationsClient object.
     */
    ExpressRoutePortAuthorizationsClient getExpressRoutePortAuthorizations();

    /**
     * Gets the FirewallPoliciesClient object to access its operations.
     *
     * @return the FirewallPoliciesClient object.
     */
    FirewallPoliciesClient getFirewallPolicies();

    /**
     * Gets the FirewallPolicyRuleCollectionGroupsClient object to access its operations.
     *
     * @return the FirewallPolicyRuleCollectionGroupsClient object.
     */
    FirewallPolicyRuleCollectionGroupsClient getFirewallPolicyRuleCollectionGroups();

    /**
     * Gets the FirewallPolicyIdpsSignaturesClient object to access its operations.
     *
     * @return the FirewallPolicyIdpsSignaturesClient object.
     */
    FirewallPolicyIdpsSignaturesClient getFirewallPolicyIdpsSignatures();

    /**
     * Gets the FirewallPolicyIdpsSignaturesOverridesClient object to access its operations.
     *
     * @return the FirewallPolicyIdpsSignaturesOverridesClient object.
     */
    FirewallPolicyIdpsSignaturesOverridesClient getFirewallPolicyIdpsSignaturesOverrides();

    /**
     * Gets the FirewallPolicyIdpsSignaturesFilterValuesClient object to access its operations.
     *
     * @return the FirewallPolicyIdpsSignaturesFilterValuesClient object.
     */
    FirewallPolicyIdpsSignaturesFilterValuesClient getFirewallPolicyIdpsSignaturesFilterValues();

    /**
     * Gets the IpAllocationsClient object to access its operations.
     *
     * @return the IpAllocationsClient object.
     */
    IpAllocationsClient getIpAllocations();

    /**
     * Gets the IpGroupsClient object to access its operations.
     *
     * @return the IpGroupsClient object.
     */
    IpGroupsClient getIpGroups();

    /**
     * Gets the LoadBalancersClient object to access its operations.
     *
     * @return the LoadBalancersClient object.
     */
    LoadBalancersClient getLoadBalancers();

    /**
     * Gets the LoadBalancerBackendAddressPoolsClient object to access its operations.
     *
     * @return the LoadBalancerBackendAddressPoolsClient object.
     */
    LoadBalancerBackendAddressPoolsClient getLoadBalancerBackendAddressPools();

    /**
     * Gets the LoadBalancerFrontendIpConfigurationsClient object to access its operations.
     *
     * @return the LoadBalancerFrontendIpConfigurationsClient object.
     */
    LoadBalancerFrontendIpConfigurationsClient getLoadBalancerFrontendIpConfigurations();

    /**
     * Gets the InboundNatRulesClient object to access its operations.
     *
     * @return the InboundNatRulesClient object.
     */
    InboundNatRulesClient getInboundNatRules();

    /**
     * Gets the LoadBalancerLoadBalancingRulesClient object to access its operations.
     *
     * @return the LoadBalancerLoadBalancingRulesClient object.
     */
    LoadBalancerLoadBalancingRulesClient getLoadBalancerLoadBalancingRules();

    /**
     * Gets the LoadBalancerOutboundRulesClient object to access its operations.
     *
     * @return the LoadBalancerOutboundRulesClient object.
     */
    LoadBalancerOutboundRulesClient getLoadBalancerOutboundRules();

    /**
     * Gets the LoadBalancerNetworkInterfacesClient object to access its operations.
     *
     * @return the LoadBalancerNetworkInterfacesClient object.
     */
    LoadBalancerNetworkInterfacesClient getLoadBalancerNetworkInterfaces();

    /**
     * Gets the LoadBalancerProbesClient object to access its operations.
     *
     * @return the LoadBalancerProbesClient object.
     */
    LoadBalancerProbesClient getLoadBalancerProbes();

    /**
     * Gets the NatGatewaysClient object to access its operations.
     *
     * @return the NatGatewaysClient object.
     */
    NatGatewaysClient getNatGateways();

    /**
     * Gets the NetworkInterfaceIpConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceIpConfigurationsClient object.
     */
    NetworkInterfaceIpConfigurationsClient getNetworkInterfaceIpConfigurations();

    /**
     * Gets the NetworkInterfaceLoadBalancersClient object to access its operations.
     *
     * @return the NetworkInterfaceLoadBalancersClient object.
     */
    NetworkInterfaceLoadBalancersClient getNetworkInterfaceLoadBalancers();

    /**
     * Gets the NetworkInterfaceTapConfigurationsClient object to access its operations.
     *
     * @return the NetworkInterfaceTapConfigurationsClient object.
     */
    NetworkInterfaceTapConfigurationsClient getNetworkInterfaceTapConfigurations();

    /**
     * Gets the NetworkProfilesClient object to access its operations.
     *
     * @return the NetworkProfilesClient object.
     */
    NetworkProfilesClient getNetworkProfiles();

    /**
     * Gets the NetworkSecurityGroupsClient object to access its operations.
     *
     * @return the NetworkSecurityGroupsClient object.
     */
    NetworkSecurityGroupsClient getNetworkSecurityGroups();

    /**
     * Gets the SecurityRulesClient object to access its operations.
     *
     * @return the SecurityRulesClient object.
     */
    SecurityRulesClient getSecurityRules();

    /**
     * Gets the DefaultSecurityRulesClient object to access its operations.
     *
     * @return the DefaultSecurityRulesClient object.
     */
    DefaultSecurityRulesClient getDefaultSecurityRules();

    /**
     * Gets the NetworkVirtualAppliancesClient object to access its operations.
     *
     * @return the NetworkVirtualAppliancesClient object.
     */
    NetworkVirtualAppliancesClient getNetworkVirtualAppliances();

    /**
     * Gets the VirtualApplianceSitesClient object to access its operations.
     *
     * @return the VirtualApplianceSitesClient object.
     */
    VirtualApplianceSitesClient getVirtualApplianceSites();

    /**
     * Gets the VirtualApplianceSkusClient object to access its operations.
     *
     * @return the VirtualApplianceSkusClient object.
     */
    VirtualApplianceSkusClient getVirtualApplianceSkus();

    /**
     * Gets the InboundSecurityRuleOperationsClient object to access its operations.
     *
     * @return the InboundSecurityRuleOperationsClient object.
     */
    InboundSecurityRuleOperationsClient getInboundSecurityRuleOperations();

    /**
     * Gets the NetworkWatchersClient object to access its operations.
     *
     * @return the NetworkWatchersClient object.
     */
    NetworkWatchersClient getNetworkWatchers();

    /**
     * Gets the PacketCapturesClient object to access its operations.
     *
     * @return the PacketCapturesClient object.
     */
    PacketCapturesClient getPacketCaptures();

    /**
     * Gets the ConnectionMonitorsClient object to access its operations.
     *
     * @return the ConnectionMonitorsClient object.
     */
    ConnectionMonitorsClient getConnectionMonitors();

    /**
     * Gets the FlowLogsClient object to access its operations.
     *
     * @return the FlowLogsClient object.
     */
    FlowLogsClient getFlowLogs();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PrivateEndpointsClient object to access its operations.
     *
     * @return the PrivateEndpointsClient object.
     */
    PrivateEndpointsClient getPrivateEndpoints();

    /**
     * Gets the AvailablePrivateEndpointTypesClient object to access its operations.
     *
     * @return the AvailablePrivateEndpointTypesClient object.
     */
    AvailablePrivateEndpointTypesClient getAvailablePrivateEndpointTypes();

    /**
     * Gets the PrivateDnsZoneGroupsClient object to access its operations.
     *
     * @return the PrivateDnsZoneGroupsClient object.
     */
    PrivateDnsZoneGroupsClient getPrivateDnsZoneGroups();

    /**
     * Gets the PrivateLinkServicesClient object to access its operations.
     *
     * @return the PrivateLinkServicesClient object.
     */
    PrivateLinkServicesClient getPrivateLinkServices();

    /**
     * Gets the PublicIpPrefixesClient object to access its operations.
     *
     * @return the PublicIpPrefixesClient object.
     */
    PublicIpPrefixesClient getPublicIpPrefixes();

    /**
     * Gets the RouteFiltersClient object to access its operations.
     *
     * @return the RouteFiltersClient object.
     */
    RouteFiltersClient getRouteFilters();

    /**
     * Gets the RouteFilterRulesClient object to access its operations.
     *
     * @return the RouteFilterRulesClient object.
     */
    RouteFilterRulesClient getRouteFilterRules();

    /**
     * Gets the RouteTablesClient object to access its operations.
     *
     * @return the RouteTablesClient object.
     */
    RouteTablesClient getRouteTables();

    /**
     * Gets the RoutesClient object to access its operations.
     *
     * @return the RoutesClient object.
     */
    RoutesClient getRoutes();

    /**
     * Gets the SecurityPartnerProvidersClient object to access its operations.
     *
     * @return the SecurityPartnerProvidersClient object.
     */
    SecurityPartnerProvidersClient getSecurityPartnerProviders();

    /**
     * Gets the BgpServiceCommunitiesClient object to access its operations.
     *
     * @return the BgpServiceCommunitiesClient object.
     */
    BgpServiceCommunitiesClient getBgpServiceCommunities();

    /**
     * Gets the ServiceEndpointPoliciesClient object to access its operations.
     *
     * @return the ServiceEndpointPoliciesClient object.
     */
    ServiceEndpointPoliciesClient getServiceEndpointPolicies();

    /**
     * Gets the ServiceEndpointPolicyDefinitionsClient object to access its operations.
     *
     * @return the ServiceEndpointPolicyDefinitionsClient object.
     */
    ServiceEndpointPolicyDefinitionsClient getServiceEndpointPolicyDefinitions();

    /**
     * Gets the ServiceTagsClient object to access its operations.
     *
     * @return the ServiceTagsClient object.
     */
    ServiceTagsClient getServiceTags();

    /**
     * Gets the ServiceTagInformationsClient object to access its operations.
     *
     * @return the ServiceTagInformationsClient object.
     */
    ServiceTagInformationsClient getServiceTagInformations();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the VirtualNetworksClient object to access its operations.
     *
     * @return the VirtualNetworksClient object.
     */
    VirtualNetworksClient getVirtualNetworks();

    /**
     * Gets the SubnetsClient object to access its operations.
     *
     * @return the SubnetsClient object.
     */
    SubnetsClient getSubnets();

    /**
     * Gets the ResourceNavigationLinksClient object to access its operations.
     *
     * @return the ResourceNavigationLinksClient object.
     */
    ResourceNavigationLinksClient getResourceNavigationLinks();

    /**
     * Gets the ServiceAssociationLinksClient object to access its operations.
     *
     * @return the ServiceAssociationLinksClient object.
     */
    ServiceAssociationLinksClient getServiceAssociationLinks();

    /**
     * Gets the VirtualNetworkPeeringsClient object to access its operations.
     *
     * @return the VirtualNetworkPeeringsClient object.
     */
    VirtualNetworkPeeringsClient getVirtualNetworkPeerings();

    /**
     * Gets the VirtualNetworkGatewaysClient object to access its operations.
     *
     * @return the VirtualNetworkGatewaysClient object.
     */
    VirtualNetworkGatewaysClient getVirtualNetworkGateways();

    /**
     * Gets the VirtualNetworkGatewayConnectionsClient object to access its operations.
     *
     * @return the VirtualNetworkGatewayConnectionsClient object.
     */
    VirtualNetworkGatewayConnectionsClient getVirtualNetworkGatewayConnections();

    /**
     * Gets the LocalNetworkGatewaysClient object to access its operations.
     *
     * @return the LocalNetworkGatewaysClient object.
     */
    LocalNetworkGatewaysClient getLocalNetworkGateways();

    /**
     * Gets the VirtualNetworkGatewayNatRulesClient object to access its operations.
     *
     * @return the VirtualNetworkGatewayNatRulesClient object.
     */
    VirtualNetworkGatewayNatRulesClient getVirtualNetworkGatewayNatRules();

    /**
     * Gets the VirtualNetworkTapsClient object to access its operations.
     *
     * @return the VirtualNetworkTapsClient object.
     */
    VirtualNetworkTapsClient getVirtualNetworkTaps();

    /**
     * Gets the VirtualRoutersClient object to access its operations.
     *
     * @return the VirtualRoutersClient object.
     */
    VirtualRoutersClient getVirtualRouters();

    /**
     * Gets the VirtualRouterPeeringsClient object to access its operations.
     *
     * @return the VirtualRouterPeeringsClient object.
     */
    VirtualRouterPeeringsClient getVirtualRouterPeerings();

    /**
     * Gets the VirtualWansClient object to access its operations.
     *
     * @return the VirtualWansClient object.
     */
    VirtualWansClient getVirtualWans();

    /**
     * Gets the VpnSitesClient object to access its operations.
     *
     * @return the VpnSitesClient object.
     */
    VpnSitesClient getVpnSites();

    /**
     * Gets the VpnSiteLinksClient object to access its operations.
     *
     * @return the VpnSiteLinksClient object.
     */
    VpnSiteLinksClient getVpnSiteLinks();

    /**
     * Gets the VpnSitesConfigurationsClient object to access its operations.
     *
     * @return the VpnSitesConfigurationsClient object.
     */
    VpnSitesConfigurationsClient getVpnSitesConfigurations();

    /**
     * Gets the VpnServerConfigurationsClient object to access its operations.
     *
     * @return the VpnServerConfigurationsClient object.
     */
    VpnServerConfigurationsClient getVpnServerConfigurations();

    /**
     * Gets the ConfigurationPolicyGroupsClient object to access its operations.
     *
     * @return the ConfigurationPolicyGroupsClient object.
     */
    ConfigurationPolicyGroupsClient getConfigurationPolicyGroups();

    /**
     * Gets the VirtualHubsClient object to access its operations.
     *
     * @return the VirtualHubsClient object.
     */
    VirtualHubsClient getVirtualHubs();

    /**
     * Gets the HubVirtualNetworkConnectionsClient object to access its operations.
     *
     * @return the HubVirtualNetworkConnectionsClient object.
     */
    HubVirtualNetworkConnectionsClient getHubVirtualNetworkConnections();

    /**
     * Gets the VpnGatewaysClient object to access its operations.
     *
     * @return the VpnGatewaysClient object.
     */
    VpnGatewaysClient getVpnGateways();

    /**
     * Gets the VpnLinkConnectionsClient object to access its operations.
     *
     * @return the VpnLinkConnectionsClient object.
     */
    VpnLinkConnectionsClient getVpnLinkConnections();

    /**
     * Gets the VpnConnectionsClient object to access its operations.
     *
     * @return the VpnConnectionsClient object.
     */
    VpnConnectionsClient getVpnConnections();

    /**
     * Gets the VpnSiteLinkConnectionsClient object to access its operations.
     *
     * @return the VpnSiteLinkConnectionsClient object.
     */
    VpnSiteLinkConnectionsClient getVpnSiteLinkConnections();

    /**
     * Gets the NatRulesClient object to access its operations.
     *
     * @return the NatRulesClient object.
     */
    NatRulesClient getNatRules();

    /**
     * Gets the P2SVpnGatewaysClient object to access its operations.
     *
     * @return the P2SVpnGatewaysClient object.
     */
    P2SVpnGatewaysClient getP2SVpnGateways();

    /**
     * Gets the VpnServerConfigurationsAssociatedWithVirtualWansClient object to access its operations.
     *
     * @return the VpnServerConfigurationsAssociatedWithVirtualWansClient object.
     */
    VpnServerConfigurationsAssociatedWithVirtualWansClient getVpnServerConfigurationsAssociatedWithVirtualWans();

    /**
     * Gets the VirtualHubRouteTableV2SClient object to access its operations.
     *
     * @return the VirtualHubRouteTableV2SClient object.
     */
    VirtualHubRouteTableV2SClient getVirtualHubRouteTableV2S();

    /**
     * Gets the ExpressRouteGatewaysClient object to access its operations.
     *
     * @return the ExpressRouteGatewaysClient object.
     */
    ExpressRouteGatewaysClient getExpressRouteGateways();

    /**
     * Gets the ExpressRouteConnectionsClient object to access its operations.
     *
     * @return the ExpressRouteConnectionsClient object.
     */
    ExpressRouteConnectionsClient getExpressRouteConnections();

    /**
     * Gets the VirtualHubBgpConnectionsClient object to access its operations.
     *
     * @return the VirtualHubBgpConnectionsClient object.
     */
    VirtualHubBgpConnectionsClient getVirtualHubBgpConnections();

    /**
     * Gets the VirtualHubIpConfigurationsClient object to access its operations.
     *
     * @return the VirtualHubIpConfigurationsClient object.
     */
    VirtualHubIpConfigurationsClient getVirtualHubIpConfigurations();

    /**
     * Gets the HubRouteTablesClient object to access its operations.
     *
     * @return the HubRouteTablesClient object.
     */
    HubRouteTablesClient getHubRouteTables();

    /**
     * Gets the RoutingIntentsClient object to access its operations.
     *
     * @return the RoutingIntentsClient object.
     */
    RoutingIntentsClient getRoutingIntents();

    /**
     * Gets the WebApplicationFirewallPoliciesClient object to access its operations.
     *
     * @return the WebApplicationFirewallPoliciesClient object.
     */
    WebApplicationFirewallPoliciesClient getWebApplicationFirewallPolicies();
}
