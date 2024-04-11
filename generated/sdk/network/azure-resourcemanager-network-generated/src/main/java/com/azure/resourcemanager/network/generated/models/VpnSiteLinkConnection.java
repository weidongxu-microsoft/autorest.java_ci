// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner;
import java.util.List;

/**
 * An immutable client-side representation of VpnSiteLinkConnection.
 */
public interface VpnSiteLinkConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the vpnSiteLink property: Id of the connected vpn site link.
     * 
     * @return the vpnSiteLink value.
     */
    SubResource vpnSiteLink();

    /**
     * Gets the routingWeight property: Routing weight for vpn connection.
     * 
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * Gets the vpnLinkConnectionMode property: Vpn link connection mode.
     * 
     * @return the vpnLinkConnectionMode value.
     */
    VpnLinkConnectionMode vpnLinkConnectionMode();

    /**
     * Gets the connectionStatus property: The connection status.
     * 
     * @return the connectionStatus value.
     */
    VpnConnectionStatus connectionStatus();

    /**
     * Gets the vpnConnectionProtocolType property: Connection protocol used for this connection.
     * 
     * @return the vpnConnectionProtocolType value.
     */
    VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType();

    /**
     * Gets the ingressBytesTransferred property: Ingress bytes transferred.
     * 
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * Gets the egressBytesTransferred property: Egress bytes transferred.
     * 
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * Gets the connectionBandwidth property: Expected bandwidth in MBPS.
     * 
     * @return the connectionBandwidth value.
     */
    Integer connectionBandwidth();

    /**
     * Gets the sharedKey property: SharedKey for the vpn connection.
     * 
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * Gets the enableBgp property: EnableBgp flag.
     * 
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * Gets the vpnGatewayCustomBgpAddresses property: vpnGatewayCustomBgpAddresses used by this connection.
     * 
     * @return the vpnGatewayCustomBgpAddresses value.
     */
    List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses();

    /**
     * Gets the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     * 
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * Gets the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     * 
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * Gets the enableRateLimiting property: EnableBgp flag.
     * 
     * @return the enableRateLimiting value.
     */
    Boolean enableRateLimiting();

    /**
     * Gets the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     * 
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * Gets the provisioningState property: The provisioning state of the VPN site link connection resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the ingressNatRules property: List of ingress NatRules.
     * 
     * @return the ingressNatRules value.
     */
    List<SubResource> ingressNatRules();

    /**
     * Gets the egressNatRules property: List of egress NatRules.
     * 
     * @return the egressNatRules value.
     */
    List<SubResource> egressNatRules();

    /**
     * Gets the dpdTimeoutSeconds property: Dead Peer Detection timeout in seconds for VpnLink connection.
     * 
     * @return the dpdTimeoutSeconds value.
     */
    Integer dpdTimeoutSeconds();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner object.
     * 
     * @return the inner object.
     */
    VpnSiteLinkConnectionInner innerModel();
}
