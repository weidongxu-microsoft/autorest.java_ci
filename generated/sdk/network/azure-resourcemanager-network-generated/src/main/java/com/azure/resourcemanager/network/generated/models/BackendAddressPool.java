// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import java.util.List;

/**
 * An immutable client-side representation of BackendAddressPool.
 */
public interface BackendAddressPool {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within the set of backend address pools used by
     * the load balancer. This name can be used to access the resource.
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
     * Gets the type property: Type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The location of the backend address pool.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces.
     * 
     * @return the tunnelInterfaces value.
     */
    List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces();

    /**
     * Gets the loadBalancerBackendAddresses property: An array of backend addresses.
     * 
     * @return the loadBalancerBackendAddresses value.
     */
    List<LoadBalancerBackendAddress> loadBalancerBackendAddresses();

    /**
     * Gets the backendIpConfigurations property: An array of references to IP addresses defined in network interfaces.
     * 
     * @return the backendIpConfigurations value.
     */
    List<NetworkInterfaceIpConfiguration> backendIpConfigurations();

    /**
     * Gets the loadBalancingRules property: An array of references to load balancing rules that use this backend
     * address pool.
     * 
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the outboundRule property: A reference to an outbound rule that uses this backend address pool.
     * 
     * @return the outboundRule value.
     */
    SubResource outboundRule();

    /**
     * Gets the outboundRules property: An array of references to outbound rules that use this backend address pool.
     * 
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * Gets the inboundNatRules property: An array of references to inbound NAT rules that use this backend address
     * pool.
     * 
     * @return the inboundNatRules value.
     */
    List<SubResource> inboundNatRules();

    /**
     * Gets the provisioningState property: The provisioning state of the backend address pool resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the drainPeriodInSeconds property: Amount of seconds Load Balancer waits for before sending RESET to client
     * and backend address.
     * 
     * @return the drainPeriodInSeconds value.
     */
    Integer drainPeriodInSeconds();

    /**
     * Gets the virtualNetwork property: A reference to a virtual network.
     * 
     * @return the virtualNetwork value.
     */
    SubResource virtualNetwork();

    /**
     * Gets the syncMode property: Backend address synchronous mode for the backend pool.
     * 
     * @return the syncMode value.
     */
    SyncMode syncMode();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner object.
     * 
     * @return the inner object.
     */
    BackendAddressPoolInner innerModel();

