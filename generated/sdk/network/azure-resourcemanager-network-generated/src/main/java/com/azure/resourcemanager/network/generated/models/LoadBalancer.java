// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancerInner;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.OutboundRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.ProbeInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of LoadBalancer. */
public interface LoadBalancer {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: The extended location of the load balancer.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the sku property: The load balancer SKU.
     *
     * @return the sku value.
     */
    LoadBalancerSku sku();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load
     * balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    List<FrontendIpConfiguration> frontendIpConfigurations();

    /**
     * Gets the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @return the backendAddressPools value.
     */
    List<BackendAddressPool> backendAddressPools();

    /**
     * Gets the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @return the loadBalancingRules value.
     */
    List<LoadBalancingRule> loadBalancingRules();

    /**
     * Gets the probes property: Collection of probe objects used in the load balancer.
     *
     * @return the probes value.
     */
    List<Probe> probes();

    /**
     * Gets the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatRules value.
     */
    List<InboundNatRule> inboundNatRules();

    /**
     * Gets the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on
     * NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with
     * the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @return the inboundNatPools value.
     */
    List<InboundNatPool> inboundNatPools();

    /**
     * Gets the outboundRules property: The outbound rules.
     *
     * @return the outboundRules value.
     */
    List<OutboundRule> outboundRules();

    /**
     * Gets the resourceGuid property: The resource GUID property of the load balancer resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the load balancer resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.LoadBalancerInner object.
     *
     * @return the inner object.
     */
    LoadBalancerInner innerModel();

    /** The entirety of the LoadBalancer definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The LoadBalancer definition stages. */
    interface DefinitionStages {
        /** The first stage of the LoadBalancer definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the LoadBalancer definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the LoadBalancer definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the LoadBalancer definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithSku,
                DefinitionStages.WithFrontendIpConfigurations,
                DefinitionStages.WithBackendAddressPools,
                DefinitionStages.WithLoadBalancingRules,
                DefinitionStages.WithProbes,
                DefinitionStages.WithInboundNatRules,
                DefinitionStages.WithInboundNatPools,
                DefinitionStages.WithOutboundRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LoadBalancer create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LoadBalancer create(Context context);
        }

        /** The stage of the LoadBalancer definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the LoadBalancer definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location of the load balancer..
             *
             * @param extendedLocation The extended location of the load balancer.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the LoadBalancer definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The load balancer SKU..
             *
             * @param sku The load balancer SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(LoadBalancerSku sku);
        }

        /** The stage of the LoadBalancer definition allowing to specify frontendIpConfigurations. */
        interface WithFrontendIpConfigurations {
            /**
             * Specifies the frontendIpConfigurations property: Object representing the frontend IPs to be used for the
             * load balancer..
             *
             * @param frontendIpConfigurations Object representing the frontend IPs to be used for the load balancer.
             * @return the next definition stage.
             */
            WithCreate withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations);
        }

        /** The stage of the LoadBalancer definition allowing to specify backendAddressPools. */
        interface WithBackendAddressPools {
            /**
             * Specifies the backendAddressPools property: Collection of backend address pools used by a load balancer..
             *
             * @param backendAddressPools Collection of backend address pools used by a load balancer.
             * @return the next definition stage.
             */
            WithCreate withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools);
        }

        /** The stage of the LoadBalancer definition allowing to specify loadBalancingRules. */
        interface WithLoadBalancingRules {
            /**
             * Specifies the loadBalancingRules property: Object collection representing the load balancing rules Gets
             * the provisioning..
             *
             * @param loadBalancingRules Object collection representing the load balancing rules Gets the provisioning.
             * @return the next definition stage.
             */
            WithCreate withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules);
        }

        /** The stage of the LoadBalancer definition allowing to specify probes. */
        interface WithProbes {
            /**
             * Specifies the probes property: Collection of probe objects used in the load balancer..
             *
             * @param probes Collection of probe objects used in the load balancer.
             * @return the next definition stage.
             */
            WithCreate withProbes(List<ProbeInner> probes);
        }

        /** The stage of the LoadBalancer definition allowing to specify inboundNatRules. */
        interface WithInboundNatRules {
            /**
             * Specifies the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining
             * inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound
             * NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual
             * virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT
             * rules..
             *
             * @param inboundNatRules Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
             *     rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT
             *     pools are referenced from virtual machine scale sets. NICs that are associated with individual
             *     virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT
             *     rules.
             * @return the next definition stage.
             */
            WithCreate withInboundNatRules(List<InboundNatRuleInner> inboundNatRules);
        }

        /** The stage of the LoadBalancer definition allowing to specify inboundNatPools. */
        interface WithInboundNatPools {
            /**
             * Specifies the inboundNatPools property: Defines an external port range for inbound NAT to a single
             * backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for
             * each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound
             * NAT pool on your Load Balancer is mutually exclusive with defining inbound NAT rules. Inbound NAT pools
             * are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines
             * cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules..
             *
             * @param inboundNatPools Defines an external port range for inbound NAT to a single backend port on NICs
             *     associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated
             *     with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your
             *     Load Balancer is mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced
             *     from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
             *     reference an inbound NAT pool. They have to reference individual inbound NAT rules.
             * @return the next definition stage.
             */
            WithCreate withInboundNatPools(List<InboundNatPool> inboundNatPools);
        }

        /** The stage of the LoadBalancer definition allowing to specify outboundRules. */
        interface WithOutboundRules {
            /**
             * Specifies the outboundRules property: The outbound rules..
             *
             * @param outboundRules The outbound rules.
             * @return the next definition stage.
             */
            WithCreate withOutboundRules(List<OutboundRuleInner> outboundRules);
        }
    }

    /**
     * Begins update for the LoadBalancer resource.
     *
     * @return the stage of resource update.
     */
    LoadBalancer.Update update();

    /** The template for LoadBalancer update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LoadBalancer apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LoadBalancer apply(Context context);
    }

    /** The LoadBalancer update stages. */
    interface UpdateStages {
        /** The stage of the LoadBalancer update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LoadBalancer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LoadBalancer refresh(Context context);
}
