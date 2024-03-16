// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import java.util.List;

/**
 * An immutable client-side representation of NetworkInterfaceIpConfiguration.
 */
public interface NetworkInterfaceIpConfiguration {
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
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the gatewayLoadBalancer property: The reference to gateway load balancer frontend IP.
     * 
     * @return the gatewayLoadBalancer value.
     */
    SubResource gatewayLoadBalancer();

    /**
     * Gets the virtualNetworkTaps property: The reference to Virtual Network Taps.
     * 
     * @return the virtualNetworkTaps value.
     */
    List<VirtualNetworkTap> virtualNetworkTaps();

    /**
     * Gets the applicationGatewayBackendAddressPools property: The reference to ApplicationGatewayBackendAddressPool resource.
     * 
     * @return the applicationGatewayBackendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools();

    /**
     * Gets the loadBalancerBackendAddressPools property: The reference to LoadBalancerBackendAddressPool resource.
     * 
     * @return the loadBalancerBackendAddressPools value.
     */
    List<BackendAddressPool> loadBalancerBackendAddressPools();

    /**
     * Gets the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     * 
     * @return the loadBalancerInboundNatRules value.
     */
    List<InboundNatRule> loadBalancerInboundNatRules();

    /**
     * Gets the privateIpAddress property: Private IP address of the IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the privateIpAddressVersion property: Whether the specific IP configuration is IPv4 or IPv6. Default is IPv4.
     * 
     * @return the privateIpAddressVersion value.
     */
    IpVersion privateIpAddressVersion();

    /**
     * Gets the subnet property: Subnet bound to the IP configuration.
     * 
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the primary property: Whether this is a primary customer address on the network interface.
     * 
     * @return the primary value.
     */
    Boolean primary();

    /**
     * Gets the publicIpAddress property: Public IP address bound to the IP configuration.
     * 
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the applicationSecurityGroups property: Application security groups in which the IP configuration is included.
     * 
     * @return the applicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> applicationSecurityGroups();

    /**
     * Gets the provisioningState property: The provisioning state of the network interface IP configuration.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the privateLinkConnectionProperties property: PrivateLinkConnection properties for the network interface.
     * 
     * @return the privateLinkConnectionProperties value.
     */
    NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties privateLinkConnectionProperties();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner object.
     * 
     * @return the inner object.
     */
    NetworkInterfaceIpConfigurationInner innerModel();
}
