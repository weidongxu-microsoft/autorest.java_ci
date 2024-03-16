// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapPropertiesFormatInner;
import java.util.List;

/**
 * An immutable client-side representation of VirtualNetworkTapPropertiesFormat.
 */
public interface VirtualNetworkTapPropertiesFormat {
    /**
     * Gets the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface IP configuration that needs to be tapped.
     * 
     * @return the networkInterfaceTapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations();

    /**
     * Gets the resourceGuid property: The resource GUID property of the virtual network tap resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network tap resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration();

    /**
     * Gets the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration();

    /**
     * Gets the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     * 
     * @return the destinationPort value.
     */
    Integer destinationPort();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapPropertiesFormatInner object.
     * 
     * @return the inner object.
     */
    VirtualNetworkTapPropertiesFormatInner innerModel();
}
