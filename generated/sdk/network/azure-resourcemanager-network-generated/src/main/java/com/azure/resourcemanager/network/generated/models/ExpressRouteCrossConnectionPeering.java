// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;

/**
 * An immutable client-side representation of ExpressRouteCrossConnectionPeering.
 */
public interface ExpressRouteCrossConnectionPeering {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to access the resource.
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
     * Gets the peeringType property: The peering type.
     * 
     * @return the peeringType value.
     */
    ExpressRoutePeeringType peeringType();

    /**
     * Gets the state property: The peering state.
     * 
     * @return the state value.
     */
    ExpressRoutePeeringState state();

    /**
     * Gets the azureAsn property: The Azure ASN.
     * 
     * @return the azureAsn value.
     */
    Integer azureAsn();

    /**
     * Gets the peerAsn property: The peer ASN.
     * 
     * @return the peerAsn value.
     */
    Long peerAsn();

    /**
     * Gets the primaryPeerAddressPrefix property: The primary address prefix.
     * 
     * @return the primaryPeerAddressPrefix value.
     */
    String primaryPeerAddressPrefix();

    /**
     * Gets the secondaryPeerAddressPrefix property: The secondary address prefix.
     * 
     * @return the secondaryPeerAddressPrefix value.
     */
    String secondaryPeerAddressPrefix();

    /**
     * Gets the primaryAzurePort property: The primary port.
     * 
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * Gets the secondaryAzurePort property: The secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * Gets the sharedKey property: The shared key.
     * 
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * Gets the vlanId property: The VLAN ID.
     * 
     * @return the vlanId value.
     */
    Integer vlanId();

    /**
     * Gets the microsoftPeeringConfig property: The Microsoft peering configuration.
     * 
     * @return the microsoftPeeringConfig value.
     */
    ExpressRouteCircuitPeeringConfig microsoftPeeringConfig();

    /**
     * Gets the provisioningState property: The provisioning state of the express route cross connection peering resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * Gets the lastModifiedBy property: Who was the last to modify the peering.
     * 
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * Gets the ipv6PeeringConfig property: The IPv6 peering configuration.
     * 
     * @return the ipv6PeeringConfig value.
     */
    Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner object.
     * 
     * @return the inner object.
     */
    ExpressRouteCrossConnectionPeeringInner innerModel();
}
