// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.GatewayLoadBalancerTunnelInterface;
import com.azure.resourcemanager.network.generated.models.LoadBalancerBackendAddress;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the backend address pool. */
@Fluent
public final class BackendAddressPoolPropertiesFormat {
    /*
     * The location of the backend address pool.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * An array of gateway load balancer tunnel interfaces.
     */
    @JsonProperty(value = "tunnelInterfaces")
    private List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces;

    /*
     * An array of backend addresses.
     */
    @JsonProperty(value = "loadBalancerBackendAddresses")
    private List<LoadBalancerBackendAddress> loadBalancerBackendAddresses;

    /*
     * An array of references to IP addresses defined in network interfaces.
     */
    @JsonProperty(value = "backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations;

    /*
     * An array of references to load balancing rules that use this backend address pool.
     */
    @JsonProperty(value = "loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * A reference to an outbound rule that uses this backend address pool.
     */
    @JsonProperty(value = "outboundRule", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource outboundRule;

    /*
     * An array of references to outbound rules that use this backend address pool.
     */
    @JsonProperty(value = "outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /*
     * An array of references to inbound NAT rules that use this backend address pool.
     */
    @JsonProperty(value = "inboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatRules;

    /*
     * The provisioning state of the backend address pool resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Amount of seconds Load Balancer waits for before sending RESET to client and backend address.
     */
    @JsonProperty(value = "drainPeriodInSeconds")
    private Integer drainPeriodInSeconds;

    /*
     * A reference to a virtual network.
     */
    @JsonProperty(value = "virtualNetwork")
    private SubResource virtualNetwork;

    /** Creates an instance of BackendAddressPoolPropertiesFormat class. */
    public BackendAddressPoolPropertiesFormat() {
    }

    /**
     * Get the location property: The location of the backend address pool.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the backend address pool.
     *
     * @param location the location value to set.
     * @return the BackendAddressPoolPropertiesFormat object itself.
     */
    public BackendAddressPoolPropertiesFormat withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces.
     *
     * @return the tunnelInterfaces value.
     */
    public List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces() {
        return this.tunnelInterfaces;
    }

    /**
     * Set the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces.
     *
     * @param tunnelInterfaces the tunnelInterfaces value to set.
     * @return the BackendAddressPoolPropertiesFormat object itself.
     */
    public BackendAddressPoolPropertiesFormat withTunnelInterfaces(
        List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces) {
        this.tunnelInterfaces = tunnelInterfaces;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddresses property: An array of backend addresses.
     *
     * @return the loadBalancerBackendAddresses value.
     */
    public List<LoadBalancerBackendAddress> loadBalancerBackendAddresses() {
        return this.loadBalancerBackendAddresses;
    }

    /**
     * Set the loadBalancerBackendAddresses property: An array of backend addresses.
     *
     * @param loadBalancerBackendAddresses the loadBalancerBackendAddresses value to set.
     * @return the BackendAddressPoolPropertiesFormat object itself.
     */
    public BackendAddressPoolPropertiesFormat withLoadBalancerBackendAddresses(
        List<LoadBalancerBackendAddress> loadBalancerBackendAddresses) {
        this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
        return this;
    }

    /**
     * Get the backendIpConfigurations property: An array of references to IP addresses defined in network interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }

    /**
     * Get the loadBalancingRules property: An array of references to load balancing rules that use this backend address
     * pool.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the outboundRule property: A reference to an outbound rule that uses this backend address pool.
     *
     * @return the outboundRule value.
     */
    public SubResource outboundRule() {
        return this.outboundRule;
    }

    /**
     * Get the outboundRules property: An array of references to outbound rules that use this backend address pool.
     *
     * @return the outboundRules value.
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get the inboundNatRules property: An array of references to inbound NAT rules that use this backend address pool.
     *
     * @return the inboundNatRules value.
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend address pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the drainPeriodInSeconds property: Amount of seconds Load Balancer waits for before sending RESET to client
     * and backend address.
     *
     * @return the drainPeriodInSeconds value.
     */
    public Integer drainPeriodInSeconds() {
        return this.drainPeriodInSeconds;
    }

    /**
     * Set the drainPeriodInSeconds property: Amount of seconds Load Balancer waits for before sending RESET to client
     * and backend address.
     *
     * @param drainPeriodInSeconds the drainPeriodInSeconds value to set.
     * @return the BackendAddressPoolPropertiesFormat object itself.
     */
    public BackendAddressPoolPropertiesFormat withDrainPeriodInSeconds(Integer drainPeriodInSeconds) {
        this.drainPeriodInSeconds = drainPeriodInSeconds;
        return this;
    }

    /**
     * Get the virtualNetwork property: A reference to a virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: A reference to a virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the BackendAddressPoolPropertiesFormat object itself.
     */
    public BackendAddressPoolPropertiesFormat withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tunnelInterfaces() != null) {
            tunnelInterfaces().forEach(e -> e.validate());
        }
        if (loadBalancerBackendAddresses() != null) {
            loadBalancerBackendAddresses().forEach(e -> e.validate());
        }
        if (backendIpConfigurations() != null) {
            backendIpConfigurations().forEach(e -> e.validate());
        }
    }
}
