// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteLinkInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ExpressRoutePort.
 */
public interface ExpressRoutePort {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: The identity of ExpressRoutePort, if configured.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     * @return the peeringLocation value.
     */
    String peeringLocation();

    /**
     * Gets the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     * 
     * @return the bandwidthInGbps value.
     */
    Integer bandwidthInGbps();

    /**
     * Gets the provisionedBandwidthInGbps property: Aggregate Gbps of associated circuit bandwidths.
     * 
     * @return the provisionedBandwidthInGbps value.
     */
    Float provisionedBandwidthInGbps();

    /**
     * Gets the mtu property: Maximum transmission unit of the physical port pair(s).
     * 
     * @return the mtu value.
     */
    String mtu();

    /**
     * Gets the encapsulation property: Encapsulation method on physical ports.
     * 
     * @return the encapsulation value.
     */
    ExpressRoutePortsEncapsulation encapsulation();

    /**
     * Gets the etherType property: Ether type of the physical port.
     * 
     * @return the etherType value.
     */
    String etherType();

    /**
     * Gets the allocationDate property: Date of the physical port allocation to be used in Letter of Authorization.
     * 
     * @return the allocationDate value.
     */
    String allocationDate();

    /**
     * Gets the links property: ExpressRouteLink Sub-Resources
     * 
     * The set of physical links of the ExpressRoutePort resource.
     * 
     * @return the links value.
     */
    List<ExpressRouteLink> links();

    /**
     * Gets the circuits property: Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     * 
     * @return the circuits value.
     */
    List<SubResource> circuits();

    /**
     * Gets the provisioningState property: The provisioning state of the express route port resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceGuid property: The resource GUID property of the express route port resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the billingType property: The billing type of the ExpressRoutePort resource.
     * 
     * @return the billingType value.
     */
    ExpressRoutePortsBillingType billingType();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortInner object.
     * 
     * @return the inner object.
     */
    ExpressRoutePortInner innerModel();

    /**
     * The entirety of the ExpressRoutePort definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The ExpressRoutePort definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ExpressRoutePort definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify location.
         */
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

        /**
         * The stage of the ExpressRoutePort definition allowing to specify parent resource.
         */
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
         * The stage of the ExpressRoutePort definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithPeeringLocation, DefinitionStages.WithBandwidthInGbps,
            DefinitionStages.WithEncapsulation, DefinitionStages.WithLinks, DefinitionStages.WithBillingType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ExpressRoutePort create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRoutePort create(Context context);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of ExpressRoutePort, if configured..
             * 
             * @param identity The identity of ExpressRoutePort, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify peeringLocation.
         */
        interface WithPeeringLocation {
            /**
             * Specifies the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to physically..
             * 
             * @param peeringLocation The name of the peering location that the ExpressRoutePort is mapped to physically.
             * @return the next definition stage.
             */
            WithCreate withPeeringLocation(String peeringLocation);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify bandwidthInGbps.
         */
        interface WithBandwidthInGbps {
            /**
             * Specifies the bandwidthInGbps property: Bandwidth of procured ports in Gbps..
             * 
             * @param bandwidthInGbps Bandwidth of procured ports in Gbps.
             * @return the next definition stage.
             */
            WithCreate withBandwidthInGbps(Integer bandwidthInGbps);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify encapsulation.
         */
        interface WithEncapsulation {
            /**
             * Specifies the encapsulation property: Encapsulation method on physical ports..
             * 
             * @param encapsulation Encapsulation method on physical ports.
             * @return the next definition stage.
             */
            WithCreate withEncapsulation(ExpressRoutePortsEncapsulation encapsulation);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify links.
         */
        interface WithLinks {
            /**
             * Specifies the links property: ExpressRouteLink Sub-Resources
             * 
             * The set of physical links of the ExpressRoutePort resource..
             * 
             * @param links ExpressRouteLink Sub-Resources
             * 
             * The set of physical links of the ExpressRoutePort resource.
             * @return the next definition stage.
             */
            WithCreate withLinks(List<ExpressRouteLinkInner> links);
        }

        /**
         * The stage of the ExpressRoutePort definition allowing to specify billingType.
         */
        interface WithBillingType {
            /**
             * Specifies the billingType property: The billing type of the ExpressRoutePort resource..
             * 
             * @param billingType The billing type of the ExpressRoutePort resource.
             * @return the next definition stage.
             */
            WithCreate withBillingType(ExpressRoutePortsBillingType billingType);
        }
    }

    /**
     * Begins update for the ExpressRoutePort resource.
     * 
     * @return the stage of resource update.
     */
    ExpressRoutePort.Update update();

    /**
     * The template for ExpressRoutePort update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ExpressRoutePort apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRoutePort apply(Context context);
    }

    /**
     * The ExpressRoutePort update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ExpressRoutePort update allowing to specify tags.
         */
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
    ExpressRoutePort refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExpressRoutePort refresh(Context context);
}