    /**
     * The entirety of the BackendAddressPool definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The BackendAddressPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the BackendAddressPool definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, loadBalancerName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param loadBalancerName The name of the load balancer.
             * @return the next definition stage.
             */
            WithCreate withExistingLoadBalancer(String resourceGroupName, String loadBalancerName);
        }

        /**
         * The stage of the BackendAddressPool definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation, DefinitionStages.WithName, DefinitionStages.WithTunnelInterfaces,
            DefinitionStages.WithLoadBalancerBackendAddresses, DefinitionStages.WithDrainPeriodInSeconds,
            DefinitionStages.WithVirtualNetwork, DefinitionStages.WithSyncMode {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            BackendAddressPool create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BackendAddressPool create(Context context);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The location of the backend address pool.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The location of the backend address pool.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within the set of backend address
             * pools used by the load balancer. This name can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within the set of backend address pools used by the
             * load balancer. This name can be used to access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify tunnelInterfaces.
         */
        interface WithTunnelInterfaces {
            /**
             * Specifies the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces..
             * 
             * @param tunnelInterfaces An array of gateway load balancer tunnel interfaces.
             * @return the next definition stage.
             */
            WithCreate withTunnelInterfaces(List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify loadBalancerBackendAddresses.
         */
        interface WithLoadBalancerBackendAddresses {
            /**
             * Specifies the loadBalancerBackendAddresses property: An array of backend addresses..
             * 
             * @param loadBalancerBackendAddresses An array of backend addresses.
             * @return the next definition stage.
             */
            WithCreate withLoadBalancerBackendAddresses(List<LoadBalancerBackendAddress> loadBalancerBackendAddresses);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify drainPeriodInSeconds.
         */
        interface WithDrainPeriodInSeconds {
            /**
             * Specifies the drainPeriodInSeconds property: Amount of seconds Load Balancer waits for before sending
             * RESET to client and backend address..
             * 
             * @param drainPeriodInSeconds Amount of seconds Load Balancer waits for before sending RESET to client and
             * backend address.
             * @return the next definition stage.
             */
            WithCreate withDrainPeriodInSeconds(Integer drainPeriodInSeconds);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify virtualNetwork.
         */
        interface WithVirtualNetwork {
            /**
             * Specifies the virtualNetwork property: A reference to a virtual network..
             * 
             * @param virtualNetwork A reference to a virtual network.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetwork(SubResource virtualNetwork);
        }

        /**
         * The stage of the BackendAddressPool definition allowing to specify syncMode.
         */
        interface WithSyncMode {
            /**
             * Specifies the syncMode property: Backend address synchronous mode for the backend pool.
             * 
             * @param syncMode Backend address synchronous mode for the backend pool.
             * @return the next definition stage.
             */
            WithCreate withSyncMode(SyncMode syncMode);
        }
    }

    /**
     * Begins update for the BackendAddressPool resource.
     * 
     * @return the stage of resource update.
     */
    BackendAddressPool.Update update();

    /**
     * The template for BackendAddressPool update.
     */
    interface Update
        extends UpdateStages.WithName, UpdateStages.WithTunnelInterfaces, UpdateStages.WithLoadBalancerBackendAddresses,
        UpdateStages.WithDrainPeriodInSeconds, UpdateStages.WithVirtualNetwork, UpdateStages.WithSyncMode {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        BackendAddressPool apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BackendAddressPool apply(Context context);
    }

    /**
     * The BackendAddressPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the BackendAddressPool update allowing to specify name.
         */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within the set of backend address
             * pools used by the load balancer. This name can be used to access the resource..
             * 
             * @param name The name of the resource that is unique within the set of backend address pools used by the
             * load balancer. This name can be used to access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }

        /**
         * The stage of the BackendAddressPool update allowing to specify tunnelInterfaces.
         */
        interface WithTunnelInterfaces {
            /**
             * Specifies the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces..
             * 
             * @param tunnelInterfaces An array of gateway load balancer tunnel interfaces.
             * @return the next definition stage.
             */
            Update withTunnelInterfaces(List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces);
        }

        /**
         * The stage of the BackendAddressPool update allowing to specify loadBalancerBackendAddresses.
         */
        interface WithLoadBalancerBackendAddresses {
            /**
             * Specifies the loadBalancerBackendAddresses property: An array of backend addresses..
             * 
             * @param loadBalancerBackendAddresses An array of backend addresses.
             * @return the next definition stage.
             */
            Update withLoadBalancerBackendAddresses(List<LoadBalancerBackendAddress> loadBalancerBackendAddresses);
        }

        /**
         * The stage of the BackendAddressPool update allowing to specify drainPeriodInSeconds.
         */
        interface WithDrainPeriodInSeconds {
            /**
             * Specifies the drainPeriodInSeconds property: Amount of seconds Load Balancer waits for before sending
             * RESET to client and backend address..
             * 
             * @param drainPeriodInSeconds Amount of seconds Load Balancer waits for before sending RESET to client and
             * backend address.
             * @return the next definition stage.
             */
            Update withDrainPeriodInSeconds(Integer drainPeriodInSeconds);
        }

        /**
         * The stage of the BackendAddressPool update allowing to specify virtualNetwork.
         */
        interface WithVirtualNetwork {
            /**
             * Specifies the virtualNetwork property: A reference to a virtual network..
             * 
             * @param virtualNetwork A reference to a virtual network.
             * @return the next definition stage.
             */
            Update withVirtualNetwork(SubResource virtualNetwork);
        }

        /**
         * The stage of the BackendAddressPool update allowing to specify syncMode.
         */
        interface WithSyncMode {
            /**
             * Specifies the syncMode property: Backend address synchronous mode for the backend pool.
             * 
             * @param syncMode Backend address synchronous mode for the backend pool.
             * @return the next definition stage.
             */
            Update withSyncMode(SyncMode syncMode);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    BackendAddressPool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BackendAddressPool refresh(Context context);
}
